package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class V3 extends AbstractC3760f {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC3745c f35548h;

    /* renamed from: i  reason: collision with root package name */
    private final IntFunction f35549i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f35550j;

    /* renamed from: k  reason: collision with root package name */
    private long f35551k;

    /* renamed from: l  reason: collision with root package name */
    private long f35552l;

    V3(V3 v32, Spliterator spliterator) {
        super(v32, spliterator);
        this.f35548h = v32.f35548h;
        this.f35549i = v32.f35549i;
        this.f35550j = v32.f35550j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V3(AbstractC3745c abstractC3745c, AbstractC3745c abstractC3745c2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3745c2, spliterator);
        this.f35548h = abstractC3745c;
        this.f35549i = intFunction;
        this.f35550j = EnumC3759e3.ORDERED.s(abstractC3745c2.s0());
    }

    @Override // j$.util.stream.AbstractC3760f
    protected final Object a() {
        boolean z10 = true;
        boolean z11 = !d();
        C0 D02 = this.f35645a.D0((!z11 || !this.f35550j || !EnumC3759e3.SIZED.w(this.f35548h.f35598j)) ? -1L : this.f35548h.k0(this.f35646b), this.f35549i);
        U3 u32 = (U3) this.f35548h;
        if (!this.f35550j || !z11) {
            z10 = false;
        }
        T3 t32 = (T3) u32;
        t32.getClass();
        S3 s32 = new S3(t32, D02, z10);
        this.f35645a.I0(this.f35646b, s32);
        H0 mo102b = D02.mo102b();
        this.f35551k = mo102b.count();
        this.f35552l = s32.f35525b;
        return mo102b;
    }

    @Override // j$.util.stream.AbstractC3760f
    protected final AbstractC3760f e(Spliterator spliterator) {
        return new V3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        H0 e02;
        Object c10;
        H0 h02;
        AbstractC3760f abstractC3760f = this.f35648d;
        if (abstractC3760f != null) {
            if (this.f35550j) {
                V3 v32 = (V3) abstractC3760f;
                long j6 = v32.f35552l;
                this.f35552l = j6;
                if (j6 == v32.f35551k) {
                    this.f35552l = j6 + ((V3) this.f35649e).f35552l;
                }
            }
            V3 v33 = (V3) abstractC3760f;
            long j10 = v33.f35551k;
            V3 v34 = (V3) this.f35649e;
            this.f35551k = j10 + v34.f35551k;
            if (v33.f35551k == 0) {
                c10 = v34.c();
            } else if (v34.f35551k == 0) {
                c10 = v33.c();
            } else {
                e02 = AbstractC3855y0.e0(this.f35548h.P0(), (H0) ((V3) this.f35648d).c(), (H0) ((V3) this.f35649e).c());
                h02 = e02;
                if (d() && this.f35550j) {
                    h02 = h02.h(this.f35552l, h02.count(), this.f35549i);
                }
                f(h02);
            }
            e02 = (H0) c10;
            h02 = e02;
            if (d()) {
                h02 = h02.h(this.f35552l, h02.count(), this.f35549i);
            }
            f(h02);
        }
        super.onCompletion(countedCompleter);
    }
}
