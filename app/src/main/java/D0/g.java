package d0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends AbstractC2563a {

    /* renamed from: h0  reason: collision with root package name */
    public final Object[] f27833h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k f27834i0;

    public g(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        this.f27833h0 = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f27834i0 = new k(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            k kVar = this.f27834i0;
            if (kVar.hasNext()) {
                this.f27816Y++;
                return kVar.next();
            }
            int i10 = this.f27816Y;
            this.f27816Y = i10 + 1;
            return this.f27833h0[i10 - kVar.f27817Z];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f27816Y;
            k kVar = this.f27834i0;
            int i11 = kVar.f27817Z;
            if (i10 > i11) {
                int i12 = i10 - 1;
                this.f27816Y = i12;
                return this.f27833h0[i12 - i11];
            }
            this.f27816Y = i10 - 1;
            return kVar.previous();
        }
        throw new NoSuchElementException();
    }
}
