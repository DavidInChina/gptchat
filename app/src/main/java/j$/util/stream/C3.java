package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
abstract class C3 {

    /* renamed from: a  reason: collision with root package name */
    final long f35395a;

    /* renamed from: b  reason: collision with root package name */
    final long f35396b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f35397c;

    /* renamed from: d  reason: collision with root package name */
    long f35398d;

    /* renamed from: e  reason: collision with root package name */
    long f35399e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(Spliterator spliterator, long j6, long j10, long j11, long j12) {
        this.f35397c = spliterator;
        this.f35395a = j6;
        this.f35396b = j10;
        this.f35398d = j11;
        this.f35399e = j12;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j6, long j10, long j11, long j12);

    public final int characteristics() {
        return this.f35397c.characteristics();
    }

    public final long estimateSize() {
        long j6 = this.f35399e;
        long j10 = this.f35395a;
        if (j10 < j6) {
            return j6 - Math.max(j10, this.f35398d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j6 = this.f35399e;
        if (this.f35395a < j6 && this.f35398d < j6) {
            while (true) {
                Spliterator mo106trySplit = this.f35397c.mo106trySplit();
                if (mo106trySplit == null) {
                    return null;
                }
                long estimateSize = mo106trySplit.estimateSize() + this.f35398d;
                long min = Math.min(estimateSize, this.f35396b);
                long j10 = this.f35395a;
                if (j10 >= min) {
                    this.f35398d = min;
                } else {
                    long j11 = this.f35396b;
                    if (min < j11) {
                        long j12 = this.f35398d;
                        if (j12 < j10 || estimateSize > j11) {
                            this.f35398d = min;
                            return a(mo106trySplit, j10, j11, j12, min);
                        }
                        this.f35398d = min;
                        return mo106trySplit;
                    }
                    this.f35397c = mo106trySplit;
                    this.f35399e = min;
                }
            }
        } else {
            return null;
        }
    }
}
