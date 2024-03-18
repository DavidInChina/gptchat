package gc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f31571a;

    /* renamed from: b  reason: collision with root package name */
    public final List f31572b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31573c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f31574d;

    public o(String str, List list) {
        AbstractC3557B.c0("filter", str);
        AbstractC3557B.c0("data", list);
        this.f31571a = str;
        this.f31572b = list;
        this.f31573c = Lg.n.A2(str, Separators.SP, "_");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Lg.n.Z1(((C3251c) obj).f31550a.getKey(), this.f31573c, false)) {
                arrayList.add(obj);
            }
        }
        this.f31574d = arrayList;
    }

    public static o e(o oVar, String str, List list, int i10) {
        if ((i10 & 1) != 0) {
            str = oVar.f31571a;
        }
        if ((i10 & 2) != 0) {
            list = oVar.f31572b;
        }
        oVar.getClass();
        AbstractC3557B.c0("filter", str);
        AbstractC3557B.c0("data", list);
        return new o(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3557B.K(this.f31571a, oVar.f31571a) && AbstractC3557B.K(this.f31572b, oVar.f31572b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31572b.hashCode() + (this.f31571a.hashCode() * 31);
    }

    public final String toString() {
        return "ExperimentOverrideState(filter=" + this.f31571a + ", data=" + this.f31572b + Separators.RPAREN;
    }
}
