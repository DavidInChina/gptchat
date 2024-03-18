package T0;

import N0.C1046e;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class x implements AbstractC1414i {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f16826a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16827b;

    public x(String str, int i10) {
        this.f16826a = new C1046e(str, null, 6);
        this.f16827b = i10;
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
        C1046e c1046e = this.f16826a;
        if (z10) {
            kVar.d(i11, kVar.f16795e, c1046e.f12512Y);
            String str = c1046e.f12512Y;
            if (str.length() > 0) {
                kVar.e(i11, str.length() + i11);
            }
        } else {
            int i13 = kVar.f16792b;
            kVar.d(i13, kVar.f16793c, c1046e.f12512Y);
            String str2 = c1046e.f12512Y;
            if (str2.length() > 0) {
                kVar.e(i13, str2.length() + i13);
            }
        }
        int i14 = kVar.f16792b;
        int i15 = kVar.f16793c;
        if (i14 == i15) {
            i12 = i15;
        }
        int i16 = this.f16827b;
        if (i16 > 0) {
            i10 = (i12 + i16) - 1;
        } else {
            i10 = (i12 + i16) - c1046e.f12512Y.length();
        }
        int p10 = N.p(i10, 0, kVar.f16791a.a());
        kVar.f(p10, p10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (AbstractC3557B.K(this.f16826a.f12512Y, xVar.f16826a.f12512Y) && this.f16827b == xVar.f16827b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16826a.f12512Y.hashCode() * 31) + this.f16827b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f16826a.f12512Y);
        sb2.append("', newCursorPosition=");
        return AbstractC2469q0.j(sb2, this.f16827b, ')');
    }
}
