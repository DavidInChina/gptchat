package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1846f0 {
    public static final C1844e0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23553a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23554b;

    /* renamed from: c  reason: collision with root package name */
    public final C1858l0 f23555c;

    public C1846f0(int i10, String str, String str2, C1858l0 c1858l0) {
        if (3 == (i10 & 3)) {
            this.f23553a = str;
            this.f23554b = str2;
            if ((i10 & 4) == 0) {
                this.f23555c = null;
                return;
            } else {
                this.f23555c = c1858l0;
                return;
            }
        }
        R4.b.e2(i10, 3, C1842d0.f23550b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1846f0)) {
            return false;
        }
        C1846f0 c1846f0 = (C1846f0) obj;
        if (AbstractC3557B.K(this.f23553a, c1846f0.f23553a) && AbstractC3557B.K(this.f23554b, c1846f0.f23554b) && AbstractC3557B.K(this.f23555c, c1846f0.f23555c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f23554b, this.f23553a.hashCode() * 31, 31);
        C1858l0 c1858l0 = this.f23555c;
        if (c1858l0 == null) {
            i10 = 0;
        } else {
            i10 = c1858l0.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "ApiGizmoTool(id=" + this.f23553a + ", type=" + this.f23554b + ", metadata=" + this.f23555c + Separators.RPAREN;
    }
}
