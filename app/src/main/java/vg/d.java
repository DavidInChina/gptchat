package vg;

import Bg.A;
import Bg.D;
import Mf.AbstractC0997f;
import Pf.AbstractC1144b;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0997f f47532Y;

    public d(AbstractC1144b abstractC1144b) {
        AbstractC3557B.c0("classDescriptor", abstractC1144b);
        this.f47532Y = abstractC1144b;
    }

    public final boolean equals(Object obj) {
        d dVar;
        AbstractC0997f abstractC0997f = null;
        if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            abstractC0997f = dVar.f47532Y;
        }
        return AbstractC3557B.K(this.f47532Y, abstractC0997f);
    }

    @Override // vg.f
    public final A getType() {
        D n10 = this.f47532Y.n();
        AbstractC3557B.b0("getDefaultType(...)", n10);
        return n10;
    }

    public final int hashCode() {
        return this.f47532Y.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        D n10 = this.f47532Y.n();
        AbstractC3557B.b0("getDefaultType(...)", n10);
        sb2.append(n10);
        sb2.append('}');
        return sb2.toString();
    }
}
