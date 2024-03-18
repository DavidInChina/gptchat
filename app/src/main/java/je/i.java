package je;

import id.AbstractC3557B;
import l8.AbstractC4344b;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import wf.n;

/* loaded from: classes.dex */
public final class i implements AbstractC4829i {

    /* renamed from: Z  reason: collision with root package name */
    public static final P5.c f36134Z = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4831k f36135Y;

    public i(AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("callContext", abstractC4831k);
        this.f36135Y = abstractC4831k;
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, n nVar) {
        return AbstractC4344b.j0(this, obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.s0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public final AbstractC4830j getKey() {
        return f36134Z;
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
