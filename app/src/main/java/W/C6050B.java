package w;

import id.AbstractC3557B;
import java.util.Arrays;
import x.AbstractC6262a;

/* renamed from: w.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6050B implements Cloneable {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ boolean f47561Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ int[] f47562Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object[] f47563h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ int f47564i0;

    public C6050B() {
        this(0);
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f47564i0;
        if (i11 != 0 && i10 <= this.f47562Z[i11 - 1]) {
            e(i10, obj);
            return;
        }
        if (this.f47561Y && i11 >= this.f47562Z.length) {
            AbstractC6051C.a(this);
        }
        int i12 = this.f47564i0;
        if (i12 >= this.f47562Z.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f47562Z, i16);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f47562Z = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f47563h0, i16);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f47563h0 = copyOf2;
        }
        this.f47562Z[i12] = i10;
        this.f47563h0[i12] = obj;
        this.f47564i0 = i12 + 1;
    }

    /* renamed from: b */
    public final C6050B clone() {
        Object clone = super.clone();
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", clone);
        C6050B c6050b = (C6050B) clone;
        c6050b.f47562Z = (int[]) this.f47562Z.clone();
        c6050b.f47563h0 = (Object[]) this.f47563h0.clone();
        return c6050b;
    }

    public final Object c(int i10) {
        Object obj;
        Object obj2 = AbstractC6051C.f47565a;
        int a5 = AbstractC6262a.a(this.f47564i0, i10, this.f47562Z);
        if (a5 < 0 || (obj = this.f47563h0[a5]) == AbstractC6051C.f47565a) {
            return null;
        }
        return obj;
    }

    public final int d(int i10) {
        if (this.f47561Y) {
            AbstractC6051C.a(this);
        }
        return this.f47562Z[i10];
    }

    public final void e(int i10, Object obj) {
        int a5 = AbstractC6262a.a(this.f47564i0, i10, this.f47562Z);
        if (a5 >= 0) {
            this.f47563h0[a5] = obj;
            return;
        }
        int i11 = ~a5;
        int i12 = this.f47564i0;
        if (i11 < i12) {
            Object[] objArr = this.f47563h0;
            if (objArr[i11] == AbstractC6051C.f47565a) {
                this.f47562Z[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f47561Y && i12 >= this.f47562Z.length) {
            AbstractC6051C.a(this);
            i11 = ~AbstractC6262a.a(this.f47564i0, i10, this.f47562Z);
        }
        int i13 = this.f47564i0;
        if (i13 >= this.f47562Z.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] copyOf = Arrays.copyOf(this.f47562Z, i17);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f47562Z = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f47563h0, i17);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f47563h0 = copyOf2;
        }
        int i18 = this.f47564i0;
        if (i18 - i11 != 0) {
            int[] iArr = this.f47562Z;
            int i19 = i11 + 1;
            kf.q.V2(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f47563h0;
            kf.q.W2(i19, i11, this.f47564i0, objArr2, objArr2);
        }
        this.f47562Z[i11] = i10;
        this.f47563h0[i11] = obj;
        this.f47564i0++;
    }

    public final int f() {
        if (this.f47561Y) {
            AbstractC6051C.a(this);
        }
        return this.f47564i0;
    }

    public final Object g(int i10) {
        if (this.f47561Y) {
            AbstractC6051C.a(this);
        }
        return this.f47563h0[i10];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f47564i0 * 28);
        sb2.append('{');
        int i10 = this.f47564i0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i11));
            sb2.append('=');
            Object g10 = g(i11);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        AbstractC3557B.b0("buffer.toString()", sb3);
        return sb3;
    }

    public C6050B(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f47562Z = new int[i14];
        this.f47563h0 = new Object[i14];
    }
}
