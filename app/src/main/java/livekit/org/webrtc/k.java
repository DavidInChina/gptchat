package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38567Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f38568Z;

    public /* synthetic */ k(int i10, ByteBuffer byteBuffer) {
        this.f38567Y = i10;
        this.f38568Z = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38567Y;
        ByteBuffer byteBuffer = this.f38568Z;
        switch (i10) {
            case 0:
                JavaI420Buffer.a(byteBuffer);
                return;
            default:
                YuvConverter.a(byteBuffer);
                return;
        }
    }
}
