package yh;

import java.util.List;
import yh.l1;

/* loaded from: classes.dex */
public final class x1 extends r1 {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f51105i0 = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final List f51106Z;

    /* renamed from: h0  reason: collision with root package name */
    public final k1 f51107h0;

    public x1(List list, k1 k1Var) {
        super(0);
        this.f51106Z = list;
        this.f51107h0 = k1Var;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (l1.a) ((l1.a) this.f51106Z.get(i10)).k(this.f51107h0);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51106Z.size();
    }
}
