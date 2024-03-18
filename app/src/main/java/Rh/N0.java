package Rh;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class N0 extends yh.o1 {

    /* renamed from: Z  reason: collision with root package name */
    public final yh.l1 f15675Z;

    /* renamed from: h0  reason: collision with root package name */
    public final p1 f15676h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f15677i0;

    public N0(ArrayList arrayList, yh.l1 l1Var, p1 p1Var) {
        super(0);
        this.f15675Z = l1Var;
        this.f15676h0 = p1Var;
        this.f15677i0 = arrayList;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 == 0) {
            return this.f15675Z;
        }
        List list = this.f15677i0;
        return this.f15676h0.a((String) list.get(i10 - 1)).a();
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15677i0.size() + 1;
    }

    @Override // yh.H1
    public final String[] z0() {
        List<String> list = this.f15677i0;
        int i10 = 1;
        String[] strArr = new String[list.size() + 1];
        strArr[0] = this.f15675Z.D0();
        for (String str : list) {
            strArr[i10] = str.replace('.', '/');
            i10++;
        }
        return strArr;
    }
}
