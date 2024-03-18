package e0;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* renamed from: e0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2742e implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2756s[] f28688Y;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f28690h0 = true;

    /* renamed from: Z  reason: collision with root package name */
    public int f28689Z = 0;

    public AbstractC2742e(C2755r c2755r, AbstractC2756s[] abstractC2756sArr) {
        this.f28688Y = abstractC2756sArr;
        abstractC2756sArr[0].a(Integer.bitCount(c2755r.f28711a) * 2, 0, c2755r.f28714d);
        a();
    }

    public final void a() {
        int i10 = this.f28689Z;
        AbstractC2756s[] abstractC2756sArr = this.f28688Y;
        AbstractC2756s abstractC2756s = abstractC2756sArr[i10];
        if (abstractC2756s.f28717h0 < abstractC2756s.f28716Z) {
            return;
        }
        while (-1 < i10) {
            int b10 = b(i10);
            if (b10 == -1) {
                AbstractC2756s abstractC2756s2 = abstractC2756sArr[i10];
                int i11 = abstractC2756s2.f28717h0;
                Object[] objArr = abstractC2756s2.f28715Y;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    abstractC2756s2.f28717h0 = i11 + 1;
                    b10 = b(i10);
                }
            }
            if (b10 != -1) {
                this.f28689Z = b10;
                return;
            }
            if (i10 > 0) {
                AbstractC2756s abstractC2756s3 = abstractC2756sArr[i10 - 1];
                int i12 = abstractC2756s3.f28717h0;
                int length2 = abstractC2756s3.f28715Y.length;
                abstractC2756s3.f28717h0 = i12 + 1;
            }
            abstractC2756sArr[i10].a(0, 0, C2755r.f28710e.f28714d);
            i10--;
        }
        this.f28690h0 = false;
    }

    public final int b(int i10) {
        AbstractC2756s[] abstractC2756sArr = this.f28688Y;
        AbstractC2756s abstractC2756s = abstractC2756sArr[i10];
        int i11 = abstractC2756s.f28717h0;
        if (i11 < abstractC2756s.f28716Z) {
            return i10;
        }
        Object[] objArr = abstractC2756s.f28715Y;
        if (i11 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i11];
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>", obj);
            C2755r c2755r = (C2755r) obj;
            if (i10 == 6) {
                AbstractC2756s abstractC2756s2 = abstractC2756sArr[i10 + 1];
                Object[] objArr2 = c2755r.f28714d;
                abstractC2756s2.a(objArr2.length, 0, objArr2);
            } else {
                abstractC2756sArr[i10 + 1].a(Integer.bitCount(c2755r.f28711a) * 2, 0, c2755r.f28714d);
            }
            return b(i10 + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28690h0;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f28690h0) {
            Object next = this.f28688Y[this.f28689Z].next();
            a();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
