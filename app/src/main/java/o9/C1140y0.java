package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: O9.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1140y0 {
    public static final T Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final C1138x0 f13647a;

    /* renamed from: b  reason: collision with root package name */
    public final C1097c0 f13648b;

    public C1140y0(int i10, C1138x0 c1138x0, C1097c0 c1097c0) {
        if ((i10 & 1) == 0) {
            this.f13647a = null;
        } else {
            this.f13647a = c1138x0;
        }
        if ((i10 & 2) == 0) {
            this.f13648b = null;
        } else {
            this.f13648b = c1097c0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1140y0)) {
            return false;
        }
        C1140y0 c1140y0 = (C1140y0) obj;
        if (AbstractC3557B.K(this.f13647a, c1140y0.f13647a) && AbstractC3557B.K(this.f13648b, c1140y0.f13648b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        C1138x0 c1138x0 = this.f13647a;
        if (c1138x0 == null) {
            i10 = 0;
        } else {
            i10 = c1138x0.hashCode();
        }
        int i12 = i10 * 31;
        C1097c0 c1097c0 = this.f13648b;
        if (c1097c0 != null) {
            i11 = c1097c0.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ApiJitPluginData(fromServer=" + this.f13647a + ", fromClient=" + this.f13648b + Separators.RPAREN;
    }

    public C1140y0(C1097c0 c1097c0) {
        this.f13647a = null;
        this.f13648b = c1097c0;
    }
}
