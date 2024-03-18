package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;

/* loaded from: classes2.dex */
public final class i0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31461a;

    /* renamed from: b  reason: collision with root package name */
    public final wd.L f31462b;

    public i0(String str, wd.L l10) {
        AbstractC3557B.c0("conversationId", str);
        AbstractC3557B.c0("assetPointer", l10);
        this.f31461a = str;
        this.f31462b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (AbstractC3557B.K(this.f31461a, i0Var.f31461a) && AbstractC3557B.K(this.f31462b, i0Var.f31462b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31462b.hashCode() + (this.f31461a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = C6168C.a(this.f31461a);
        return "ViewCsvAttachment(conversationId=" + a5 + ", assetPointer=" + this.f31462b + Separators.RPAREN;
    }
}
