package livekit.org.webrtc;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.GlUtil;
import livekit.org.webrtc.RendererCommon;

/* loaded from: classes.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private final Object handlerLock;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private boolean usePresentationTimeStamp;

    /* loaded from: classes.dex */
    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        public /* synthetic */ EglSurfaceCreation(EglRenderer eglRenderer, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } else if (obj instanceof SurfaceTexture) {
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                    } else {
                        Object obj2 = this.surface;
                        throw new IllegalStateException("Invalid surface: " + obj2);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        private EglSurfaceCreation() {
            EglRenderer.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    /* loaded from: classes.dex */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    /* loaded from: classes2.dex */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f6, RendererCommon.GlDrawer glDrawer, boolean z10) {
            this.listener = frameListener;
            this.scale = f6;
            this.drawer = glDrawer;
            this.applyFpsReduction = z10;
        }
    }

    /* loaded from: classes.dex */
    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e10) {
                Logging.e(EglRenderer.TAG, "Exception on EglRenderer thread", e10);
                this.exceptionCallback.run();
                throw e10;
            }
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    private String averageTimeAsString(long j6, int i10) {
        if (i10 <= 0) {
            return "NA";
        }
        long micros = TimeUnit.NANOSECONDS.toMicros(j6 / i10);
        return micros + " us";
    }

    /* renamed from: clearSurfaceOnRenderThread */
    public void lambda$clearImage$6(float f6, float f10, float f11, float f12) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            GLES20.glClearColor(f6, f10, f11, f12);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers();
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public /* synthetic */ void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f6, boolean z10) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f6, glDrawer, z10));
    }

    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = e.g(iArr);
            return;
        }
        logD("EglBase.create shared context");
        this.eglBase = e.d(context, iArr);
    }

    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    public /* synthetic */ void lambda$releaseEglSurface$5(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    public /* synthetic */ void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void logD(String str) {
        String str2 = this.name;
        Logging.d(TAG, str2 + str);
    }

    private void logE(String str, Throwable th2) {
        String str2 = this.name;
        Logging.e(TAG, str2 + str, th2);
    }

    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            try {
                long j6 = nanoTime - this.statisticsStartTimeNs;
                if (j6 > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                    float nanos = ((float) (this.framesRendered * TimeUnit.SECONDS.toNanos(1L))) / ((float) j6);
                    long millis = TimeUnit.NANOSECONDS.toMillis(j6);
                    int i10 = this.framesReceived;
                    int i11 = this.framesDropped;
                    int i12 = this.framesRendered;
                    String format = decimalFormat.format(nanos);
                    String averageTimeAsString = averageTimeAsString(this.renderTimeNs, this.framesRendered);
                    String averageTimeAsString2 = averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered);
                    logD("Duration: " + millis + " ms. Frames received: " + i10 + ". Dropped: " + i11 + ". Rendered: " + i12 + ". Render fps: " + format + ". Average render time: " + averageTimeAsString + ". Average swapBuffer time: " + averageTimeAsString2 + Separators.DOT);
                    resetStatistics(nanoTime);
                }
            } finally {
            }
        }
    }

    private void logW(String str) {
        String str2 = this.name;
        Logging.w(TAG, str2 + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z10) {
        float f6;
        float f10;
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        Matrix matrix = this.drawMatrix;
        if (this.mirrorHorizontally) {
            f6 = -1.0f;
        } else {
            f6 = 1.0f;
        }
        if (this.mirrorVertically) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        matrix.preScale(f6, f10);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z10 || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth != 0 && rotatedHeight != 0) {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    next.listener.onFrame(createBitmap);
                } else {
                    next.listener.onFrame(null);
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void renderFrameOnRenderThread() {
        boolean z10;
        float f6;
        float f10;
        float f11;
        float f12;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase != null && eglBase.hasSurface()) {
                    synchronized (this.fpsReductionLock) {
                        try {
                            long j6 = this.minRenderPeriodNs;
                            if (j6 != Long.MAX_VALUE) {
                                if (j6 > 0) {
                                    long nanoTime = System.nanoTime();
                                    long j10 = this.nextFrameTimeNs;
                                    if (nanoTime < j10) {
                                        logD("Skipping frame rendering - fps reduction is active.");
                                    } else {
                                        long j11 = j10 + this.minRenderPeriodNs;
                                        this.nextFrameTimeNs = j11;
                                        this.nextFrameTimeNs = Math.max(j11, nanoTime);
                                    }
                                }
                                z10 = true;
                            }
                            z10 = false;
                        } finally {
                        }
                    }
                    long nanoTime2 = System.nanoTime();
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (this.layoutLock) {
                        f6 = this.layoutAspectRatio;
                        if (f6 == 0.0f) {
                            f6 = rotatedWidth;
                        }
                    }
                    float f13 = 1.0f;
                    if (rotatedWidth > f6) {
                        f10 = f6 / rotatedWidth;
                        f11 = 1.0f;
                    } else {
                        f11 = rotatedWidth / f6;
                        f10 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    Matrix matrix = this.drawMatrix;
                    if (this.mirrorHorizontally) {
                        f12 = -1.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    if (this.mirrorVertically) {
                        f13 = -1.0f;
                    }
                    matrix.preScale(f12, f13);
                    this.drawMatrix.preScale(f10, f11);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    try {
                        if (z10) {
                            try {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(16384);
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                                long nanoTime3 = System.nanoTime();
                                if (this.usePresentationTimeStamp) {
                                    this.eglBase.swapBuffers(videoFrame.getTimestampNs());
                                } else {
                                    this.eglBase.swapBuffers();
                                }
                                long nanoTime4 = System.nanoTime();
                                synchronized (this.statisticsLock) {
                                    this.framesRendered++;
                                    this.renderTimeNs = (nanoTime4 - nanoTime2) + this.renderTimeNs;
                                    this.renderSwapBufferTimeNs = (nanoTime4 - nanoTime3) + this.renderSwapBufferTimeNs;
                                }
                            } catch (GlUtil.GlOutOfMemoryException e10) {
                                logE("Error while drawing frame", e10);
                                ErrorCallback errorCallback = this.errorCallback;
                                if (errorCallback != null) {
                                    errorCallback.onGlOutOfMemory();
                                }
                                this.drawer.release();
                                this.frameDrawer.release();
                                this.bitmapTextureFramebuffer.release();
                            }
                        }
                        notifyCallbacks(videoFrame, z10);
                        videoFrame.release();
                        return;
                    } catch (Throwable th2) {
                        videoFrame.release();
                        throw th2;
                    }
                }
                logD("Dropping frame - No surface");
                videoFrame.release();
            } finally {
            }
        }
    }

    private void resetStatistics(long j6) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j6;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    public void addFrameListener(FrameListener frameListener, float f6) {
        addFrameListener(frameListener, f6, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z10) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Initializing EglRenderer");
                    this.drawer = glDrawer;
                    this.usePresentationTimeStamp = z10;
                    String str = this.name;
                    HandlerThread handlerThread = new HandlerThread(str + TAG);
                    handlerThread.start();
                    HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() { // from class: livekit.org.webrtc.EglRenderer.2
                        {
                            EglRenderer.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (EglRenderer.this.handlerLock) {
                                EglRenderer.this.renderThreadHandler = null;
                            }
                        }
                    });
                    this.renderThreadHandler = handlerWithExceptionCallback;
                    ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Q1.n(this, context, iArr, 18));
                    this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                    resetStatistics(System.nanoTime());
                    this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(LOG_INTERVAL_SEC));
                } else {
                    String str2 = this.name;
                    throw new IllegalStateException(str2 + "Already initialized");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // livekit.org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z10;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    VideoFrame videoFrame2 = this.pendingFrame;
                    if (videoFrame2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        videoFrame2.release();
                    }
                    this.pendingFrame = videoFrame;
                    videoFrame.retain();
                    this.renderThreadHandler.post(new h(0, this));
                }
                if (z10) {
                    synchronized (this.statisticsLock) {
                        this.framesDropped++;
                    }
                }
            } finally {
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    thread = null;
                } else {
                    thread = handler.getLooper().getThread();
                }
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void release() {
        logD("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logD("Already released");
                    return;
                }
                handler.removeCallbacks(this.logStatisticsRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new s(this, 1, countDownLatch));
                this.renderThreadHandler.post(new s(this, 2, this.renderThreadHandler.getLooper()));
                this.renderThreadHandler = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } finally {
                    }
                }
                logD("Releasing done.");
            } finally {
            }
        }
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.renderThreadHandler.postAtFrontOfQueue(new s(this, 3, runnable));
                    return;
                }
                runnable.run();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    return;
                }
                if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                    postToRenderThread(new Q1.n(this, countDownLatch, frameListener, 19));
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f6) {
        logD("setFpsReduction: " + f6);
        synchronized (this.fpsReductionLock) {
            try {
                long j6 = this.minRenderPeriodNs;
                if (f6 <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = ((float) TimeUnit.SECONDS.toNanos(1L)) / f6;
                }
                if (this.minRenderPeriodNs != j6) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setLayoutAspectRatio(float f6) {
        logD("setLayoutAspectRatio: " + f6);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f6;
        }
    }

    public void setMirror(boolean z10) {
        logD("setMirrorHorizontally: " + z10);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z10;
        }
    }

    public void setMirrorVertically(boolean z10) {
        logD("setMirrorVertically: " + z10);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z10;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.handlerLock = new Object();
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: livekit.org.webrtc.EglRenderer.1
            {
                EglRenderer.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.handlerLock) {
                    try {
                        if (EglRenderer.this.renderThreadHandler != null) {
                            EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                            EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(this, 0);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f6, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f6, glDrawer, false);
    }

    public void clearImage(final float f6, final float f10, final float f11, final float f12) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() { // from class: livekit.org.webrtc.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.lambda$clearImage$6(f6, f10, f11, f12);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(final FrameListener frameListener, final float f6, final RendererCommon.GlDrawer glDrawer, final boolean z10) {
        postToRenderThread(new Runnable() { // from class: livekit.org.webrtc.f
            @Override // java.lang.Runnable
            public final void run() {
                EglRenderer.this.lambda$addFrameListener$3(glDrawer, frameListener, f6, z10);
            }
        });
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
