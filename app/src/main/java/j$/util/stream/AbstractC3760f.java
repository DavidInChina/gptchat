package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3760f extends CountedCompleter {

    /* renamed from: g  reason: collision with root package name */
    private static final int f35644g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC3855y0 f35645a;

    /* renamed from: b  reason: collision with root package name */
    protected Spliterator f35646b;

    /* renamed from: c  reason: collision with root package name */
    protected long f35647c;

    /* renamed from: d  reason: collision with root package name */
    protected AbstractC3760f f35648d;

    /* renamed from: e  reason: collision with root package name */
    protected AbstractC3760f f35649e;

    /* renamed from: f  reason: collision with root package name */
    private Object f35650f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3760f(AbstractC3760f abstractC3760f, Spliterator spliterator) {
        super(abstractC3760f);
        this.f35646b = spliterator;
        this.f35645a = abstractC3760f.f35645a;
        this.f35647c = abstractC3760f.f35647c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3760f(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        super(null);
        this.f35645a = abstractC3855y0;
        this.f35646b = spliterator;
        this.f35647c = 0L;
    }

    public static int b() {
        return f35644g;
    }

    public static long g(long j6) {
        long j10 = j6 / f35644g;
        if (j10 > 0) {
            return j10;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f35650f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator mo106trySplit;
        Spliterator spliterator = this.f35646b;
        long estimateSize = spliterator.estimateSize();
        long j6 = this.f35647c;
        if (j6 == 0) {
            j6 = g(estimateSize);
            this.f35647c = j6;
        }
        boolean z10 = false;
        AbstractC3760f abstractC3760f = this;
        while (estimateSize > j6 && (mo106trySplit = spliterator.mo106trySplit()) != null) {
            AbstractC3760f e10 = abstractC3760f.e(mo106trySplit);
            abstractC3760f.f35648d = e10;
            AbstractC3760f e11 = abstractC3760f.e(spliterator);
            abstractC3760f.f35649e = e11;
            abstractC3760f.setPendingCount(1);
            if (z10) {
                spliterator = mo106trySplit;
                abstractC3760f = e10;
                e10 = e11;
            } else {
                abstractC3760f = e11;
            }
            z10 = !z10;
            e10.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC3760f.f(abstractC3760f.a());
        abstractC3760f.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        return ((AbstractC3760f) getCompleter()) == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC3760f e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f35650f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f35650f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f35646b = null;
        this.f35649e = null;
        this.f35648d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException();
    }
}
