package z;

import Z.AbstractC1703c;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1722l0;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import Z.V0;
import Z.o1;
import id.AbstractC3557B;
import nf.AbstractC4828h;

/* renamed from: z.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6729v0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6733x0 f51384a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51385b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f51386c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f51387d;

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f51390g;

    /* renamed from: j  reason: collision with root package name */
    public final C1724m0 f51393j;

    /* renamed from: k  reason: collision with root package name */
    public long f51394k;

    /* renamed from: e  reason: collision with root package name */
    public final C1722l0 f51388e = new C1722l0(0);

    /* renamed from: f  reason: collision with root package name */
    public final C1722l0 f51389f = new C1722l0(Long.MIN_VALUE);

    /* renamed from: h  reason: collision with root package name */
    public final j0.u f51391h = new j0.u();

    /* renamed from: i  reason: collision with root package name */
    public final j0.u f51392i = new j0.u();

    /* renamed from: l  reason: collision with root package name */
    public final Z.I f51395l = AbstractC4828h.E(new y.E(this, 1));

    public C6729v0(AbstractC6733x0 abstractC6733x0, String str) {
        this.f51384a = abstractC6733x0;
        this.f51385b = str;
        Object b10 = b();
        o1 o1Var = o1.f22665a;
        this.f51386c = AbstractC4828h.Z(b10, o1Var);
        this.f51387d = AbstractC4828h.Z(new C6719q0(b(), b()), o1Var);
        int i10 = AbstractC1703c.f22606b;
        this.f51390g = AbstractC4828h.Z(Boolean.TRUE, o1Var);
        this.f51393j = AbstractC4828h.Z(Boolean.FALSE, o1Var);
        abstractC6733x0.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (((java.lang.Boolean) r6.f51390g.getValue()).booleanValue() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1493585151);
        if ((i10 & 14) == 0) {
            if (rVar.g(obj)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.g(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else if (!d()) {
            h(obj, rVar, (i11 & 112) | (i11 & 14));
            if (AbstractC3557B.K(obj, b())) {
                C1722l0 c1722l0 = this.f51389f;
                if (((V0) j0.p.s(c1722l0.f22582Z, c1722l0)).f22577c == Long.MIN_VALUE) {
                }
            }
            rVar.W(-561029496);
            boolean g10 = rVar.g(this);
            Object K10 = rVar.K();
            if (g10 || K10 == C1723m.f22654Y) {
                K10 = new C6725t0(this, null);
                rVar.h0(K10);
            }
            rVar.t(false);
            AbstractC1734s.e(this, (wf.n) K10, rVar);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6727u0(this, obj, i10, 0);
        }
    }

    public final Object b() {
        return ((C6684Y) this.f51384a).f51196b.getValue();
    }

    public final AbstractC6717p0 c() {
        return (AbstractC6717p0) this.f51387d.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f51393j.getValue()).booleanValue();
    }

    public final void e(float f6, long j6) {
        int i10;
        long j10;
        C1722l0 c1722l0 = this.f51389f;
        if (((V0) j0.p.s(c1722l0.f22582Z, c1722l0)).f22577c == Long.MIN_VALUE) {
            c1722l0.h(j6);
            this.f51384a.f51403a.setValue(Boolean.TRUE);
        }
        this.f51390g.setValue(Boolean.FALSE);
        long j11 = j6 - ((V0) j0.p.s(c1722l0.f22582Z, c1722l0)).f22577c;
        C1722l0 c1722l02 = this.f51388e;
        c1722l02.h(j11);
        j0.u uVar = this.f51391h;
        int size = uVar.size();
        boolean z10 = true;
        for (int i11 = 0; i11 < size; i11 = i10 + 1) {
            C6721r0 c6721r0 = (C6721r0) uVar.get(i11);
            boolean booleanValue = ((Boolean) c6721r0.f51360j0.getValue()).booleanValue();
            C1724m0 c1724m0 = c6721r0.f51360j0;
            if (!booleanValue) {
                long j12 = ((V0) j0.p.s(c1722l02.f22582Z, c1722l02)).f22577c;
                int i12 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                C1722l0 c1722l03 = c6721r0.f51361k0;
                if (i12 > 0) {
                    i10 = i11;
                    float f10 = ((float) (j12 - ((V0) j0.p.s(c1722l03.f22582Z, c1722l03)).f22577c)) / f6;
                    if (!(!Float.isNaN(f10))) {
                        throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f6 + ",playTimeNanos: " + j12 + ", offsetTimeNanos: " + ((V0) j0.p.s(c1722l03.f22582Z, c1722l03)).f22577c).toString());
                    }
                    j10 = f10;
                } else {
                    i10 = i11;
                    j10 = c6721r0.b().f51327h;
                }
                c6721r0.f51363m0.setValue(c6721r0.b().f(j10));
                c6721r0.f51364n0 = c6721r0.b().d(j10);
                C6711m0 b10 = c6721r0.b();
                b10.getClass();
                if (AbstractC6708l.a(b10, j10)) {
                    c1724m0.setValue(Boolean.TRUE);
                    c1722l03.h(0L);
                }
            } else {
                i10 = i11;
            }
            if (!((Boolean) c1724m0.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        j0.u uVar2 = this.f51392i;
        int size2 = uVar2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C6729v0 c6729v0 = (C6729v0) uVar2.get(i13);
            if (!AbstractC3557B.K(c6729v0.f51386c.getValue(), c6729v0.b())) {
                c6729v0.e(f6, ((V0) j0.p.s(c1722l02.f22582Z, c1722l02)).f22577c);
            }
            if (!AbstractC3557B.K(c6729v0.f51386c.getValue(), c6729v0.b())) {
                z10 = false;
            }
        }
        if (z10) {
            f();
        }
    }

    public final void f() {
        this.f51389f.h(Long.MIN_VALUE);
        AbstractC6733x0 abstractC6733x0 = this.f51384a;
        if (abstractC6733x0 instanceof C6684Y) {
            ((C6684Y) abstractC6733x0).f51196b.setValue(this.f51386c.getValue());
        }
        this.f51388e.h(0L);
        abstractC6733x0.f51403a.setValue(Boolean.FALSE);
    }

    public final void g(long j6, Object obj, Object obj2) {
        this.f51389f.h(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        AbstractC6733x0 abstractC6733x0 = this.f51384a;
        abstractC6733x0.f51403a.setValue(bool);
        boolean d10 = d();
        C1724m0 c1724m0 = this.f51386c;
        if (!d10 || !AbstractC3557B.K(b(), obj) || !AbstractC3557B.K(c1724m0.getValue(), obj2)) {
            if (!AbstractC3557B.K(b(), obj) && (abstractC6733x0 instanceof C6684Y)) {
                ((C6684Y) abstractC6733x0).f51196b.setValue(obj);
            }
            c1724m0.setValue(obj2);
            this.f51393j.setValue(Boolean.TRUE);
            this.f51387d.setValue(new C6719q0(obj, obj2));
        }
        j0.u uVar = this.f51392i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6729v0 c6729v0 = (C6729v0) uVar.get(i10);
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>", c6729v0);
            if (c6729v0.d()) {
                c6729v0.g(j6, c6729v0.b(), c6729v0.f51386c.getValue());
            }
        }
        j0.u uVar2 = this.f51391h;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C6721r0 c6721r0 = (C6721r0) uVar2.get(i11);
            c6721r0.f51363m0.setValue(c6721r0.b().f(j6));
            c6721r0.f51364n0 = c6721r0.b().d(j6);
        }
        this.f51394k = j6;
    }

    public final void h(Object obj, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-583974681);
        if ((i10 & 14) == 0) {
            if (rVar.g(obj)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.g(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else if (!d()) {
            C1724m0 c1724m0 = this.f51386c;
            if (!AbstractC3557B.K(c1724m0.getValue(), obj)) {
                this.f51387d.setValue(new C6719q0(c1724m0.getValue(), obj));
                if (!AbstractC3557B.K(b(), c1724m0.getValue())) {
                    AbstractC6733x0 abstractC6733x0 = this.f51384a;
                    if (abstractC6733x0 instanceof C6684Y) {
                        ((C6684Y) abstractC6733x0).f51196b.setValue(c1724m0.getValue());
                    } else {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState".toString());
                    }
                }
                c1724m0.setValue(obj);
                C1722l0 c1722l0 = this.f51389f;
                if (((V0) j0.p.s(c1722l0.f22582Z, c1722l0)).f22577c == Long.MIN_VALUE) {
                    this.f51390g.setValue(Boolean.TRUE);
                }
                j0.u uVar = this.f51391h;
                int size = uVar.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((C6721r0) uVar.get(i14)).f51362l0.setValue(Boolean.TRUE);
                }
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6727u0(this, obj, i10, 1);
        }
    }

    public final String toString() {
        j0.u uVar;
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < this.f51391h.size(); i10++) {
            str = str + ((C6721r0) uVar.get(i10)) + ", ";
        }
        return str;
    }
}
