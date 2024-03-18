package x8;

/* loaded from: classes2.dex */
public final class x0 extends S {

    /* renamed from: i0  reason: collision with root package name */
    public final transient Object f49629i0;

    public x0(Object obj) {
        obj.getClass();
        this.f49629i0 = obj;
    }

    @Override // x8.I
    public final boolean M() {
        return false;
    }

    @Override // x8.I, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f49629i0.equals(obj);
    }

    @Override // x8.S, x8.I
    public final N f() {
        return N.u0(this.f49629i0);
    }

    @Override // x8.S, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f49629i0.hashCode();
    }

    @Override // x8.S
    public final com.google.android.gms.internal.play_billing.C m0() {
        return new U(this.f49629i0);
    }

    @Override // x8.I
    public final int r(int i10, Object[] objArr) {
        objArr[i10] = this.f49629i0;
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f49629i0.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
