package P9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import wd.C6182c0;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13883a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13884b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13885c;

    public f(int i10, String str, boolean z10, boolean z11) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, d.f13882b);
            throw null;
        }
        this.f13883a = str;
        this.f13884b = z10;
        this.f13885c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f13883a, fVar.f13883a) && this.f13884b == fVar.f13884b && this.f13885c == fVar.f13885c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f13883a.hashCode() * 31;
        int i11 = 1237;
        if (this.f13884b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (hashCode + i10) * 31;
        if (this.f13885c) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("ModerationResult(messageId=", C6182c0.a(this.f13883a), ", flagged=");
        s10.append(this.f13884b);
        s10.append(", blocked=");
        return AbstractC4194d.w(s10, this.f13885c, Separators.RPAREN);
    }

    public f(String str, boolean z10, boolean z11) {
        AbstractC3557B.c0("messageId", str);
        this.f13883a = str;
        this.f13884b = z10;
        this.f13885c = z11;
    }
}
