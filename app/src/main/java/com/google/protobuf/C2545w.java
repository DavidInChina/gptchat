package com.google.protobuf;

/* renamed from: com.google.protobuf.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2545w extends AbstractC2549y {

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f27633f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27634g;

    /* renamed from: h  reason: collision with root package name */
    public int f27635h;

    public C2545w(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) >= 0) {
            this.f27633f = bArr;
            this.f27635h = 0;
            this.f27634g = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void A0(int i10, int i11) {
        M0(i10, 5);
        B0(i11);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void B0(int i10) {
        try {
            byte[] bArr = this.f27633f;
            int i11 = this.f27635h;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.f27635h = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(5, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27635h), Integer.valueOf(this.f27634g), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void C0(int i10, long j6) {
        M0(i10, 1);
        D0(j6);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void D0(long j6) {
        try {
            byte[] bArr = this.f27633f;
            int i10 = this.f27635h;
            bArr[i10] = (byte) (((int) j6) & 255);
            bArr[i10 + 1] = (byte) (((int) (j6 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j6 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j6 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j6 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j6 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j6 >> 48)) & 255);
            this.f27635h = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j6 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(5, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27635h), Integer.valueOf(this.f27634g), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void E0(int i10, int i11) {
        M0(i10, 0);
        F0(i11);
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
        int i10 = this.f27635h;
        try {
            int q02 = AbstractC2549y.q0(str.length() * 3);
            int q03 = AbstractC2549y.q0(str.length());
            byte[] bArr = this.f27633f;
            if (q03 == q02) {
                int i11 = i10 + q03;
                this.f27635h = i11;
                int Y7 = F1.f27398a.Y(str, bArr, i11, u0());
                this.f27635h = i10;
                O0((Y7 - i10) - q03);
                this.f27635h = Y7;
            } else {
                O0(F1.b(str));
                this.f27635h = F1.f27398a.Y(str, bArr, this.f27635h, u0());
            }
        } catch (E1 e10) {
            this.f27635h = i10;
            t0(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new E2.F(e11);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void M0(int i10, int i11) {
        O0((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void N0(int i10, int i11) {
        M0(i10, 0);
        O0(i11);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void O0(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f27633f;
            if (i11 == 0) {
                int i12 = this.f27635h;
                this.f27635h = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            }
            try {
                int i13 = this.f27635h;
                this.f27635h = i13 + 1;
                bArr[i13] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new E2.F(5, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27635h), Integer.valueOf(this.f27634g), 1), e10);
            }
            throw new E2.F(5, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27635h), Integer.valueOf(this.f27634g), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void P0(int i10, long j6) {
        M0(i10, 0);
        Q0(j6);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void Q0(long j6) {
        boolean z10 = AbstractC2549y.f27643e;
        byte[] bArr = this.f27633f;
        if (z10 && u0() >= 10) {
            while ((j6 & (-128)) != 0) {
                int i10 = this.f27635h;
                this.f27635h = i10 + 1;
                C1.o(bArr, i10, (byte) ((((int) j6) & 127) | 128));
                j6 >>>= 7;
            }
            int i11 = this.f27635h;
            this.f27635h = 1 + i11;
            C1.o(bArr, i11, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            try {
                int i12 = this.f27635h;
                this.f27635h = i12 + 1;
                bArr[i12] = (byte) ((((int) j6) & 127) | 128);
                j6 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new E2.F(5, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27635h), Integer.valueOf(this.f27634g), 1), e10);
            }
        }
        int i13 = this.f27635h;
        this.f27635h = i13 + 1;
        bArr[i13] = (byte) j6;
    }

    public final void R0(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f27633f, this.f27635h, i11);
            this.f27635h += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(5, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27635h), Integer.valueOf(this.f27634g), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC2508h
    public final void V(byte[] bArr, int i10, int i11) {
        R0(bArr, i10, i11);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final int u0() {
        return this.f27634g - this.f27635h;
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void v0(byte b10) {
        try {
            byte[] bArr = this.f27633f;
            int i10 = this.f27635h;
            this.f27635h = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(5, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f27635h), Integer.valueOf(this.f27634g), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void w0(int i10, boolean z10) {
        M0(i10, 0);
        v0(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC2549y
    public final void x0(byte[] bArr, int i10) {
        O0(i10);
        R0(bArr, 0, i10);
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
