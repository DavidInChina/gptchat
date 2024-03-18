package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class I implements AbstractC0905k {
    public static final H Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10880a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10881b;

    public I(int i10, String str, String str2) {
        if (3 == (i10 & 3)) {
            this.f10880a = str;
            this.f10881b = str2;
            return;
        }
        R4.b.e2(i10, 3, G.f10879b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        if (AbstractC3557B.K(this.f10880a, i10.f10880a) && AbstractC3557B.K(this.f10881b, i10.f10881b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10881b.hashCode() + (this.f10880a.hashCode() * 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.s("ConversationStreamTitleResponse(conversationId=", C6168C.a(this.f10880a), ", title="), this.f10881b, Separators.RPAREN);
    }
}
