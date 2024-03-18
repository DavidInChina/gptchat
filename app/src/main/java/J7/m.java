package J7;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class m extends l {

    /* renamed from: j0  reason: collision with root package name */
    public static final m f8889j0 = new m(0, new Object[0]);

    /* renamed from: h0  reason: collision with root package name */
    public final transient Object[] f8890h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f8891i0;

    public m(int i10, Object[] objArr) {
        this.f8890h0 = objArr;
        this.f8891i0 = i10;
    }

    @Override // J7.l, J7.i
    public final int I(Object[] objArr) {
        Object[] objArr2 = this.f8890h0;
        int i10 = this.f8891i0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // J7.i
    public final Object[] f() {
        return this.f8890h0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P4.a.W0(i10, this.f8891i0);
        Object obj = this.f8890h0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // J7.i
    public final int r() {
        return 0;
    }

    @Override // J7.i
    public final int s() {
        return this.f8891i0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8891i0;
    }

    @Override // J7.i
    public final boolean y() {
        return false;
    }
}
