package c6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f26306a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26307b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26308c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26309d;

    public h(String str, String str2, boolean z10, String str3) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("stack", str2);
        this.f26306a = str;
        this.f26307b = z10;
        this.f26308c = str2;
        this.f26309d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f26306a, hVar.f26306a) && this.f26307b == hVar.f26307b && AbstractC3557B.K(this.f26308c, hVar.f26308c) && AbstractC3557B.K(this.f26309d, hVar.f26309d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f26306a.hashCode() * 31;
        boolean z10 = this.f26307b;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int v10 = E9.f.v(this.f26308c, (hashCode + i11) * 31, 31);
        String str = this.f26309d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread(name=");
        sb2.append(this.f26306a);
        sb2.append(", crashed=");
        sb2.append(this.f26307b);
        sb2.append(", stack=");
        sb2.append(this.f26308c);
        sb2.append(", state=");
        return R.a.t(sb2, this.f26309d, Separators.RPAREN);
    }
}
