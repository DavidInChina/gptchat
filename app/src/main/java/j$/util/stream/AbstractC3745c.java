package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3745c extends AbstractC3855y0 implements AbstractC3775i {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC3745c f35596h;

    /* renamed from: i  reason: collision with root package name */
    private final AbstractC3745c f35597i;

    /* renamed from: j  reason: collision with root package name */
    protected final int f35598j;

    /* renamed from: k  reason: collision with root package name */
    private AbstractC3745c f35599k;

    /* renamed from: l  reason: collision with root package name */
    private int f35600l;

    /* renamed from: m  reason: collision with root package name */
    private int f35601m;

    /* renamed from: n  reason: collision with root package name */
    private Spliterator f35602n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f35603o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f35604p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f35605q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f35606r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3745c(Spliterator spliterator, int i10, boolean z10) {
        this.f35597i = null;
        this.f35602n = spliterator;
        this.f35596h = this;
        int i11 = EnumC3759e3.f35623g & i10;
        this.f35598j = i11;
        this.f35601m = (~(i11 << 1)) & EnumC3759e3.f35628l;
        this.f35600l = 0;
        this.f35606r = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3745c(AbstractC3745c abstractC3745c, int i10) {
        if (!abstractC3745c.f35603o) {
            abstractC3745c.f35603o = true;
            abstractC3745c.f35599k = this;
            this.f35597i = abstractC3745c;
            this.f35598j = EnumC3759e3.f35624h & i10;
            this.f35601m = EnumC3759e3.g(i10, abstractC3745c.f35601m);
            AbstractC3745c abstractC3745c2 = abstractC3745c.f35596h;
            this.f35596h = abstractC3745c2;
            if (V0()) {
                abstractC3745c2.f35604p = true;
            }
            this.f35600l = abstractC3745c.f35600l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    private Spliterator X0(int i10) {
        int i11;
        int i12;
        AbstractC3745c abstractC3745c = this.f35596h;
        Spliterator spliterator = abstractC3745c.f35602n;
        if (spliterator != null) {
            abstractC3745c.f35602n = null;
            if (abstractC3745c.f35606r && abstractC3745c.f35604p) {
                AbstractC3745c abstractC3745c2 = abstractC3745c.f35599k;
                int i13 = 1;
                while (abstractC3745c != this) {
                    int i14 = abstractC3745c2.f35598j;
                    if (abstractC3745c2.V0()) {
                        if (EnumC3759e3.SHORT_CIRCUIT.s(i14)) {
                            i14 &= ~EnumC3759e3.f35637u;
                        }
                        spliterator = abstractC3745c2.U0(abstractC3745c, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i11 = (~EnumC3759e3.f35636t) & i14;
                            i12 = EnumC3759e3.f35635s;
                        } else {
                            i11 = (~EnumC3759e3.f35635s) & i14;
                            i12 = EnumC3759e3.f35636t;
                        }
                        i14 = i11 | i12;
                        i13 = 0;
                    }
                    abstractC3745c2.f35600l = i13;
                    abstractC3745c2.f35601m = EnumC3759e3.g(i14, abstractC3745c.f35601m);
                    i13++;
                    AbstractC3745c abstractC3745c3 = abstractC3745c2;
                    abstractC3745c2 = abstractC3745c2.f35599k;
                    abstractC3745c = abstractC3745c3;
                }
            }
            if (i10 != 0) {
                this.f35601m = EnumC3759e3.g(i10, this.f35601m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.AbstractC3855y0
    final AbstractC3818q2 I0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        f0(spliterator, J0((AbstractC3818q2) Objects.requireNonNull(abstractC3818q2)));
        return abstractC3818q2;
    }

    @Override // j$.util.stream.AbstractC3855y0
    final AbstractC3818q2 J0(AbstractC3818q2 abstractC3818q2) {
        Objects.requireNonNull(abstractC3818q2);
        AbstractC3745c abstractC3745c = this;
        while (abstractC3745c.f35600l > 0) {
            AbstractC3745c abstractC3745c2 = abstractC3745c.f35597i;
            abstractC3818q2 = abstractC3745c.W0(abstractC3745c2.f35601m, abstractC3818q2);
            abstractC3745c = abstractC3745c2;
        }
        return abstractC3818q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final H0 K0(Spliterator spliterator, boolean z10, IntFunction intFunction) {
        if (this.f35596h.f35606r) {
            return N0(this, spliterator, z10, intFunction);
        }
        C0 D02 = D0(k0(spliterator), intFunction);
        I0(spliterator, D02);
        return D02.mo102b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object L0(N3 n32) {
        if (!this.f35603o) {
            this.f35603o = true;
            return this.f35596h.f35606r ? n32.v(this, X0(n32.h())) : n32.y(this, X0(n32.h()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final H0 M0(IntFunction intFunction) {
        AbstractC3745c abstractC3745c;
        if (!this.f35603o) {
            this.f35603o = true;
            if (!this.f35596h.f35606r || (abstractC3745c = this.f35597i) == null || !V0()) {
                return K0(X0(0), true, intFunction);
            }
            this.f35600l = 0;
            return T0(abstractC3745c.X0(0), abstractC3745c, intFunction);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    abstract H0 N0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10, IntFunction intFunction);

    abstract boolean O0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC3764f3 P0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC3764f3 Q0() {
        AbstractC3745c abstractC3745c = this;
        while (abstractC3745c.f35600l > 0) {
            abstractC3745c = abstractC3745c.f35597i;
        }
        return abstractC3745c.P0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R0() {
        return EnumC3759e3.ORDERED.s(this.f35601m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator S0() {
        return X0(0);
    }

    H0 T0(Spliterator spliterator, AbstractC3745c abstractC3745c, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator U0(AbstractC3745c abstractC3745c, Spliterator spliterator) {
        return T0(spliterator, abstractC3745c, new C3740b(0)).mo101spliterator();
    }

    abstract boolean V0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator Y0() {
        AbstractC3745c abstractC3745c = this.f35596h;
        if (this == abstractC3745c) {
            if (this.f35603o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.f35603o = true;
            Spliterator spliterator = abstractC3745c.f35602n;
            if (spliterator == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            abstractC3745c.f35602n = null;
            return spliterator;
        }
        throw new IllegalStateException();
    }

    abstract Spliterator Z0(AbstractC3855y0 abstractC3855y0, C3735a c3735a, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator a1(Spliterator spliterator) {
        return this.f35600l == 0 ? spliterator : Z0(this, new C3735a(spliterator, 1), this.f35596h.f35606r);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f35603o = true;
        this.f35602n = null;
        AbstractC3745c abstractC3745c = this.f35596h;
        Runnable runnable = abstractC3745c.f35605q;
        if (runnable != null) {
            abstractC3745c.f35605q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.AbstractC3855y0
    final void f0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        Objects.requireNonNull(abstractC3818q2);
        if (EnumC3759e3.SHORT_CIRCUIT.s(this.f35601m)) {
            g0(spliterator, abstractC3818q2);
            return;
        }
        abstractC3818q2.l(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(abstractC3818q2);
        abstractC3818q2.k();
    }

    @Override // j$.util.stream.AbstractC3855y0
    final boolean g0(Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        AbstractC3745c abstractC3745c = this;
        while (abstractC3745c.f35600l > 0) {
            abstractC3745c = abstractC3745c.f35597i;
        }
        abstractC3818q2.l(spliterator.getExactSizeIfKnown());
        boolean O02 = abstractC3745c.O0(spliterator, abstractC3818q2);
        abstractC3818q2.k();
        return O02;
    }

    @Override // j$.util.stream.AbstractC3775i
    public final boolean isParallel() {
        return this.f35596h.f35606r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3855y0
    public final long k0(Spliterator spliterator) {
        if (EnumC3759e3.SIZED.s(this.f35601m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.AbstractC3775i
    public final AbstractC3775i onClose(Runnable runnable) {
        if (!this.f35603o) {
            Objects.requireNonNull(runnable);
            AbstractC3745c abstractC3745c = this.f35596h;
            Runnable runnable2 = abstractC3745c.f35605q;
            if (runnable2 != null) {
                runnable = new M3(runnable2, runnable);
            }
            abstractC3745c.f35605q = runnable;
            return this;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    public final AbstractC3775i parallel() {
        this.f35596h.f35606r = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3855y0
    public final int s0() {
        return this.f35601m;
    }

    public final AbstractC3775i sequential() {
        this.f35596h.f35606r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (!this.f35603o) {
            this.f35603o = true;
            AbstractC3745c abstractC3745c = this.f35596h;
            if (this != abstractC3745c) {
                return Z0(this, new C3735a(this, 0), abstractC3745c.f35606r);
            }
            Spliterator spliterator = abstractC3745c.f35602n;
            if (spliterator == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            abstractC3745c.f35602n = null;
            return spliterator;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
