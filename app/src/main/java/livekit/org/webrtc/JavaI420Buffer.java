package livekit.org.webrtc;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.nio.ByteBuffer;
import livekit.org.webrtc.VideoFrame;

/* loaded from: classes2.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, Runnable runnable) {
        this.width = i10;
        this.height = i11;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i12;
        this.strideU = i13;
        this.strideV = i14;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i10, int i11) {
        int i12 = (i11 + 1) / 2;
        int i13 = (i10 + 1) / 2;
        int i14 = i10 * i11;
        int i15 = i13 * i12;
        int i16 = i14 + i15;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i13 * 2 * i12) + i14);
        ByteBuffer byteBuffer = (ByteBuffer) nativeAllocateByteBuffer.position(0);
        ByteBuffer byteBuffer2 = (ByteBuffer) nativeAllocateByteBuffer.limit(i14);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        ByteBuffer byteBuffer3 = (ByteBuffer) nativeAllocateByteBuffer.position(i14);
        ByteBuffer byteBuffer4 = (ByteBuffer) nativeAllocateByteBuffer.limit(i16);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        ByteBuffer byteBuffer5 = (ByteBuffer) nativeAllocateByteBuffer.position(i16);
        ByteBuffer byteBuffer6 = (ByteBuffer) nativeAllocateByteBuffer.limit(i16 + i15);
        return new JavaI420Buffer(i10, i11, slice, i10, slice2, i13, nativeAllocateByteBuffer.slice(), i13, new k(0, nativeAllocateByteBuffer));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        int i13 = ((i11 - 1) * i12) + i10;
        if (byteBuffer.capacity() >= i13) {
            return;
        }
        throw new IllegalArgumentException(AbstractC2469q0.i("Buffer must be at least ", i13, " bytes, but was ", byteBuffer.capacity()));
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == i14 && i13 == i15) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            ByteBuffer byteBuffer = (ByteBuffer) dataY.position((i420Buffer.getStrideY() * i11) + i10);
            int i16 = i10 / 2;
            int i17 = i11 / 2;
            ByteBuffer byteBuffer2 = (ByteBuffer) dataU.position((i420Buffer.getStrideU() * i17) + i16);
            ByteBuffer byteBuffer3 = (ByteBuffer) dataV.position((i420Buffer.getStrideV() * i17) + i16);
            i420Buffer.retain();
            return wrap(i14, i15, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new h(1, i420Buffer));
        }
        JavaI420Buffer allocate = allocate(i14, i15);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i10, i11, i12, i13, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i14, i15);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, ByteBuffer byteBuffer4, int i17, ByteBuffer byteBuffer5, int i18, ByteBuffer byteBuffer6, int i19, int i20, int i21);

    public static JavaI420Buffer wrap(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, Runnable runnable) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer slice = byteBuffer.slice();
                ByteBuffer slice2 = byteBuffer2.slice();
                ByteBuffer slice3 = byteBuffer3.slice();
                int i15 = (i10 + 1) / 2;
                int i16 = (i11 + 1) / 2;
                checkCapacity(slice, i10, i11, i12);
                checkCapacity(slice2, i15, i16, i13);
                checkCapacity(slice3, i15, i16, i14);
                return new JavaI420Buffer(i10, i11, slice, i12, slice2, i13, slice3, i14, runnable);
            }
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        throw new IllegalArgumentException("Data buffers cannot be null.");
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return cropAndScaleI420(this, i10, i11, i12, i13, i14, i15);
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer, livekit.org.webrtc.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return A.a(this);
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer, livekit.org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer, livekit.org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
