package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3836u1 extends CountedCompleter implements AbstractC3818q2 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f35737a;

    /* renamed from: b  reason: collision with root package name */
    protected final AbstractC3855y0 f35738b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f35739c;

    /* renamed from: d  reason: collision with root package name */
    protected long f35740d;

    /* renamed from: e  reason: collision with root package name */
    protected long f35741e;

    /* renamed from: f  reason: collision with root package name */
    protected int f35742f;

    /* renamed from: g  reason: collision with root package name */
    protected int f35743g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3836u1(int i10, Spliterator spliterator, AbstractC3855y0 abstractC3855y0) {
        this.f35737a = spliterator;
        this.f35738b = abstractC3855y0;
        this.f35739c = AbstractC3760f.g(spliterator.estimateSize());
        this.f35740d = 0L;
        this.f35741e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3836u1(AbstractC3836u1 abstractC3836u1, Spliterator spliterator, long j6, long j10, int i10) {
        super(abstractC3836u1);
        this.f35737a = spliterator;
        this.f35738b = abstractC3836u1.f35738b;
        this.f35739c = abstractC3836u1.f35739c;
        this.f35740d = j6;
        this.f35741e = j10;
        if (j6 < 0 || j10 < 0 || (j6 + j10) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j6), Long.valueOf(j6), Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    abstract AbstractC3836u1 a(Spliterator spliterator, long j6, long j10);

    public /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    public /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator mo106trySplit;
        Spliterator spliterator = this.f35737a;
        AbstractC3836u1 abstractC3836u1 = this;
        while (spliterator.estimateSize() > abstractC3836u1.f35739c && (mo106trySplit = spliterator.mo106trySplit()) != null) {
            abstractC3836u1.setPendingCount(1);
            long estimateSize = mo106trySplit.estimateSize();
            abstractC3836u1.a(mo106trySplit, abstractC3836u1.f35740d, estimateSize).fork();
            abstractC3836u1 = abstractC3836u1.a(spliterator, abstractC3836u1.f35740d + estimateSize, abstractC3836u1.f35741e - estimateSize);
        }
        abstractC3836u1.f35738b.I0(spliterator, abstractC3836u1);
        abstractC3836u1.propagateCompletion();
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        long j10 = this.f35741e;
        if (j6 <= j10) {
            int i10 = (int) this.f35740d;
            this.f35742f = i10;
            this.f35743g = i10 + ((int) j10);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
