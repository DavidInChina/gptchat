package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class L3 extends AbstractC3769g3 {
    @Override // j$.util.stream.AbstractC3769g3
    final void d() {
        C3739a3 c3739a3 = new C3739a3();
        this.f35661h = c3739a3;
        Objects.requireNonNull(c3739a3);
        this.f35658e = this.f35655b.J0(new K3(c3739a3, 0));
        this.f35659f = new C3735a(this, 6);
    }

    @Override // j$.util.stream.AbstractC3769g3
    final AbstractC3769g3 e(Spliterator spliterator) {
        return new AbstractC3769g3(this.f35655b, spliterator, this.f35654a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f35661h != null || this.f35662i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        K3 k32 = new K3(consumer, 1);
        this.f35655b.I0(this.f35657d, k32);
        this.f35662i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a5 = a();
        if (a5) {
            C3739a3 c3739a3 = (C3739a3) this.f35661h;
            long j6 = this.f35660g;
            if (c3739a3.f35615c != 0) {
                if (j6 >= c3739a3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j6));
                }
                for (int i10 = 0; i10 <= c3739a3.f35615c; i10++) {
                    long j10 = c3739a3.f35616d[i10];
                    Object[] objArr = c3739a3.f35589f[i10];
                    if (j6 < objArr.length + j10) {
                        obj = objArr[(int) (j6 - j10)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j6));
            } else if (j6 >= c3739a3.f35614b) {
                throw new IndexOutOfBoundsException(Long.toString(j6));
            } else {
                obj = c3739a3.f35588e[(int) j6];
            }
            consumer.accept(obj);
        }
        return a5;
    }
}
