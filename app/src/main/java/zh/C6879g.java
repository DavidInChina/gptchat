package zh;

import Bh.AbstractC0263p;
import Bh.C0247h;
import Bh.T;
import Bh.W;
import Bh.Z;
import Qh.C1241t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wh.C6247l;

/* renamed from: zh.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6879g extends AbstractC6888p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6881i f52124d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6879g(C6881i c6881i, Z z10) {
        super(z10, r0);
        Fh.y yVar = Fh.z.f5405Y;
        this.f52124d = c6881i;
    }

    @Override // zh.AbstractC6888p
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C6879g.class != obj.getClass()) {
            return false;
        }
        if (!this.f52124d.equals(((C6879g) obj).f52124d)) {
            return false;
        }
        return true;
    }

    @Override // zh.AbstractC6885m
    public final AbstractC6869C h() {
        List list;
        C6881i c6881i = this.f52124d;
        AbstractC6884l abstractC6884l = c6881i.f52128g;
        AbstractC0263p abstractC0263p = abstractC6884l.f52132a;
        C6247l c6247l = c6881i.f52127f;
        AbstractC0263p n10 = abstractC0263p.n(c6247l);
        AbstractC6884l abstractC6884l2 = c6881i.f52128g;
        C0247h c0247h = abstractC6884l2.f52133b;
        C1241t c1241t = new C1241t(c6247l);
        W w10 = abstractC6884l2.f52134c;
        w10.getClass();
        T t10 = new T(c1241t, this.f52149a, this.f52150b, this.f52151c);
        List list2 = w10.f2297a;
        if (list2.isEmpty()) {
            list = Collections.singletonList(t10);
        } else {
            ArrayList arrayList = new ArrayList(list2.size() + 1);
            arrayList.add(t10);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return abstractC6884l.i(n10, c0247h, new W(list), abstractC6884l2.f52135d, abstractC6884l2.f52136e, abstractC6884l2.f52137f, abstractC6884l2.f52138g, abstractC6884l2.f52139h, abstractC6884l2.f52140i, abstractC6884l2.f52141j, abstractC6884l2.f52142k, abstractC6884l2.f52143l, abstractC6884l2.f52144m, abstractC6884l2.f52145n, abstractC6884l2.f52146o, abstractC6884l2.f52147p, abstractC6884l2.f52148q);
    }

    @Override // zh.AbstractC6888p
    public final int hashCode() {
        return this.f52124d.hashCode() + (super.hashCode() * 31);
    }
}
