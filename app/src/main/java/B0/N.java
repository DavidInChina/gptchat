package B0;

import G0.AbstractC0579h;
import H0.Y0;
import Ng.AbstractC1070k;
import Ng.C1072l;
import Ng.D0;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;
import q0.C5254f;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class N implements Z0.b, AbstractC4825e {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4825e f1610Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P f1611Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC1070k f1612h0;

    /* renamed from: i0  reason: collision with root package name */
    public EnumC0195l f1613i0 = EnumC0195l.f1657Z;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ P f1614j0;

    public N(P p10, C1072l c1072l) {
        this.f1614j0 = p10;
        this.f1610Y = c1072l;
        this.f1611Z = p10;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return this.f1611Z.C(i10);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return this.f1611Z.D(f6);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return this.f1611Z.J(i10);
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / this.f1611Z.b();
    }

    @Override // Z0.b
    public final float O() {
        return this.f1611Z.O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return this.f1611Z.b() * f6;
    }

    @Override // Z0.b
    public final int a0(float f6) {
        P p10 = this.f1611Z;
        p10.getClass();
        return R.a.b(f6, p10);
    }

    @Override // Z0.b
    public final float b() {
        return this.f1611Z.b();
    }

    public final Object c(EnumC0195l enumC0195l, AbstractC4825e abstractC4825e) {
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        this.f1613i0 = enumC0195l;
        this.f1612h0 = c1072l;
        Object t10 = c1072l.t();
        if (t10 == EnumC5000a.f41328Y) {
            com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
        }
        return t10;
    }

    public final long d() {
        P p10 = this.f1614j0;
        p10.getClass();
        long g10 = R.a.g(AbstractC0579h.A(p10).f24861y0.c(), p10);
        long j6 = p10.f1623y0;
        return AbstractC4828h.i(Math.max(0.0f, C5254f.d(g10) - ((int) (j6 >> 32))) / 2.0f, Math.max(0.0f, C5254f.b(g10) - ((int) (j6 & 4294967295L))) / 2.0f);
    }

    public final Y0 e() {
        P p10 = this.f1614j0;
        p10.getClass();
        return AbstractC0579h.A(p10).f24861y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Ng.l0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [Ng.l0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j6, wf.n nVar, AbstractC4825e abstractC4825e) {
        K k10;
        int i10;
        AbstractC1070k abstractC1070k;
        try {
            if (abstractC4825e instanceof K) {
                k10 = (K) abstractC4825e;
                int i11 = k10.f1603i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    k10.f1603i0 = i11 - Integer.MIN_VALUE;
                    Object obj = k10.f1601Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = k10.f1603i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            D0 d02 = k10.f1600Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            j6 = d02;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        if (j6 <= 0 && (abstractC1070k = this.f1612h0) != null) {
                            abstractC1070k.resumeWith(com.google.android.gms.internal.play_billing.N.w(new C0196m(j6)));
                        }
                        D0 O02 = Ad.l.O0(this.f1614j0.p0(), null, null, new L(j6, this, null), 3);
                        k10.f1600Y = O02;
                        k10.f1603i0 = 1;
                        obj = nVar.invoke(this, k10);
                        j6 = O02;
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return obj;
                }
            }
            if (i10 == 0) {
            }
            return obj;
        } finally {
            j6.k(C0185b.f1625Y);
        }
        k10 = new K(this, abstractC4825e);
        Object obj2 = k10.f1601Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = k10.f1603i0;
    }

    @Override // Z0.b
    public final long g0(long j6) {
        P p10 = this.f1611Z;
        p10.getClass();
        return R.a.g(j6, p10);
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return C4832l.f40334Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j6, wf.n nVar, AbstractC4825e abstractC4825e) {
        M m10;
        int i10;
        try {
            if (abstractC4825e instanceof M) {
                m10 = (M) abstractC4825e;
                int i11 = m10.f1609h0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    m10.f1609h0 = i11 - Integer.MIN_VALUE;
                    Object obj = m10.f1607Y;
                    Object obj2 = EnumC5000a.f41328Y;
                    i10 = m10.f1609h0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        m10.f1609h0 = 1;
                        obj = f(j6, nVar, m10);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return obj;
                }
            }
            if (i10 == 0) {
            }
            return obj;
        } catch (C0196m unused) {
            return null;
        }
        m10 = new M(this, abstractC4825e);
        Object obj3 = m10.f1607Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = m10.f1609h0;
    }

    @Override // Z0.b
    public final float i0(long j6) {
        P p10 = this.f1611Z;
        p10.getClass();
        return R.a.f(j6, p10);
    }

    @Override // Z0.b
    public final long p(long j6) {
        P p10 = this.f1611Z;
        p10.getClass();
        return R.a.e(j6, p10);
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        P p10 = this.f1614j0;
        synchronized (p10.f1620v0) {
            p10.f1620v0.m(this);
        }
        this.f1610Y.resumeWith(obj);
    }

    @Override // Z0.b
    public final float t(long j6) {
        P p10 = this.f1611Z;
        p10.getClass();
        return R.a.d(j6, p10);
    }
}
