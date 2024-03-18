package livekit.org.webrtc;

import livekit.org.webrtc.Camera1Session;

/* renamed from: livekit.org.webrtc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4502b implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38549Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Camera1Session.AnonymousClass2 f38550Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ byte[] f38551h0;

    public /* synthetic */ RunnableC4502b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f38549Y = i10;
        this.f38550Z = anonymousClass2;
        this.f38551h0 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38549Y;
        byte[] bArr = this.f38551h0;
        Camera1Session.AnonymousClass2 anonymousClass2 = this.f38550Z;
        switch (i10) {
            case 0:
                Camera1Session.AnonymousClass2.a(anonymousClass2, bArr);
                return;
            default:
                Camera1Session.AnonymousClass2.b(anonymousClass2, bArr);
                return;
        }
    }
}
