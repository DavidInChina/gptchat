package Rc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f15384c = {new C2695d(g.f15394a, 0), new C2695d(j.f15405a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f15385a;

    /* renamed from: b  reason: collision with root package name */
    public final List f15386b;

    public c(int i10, List list, List list2) {
        if (3 == (i10 & 3)) {
            this.f15385a = list;
            this.f15386b = list2;
            return;
        }
        R4.b.e2(i10, 3, a.f15383b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f15385a, cVar.f15385a) && AbstractC3557B.K(this.f15386b, cVar.f15386b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15386b.hashCode() + (this.f15385a.hashCode() * 31);
    }

    public final String toString() {
        return "ModelsResponse(categories=" + this.f15385a + ", models=" + this.f15386b + Separators.RPAREN;
    }
}
