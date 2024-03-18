package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: ha.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3374q extends AbstractC3376t {
    public static final C3373p Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f32075c = {new C2695d(C3361d.f32059a, 0)};

    /* renamed from: b  reason: collision with root package name */
    public final List f32076b;

    public C3374q(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f32076b = list;
        } else {
            R4.b.e2(i10, 1, C3372o.f32074b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3374q) && AbstractC3557B.K(this.f32076b, ((C3374q) obj).f32076b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32076b.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("CitationListMetadata(citations="), this.f32076b, Separators.RPAREN);
    }

    public C3374q(ArrayList arrayList) {
        this.f32076b = arrayList;
    }
}
