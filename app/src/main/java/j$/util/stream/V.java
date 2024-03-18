package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private Spliterator f35542a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC3818q2 f35543b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC3855y0 f35544c;

    /* renamed from: d  reason: collision with root package name */
    private long f35545d;

    V(V v10, Spliterator spliterator) {
        super(v10);
        this.f35542a = spliterator;
        this.f35543b = v10.f35543b;
        this.f35545d = v10.f35545d;
        this.f35544c = v10.f35544c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(AbstractC3855y0 abstractC3855y0, Spliterator spliterator, AbstractC3818q2 abstractC3818q2) {
        super(null);
        this.f35543b = abstractC3818q2;
        this.f35544c = abstractC3855y0;
        this.f35542a = spliterator;
        this.f35545d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator mo106trySplit;
        Spliterator spliterator = this.f35542a;
        long estimateSize = spliterator.estimateSize();
        long j6 = this.f35545d;
        if (j6 == 0) {
            j6 = AbstractC3760f.g(estimateSize);
            this.f35545d = j6;
        }
        boolean s10 = EnumC3759e3.SHORT_CIRCUIT.s(this.f35544c.s0());
        AbstractC3818q2 abstractC3818q2 = this.f35543b;
        boolean z10 = false;
        V v10 = this;
        while (true) {
            if (s10 && abstractC3818q2.n()) {
                break;
            } else if (estimateSize <= j6 || (mo106trySplit = spliterator.mo106trySplit()) == null) {
                break;
            } else {
                V v11 = new V(v10, mo106trySplit);
                v10.addToPendingCount(1);
                if (z10) {
                    spliterator = mo106trySplit;
                } else {
                    V v12 = v10;
                    v10 = v11;
                    v11 = v12;
                }
                z10 = !z10;
                v10.fork();
                v10 = v11;
                estimateSize = spliterator.estimateSize();
            }
        }
        v10.f35544c.f0(spliterator, abstractC3818q2);
        v10.f35542a = null;
        v10.propagateCompletion();
    }
}
