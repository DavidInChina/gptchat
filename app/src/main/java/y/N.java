package y;

import id.AbstractC3557B;
import l0.AbstractC4313e;
import z.AbstractC6659E;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4313e f50130a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f50131b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6659E f50132c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f50133d;

    public N(AbstractC6659E abstractC6659E, AbstractC4313e abstractC4313e, wf.k kVar, boolean z10) {
        this.f50130a = abstractC4313e;
        this.f50131b = kVar;
        this.f50132c = abstractC6659E;
        this.f50133d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (AbstractC3557B.K(this.f50130a, n10.f50130a) && AbstractC3557B.K(this.f50131b, n10.f50131b) && AbstractC3557B.K(this.f50132c, n10.f50132c) && this.f50133d == n10.f50133d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f50131b.hashCode();
        int hashCode2 = (this.f50132c.hashCode() + ((hashCode + (this.f50130a.hashCode() * 31)) * 31)) * 31;
        if (this.f50133d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSize(alignment=");
        sb2.append(this.f50130a);
        sb2.append(", size=");
        sb2.append(this.f50131b);
        sb2.append(", animationSpec=");
        sb2.append(this.f50132c);
        sb2.append(", clip=");
        return AbstractC6463a.l(sb2, this.f50133d, ')');
    }
}
