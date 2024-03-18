package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class JniCommon {
    public static native void nativeAddRef(long j6);

    public static native ByteBuffer nativeAllocateByteBuffer(int i10);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j6);
}
