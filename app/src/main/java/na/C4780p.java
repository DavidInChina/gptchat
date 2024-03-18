package na;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: na.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4780p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f40080a;

    /* renamed from: b  reason: collision with root package name */
    public final Ba.c f40081b;

    /* renamed from: c  reason: collision with root package name */
    public final Ba.c f40082c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f40083d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f40084e;

    public C4780p(boolean z10, Ba.c cVar, Ba.c cVar2, boolean z11, boolean z12) {
        this.f40080a = z10;
        this.f40081b = cVar;
        this.f40082c = cVar2;
        this.f40083d = z11;
        this.f40084e = z12;
    }

    public static C4780p a(C4780p c4780p, boolean z10, Ba.c cVar, Ba.c cVar2, boolean z11, boolean z12, int i10) {
        if ((i10 & 1) != 0) {
            z10 = c4780p.f40080a;
        }
        boolean z13 = z10;
        if ((i10 & 2) != 0) {
            cVar = c4780p.f40081b;
        }
        Ba.c cVar3 = cVar;
        if ((i10 & 4) != 0) {
            cVar2 = c4780p.f40082c;
        }
        Ba.c cVar4 = cVar2;
        if ((i10 & 8) != 0) {
            z11 = c4780p.f40083d;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            z12 = c4780p.f40084e;
        }
        c4780p.getClass();
        return new C4780p(z13, cVar3, cVar4, z14, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4780p)) {
            return false;
        }
        C4780p c4780p = (C4780p) obj;
        if (this.f40080a == c4780p.f40080a && AbstractC3557B.K(this.f40081b, c4780p.f40081b) && AbstractC3557B.K(this.f40082c, c4780p.f40082c) && this.f40083d == c4780p.f40083d && this.f40084e == c4780p.f40084e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 1237;
        if (this.f40080a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = i10 * 31;
        int i15 = 0;
        Ba.c cVar = this.f40081b;
        if (cVar == null) {
            i11 = 0;
        } else {
            i11 = cVar.hashCode();
        }
        int i16 = (i14 + i11) * 31;
        Ba.c cVar2 = this.f40082c;
        if (cVar2 != null) {
            i15 = cVar2.hashCode();
        }
        int i17 = (i16 + i15) * 31;
        if (this.f40083d) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i18 = (i17 + i12) * 31;
        if (this.f40084e) {
            i13 = 1231;
        }
        return i18 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationCustomInstructionsState(available=");
        sb2.append(this.f40080a);
        sb2.append(", settingsInstructions=");
        sb2.append(this.f40081b);
        sb2.append(", conversationInstructions=");
        sb2.append(this.f40082c);
        sb2.append(", equivalent=");
        sb2.append(this.f40083d);
        sb2.append(", outdatedNoticeDismissed=");
        return AbstractC4194d.w(sb2, this.f40084e, Separators.RPAREN);
    }
}
