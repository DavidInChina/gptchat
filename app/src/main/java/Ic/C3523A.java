package ic;

import Uc.C1426k;
import id.AbstractC3557B;
import nf.AbstractC4828h;

/* renamed from: ic.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3523A extends AbstractC3552w {

    /* renamed from: j  reason: collision with root package name */
    public final xd.g f32941j;

    public C3523A(xd.g gVar, Ba.j jVar) {
        super(new C3551v(null, null));
        this.f32941j = gVar;
        L4.a.E0(L4.a.I0(new C3553x(this, null), jVar.f2031c), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC3549t abstractC3549t = (AbstractC3549t) iVar;
        AbstractC3557B.c0("intent", abstractC3549t);
        if (abstractC3549t instanceof C3547q) {
            h(new C3554y(this, null));
        } else if (abstractC3549t instanceof r) {
            h(new C3555z(this, abstractC3549t, null));
        } else if (abstractC3549t instanceof C3548s) {
            f(new C3543m(Uc.U.f17630k.o1()));
        } else if (abstractC3549t instanceof C3546p) {
            f(new C3543m(C1426k.f17683k.o1()));
        }
    }
}
