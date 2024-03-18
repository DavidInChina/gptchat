package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: L9.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0918y implements AbstractC0905k {
    public static final C0917x Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10956b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10957c;

    /* renamed from: d  reason: collision with root package name */
    public final P9.c f10958d;

    public C0918y(int i10, String str, String str2, boolean z10, P9.c cVar) {
        if (15 == (i10 & 15)) {
            this.f10955a = str;
            this.f10956b = str2;
            this.f10957c = z10;
            this.f10958d = cVar;
            return;
        }
        R4.b.e2(i10, 15, C0916w.f10954b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0918y)) {
            return false;
        }
        C0918y c0918y = (C0918y) obj;
        if (AbstractC3557B.K(this.f10955a, c0918y.f10955a) && AbstractC3557B.K(this.f10956b, c0918y.f10956b) && this.f10957c == c0918y.f10957c && AbstractC3557B.K(this.f10958d, c0918y.f10958d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f10956b, this.f10955a.hashCode() * 31, 31);
        if (this.f10957c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f10958d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder t10 = android.gov.nist.core.a.t("ConversationStreamModerationResponse(conversationId=", C6168C.a(this.f10955a), ", messageId=", C6182c0.a(this.f10956b), ", isCompletion=");
        t10.append(this.f10957c);
        t10.append(", moderationResponse=");
        t10.append(this.f10958d);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }
}
