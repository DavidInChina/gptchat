package fa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import wd.P;

@AbstractC1998i
/* renamed from: fa.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2979h extends AbstractC2965B {
    public static final C2978g Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f30063c = {new C2695d(P.f48363a, 0)};

    /* renamed from: b  reason: collision with root package name */
    public final List f30064b;

    public C2979h(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f30064b = list;
        } else {
            R4.b.e2(i10, 1, C2977f.f30062b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2979h) && AbstractC3557B.K(this.f30064b, ((C2979h) obj).f30064b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30064b.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("ImageList(content="), this.f30064b, Separators.RPAREN);
    }

    public C2979h(List list) {
        this.f30064b = list;
    }
}
