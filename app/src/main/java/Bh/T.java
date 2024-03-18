package Bh;

import Qh.AbstractC1234l;
import Qh.AbstractC1243v;

/* loaded from: classes2.dex */
public final class T implements AbstractC1243v {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1243v f2276a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0238c0 f2277b;

    /* renamed from: c  reason: collision with root package name */
    public final Fh.w f2278c;

    /* renamed from: d  reason: collision with root package name */
    public final zh.J f2279d;

    public T(AbstractC1243v abstractC1243v, AbstractC0238c0 abstractC0238c0, Fh.w wVar, zh.J j6) {
        this.f2276a = abstractC1243v;
        this.f2277b = abstractC0238c0;
        this.f2278c = wVar;
        this.f2279d = j6;
    }

    @Override // Qh.AbstractC1243v
    public final AbstractC1234l a(AbstractC0265q abstractC0265q) {
        return this.f2276a.a(abstractC0265q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t10 = (T) obj;
        if (this.f2276a.equals(t10.f2276a) && this.f2277b.equals(t10.f2277b) && this.f2278c.equals(t10.f2278c) && this.f2279d.equals(t10.f2279d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2276a.hashCode();
        int hashCode2 = this.f2277b.hashCode();
        int hashCode3 = this.f2278c.hashCode();
        return this.f2279d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (T.class.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
