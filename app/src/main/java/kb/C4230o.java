package kb;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: kb.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4230o implements AbstractC4232q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f37263a;

    public C4230o(boolean z10) {
        this.f37263a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4230o) && this.f37263a == ((C4230o) obj).f37263a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f37263a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("PaintModeEnable(isInPaintMode="), this.f37263a, Separators.RPAREN);
    }
}
