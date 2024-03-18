package Rh;

import java.util.List;

/* loaded from: classes2.dex */
public final class Q0 extends yh.o1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15699Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f15700h0;

    public Q0(p1 p1Var, List list) {
        super(0);
        this.f15699Z = p1Var;
        this.f15700h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Y0.k1(this.f15699Z, (String) this.f15700h0.get(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15700h0.size();
    }

    @Override // yh.H1
    public final String[] z0() {
        List<String> list = this.f15700h0;
        int size = list.size();
        String[] strArr = new String[size];
        int i10 = 0;
        for (String str : list) {
            strArr[i10] = Nh.r.u(str).j();
            i10++;
        }
        if (size == 0) {
            return null;
        }
        return strArr;
    }
}
