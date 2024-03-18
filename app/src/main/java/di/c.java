package Di;

import Ci.d;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f3731a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3732b;

    public c(int i10, int i11) {
        this.f3731a = i10;
        this.f3732b = i11;
    }

    @Override // Ci.d
    public final int getBeginIndex() {
        return this.f3731a;
    }

    @Override // Ci.d
    public final int getEndIndex() {
        return this.f3732b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Span{beginIndex=");
        sb2.append(this.f3731a);
        sb2.append(", endIndex=");
        return android.gov.nist.core.a.l(sb2, this.f3732b, "}");
    }
}
