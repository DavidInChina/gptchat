package Z1;

import id.AbstractC3557B;
import java.util.Map;

/* renamed from: Z1.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1763g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f22961a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22962b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f22963c;

    public /* synthetic */ C1763g0(int i10, int i11, Map map, int i12) {
        this((i12 & 1) != 0 ? -1 : i10, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? kf.w.f37484Y : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1763g0)) {
            return false;
        }
        C1763g0 c1763g0 = (C1763g0) obj;
        if (this.f22961a == c1763g0.f22961a && this.f22962b == c1763g0.f22962b && AbstractC3557B.K(this.f22963c, c1763g0.f22963c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22963c.hashCode() + (((this.f22961a * 31) + this.f22962b) * 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.f22961a + ", complexViewId=" + this.f22962b + ", children=" + this.f22963c + ')';
    }

    public C1763g0(int i10, int i11, Map map) {
        this.f22961a = i10;
        this.f22962b = i11;
        this.f22963c = map;
    }
}
