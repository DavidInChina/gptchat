package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3797m1 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    H0 f35685a;

    /* renamed from: b  reason: collision with root package name */
    int f35686b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f35687c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f35688d;

    /* renamed from: e  reason: collision with root package name */
    ArrayDeque f35689e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3797m1(H0 h02) {
        this.f35685a = h02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static H0 a(ArrayDeque arrayDeque) {
        while (true) {
            H0 h02 = (H0) arrayDeque.pollFirst();
            if (h02 != null) {
                if (h02.q() != 0) {
                    for (int q10 = h02.q() - 1; q10 >= 0; q10--) {
                        arrayDeque.addFirst(h02.a(q10));
                    }
                } else if (h02.count() > 0) {
                    return h02;
                }
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int q10 = this.f35685a.q();
        while (true) {
            q10--;
            if (q10 >= this.f35686b) {
                arrayDeque.addFirst(this.f35685a.a(q10));
            } else {
                return arrayDeque;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.f35685a == null) {
            return false;
        }
        if (this.f35688d != null) {
            return true;
        }
        Spliterator spliterator = this.f35687c;
        if (spliterator == null) {
            ArrayDeque b10 = b();
            this.f35689e = b10;
            H0 a5 = a(b10);
            if (a5 == null) {
                this.f35685a = null;
                return false;
            }
            spliterator = a5.mo101spliterator();
        }
        this.f35688d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j6 = 0;
        if (this.f35685a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f35687c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f35686b; i10 < this.f35685a.q(); i10++) {
            j6 += this.f35685a.a(i10).count();
        }
        return j6;
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
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        H0 h02 = this.f35685a;
        if (h02 == null || this.f35688d != null) {
            return null;
        }
        Spliterator spliterator = this.f35687c;
        if (spliterator != null) {
            return spliterator.mo106trySplit();
        }
        if (this.f35686b < h02.q() - 1) {
            H0 h03 = this.f35685a;
            int i10 = this.f35686b;
            this.f35686b = i10 + 1;
            return h03.a(i10).mo101spliterator();
        }
        H0 a5 = this.f35685a.a(this.f35686b);
        this.f35685a = a5;
        if (a5.q() == 0) {
            Spliterator mo101spliterator = this.f35685a.mo101spliterator();
            this.f35687c = mo101spliterator;
            return mo101spliterator.mo106trySplit();
        }
        H0 h04 = this.f35685a;
        this.f35686b = 1;
        return h04.a(0).mo101spliterator();
    }
}
