package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes3.dex */
abstract class T0 extends J0 implements G0 {
    @Override // j$.util.stream.G0
    public final void d(Object obj, int i10) {
        H0 h02 = this.f35441a;
        ((G0) h02).d(obj, i10);
        ((G0) this.f35442b).d(obj, i10 + ((int) ((G0) h02).count()));
    }

    @Override // j$.util.stream.G0
    public final Object e() {
        long count = count();
        if (count < 2147483639) {
            Object c10 = c((int) count);
            d(c10, 0);
            return c10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.G0
    public final void f(Object obj) {
        ((G0) this.f35441a).f(obj);
        ((G0) this.f35442b).f(obj);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC3855y0.I(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f35441a, this.f35442b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
