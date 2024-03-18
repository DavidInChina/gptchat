package x8;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes.dex */
public final class l0 extends N {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m0 f49576h0;

    public l0(m0 m0Var) {
        this.f49576h0 = m0Var;
    }

    @Override // x8.I
    public final boolean M() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m0 m0Var = this.f49576h0;
        P4.a.r(i10, m0Var.f49582l0);
        int i11 = i10 * 2;
        int i12 = m0Var.f49581k0;
        Object[] objArr = m0Var.f49580j0;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49576h0.f49582l0;
    }
}
