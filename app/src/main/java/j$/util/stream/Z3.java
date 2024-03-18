package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Z3 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final Spliterator f35577a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f35578b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f35579c;

    /* renamed from: d  reason: collision with root package name */
    boolean f35580d;

    /* renamed from: e  reason: collision with root package name */
    int f35581e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z3(Spliterator spliterator) {
        this.f35580d = true;
        this.f35577a = spliterator;
        this.f35578b = false;
        this.f35579c = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z3(Spliterator spliterator, Z3 z32) {
        this.f35580d = true;
        this.f35577a = spliterator;
        this.f35578b = z32.f35578b;
        this.f35579c = z32.f35579c;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f35577a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f35577a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        do {
        } while (((X3) this).tryAdvance(consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f35577a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC3732p.e(this, i10);
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public Spliterator mo106trySplit() {
        X3 x32;
        Spliterator mo106trySplit = this.f35578b ? null : this.f35577a.mo106trySplit();
        if (mo106trySplit != null) {
            X3 x33 = (X3) this;
            switch (x33.f35562h) {
                case 0:
                    x32 = new X3(mo106trySplit, x33, 0);
                    break;
                default:
                    x32 = new X3(mo106trySplit, x33, 1);
                    break;
            }
            return x32;
        }
        return null;
    }
}
