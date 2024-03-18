package Dd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Dd.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0398t extends AbstractC0392m {
    public static final C0397s Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f3572c = {N.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final N f3573a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f3574b;

    public C0398t(int i10, N n10, Double d10) {
        if (1 == (i10 & 1)) {
            this.f3573a = n10;
            if ((i10 & 2) == 0) {
                this.f3574b = null;
                return;
            } else {
                this.f3574b = d10;
                return;
            }
        }
        R4.b.e2(i10, 1, r.f3571b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0398t)) {
            return false;
        }
        C0398t c0398t = (C0398t) obj;
        if (this.f3573a == c0398t.f3573a && AbstractC3557B.K(this.f3574b, c0398t.f3574b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3573a.hashCode() * 31;
        Double d10 = this.f3574b;
        if (d10 == null) {
            i10 = 0;
        } else {
            i10 = d10.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "StateUpdate(newState=" + this.f3573a + ", delayS=" + this.f3574b + Separators.RPAREN;
    }

    public C0398t(N n10, Double d10) {
        this.f3573a = n10;
        this.f3574b = d10;
    }
}
