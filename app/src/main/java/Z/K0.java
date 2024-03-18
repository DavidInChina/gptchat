package Z;

import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public final class K0 implements AbstractC1700a0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final K0 f22504Y = new Object();

    @Override // Z.AbstractC1700a0
    public final Object S(wf.k kVar, AbstractC4825e abstractC4825e) {
        Tg.e eVar = Ng.Q.f12904a;
        return Ad.l.n1(abstractC4825e, Sg.u.f16684a, new J0(kVar, null));
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
