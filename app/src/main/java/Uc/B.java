package Uc;

import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class B extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final B f17607i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17608j = AbstractC4344b.F0(r9.y.N0("search-selected", C1417b.f17661y0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return true;
    }

    public final int hashCode() {
        return -1339928746;
    }

    @Override // Ad.l
    public final List n0() {
        return f17608j;
    }

    public final String toString() {
        return "History";
    }

    @Override // Ad.l
    public final String x0() {
        return "history/{search-selected}";
    }
}
