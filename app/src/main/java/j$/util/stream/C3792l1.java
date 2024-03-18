package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3792l1 extends AbstractC3797m1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f35685a == null) {
            return;
        }
        if (this.f35688d != null) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Spliterator spliterator = this.f35687c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque b10 = b();
        while (true) {
            H0 a5 = AbstractC3797m1.a(b10);
            if (a5 == null) {
                this.f35685a = null;
                return;
            }
            a5.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        H0 a5;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.f35688d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f35687c == null && (a5 = AbstractC3797m1.a(this.f35689e)) != null) {
                Spliterator mo101spliterator = a5.mo101spliterator();
                this.f35688d = mo101spliterator;
                return mo101spliterator.tryAdvance(consumer);
            }
            this.f35685a = null;
        }
        return tryAdvance;
    }
}
