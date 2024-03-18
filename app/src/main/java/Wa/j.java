package Wa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class j {
    public static final i Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f20852b = {new C2695d(k.f20854a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f20853a;

    public j(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f20853a = list;
        } else {
            R4.b.e2(i10, 1, h.f20851b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && AbstractC3557B.K(this.f20853a, ((j) obj).f20853a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20853a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("GizmoActionSettings(settings="), this.f20853a, Separators.RPAREN);
    }

    public j(ArrayList arrayList) {
        this.f20853a = arrayList;
    }
}
