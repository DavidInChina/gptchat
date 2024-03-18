package S0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: S0.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1343d implements H {

    /* renamed from: a  reason: collision with root package name */
    public final int f16005a;

    public C1343d(int i10) {
        this.f16005a = i10;
    }

    @Override // S0.H
    public final D b(D d10) {
        int i10 = this.f16005a;
        if (i10 != 0 && i10 != Integer.MAX_VALUE) {
            return new D(com.google.android.gms.internal.play_billing.N.p(d10.f15975Y + i10, 1, 1000));
        }
        return d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1343d) && this.f16005a == ((C1343d) obj).f16005a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16005a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f16005a, ')');
    }

    @Override // S0.H
    public final int a(int i10) {
        return i10;
    }

    @Override // S0.H
    public final int c(int i10) {
        return i10;
    }

    @Override // S0.H
    public final s d(s sVar) {
        return sVar;
    }
}
