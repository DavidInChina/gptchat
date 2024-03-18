package H;

import A.B0;
import B.AbstractC0168u1;
import B.C0108a0;
import B.W0;
import G.C0547b;
import G.C0567w;
import G.O;
import G.Q;
import Z.AbstractC1710f0;
import Z.C1712g0;
import Z.C1718j0;
import Z.C1720k0;
import Z.C1724m0;
import Z.o1;
import j0.AbstractC3893i;
import java.util.List;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q0.C5251c;
import w.C6077x;

/* loaded from: classes2.dex */
public abstract class F implements AbstractC0168u1 {

    /* renamed from: A  reason: collision with root package name */
    public final AbstractC1710f0 f6543A;

    /* renamed from: B  reason: collision with root package name */
    public final C1724m0 f6544B;

    /* renamed from: C  reason: collision with root package name */
    public final C1724m0 f6545C;

    /* renamed from: a  reason: collision with root package name */
    public final C1724m0 f6546a;

    /* renamed from: b  reason: collision with root package name */
    public final C1718j0 f6547b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f6548c;

    /* renamed from: d  reason: collision with root package name */
    public final A f6549d;

    /* renamed from: e  reason: collision with root package name */
    public int f6550e;

    /* renamed from: f  reason: collision with root package name */
    public int f6551f;

    /* renamed from: g  reason: collision with root package name */
    public int f6552g;

    /* renamed from: h  reason: collision with root package name */
    public float f6553h;

    /* renamed from: i  reason: collision with root package name */
    public float f6554i;

    /* renamed from: j  reason: collision with root package name */
    public final C0108a0 f6555j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6556k;

    /* renamed from: l  reason: collision with root package name */
    public int f6557l;

    /* renamed from: m  reason: collision with root package name */
    public O f6558m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6559n;

    /* renamed from: o  reason: collision with root package name */
    public final C1724m0 f6560o;

    /* renamed from: p  reason: collision with root package name */
    public Z0.b f6561p;

    /* renamed from: q  reason: collision with root package name */
    public final D.n f6562q;

    /* renamed from: r  reason: collision with root package name */
    public final C1720k0 f6563r;

    /* renamed from: s  reason: collision with root package name */
    public final C1720k0 f6564s;

    /* renamed from: t  reason: collision with root package name */
    public final Q f6565t;

    /* renamed from: u  reason: collision with root package name */
    public final C0567w f6566u;

    /* renamed from: v  reason: collision with root package name */
    public final C0547b f6567v;

    /* renamed from: w  reason: collision with root package name */
    public final C1724m0 f6568w;

    /* renamed from: x  reason: collision with root package name */
    public final F.E f6569x;

    /* renamed from: y  reason: collision with root package name */
    public long f6570y;

