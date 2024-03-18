package j$.util.concurrent;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j extends q implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f35293i;

    /* renamed from: j  reason: collision with root package name */
    long f35294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i10, int i11, int i12, long j6, int i13) {
        super(lVarArr, i10, i11, i12);
        this.f35293i = i13;
        this.f35294j = j6;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f35293i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f35293i) {
            case 0:
                return this.f35294j;
            default:
                return this.f35294j;
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f35293i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a5 = a();
                    if (a5 == null) {
                        return;
                    }
                    consumer.accept(a5.f35299b);
                }
            default:
                consumer.getClass();
                while (true) {
                    l a10 = a();
                    if (a10 == null) {
                        return;
                    }
                    consumer.accept(a10.f35300c);
                }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f35293i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f35293i) {
            case 0:
                return AbstractC3732p.d(this);
            default:
                return AbstractC3732p.d(this);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f35293i) {
            case 0:
                return AbstractC3732p.e(this, i10);
            default:
                return AbstractC3732p.e(this, i10);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f35293i) {
            case 0:
                consumer.getClass();
                l a5 = a();
                if (a5 == null) {
                    return false;
                }
                consumer.accept(a5.f35299b);
                return true;
            default:
                consumer.getClass();
                l a10 = a();
                if (a10 == null) {
                    return false;
                }
                consumer.accept(a10.f35300c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        switch (this.f35293i) {
            case 0:
                int i10 = this.f35311f;
                int i11 = this.f35312g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                l[] lVarArr = this.f35306a;
                this.f35312g = i12;
                long j6 = this.f35294j >>> 1;
                this.f35294j = j6;
                return new j(lVarArr, this.f35313h, i12, i11, j6, 0);
            default:
                int i13 = this.f35311f;
                int i14 = this.f35312g;
                int i15 = (i13 + i14) >>> 1;
                if (i15 <= i13) {
                    return null;
                }
                l[] lVarArr2 = this.f35306a;
                this.f35312g = i15;
                long j10 = this.f35294j >>> 1;
                this.f35294j = j10;
                return new j(lVarArr2, this.f35313h, i15, i14, j10, 1);
        }
    }
}
