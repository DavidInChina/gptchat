package livekit.org.webrtc;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38564Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f38565Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f38566h0;

    public /* synthetic */ i(Object obj, int i10, int i11) {
        this.f38564Y = i11;
        this.f38566h0 = obj;
        this.f38565Z = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38564Y;
        int i11 = this.f38565Z;
        Object obj = this.f38566h0;
        switch (i10) {
            case 0:
                HardwareVideoEncoder.a((HardwareVideoEncoder) obj, i11);
                return;
            default:
                SurfaceTextureHelper.c((SurfaceTextureHelper) obj, i11);
                return;
        }
    }
}
