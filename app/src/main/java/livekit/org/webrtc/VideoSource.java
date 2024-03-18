package livekit.org.webrtc;

import livekit.org.webrtc.VideoProcessor;

/* loaded from: classes2.dex */
public class VideoSource extends MediaSource {
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock = new Object();
    private final CapturerObserver capturerObserver = new CapturerObserver() { // from class: livekit.org.webrtc.VideoSource.1
        {
            VideoSource.this = this;
        }

        @Override // livekit.org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z10) {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(z10);
            synchronized (VideoSource.this.videoProcessorLock) {
                try {
                    VideoSource.this.isCapturerRunning = z10;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStarted(z10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // livekit.org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
            synchronized (VideoSource.this.videoProcessorLock) {
                try {
                    VideoSource.this.isCapturerRunning = false;
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onCapturerStopped();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // livekit.org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            VideoProcessor.FrameAdaptationParameters adaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
            synchronized (VideoSource.this.videoProcessorLock) {
                try {
                    if (VideoSource.this.videoProcessor != null) {
                        VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, adaptFrame);
                        return;
                    }
                    VideoFrame b10 = C.b(videoFrame, adaptFrame);
                    if (b10 != null) {
                        VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(b10);
                        b10.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    /* loaded from: classes.dex */
    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }
    }

    public VideoSource(long j6) {
        super(j6);
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j6);
    }

    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    public /* synthetic */ void lambda$setVideoProcessor$1(VideoFrame videoFrame) {
        runWithReference(new s(this, 6, videoFrame));
    }

    public void adaptOutputFormat(int i10, int i11, int i12) {
        int max = Math.max(i10, i11);
        int min = Math.min(i10, i11);
        adaptOutputFormat(max, min, min, max, i12);
    }

    @Override // livekit.org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z10) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z10);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            try {
                VideoProcessor videoProcessor2 = this.videoProcessor;
                if (videoProcessor2 != null) {
                    videoProcessor2.setSink(null);
                    if (this.isCapturerRunning) {
                        this.videoProcessor.onCapturerStopped();
                    }
                }
                this.videoProcessor = videoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.setSink(new C4501a(2, this));
                    if (this.isCapturerRunning) {
                        videoProcessor.onCapturerStarted(true);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void adaptOutputFormat(int i10, int i11, int i12, int i13, int i14) {
        adaptOutputFormat(new AspectRatio(i10, i11), Integer.valueOf(i10 * i11), new AspectRatio(i12, i13), Integer.valueOf(i12 * i13), Integer.valueOf(i14));
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
