package B;

import Z.C1718j0;
import Z.C1724m0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import z.AbstractC6714o;
import z.C6735y0;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6714o f1081a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f1082b;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f1085e;

    /* renamed from: j  reason: collision with root package name */
    public final C1724m0 f1090j;

    /* renamed from: k  reason: collision with root package name */
    public final C1724m0 f1091k;

    /* renamed from: c  reason: collision with root package name */
    public final A.F0 f1083c = new A.F0();

    /* renamed from: d  reason: collision with root package name */
    public final F f1084d = new F(this);

    /* renamed from: f  reason: collision with root package name */
    public final Z.I f1086f = AbstractC4828h.E(new G(this, 4));

    /* renamed from: g  reason: collision with root package name */
    public final Z.I f1087g = AbstractC4828h.E(new G(this, 3));

    /* renamed from: h  reason: collision with root package name */
    public final C1718j0 f1088h = Df.H.h0(Float.NaN);

    /* renamed from: i  reason: collision with root package name */
    public final C1718j0 f1089i = Df.H.h0(0.0f);

    /* renamed from: l  reason: collision with root package name */
    public final C f1092l = new C(this);

    public H(C6735y0 c6735y0) {
        Boolean bool = Boolean.FALSE;
        C0169v c0169v = C0169v.f1527Z;
        this.f1081a = c6735y0;
        this.f1082b = c0169v;
        Z.o1 o1Var = Z.o1.f22665a;
        this.f1085e = AbstractC4828h.Z(bool, o1Var);
        AbstractC4828h.D(o1Var, new G(this, 0));
        this.f1090j = AbstractC4828h.Z(null, o1Var);
        this.f1091k = AbstractC4828h.Z(new P0(kf.w.f37484Y), o1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(A.B0 b02, D d10, AbstractC4825e abstractC4825e) {
        C0172w c0172w;
        int i10;
        Throwable th2;
        H h10;
        Object a5;
        Object a10;
        A.F0 f02;
        C0178y c0178y;
        if (abstractC4825e instanceof C0172w) {
            c0172w = (C0172w) abstractC4825e;
            int i11 = c0172w.f1545i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0172w.f1545i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0172w.f1543Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0172w.f1545i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        h10 = c0172w.f1542Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            P0 d11 = h10.d();
                            C1718j0 c1718j0 = h10.f1088h;
                            a5 = d11.a(c1718j0.h());
                            if (a5 != null && Math.abs(c1718j0.h() - h10.d().c(a5)) <= 0.5f && ((Boolean) h10.f1082b.invoke(a5)).booleanValue()) {
                                h10.f(a5);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    try {
                        f02 = this.f1083c;
                        c0178y = new C0178y(this, null, d10);
                        c0172w.f1542Y = this;
                        c0172w.f1545i0 = 1;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                    try {
                        f02.getClass();
                        if (Ad.l.e0(new A.D0(b02, f02, c0178y, null), c0172w) == enumC5000a) {
                            return enumC5000a;
                        }
                        h10 = this;
                    } catch (Throwable th5) {
                        th2 = th5;
                        h10 = this;
                        P0 d112 = h10.d();
                        C1718j0 c1718j02 = h10.f1088h;
                        a5 = d112.a(c1718j02.h());
                        if (a5 != null) {
                            h10.f(a5);
                        }
                        throw th2;
                    }
                }
                P0 d12 = h10.d();
                C1718j0 c1718j03 = h10.f1088h;
                a10 = d12.a(c1718j03.h());
                if (a10 != null && Math.abs(c1718j03.h() - h10.d().c(a10)) <= 0.5f && ((Boolean) h10.f1082b.invoke(a10)).booleanValue()) {
                    h10.f(a10);
                }
                return jf.y.f36177a;
            }
        }
        c0172w = new C0172w(this, abstractC4825e);
        Object obj2 = c0172w.f1543Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0172w.f1545i0;
        if (i10 == 0) {
        }
        P0 d122 = h10.d();
        C1718j0 c1718j032 = h10.f1088h;
        a10 = d122.a(c1718j032.h());
        if (a10 != null) {
            h10.f(a10);
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, A.B0 b02, C0152p c0152p, AbstractC4825e abstractC4825e) {
        C0181z c0181z;
        int i10;
        Throwable th2;
        H h10;
        Object a5;
        Object a10;
        A.F0 f02;
        B b10;
        if (abstractC4825e instanceof C0181z) {
            c0181z = (C0181z) abstractC4825e;
            int i11 = c0181z.f1571i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0181z.f1571i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c0181z.f1569Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0181z.f1571i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        h10 = c0181z.f1568Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            h10.f1090j.setValue(null);
                            P0 d10 = h10.d();
                            C1718j0 c1718j0 = h10.f1088h;
                            a5 = d10.a(c1718j0.h());
                            if (a5 != null && Math.abs(c1718j0.h() - h10.d().c(a5)) <= 0.5f && ((Boolean) h10.f1082b.invoke(a5)).booleanValue()) {
                                h10.f(a5);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    if (d().f1149a.containsKey(obj)) {
                        try {
                            f02 = this.f1083c;
                            b10 = new B(this, obj, c0152p, null);
                            c0181z.f1568Y = this;
                            c0181z.f1571i0 = 1;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                        try {
                            f02.getClass();
                            if (Ad.l.e0(new A.D0(b02, f02, b10, null), c0181z) == enumC5000a) {
                                return enumC5000a;
                            }
                            h10 = this;
                        } catch (Throwable th5) {
                            th2 = th5;
                            h10 = this;
                            h10.f1090j.setValue(null);
                            P0 d102 = h10.d();
                            C1718j0 c1718j02 = h10.f1088h;
                            a5 = d102.a(c1718j02.h());
                            if (a5 != null) {
                                h10.f(a5);
                            }
                            throw th2;
                        }
                    } else {
                        f(obj);
                        return jf.y.f36177a;
                    }
                }
                h10.f1090j.setValue(null);
                P0 d11 = h10.d();
                C1718j0 c1718j03 = h10.f1088h;
                a10 = d11.a(c1718j03.h());
                if (a10 != null && Math.abs(c1718j03.h() - h10.d().c(a10)) <= 0.5f && ((Boolean) h10.f1082b.invoke(a10)).booleanValue()) {
                    h10.f(a10);
                }
                return jf.y.f36177a;
            }
        }
        c0181z = new C0181z(this, abstractC4825e);
        Object obj22 = c0181z.f1569Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0181z.f1571i0;
        if (i10 == 0) {
        }
        h10.f1090j.setValue(null);
        P0 d112 = h10.d();
        C1718j0 c1718j032 = h10.f1088h;
        a10 = d112.a(c1718j032.h());
        if (a10 != null) {
            h10.f(a10);
        }
        return jf.y.f36177a;
    }

    public final Object c(float f6, float f10, Object obj) {
        P0 d10 = d();
        float c10 = d10.c(obj);
        float floatValue = Float.valueOf(0.0f).floatValue();
        if (c10 != f6 && !Float.isNaN(c10)) {
            int i10 = (Math.abs(f10) > Math.abs(floatValue) ? 1 : (Math.abs(f10) == Math.abs(floatValue) ? 0 : -1));
            boolean z10 = false;
            if (i10 >= 0) {
                if (f6 - c10 > 0.0f) {
                    z10 = true;
                }
                Object b10 = d10.b(f6, z10);
                AbstractC3557B.Z(b10);
                return b10;
            }
            if (f6 - c10 > 0.0f) {
                z10 = true;
            }
            Object b11 = d10.b(f6, z10);
            AbstractC3557B.Z(b11);
            if (Math.abs(c10 - f6) > Math.abs(Float.valueOf(Float.valueOf(Math.abs(c10 - d10.c(b11))).floatValue() / 2).floatValue())) {
                return b11;
            }
            return obj;
        }
        return obj;
    }

    public final P0 d() {
        return (P0) this.f1091k.getValue();
    }

    public final float e() {
        return this.f1088h.h();
    }

    public final void f(Object obj) {
        this.f1085e.setValue(obj);
    }
}
