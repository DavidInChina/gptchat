package fa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class q extends AbstractC2965B {
    public static final p Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f30074d;

    /* renamed from: b  reason: collision with root package name */
    public final List f30075b;

    /* renamed from: c  reason: collision with root package name */
    public final List f30076c;

    /* JADX WARN: Type inference failed for: r1v0, types: [fa.p, java.lang.Object] */
    static {
        C2973b c2973b = AbstractC2965B.Companion;
        f30074d = new KSerializer[]{new C2695d(c2973b.serializer(), 0), new C2695d(c2973b.serializer(), 0)};
    }

    public q(int i10, List list, List list2) {
        if (1 == (i10 & 1)) {
            this.f30075b = list;
            if ((i10 & 2) == 0) {
                this.f30076c = K8.d.n0(list);
                return;
            } else {
                this.f30076c = list2;
                return;
            }
        }
        R4.b.e2(i10, 1, o.f30073b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && AbstractC3557B.K(this.f30075b, ((q) obj).f30075b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30075b.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("Multimodal(parts="), this.f30075b, Separators.RPAREN);
    }

    public q(List list) {
        this.f30075b = list;
        this.f30076c = K8.d.n0(list);
    }
}
