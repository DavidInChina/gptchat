package Bh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import yh.l1;

/* renamed from: Bh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0245g implements AbstractC0243f {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f2326a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2327b;

    public C0245g(l1 l1Var, ArrayList arrayList) {
        this.f2326a = l1Var;
        this.f2327b = arrayList;
    }

    public final T0 a(vh.g gVar) {
        Iterator it = this.f2327b.iterator();
        if (!it.hasNext()) {
            return new S0(gVar);
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0245g.class != obj.getClass()) {
            return false;
        }
        C0245g c0245g = (C0245g) obj;
        if (this.f2326a.equals(c0245g.f2326a) && this.f2327b.equals(c0245g.f2327b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2327b.hashCode() + AbstractC4194d.t(this.f2326a, C0245g.class.hashCode() * 31, 31);
    }
}
