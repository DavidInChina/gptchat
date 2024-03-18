package z;

import Z.AbstractC1703c;
import Z.C1722l0;
import Z.C1724m0;
import Z.V0;
import Z.l1;
import Z.o1;
import id.AbstractC3557B;
import nf.AbstractC4828h;

/* renamed from: z.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6721r0 implements l1 {

    /* renamed from: Y  reason: collision with root package name */
    public final C6737z0 f51356Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1724m0 f51357Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C1724m0 f51358h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C1724m0 f51359i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1724m0 f51360j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C1722l0 f51361k0 = new C1722l0(0);

    /* renamed from: l0  reason: collision with root package name */
    public final C1724m0 f51362l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1724m0 f51363m0;

    /* renamed from: n0  reason: collision with root package name */
    public AbstractC6726u f51364n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C6697f0 f51365o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f51366p0;

    public C6721r0(C6729v0 c6729v0, Object obj, AbstractC6726u abstractC6726u, C6737z0 c6737z0) {
        this.f51366p0 = c6729v0;
        this.f51356Y = c6737z0;
        o1 o1Var = o1.f22665a;
        C1724m0 Z10 = AbstractC4828h.Z(obj, o1Var);
        this.f51357Z = Z10;
        Object obj2 = null;
        this.f51358h0 = AbstractC4828h.Z(AbstractC6696f.u(0.0f, 0.0f, null, 7), o1Var);
        this.f51359i0 = AbstractC4828h.Z(new C6711m0(d(), c6737z0, obj, Z10.getValue(), abstractC6726u), o1Var);
        this.f51360j0 = AbstractC4828h.Z(Boolean.TRUE, o1Var);
        int i10 = AbstractC1703c.f22606b;
        this.f51362l0 = AbstractC4828h.Z(Boolean.FALSE, o1Var);
        this.f51363m0 = AbstractC4828h.Z(obj, o1Var);
        this.f51364n0 = abstractC6726u;
        Float f6 = (Float) AbstractC6670J0.f51158a.get(c6737z0);
        if (f6 != null) {
            float floatValue = f6.floatValue();
            AbstractC6726u abstractC6726u2 = (AbstractC6726u) c6737z0.f51416a.invoke(obj);
            int b10 = abstractC6726u2.b();
            for (int i11 = 0; i11 < b10; i11++) {
                abstractC6726u2.e(i11, floatValue);
            }
            obj2 = this.f51356Y.f51417b.invoke(abstractC6726u2);
        }
        this.f51365o0 = AbstractC6696f.u(0.0f, 0.0f, obj2, 3);
    }

    public static void e(C6721r0 c6721r0, Object obj, boolean z10, int i10) {
        AbstractC6659E d10;
        if ((i10 & 1) != 0) {
            obj = c6721r0.f51363m0.getValue();
        }
        Object obj2 = obj;
        if ((i10 & 2) == 0 && z10) {
            if (c6721r0.d() instanceof C6697f0) {
                d10 = c6721r0.d();
            } else {
                d10 = c6721r0.f51365o0;
            }
        } else {
            d10 = c6721r0.d();
        }
        AbstractC6659E abstractC6659E = d10;
        c6721r0.f51359i0.setValue(new C6711m0(abstractC6659E, c6721r0.f51356Y, obj2, c6721r0.f51357Z.getValue(), c6721r0.f51364n0));
        Boolean bool = Boolean.TRUE;
        C6729v0 c6729v0 = c6721r0.f51366p0;
        c6729v0.f51390g.setValue(bool);
        if (c6729v0.d()) {
            j0.u uVar = c6729v0.f51391h;
            int size = uVar.size();
            long j6 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                C6721r0 c6721r02 = (C6721r0) uVar.get(i11);
                j6 = Math.max(j6, c6721r02.b().f51327h);
                long j10 = c6729v0.f51394k;
                c6721r02.f51363m0.setValue(c6721r02.b().f(j10));
                c6721r02.f51364n0 = c6721r02.b().d(j10);
            }
            c6729v0.f51390g.setValue(Boolean.FALSE);
        }
    }

    public final C6711m0 b() {
        return (C6711m0) this.f51359i0.getValue();
    }

    public final AbstractC6659E d() {
        return (AbstractC6659E) this.f51358h0.getValue();
    }

    public final void f(Object obj, Object obj2, AbstractC6659E abstractC6659E) {
        this.f51357Z.setValue(obj2);
        this.f51358h0.setValue(abstractC6659E);
        if (AbstractC3557B.K(b().f51322c, obj) && AbstractC3557B.K(b().f51323d, obj2)) {
            return;
        }
        e(this, obj, false, 2);
    }

    public final void g(Object obj, AbstractC6659E abstractC6659E) {
        C1724m0 c1724m0 = this.f51357Z;
        boolean K10 = AbstractC3557B.K(c1724m0.getValue(), obj);
        C1724m0 c1724m02 = this.f51362l0;
        if (!K10 || ((Boolean) c1724m02.getValue()).booleanValue()) {
            c1724m0.setValue(obj);
            this.f51358h0.setValue(abstractC6659E);
            C1724m0 c1724m03 = this.f51360j0;
            e(this, null, !((Boolean) c1724m03.getValue()).booleanValue(), 1);
            Boolean bool = Boolean.FALSE;
            c1724m03.setValue(bool);
            C1722l0 c1722l0 = this.f51366p0.f51388e;
            this.f51361k0.h(((V0) j0.p.s(c1722l0.f22582Z, c1722l0)).f22577c);
            c1724m02.setValue(bool);
        }
    }

    @Override // Z.l1
    public final Object getValue() {
        return this.f51363m0.getValue();
    }

    public final String toString() {
        return "current value: " + this.f51363m0.getValue() + ", target: " + this.f51357Z.getValue() + ", spec: " + d();
    }
}
