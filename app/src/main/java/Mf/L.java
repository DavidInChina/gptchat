package Mf;

import java.util.ArrayList;
import kg.C4291c;

/* loaded from: classes2.dex */
public interface L extends H {
    void a(C4291c c4291c, ArrayList arrayList);

    boolean b(C4291c c4291c);
}

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && Mg.b.d(this.f12775a, ((g) obj).f12775a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Mg.b.g(this.f12775a);
    }

    public final String toString() {
        return android.gov.nist.core.a.A("TokenTimeData(tokenDuration=", Mg.b.m(this.f12775a), Separators.RPAREN);
    }
}
