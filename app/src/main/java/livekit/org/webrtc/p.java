package livekit.org.webrtc;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38573Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f38574Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f38575h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f38576i0;

    public /* synthetic */ p(Object obj, int i10, int i11, int i12) {
        this.f38573Y = i12;
        this.f38576i0 = obj;
        this.f38574Z = i10;
        this.f38575h0 = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38573Y;
        int i11 = this.f38575h0;
        int i12 = this.f38574Z;
        Object obj = this.f38576i0;
        switch (i10) {
            case 0:
                ((SurfaceTextureHelper) obj).lambda$setTextureSize$2(i12, i11);
                return;
            default:
                SurfaceViewRenderer.a((SurfaceViewRenderer) obj, i12, i11);
                return;
        }
    }
}
