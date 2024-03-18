package I9;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: I9.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765k implements AbstractC0775p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8405a;

    public C0765k(boolean z10) {
        this.f8405a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0765k) && this.f8405a == ((C0765k) obj).f8405a) {
            return true;
        }
        return false;
    }

    @Override // I9.AbstractC0775p
    public final String getId() {
        return "DefaultGizmoItem";
    }

    public final int hashCode() {
        if (this.f8405a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("DefaultGizmoItem(isSelected="), this.f8405a, Separators.RPAREN);
    }
}
