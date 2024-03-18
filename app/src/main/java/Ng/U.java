package Ng;

import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class U extends AbstractC1081p0 {

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f12910j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f12911k0;

    public U(int i10, Object obj) {
        this.f12910j0 = i10;
        this.f12911k0 = obj;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12910j0) {
            case 0:
                p((Throwable) obj);
                return yVar;
            case 1:
                p((Throwable) obj);
                return yVar;
            case 2:
                p((Throwable) obj);
                return yVar;
            default:
                p((Throwable) obj);
                return yVar;
        }
    }

    @Override // Ng.AbstractC1081p0
    public final void p(Throwable th2) {
        int i10 = this.f12910j0;
        Object obj = this.f12911k0;
        switch (i10) {
            case 0:
                ((T) obj).dispose();
                return;
            case 1:
                ((wf.k) obj).invoke(th2);
                return;
            case 2:
                Object U10 = o().U();
                if (U10 instanceof C1087v) {
                    ((C1072l) obj).resumeWith(com.google.android.gms.internal.play_billing.N.w(((C1087v) U10).f12988a));
                    return;
                } else {
                    ((C1072l) obj).resumeWith(H.A(U10));
                    return;
                }
            default:
                ((AbstractC4825e) obj).resumeWith(jf.y.f36177a);
                return;
        }
    }
}
