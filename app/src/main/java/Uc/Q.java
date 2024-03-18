package Uc;

import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class Q extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final Q f17626i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17627j = AbstractC4344b.F0(r9.y.N0("unavailableFreeFeature", C1417b.f17637B0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return true;
    }

    public final int hashCode() {
        return 91379611;
    }

    @Override // Ad.l
    public final List n0() {
        return f17627j;
    }

    public final String o1(boolean z10) {
        String str = "subscription/" + z10;
        AbstractC3557B.c0("internalRoute", str);
        return str;
    }

    public final String toString() {
        return "Subscription";
    }

    @Override // Ad.l
    public final String x0() {
        return "subscription/{unavailableFreeFeature}";
    }
}
