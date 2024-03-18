package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;

@AbstractC1998i
/* renamed from: L9.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0910p implements AbstractC0905k {
    public static final C0909o Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10944a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10945b;

    public C0910p(int i10, String str, String str2) {
        if (3 == (i10 & 3)) {
            this.f10944a = str;
            this.f10945b = str2;
            return;
        }
        R4.b.e2(i10, 3, C0908n.f10943b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0910p)) {
            return false;
        }
        C0910p c0910p = (C0910p) obj;
        if (AbstractC3557B.K(this.f10944a, c0910p.f10944a) && AbstractC3557B.K(this.f10945b, c0910p.f10945b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10945b.hashCode() + (this.f10944a.hashCode() * 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.s("ConversationStreamErrorResponse(conversationId=", C6168C.a(this.f10944a), ", error="), this.f10945b, Separators.RPAREN);
    }
}
