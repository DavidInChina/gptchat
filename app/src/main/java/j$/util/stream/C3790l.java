package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3790l implements java.util.stream.Collector {

    /* renamed from: a */
    public final /* synthetic */ Collector f35677a;

    private /* synthetic */ C3790l(Collector collector) {
        this.f35677a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C3785k ? ((C3785k) collector).f35674a : new C3790l(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f35677a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3855y0.q0(this.f35677a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f35677a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f35677a;
        if (obj instanceof C3790l) {
            obj = ((C3790l) obj).f35677a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f35677a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35677a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f35677a.supplier();
    }
}
