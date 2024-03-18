package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3826s1 extends AbstractC3836u1 implements AbstractC3813p2 {

    /* renamed from: h  reason: collision with root package name */
    private final long[] f35722h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3826s1(Spliterator spliterator, AbstractC3855y0 abstractC3855y0, long[] jArr) {
        super(jArr.length, spliterator, abstractC3855y0);
        this.f35722h = jArr;
    }

    C3826s1(C3826s1 c3826s1, Spliterator spliterator, long j6, long j10) {
        super(c3826s1, spliterator, j6, j10, c3826s1.f35722h.length);
        this.f35722h = c3826s1.f35722h;
    }

    @Override // j$.util.stream.AbstractC3836u1
    final AbstractC3836u1 a(Spliterator spliterator, long j6, long j10) {
        return new C3826s1(this, spliterator, j6, j10);
    }

    @Override // j$.util.stream.AbstractC3836u1, j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        int i10 = this.f35742f;
        if (i10 < this.f35743g) {
            long[] jArr = this.f35722h;
            this.f35742f = i10 + 1;
            jArr[i10] = j6;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f35742f));
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
    }
}
