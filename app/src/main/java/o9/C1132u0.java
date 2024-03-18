package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: O9.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1132u0 {
    public static final C1119n0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13598a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13599b;

    /* renamed from: c  reason: collision with root package name */
    public final C1130t0 f13600c;

    /* renamed from: d  reason: collision with root package name */
    public final C1111j0 f13601d;

    /* renamed from: e  reason: collision with root package name */
    public final C1117m0 f13602e;

    /* renamed from: f  reason: collision with root package name */
    public final C1125q0 f13603f;

    public C1132u0(int i10, String str, String str2, C1130t0 c1130t0, C1111j0 c1111j0, C1117m0 c1117m0, C1125q0 c1125q0) {
        if (3 == (i10 & 3)) {
            this.f13598a = str;
            this.f13599b = str2;
            if ((i10 & 4) == 0) {
                this.f13600c = null;
            } else {
                this.f13600c = c1130t0;
            }
            if ((i10 & 8) == 0) {
                this.f13601d = null;
            } else {
                this.f13601d = c1111j0;
            }
            if ((i10 & 16) == 0) {
                this.f13602e = null;
            } else {
                this.f13602e = c1117m0;
            }
            if ((i10 & 32) == 0) {
                this.f13603f = null;
                return;
            } else {
                this.f13603f = c1125q0;
                return;
            }
        }
        R4.b.e2(i10, 3, C1105g0.f13538b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132u0)) {
            return false;
        }
        C1132u0 c1132u0 = (C1132u0) obj;
        if (AbstractC3557B.K(this.f13598a, c1132u0.f13598a) && AbstractC3557B.K(this.f13599b, c1132u0.f13599b) && AbstractC3557B.K(this.f13600c, c1132u0.f13600c) && AbstractC3557B.K(this.f13601d, c1132u0.f13601d) && AbstractC3557B.K(this.f13602e, c1132u0.f13602e) && AbstractC3557B.K(this.f13603f, c1132u0.f13603f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        String str = this.f13598a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i16 = i10 * 31;
        String str2 = this.f13599b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        C1130t0 c1130t0 = this.f13600c;
        if (c1130t0 == null) {
            i12 = 0;
        } else {
            i12 = c1130t0.hashCode();
        }
        int i18 = (i17 + i12) * 31;
        C1111j0 c1111j0 = this.f13601d;
        if (c1111j0 == null) {
            i13 = 0;
        } else {
            i13 = c1111j0.hashCode();
        }
        int i19 = (i18 + i13) * 31;
        C1117m0 c1117m0 = this.f13602e;
        if (c1117m0 == null) {
            i14 = 0;
        } else {
            i14 = c1117m0.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        C1125q0 c1125q0 = this.f13603f;
        if (c1125q0 != null) {
            i15 = c1125q0.hashCode();
        }
        return i20 + i15;
    }

    public final String toString() {
        return "Action(actionType=" + this.f13598a + ", name=" + this.f13599b + ", oauthRedirect=" + this.f13600c + ", allow=" + this.f13601d + ", alwaysAllow=" + this.f13602e + ", deny=" + this.f13603f + Separators.RPAREN;
    }
}
