package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3831t1 extends AbstractC3836u1 {

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f35729h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3831t1(Spliterator spliterator, AbstractC3855y0 abstractC3855y0, Object[] objArr) {
        super(objArr.length, spliterator, abstractC3855y0);
        this.f35729h = objArr;
    }

    C3831t1(C3831t1 c3831t1, Spliterator spliterator, long j6, long j10) {
        super(c3831t1, spliterator, j6, j10, c3831t1.f35729h.length);
        this.f35729h = c3831t1.f35729h;
    }

    @Override // j$.util.stream.AbstractC3836u1
    final AbstractC3836u1 a(Spliterator spliterator, long j6, long j10) {
        return new C3831t1(this, spliterator, j6, j10);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f35742f;
        if (i10 < this.f35743g) {
            Object[] objArr = this.f35729h;
            this.f35742f = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f35742f));
    }
}
