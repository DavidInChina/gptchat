package Rg;

import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class v implements AbstractC4831k {

    /* renamed from: Y  reason: collision with root package name */
    public final Throwable f15588Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4831k f15589Z;

    public v(AbstractC4831k abstractC4831k, Throwable th2) {
        this.f15588Y = th2;
        this.f15589Z = abstractC4831k;
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, wf.n nVar) {
        return this.f15589Z.fold(obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        return this.f15589Z.get(abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        return this.f15589Z.minusKey(abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        return this.f15589Z.plus(abstractC4831k);
    }
}
