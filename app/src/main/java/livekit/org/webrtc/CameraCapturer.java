package livekit.org.webrtc;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import livekit.org.webrtc.CameraSession;
import livekit.org.webrtc.CameraVideoCapturer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private Context applicationContext;
    private final CameraEnumerator cameraEnumerator;
    private String cameraName;
    private CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    private CapturerObserver capturerObserver;
    private CameraSession currentSession;
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private int openAttemptsRemaining;
    private String pendingCameraName;
    private boolean sessionOpening;
    private SurfaceTextureHelper surfaceHelper;
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private final Handler uiThreadHandler;
    private int width;
    private final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: livekit.org.webrtc.CameraCapturer.1
        @Override // livekit.org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            SwitchState switchState = CameraCapturer.this.switchState;
            Logging.d(CameraCapturer.TAG, "Create session done. Switch state: " + switchState);
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.currentSession = cameraSession;
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                    CameraCapturer.this.firstFrameObserved = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                    } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                        String str = CameraCapturer.this.pendingCameraName;
                        CameraCapturer.this.pendingCameraName = null;
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        CameraCapturer cameraCapturer2 = CameraCapturer.this;
                        cameraCapturer2.switchCameraInternal(cameraCapturer2.switchEventsHandler, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // livekit.org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.openAttemptsRemaining--;
                    if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                        Logging.w(CameraCapturer.TAG, "Opening camera failed, passing: " + str);
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.stateLock.notifyAll();
                        SwitchState switchState = CameraCapturer.this.switchState;
                        SwitchState switchState2 = SwitchState.IDLE;
                        if (switchState != switchState2) {
                            if (CameraCapturer.this.switchEventsHandler != null) {
                                CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                                CameraCapturer.this.switchEventsHandler = null;
                            }
                            CameraCapturer.this.switchState = switchState2;
                        }
                        if (failureType == CameraSession.FailureType.DISCONNECTED) {
                            CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        } else {
                            CameraCapturer.this.eventsHandler.onCameraError(str);
                        }
                    } else {
                        Logging.w(CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                        CameraCapturer.this.createSessionInternal(500);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: livekit.org.webrtc.CameraCapturer.2
        @Override // livekit.org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession && CameraCapturer.this.currentSession != null) {
                        Logging.d(CameraCapturer.TAG, "onCameraClosed from another session.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraClosed();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // livekit.org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // livekit.org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w(CameraCapturer.TAG, "onCameraError from another session: " + str);
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraError(str);
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // livekit.org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.currentSession != null) {
                        Logging.w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // livekit.org.webrtc.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w(CameraCapturer.TAG, "onFrameCaptured from another session.");
                        return;
                    }
                    if (!CameraCapturer.this.firstFrameObserved) {
                        CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    private final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: livekit.org.webrtc.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    private final Object stateLock = new Object();
    private SwitchState switchState = SwitchState.IDLE;

    /* loaded from: classes2.dex */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: livekit.org.webrtc.CameraCapturer.4
            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
            }

            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
            }

            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
            }

            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
            }

            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        List asList = Arrays.asList(cameraEnumerator.getDeviceNames());
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        if (!asList.isEmpty()) {
            if (asList.contains(this.cameraName)) {
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.A("Camera name ", this.cameraName, " does not match any known camera device."));
        }
        throw new RuntimeException("No cameras attached.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        Logging.e(TAG, "Check is on camera thread failed.");
        throw new RuntimeException("Not on camera thread.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionInternal(int i10) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i10 + 10000);
        this.cameraThreadHandler.postDelayed(new Runnable() { // from class: livekit.org.webrtc.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
            }
        }, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        Logging.d(TAG, "switchCamera internal");
        if (!Arrays.asList(this.cameraEnumerator.getDeviceNames()).contains(str)) {
            reportCameraSwitchError(R.a.r("Attempted to switch to unknown camera device ", str), cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z10 = this.sessionOpening;
                if (!z10 && this.currentSession == null) {
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                    return;
                }
                this.switchEventsHandler = cameraSwitchHandler;
                if (z10) {
                    this.switchState = SwitchState.PENDING;
                    this.pendingCameraName = str;
                    return;
                }
                this.switchState = SwitchState.IN_PROGRESS;
                Logging.d(TAG, "switchCamera: Stopping session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: livekit.org.webrtc.CameraCapturer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.cameraName = str;
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0);
                Logging.d(TAG, "switchCamera done");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        d.a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i10, int i11, int i12) {
        StringBuilder A10 = E9.f.A("changeCaptureFormat: ", i10, "x", i11, Separators.AT);
        A10.append(i12);
        Logging.d(TAG, A10.toString());
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i10, i11, i12);
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12);

    @Override // livekit.org.webrtc.VideoCapturer
    public void dispose() {
        Logging.d(TAG, "dispose");
        stopCapture();
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper.getHandler();
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        Thread thread;
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            thread = handler.getLooper().getThread();
        } else {
            thread = null;
        }
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.d(TAG, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        d.b(this, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void startCapture(int i10, int i11, int i12) {
        StringBuilder A10 = E9.f.A("startCapture: ", i10, "x", i11, Separators.AT);
        A10.append(i12);
        Logging.d(TAG, A10.toString());
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                try {
                    if (!this.sessionOpening && this.currentSession == null) {
                        this.width = i10;
                        this.height = i11;
                        this.framerate = i12;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 3;
                        createSessionInternal(0);
                        return;
                    }
                    Logging.w(TAG, "Session already open");
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void stopCapture() {
        Logging.d(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                Logging.d(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.w(TAG, "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                Logging.d(TAG, "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: livekit.org.webrtc.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.d(TAG, "Stop capture: No session open");
            }
        }
        Logging.d(TAG, "Stop capture done");
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable() { // from class: livekit.org.webrtc.CameraCapturer.7
            @Override // java.lang.Runnable
            public void run() {
                List asList = Arrays.asList(CameraCapturer.this.cameraEnumerator.getDeviceNames());
                if (asList.size() < 2) {
                    CameraCapturer.this.reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
                    return;
                }
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, (String) asList.get((asList.indexOf(CameraCapturer.this.cameraName) + 1) % asList.size()));
            }
        });
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, final String str) {
        Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable() { // from class: livekit.org.webrtc.CameraCapturer.8
            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, str);
            }
        });
    }
}
