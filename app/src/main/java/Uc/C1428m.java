package Uc;

import java.util.List;
import l8.AbstractC4344b;

/* renamed from: Uc.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1428m extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final C1428m f17688i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17689j = AbstractC4344b.F0(r9.y.N0("instruction", C1417b.f17659w0));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1428m)) {
            return false;
        }
        C1428m c1428m = (C1428m) obj;
        return true;
    }

    public final int hashCode() {
        return 1051096030;
    }

    @Override // Ad.l
    public final List n0() {
        return f17689j;
    }

    public final String toString() {
        return "CustomInstructionsEdit";
    }

    @Override // Ad.l
    public final String x0() {
        return "custom-instructions/{instruction}";
    }
}
