package x8;

import java.util.Map;

/* loaded from: classes2.dex */
public final class m0 extends S {

    /* renamed from: i0  reason: collision with root package name */
    public final transient P f49579i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient Object[] f49580j0;

    /* renamed from: k0  reason: collision with root package name */
    public final transient int f49581k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public final transient int f49582l0;

    public m0(P p10, Object[] objArr, int i10) {
        this.f49579i0 = p10;
        this.f49580j0 = objArr;
        this.f49582l0 = i10;
    }

    @Override // x8.I
    public final boolean M() {
        return true;
    }

    @Override // x8.I, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f49579i0.get(key))) {
            return false;
        }
        return true;
    }

    @Override // x8.S
    public final N i0() {
        return new l0(this);
    }

    @Override // x8.S
    public final com.google.android.gms.internal.play_billing.C m0() {
        return f().listIterator(0);
    }

    @Override // x8.I
    public final int r(int i10, Object[] objArr) {
        return f().r(i10, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f49582l0;
    }
}
