package ld;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1079o0;
import Ng.E0;
import Ng.F;
import Ng.Q;
import Sg.C1394f;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import nf.AbstractC4831k;

/* renamed from: ld.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4433f implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final E0 f38283Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1394f f38284Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4831k f38285h0;

    /* JADX WARN: Type inference failed for: r0v4, types: [nf.i, Ng.E0, Ng.o0] */
    public AbstractC4433f(F f6) {
        AbstractC3557B.c0("parentScope", f6);
        AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) f6.i().get(C1071k0.f12951Y);
        if (abstractC1073l0 != null) {
            ?? c1079o0 = new C1079o0(abstractC1073l0);
            this.f38283Y = c1079o0;
            C1394f g10 = Ad.l.g(AbstractC4344b.Q0(c1079o0, Q.f12904a));
            this.f38284Z = g10;
            this.f38285h0 = g10.f16652Y;
            return;
        }
        throw new IllegalStateException("Parent scope has no job!".toString());
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f38285h0;
    }
}
