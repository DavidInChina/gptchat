package Dd;

import O9.C1120o;
import O9.C1122p;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Dd.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0396q extends AbstractC0392m {
    public static final C0395p Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f3567c = {H.Companion.serializer(), null};

    /* renamed from: a  reason: collision with root package name */
    public final H f3568a;

    /* renamed from: b  reason: collision with root package name */
    public final C1122p f3569b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Dd.p, java.lang.Object] */
    static {
        C1120o c1120o = C1122p.Companion;
    }

    public C0396q(int i10, H h10, C1122p c1122p) {
        if (1 == (i10 & 1)) {
            this.f3568a = h10;
            if ((i10 & 2) == 0) {
                this.f3569b = null;
                return;
            } else {
                this.f3569b = c1122p;
                return;
            }
        }
        R4.b.e2(i10, 1, C0394o.f3566b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0396q)) {
            return false;
        }
        C0396q c0396q = (C0396q) obj;
        if (this.f3568a == c0396q.f3568a && AbstractC3557B.K(this.f3569b, c0396q.f3569b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3568a.hashCode() * 31;
        C1122p c1122p = this.f3569b;
        if (c1122p == null) {
            i10 = 0;
        } else {
            i10 = c1122p.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "RelayMessage(type=" + this.f3568a + ", message=" + this.f3569b + Separators.RPAREN;
    }

    public C0396q(C1122p c1122p) {
        this.f3568a = H.f3516k0;
        this.f3569b = c1122p;
    }
}
