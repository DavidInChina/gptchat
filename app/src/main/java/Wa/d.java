package Wa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes.dex */
public final class d {
    public static final c Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f20841a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20842b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20843c;

    public d(int i10, String str, String str2, boolean z10) {
        if (7 == (i10 & 7)) {
            this.f20841a = str;
            this.f20842b = str2;
            this.f20843c = z10;
            return;
        }
        R4.b.e2(i10, 7, b.f20840b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f20841a, dVar.f20841a) && AbstractC3557B.K(this.f20842b, dVar.f20842b) && this.f20843c == dVar.f20843c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f20842b, this.f20841a.hashCode() * 31, 31);
        if (this.f20843c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GizmoActionOperation(id=");
        sb2.append(this.f20841a);
        sb2.append(", description=");
        sb2.append(this.f20842b);
        sb2.append(", isConsequential=");
        return AbstractC4194d.w(sb2, this.f20843c, Separators.RPAREN);
    }
}
