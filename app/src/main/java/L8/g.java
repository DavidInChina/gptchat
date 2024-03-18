package L8;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class g extends P8.b {

    /* renamed from: y0  reason: collision with root package name */
    public static final f f10790y0 = new f();

    /* renamed from: z0  reason: collision with root package name */
    public static final Object f10791z0 = new Object();

    /* renamed from: u0  reason: collision with root package name */
    public Object[] f10792u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f10793v0;

    /* renamed from: w0  reason: collision with root package name */
    public String[] f10794w0;

    /* renamed from: x0  reason: collision with root package name */
    public int[] f10795x0;

    @Override // P8.b
    public final void A0() {
        Z0(9);
        e1();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // P8.b
    public final String H0() {
        int R02 = R0();
        if (R02 != 6 && R02 != 7) {
            throw new IllegalStateException("Expected " + E9.f.L(6) + " but was " + E9.f.L(R02) + b1());
        }
        String T = ((I8.w) e1()).T();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return T;
    }

    @Override // P8.b
    public final String O() {
        return a1(true);
    }

    @Override // P8.b
    public final boolean P() {
        int R02 = R0();
        if (R02 != 4 && R02 != 2 && R02 != 10) {
            return true;
        }
        return false;
    }

    @Override // P8.b
    public final int R0() {
        if (this.f10793v0 == 0) {
            return 10;
        }
        Object d12 = d1();
        if (d12 instanceof Iterator) {
            boolean z10 = this.f10792u0[this.f10793v0 - 2] instanceof I8.u;
            Iterator it = (Iterator) d12;
            if (it.hasNext()) {
                if (z10) {
                    return 5;
                }
                f1(it.next());
                return R0();
            } else if (!z10) {
                return 2;
            } else {
                return 4;
            }
        } else if (d12 instanceof I8.u) {
            return 3;
        } else {
            if (d12 instanceof I8.p) {
                return 1;
            }
            if (d12 instanceof I8.w) {
                Serializable serializable = ((I8.w) d12).f8134Y;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (d12 instanceof I8.t) {
                return 9;
            } else {
                if (d12 == f10791z0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new IOException("Custom JsonElement subclass " + d12.getClass().getName() + " is not supported");
            }
        }
    }

    @Override // P8.b
    public final void X0() {
        int f6 = AbstractC6708l.f(R0());
        if (f6 != 1) {
            if (f6 != 9) {
                if (f6 != 3) {
                    if (f6 != 4) {
                        e1();
                        int i10 = this.f10793v0;
                        if (i10 > 0) {
                            int[] iArr = this.f10795x0;
                            int i11 = i10 - 1;
                            iArr[i11] = iArr[i11] + 1;
                            return;
                        }
                        return;
                    }
                    c1(true);
                    return;
                }
                m();
                return;
            }
            return;
        }
        k();
    }

    public final void Z0(int i10) {
        if (R0() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + E9.f.L(i10) + " but was " + E9.f.L(R0()) + b1());
    }

    @Override // P8.b
    public final void a() {
        Z0(1);
        f1(((I8.p) d1()).f8131Y.iterator());
        this.f10795x0[this.f10793v0 - 1] = 0;
    }

    @Override // P8.b
    public final boolean a0() {
        Z0(8);
        boolean f6 = ((I8.w) e1()).f();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return f6;
    }

    public final String a1(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f10793v0;
            if (i10 < i11) {
                Object[] objArr = this.f10792u0;
                Object obj = objArr[i10];
                if (obj instanceof I8.p) {
                    i10++;
                    if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                        int i12 = this.f10795x0[i10];
                        if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                            i12--;
                        }
                        sb2.append('[');
                        sb2.append(i12);
                        sb2.append(']');
                    }
                } else if ((obj instanceof I8.u) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.f10794w0[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    public final String b1() {
        return " at path " + a1(false);
    }

    public final String c1(boolean z10) {
        String str;
        Z0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) d1()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f10794w0;
        int i10 = this.f10793v0 - 1;
        if (z10) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i10] = str;
        f1(entry.getValue());
        return str2;
    }

    @Override // P8.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10792u0 = new Object[]{f10791z0};
        this.f10793v0 = 1;
    }

    @Override // P8.b
    public final double d0() {
        double d10;
        int R02 = R0();
        if (R02 != 7 && R02 != 6) {
            throw new IllegalStateException("Expected " + E9.f.L(7) + " but was " + E9.f.L(R02) + b1());
        }
        I8.w wVar = (I8.w) d1();
        if (wVar.f8134Y instanceof Number) {
            d10 = wVar.M().doubleValue();
        } else {
            d10 = Double.parseDouble(wVar.T());
        }
        if (!this.f13851Z && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IOException("JSON forbids NaN and infinities: " + d10);
        }
        e1();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return d10;
    }

    public final Object d1() {
        return this.f10792u0[this.f10793v0 - 1];
    }

    public final Object e1() {
        Object[] objArr = this.f10792u0;
        int i10 = this.f10793v0 - 1;
        this.f10793v0 = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // P8.b
    public final int f0() {
        int R02 = R0();
        if (R02 != 7 && R02 != 6) {
            throw new IllegalStateException("Expected " + E9.f.L(7) + " but was " + E9.f.L(R02) + b1());
        }
        int r10 = ((I8.w) d1()).r();
        e1();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return r10;
    }

    public final void f1(Object obj) {
        int i10 = this.f10793v0;
        Object[] objArr = this.f10792u0;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f10792u0 = Arrays.copyOf(objArr, i11);
            this.f10795x0 = Arrays.copyOf(this.f10795x0, i11);
            this.f10794w0 = (String[]) Arrays.copyOf(this.f10794w0, i11);
        }
        Object[] objArr2 = this.f10792u0;
        int i12 = this.f10793v0;
        this.f10793v0 = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // P8.b
    public final void h() {
        Z0(3);
        f1(((K8.j) ((I8.u) d1()).f8133Y.entrySet()).iterator());
    }

    @Override // P8.b
    public final void k() {
        Z0(2);
        e1();
        e1();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // P8.b
    public final void m() {
        Z0(4);
        this.f10794w0[this.f10793v0 - 1] = null;
        e1();
        e1();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // P8.b
    public final long m0() {
        int R02 = R0();
        if (R02 != 7 && R02 != 6) {
            throw new IllegalStateException("Expected " + E9.f.L(7) + " but was " + E9.f.L(R02) + b1());
        }
        long I10 = ((I8.w) d1()).I();
        e1();
        int i10 = this.f10793v0;
        if (i10 > 0) {
            int[] iArr = this.f10795x0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return I10;
    }

    @Override // P8.b
    public final String r() {
        return a1(false);
    }

    @Override // P8.b
    public final String toString() {
        return g.class.getSimpleName() + b1();
    }

    @Override // P8.b
    public final String u0() {
        return c1(false);
    }
}
