package yh;

import java.util.List;
import yh.l1;

/* loaded from: classes.dex */
public final class w1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final List f51101Z;

    /* renamed from: h0  reason: collision with root package name */
    public final k1 f51102h0;

    public w1(List list, k1 k1Var) {
        super(0);
        this.f51101Z = list;
        this.f51102h0 = k1Var;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        l1.a aVar = (l1.a) this.f51101Z.get(i10);
        return new C6619j0(aVar, this.f51102h0, aVar);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51101Z.size();
    }
}
