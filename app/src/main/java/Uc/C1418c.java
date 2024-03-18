package Uc;

import java.util.List;
import l8.AbstractC4344b;

/* renamed from: Uc.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1418c extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final C1418c f17664i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17665j = AbstractC4344b.F0(r9.y.N0("functionId", C1417b.f17643Z));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1418c)) {
            return false;
        }
        C1418c c1418c = (C1418c) obj;
        return true;
    }

    public final int hashCode() {
        return 1976639405;
    }

    @Override // Ad.l
    public final List n0() {
        return f17665j;
    }

    public final String toString() {
        return "AipOauth";
    }

    @Override // Ad.l
    public final String x0() {
        return "aip/{functionId}";
    }
}
