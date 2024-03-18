package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3737a1 extends AbstractC3747c1 implements F0 {
    @Override // j$.util.stream.AbstractC3747c1, j$.util.stream.H0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final /* synthetic */ void i(Long[] lArr, int i10) {
        AbstractC3855y0.L(this, lArr, i10);
    }

    @Override // j$.util.stream.G0
    public final Object e() {
        long[] jArr;
        jArr = AbstractC3855y0.f35778f;
        return jArr;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3855y0.O(this, consumer);
    }

    /* renamed from: g */
    public final /* synthetic */ F0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.R(this, j6, j10);
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator */
    public final j$.util.O mo101spliterator() {
        return Spliterators.d();
    }

    @Override // j$.util.stream.H0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo101spliterator() {
        return Spliterators.d();
    }
}
