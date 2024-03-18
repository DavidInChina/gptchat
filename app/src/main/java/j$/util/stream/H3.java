package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class H3 extends J3 implements Spliterator, Consumer {

    /* renamed from: f  reason: collision with root package name */
    Object f35429f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35429f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.J3
    protected final Spliterator c(Spliterator spliterator) {
        return new J3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C3794l3 c3794l3 = null;
        while (true) {
            I3 d10 = d();
            if (d10 != I3.NO_MORE) {
                I3 i32 = I3.MAYBE_MORE;
                Spliterator spliterator = this.f35447a;
                if (d10 != i32) {
                    spliterator.forEachRemaining(consumer);
                    return;
                }
                int i10 = this.f35449c;
                if (c3794l3 == null) {
                    c3794l3 = new C3794l3(i10);
                } else {
                    c3794l3.f35691a = 0;
                }
                long j6 = 0;
                while (spliterator.tryAdvance(c3794l3)) {
                    j6++;
                    if (j6 >= i10) {
                        break;
                    }
                }
                if (j6 == 0) {
                    return;
                }
                long a5 = a(j6);
                for (int i11 = 0; i11 < a5; i11++) {
                    consumer.accept(c3794l3.f35679b[i11]);
                }
            } else {
                return;
            }
        }
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != I3.NO_MORE && this.f35447a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.f35429f);
                this.f35429f = null;
                return true;
            }
        }
        return false;
    }
}
