package x5;

import E9.f;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f48903a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48904b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48905c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f48906d;

    public c(String str, String str2, boolean z10, String str3) {
        this.f48903a = str;
        this.f48904b = str2;
        this.f48905c = str3;
        this.f48906d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f48903a, cVar.f48903a) && AbstractC3557B.K(this.f48904b, cVar.f48904b) && AbstractC3557B.K(this.f48905c, cVar.f48905c) && this.f48906d == cVar.f48906d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = f.v(this.f48905c, f.v(this.f48904b, this.f48903a.hashCode() * 31, 31), 31);
        boolean z10 = this.f48906d;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThreadDump(name=");
        sb2.append(this.f48903a);
        sb2.append(", state=");
        sb2.append(this.f48904b);
        sb2.append(", stack=");
        sb2.append(this.f48905c);
        sb2.append(", crashed=");
        return AbstractC4194d.w(sb2, this.f48906d, Separators.RPAREN);
    }
}
