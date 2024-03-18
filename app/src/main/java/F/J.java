package F;

import A.B0;
import B.AbstractC0168u1;
import B.C0108a0;
import E0.g0;
import G.C0547b;
import G.C0567w;
import G.N;
import G.O;
import G.Q;
import Z.AbstractC1710f0;
import Z.C1712g0;
import Z.C1724m0;
import Z.o1;
import j0.AbstractC3893i;
import java.util.List;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import w.C6077x;
import z.AbstractC6652A0;
import z.AbstractC6696f;
import z.AbstractC6726u;
import z.C6703i0;
import z.C6716p;

/* loaded from: classes.dex */
public final class J implements AbstractC0168u1 {

    /* renamed from: A  reason: collision with root package name */
    public static final i0.r f4870A = AbstractC4828h.X(D.f4854Y, y.f5004i0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f4871a;

    /* renamed from: b  reason: collision with root package name */
    public z f4872b;

    /* renamed from: c  reason: collision with root package name */
    public final C f4873c;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f4875e;

    /* renamed from: g  reason: collision with root package name */
    public float f4877g;

    /* renamed from: l  reason: collision with root package name */
    public O f4882l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4883m;

    /* renamed from: n  reason: collision with root package name */
    public g0 f4884n;

    /* renamed from: u  reason: collision with root package name */
    public final C1724m0 f4891u;

    /* renamed from: v  reason: collision with root package name */
    public final C1724m0 f4892v;

    /* renamed from: w  reason: collision with root package name */
    public final AbstractC1710f0 f4893w;

    /* renamed from: y  reason: collision with root package name */
    public Ng.F f4895y;

    /* renamed from: d  reason: collision with root package name */
    public final C0531e f4874d = new C0531e(this);

    /* renamed from: f  reason: collision with root package name */
    public final D.n f4876f = kotlin.jvm.internal.m.d();

    /* renamed from: h  reason: collision with root package name */
    public Z0.b f4878h = new Z0.c(1.0f, 1.0f);

    /* renamed from: i  reason: collision with root package name */
    public final C0108a0 f4879i = new C0108a0(new C6077x(10, this));

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4880j = true;

    /* renamed from: k  reason: collision with root package name */
    public int f4881k = -1;

    /* renamed from: o  reason: collision with root package name */
    public final E f4885o = new E(this, 0);

    /* renamed from: p  reason: collision with root package name */
    public final C0547b f4886p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public final C0538l f4887q = new C0538l();

    /* renamed from: r  reason: collision with root package name */
    public final C0567w f4888r = new C0567w();

    /* renamed from: s  reason: collision with root package name */
    public long f4889s = A7.b.n(0, 0, 0, 0, 15);

    /* renamed from: t  reason: collision with root package name */
    public final N f4890t = new N();

    /* renamed from: x  reason: collision with root package name */
    public final Q f4894x = new Object();

    /* renamed from: z  reason: collision with root package name */
    public C6716p f4896z = new C6716p(AbstractC6652A0.f51116a, Float.valueOf(0.0f), (AbstractC6726u) C6703i0.f51286l0.invoke(Float.valueOf(0.0f)), Long.MIN_VALUE, Long.MIN_VALUE, false);

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, G.b] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, G.Q] */
    public J(int i10, int i11) {
        this.f4873c = new C(i10, i11);
        z zVar = M.f4903b;
        C1712g0 c1712g0 = C1712g0.f22623a;
        this.f4875e = AbstractC4828h.Z(zVar, c1712g0);
        Boolean bool = Boolean.FALSE;
        o1 o1Var = o1.f22665a;
        this.f4891u = AbstractC4828h.Z(bool, o1Var);
        this.f4892v = AbstractC4828h.Z(bool, o1Var);
        this.f4893w = AbstractC4828h.Z(jf.y.f36177a, c1712g0);
    }

    public static Object j(J j6, int i10, AbstractC4825e abstractC4825e) {
        j6.getClass();
        Object c10 = j6.c(B0.f14Y, new G(j6, i10, 0, null), abstractC4825e);
        if (c10 != EnumC5000a.f41328Y) {
            return jf.y.f36177a;
        }
        return c10;
    }

    @Override // B.AbstractC0168u1
    public final boolean a() {
        return this.f4879i.a();
    }

    @Override // B.AbstractC0168u1
    public final boolean b() {
        return ((Boolean) this.f4892v.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    @Override // B.AbstractC0168u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        F f6;
        EnumC5000a enumC5000a;
        int i10;
        J j6;
        C0108a0 c0108a0;
        if (abstractC4825e instanceof F) {
            f6 = (F) abstractC4825e;
            int i11 = f6.f4862k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f6.f4862k0 = i11 - Integer.MIN_VALUE;
                Object obj = f6.f4860i0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = f6.f4862k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = f6.f4859h0;
                    b02 = f6.f4858Z;
                    j6 = f6.f4857Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    f6.f4857Y = this;
                    f6.f4858Z = b02;
                    f6.f4859h0 = nVar;
                    f6.f4862k0 = 1;
                    if (this.f4886p.j(f6) == enumC5000a) {
                        return enumC5000a;
                    }
                    j6 = this;
                }
                c0108a0 = j6.f4879i;
                f6.f4857Y = null;
                f6.f4858Z = null;
                f6.f4859h0 = null;
                f6.f4862k0 = 2;
                if (c0108a0.c(b02, nVar, f6) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        f6 = new F(this, abstractC4825e);
        Object obj2 = f6.f4860i0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = f6.f4862k0;
        if (i10 == 0) {
        }
        c0108a0 = j6.f4879i;
        f6.f4857Y = null;
        f6.f4858Z = null;
        f6.f4859h0 = null;
        f6.f4862k0 = 2;
        if (c0108a0.c(b02, nVar, f6) == enumC5000a) {
        }
        return jf.y.f36177a;
    }

    @Override // B.AbstractC0168u1
    public final boolean d() {
        return ((Boolean) this.f4891u.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final float e(float f6) {
        return this.f4879i.e(f6);
    }

    public final void f(z zVar, boolean z10, boolean z11) {
        Object obj;
        int i10;
        int i11;
        if (!z10 && this.f4871a) {
            this.f4872b = zVar;
            return;
        }
        boolean z12 = true;
        if (z10) {
            this.f4871a = true;
        }
        A a5 = zVar.f5006a;
        C c10 = this.f4873c;
        if (z11) {
            int i12 = zVar.f5007b;
            if (i12 >= 0.0f) {
                c10.f4850b.i(i12);
            } else {
                c10.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i12 + ')').toString());
            }
        } else {
            c10.getClass();
            if (a5 != null) {
                obj = a5.f4837l;
            } else {
                obj = null;
            }
            c10.f4852d = obj;
            if (c10.f4851c || zVar.f5015j > 0) {
                c10.f4851c = true;
                int i13 = zVar.f5007b;
                if (i13 >= 0.0f) {
                    if (a5 != null) {
                        i11 = a5.f4826a;
                    } else {
                        i11 = 0;
                    }
                    c10.a(i11, i13);
                } else {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i13 + ')').toString());
                }
            }
            if (this.f4881k != -1) {
                List list = zVar.f5012g;
                if (!list.isEmpty()) {
                    if (this.f4883m) {
                        i10 = ((A) ((n) kf.t.o2(list))).f4826a + 1;
                    } else {
                        i10 = ((A) ((n) kf.t.f2(list))).f4826a - 1;
                    }
                    if (this.f4881k != i10) {
                        this.f4881k = -1;
                        O o10 = this.f4882l;
                        if (o10 != null) {
                            o10.cancel();
                        }
                        this.f4882l = null;
                    }
                }
            }
        }
        if ((a5 == null || a5.f4826a == 0) && zVar.f5007b == 0) {
            z12 = false;
        }
        this.f4892v.setValue(Boolean.valueOf(z12));
        this.f4891u.setValue(Boolean.valueOf(zVar.f5008c));
        this.f4877g -= zVar.f5009d;
        this.f4875e.setValue(zVar);
        if (z10) {
            float R10 = this.f4878h.R(M.f4902a);
            float f6 = zVar.f5010e;
            if (f6 > R10) {
                int i14 = AbstractC3893i.f35891e;
                AbstractC3893i d10 = io.sentry.hints.i.d();
                try {
                    AbstractC3893i j6 = d10.j();
                    float floatValue = ((Number) this.f4896z.f51346Z.getValue()).floatValue();
                    C6716p c6716p = this.f4896z;
                    if (c6716p.f51350k0) {
                        this.f4896z = AbstractC6696f.l(c6716p, floatValue - f6, 0.0f, 30);
                        Ng.F f10 = this.f4895y;
                        if (f10 != null) {
                            Ad.l.O0(f10, null, null, new H(this, null), 3);
                        }
                    } else {
                        this.f4896z = new C6716p(AbstractC6652A0.f51116a, Float.valueOf(-f6), null, 60);
                        Ng.F f11 = this.f4895y;
                        if (f11 != null) {
                            Ad.l.O0(f11, null, null, new I(this, null), 3);
                        }
                    }
                    AbstractC3893i.p(j6);
                } finally {
                    d10.c();
                }
            }
        }
    }

    public final int g() {
        return this.f4873c.f4849a.h();
    }

    public final x h() {
        return (x) this.f4875e.getValue();
    }

    public final void i(float f6, x xVar) {
        boolean z10;
        int i10;
        O o10;
        if (this.f4880j && (!((z) xVar).f5012g.isEmpty())) {
            if (f6 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = ((A) ((n) kf.t.o2(((z) xVar).f5012g))).f4826a + 1;
            } else {
                i10 = ((A) ((n) kf.t.f2(((z) xVar).f5012g))).f4826a - 1;
            }
            if (i10 != this.f4881k && i10 >= 0 && i10 < ((z) xVar).f5015j) {
                if (this.f4883m != z10 && (o10 = this.f4882l) != null) {
                    o10.cancel();
                }
                this.f4883m = z10;
                this.f4881k = i10;
                this.f4882l = this.f4894x.a(i10, this.f4889s);
            }
        }
    }
}
