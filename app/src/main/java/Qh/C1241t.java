package Qh;

import Bh.AbstractC0265q;
import java.util.ArrayList;
import java.util.List;
import wh.C6246k;
import wh.C6247l;
import wh.C6261z;
import yh.T0;
import yh.l1;

/* renamed from: Qh.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1241t implements AbstractC1243v {

    /* renamed from: a  reason: collision with root package name */
    public final C6247l f15003a;

    public C1241t(C6247l c6247l) {
        this.f15003a = c6247l;
    }

    @Override // Qh.AbstractC1243v
    public final AbstractC1234l a(AbstractC0265q abstractC0265q) {
        C6247l c6247l = this.f15003a;
        T0 t02 = new T0(abstractC0265q, c6247l.f48552c);
        List<C6261z> list = c6247l.f48554e;
        ArrayList arrayList = new ArrayList(list.size());
        for (C6261z c6261z : list) {
            arrayList.add(c6261z.f48584a.k(t02));
        }
        return new C1240s(new C6246k(c6247l.f48550a, (l1) c6247l.f48553d.k(t02), arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1241t.class != obj.getClass()) {
            return false;
        }
        if (this.f15003a.equals(((C1241t) obj).f15003a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15003a.hashCode() + (C1241t.class.hashCode() * 31);
    }
}
