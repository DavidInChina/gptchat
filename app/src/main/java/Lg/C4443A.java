package lg;

import androidx.datastore.preferences.protobuf.r0;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: lg.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4443A extends AbstractC4460e {

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f38330m0;

    /* renamed from: Z  reason: collision with root package name */
    public final int f38331Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4460e f38332h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC4460e f38333i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f38334j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f38335k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f38336l0 = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f38330m0 = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f38330m0;
            if (i13 < iArr.length) {
                iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                i13++;
            } else {
                return;
            }
        }
    }

    public C4443A(AbstractC4460e abstractC4460e, AbstractC4460e abstractC4460e2) {
        this.f38332h0 = abstractC4460e;
        this.f38333i0 = abstractC4460e2;
        int size = abstractC4460e.size();
        this.f38334j0 = size;
        this.f38331Z = abstractC4460e2.size() + size;
        this.f38335k0 = Math.max(abstractC4460e.I(), abstractC4460e2.I()) + 1;
    }

    @Override // lg.AbstractC4460e
    public final int I() {
        return this.f38335k0;
    }

    @Override // lg.AbstractC4460e
    public final boolean M() {
        if (this.f38331Z >= f38330m0[this.f38335k0]) {
            return true;
        }
        return false;
    }

    @Override // lg.AbstractC4460e
    public final boolean T() {
        int i02 = this.f38332h0.i0(0, 0, this.f38334j0);
        AbstractC4460e abstractC4460e = this.f38333i0;
        if (abstractC4460e.i0(i02, 0, abstractC4460e.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // lg.AbstractC4460e
    public final int V(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        AbstractC4460e abstractC4460e = this.f38332h0;
        int i14 = this.f38334j0;
        if (i13 <= i14) {
            return abstractC4460e.V(i10, i11, i12);
        }
        AbstractC4460e abstractC4460e2 = this.f38333i0;
        if (i11 >= i14) {
            return abstractC4460e2.V(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return abstractC4460e2.V(abstractC4460e.V(i10, i11, i15), 0, i12 - i15);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        int m02;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4460e)) {
            return false;
        }
        AbstractC4460e abstractC4460e = (AbstractC4460e) obj;
        int size = abstractC4460e.size();
        int i10 = this.f38331Z;
        if (i10 != size) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        if (this.f38336l0 != 0 && (m02 = abstractC4460e.m0()) != 0 && this.f38336l0 != m02) {
            return false;
        }
        r0 r0Var = new r0(this, 0);
        w wVar = (w) r0Var.next();
        r0 r0Var2 = new r0(abstractC4460e, 0);
        w wVar2 = (w) r0Var2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int length = wVar.f38418Z.length - i11;
            int length2 = wVar2.f38418Z.length - i12;
            int min = Math.min(length, length2);
            if (i11 == 0) {
                z10 = wVar.v0(wVar2, i12, min);
            } else {
                z10 = wVar2.v0(wVar, i11, min);
            }
            if (!z10) {
                return false;
            }
            i13 += min;
            if (i13 >= i10) {
                if (i13 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == length) {
                wVar = (w) r0Var.next();
                i11 = 0;
            } else {
                i11 += min;
            }
            if (min == length2) {
                wVar2 = (w) r0Var2.next();
                i12 = 0;
            } else {
                i12 += min;
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f38336l0;
        if (i10 == 0) {
            int i11 = this.f38331Z;
            i10 = V(i11, 0, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f38336l0 = i10;
        }
        return i10;
    }

    @Override // lg.AbstractC4460e
    public final int i0(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        AbstractC4460e abstractC4460e = this.f38332h0;
        int i14 = this.f38334j0;
        if (i13 <= i14) {
            return abstractC4460e.i0(i10, i11, i12);
        }
        AbstractC4460e abstractC4460e2 = this.f38333i0;
        if (i11 >= i14) {
            return abstractC4460e2.i0(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return abstractC4460e2.i0(abstractC4460e.i0(i10, i11, i15), 0, i12 - i15);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z(this);
    }

    @Override // lg.AbstractC4460e
    public final int m0() {
        return this.f38336l0;
    }

    @Override // lg.AbstractC4460e
    public final String q0() {
        byte[] bArr;
        int i10 = this.f38331Z;
        if (i10 == 0) {
            bArr = s.f38414a;
        } else {
            byte[] bArr2 = new byte[i10];
            y(0, 0, i10, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // lg.AbstractC4460e
    public final int size() {
        return this.f38331Z;
    }

    @Override // lg.AbstractC4460e
    public final void u0(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        AbstractC4460e abstractC4460e = this.f38332h0;
        int i13 = this.f38334j0;
        if (i12 <= i13) {
            abstractC4460e.u0(outputStream, i10, i11);
            return;
        }
        AbstractC4460e abstractC4460e2 = this.f38333i0;
        if (i10 >= i13) {
            abstractC4460e2.u0(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        abstractC4460e.u0(outputStream, i10, i14);
        abstractC4460e2.u0(outputStream, 0, i11 - i14);
    }

    @Override // lg.AbstractC4460e
    public final void y(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        AbstractC4460e abstractC4460e = this.f38332h0;
        int i14 = this.f38334j0;
        if (i13 <= i14) {
            abstractC4460e.y(i10, i11, i12, bArr);
            return;
        }
        AbstractC4460e abstractC4460e2 = this.f38333i0;
        if (i10 >= i14) {
            abstractC4460e2.y(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        abstractC4460e.y(i10, i11, i15, bArr);
        abstractC4460e2.y(0, i11 + i15, i12 - i15, bArr);
    }
}
