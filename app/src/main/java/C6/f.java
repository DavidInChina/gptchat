package C6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f2717a;

    /* renamed from: b  reason: collision with root package name */
    public final R4.a f2718b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2719c;

    public f(String str, R4.a aVar, boolean z10) {
        AbstractC3557B.c0("eventMapper", aVar);
        this.f2717a = str;
        this.f2718b = aVar;
        this.f2719c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f2717a, fVar.f2717a) && AbstractC3557B.K(this.f2718b, fVar.f2718b) && this.f2719c == fVar.f2719c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f2717a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (this.f2718b.hashCode() + (i10 * 31)) * 31;
        boolean z10 = this.f2719c;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return hashCode + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TraceConfiguration(customEndpointUrl=");
        sb2.append(this.f2717a);
        sb2.append(", eventMapper=");
        sb2.append(this.f2718b);
        sb2.append(", networkInfoEnabled=");
        return AbstractC4194d.w(sb2, this.f2719c, Separators.RPAREN);
    }
}
