package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;
import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: a0.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1903I {

    /* renamed from: b  reason: collision with root package name */
    public int f23799b;

    /* renamed from: d  reason: collision with root package name */
    public int f23801d;

    /* renamed from: f  reason: collision with root package name */
    public int f23803f;

    /* renamed from: g  reason: collision with root package name */
    public int f23804g;

    /* renamed from: h  reason: collision with root package name */
    public int f23805h;

    /* renamed from: a  reason: collision with root package name */
    public AbstractC1901G[] f23798a = new AbstractC1901G[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f23800c = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public Object[] f23802e = new Object[16];

    public static final int a(C1903I c1903i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    public final void b() {
        this.f23799b = 0;
        this.f23801d = 0;
        kf.q.d3(0, this.f23803f, null, this.f23802e);
        this.f23803f = 0;
    }

    public final void c(AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        C1903I c1903i;
        int i10;
        if (e()) {
            C1902H c1902h = new C1902H(this);
            do {
                c1903i = c1902h.f23797d;
                AbstractC1901G abstractC1901G = c1903i.f23798a[c1902h.f23794a];
                AbstractC3557B.Z(abstractC1901G);
                abstractC1901G.a(c1902h, abstractC1707e, q02, c1742w);
                int i11 = c1902h.f23794a;
                if (i11 >= c1903i.f23799b) {
                    break;
                }
                AbstractC1901G abstractC1901G2 = c1903i.f23798a[i11];
                AbstractC3557B.Z(abstractC1901G2);
                c1902h.f23795b += abstractC1901G2.f23792a;
                c1902h.f23796c += abstractC1901G2.f23793b;
                i10 = c1902h.f23794a + 1;
                c1902h.f23794a = i10;
            } while (i10 < c1903i.f23799b);
        }
        b();
    }

    public final boolean d() {
        if (this.f23799b == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f23799b != 0) {
            return true;
        }
        return false;
    }

    public final AbstractC1901G f() {
        AbstractC1901G abstractC1901G = this.f23798a[this.f23799b - 1];
        AbstractC3557B.Z(abstractC1901G);
        return abstractC1901G;
    }

    public final void g(AbstractC1901G abstractC1901G) {
        int i10 = abstractC1901G.f23792a;
        int i11 = abstractC1901G.f23793b;
        if (i10 == 0 && i11 == 0) {
            h(abstractC1901G);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + abstractC1901G + " without arguments because it expects " + i10 + " ints and " + i11 + " objects.").toString());
    }

    public final void h(AbstractC1901G abstractC1901G) {
        int i10;
        int i11;
        this.f23804g = 0;
        this.f23805h = 0;
        int i12 = this.f23799b;
        AbstractC1901G[] abstractC1901GArr = this.f23798a;
        int i13 = 1024;
        if (i12 == abstractC1901GArr.length) {
            if (i12 > 1024) {
                i11 = 1024;
            } else {
                i11 = i12;
            }
            Object[] copyOf = Arrays.copyOf(abstractC1901GArr, i12 + i11);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f23798a = (AbstractC1901G[]) copyOf;
        }
        int i14 = this.f23801d;
        int i15 = abstractC1901G.f23792a;
        int i16 = i14 + i15;
        int[] iArr = this.f23800c;
        int length = iArr.length;
        if (i16 > length) {
            if (length > 1024) {
                i10 = 1024;
            } else {
                i10 = length;
            }
            int i17 = length + i10;
            if (i17 >= i16) {
                i16 = i17;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i16);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f23800c = copyOf2;
        }
        int i18 = this.f23803f;
        int i19 = abstractC1901G.f23793b;
        int i20 = i18 + i19;
        Object[] objArr = this.f23802e;
        int length2 = objArr.length;
        if (i20 > length2) {
            if (length2 <= 1024) {
                i13 = length2;
            }
            int i21 = length2 + i13;
            if (i21 >= i20) {
                i20 = i21;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i20);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf3);
            this.f23802e = copyOf3;
        }
        AbstractC1901G[] abstractC1901GArr2 = this.f23798a;
        int i22 = this.f23799b;
        this.f23799b = i22 + 1;
        abstractC1901GArr2[i22] = abstractC1901G;
        this.f23801d += i15;
        this.f23803f += i19;
    }

    public final String toString() {
        return super.toString();
    }
}
