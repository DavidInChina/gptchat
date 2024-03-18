package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
abstract class J3 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f35447a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f35448b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f35449c;

    /* renamed from: d  reason: collision with root package name */
    private final long f35450d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f35451e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(Spliterator spliterator, long j6, long j10) {
        this.f35447a = spliterator;
        long j11 = 0;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        this.f35448b = i10 < 0;
        this.f35450d = i10 >= 0 ? j10 : j11;
        this.f35449c = 128;
        this.f35451e = new AtomicLong(i10 >= 0 ? j6 + j10 : j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(Spliterator spliterator, J3 j32) {
        this.f35447a = spliterator;
        this.f35448b = j32.f35448b;
        this.f35451e = j32.f35451e;
        this.f35450d = j32.f35450d;
        this.f35449c = j32.f35449c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long a(long j6) {
        AtomicLong atomicLong;
        long j10;
        boolean z10;
        long min;
        do {
            atomicLong = this.f35451e;
            j10 = atomicLong.get();
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            z10 = this.f35448b;
            if (i10 != 0) {
                min = Math.min(j10, j6);
                if (min <= 0) {
                    break;
                }
            } else if (!z10) {
                return 0L;
            } else {
                return j6;
            }
        } while (!atomicLong.compareAndSet(j10, j10 - min));
        if (z10) {
            return Math.max(j6 - min, 0L);
        }
        long j11 = this.f35450d;
        return j10 > j11 ? Math.max(min - (j10 - j11), 0L) : min;
    }

    protected abstract Spliterator c(Spliterator spliterator);

    public final int characteristics() {
        return this.f35447a.characteristics() & (-16465);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final I3 d() {
        return this.f35451e.get() > 0 ? I3.MAYBE_MORE : this.f35448b ? I3.UNLIMITED : I3.NO_MORE;
    }

    public final long estimateSize() {
        return this.f35447a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator mo106trySplit;
        if (this.f35451e.get() == 0 || (mo106trySplit = this.f35447a.mo106trySplit()) == null) {
            return null;
        }
        return c(mo106trySplit);
    }
}
