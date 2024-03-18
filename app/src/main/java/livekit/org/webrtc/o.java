package livekit.org.webrtc;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38571Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SurfaceTextureHelper f38572Z;

    public /* synthetic */ o(SurfaceTextureHelper surfaceTextureHelper, int i10) {
        this.f38571Y = i10;
        this.f38572Z = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38571Y;
        SurfaceTextureHelper surfaceTextureHelper = this.f38572Z;
        switch (i10) {
            case 0:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                return;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                return;
            case 2:
                surfaceTextureHelper.lambda$stopListening$1();
                return;
            default:
                surfaceTextureHelper.lambda$forceFrame$3();
                return;
        }
    }
}
