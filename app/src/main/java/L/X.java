package L;

import l0.AbstractC4327s;
import l0.C4310b;
import l8.AbstractC4344b;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class X implements AbstractC4327s {

    /* renamed from: Y  reason: collision with root package name */
    public static final X f10080Y = new Object();

    @Override // l0.AbstractC4327s
    public final float a0() {
        return 1.0f;
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
        return C4310b.f37708u0;
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
