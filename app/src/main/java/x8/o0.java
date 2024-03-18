package x8;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class o0 extends N {

    /* renamed from: h0  reason: collision with root package name */
    public final transient Object[] f49591h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f49592i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient int f49593j0;

    public o0(int i10, int i11, Object[] objArr) {
        this.f49591h0 = objArr;
        this.f49592i0 = i10;
        this.f49593j0 = i11;
    }

    @Override // x8.I
    public final boolean M() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P4.a.r(i10, this.f49593j0);
        Object obj = this.f49591h0[(i10 * 2) + this.f49592i0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49593j0;
    }
}
