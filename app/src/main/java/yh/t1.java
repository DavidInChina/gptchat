package yh;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class t1 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final List f51083Z;

    public t1(List list) {
        super(0);
        this.f51083Z = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return ((AbstractC6632q) this.f51083Z.get(i10)).w0();
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51083Z.size();
    }

    public t1(AbstractC6632q... abstractC6632qArr) {
        this(Arrays.asList(abstractC6632qArr));
    }
}
