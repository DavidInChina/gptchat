package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Za.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1839c {
    public static final C1837b Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f23538f = {null, null, null, null, new C2695d(C1860m0.f23579a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f23539a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23540b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23541c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f23542d;

    /* renamed from: e  reason: collision with root package name */
    public final List f23543e;

    public C1839c(int i10, String str, String str2, String str3, Boolean bool, List list) {
        if (15 == (i10 & 15)) {
            this.f23539a = str;
            this.f23540b = str2;
            this.f23541c = str3;
            this.f23542d = bool;
            if ((i10 & 16) == 0) {
                this.f23543e = kf.v.f37483Y;
                return;
            } else {
                this.f23543e = list;
                return;
            }
        }
        R4.b.e2(i10, 15, C1835a.f23535b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1839c)) {
            return false;
        }
        C1839c c1839c = (C1839c) obj;
        if (AbstractC3557B.K(this.f23539a, c1839c.f23539a) && AbstractC3557B.K(this.f23540b, c1839c.f23540b) && AbstractC3557B.K(this.f23541c, c1839c.f23541c) && AbstractC3557B.K(this.f23542d, c1839c.f23542d) && AbstractC3557B.K(this.f23543e, c1839c.f23543e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f23539a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f23540b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f23541c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Boolean bool = this.f23542d;
        if (bool != null) {
            i13 = bool.hashCode();
        }
        return this.f23543e.hashCode() + ((i16 + i13) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiAuthor(displayName=");
        sb2.append(this.f23539a);
        sb2.append(", linkTo=");
        sb2.append(this.f23540b);
        sb2.append(", selectedDisplay=");
        sb2.append(this.f23541c);
        sb2.append(", willReceiveSupportEmails=");
        sb2.append(this.f23542d);
        sb2.append(", displayLinks=");
        return android.gov.nist.core.a.o(sb2, this.f23543e, Separators.RPAREN);
    }
}
