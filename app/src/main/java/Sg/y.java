package Sg;

import Ng.AbstractC1050a;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import pf.AbstractC5157d;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public class y extends AbstractC1050a implements AbstractC5157d {

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC4825e f16686i0;

    public y(AbstractC4825e abstractC4825e, AbstractC4831k abstractC4831k) {
        super(abstractC4831k, true, true);
        this.f16686i0 = abstractC4825e;
    }

    @Override // Ng.v0
    public final boolean Z() {
        return true;
    }

    @Override // pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        AbstractC4825e abstractC4825e = this.f16686i0;
        if (abstractC4825e instanceof AbstractC5157d) {
            return (AbstractC5157d) abstractC4825e;
        }
        return null;
    }

    @Override // Ng.v0
    public void w(Object obj) {
        AbstractC1389a.c(AbstractC5260f.z(this.f16686i0), P4.a.z0(obj), null);
    }

    @Override // Ng.v0
    public void y(Object obj) {
        this.f16686i0.resumeWith(P4.a.z0(obj));
    }
}
