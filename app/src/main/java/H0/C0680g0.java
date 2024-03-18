package H0;

import A.C0043t;
import Ng.C1072l;
import Z.AbstractC1700a0;
import Z.C1723m;
import android.view.Choreographer;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import nf.C4826f;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: H0.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0680g0 implements AbstractC1700a0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Choreographer f6954Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C0676e0 f6955Z;

    public C0680g0(Choreographer choreographer, C0676e0 c0676e0) {
        this.f6954Y = choreographer;
        this.f6955Z = c0676e0;
    }

    @Override // Z.AbstractC1700a0
    public final Object S(wf.k kVar, AbstractC4825e abstractC4825e) {
        C0676e0 c0676e0 = this.f6955Z;
        if (c0676e0 == null) {
            AbstractC4829i abstractC4829i = abstractC4825e.getContext().get(C4826f.f40317Y);
            if (abstractC4829i instanceof C0676e0) {
                c0676e0 = (C0676e0) abstractC4829i;
            } else {
                c0676e0 = null;
            }
        }
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        Choreographer$FrameCallbackC0678f0 choreographer$FrameCallbackC0678f0 = new Choreographer$FrameCallbackC0678f0(c1072l, this, kVar);
        if (c0676e0 != null && AbstractC3557B.K(c0676e0.f6939Z, this.f6954Y)) {
            synchronized (c0676e0.f6941i0) {
                c0676e0.f6943k0.add(choreographer$FrameCallbackC0678f0);
                if (!c0676e0.f6946n0) {
                    c0676e0.f6946n0 = true;
                    c0676e0.f6939Z.postFrameCallback(c0676e0.f6947o0);
                }
            }
            c1072l.w(new C0043t(c0676e0, 21, choreographer$FrameCallbackC0678f0));
        } else {
            this.f6954Y.postFrameCallback(choreographer$FrameCallbackC0678f0);
            c1072l.w(new C0043t(this, 22, choreographer$FrameCallbackC0678f0));
        }
        Object t10 = c1072l.t();
        if (t10 == EnumC5000a.f41328Y) {
            com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
        }
        return t10;
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, wf.n nVar) {
        return AbstractC4344b.j0(this, obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.s0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public final AbstractC4830j getKey() {
        return C1723m.f22655Z;
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.L0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        return AbstractC4344b.Q0(this, abstractC4831k);
    }
}
