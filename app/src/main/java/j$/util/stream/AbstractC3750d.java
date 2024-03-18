package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3750d extends AbstractC3760f {

    /* renamed from: h  reason: collision with root package name */
    protected final AtomicReference f35608h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f35609i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3750d(AbstractC3750d abstractC3750d, Spliterator spliterator) {
        super(abstractC3750d, spliterator);
        this.f35608h = abstractC3750d.f35608h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3750d(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        super(abstractC3855y0, spliterator);
        this.f35608h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC3760f
    public final Object c() {
        if (d()) {
            Object obj = this.f35608h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator mo106trySplit;
        Spliterator spliterator = this.f35646b;
        long estimateSize = spliterator.estimateSize();
        long j6 = this.f35647c;
        if (j6 == 0) {
            j6 = AbstractC3760f.g(estimateSize);
            this.f35647c = j6;
        }
        AtomicReference atomicReference = this.f35608h;
        boolean z10 = false;
        AbstractC3750d abstractC3750d = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z11 = abstractC3750d.f35609i;
            if (!z11) {
                CountedCompleter<?> completer = abstractC3750d.getCompleter();
                while (true) {
                    AbstractC3750d abstractC3750d2 = (AbstractC3750d) ((AbstractC3760f) completer);
                    if (z11 || abstractC3750d2 == null) {
                        break;
                    }
                    z11 = abstractC3750d2.f35609i;
                    completer = abstractC3750d2.getCompleter();
                }
            }
            if (z11) {
                obj = abstractC3750d.j();
                break;
            } else if (estimateSize <= j6 || (mo106trySplit = spliterator.mo106trySplit()) == null) {
                break;
            } else {
                AbstractC3750d abstractC3750d3 = (AbstractC3750d) abstractC3750d.e(mo106trySplit);
                abstractC3750d.f35648d = abstractC3750d3;
                AbstractC3750d abstractC3750d4 = (AbstractC3750d) abstractC3750d.e(spliterator);
                abstractC3750d.f35649e = abstractC3750d4;
                abstractC3750d.setPendingCount(1);
                if (z10) {
                    spliterator = mo106trySplit;
                    abstractC3750d = abstractC3750d3;
                    abstractC3750d3 = abstractC3750d4;
                } else {
                    abstractC3750d = abstractC3750d4;
                }
                z10 = !z10;
                abstractC3750d3.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        obj = abstractC3750d.a();
        abstractC3750d.f(obj);
        abstractC3750d.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3760f
    public final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj == null) {
        } else {
            AtomicReference atomicReference = this.f35608h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC3760f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.f35609i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC3750d abstractC3750d = this;
        for (AbstractC3750d abstractC3750d2 = (AbstractC3750d) ((AbstractC3760f) getCompleter()); abstractC3750d2 != null; abstractC3750d2 = (AbstractC3750d) ((AbstractC3760f) abstractC3750d2.getCompleter())) {
            if (abstractC3750d2.f35648d == abstractC3750d) {
                AbstractC3750d abstractC3750d3 = (AbstractC3750d) abstractC3750d2.f35649e;
                if (!abstractC3750d3.f35609i) {
                    abstractC3750d3.h();
                }
            }
            abstractC3750d = abstractC3750d2;
        }
    }

    protected abstract Object j();
}
