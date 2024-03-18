package G9;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import wd.C6168C;

/* loaded from: classes2.dex */
public final class q implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f6154a;

    /* renamed from: b  reason: collision with root package name */
    public final Sc.n f6155b;

    /* renamed from: c  reason: collision with root package name */
    public final C2334C f6156c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6157d;

    /* renamed from: e  reason: collision with root package name */
    public final Ba.c f6158e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6159f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6160g;

    public q(String str, Sc.n nVar, C2334C c2334c, boolean z10, Ba.c cVar, boolean z11, boolean z12) {
        AbstractC3557B.c0("conversationId", str);
        this.f6154a = str;
        this.f6155b = nVar;
        this.f6156c = c2334c;
        this.f6157d = z10;
        this.f6158e = cVar;
        this.f6159f = z11;
        this.f6160g = z12;
    }

    public static q e(q qVar, Sc.n nVar, C2334C c2334c, boolean z10, Ba.c cVar, boolean z11, int i10) {
        String str = qVar.f6154a;
        if ((i10 & 2) != 0) {
            nVar = qVar.f6155b;
        }
        Sc.n nVar2 = nVar;
        if ((i10 & 4) != 0) {
            c2334c = qVar.f6156c;
        }
        C2334C c2334c2 = c2334c;
        if ((i10 & 8) != 0) {
            z10 = qVar.f6157d;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            cVar = qVar.f6158e;
        }
        Ba.c cVar2 = cVar;
        if ((i10 & 32) != 0) {
            z11 = qVar.f6159f;
        }
        boolean z13 = qVar.f6160g;
        qVar.getClass();
        AbstractC3557B.c0("conversationId", str);
        return new q(str, nVar2, c2334c2, z12, cVar2, z11, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3557B.K(this.f6154a, qVar.f6154a) && AbstractC3557B.K(this.f6155b, qVar.f6155b) && AbstractC3557B.K(this.f6156c, qVar.f6156c) && this.f6157d == qVar.f6157d && AbstractC3557B.K(this.f6158e, qVar.f6158e) && this.f6159f == qVar.f6159f && this.f6160g == qVar.f6160g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = this.f6154a.hashCode() * 31;
        int i14 = 0;
        Sc.n nVar = this.f6155b;
        if (nVar == null) {
            i10 = 0;
        } else {
            i10 = nVar.hashCode();
        }
        int i15 = (hashCode + i10) * 31;
        C2334C c2334c = this.f6156c;
        if (c2334c == null) {
            i11 = 0;
        } else {
            i11 = c2334c.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        int i17 = 1237;
        if (this.f6157d) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i18 = (i16 + i12) * 31;
        Ba.c cVar = this.f6158e;
        if (cVar != null) {
            i14 = cVar.hashCode();
        }
        int i19 = (i18 + i14) * 31;
        if (this.f6159f) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i20 = (i19 + i13) * 31;
        if (this.f6160g) {
            i17 = 1231;
        }
        return i20 + i17;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("ConversationDetailsState(conversationId=", C6168C.a(this.f6154a), ", model=");
        s10.append(this.f6155b);
        s10.append(", gizmo=");
        s10.append(this.f6156c);
        s10.append(", isNewConversation=");
        s10.append(this.f6157d);
        s10.append(", customInstructions=");
        s10.append(this.f6158e);
        s10.append(", showReportContentDialog=");
        s10.append(this.f6159f);
        s10.append(", conversationsAreReportable=");
        return AbstractC4194d.w(s10, this.f6160g, Separators.RPAREN);
    }
}
