package x8;

/* loaded from: classes2.dex */
public final class q0 extends S {

    /* renamed from: n0  reason: collision with root package name */
    public static final Object[] f49600n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public static final q0 f49601o0;

    /* renamed from: i0  reason: collision with root package name */
    public final transient Object[] f49602i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient int f49603j0;

    /* renamed from: k0  reason: collision with root package name */
    public final transient Object[] f49604k0;

    /* renamed from: l0  reason: collision with root package name */
    public final transient int f49605l0;

    /* renamed from: m0  reason: collision with root package name */
    public final transient int f49606m0;

    static {
        Object[] objArr = new Object[0];
        f49601o0 = new q0(0, 0, 0, objArr, objArr);
    }

    public q0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f49602i0 = objArr;
        this.f49603j0 = i10;
        this.f49604k0 = objArr2;
        this.f49605l0 = i11;
        this.f49606m0 = i12;
    }

    @Override // x8.I
    public final int I() {
        return 0;
    }

    @Override // x8.I
    public final boolean M() {
        return false;
    }

    @Override // x8.I, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f49604k0;
            if (objArr.length != 0) {
                int v02 = M3.H.v0(obj);
                while (true) {
                    int i10 = v02 & this.f49605l0;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v02 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // x8.S, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f49603j0;
    }

    @Override // x8.S
    public final N i0() {
        return N.T(this.f49606m0, this.f49602i0);
    }

    @Override // x8.S
    public final com.google.android.gms.internal.play_billing.C m0() {
        return f().listIterator(0);
    }

    @Override // x8.I
    public final int r(int i10, Object[] objArr) {
        Object[] objArr2 = this.f49602i0;
        int i11 = this.f49606m0;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // x8.I
    public final Object[] s() {
        return this.f49602i0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f49606m0;
    }

    @Override // x8.I
    public final int y() {
        return this.f49606m0;
    }
}
