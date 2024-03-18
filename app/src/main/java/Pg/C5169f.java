package pg;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kg.C4290b;

/* renamed from: pg.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5169f {

    /* renamed from: a  reason: collision with root package name */
    public final C4290b f43142a;

    /* renamed from: b  reason: collision with root package name */
    public final int f43143b;

    public C5169f(C4290b c4290b, int i10) {
        this.f43142a = c4290b;
        this.f43143b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5169f)) {
            return false;
        }
        C5169f c5169f = (C5169f) obj;
        if (AbstractC3557B.K(this.f43142a, c5169f.f43142a) && this.f43143b == c5169f.f43143b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f43142a.hashCode() * 31) + this.f43143b;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f43143b;
            if (i11 >= i10) {
                break;
            }
            sb2.append("kotlin/Array<");
            i11++;
        }
        sb2.append(this.f43142a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Separators.GREATER_THAN);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }
}
