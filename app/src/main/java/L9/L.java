package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class L {
    public static final K Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10884a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10885b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10886c;

    /* renamed from: d  reason: collision with root package name */
    public final Yg.p f10887d;

    public L(int i10, String str, String str2, String str3, Yg.p pVar) {
        if (15 == (i10 & 15)) {
            this.f10884a = str;
            this.f10885b = str2;
            this.f10886c = str3;
            this.f10887d = pVar;
            return;
        }
        R4.b.e2(i10, 15, J.f10883b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (AbstractC3557B.K(this.f10884a, l10.f10884a) && AbstractC3557B.K(this.f10885b, l10.f10885b) && AbstractC3557B.K(this.f10886c, l10.f10886c) && AbstractC3557B.K(this.f10887d, l10.f10887d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10887d.f22419Y.hashCode() + E9.f.v(this.f10886c, E9.f.v(this.f10885b, this.f10884a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("ConversationStreamWssResponse(conversationId=", C6168C.a(this.f10884a), ", wssUrl=");
        s10.append(this.f10885b);
        s10.append(", responseId=");
        s10.append(this.f10886c);
        s10.append(", expiresAt=");
        s10.append(this.f10887d);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
