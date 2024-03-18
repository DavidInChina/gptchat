package g2;

import Ng.AbstractC1070k;
import Z.AbstractC1700a0;
import Z.C1713h;
import Z.C1723m;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import wf.AbstractC6216a;

/* renamed from: g2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3153k implements AbstractC1700a0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Ng.F f31100Y;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC6216a f31104j0;

    /* renamed from: n0  reason: collision with root package name */
    public long f31108n0;

    /* renamed from: o0  reason: collision with root package name */
    public AbstractC1070k f31109o0;

    /* renamed from: Z  reason: collision with root package name */
    public final int f31101Z = 5;

    /* renamed from: h0  reason: collision with root package name */
    public final int f31102h0 = 20;

    /* renamed from: i0  reason: collision with root package name */
    public final long f31103i0 = 5000;

    /* renamed from: k0  reason: collision with root package name */
    public final C1713h f31105k0 = new C1713h(new X0.b(5, this));

    /* renamed from: l0  reason: collision with root package name */
    public final Object f31106l0 = new Object();

    /* renamed from: m0  reason: collision with root package name */
    public int f31107m0 = 5;

    public C3153k(Ng.F f6) {
        C3150h c3150h = C3150h.f31092Y;
        this.f31100Y = f6;
        this.f31104j0 = c3150h;
    }

    public static final void b(C3153k c3153k, long j6) {
        c3153k.f31105k0.c(j6);
        synchronized (c3153k.f31106l0) {
            c3153k.f31108n0 = j6;
        }
    }

    @Override // Z.AbstractC1700a0
    public final Object S(wf.k kVar, AbstractC4825e abstractC4825e) {
        return this.f31105k0.S(kVar, abstractC4825e);
    }

    public final void c() {
        synchronized (this.f31106l0) {
            AbstractC1070k abstractC1070k = this.f31109o0;
            if (abstractC1070k != null) {
                abstractC1070k.s(null);
            }
        }
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, wf.n nVar) {
        return AbstractC4344b.j0(this, obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.s0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public final AbstractC4830j getKey() {
        return C1723m.f22655Z;
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.L0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        return AbstractC4344b.Q0(this, abstractC4831k);
    }
}
