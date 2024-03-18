package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3805o extends AbstractC3798m2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35702b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f35703c;

    /* renamed from: d  reason: collision with root package name */
    Object f35704d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AbstractC3745c f35705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805o(C3815q c3815q, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35705e = c3815q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805o(C3839v c3839v, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35705e = c3839v;
        AbstractC3818q2 abstractC3818q22 = this.f35690a;
        Objects.requireNonNull(abstractC3818q22);
        this.f35704d = new r(abstractC3818q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805o(C3844w c3844w, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35705e = c3844w;
        AbstractC3818q2 abstractC3818q22 = this.f35690a;
        Objects.requireNonNull(abstractC3818q22);
        this.f35704d = new W(abstractC3818q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805o(C3849x c3849x, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35705e = c3849x;
        AbstractC3818q2 abstractC3818q22 = this.f35690a;
        Objects.requireNonNull(abstractC3818q22);
        this.f35704d = new C3766g0(abstractC3818q22);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        G g10;
        int i10 = this.f35702b;
        AbstractC3745c abstractC3745c = this.f35705e;
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        switch (i10) {
            case 0:
                if (obj != null) {
                    Object obj2 = this.f35704d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else if (this.f35703c) {
                    return;
                } else {
                    this.f35703c = true;
                    obj = null;
                }
                this.f35704d = obj;
                abstractC3818q2.accept((AbstractC3818q2) obj);
                return;
            case 1:
                g10 = (AbstractC3811p0) ((Function) ((C3849x) abstractC3745c).f35763t).apply(obj);
                if (g10 != null) {
                    try {
                        if (!this.f35703c) {
                            g10.sequential().forEach((LongConsumer) this.f35704d);
                        } else {
                            j$.util.L spliterator = g10.sequential().spliterator();
                            while (!abstractC3818q2.n() && spliterator.tryAdvance((LongConsumer) this.f35704d)) {
                            }
                        }
                    } finally {
                        try {
                            g10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                if (g10 == null) {
                    return;
                }
                g10.close();
                return;
            case 2:
                g10 = (IntStream) ((Function) ((C3844w) abstractC3745c).f35756t).apply(obj);
                if (g10 != null) {
                    try {
                        if (!this.f35703c) {
                            g10.sequential().forEach((IntConsumer) this.f35704d);
                        } else {
                            j$.util.I spliterator2 = g10.sequential().spliterator();
                            while (!abstractC3818q2.n() && spliterator2.tryAdvance((IntConsumer) this.f35704d)) {
                            }
                        }
                    } finally {
                    }
                }
                if (g10 == null) {
                    return;
                }
                g10.close();
                return;
            default:
                g10 = (G) ((Function) ((C3839v) abstractC3745c).f35748t).apply(obj);
                if (g10 != null) {
                    try {
                        if (!this.f35703c) {
                            g10.sequential().forEach((DoubleConsumer) this.f35704d);
                        } else {
                            j$.util.F spliterator3 = g10.sequential().spliterator();
                            while (!abstractC3818q2.n() && spliterator3.tryAdvance((DoubleConsumer) this.f35704d)) {
                            }
                        }
                    } finally {
                    }
                }
                if (g10 == null) {
                    return;
                }
                g10.close();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void k() {
        switch (this.f35702b) {
            case 0:
                this.f35703c = false;
                this.f35704d = null;
                this.f35690a.k();
                return;
            default:
                super.k();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        int i10 = this.f35702b;
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        switch (i10) {
            case 0:
                this.f35703c = false;
                this.f35704d = null;
                abstractC3818q2.l(-1L);
                return;
            case 1:
                abstractC3818q2.l(-1L);
                return;
            case 2:
                abstractC3818q2.l(-1L);
                return;
            default:
                abstractC3818q2.l(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        int i10 = this.f35702b;
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        switch (i10) {
            case 1:
                this.f35703c = true;
                return abstractC3818q2.n();
            case 2:
                this.f35703c = true;
                return abstractC3818q2.n();
            case 3:
                this.f35703c = true;
                return abstractC3818q2.n();
            default:
                return abstractC3818q2.n();
        }
    }
}
