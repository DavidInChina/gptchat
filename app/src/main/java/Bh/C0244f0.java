package Bh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import yh.l1;

/* renamed from: Bh.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0244f0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f2325a = Collections.emptyList();

    public final C0242e0 a(l1 l1Var) {
        List list = this.f2325a;
        ArrayList arrayList = new ArrayList(list.size());
        new HashMap();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return new C0242e0(l1Var, arrayList);
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0244f0.class != obj.getClass()) {
            return false;
        }
        if (this.f2325a.equals(((C0244f0) obj).f2325a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2325a.hashCode() + (C0244f0.class.hashCode() * 31);
    }
}
