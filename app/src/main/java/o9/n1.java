package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import l8.AbstractC4344b;

@AbstractC1998i
/* loaded from: classes.dex */
public final class n1 implements AbstractC1102f {
    public static final m1 Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f13564c = {new C2695d(dh.u0.f28491a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f13565a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13566b;

    public n1(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, l1.f13557b);
            throw null;
        }
        this.f13565a = list;
        this.f13566b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (AbstractC3557B.K(this.f13565a, n1Var.f13565a) && AbstractC3557B.K(this.f13566b, n1Var.f13566b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13566b.hashCode() + (this.f13565a.hashCode() * 31);
    }

    public final String toString() {
        return "ApiTextContent(parts=" + this.f13565a + ", contentType=" + this.f13566b + Separators.RPAREN;
    }

    public n1(String str) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        List F02 = AbstractC4344b.F0(str);
        EnumC1098d[] enumC1098dArr = EnumC1098d.f13527Y;
        this.f13565a = F02;
        this.f13566b = ParameterNames.TEXT;
    }
}