    /* renamed from: z  reason: collision with root package name */
    public final G.N f6571z;

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, G.Q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, G.b] */
    public F(int i10, float f6) {
        double d10 = f6;
        if (-0.5d <= d10 && d10 <= 0.5d) {
            C5251c c5251c = new C5251c(C5251c.f43619b);
            o1 o1Var = o1.f22665a;
            this.f6546a = AbstractC4828h.Z(c5251c, o1Var);
            this.f6547b = Df.H.h0(0.0f);
            Boolean bool = Boolean.FALSE;
            this.f6548c = AbstractC4828h.Z(bool, o1Var);
            this.f6549d = new A(i10, f6, this);
            this.f6550e = i10;
            this.f6552g = Integer.MAX_VALUE;
            this.f6555j = new C0108a0(new C6077x(13, this));
            this.f6556k = true;
            this.f6557l = -1;
            x xVar = L.f6582b;
            C1712g0 c1712g0 = C1712g0.f22623a;
            this.f6560o = AbstractC4828h.Z(xVar, c1712g0);
            this.f6561p = L.f6583c;
            this.f6562q = kotlin.jvm.internal.m.d();
            this.f6563r = U3.f.h0(-1);
            this.f6564s = U3.f.h0(i10);
            AbstractC4828h.D(o1Var, new C0654c(this, 2));
            AbstractC4828h.D(o1Var, new C0654c(this, 3));
            this.f6565t = new Object();
            this.f6566u = new C0567w();
            this.f6567v = new Object();
            this.f6568w = AbstractC4828h.Z(null, o1Var);
            this.f6569x = new F.E(this, 1);
            this.f6570y = A7.b.n(0, 0, 0, 0, 15);
            this.f6571z = new G.N();
            this.f6543A = AbstractC4828h.Z(jf.y.f36177a, c1712g0);
            this.f6544B = AbstractC4828h.Z(bool, o1Var);
            this.f6545C = AbstractC4828h.Z(bool, o1Var);
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f6 + " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object n(F f6, B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        D d10;
        EnumC5000a enumC5000a;
        int i10;
        if (abstractC4825e instanceof D) {
            d10 = (D) abstractC4825e;
            int i11 = d10.f6538k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d10.f6538k0 = i11 - Integer.MIN_VALUE;
                Object obj = d10.f6536i0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = d10.f6538k0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            f6 = d10.f6533Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            f6.f6563r.i(-1);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = d10.f6535h0;
                    b02 = d10.f6534Z;
                    f6 = d10.f6533Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    d10.f6533Y = f6;
                    d10.f6534Z = b02;
                    d10.f6535h0 = nVar;
                    d10.f6538k0 = 1;
                    Object j6 = f6.f6567v.j(d10);
                    if (j6 != enumC5000a) {
                        j6 = yVar;
                    }
                    if (j6 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                if (!f6.f6555j.a()) {
                    f6.f6564s.i(f6.f6549d.f6527b.h());
                }
                d10.f6533Y = f6;
                d10.f6534Z = null;
                d10.f6535h0 = null;
                d10.f6538k0 = 2;
                if (f6.f6555j.c(b02, nVar, d10) == enumC5000a) {
                    return enumC5000a;
                }
                f6.f6563r.i(-1);
                return yVar;
            }
        }
        d10 = new D(f6, abstractC4825e);
        Object obj2 = d10.f6536i0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = d10.f6538k0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        if (!f6.f6555j.a()) {
        }
        d10.f6533Y = f6;
        d10.f6534Z = null;
        d10.f6535h0 = null;
        d10.f6538k0 = 2;
        if (f6.f6555j.c(b02, nVar, d10) == enumC5000a) {
        }
        f6.f6563r.i(-1);
        return yVar2;
    }

    @Override // B.AbstractC0168u1
    public final boolean a() {
        return this.f6555j.a();
    }

    @Override // B.AbstractC0168u1
    public final boolean b() {
        return ((Boolean) this.f6545C.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final Object c(B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        return n(this, b02, nVar, abstractC4825e);
    }

    @Override // B.AbstractC0168u1
    public final boolean d() {
        return ((Boolean) this.f6544B.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final float e(float f6) {
        return this.f6555j.e(f6);
    }

    public final void f(x xVar, boolean z10) {
        long c10;
        Object obj;
        int i10;
        int i11;
        A a5 = this.f6549d;
        int i12 = 0;
        boolean z11 = true;
        if (z10) {
            a5.f6528c.i(xVar.f6704k);
        } else {
            a5.getClass();
            C0659h c0659h = xVar.f6703j;
            if (c0659h != null) {
                obj = c0659h.f6627e;
            } else {
                obj = null;
            }
            a5.f6530e = obj;
            boolean z12 = a5.f6529d;
            List list = xVar.f6694a;
            if (z12 || (!list.isEmpty())) {
                a5.f6529d = true;
                if (c0659h != null) {
                    i11 = c0659h.f6623a;
                } else {
                    i11 = 0;
                }
                float f6 = xVar.f6704k;
                a5.f6527b.i(i11);
                a5.f6531f.b(i11);
                if (Math.abs(f6) == 0.0f) {
                    f6 = 0.0f;
                }
                a5.f6528c.i(f6);
            }
            if (this.f6557l != -1 && (!list.isEmpty())) {
                boolean z13 = this.f6559n;
                int i13 = xVar.f6701h;
                if (z13) {
                    i10 = ((C0659h) ((AbstractC0660i) kf.t.o2(list))).f6623a + i13 + 1;
                } else {
                    i10 = (((C0659h) ((AbstractC0660i) kf.t.f2(list))).f6623a - i13) - 1;
                }
                if (this.f6557l != i10) {
                    this.f6557l = -1;
                    O o10 = this.f6558m;
                    if (o10 != null) {
                        o10.cancel();
                    }
                    this.f6558m = null;
                }
            }
        }
        this.f6560o.setValue(xVar);
        this.f6544B.setValue(Boolean.valueOf(xVar.f6706m));
        C0659h c0659h2 = xVar.f6702i;
        if ((c0659h2 == null || c0659h2.f6623a == 0) && xVar.f6705l == 0) {
            z11 = false;
        }
        this.f6545C.setValue(Boolean.valueOf(z11));
        if (c0659h2 != null) {
            this.f6550e = c0659h2.f6623a;
        }
        this.f6551f = xVar.f6705l;
        int i14 = AbstractC3893i.f35891e;
        AbstractC3893i d10 = io.sentry.hints.i.d();
        try {
            AbstractC3893i j6 = d10.j();
            if (Math.abs(this.f6554i) > 0.5f && this.f6556k && l(this.f6554i)) {
                m(this.f6554i, xVar);
            }
            AbstractC3893i.p(j6);
            d10.c();
            int h10 = h();
            float f10 = L.f6581a;
            int i15 = xVar.f6695b;
            int i16 = xVar.f6696c;
            int i17 = ((((i15 + i16) * h10) + (-xVar.f6699f)) + xVar.f6697d) - i16;
            W0 w02 = W0.f1213Y;
            W0 w03 = xVar.f6698e;
            E0.O o11 = xVar.f6708o;
            if (w03 == w02) {
                c10 = Ng.H.c(o11.getWidth(), o11.getHeight()) & 4294967295L;
            } else {
                c10 = Ng.H.c(o11.getWidth(), o11.getHeight()) >> 32;
            }
            int i18 = i17 - ((int) c10);
            if (i18 >= 0) {
                i12 = i18;
            }
            this.f6552g = i12;
        } catch (Throwable th2) {
            d10.c();
            throw th2;
        }
    }

    public final r g() {
        return (r) this.f6560o.getValue();
    }

    public abstract int h();

    public final int i() {
        return ((x) this.f6560o.getValue()).f6695b;
    }

    public final int j() {
        return ((x) this.f6560o.getValue()).f6696c;
    }

    public final long k() {
        return ((C5251c) this.f6546a.getValue()).f43623a;
    }

    public final boolean l(float f6) {
        if (((x) g()).f6698e != W0.f1213Y ? Math.signum(f6) != Math.signum(-C5251c.d(k())) : Math.signum(f6) != Math.signum(-C5251c.e(k()))) {
            if (((int) C5251c.d(k())) != 0 || ((int) C5251c.e(k())) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void m(float f6, r rVar) {
        boolean z10;
        int i10;
        O o10;
        if (!this.f6556k) {
            return;
        }
        x xVar = (x) rVar;
        List list = xVar.f6694a;
        if (!list.isEmpty()) {
            if (f6 > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = xVar.f6701h;
            if (z10) {
                i10 = ((C0659h) ((AbstractC0660i) kf.t.o2(list))).f6623a + i11 + 1;
            } else {
                i10 = (((C0659h) ((AbstractC0660i) kf.t.f2(list))).f6623a - i11) - 1;
            }
            if (i10 != this.f6557l && i10 >= 0 && i10 < h()) {
                if (this.f6559n != z10 && (o10 = this.f6558m) != null) {
                    o10.cancel();
                }
                this.f6559n = z10;
                this.f6557l = i10;
                this.f6558m = this.f6565t.a(i10, this.f6570y);
            }
        }
    }
}
