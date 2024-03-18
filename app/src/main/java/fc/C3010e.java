package fc;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: fc.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3010e implements AbstractC3022q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30208a;

    public C3010e(boolean z10) {
        this.f30208a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3010e) && this.f30208a == ((C3010e) obj).f30208a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f30208a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("NoNewChatTitle(disable="), this.f30208a, Separators.RPAREN);
    }
}
