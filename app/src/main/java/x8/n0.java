package x8;

/* loaded from: classes2.dex */
public final class n0 extends S {

    /* renamed from: i0  reason: collision with root package name */
    public final transient P f49584i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient N f49585j0;

    public n0(P p10, o0 o0Var) {
        this.f49584i0 = p10;
        this.f49585j0 = o0Var;
    }

    @Override // x8.I
    public final boolean M() {
        return true;
    }

    @Override // x8.I, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f49584i0.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // x8.S, x8.I
    public final N f() {
        return this.f49585j0;
    }

    @Override // x8.S
    public final com.google.android.gms.internal.play_billing.C m0() {
        return this.f49585j0.listIterator(0);
    }

    @Override // x8.I
    public final int r(int i10, Object[] objArr) {
        return this.f49585j0.r(i10, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((p0) this.f49584i0).f49598k0;
    }
}
