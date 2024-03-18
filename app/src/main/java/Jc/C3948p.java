package jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: jc.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3948p {
    public static final C3947o Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f36118b = {new C2695d(C3940h.f36109a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f36119a;

    public C3948p(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f36119a = list;
        } else {
            R4.b.e2(i10, 1, C3946n.f36117b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3948p) && AbstractC3557B.K(this.f36119a, ((C3948p) obj).f36119a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36119a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("MemoryResponse(memories="), this.f36119a, Separators.RPAREN);
    }
}
