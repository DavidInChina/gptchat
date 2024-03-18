package H2;

import p2.C5065s;
import x8.E;

/* loaded from: classes2.dex */
public final class g implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f7230Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f7231Z;

    public g(int i10, C5065s c5065s) {
        this.f7230Y = (c5065s.f42311i0 & 1) == 0 ? false : true;
        this.f7231Z = p.f(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return E.f49509a.c(this.f7231Z, gVar.f7231Z).c(this.f7230Y, gVar.f7230Y).e();
    }
}
