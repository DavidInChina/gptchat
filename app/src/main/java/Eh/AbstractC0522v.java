package Eh;

import k6.AbstractC4194d;
import yh.l1;

/* renamed from: Eh.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0522v {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f4810a;

    /* renamed from: b  reason: collision with root package name */
    public final Bh.K f4811b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC0521u f4812c;

    public AbstractC0522v(l1 l1Var, Bh.K k10, EnumC0521u enumC0521u) {
        this.f4810a = l1Var;
        this.f4811b = k10;
        this.f4812c = enumC0521u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0522v abstractC0522v = (AbstractC0522v) obj;
        if (this.f4812c.equals(abstractC0522v.f4812c) && this.f4810a.equals(abstractC0522v.f4810a) && this.f4811b.equals(abstractC0522v.f4811b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int t10 = AbstractC4194d.t(this.f4810a, getClass().hashCode() * 31, 31);
        return this.f4812c.hashCode() + ((this.f4811b.hashCode() + t10) * 31);
    }
}
