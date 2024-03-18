package vh;

import java.util.List;
import yh.l1;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f47551Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f47552h0;

    public k(l1 l1Var, List list) {
        super(0);
        this.f47551Z = l1Var;
        this.f47552h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return new d(this.f47551Z, (f) this.f47552h0.get(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47552h0.size();
    }
}
