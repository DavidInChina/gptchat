package de;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final List f28242a;

    /* renamed from: b  reason: collision with root package name */
    public final List f28243b;

    public l(ArrayList arrayList, ArrayList arrayList2) {
        this.f28242a = arrayList;
        this.f28243b = arrayList2;
    }

    public static float a(List list, Cf.g gVar) {
        Cf.f it = gVar.iterator();
        double d10 = 0.0d;
        while (it.f3111h0) {
            d10 += ((Number) list.get(it.a())).floatValue();
        }
        return (float) d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f28242a, lVar.f28242a) && AbstractC3557B.K(this.f28243b, lVar.f28243b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28243b.hashCode() + (this.f28242a.hashCode() * 31);
    }

    public final String toString() {
        return "LazyTablePxDimensions(columnsSize=" + this.f28242a + ", rowsSize=" + this.f28243b + Separators.RPAREN;
    }
}
