package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class A2 extends AbstractC3750d {

    /* renamed from: j  reason: collision with root package name */
    private final AbstractC3745c f35382j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f35383k;

    /* renamed from: l  reason: collision with root package name */
    private final long f35384l;

    /* renamed from: m  reason: collision with root package name */
    private final long f35385m;

    /* renamed from: n  reason: collision with root package name */
    private long f35386n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f35387o;

    A2(A2 a22, Spliterator spliterator) {
        super(a22, spliterator);
        this.f35382j = a22.f35382j;
        this.f35383k = a22.f35383k;
        this.f35384l = a22.f35384l;
        this.f35385m = a22.f35385m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(AbstractC3745c abstractC3745c, AbstractC3745c abstractC3745c2, Spliterator spliterator, IntFunction intFunction, long j6, long j10) {
        super(abstractC3745c2, spliterator);
        this.f35382j = abstractC3745c;
        this.f35383k = intFunction;
        this.f35384l = j6;
        this.f35385m = j10;
    }

    private long k(long j6) {
        if (this.f35387o) {
            return this.f35386n;
        }
        A2 a22 = (A2) this.f35648d;
        A2 a23 = (A2) this.f35649e;
        if (a22 == null || a23 == null) {
            return this.f35386n;
        }
        long k10 = a22.k(j6);
        return k10 >= j6 ? k10 : k10 + a23.k(j6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public final Object a() {
        long j6 = -1;
        if (d()) {
            if (EnumC3759e3.SIZED.w(this.f35382j.f35598j)) {
                j6 = this.f35382j.k0(this.f35646b);
            }
            C0 D02 = this.f35382j.D0(j6, this.f35383k);
            AbstractC3818q2 W02 = this.f35382j.W0(this.f35645a.s0(), D02);
            AbstractC3855y0 abstractC3855y0 = this.f35645a;
            abstractC3855y0.g0(this.f35646b, abstractC3855y0.J0(W02));
            return D02.mo102b();
        }
        C0 D03 = this.f35382j.D0(-1L, this.f35383k);
        if (this.f35384l == 0) {
            AbstractC3818q2 W03 = this.f35382j.W0(this.f35645a.s0(), D03);
            AbstractC3855y0 abstractC3855y02 = this.f35645a;
            abstractC3855y02.g0(this.f35646b, abstractC3855y02.J0(W03));
        } else {
            this.f35645a.I0(this.f35646b, D03);
        }
        H0 mo102b = D03.mo102b();
        this.f35386n = mo102b.count();
        this.f35387o = true;
        this.f35646b = null;
        return mo102b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public final AbstractC3760f e(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3750d
    protected final void h() {
        this.f35609i = true;
        if (this.f35387o) {
            f(AbstractC3855y0.j0(this.f35382j.P0()));
        }
    }

    @Override // j$.util.stream.AbstractC3750d
    protected final Object j() {
        return AbstractC3855y0.j0(this.f35382j.P0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r2 >= r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        A2 a22;
        H0 e02;
        AbstractC3760f abstractC3760f = this.f35648d;
        if (!(abstractC3760f == null)) {
            this.f35386n = ((A2) abstractC3760f).f35386n + ((A2) this.f35649e).f35386n;
            if (this.f35609i) {
                this.f35386n = 0L;
            } else if (this.f35386n != 0) {
                e02 = ((A2) this.f35648d).f35386n == 0 ? (H0) ((A2) this.f35649e).c() : AbstractC3855y0.e0(this.f35382j.P0(), (H0) ((A2) this.f35648d).c(), (H0) ((A2) this.f35649e).c());
                H0 h02 = e02;
                if (d()) {
                    h02 = h02.h(this.f35384l, this.f35385m >= 0 ? Math.min(h02.count(), this.f35384l + this.f35385m) : this.f35386n, this.f35383k);
                }
                f(h02);
                this.f35387o = true;
            }
            e02 = AbstractC3855y0.j0(this.f35382j.P0());
            H0 h022 = e02;
            if (d()) {
            }
            f(h022);
            this.f35387o = true;
        }
        if (this.f35385m >= 0 && !d()) {
            long j6 = this.f35384l + this.f35385m;
            long k10 = this.f35387o ? this.f35386n : k(j6);
            if (k10 < j6) {
                A2 a23 = (A2) ((AbstractC3760f) getCompleter());
                A2 a24 = this;
                while (true) {
                    if (a23 != null) {
                        if (a24 == a23.f35649e && (a22 = (A2) a23.f35648d) != null) {
                            k10 += a22.k(j6);
                            if (k10 >= j6) {
                                break;
                            }
                        }
                        a24 = a23;
                        a23 = (A2) ((AbstractC3760f) a23.getCompleter());
                    }
                }
            }
            i();
        }
        super.onCompletion(countedCompleter);
    }
}
