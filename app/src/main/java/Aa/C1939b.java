package aa;

import android.gov.nist.core.Separators;
import ca.EnumC2323o;
import ha.M;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: aa.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1939b {

    /* renamed from: a  reason: collision with root package name */
    public final M f24021a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24022b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC1938a f24023c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC2323o f24024d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24025e;

    public C1939b(M m10, String str, EnumC1938a enumC1938a, EnumC2323o enumC2323o, boolean z10) {
        AbstractC3557B.c0("actionState", enumC1938a);
        AbstractC3557B.c0("toolStatus", enumC2323o);
        this.f24021a = m10;
        this.f24022b = str;
        this.f24023c = enumC1938a;
        this.f24024d = enumC2323o;
        this.f24025e = z10;
    }

    public static C1939b a(C1939b c1939b, EnumC1938a enumC1938a, EnumC2323o enumC2323o, int i10) {
        if ((i10 & 4) != 0) {
            enumC1938a = c1939b.f24023c;
        }
        EnumC1938a enumC1938a2 = enumC1938a;
        M m10 = c1939b.f24021a;
        AbstractC3557B.c0("details", m10);
        AbstractC3557B.c0("actionState", enumC1938a2);
        AbstractC3557B.c0("toolStatus", enumC2323o);
        return new C1939b(m10, c1939b.f24022b, enumC1938a2, enumC2323o, c1939b.f24025e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1939b)) {
            return false;
        }
        C1939b c1939b = (C1939b) obj;
        if (AbstractC3557B.K(this.f24021a, c1939b.f24021a) && AbstractC3557B.K(this.f24022b, c1939b.f24022b) && this.f24023c == c1939b.f24023c && this.f24024d == c1939b.f24024d && this.f24025e == c1939b.f24025e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f24021a.hashCode() * 31;
        String str = this.f24022b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode2 = this.f24023c.hashCode();
        int hashCode3 = (this.f24024d.hashCode() + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31;
        if (this.f24025e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return hashCode3 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAction(details=");
        sb2.append(this.f24021a);
        sb2.append(", toolRole=");
        sb2.append(this.f24022b);
        sb2.append(", actionState=");
        sb2.append(this.f24023c);
        sb2.append(", toolStatus=");
        sb2.append(this.f24024d);
        sb2.append(", isLocal=");
        return AbstractC4194d.w(sb2, this.f24025e, Separators.RPAREN);
    }

    public /* synthetic */ C1939b(M m10, String str, EnumC2323o enumC2323o, int i10) {
        this(m10, str, EnumC1938a.f24016Y, (i10 & 8) != 0 ? EnumC2323o.f26406Y : enumC2323o, false);
    }
}
