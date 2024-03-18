package Rg;

import nf.AbstractC4825e;
import nf.AbstractC4831k;
import pf.AbstractC5157d;

/* loaded from: classes2.dex */
public final class G implements AbstractC4825e, AbstractC5157d {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4825e f15519Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4831k f15520Z;

    public G(AbstractC4825e abstractC4825e, AbstractC4831k abstractC4831k) {
        this.f15519Y = abstractC4825e;
        this.f15520Z = abstractC4831k;
    }

    @Override // pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        AbstractC4825e abstractC4825e = this.f15519Y;
        if (abstractC4825e instanceof AbstractC5157d) {
            return (AbstractC5157d) abstractC4825e;
        }
        return null;
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return this.f15520Z;
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        this.f15519Y.resumeWith(obj);
    }
}
