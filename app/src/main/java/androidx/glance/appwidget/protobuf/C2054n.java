package androidx.glance.appwidget.protobuf;

import java.io.OutputStream;

/* renamed from: androidx.glance.appwidget.protobuf.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2054n extends AbstractC2055o {

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f25255k;

    /* renamed from: l  reason: collision with root package name */
    public final int f25256l;

    /* renamed from: m  reason: collision with root package name */
    public int f25257m;

    /* renamed from: n  reason: collision with root package name */
    public final OutputStream f25258n;

    public C2054n(M1.q qVar, int i10) {
        if (i10 >= 0) {
            int max = Math.max(i10, 20);
            this.f25255k = new byte[max];
            this.f25256l = max;
            this.f25258n = qVar;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void A2(int i10) {
        if (i10 >= 0) {
            F2(i10);
        } else {
            H2(i10);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void B2(int i10, AbstractC2042b abstractC2042b, b0 b0Var) {
        D2(i10, 2);
        F2(abstractC2042b.a(b0Var));
        b0Var.h(abstractC2042b, this.f25262h);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void C2(int i10, String str) {
        D2(i10, 2);
        R2(str);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void D2(int i10, int i11) {
        F2((i10 << 3) | i11);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void E2(int i10, int i11) {
        O2(20);
        K2(i10, 0);
        L2(i11);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void F2(int i10) {
        O2(5);
        L2(i10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void G2(int i10, long j6) {
        O2(20);
        K2(i10, 0);
        M2(j6);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void H2(long j6) {
        O2(10);
        M2(j6);
    }

    public final void I2(int i10) {
        int i11 = this.f25257m;
        byte[] bArr = this.f25255k;
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
        this.f25257m = i11 + 4;
        bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
    }

    public final void J2(long j6) {
        int i10 = this.f25257m;
        byte[] bArr = this.f25255k;
        bArr[i10] = (byte) (j6 & 255);
        bArr[i10 + 1] = (byte) ((j6 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j6 >> 16) & 255);
        bArr[i10 + 3] = (byte) (255 & (j6 >> 24));
        bArr[i10 + 4] = (byte) (((int) (j6 >> 32)) & 255);
        bArr[i10 + 5] = (byte) (((int) (j6 >> 40)) & 255);
        bArr[i10 + 6] = (byte) (((int) (j6 >> 48)) & 255);
        this.f25257m = i10 + 8;
        bArr[i10 + 7] = (byte) (((int) (j6 >> 56)) & 255);
    }

    public final void K2(int i10, int i11) {
        L2((i10 << 3) | i11);
    }

    public final void L2(int i10) {
        boolean z10 = AbstractC2055o.f25261j;
        byte[] bArr = this.f25255k;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f25257m;
                this.f25257m = i11 + 1;
                m0.n(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f25257m;
            this.f25257m = i12 + 1;
            m0.n(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f25257m;
            this.f25257m = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f25257m;
        this.f25257m = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void M2(long j6) {
        boolean z10 = AbstractC2055o.f25261j;
        byte[] bArr = this.f25255k;
        if (z10) {
            while ((j6 & (-128)) != 0) {
                int i10 = this.f25257m;
                this.f25257m = i10 + 1;
                m0.n(bArr, i10, (byte) ((((int) j6) & 127) | 128));
                j6 >>>= 7;
            }
            int i11 = this.f25257m;
            this.f25257m = i11 + 1;
            m0.n(bArr, i11, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            int i12 = this.f25257m;
            this.f25257m = i12 + 1;
            bArr[i12] = (byte) ((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        int i13 = this.f25257m;
        this.f25257m = i13 + 1;
        bArr[i13] = (byte) j6;
    }

    public final void N2() {
        this.f25258n.write(this.f25255k, 0, this.f25257m);
        this.f25257m = 0;
    }

    public final void O2(int i10) {
        if (this.f25256l - this.f25257m < i10) {
            N2();
        }
    }

    public final void P2(byte[] bArr, int i10, int i11) {
        int i12 = this.f25257m;
        int i13 = this.f25256l;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f25255k;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f25257m += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f25257m = i13;
        N2();
        if (i16 <= i13) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f25257m = i16;
            return;
        }
        this.f25258n.write(bArr, i15, i16);
    }

    public final void Q2(AbstractC2049i abstractC2049i) {
        F2(abstractC2049i.size());
        C2050j c2050j = (C2050j) abstractC2049i;
        T1(c2050j.f25226i0, c2050j.T(), c2050j.size());
    }

    public final void R2(String str) {
        try {
            int length = str.length() * 3;
            int o22 = AbstractC2055o.o2(length);
            int i10 = o22 + length;
            int i11 = this.f25256l;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int V12 = p0.f25264a.V1(str, bArr, 0, length);
                F2(V12);
                P2(bArr, 0, V12);
                return;
            }
            if (i10 > i11 - this.f25257m) {
                N2();
            }
            int o23 = AbstractC2055o.o2(str.length());
            int i12 = this.f25257m;
            byte[] bArr2 = this.f25255k;
            try {
                if (o23 == o22) {
                    int i13 = i12 + o23;
                    this.f25257m = i13;
                    int V13 = p0.f25264a.V1(str, bArr2, i13, i11 - i13);
                    this.f25257m = i12;
                    L2((V13 - i12) - o23);
                    this.f25257m = V13;
                } else {
                    int b10 = p0.b(str);
                    L2(b10);
                    this.f25257m = p0.f25264a.V1(str, bArr2, this.f25257m, b10);
                }
            } catch (o0 e10) {
                this.f25257m = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new E2.F(e11);
            }
        } catch (o0 e12) {
            r2(str, e12);
        }
    }

    @Override // Bi.c
    public final void T1(byte[] bArr, int i10, int i11) {
        P2(bArr, i10, i11);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void s2(byte b10) {
        if (this.f25257m == this.f25256l) {
            N2();
        }
        int i10 = this.f25257m;
        this.f25257m = i10 + 1;
        this.f25255k[i10] = b10;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void t2(int i10, boolean z10) {
        O2(11);
        K2(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f25257m;
        this.f25257m = i11 + 1;
        this.f25255k[i11] = b10;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void u2(int i10, AbstractC2049i abstractC2049i) {
        D2(i10, 2);
        Q2(abstractC2049i);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void v2(int i10, int i11) {
        O2(14);
        K2(i10, 5);
        I2(i11);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void w2(int i10) {
        O2(4);
        I2(i10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void x2(int i10, long j6) {
        O2(18);
        K2(i10, 1);
        J2(j6);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void y2(long j6) {
        O2(8);
        J2(j6);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2055o
    public final void z2(int i10, int i11) {
        O2(20);
        K2(i10, 0);
        if (i11 >= 0) {
            L2(i11);
        } else {
            M2(i11);
        }
    }
}
