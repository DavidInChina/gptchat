package Bh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import yh.l1;

/* renamed from: Bh.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0247h {

    /* renamed from: a  reason: collision with root package name */
    public final List f2331a = Collections.emptyList();

    public final C0245g a(l1 l1Var) {
        List list = this.f2331a;
        ArrayList arrayList = new ArrayList(list.size());
        new HashMap();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return new C0245g(l1Var, arrayList);
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0247h.class != obj.getClass()) {
            return false;
        }
        if (this.f2331a.equals(((C0247h) obj).f2331a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2331a.hashCode() + (C0247h.class.hashCode() * 31);
    }
}
