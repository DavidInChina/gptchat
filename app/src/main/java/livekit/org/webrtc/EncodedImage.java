package livekit.org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    /* loaded from: classes.dex */
    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;
        private Integer qp;
        private Runnable releaseCallback;
        private int rotation;

        private Builder() {
        }

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.qp, 0);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j6) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j6);
            return this;
        }

        public Builder setCaptureTimeNs(long j6) {
            this.captureTimeNs = j6;
            return this;
        }

        public Builder setEncodedHeight(int i10) {
            this.encodedHeight = i10;
            return this;
        }

        public Builder setEncodedWidth(int i10) {
            this.encodedWidth = i10;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i10) {
            this.rotation = i10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        private final int nativeIndex;

        FrameType(int i10) {
            this.nativeIndex = i10;
        }

        @CalledByNative("FrameType")
        public static FrameType fromNativeIndex(int i10) {
            FrameType[] values;
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i10) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown native frame type: ", i10));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public /* synthetic */ EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i10, int i11, long j6, FrameType frameType, int i12, Integer num, int i13) {
        this(byteBuffer, runnable, i10, i11, j6, frameType, i12, num);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @CalledByNative
    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    @CalledByNative
    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    @CalledByNative
    private int getFrameType() {
        return this.frameType.getNative();
    }

    @CalledByNative
    private Integer getQp() {
        return this.qp;
    }

    @CalledByNative
    private int getRotation() {
        return this.rotation;
    }

    @Override // livekit.org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // livekit.org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i10, int i11, long j6, FrameType frameType, int i12, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i10;
        this.encodedHeight = i11;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j6);
        this.captureTimeNs = j6;
        this.frameType = frameType;
        this.rotation = i12;
        this.qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
