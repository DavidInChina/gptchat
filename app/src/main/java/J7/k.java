package J7;

/* loaded from: classes2.dex */
public final class k extends l {

    /* renamed from: h0  reason: collision with root package name */
    public final transient int f8885h0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient int f8886i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ l f8887j0;

    public k(l lVar, int i10, int i11) {
        this.f8887j0 = lVar;
        this.f8885h0 = i10;
        this.f8886i0 = i11;
    }

    @Override // J7.l
    /* renamed from: M */
    public final l subList(int i10, int i11) {
        P4.a.X0(i10, i11, this.f8886i0);
        int i12 = this.f8885h0;
        return this.f8887j0.subList(i10 + i12, i11 + i12);
    }

    @Override // J7.i
    public final Object[] f() {
        return this.f8887j0.f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P4.a.W0(i10, this.f8886i0);
        return this.f8887j0.get(i10 + this.f8885h0);
    }

    @Override // J7.i
    public final int r() {
        return this.f8887j0.r() + this.f8885h0;
    }

    @Override // J7.i
    public final int s() {
        return this.f8887j0.r() + this.f8885h0 + this.f8886i0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8886i0;
    }

    @Override // J7.i
    public final boolean y() {
        return true;
    }
}
