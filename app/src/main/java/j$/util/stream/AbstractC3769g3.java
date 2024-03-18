package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.g3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3769g3 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final boolean f35654a;

    /* renamed from: b  reason: collision with root package name */
    final AbstractC3855y0 f35655b;

    /* renamed from: c  reason: collision with root package name */
    private Supplier f35656c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f35657d;

    /* renamed from: e  reason: collision with root package name */
    AbstractC3818q2 f35658e;

    /* renamed from: f  reason: collision with root package name */
    C3735a f35659f;

    /* renamed from: g  reason: collision with root package name */
    long f35660g;

    /* renamed from: h  reason: collision with root package name */
    AbstractC3755e f35661h;

    /* renamed from: i  reason: collision with root package name */
    boolean f35662i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3769g3(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, boolean z10) {
        this.f35655b = abstractC3855y0;
        this.f35656c = null;
        this.f35657d = spliterator;
        this.f35654a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3769g3(AbstractC3855y0 abstractC3855y0, C3735a c3735a, boolean z10) {
        this.f35655b = abstractC3855y0;
        this.f35656c = c3735a;
        this.f35657d = null;
        this.f35654a = z10;
    }

    private boolean b() {
        while (this.f35661h.count() == 0) {
            if (this.f35658e.n() || !this.f35659f.getAsBoolean()) {
                if (this.f35662i) {
                    return false;
                }
                this.f35658e.k();
                this.f35662i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC3755e abstractC3755e = this.f35661h;
        boolean z10 = false;
        if (abstractC3755e == null) {
            if (this.f35662i) {
                return false;
            }
            c();
            d();
            this.f35660g = 0L;
            this.f35658e.l(this.f35657d.getExactSizeIfKnown());
            return b();
        }
        long j6 = this.f35660g + 1;
        this.f35660g = j6;
        if (j6 < abstractC3755e.count()) {
            z10 = true;
        }
        if (z10) {
            return z10;
        }
        this.f35660g = 0L;
        this.f35661h.clear();
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f35657d == null) {
            this.f35657d = (Spliterator) this.f35656c.get();
            this.f35656c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int A10 = EnumC3759e3.A(this.f35655b.s0()) & EnumC3759e3.f35622f;
        return (A10 & 64) != 0 ? (A10 & (-16449)) | (this.f35657d.characteristics() & 16448) : A10;
    }

    abstract void d();

    abstract AbstractC3769g3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f35657d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC3732p.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC3759e3.SIZED.s(this.f35655b.s0())) {
            return this.f35657d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC3732p.e(this, i10);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f35657d);
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public Spliterator mo106trySplit() {
        if (!this.f35654a || this.f35661h != null || this.f35662i) {
            return null;
        }
        c();
        Spliterator mo106trySplit = this.f35657d.mo106trySplit();
        if (mo106trySplit != null) {
            return e(mo106trySplit);
        }
        return null;
    }
}
