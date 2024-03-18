package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3787k1 extends AbstractC3797m1 implements j$.util.O {
    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        if (this.f35685a == null) {
            return;
        }
        if (this.f35688d != null) {
            do {
            } while (tryAdvance(obj));
            return;
        }
        Spliterator spliterator = this.f35687c;
        if (spliterator != null) {
            ((j$.util.O) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque b10 = b();
        while (true) {
            G0 g02 = (G0) AbstractC3797m1.a(b10);
            if (g02 == null) {
                this.f35685a = null;
                return;
            }
            g02.f(obj);
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

    @Override // j$.util.O
    public final boolean tryAdvance(Object obj) {
        G0 g02;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.O) this.f35688d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f35687c == null && (g02 = (G0) AbstractC3797m1.a(this.f35689e)) != null) {
                j$.util.O mo101spliterator = g02.mo101spliterator();
                this.f35688d = mo101spliterator;
                return mo101spliterator.tryAdvance(obj);
            }
            this.f35685a = null;
        }
        return tryAdvance;
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
