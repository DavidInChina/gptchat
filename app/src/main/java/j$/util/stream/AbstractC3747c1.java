package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3747c1 implements H0 {
    @Override // j$.util.stream.H0
    public H0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj, int i10) {
    }

    public final void f(Object obj) {
    }

    @Override // j$.util.stream.H0
    public /* synthetic */ H0 h(long j6, long j10, IntFunction intFunction) {
        return AbstractC3855y0.S(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.H0
    public final Object[] o(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int q() {
        return 0;
    }
}
