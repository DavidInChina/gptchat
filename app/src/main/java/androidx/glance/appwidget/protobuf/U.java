package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes2.dex */
public final class U implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2042b f25187a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f25188b;

    /* renamed from: c  reason: collision with root package name */
    public final r f25189c;

    public U(g0 g0Var, r rVar, AbstractC2042b abstractC2042b) {
        this.f25188b = g0Var;
        rVar.getClass();
        this.f25189c = rVar;
        this.f25187a = abstractC2042b;
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final boolean a(Object obj, Object obj2) {
        g0 g0Var = this.f25188b;
        g0Var.getClass();
        f0 f0Var = ((AbstractC2063x) obj).unknownFields;
        g0Var.getClass();
        if (!f0Var.equals(((AbstractC2063x) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final int b(Object obj) {
        this.f25188b.getClass();
        return ((AbstractC2063x) obj).unknownFields.hashCode();
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void c(Object obj, Object obj2) {
        c0.B(this.f25188b, obj, obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void d(Object obj) {
        this.f25188b.getClass();
        g0.b(obj);
        this.f25189c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final boolean e(Object obj) {
        this.f25189c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final int f(Object obj) {
        this.f25188b.getClass();
        f0 f0Var = ((AbstractC2063x) obj).unknownFields;
        int i10 = f0Var.f25217d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < f0Var.f25214a; i12++) {
                i11 += AbstractC2055o.V1(3, (AbstractC2049i) f0Var.f25216c[i12]) + AbstractC2055o.n2(2, f0Var.f25215b[i12] >>> 3) + (AbstractC2055o.m2(1) * 2);
            }
            f0Var.f25217d = i11;
            return i11;
        }
        return i10;
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final AbstractC2063x g() {
        AbstractC2042b abstractC2042b = this.f25187a;
        if (abstractC2042b instanceof AbstractC2063x) {
            return ((AbstractC2063x) abstractC2042b).j();
        }
        return ((AbstractC2061v) ((AbstractC2063x) abstractC2042b).d(5)).d();
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void h(Object obj, F4.a aVar) {
        this.f25189c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void i(Object obj, T0.m mVar, C2057q c2057q) {
        this.f25188b.getClass();
        g0.a(obj);
        this.f25189c.getClass();
        AbstractC2469q0.p(obj);
        throw null;
    }
}
