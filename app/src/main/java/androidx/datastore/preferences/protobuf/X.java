package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class X implements AbstractC2022g0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2011b f25024a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f25025b;

    /* renamed from: c  reason: collision with root package name */
    public final C2033s f25026c;

    public X(p0 p0Var, C2033s c2033s, AbstractC2011b abstractC2011b) {
        this.f25025b = p0Var;
        c2033s.getClass();
        this.f25026c = c2033s;
        this.f25024a = abstractC2011b;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final boolean a(Object obj, Object obj2) {
        p0 p0Var = this.f25025b;
        p0Var.getClass();
        o0 o0Var = ((AbstractC2040z) obj).unknownFields;
        p0Var.getClass();
        if (!o0Var.equals(((AbstractC2040z) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final int b(Object obj) {
        this.f25025b.getClass();
        return ((AbstractC2040z) obj).unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void c(Object obj, Object obj2) {
        h0.B(this.f25025b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void d(Object obj) {
        this.f25025b.getClass();
        ((AbstractC2040z) obj).unknownFields.f25099e = false;
        this.f25026c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final boolean e(Object obj) {
        this.f25026c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final int f(Object obj) {
        this.f25025b.getClass();
        o0 o0Var = ((AbstractC2040z) obj).unknownFields;
        int i10 = o0Var.f25098d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < o0Var.f25095a; i12++) {
                i11 += AbstractC2031p.l(3, (AbstractC2025j) o0Var.f25097c[i12]) + AbstractC2031p.D(2, o0Var.f25096b[i12] >>> 3) + (AbstractC2031p.C(1) * 2);
            }
            o0Var.f25098d = i11;
            return i11;
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final Object g() {
        return ((AbstractC2038x) ((AbstractC2040z) this.f25024a).d(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void h(Object obj, AbstractC2020f0 abstractC2020f0, r rVar) {
        this.f25025b.getClass();
        AbstractC2040z abstractC2040z = (AbstractC2040z) obj;
        if (abstractC2040z.unknownFields == o0.f25094f) {
            abstractC2040z.unknownFields = o0.b();
        }
        this.f25026c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void i(Object obj, J0.a aVar) {
        this.f25026c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }
}
