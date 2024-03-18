package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class H extends r9.y {

    /* renamed from: p  reason: collision with root package name */
    public static final Logger f26843p = Logger.getLogger(H.class.getName());

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f26844q = J0.f26857e;

    /* renamed from: l  reason: collision with root package name */
    public I f26845l;

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f26846m;

    /* renamed from: n  reason: collision with root package name */
    public final int f26847n;

    /* renamed from: o  reason: collision with root package name */
    public int f26848o;

    public H(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) >= 0) {
            this.f26846m = bArr;
            this.f26848o = 0;
            this.f26847n = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
    }

    public static int A1(int i10, AbstractC2481x abstractC2481x, AbstractC2486z0 abstractC2486z0) {
        int D12 = D1(i10 << 3);
        return abstractC2481x.a(abstractC2486z0) + D12 + D12;
    }

    public static int B1(AbstractC2481x abstractC2481x, AbstractC2486z0 abstractC2486z0) {
        int a5 = abstractC2481x.a(abstractC2486z0);
        return D1(a5) + a5;
    }

    public static int C1(String str) {
        int i10;
        try {
            i10 = L0.c(str);
        } catch (K0 unused) {
            i10 = str.getBytes(Y.f26890a).length;
        }
        return D1(i10) + i10;
    }

    public static int D1(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int E1(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public final void o1(byte b10) {
        try {
            byte[] bArr = this.f26846m;
            int i10 = this.f26848o;
            this.f26848o = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(4, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26848o), Integer.valueOf(this.f26847n), 1), e10);
        }
    }

    public final void p1(byte[] bArr, int i10) {
        try {
            System.arraycopy(bArr, 0, this.f26846m, this.f26848o, i10);
            this.f26848o += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(4, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26848o), Integer.valueOf(this.f26847n), Integer.valueOf(i10)), e10);
        }
    }

    public final void q1(int i10, E e10) {
        x1((i10 << 3) | 2);
        x1(e10.I());
        F f6 = (F) e10;
        p1(f6.f26842h0, f6.I());
    }

    public final void r1(int i10, int i11) {
        x1((i10 << 3) | 5);
        s1(i11);
    }

    public final void s1(int i10) {
        try {
            byte[] bArr = this.f26846m;
            int i11 = this.f26848o;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.f26848o = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(4, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26848o), Integer.valueOf(this.f26847n), 1), e10);
        }
    }

    public final void t1(int i10, long j6) {
        x1((i10 << 3) | 1);
        u1(j6);
    }

    public final void u1(long j6) {
        try {
            byte[] bArr = this.f26846m;
            int i10 = this.f26848o;
            bArr[i10] = (byte) (((int) j6) & 255);
            bArr[i10 + 1] = (byte) (((int) (j6 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j6 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j6 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j6 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j6 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j6 >> 48)) & 255);
            this.f26848o = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j6 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(4, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26848o), Integer.valueOf(this.f26847n), 1), e10);
        }
    }

    public final void v1(int i10, String str) {
        x1((i10 << 3) | 2);
        int i11 = this.f26848o;
        try {
            int D12 = D1(str.length() * 3);
            int D13 = D1(str.length());
            int i12 = this.f26847n;
            byte[] bArr = this.f26846m;
            if (D13 == D12) {
                int i13 = i11 + D13;
                this.f26848o = i13;
                int b10 = L0.b(str, bArr, i13, i12 - i13);
                this.f26848o = i11;
                x1((b10 - i11) - D13);
                this.f26848o = b10;
            } else {
                x1(L0.c(str));
                int i14 = this.f26848o;
                this.f26848o = L0.b(str, bArr, i14, i12 - i14);
            }
        } catch (K0 e10) {
            this.f26848o = i11;
            f26843p.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(Y.f26890a);
            try {
                int length = bytes.length;
                x1(length);
                p1(bytes, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new E2.F(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new E2.F(e12);
        }
    }

    public final void w1(int i10, int i11) {
        x1((i10 << 3) | i11);
    }

    public final void x1(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f26846m;
            if (i11 == 0) {
                int i12 = this.f26848o;
                this.f26848o = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            }
            try {
                int i13 = this.f26848o;
                this.f26848o = i13 + 1;
                bArr[i13] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new E2.F(4, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26848o), Integer.valueOf(this.f26847n), 1), e10);
            }
            throw new E2.F(4, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26848o), Integer.valueOf(this.f26847n), 1), e10);
        }
    }

    public final void y1(int i10, long j6) {
        x1(i10 << 3);
        z1(j6);
    }

    public final void z1(long j6) {
        boolean z10 = f26844q;
        int i10 = this.f26847n;
        byte[] bArr = this.f26846m;
        if (!z10 || i10 - this.f26848o < 10) {
            while ((j6 & (-128)) != 0) {
                try {
                    int i11 = this.f26848o;
                    this.f26848o = i11 + 1;
                    bArr[i11] = (byte) ((((int) j6) | 128) & 255);
                    j6 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new E2.F(4, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26848o), Integer.valueOf(i10), 1), e10);
                }
            }
            int i12 = this.f26848o;
            this.f26848o = i12 + 1;
            bArr[i12] = (byte) j6;
            return;
        }
        while (true) {
            int i13 = (int) j6;
            if ((j6 & (-128)) == 0) {
                int i14 = this.f26848o;
                this.f26848o = 1 + i14;
                J0.f26855c.d(bArr, J0.f26858f + i14, (byte) i13);
                return;
            }
            int i15 = this.f26848o;
            this.f26848o = i15 + 1;
            J0.f26855c.d(bArr, J0.f26858f + i15, (byte) ((i13 | 128) & 255));
            j6 >>>= 7;
        }
    }
}
