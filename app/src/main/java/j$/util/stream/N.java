package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class N extends AbstractC3750d {

    /* renamed from: j  reason: collision with root package name */
    private final H f35480j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f35481k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(H h10, boolean z10, AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        super(abstractC3855y0, spliterator);
        this.f35481k = z10;
        this.f35480j = h10;
    }

    N(N n10, Spliterator spliterator) {
        super(n10, spliterator);
        this.f35481k = n10.f35481k;
        this.f35480j = n10.f35480j;
    }

    @Override // j$.util.stream.AbstractC3760f
    protected final Object a() {
        AbstractC3855y0 abstractC3855y0 = this.f35645a;
        O3 o32 = (O3) this.f35480j.f35425d.get();
        abstractC3855y0.I0(this.f35646b, o32);
        Object obj = o32.get();
        if (!this.f35481k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f35608h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            AbstractC3760f abstractC3760f = this;
            while (true) {
                if (abstractC3760f != null) {
                    AbstractC3760f abstractC3760f2 = (AbstractC3760f) abstractC3760f.getCompleter();
                    if (abstractC3760f2 != null && abstractC3760f2.f35648d != abstractC3760f) {
                        i();
                        break;
                    }
                    abstractC3760f = abstractC3760f2;
                } else {
                    AtomicReference atomicReference2 = this.f35608h;
                    while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                    }
                }
            }
            return obj;
        }
    }

    @Override // j$.util.stream.AbstractC3760f
    protected final AbstractC3760f e(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3750d
    protected final Object j() {
        return this.f35480j.f35423b;
    }

    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f35481k) {
            N n10 = (N) this.f35648d;
            N n11 = null;
            while (true) {
                if (n10 != n11) {
                    Object c10 = n10.c();
                    if (c10 != null && this.f35480j.f35424c.test(c10)) {
                        f(c10);
                        AbstractC3760f abstractC3760f = this;
                        while (true) {
                            if (abstractC3760f != null) {
                                AbstractC3760f abstractC3760f2 = (AbstractC3760f) abstractC3760f.getCompleter();
                                if (abstractC3760f2 != null && abstractC3760f2.f35648d != abstractC3760f) {
                                    i();
                                    break;
                                }
                                abstractC3760f = abstractC3760f2;
                            } else {
                                AtomicReference atomicReference = this.f35608h;
                                while (!atomicReference.compareAndSet(null, c10) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        n11 = n10;
                        n10 = (N) this.f35649e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
