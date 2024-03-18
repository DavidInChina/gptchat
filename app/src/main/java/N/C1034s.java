package N;

import id.AbstractC3557B;
import y.AbstractC6463a;

/* renamed from: N.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034s {

    /* renamed from: a  reason: collision with root package name */
    public final r f12408a;

    /* renamed from: b  reason: collision with root package name */
    public final r f12409b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12410c;

    public C1034s(r rVar, r rVar2, boolean z10) {
        this.f12408a = rVar;
        this.f12409b = rVar2;
        this.f12410c = z10;
    }

    public static C1034s a(C1034s c1034s, r rVar, r rVar2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            rVar = c1034s.f12408a;
        }
        if ((i10 & 2) != 0) {
            rVar2 = c1034s.f12409b;
        }
        if ((i10 & 4) != 0) {
            z10 = c1034s.f12410c;
        }
        c1034s.getClass();
        return new C1034s(rVar, rVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1034s)) {
            return false;
        }
        C1034s c1034s = (C1034s) obj;
        if (AbstractC3557B.K(this.f12408a, c1034s.f12408a) && AbstractC3557B.K(this.f12409b, c1034s.f12409b) && this.f12410c == c1034s.f12410c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f12409b.hashCode() + (this.f12408a.hashCode() * 31)) * 31;
        if (this.f12410c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f12408a);
        sb2.append(", end=");
        sb2.append(this.f12409b);
        sb2.append(", handlesCrossed=");
        return AbstractC6463a.l(sb2, this.f12410c, ')');
    }
}
