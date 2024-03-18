package U8;

import N0.C1046e;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f17546a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f17547b;

    public p(C1046e c1046e, Map map) {
        this.f17546a = c1046e;
        this.f17547b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (AbstractC3557B.K(this.f17546a, pVar.f17546a) && AbstractC3557B.K(this.f17547b, pVar.f17547b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17547b.hashCode() + (this.f17546a.hashCode() * 31);
    }

    public final String toString() {
        return "RichTextString(taggedString=" + ((Object) this.f17546a) + ", formatObjects=" + this.f17547b + Separators.RPAREN;
    }
}
