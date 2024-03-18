package fa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.Y;

@AbstractC1998i
/* renamed from: fa.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2976e extends AbstractC2965B {
    public static final C2975d Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Y f30060b;

    public C2976e(int i10, Y y10) {
        if (1 == (i10 & 1)) {
            this.f30060b = y10;
        } else {
            R4.b.e2(i10, 1, C2974c.f30059b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2976e) && AbstractC3557B.K(this.f30060b, ((C2976e) obj).f30060b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30060b.hashCode();
    }

    public final String toString() {
        return "Image(content=" + this.f30060b + Separators.RPAREN;
    }

    public C2976e(Y y10) {
        AbstractC3557B.c0("content", y10);
        this.f30060b = y10;
    }
}
