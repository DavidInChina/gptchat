package h1;

import android.gov.nist.core.Separators;

/* renamed from: h1.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3300g implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public C3302i f31723Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3301h f31724Z;

    public C3300g(C3301h c3301h) {
        this.f31724Z = c3301h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f31723Y.f31730b - ((C3302i) obj).f31730b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f31723Y != null) {
            for (int i10 = 0; i10 < 9; i10++) {
                StringBuilder p10 = android.gov.nist.core.a.p(str);
                p10.append(this.f31723Y.f31736h[i10]);
                p10.append(Separators.SP);
                str = p10.toString();
            }
        }
        StringBuilder r10 = android.gov.nist.core.a.r(str, "] ");
        r10.append(this.f31723Y);
        return r10.toString();
    }
}
