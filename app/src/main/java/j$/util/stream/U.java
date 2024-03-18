package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U extends CountedCompleter {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f35532h = 0;

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC3855y0 f35533a;

    /* renamed from: b  reason: collision with root package name */
    private Spliterator f35534b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35535c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap f35536d;

    /* renamed from: e  reason: collision with root package name */
    private final AbstractC3818q2 f35537e;

    /* renamed from: f  reason: collision with root package name */
    private final U f35538f;

    /* renamed from: g  reason: collision with root package name */
    private H0 f35539g;

    U(U u10, Spliterator spliterator, U u11) {
        super(u10);
        this.f35533a = u10.f35533a;
        this.f35534b = spliterator;
        this.f35535c = u10.f35535c;
        this.f35536d = u10.f35536d;
        this.f35537e = u10.f35537e;
        this.f35538f = u11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public U(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        super(null);
        this.f35533a = abstractC3855y0;
        this.f35534b = spliterator;
        this.f35535c = AbstractC3760f.g(spliterator.estimateSize());
        this.f35536d = new ConcurrentHashMap(Math.max(16, AbstractC3760f.b() << 1));
        this.f35537e = abstractC3818q2;
        this.f35538f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator mo106trySplit;
        Spliterator spliterator = this.f35534b;
        long j6 = this.f35535c;
        boolean z10 = false;
        U u10 = this;
        while (spliterator.estimateSize() > j6 && (mo106trySplit = spliterator.mo106trySplit()) != null) {
            U u11 = new U(u10, mo106trySplit, u10.f35538f);
            U u12 = new U(u10, spliterator, u11);
            u10.addToPendingCount(1);
            u12.addToPendingCount(1);
            u10.f35536d.put(u11, u12);
            if (u10.f35538f != null) {
                u11.addToPendingCount(1);
                if (u10.f35536d.replace(u10.f35538f, u10, u11)) {
                    u10.addToPendingCount(-1);
                } else {
                    u11.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = mo106trySplit;
                u10 = u11;
                u11 = u12;
            } else {
                u10 = u12;
            }
            z10 = !z10;
            u11.fork();
        }
        if (u10.getPendingCount() > 0) {
            C3740b c3740b = new C3740b(15);
            AbstractC3855y0 abstractC3855y0 = u10.f35533a;
            C0 D02 = abstractC3855y0.D0(abstractC3855y0.k0(spliterator), c3740b);
            u10.f35533a.I0(spliterator, D02);
            u10.f35539g = D02.mo102b();
            u10.f35534b = null;
        }
        u10.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        H0 h02 = this.f35539g;
        if (h02 != null) {
            h02.forEach(this.f35537e);
            this.f35539g = null;
        } else {
            Spliterator spliterator = this.f35534b;
            if (spliterator != null) {
                this.f35533a.I0(spliterator, this.f35537e);
                this.f35534b = null;
            }
        }
        U u10 = (U) this.f35536d.remove(this);
        if (u10 != null) {
            u10.tryComplete();
        }
    }
}
