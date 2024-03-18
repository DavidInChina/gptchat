package ub;

import android.gov.nist.core.Separators;
import fa.AbstractC2965B;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f46572a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2965B f46573b;

    public n(boolean z10, AbstractC2965B abstractC2965B) {
        this.f46572a = z10;
        this.f46573b = abstractC2965B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f46572a == nVar.f46572a && AbstractC3557B.K(this.f46573b, nVar.f46573b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        if (this.f46572a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = i10 * 31;
        AbstractC2965B abstractC2965B = this.f46573b;
        if (abstractC2965B == null) {
            i11 = 0;
        } else {
            i11 = abstractC2965B.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "DelayedToolContent(showCursor=" + this.f46572a + ", content=" + this.f46573b + Separators.RPAREN;
    }
}
