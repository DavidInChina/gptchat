package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3785k implements Collector {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Collector f35674a;

    private /* synthetic */ C3785k(java.util.stream.Collector collector) {
        this.f35674a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C3790l ? ((C3790l) collector).f35677a : new C3785k(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f35674a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC3855y0.q0(this.f35674a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f35674a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C3785k) {
            obj = ((C3785k) obj).f35674a;
        }
        return this.f35674a.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f35674a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f35674a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f35674a.supplier();
    }
}
