package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: O9.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1138x0 {
    public static final C1101e0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13625a;

    /* renamed from: b  reason: collision with root package name */
    public final C1136w0 f13626b;

    public C1138x0(int i10, String str, C1136w0 c1136w0) {
        if ((i10 & 1) == 0) {
            this.f13625a = null;
        } else {
            this.f13625a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13626b = null;
        } else {
            this.f13626b = c1136w0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1138x0)) {
            return false;
        }
        C1138x0 c1138x0 = (C1138x0) obj;
        if (AbstractC3557B.K(this.f13625a, c1138x0.f13625a) && AbstractC3557B.K(this.f13626b, c1138x0.f13626b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f13625a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        C1136w0 c1136w0 = this.f13626b;
        if (c1136w0 != null) {
            i11 = c1136w0.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "FromServer(type=" + this.f13625a + ", body=" + this.f13626b + Separators.RPAREN;
    }
}
