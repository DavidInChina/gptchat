package com.google.protobuf;

import java.io.OutputStream;

/* renamed from: com.google.protobuf.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2547x extends AbstractC2549y {

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f27636f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27637g;

    /* renamed from: h  reason: collision with root package name */
    public int f27638h;

    /* renamed from: i  reason: collision with root package name */
    public final OutputStream f27639i;

    public C2547x(OutputStream outputStream, int i10) {
        if (i10 >= 0) {
            int max = Math.max(i10, 20);
            this.f27636f = new byte[max];
            this.f27637g = max;
            if (outputStream != null) {
                this.f27639i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void A0(int i10, int i11) {
        X0(14);
        T0(i10, 5);
        R0(i11);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void B0(int i10) {
        X0(4);
        R0(i10);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void C0(int i10, long j6) {
        X0(18);
        T0(i10, 1);
        S0(j6);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void D0(long j6) {
        X0(8);
        S0(j6);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void E0(int i10, int i11) {
        X0(20);
        T0(i10, 0);
        if (i11 >= 0) {
            U0(i11);
        } else {
            V0(i11);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void F0(int i10) {
        if (i10 >= 0) {
            O0(i10);
        } else {
            Q0(i10);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void G0(int i10, M0 m02, AbstractC2504f1 abstractC2504f1) {
        M0(i10, 2);
        O0(((AbstractC2493c) m02).getSerializedSize(abstractC2504f1));
        abstractC2504f1.j(this.f27644c, m02);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void H0(M0 m02) {
        O0(m02.getSerializedSize());
        m02.writeTo(this);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void I0(int i10, M0 m02) {
        M0(1, 3);
        N0(2, i10);
        M0(3, 2);
        H0(m02);
        M0(1, 4);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void J0(int i10, AbstractC2534q abstractC2534q) {
        M0(1, 3);
        N0(2, i10);
        y0(3, abstractC2534q);
        M0(1, 4);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void K0(int i10, String str) {
        M0(i10, 2);
        L0(str);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void L0(String str) {
        try {
            int length = str.length() * 3;
            int q02 = AbstractC2549y.q0(length);
            int i10 = q02 + length;
            int i11 = this.f27637g;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int Y7 = F1.f27398a.Y(str, bArr, 0, length);
                O0(Y7);
                Y0(bArr, 0, Y7);
                return;
            }
            if (i10 > i11 - this.f27638h) {
                W0();
            }
            int q03 = AbstractC2549y.q0(str.length());
            int i12 = this.f27638h;
            byte[] bArr2 = this.f27636f;
            try {
                try {
                    if (q03 == q02) {
                        int i13 = i12 + q03;
                        this.f27638h = i13;
                        int Y10 = F1.f27398a.Y(str, bArr2, i13, i11 - i13);
                        this.f27638h = i12;
                        U0((Y10 - i12) - q03);
                        this.f27638h = Y10;
                    } else {
                        int b10 = F1.b(str);
                        U0(b10);
                        this.f27638h = F1.f27398a.Y(str, bArr2, this.f27638h, b10);
                    }
                } catch (E1 e10) {
                    this.f27638h = i12;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new E2.F(e11);
            }
        } catch (E1 e12) {
            t0(str, e12);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void M0(int i10, int i11) {
        O0((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void N0(int i10, int i11) {
        X0(20);
        T0(i10, 0);
        U0(i11);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void O0(int i10) {
        X0(5);
        U0(i10);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void P0(int i10, long j6) {
        X0(20);
        T0(i10, 0);
        V0(j6);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void Q0(long j6) {
        X0(10);
        V0(j6);
    }

    public final void R0(int i10) {
        int i11 = this.f27638h;
        byte[] bArr = this.f27636f;
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
        this.f27638h = i11 + 4;
        bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
    }

    public final void S0(long j6) {
        int i10 = this.f27638h;
        byte[] bArr = this.f27636f;
        bArr[i10] = (byte) (j6 & 255);
        bArr[i10 + 1] = (byte) ((j6 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j6 >> 16) & 255);
        bArr[i10 + 3] = (byte) (255 & (j6 >> 24));
        bArr[i10 + 4] = (byte) (((int) (j6 >> 32)) & 255);
        bArr[i10 + 5] = (byte) (((int) (j6 >> 40)) & 255);
        bArr[i10 + 6] = (byte) (((int) (j6 >> 48)) & 255);
        this.f27638h = i10 + 8;
        bArr[i10 + 7] = (byte) (((int) (j6 >> 56)) & 255);
    }

    public final void T0(int i10, int i11) {
        U0((i10 << 3) | i11);
    }

    public final void U0(int i10) {
        boolean z10 = AbstractC2549y.f27643e;
        byte[] bArr = this.f27636f;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f27638h;
                this.f27638h = i11 + 1;
                C1.o(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f27638h;
            this.f27638h = i12 + 1;
            C1.o(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f27638h;
            this.f27638h = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f27638h;
        this.f27638h = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    @Override // com.google.protobuf.AbstractC2508h
    public final void V(byte[] bArr, int i10, int i11) {
        Y0(bArr, i10, i11);
    }

    public final void V0(long j6) {
        boolean z10 = AbstractC2549y.f27643e;
        byte[] bArr = this.f27636f;
        if (z10) {
            while ((j6 & (-128)) != 0) {
                int i10 = this.f27638h;
                this.f27638h = i10 + 1;
                C1.o(bArr, i10, (byte) ((((int) j6) & 127) | 128));
                j6 >>>= 7;
            }
            int i11 = this.f27638h;
            this.f27638h = i11 + 1;
            C1.o(bArr, i11, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            int i12 = this.f27638h;
            this.f27638h = i12 + 1;
            bArr[i12] = (byte) ((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        int i13 = this.f27638h;
        this.f27638h = i13 + 1;
        bArr[i13] = (byte) j6;
    }

    public final void W0() {
        this.f27639i.write(this.f27636f, 0, this.f27638h);
        this.f27638h = 0;
    }

    public final void X0(int i10) {
        if (this.f27637g - this.f27638h < i10) {
            W0();
        }
    }

    public final void Y0(byte[] bArr, int i10, int i11) {
        int i12 = this.f27638h;
        int i13 = this.f27637g;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f27636f;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f27638h += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f27638h = i13;
        W0();
        if (i16 <= i13) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f27638h = i16;
            return;
        }
        this.f27639i.write(bArr, i15, i16);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final int u0() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void v0(byte b10) {
        if (this.f27638h == this.f27637g) {
            W0();
        }
        int i10 = this.f27638h;
        this.f27638h = i10 + 1;
        this.f27636f[i10] = b10;
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void w0(int i10, boolean z10) {
        X0(11);
        T0(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f27638h;
        this.f27638h = i11 + 1;
        this.f27636f[i11] = b10;
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void x0(byte[] bArr, int i10) {
        O0(i10);
        Y0(bArr, 0, i10);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void y0(int i10, AbstractC2534q abstractC2534q) {
        M0(i10, 2);
        z0(abstractC2534q);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void z0(AbstractC2534q abstractC2534q) {
        O0(abstractC2534q.size());
        abstractC2534q.r0(this);
    }
}
