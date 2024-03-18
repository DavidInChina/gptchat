package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: L9.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0912s implements AbstractC0905k {
    public static final r Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10948a;

    public C0912s(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f10948a = str;
        } else {
            R4.b.e2(i10, 1, C0911q.f10947b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0912s)) {
            return false;
        }
        if (AbstractC3557B.K(this.f10948a, ((C0912s) obj).f10948a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10948a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("ConversationStreamGizmoRatingResponse(gizmoId=", wd.O.a(this.f10948a), Separators.RPAREN);
    }
}
