package Qg;

/* loaded from: classes2.dex */
public final class x0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14943a;

    @Override // Qg.w0
    public final AbstractC1206i a(D0 d02) {
        switch (this.f14943a) {
            case 0:
                return new C1209l(1, u0.f14928Y);
            default:
                return new C1209l(new z0(d02, null));
        }
    }

    public final String toString() {
        switch (this.f14943a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
