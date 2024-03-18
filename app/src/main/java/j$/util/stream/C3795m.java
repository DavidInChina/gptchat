package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3795m implements Collector {

    /* renamed from: a  reason: collision with root package name */
    private final Supplier f35680a;

    /* renamed from: b  reason: collision with root package name */
    private final BiConsumer f35681b;

    /* renamed from: c  reason: collision with root package name */
    private final BinaryOperator f35682c;

    /* renamed from: d  reason: collision with root package name */
    private final Function f35683d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f35684e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3795m(N0 n02, N0 n03, C3740b c3740b, Set set) {
        Set set2 = Collectors.f35400a;
        C3740b c3740b2 = new C3740b(2);
        this.f35680a = n02;
        this.f35681b = n03;
        this.f35682c = c3740b;
        this.f35683d = c3740b2;
        this.f35684e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f35681b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f35684e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f35682c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f35683d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f35680a;
    }
}
