package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3821r1 extends AbstractC3836u1 implements AbstractC3808o2 {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f35716h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3821r1(Spliterator spliterator, AbstractC3855y0 abstractC3855y0, int[] iArr) {
        super(iArr.length, spliterator, abstractC3855y0);
        this.f35716h = iArr;
    }

    C3821r1(C3821r1 c3821r1, Spliterator spliterator, long j6, long j10) {
        super(c3821r1, spliterator, j6, j10, c3821r1.f35716h.length);
        this.f35716h = c3821r1.f35716h;
    }

    @Override // j$.util.stream.AbstractC3836u1
    final AbstractC3836u1 a(Spliterator spliterator, long j6, long j10) {
        return new C3821r1(this, spliterator, j6, j10);
    }

    @Override // j$.util.stream.AbstractC3836u1, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        int i11 = this.f35742f;
        if (i11 < this.f35743g) {
            int[] iArr = this.f35716h;
            this.f35742f = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f35742f));
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC3808o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3855y0.C(this, num);
    }
}
