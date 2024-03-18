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
public final class i {
    public static final h Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f2001c = {new C2695d(a.f1988a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f2002a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2003b;

    public i(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, g.f2000b);
            throw null;
        }
        this.f2002a = list;
        this.f2003b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f2002a, iVar.f2002a) && AbstractC3557B.K(this.f2003b, iVar.f2003b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2002a.hashCode() * 31;
        String str = this.f2003b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "AssistStructureWindow(nodes=" + this.f2002a + ", title=" + this.f2003b + Separators.RPAREN;
    }

    public i(String str, ArrayList arrayList) {
        this.f2002a = arrayList;
        this.f2003b = str;
    }
}
