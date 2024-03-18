package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Za.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1847g {
    public static final C1845f Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f23556d = {null, null, new C2695d(dh.u0.f28491a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f23557a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23558b;

    /* renamed from: c  reason: collision with root package name */
    public final List f23559c;

    public C1847g(int i10, String str, String str2, List list) {
        if (3 == (i10 & 3)) {
            this.f23557a = str;
            this.f23558b = str2;
            if ((i10 & 4) == 0) {
                this.f23559c = kf.v.f37483Y;
                return;
            } else {
                this.f23559c = list;
                return;
            }
        }
        R4.b.e2(i10, 3, C1843e.f23552b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1847g)) {
            return false;
        }
        C1847g c1847g = (C1847g) obj;
        if (AbstractC3557B.K(this.f23557a, c1847g.f23557a) && AbstractC3557B.K(this.f23558b, c1847g.f23558b) && AbstractC3557B.K(this.f23559c, c1847g.f23559c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f23557a.hashCode() * 31;
        String str = this.f23558b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f23559c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Command(name=");
        sb2.append(this.f23557a);
        sb2.append(", description=");
        sb2.append(this.f23558b);
        sb2.append(", arguments=");
        return android.gov.nist.core.a.o(sb2, this.f23559c, Separators.RPAREN);
    }
}
