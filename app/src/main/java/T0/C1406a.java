package T0;

import N0.C1046e;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* renamed from: T0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406a implements AbstractC1414i {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f16759a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16760b;

    public C1406a(C1046e c1046e, int i10) {
        this.f16759a = c1046e;
        this.f16760b = i10;
    }

    @Override // T0.AbstractC1414i
    public final void a(k kVar) {
        boolean z10;
        int i10;
        int i11 = kVar.f16794d;
        int i12 = -1;
        if (i11 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1046e c1046e = this.f16759a;
        if (z10) {
            kVar.d(i11, kVar.f16795e, c1046e.f12512Y);
        } else {
            kVar.d(kVar.f16792b, kVar.f16793c, c1046e.f12512Y);
        }
        int i13 = kVar.f16792b;
        int i14 = kVar.f16793c;
        if (i13 == i14) {
            i12 = i14;
        }
        int i15 = this.f16760b;
        if (i15 > 0) {
            i10 = (i12 + i15) - 1;
        } else {
            i10 = (i12 + i15) - c1046e.f12512Y.length();
        }
        int p10 = N.p(i10, 0, kVar.f16791a.a());
        kVar.f(p10, p10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406a)) {
            return false;
        }
        C1406a c1406a = (C1406a) obj;
        if (AbstractC3557B.K(this.f16759a.f12512Y, c1406a.f16759a.f12512Y) && this.f16760b == c1406a.f16760b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16759a.f12512Y.hashCode() * 31) + this.f16760b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f16759a.f12512Y);
        sb2.append("', newCursorPosition=");
        return AbstractC2469q0.j(sb2, this.f16760b, ')');
    }

    public C1406a(String str, int i10) {
        this(new C1046e(str, null, 6), i10);
    }
}
