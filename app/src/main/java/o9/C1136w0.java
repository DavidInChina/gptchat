package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: O9.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1136w0 {
    public static final C1134v0 Companion = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer[] f13614g = {null, null, null, null, new C2695d(L.f13474a, 0), new C2695d(C1105g0.f13537a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f13615a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13616b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13617c;

    /* renamed from: d  reason: collision with root package name */
    public final kotlinx.serialization.json.b f13618d;

    /* renamed from: e  reason: collision with root package name */
    public final List f13619e;

    /* renamed from: f  reason: collision with root package name */
    public final List f13620f;

    public C1136w0(int i10, String str, String str2, String str3, kotlinx.serialization.json.b bVar, List list, List list2) {
        if (4 == (i10 & 4)) {
            if ((i10 & 1) == 0) {
                this.f13615a = null;
            } else {
                this.f13615a = str;
            }
            if ((i10 & 2) == 0) {
                this.f13616b = null;
            } else {
                this.f13616b = str2;
            }
            this.f13617c = str3;
            if ((i10 & 8) == 0) {
                this.f13618d = null;
            } else {
                this.f13618d = bVar;
            }
            if ((i10 & 16) == 0) {
                this.f13619e = null;
            } else {
                this.f13619e = list;
            }
            if ((i10 & 32) == 0) {
                this.f13620f = Xh.b.l(new C1132u0[0]);
                return;
            } else {
                this.f13620f = list2;
                return;
            }
        }
        R4.b.e2(i10, 4, C1103f0.f13535b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1136w0)) {
            return false;
        }
        C1136w0 c1136w0 = (C1136w0) obj;
        if (AbstractC3557B.K(this.f13615a, c1136w0.f13615a) && AbstractC3557B.K(this.f13616b, c1136w0.f13616b) && AbstractC3557B.K(this.f13617c, c1136w0.f13617c) && AbstractC3557B.K(this.f13618d, c1136w0.f13618d) && AbstractC3557B.K(this.f13619e, c1136w0.f13619e) && AbstractC3557B.K(this.f13620f, c1136w0.f13620f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.f13615a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = i10 * 31;
        String str2 = this.f13616b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f13617c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        kotlinx.serialization.json.b bVar = this.f13618d;
        if (bVar == null) {
            i13 = 0;
        } else {
            i13 = bVar.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        List list = this.f13619e;
        if (list != null) {
            i14 = list.hashCode();
        }
        return this.f13620f.hashCode() + ((i18 + i14) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JitBody(domain=");
        sb2.append(this.f13615a);
        sb2.append(", privacyPolicy=");
        sb2.append(this.f13616b);
        sb2.append(", operation=");
        sb2.append(this.f13617c);
        sb2.append(", params=");
        sb2.append(this.f13618d);
        sb2.append(", files=");
        sb2.append(this.f13619e);
        sb2.append(", actions=");
        return android.gov.nist.core.a.o(sb2, this.f13620f, Separators.RPAREN);
    }
}
