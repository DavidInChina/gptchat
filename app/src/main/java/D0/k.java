package d0;

import Ng.H;
import id.AbstractC3557B;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k extends AbstractC2563a {

    /* renamed from: h0  reason: collision with root package name */
    public int f27842h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object[] f27843i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f27844j0;

    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        boolean z10;
        this.f27842h0 = i12;
        Object[] objArr2 = new Object[i12];
        this.f27843i0 = objArr2;
        if (i10 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27844j0 = z10;
        objArr2[0] = objArr;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        b(i10 - i13, 1);
    }

    public final Object a() {
        Object obj = this.f27843i0[this.f27842h0 - 1];
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>", obj);
        return ((Object[]) obj)[this.f27816Y & 31];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f27842h0 - i11) * 5;
        while (i11 < this.f27842h0) {
            Object[] objArr = this.f27843i0;
            Object[] objArr2 = objArr[i11 - 1];
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objArr2);
            objArr[i11] = objArr2[H.s(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (H.s(this.f27816Y, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f27816Y, ((this.f27842h0 - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a5 = a();
            int i10 = this.f27816Y + 1;
            this.f27816Y = i10;
            if (i10 == this.f27817Z) {
                this.f27844j0 = true;
                return a5;
            }
            c(0);
            return a5;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.f27816Y--;
            if (this.f27844j0) {
                this.f27844j0 = false;
                return a();
            }
            c(31);
            return a();
        }
        throw new NoSuchElementException();
    }
}
