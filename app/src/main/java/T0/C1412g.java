package T0;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: T0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1412g implements AbstractC1414i {

    /* renamed from: a  reason: collision with root package name */
    public final int f16785a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16786b;

    public C1412g(int i10, int i11) {
        this.f16785a = i10;
        this.f16786b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(AbstractC0044t0.y("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
    }

    @Override // T0.AbstractC1414i
    public final void a(k kVar) {
        int i10 = kVar.f16793c;
        int i11 = this.f16786b;
        int i12 = i10 + i11;
        int i13 = (i10 ^ i12) & (i11 ^ i12);
        t tVar = kVar.f16791a;
        if (i13 < 0) {
            i12 = tVar.a();
        }
        kVar.a(kVar.f16793c, Math.min(i12, tVar.a()));
        int i14 = kVar.f16792b;
        int i15 = this.f16785a;
        int i16 = i14 - i15;
        if (((i14 ^ i16) & (i15 ^ i14)) < 0) {
            i16 = 0;
        }
        kVar.a(Math.max(0, i16), kVar.f16792b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1412g)) {
            return false;
        }
        C1412g c1412g = (C1412g) obj;
        if (this.f16785a == c1412g.f16785a && this.f16786b == c1412g.f16786b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16785a * 31) + this.f16786b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f16785a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC2469q0.j(sb2, this.f16786b, ')');
    }
}
