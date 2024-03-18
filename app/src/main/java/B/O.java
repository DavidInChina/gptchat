package B;

import Ng.AbstractC1070k;
import Ng.C1072l;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6216a f1142a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1070k f1143b;

    public O(I.i iVar, C1072l c1072l) {
        this.f1142a = iVar;
        this.f1143b = c1072l;
    }

    public final String toString() {
        String str;
        String str2;
        AbstractC1070k abstractC1070k = this.f1143b;
        Ng.E e10 = (Ng.E) abstractC1070k.getContext().get(Ng.E.f12865Z);
        if (e10 != null) {
            str = e10.f12866Y;
        } else {
            str = null;
        }
        StringBuilder sb2 = new StringBuilder("Request@");
        int hashCode = hashCode();
        K4.J.j(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC3557B.b0("toString(this, checkRadix(radix))", num);
        sb2.append(num);
        if (str == null || (str2 = android.gov.nist.core.a.A("[", str, "](")) == null) {
            str2 = Separators.LPAREN;
        }
        sb2.append(str2);
        sb2.append("currentBounds()=");
        sb2.append(this.f1142a.mo122invoke());
        sb2.append(", continuation=");
        sb2.append(abstractC1070k);
        sb2.append(')');
        return sb2.toString();
    }
}
