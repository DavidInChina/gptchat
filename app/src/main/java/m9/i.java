package M9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import wd.C6168C;

@AbstractC1998i
/* loaded from: classes.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f11738f = {null, null, null, c.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f11739a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11740b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11741c;

    /* renamed from: d  reason: collision with root package name */
    public final c f11742d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11743e;

    public i(int i10, String str, String str2, String str3, c cVar, String str4) {
        if (31 == (i10 & 31)) {
            this.f11739a = str;
            this.f11740b = str2;
            this.f11741c = str3;
            this.f11742d = cVar;
            this.f11743e = str4;
            return;
        }
        R4.b.e2(i10, 31, g.f11737b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f11739a, iVar.f11739a) && AbstractC3557B.K(this.f11740b, iVar.f11740b) && AbstractC3557B.K(this.f11741c, iVar.f11741c) && this.f11742d == iVar.f11742d && AbstractC3557B.K(this.f11743e, iVar.f11743e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f11741c, E9.f.v(this.f11740b, this.f11739a.hashCode() * 31, 31), 31);
        return this.f11743e.hashCode() + ((this.f11742d.hashCode() + v10) * 31);
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("MessageFeedbackResponse(conversationId=", C6168C.a(this.f11739a), ", id=");
        s10.append(this.f11740b);
        s10.append(", userId=");
        s10.append(this.f11741c);
        s10.append(", rating=");
        s10.append(this.f11742d);
        s10.append(", content=");
        return R.a.t(s10, this.f11743e, Separators.RPAREN);
    }
}
