package W;

import Z.C1718j0;
import Z.C1724m0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wf.AbstractC6216a;
import z.C6697f0;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f18992a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6216a f18993b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f18994c;

    /* renamed from: f  reason: collision with root package name */
    public final C1724m0 f18997f;

    /* renamed from: k  reason: collision with root package name */
    public final C1724m0 f19002k;

    /* renamed from: l  reason: collision with root package name */
    public final C1724m0 f19003l;

    /* renamed from: d  reason: collision with root package name */
    public final C1632w1 f18995d = new C1632w1();

    /* renamed from: e  reason: collision with root package name */
    public final B.F f18996e = new B.F(this);

    /* renamed from: g  reason: collision with root package name */
    public final Z.I f18998g = AbstractC4828h.E(new A(this, 4));

    /* renamed from: h  reason: collision with root package name */
    public final Z.I f18999h = AbstractC4828h.E(new A(this, 3));

    /* renamed from: i  reason: collision with root package name */
    public final C1718j0 f19000i = Df.H.h0(Float.NaN);

    /* renamed from: j  reason: collision with root package name */
    public final C1718j0 f19001j = Df.H.h0(0.0f);

    /* renamed from: m  reason: collision with root package name */
    public final C1645z f19004m = new C1645z(this);

    public C(Object obj, W1 w12, C1560h3 c1560h3, wf.k kVar) {
        C6697f0 c6697f0 = AbstractC1576l.f20202a;
        this.f18992a = w12;
        this.f18993b = c1560h3;
        this.f18994c = kVar;
        Z.o1 o1Var = Z.o1.f22665a;
        this.f18997f = AbstractC4828h.Z(obj, o1Var);
        AbstractC4828h.D(o1Var, new A(this, 0));
        this.f19002k = AbstractC4828h.Z(null, o1Var);
        this.f19003l = AbstractC4828h.Z(new F1(kf.w.f37484Y), o1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(A.B0 b02, B.D d10, AbstractC4825e abstractC4825e) {
        C1615t c1615t;
        int i10;
        Throwable th2;
        C c10;
        Object a5;
        Object a10;
        C1632w1 c1632w1;
        C1625v c1625v;
        if (abstractC4825e instanceof C1615t) {
            c1615t = (C1615t) abstractC4825e;
            int i11 = c1615t.f20417i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1615t.f20417i0 = i11 - Integer.MIN_VALUE;
                Object obj = c1615t.f20415Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1615t.f20417i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c10 = c1615t.f20414Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            F1 d11 = c10.d();
                            C1718j0 c1718j0 = c10.f19000i;
                            a5 = d11.a(c1718j0.h());
                            if (a5 != null && Math.abs(c1718j0.h() - c10.d().c(a5)) <= 0.5f && ((Boolean) c10.f18994c.invoke(a5)).booleanValue()) {
                                c10.h(a5);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    try {
                        c1632w1 = this.f18995d;
                        c1625v = new C1625v(this, null, d10);
                        c1615t.f20414Y = this;
                        c1615t.f20417i0 = 1;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                    try {
                        c1632w1.getClass();
                        if (Ad.l.e0(new C1627v1(b02, c1632w1, c1625v, null), c1615t) == enumC5000a) {
                            return enumC5000a;
                        }
                        c10 = this;
                    } catch (Throwable th5) {
                        th2 = th5;
                        c10 = this;
                        F1 d112 = c10.d();
                        C1718j0 c1718j02 = c10.f19000i;
                        a5 = d112.a(c1718j02.h());
                        if (a5 != null) {
                            c10.h(a5);
                        }
                        throw th2;
                    }
                }
                F1 d12 = c10.d();
                C1718j0 c1718j03 = c10.f19000i;
                a10 = d12.a(c1718j03.h());
                if (a10 != null && Math.abs(c1718j03.h() - c10.d().c(a10)) <= 0.5f && ((Boolean) c10.f18994c.invoke(a10)).booleanValue()) {
                    c10.h(a10);
                }
                return jf.y.f36177a;
            }
        }
        c1615t = new C1615t(this, abstractC4825e);
        Object obj2 = c1615t.f20415Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1615t.f20417i0;
        if (i10 == 0) {
        }
        F1 d122 = c10.d();
        C1718j0 c1718j032 = c10.f19000i;
        a10 = d122.a(c1718j032.h());
        if (a10 != null) {
            c10.h(a10);
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, A.B0 b02, C1586n c1586n, AbstractC4825e abstractC4825e) {
        C1630w c1630w;
        int i10;
        Throwable th2;
        C c10;
        Object a5;
        Object a10;
        C1632w1 c1632w1;
        C1640y c1640y;
        if (abstractC4825e instanceof C1630w) {
            c1630w = (C1630w) abstractC4825e;
            int i11 = c1630w.f20553i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1630w.f20553i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1630w.f20551Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1630w.f20553i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c10 = c1630w.f20550Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            c10.i(null);
                            F1 d10 = c10.d();
                            C1718j0 c1718j0 = c10.f19000i;
                            a5 = d10.a(c1718j0.h());
                            if (a5 != null && Math.abs(c1718j0.h() - c10.d().c(a5)) <= 0.5f && ((Boolean) c10.f18994c.invoke(a5)).booleanValue()) {
                                c10.h(a5);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    if (d().f19126a.containsKey(obj)) {
                        try {
                            c1632w1 = this.f18995d;
                            c1640y = new C1640y(this, obj, c1586n, null);
                            c1630w.f20550Y = this;
                            c1630w.f20553i0 = 1;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                        try {
                            c1632w1.getClass();
                            if (Ad.l.e0(new C1627v1(b02, c1632w1, c1640y, null), c1630w) == enumC5000a) {
                                return enumC5000a;
                            }
                            c10 = this;
                        } catch (Throwable th5) {
                            th2 = th5;
                            c10 = this;
                            c10.i(null);
                            F1 d102 = c10.d();
                            C1718j0 c1718j02 = c10.f19000i;
                            a5 = d102.a(c1718j02.h());
                            if (a5 != null) {
                                c10.h(a5);
                            }
                            throw th2;
                        }
                    } else {
                        h(obj);
                        return jf.y.f36177a;
                    }
                }
                c10.i(null);
                F1 d11 = c10.d();
                C1718j0 c1718j03 = c10.f19000i;
                a10 = d11.a(c1718j03.h());
                if (a10 != null && Math.abs(c1718j03.h() - c10.d().c(a10)) <= 0.5f && ((Boolean) c10.f18994c.invoke(a10)).booleanValue()) {
                    c10.h(a10);
                }
                return jf.y.f36177a;
            }
        }
        c1630w = new C1630w(this, abstractC4825e);
        Object obj22 = c1630w.f20551Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1630w.f20553i0;
        if (i10 == 0) {
        }
        c10.i(null);
        F1 d112 = c10.d();
        C1718j0 c1718j032 = c10.f19000i;
        a10 = d112.a(c1718j032.h());
        if (a10 != null) {
            c10.h(a10);
        }
        return jf.y.f36177a;
    }

    public final Object c(float f6, float f10, Object obj) {
        Object b10;
        F1 d10 = d();
        float c10 = d10.c(obj);
        float floatValue = ((Number) this.f18993b.mo122invoke()).floatValue();
        int i10 = (c10 > f6 ? 1 : (c10 == f6 ? 0 : -1));
        if (i10 != 0 && !Float.isNaN(c10)) {
            wf.k kVar = this.f18992a;
            if (i10 < 0) {
                if (f10 >= floatValue) {
                    Object b11 = d10.b(f6, true);
                    AbstractC3557B.Z(b11);
                    return b11;
                }
                b10 = d10.b(f6, true);
                AbstractC3557B.Z(b10);
                if (f6 < Math.abs(Math.abs(((Number) kVar.invoke(Float.valueOf(Math.abs(d10.c(b10) - c10)))).floatValue()) + c10)) {
                    return obj;
                }
            } else if (f10 <= (-floatValue)) {
                Object b12 = d10.b(f6, false);
                AbstractC3557B.Z(b12);
                return b12;
            } else {
                b10 = d10.b(f6, false);
                AbstractC3557B.Z(b10);
                float abs = Math.abs(c10 - Math.abs(((Number) kVar.invoke(Float.valueOf(Math.abs(c10 - d10.c(b10))))).floatValue()));
                if (f6 < 0.0f) {
                    if (Math.abs(f6) < abs) {
                        return obj;
                    }
                } else if (f6 > abs) {
                    return obj;
                }
            }
            return b10;
        }
        return obj;
    }

    public final F1 d() {
        return (F1) this.f19003l.getValue();
    }

    public final float e() {
        return this.f19000i.h();
    }

    public final float f(float f6) {
        float f10;
        float f11;
        C1718j0 c1718j0 = this.f19000i;
        if (Float.isNaN(c1718j0.h())) {
            f10 = 0.0f;
        } else {
            f10 = c1718j0.h();
        }
        float f12 = f10 + f6;
        Float s22 = kf.t.s2(d().f19126a.values());
        float f13 = Float.NaN;
        if (s22 != null) {
            f11 = s22.floatValue();
        } else {
            f11 = Float.NaN;
        }
        Float r22 = kf.t.r2(d().f19126a.values());
        if (r22 != null) {
            f13 = r22.floatValue();
        }
        return com.google.android.gms.internal.play_billing.N.o(f12, f11, f13);
    }

    public final float g() {
        if (!Float.isNaN(e())) {
            return e();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void h(Object obj) {
        this.f18997f.setValue(obj);
    }

    public final void i(Object obj) {
        this.f19002k.setValue(obj);
    }
}
