package Z;

import Ng.C1072l;
import android.view.Choreographer;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;
import w.C6077x;

/* loaded from: classes.dex */
public final class G implements AbstractC1700a0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final G f22490Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final Choreographer f22491Z = (Choreographer) Ad.l.a1(((Og.d) Sg.u.f16684a).f13759j0, new AbstractC5163j(2, null));

    /* JADX WARN: Type inference failed for: r0v0, types: [Z.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [pf.j, wf.n] */
    static {
        Tg.e eVar = Ng.Q.f12904a;
    }

    @Override // Z.AbstractC1700a0
    public final Object S(wf.k kVar, AbstractC4825e abstractC4825e) {
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        F f6 = new F(c1072l, kVar);
        f22491Z.postFrameCallback(f6);
        c1072l.w(new C6077x(19, f6));
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
