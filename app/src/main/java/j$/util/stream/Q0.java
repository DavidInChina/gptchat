package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q0 extends T0 implements D0 {
    /* renamed from: b */
    public final /* synthetic */ void i(Double[] dArr, int i10) {
        AbstractC3855y0.J(this, dArr, i10);
    }

    @Override // j$.util.stream.G0
    public final Object c(int i10) {
        return new double[i10];
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3855y0.M(this, consumer);
    }

    /* renamed from: g */
    public final /* synthetic */ D0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.P(this, j6, j10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.m1, j$.util.O] */
    @Override // j$.util.stream.H0
    /* renamed from: spliterator */
    public final j$.util.O mo101spliterator() {
        return new AbstractC3797m1(this);
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo101spliterator() {
        return new AbstractC3797m1(this);
    }
}
