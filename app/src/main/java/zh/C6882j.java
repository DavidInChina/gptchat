package zh;

import Bh.AbstractC0263p;
import Bh.T;
import Bh.W;
import Bh.Z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zh.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6882j extends AbstractC6888p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6883k f52129d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6882j(C6883k c6883k, Z z10) {
        super(z10, r0);
        Fh.A a5 = Fh.A.f5373Y;
        this.f52129d = c6883k;
    }

    @Override // zh.AbstractC6888p
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C6882j.class != obj.getClass()) {
            return false;
        }
        if (!this.f52129d.equals(((C6882j) obj).f52129d)) {
            return false;
        }
        return true;
    }

    @Override // zh.AbstractC6885m
    public final AbstractC6869C h() {
        List list;
        C6883k c6883k = this.f52129d;
        AbstractC6884l abstractC6884l = c6883k.f52131g;
        AbstractC0263p abstractC0263p = abstractC6884l.f52132a;
        W w10 = abstractC6884l.f52134c;
        w10.getClass();
        T t10 = new T(c6883k.f52130f, this.f52149a, this.f52150b, this.f52151c);
        List list2 = w10.f2297a;
        if (list2.isEmpty()) {
            list = Collections.singletonList(t10);
        } else {
            ArrayList arrayList = new ArrayList(list2.size() + 1);
            arrayList.add(t10);
            arrayList.addAll(list2);
            list = arrayList;
        }
        W w11 = new W(list);
        AbstractC6884l abstractC6884l2 = c6883k.f52131g;
        return abstractC6884l.i(abstractC0263p, abstractC6884l.f52133b, w11, abstractC6884l2.f52135d, abstractC6884l2.f52136e, abstractC6884l2.f52137f, abstractC6884l2.f52138g, abstractC6884l2.f52139h, abstractC6884l2.f52140i, abstractC6884l2.f52141j, abstractC6884l2.f52142k, abstractC6884l2.f52143l, abstractC6884l2.f52144m, abstractC6884l2.f52145n, abstractC6884l2.f52146o, abstractC6884l2.f52147p, abstractC6884l2.f52148q);
    }

    @Override // zh.AbstractC6888p
    public final int hashCode() {
        return this.f52129d.hashCode() + (super.hashCode() * 31);
    }
}
