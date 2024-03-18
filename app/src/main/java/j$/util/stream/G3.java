package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
abstract class G3 extends J3 implements j$.util.O {
    protected abstract void e(Object obj);

    protected abstract AbstractC3789k3 f(int i10);

    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC3789k3 abstractC3789k3 = null;
        while (true) {
            I3 d10 = d();
            if (d10 != I3.NO_MORE) {
                I3 i32 = I3.MAYBE_MORE;
                Spliterator spliterator = this.f35447a;
                if (d10 != i32) {
                    ((j$.util.O) spliterator).forEachRemaining(obj);
                    return;
                }
                int i10 = this.f35449c;
                if (abstractC3789k3 == null) {
                    abstractC3789k3 = f(i10);
                } else {
                    abstractC3789k3.f35676b = 0;
                }
                long j6 = 0;
                while (((j$.util.O) spliterator).tryAdvance(abstractC3789k3)) {
                    j6++;
                    if (j6 >= i10) {
                        break;
                    }
                }
                if (j6 == 0) {
                    return;
                }
                abstractC3789k3.a(obj, a(j6));
            } else {
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC3732p.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC3732p.e(this, i10);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != I3.NO_MORE && ((j$.util.O) this.f35447a).tryAdvance(this)) {
            if (a(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
