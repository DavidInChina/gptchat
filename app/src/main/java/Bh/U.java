package Bh;

import java.util.Set;
import wh.AbstractC6250o;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0238c0 f2280a;

    /* renamed from: b  reason: collision with root package name */
    public final Fh.w f2281b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6250o f2282c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f2283d;

    /* renamed from: e  reason: collision with root package name */
    public final xh.e f2284e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2285f;

    public U(AbstractC0238c0 abstractC0238c0, Fh.w wVar, AbstractC6250o abstractC6250o, Set set, xh.e eVar, boolean z10) {
        this.f2280a = abstractC0238c0;
        this.f2281b = wVar;
        this.f2282c = abstractC6250o;
        this.f2283d = set;
        this.f2284e = eVar;
        this.f2285f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u10 = (U) obj;
        if (this.f2285f == u10.f2285f && this.f2284e.equals(u10.f2284e) && this.f2280a.equals(u10.f2280a) && this.f2281b.equals(u10.f2281b) && this.f2282c.equals(u10.f2282c) && this.f2283d.equals(u10.f2283d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2280a.hashCode();
        int hashCode2 = this.f2281b.hashCode();
        int hashCode3 = this.f2282c.hashCode();
        int hashCode4 = this.f2283d.hashCode();
        return ((this.f2284e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (U.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f2285f ? 1 : 0);
    }
}
