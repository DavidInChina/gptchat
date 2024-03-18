package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import cb.AbstractC2338G;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1874u implements C {
    public static final C1872t Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23613a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23614b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23615c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f23616d;

    public C1874u(int i10, String str, String str2, String str3, Integer num) {
        if (7 == (i10 & 7)) {
            this.f23613a = str;
            this.f23614b = str2;
            this.f23615c = str3;
            if ((i10 & 8) == 0) {
                this.f23616d = null;
                return;
            } else {
                this.f23616d = num;
                return;
            }
        }
        R4.b.e2(i10, 7, C1870s.f23610b);
        throw null;
    }

    @Override // Za.C
    public final AbstractC2338G a() {
        return K8.d.R0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1874u)) {
            return false;
        }
        C1874u c1874u = (C1874u) obj;
        if (AbstractC3557B.K(this.f23613a, c1874u.f23613a) && AbstractC3557B.K(this.f23614b, c1874u.f23614b) && AbstractC3557B.K(this.f23615c, c1874u.f23615c) && AbstractC3557B.K(this.f23616d, c1874u.f23616d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f23615c, E9.f.v(this.f23614b, this.f23613a.hashCode() * 31, 31), 31);
        Integer num = this.f23616d;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "Category(type=" + this.f23613a + ", category=" + this.f23614b + ", categoryStr=" + this.f23615c + ", categoryRanking=" + this.f23616d + Separators.RPAREN;
    }
}
