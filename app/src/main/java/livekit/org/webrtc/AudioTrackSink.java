package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface AudioTrackSink {
    @CalledByNative
    void onData(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j6);
}
