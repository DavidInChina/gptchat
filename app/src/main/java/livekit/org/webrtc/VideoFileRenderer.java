package livekit.org.webrtc;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.VideoFrame;

/* loaded from: classes2.dex */
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    public VideoFileRenderer(String str, int i10, int i11, final EglBase.Context context) {
        if (i10 % 2 != 1 && i11 % 2 != 1) {
            this.outputFileName = str;
            this.outputFileWidth = i10;
            this.outputFileHeight = i11;
            int i12 = ((i10 * i11) * 3) / 2;
            this.outputFrameSize = i12;
            this.outputFrameBuffer = ByteBuffer.allocateDirect(i12);
            io.sentry.instrumentation.file.e r10 = r.f.r(new FileOutputStream(str), str);
            this.videoOutFile = r10;
            r10.write(AbstractC0044t0.y("YUV4MPEG2 C420 W", i10, " H", i11, " Ip F30:1 A1:1\n").getBytes(Charset.forName("US-ASCII")));
            HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
            this.renderThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.renderThreadHandler = handler;
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
            this.fileThread = handlerThread2;
            handlerThread2.start();
            this.fileThreadHandler = new Handler(handlerThread2.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: livekit.org.webrtc.VideoFileRenderer.1
                {
                    VideoFileRenderer.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VideoFileRenderer.this.eglBase = e.d(context, EglBase.CONFIG_PIXEL_BUFFER);
                    VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                    VideoFileRenderer.this.eglBase.makeCurrent();
                    VideoFileRenderer.this.yuvConverter = new YuvConverter();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Does not support uneven width or height");
    }

    public /* synthetic */ void lambda$release$2(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$3() {
        try {
            this.videoOutFile.close();
            String str = this.outputFileName;
            int i10 = this.frameCount;
            int i11 = this.outputFileWidth;
            int i12 = this.outputFileHeight;
            Logging.d(TAG, "Video written to disk as " + str + ". The number of frames is " + i10 + " and the dimensions of the frames are " + i11 + "x" + i12 + Separators.DOT);
            this.fileThread.quit();
        } catch (IOException e10) {
            throw new RuntimeException("Error closing output file", e10);
        }
    }

    public /* synthetic */ void lambda$renderFrameOnRenderThread$1(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e10) {
            throw new RuntimeException("Error writing video to disk", e10);
        }
    }

    /* renamed from: renderFrameOnRenderThread */
    public void lambda$onFrame$0(VideoFrame videoFrame) {
        int i10;
        int i11;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (videoFrame.getRotation() % 180 == 0) {
            i10 = this.outputFileWidth;
        } else {
            i10 = this.outputFileHeight;
        }
        int i12 = i10;
        if (videoFrame.getRotation() % 180 == 0) {
            i11 = this.outputFileHeight;
        } else {
            i11 = this.outputFileWidth;
        }
        int i13 = i11;
        float width = buffer.getWidth() / buffer.getHeight();
        float f6 = i12 / i13;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f6 > width) {
            height = (int) ((width / f6) * height);
        } else {
            width2 = (int) ((f6 / width) * width2);
        }
        VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i12, i13);
        videoFrame.release();
        VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new Q1.n(this, i420, videoFrame, 20));
    }

    @Override // livekit.org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new s(this, 5, videoFrame));
    }

    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new s(this, 4, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new h(3, this));
        try {
            this.fileThread.join();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Logging.e(TAG, "Interrupted while waiting for the write to disk to complete.", e10);
        }
    }
}
