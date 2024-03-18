package Bh;

import java.util.HashSet;
import java.util.Set;
import wh.AbstractC6250o;

/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final X f2240a;

    /* renamed from: b  reason: collision with root package name */
    public final Fh.B f2241b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6250o f2242c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f2243d;

    /* renamed from: e  reason: collision with root package name */
    public final xh.e f2244e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2245f;

    public Q(X x10, Fh.B b10, AbstractC6250o abstractC6250o, HashSet hashSet, xh.e eVar, boolean z10) {
        this.f2240a = x10;
        this.f2241b = b10;
        this.f2242c = abstractC6250o;
        this.f2243d = hashSet;
        this.f2244e = eVar;
        this.f2245f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        Q q10 = (Q) obj;
        if (this.f2245f == q10.f2245f && this.f2244e.equals(q10.f2244e) && this.f2240a.equals(q10.f2240a) && this.f2241b.equals(q10.f2241b) && this.f2242c.equals(q10.f2242c) && this.f2243d.equals(q10.f2243d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2240a.hashCode();
        int hashCode2 = this.f2241b.hashCode();
        int hashCode3 = this.f2242c.hashCode();
        int hashCode4 = this.f2243d.hashCode();
        return ((this.f2244e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Q.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f2245f ? 1 : 0);
    }
}
