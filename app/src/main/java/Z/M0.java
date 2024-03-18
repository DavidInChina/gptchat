package Z;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a  reason: collision with root package name */
    public final N0 f22508a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f22509b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22510c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f22511d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22512e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22513f;

    /* renamed from: g  reason: collision with root package name */
    public int f22514g;

    /* renamed from: h  reason: collision with root package name */
    public int f22515h;

    /* renamed from: i  reason: collision with root package name */
    public int f22516i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f22517j;

    /* renamed from: k  reason: collision with root package name */
    public int f22518k;

    /* renamed from: l  reason: collision with root package name */
    public int f22519l;

    public M0(N0 n02) {
        this.f22508a = n02;
        this.f22509b = n02.f22520Y;
        int i10 = n02.f22521Z;
        this.f22510c = i10;
        this.f22511d = n02.f22522h0;
        this.f22512e = n02.f22523i0;
        this.f22515h = i10;
    }

    public final C1705d a(int i10) {
        ArrayList arrayList = this.f22508a.f22527m0;
        int o02 = M3.H.o0(arrayList, i10, this.f22510c);
        if (o02 < 0) {
            C1705d c1705d = new C1705d(i10);
            arrayList.add(-(o02 + 1), c1705d);
            return c1705d;
        }
        return (C1705d) arrayList.get(o02);
    }

    public final Object b(int[] iArr, int i10) {
        int i11;
        if (M3.H.n(iArr, i10)) {
            int i12 = i10 * 5;
            if (i12 >= iArr.length) {
                i11 = iArr.length;
            } else {
                i11 = M3.H.H(iArr[i12 + 1] >> 29) + iArr[i12 + 4];
            }
            return this.f22511d[i11];
        }
        return C1723m.f22654Y;
    }

    public final void c() {
        int i10;
        this.f22513f = true;
        N0 n02 = this.f22508a;
        n02.getClass();
        if (this.f22508a == n02 && (i10 = n02.f22524j0) > 0) {
            n02.f22524j0 = i10 - 1;
        } else {
            AbstractC1734s.j("Unexpected reader close()".toString());
            throw null;
        }
    }

    public final void d() {
        int i10;
        if (this.f22517j == 0) {
            if (this.f22514g == this.f22515h) {
                int i11 = this.f22516i;
                int[] iArr = this.f22509b;
                int v10 = M3.H.v(iArr, i11);
                this.f22516i = v10;
                if (v10 < 0) {
                    i10 = this.f22510c;
                } else {
                    i10 = v10 + iArr[(v10 * 5) + 3];
                }
                this.f22515h = i10;
                return;
            }
            AbstractC1734s.j("endGroup() not called at the end of a group".toString());
            throw null;
        }
    }

    public final Object e() {
        int i10 = this.f22514g;
        if (i10 < this.f22515h) {
            return b(this.f22509b, i10);
        }
        return 0;
    }

    public final int f() {
        int i10 = this.f22514g;
        if (i10 < this.f22515h) {
            return this.f22509b[i10 * 5];
        }
        return 0;
    }

    public final Object g(int i10, int i11) {
        int i12;
        int[] iArr = this.f22509b;
        int y10 = M3.H.y(iArr, i10);
        int i13 = i10 + 1;
        if (i13 < this.f22510c) {
            i12 = iArr[(i13 * 5) + 4];
        } else {
            i12 = this.f22512e;
        }
        int i14 = y10 + i11;
        if (i14 < i12) {
            return this.f22511d[i14];
        }
        return C1723m.f22654Y;
    }

    public final Object h() {
        int i10;
        if (this.f22517j <= 0 && (i10 = this.f22518k) < this.f22519l) {
            this.f22518k = i10 + 1;
            return this.f22511d[i10];
        }
        return C1723m.f22654Y;
    }

    public final Object i(int i10) {
        int[] iArr = this.f22509b;
        if (M3.H.q(iArr, i10)) {
            if (M3.H.q(iArr, i10)) {
                return this.f22511d[iArr[(i10 * 5) + 4]];
            }
            return C1723m.f22654Y;
        }
        return null;
    }

    public final Object j(int[] iArr, int i10) {
        if (M3.H.o(iArr, i10)) {
            int i11 = i10 * 5;
            int i12 = iArr[i11 + 4];
            return this.f22511d[M3.H.H(iArr[i11 + 1] >> 30) + i12];
        }
        return null;
    }

    public final void k(int i10) {
        int i11;
        if (this.f22517j == 0) {
            this.f22514g = i10;
            int[] iArr = this.f22509b;
            int i12 = this.f22510c;
            if (i10 < i12) {
                i11 = M3.H.v(iArr, i10);
            } else {
                i11 = -1;
            }
            this.f22516i = i11;
            if (i11 < 0) {
                this.f22515h = i12;
            } else {
                this.f22515h = M3.H.m(iArr, i11) + i11;
            }
            this.f22518k = 0;
            this.f22519l = 0;
            return;
        }
        AbstractC1734s.j("Cannot reposition while in an empty region".toString());
        throw null;
    }

    public final int l() {
        int i10;
        if (this.f22517j == 0) {
            int i11 = this.f22514g;
            int[] iArr = this.f22509b;
            if (M3.H.q(iArr, i11)) {
                i10 = 1;
            } else {
                i10 = M3.H.s(iArr, this.f22514g);
            }
            int i12 = this.f22514g;
            this.f22514g = iArr[(i12 * 5) + 3] + i12;
            return i10;
        }
        AbstractC1734s.j("Cannot skip while in an empty region".toString());
        throw null;
    }

    public final void m() {
        if (this.f22517j == 0) {
            this.f22514g = this.f22515h;
        } else {
            AbstractC1734s.j("Cannot skip the enclosing group while in an empty region".toString());
            throw null;
        }
    }

    public final void n() {
        int i10;
        if (this.f22517j <= 0) {
            int i11 = this.f22516i;
            int i12 = this.f22514g;
            int[] iArr = this.f22509b;
            if (M3.H.v(iArr, i12) == i11) {
                this.f22516i = i12;
                this.f22515h = M3.H.m(iArr, i12) + i12;
                int i13 = i12 + 1;
                this.f22514g = i13;
                this.f22518k = M3.H.y(iArr, i12);
                if (i12 >= this.f22510c - 1) {
                    i10 = this.f22512e;
                } else {
                    i10 = M3.H.l(iArr, i13);
                }
                this.f22519l = i10;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f22514g);
        sb2.append(", key=");
        sb2.append(f());
        sb2.append(", parent=");
        sb2.append(this.f22516i);
        sb2.append(", end=");
        return AbstractC2469q0.j(sb2, this.f22515h, ')');
    }
}
