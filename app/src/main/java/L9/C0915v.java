package L9;

import O9.C1122p;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;

@AbstractC1998i
/* renamed from: L9.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0915v implements AbstractC0905k {
    public static final C0914u Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10951a;

    /* renamed from: b  reason: collision with root package name */
    public final C1122p f10952b;

    public C0915v(int i10, String str, C1122p c1122p) {
        if (3 == (i10 & 3)) {
            this.f10951a = str;
            this.f10952b = c1122p;
            return;
        }
        R4.b.e2(i10, 3, C0913t.f10950b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0915v)) {
            return false;
        }
        C0915v c0915v = (C0915v) obj;
        if (AbstractC3557B.K(this.f10951a, c0915v.f10951a) && AbstractC3557B.K(this.f10952b, c0915v.f10952b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10952b.hashCode() + (this.f10951a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = C6168C.a(this.f10951a);
        return "ConversationStreamMessageResponse(conversationId=" + a5 + ", message=" + this.f10952b + Separators.RPAREN;
    }
}
