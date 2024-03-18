package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W3 extends AbstractC3750d {

    /* renamed from: j  reason: collision with root package name */
    private final AbstractC3745c f35555j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f35556k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f35557l;

    /* renamed from: m  reason: collision with root package name */
    private long f35558m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f35559n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f35560o;

    W3(W3 w32, Spliterator spliterator) {
        super(w32, spliterator);
        this.f35555j = w32.f35555j;
        this.f35556k = w32.f35556k;
        this.f35557l = w32.f35557l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W3(AbstractC3745c abstractC3745c, AbstractC3745c abstractC3745c2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3745c2, spliterator);
        this.f35555j = abstractC3745c;
        this.f35556k = intFunction;
        this.f35557l = EnumC3759e3.ORDERED.s(abstractC3745c2.s0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public final Object a() {
        C0 D02 = this.f35645a.D0(-1L, this.f35556k);
        AbstractC3818q2 W02 = this.f35555j.W0(this.f35645a.s0(), D02);
        AbstractC3855y0 abstractC3855y0 = this.f35645a;
        boolean g02 = abstractC3855y0.g0(this.f35646b, abstractC3855y0.J0(W02));
        this.f35559n = g02;
        if (g02) {
            i();
        }
        H0 mo102b = D02.mo102b();
        this.f35558m = mo102b.count();
        return mo102b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public final AbstractC3760f e(Spliterator spliterator) {
        return new W3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3750d
    protected final void h() {
        this.f35609i = true;
        if (!this.f35557l || !this.f35560o) {
            return;
        }
        f(AbstractC3855y0.j0(this.f35555j.P0()));
    }

    @Override // j$.util.stream.AbstractC3750d
    protected final Object j() {
        return AbstractC3855y0.j0(this.f35555j.P0());
    }

    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object obj;
        Object c10;
        AbstractC3760f abstractC3760f = this.f35648d;
        if (abstractC3760f != null) {
            this.f35559n = ((W3) abstractC3760f).f35559n | ((W3) this.f35649e).f35559n;
            if (!this.f35557l || !this.f35609i) {
                if (this.f35557l) {
                    W3 w32 = (W3) this.f35648d;
                    if (w32.f35559n) {
                        this.f35558m = w32.f35558m;
                        obj = (H0) w32.c();
                    }
                }
                W3 w33 = (W3) this.f35648d;
                long j6 = w33.f35558m;
                W3 w34 = (W3) this.f35649e;
                this.f35558m = j6 + w34.f35558m;
                if (w33.f35558m == 0) {
                    c10 = w34.c();
                } else if (w34.f35558m == 0) {
                    c10 = w33.c();
                } else {
                    obj = AbstractC3855y0.e0(this.f35555j.P0(), (H0) ((W3) this.f35648d).c(), (H0) ((W3) this.f35649e).c());
                }
                obj = (H0) c10;
            } else {
                this.f35558m = 0L;
                obj = AbstractC3855y0.j0(this.f35555j.P0());
            }
            f(obj);
        }
        this.f35560o = true;
        super.onCompletion(countedCompleter);
    }
}
