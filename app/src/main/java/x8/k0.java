package x8;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class k0 extends N {

    /* renamed from: j0  reason: collision with root package name */
    public static final k0 f49573j0 = new k0(0, new Object[0]);

    /* renamed from: h0  reason: collision with root package name */
    public final transient Object[] f49574h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f49575i0;

    public k0(int i10, Object[] objArr) {
        this.f49574h0 = objArr;
        this.f49575i0 = i10;
    }

    @Override // x8.I
    public final int I() {
        return 0;
    }

    @Override // x8.I
    public final boolean M() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P4.a.r(i10, this.f49575i0);
        Object obj = this.f49574h0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // x8.N, x8.I
    public final int r(int i10, Object[] objArr) {
        Object[] objArr2 = this.f49574h0;
        int i11 = this.f49575i0;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // x8.I
    public final Object[] s() {
        return this.f49574h0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49575i0;
    }

    @Override // x8.I
    public final int y() {
        return this.f49575i0;
    }
}
