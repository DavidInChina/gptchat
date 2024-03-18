package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class Z0 implements AbstractC1102f {
    public static final Y0 Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f13514c = {new C2695d(i1.f13544d, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f13515a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13516b;

    public Z0(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, X0.f13509b);
            throw null;
        }
        this.f13515a = list;
        this.f13516b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z0)) {
            return false;
        }
        Z0 z02 = (Z0) obj;
        if (AbstractC3557B.K(this.f13515a, z02.f13515a) && AbstractC3557B.K(this.f13516b, z02.f13516b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13516b.hashCode() + (this.f13515a.hashCode() * 31);
    }

    public final String toString() {
        return "ApiMultimodalTextContent(parts=" + this.f13515a + ", contentType=" + this.f13516b + Separators.RPAREN;
    }

    public Z0(ArrayList arrayList) {
        EnumC1098d[] enumC1098dArr = EnumC1098d.f13527Y;
        this.f13515a = arrayList;
        this.f13516b = "multimodal_text";
    }
}
