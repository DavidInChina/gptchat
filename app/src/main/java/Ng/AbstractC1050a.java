package Ng;

import Sg.AbstractC1389a;
import id.AbstractC3557B;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5154a;
import q1.AbstractC5260f;

/* renamed from: Ng.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1050a extends v0 implements AbstractC4825e, F {

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4831k f12919h0;

    public AbstractC1050a(AbstractC4831k abstractC4831k, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            Y((AbstractC1073l0) abstractC4831k.get(C1071k0.f12951Y));
        }
        this.f12919h0 = abstractC4831k.plus(this);
    }

    @Override // Ng.v0
    public final String G() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // Ng.v0
    public final void X(K0.e eVar) {
        L4.a.A0(this.f12919h0, eVar);
    }

    @Override // Ng.v0, Ng.AbstractC1073l0
    public boolean a() {
        return super.a();
    }

    @Override // Ng.v0
    public String e0() {
        return super.e0();
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return this.f12919h0;
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f12919h0;
    }

    @Override // Ng.v0
    public final void j0(Object obj) {
        boolean z10;
        if (obj instanceof C1087v) {
            C1087v c1087v = (C1087v) obj;
            Throwable th2 = c1087v.f12988a;
            c1087v.getClass();
            if (C1087v.f12987b.get(c1087v) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q0(th2, z10);
            return;
        }
        r0(obj);
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        Throwable a5 = C3961k.a(obj);
        if (a5 != null) {
            obj = new C1087v(a5, false);
        }
        Object c02 = c0(obj);
        if (c02 == H.f12877e) {
            return;
        }
        y(c02);
    }

    public final void s0(G g10, AbstractC1050a abstractC1050a, wf.n nVar) {
        Object obj;
        int ordinal = g10.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            AbstractC4831k abstractC4831k = this.f12919h0;
                            Object e10 = AbstractC1389a.e(abstractC4831k, null);
                            if (!(nVar instanceof AbstractC5154a)) {
                                obj = AbstractC5260f.Y(abstractC1050a, this, nVar);
                            } else {
                                Ad.l.M(2, nVar);
                                obj = nVar.invoke(abstractC1050a, this);
                            }
                            AbstractC1389a.b(abstractC4831k, e10);
                            if (obj != EnumC5000a.f41328Y) {
                                resumeWith(obj);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(com.google.android.gms.internal.play_billing.N.w(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                AbstractC3557B.c0("<this>", nVar);
                AbstractC5260f.z(AbstractC5260f.n(abstractC1050a, this, nVar)).resumeWith(jf.y.f36177a);
                return;
            }
            return;
        }
        L4.a.R0(nVar, abstractC1050a, this);
    }

    public void r0(Object obj) {
    }

    public void q0(Throwable th2, boolean z10) {
    }
}
