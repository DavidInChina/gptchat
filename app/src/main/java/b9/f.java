package B9;

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
    public static final e Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f1997b = {new C2695d(g.f1999a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f1998a;

    public f(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f1998a = list;
        } else {
            R4.b.e2(i10, 1, d.f1996b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f1998a, ((f) obj).f1998a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1998a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("AssistStructureScreen(windows="), this.f1998a, Separators.RPAREN);
    }

    public f(ArrayList arrayList) {
        this.f1998a = arrayList;
    }
}
