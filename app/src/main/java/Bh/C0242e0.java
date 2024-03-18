package Bh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import yh.AbstractC6612h;
import yh.l1;

/* renamed from: Bh.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0242e0 implements AbstractC0240d0 {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f2323a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2324b;

    public C0242e0(l1 l1Var, ArrayList arrayList) {
        this.f2323a = l1Var;
        this.f2324b = arrayList;
    }

    public final e1 a(AbstractC6612h abstractC6612h) {
        Iterator it = this.f2324b.iterator();
        if (!it.hasNext()) {
            return new d1(abstractC6612h);
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0242e0.class != obj.getClass()) {
            return false;
        }
        C0242e0 c0242e0 = (C0242e0) obj;
        if (this.f2323a.equals(c0242e0.f2323a) && this.f2324b.equals(c0242e0.f2324b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2324b.hashCode() + AbstractC4194d.t(this.f2323a, C0242e0.class.hashCode() * 31, 31);
    }
}
