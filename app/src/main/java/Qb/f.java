package Qb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class f {
    public static final b Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f14565b = {new C2695d(c.f14560a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f14566a;

    public f(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f14566a = list;
        } else {
            R4.b.e2(i10, 1, a.f14559b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f14566a, ((f) obj).f14566a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14566a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("CustomPrompts(prompts="), this.f14566a, Separators.RPAREN);
    }

    public f(ArrayList arrayList) {
        this.f14566a = arrayList;
    }
}
