package e0;

import M3.H;
import id.AbstractC3557B;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: e0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2744g extends AbstractC2742e {

    /* renamed from: i0  reason: collision with root package name */
    public final C2743f f28697i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f28698j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f28699k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f28700l0;

    public C2744g(C2743f c2743f, AbstractC2756s[] abstractC2756sArr) {
        super(c2743f.f28693h0, abstractC2756sArr);
        this.f28697i0 = c2743f;
        this.f28700l0 = c2743f.f28695j0;
    }

    public final void c(int i10, C2755r c2755r, Object obj, int i11) {
        int i12 = i11 * 5;
        AbstractC2756s[] abstractC2756sArr = this.f28688Y;
        if (i12 > 30) {
            AbstractC2756s abstractC2756s = abstractC2756sArr[i11];
            Object[] objArr = c2755r.f28714d;
            abstractC2756s.a(objArr.length, 0, objArr);
            while (true) {
                AbstractC2756s abstractC2756s2 = abstractC2756sArr[i11];
                if (!AbstractC3557B.K(abstractC2756s2.f28715Y[abstractC2756s2.f28717h0], obj)) {
                    abstractC2756sArr[i11].f28717h0 += 2;
                } else {
                    this.f28689Z = i11;
                    return;
                }
            }
        } else {
            int Z10 = 1 << H.Z(i10, i12);
            if (c2755r.h(Z10)) {
                abstractC2756sArr[i11].a(Integer.bitCount(c2755r.f28711a) * 2, c2755r.f(Z10), c2755r.f28714d);
                this.f28689Z = i11;
                return;
            }
            int t10 = c2755r.t(Z10);
            C2755r s10 = c2755r.s(t10);
            abstractC2756sArr[i11].a(Integer.bitCount(c2755r.f28711a) * 2, t10, c2755r.f28714d);
            c(i10, s10, obj, i11 + 1);
        }
    }

    @Override // e0.AbstractC2742e, java.util.Iterator
    public final Object next() {
        if (this.f28697i0.f28695j0 == this.f28700l0) {
            if (this.f28690h0) {
                AbstractC2756s abstractC2756s = this.f28688Y[this.f28689Z];
                this.f28698j0 = abstractC2756s.f28715Y[abstractC2756s.f28717h0];
                this.f28699k0 = true;
                return super.next();
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // e0.AbstractC2742e, java.util.Iterator
    public final void remove() {
        int i10;
        if (this.f28699k0) {
            boolean z10 = this.f28690h0;
            C2743f c2743f = this.f28697i0;
            if (z10) {
                if (z10) {
                    AbstractC2756s abstractC2756s = this.f28688Y[this.f28689Z];
                    Object obj = abstractC2756s.f28715Y[abstractC2756s.f28717h0];
                    Object obj2 = this.f28698j0;
                    Ad.l.I(c2743f);
                    c2743f.remove(obj2);
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = 0;
                    }
                    c(i10, c2743f.f28693h0, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Object obj3 = this.f28698j0;
                Ad.l.I(c2743f);
                c2743f.remove(obj3);
            }
            this.f28698j0 = null;
            this.f28699k0 = false;
            this.f28700l0 = c2743f.f28695j0;
            return;
        }
        throw new IllegalStateException();
    }
}
