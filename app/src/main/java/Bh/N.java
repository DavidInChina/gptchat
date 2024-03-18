package Bh;

import Qh.AbstractC1239q;
import java.util.List;

/* loaded from: classes2.dex */
public final class N extends AbstractC1239q {

    /* renamed from: Z  reason: collision with root package name */
    public final List f2235Z;

    public N(List list) {
        super(0);
        this.f2235Z = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (M) this.f2235Z.get(i10);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2235Z.size();
    }

    @Override // Qh.AbstractC1239q
    public final Qh.r y(List list) {
        return new N(list);
    }
}
