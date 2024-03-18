package Pf;

import Bg.p0;

/* loaded from: classes.dex */
public final class B implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13980Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f13981Z;

    public /* synthetic */ B(C c10, int i10) {
        this.f13980Y = i10;
        this.f13981Z = c10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f13980Y) {
            case 0:
                return Boolean.valueOf(!((Mf.b0) obj).b0());
            default:
                Bg.D d10 = (Bg.D) obj;
                C c10 = this.f13981Z;
                if (d10 != null) {
                    if (!c10.f13983Z.f2128a.e()) {
                        return (Bg.D) c10.w0().j(d10, p0.f2146h0);
                    }
                    return d10;
                }
                c10.getClass();
                return d10;
        }
    }
}
