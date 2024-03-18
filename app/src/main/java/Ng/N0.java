package Ng;

import Sg.AbstractC1389a;
import jf.C3959i;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4826f;

/* loaded from: classes.dex */
public final class N0 extends Sg.y {

    /* renamed from: j0  reason: collision with root package name */
    public final ThreadLocal f12900j0;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N0(AbstractC4825e abstractC4825e, AbstractC4831k abstractC4831k) {
        super(abstractC4825e, r0);
        AbstractC4831k abstractC4831k2;
        O0 o02 = O0.f12902Y;
        if (abstractC4831k.get(o02) == null) {
            abstractC4831k2 = abstractC4831k.plus(o02);
        } else {
            abstractC4831k2 = abstractC4831k;
        }
        this.f12900j0 = new ThreadLocal();
        if (!(abstractC4825e.getContext().get(C4826f.f40317Y) instanceof B)) {
            Object e10 = AbstractC1389a.e(abstractC4831k, null);
            AbstractC1389a.b(abstractC4831k, e10);
            v0(abstractC4831k, e10);
        }
    }

    public final boolean t0() {
        boolean z10;
        if (this.threadLocalIsSet && this.f12900j0.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12900j0.remove();
        return !z10;
    }

    public final void v0(AbstractC4831k abstractC4831k, Object obj) {
        this.threadLocalIsSet = true;
        this.f12900j0.set(new C3959i(abstractC4831k, obj));
    }

    @Override // Sg.y, Ng.v0
    public final void y(Object obj) {
        if (this.threadLocalIsSet) {
            C3959i c3959i = (C3959i) this.f12900j0.get();
            if (c3959i != null) {
                AbstractC1389a.b((AbstractC4831k) c3959i.f36155Y, c3959i.f36156Z);
            }
            this.f12900j0.remove();
        }
        Object z02 = P4.a.z0(obj);
        AbstractC4825e abstractC4825e = this.f16686i0;
        AbstractC4831k context = abstractC4825e.getContext();
        N0 n02 = null;
        Object e10 = AbstractC1389a.e(context, null);
        if (e10 != AbstractC1389a.f16646f) {
            n02 = K4.J.j0(abstractC4825e, context, e10);
        }
        try {
            this.f16686i0.resumeWith(z02);
        } finally {
            if (n02 == null || n02.t0()) {
                AbstractC1389a.b(context, e10);
            }
        }
    }
}
