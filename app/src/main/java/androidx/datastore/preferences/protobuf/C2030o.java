package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;

/* renamed from: androidx.datastore.preferences.protobuf.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2030o extends AbstractC2031p {

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f25090f;

    /* renamed from: g  reason: collision with root package name */
    public final int f25091g;

    /* renamed from: h  reason: collision with root package name */
    public int f25092h;

    /* renamed from: i  reason: collision with root package name */
    public final OutputStream f25093i;

    public C2030o(M1.q qVar, int i10) {
        if (i10 >= 0) {
            int max = Math.max(i10, 20);
            this.f25090f = new byte[max];
            this.f25091g = max;
            this.f25093i = qVar;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void I(byte b10) {
        if (this.f25092h == this.f25091g) {
            h0();
        }
        int i10 = this.f25092h;
        this.f25092h = i10 + 1;
        this.f25090f[i10] = b10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void J(int i10, boolean z10) {
        i0(11);
        e0(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f25092h;
        this.f25092h = i11 + 1;
        this.f25090f[i11] = b10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void K(byte[] bArr, int i10) {
        Z(i10);
        j0(bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void L(int i10, AbstractC2025j abstractC2025j) {
        X(i10, 2);
        M(abstractC2025j);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void M(AbstractC2025j abstractC2025j) {
        Z(abstractC2025j.size());
        C2026k c2026k = (C2026k) abstractC2025j;
        j(c2026k.f25069i0, c2026k.T(), c2026k.size());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void N(int i10, int i11) {
        i0(14);
        e0(i10, 5);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void O(int i10) {
        i0(4);
        c0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void P(int i10, long j6) {
        i0(18);
        e0(i10, 1);
        d0(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void Q(long j6) {
        i0(8);
        d0(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void R(int i10, int i11) {
        i0(20);
        e0(i10, 0);
        if (i11 >= 0) {
            f0(i11);
        } else {
            g0(i11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void S(int i10) {
        if (i10 >= 0) {
            Z(i10);
        } else {
            b0(i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void T(int i10, AbstractC2011b abstractC2011b, AbstractC2022g0 abstractC2022g0) {
        X(i10, 2);
        Z(abstractC2011b.b(abstractC2022g0));
        abstractC2022g0.i(abstractC2011b, this.f25102c);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void U(AbstractC2011b abstractC2011b) {
        Z(abstractC2011b.a());
        abstractC2011b.c(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void V(int i10, String str) {
        X(i10, 2);
        W(str);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void W(String str) {
        try {
            int length = str.length() * 3;
            int E10 = AbstractC2031p.E(length);
            int i10 = E10 + length;
            int i11 = this.f25091g;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int l10 = A0.f24958a.l(str, bArr, 0, length);
                Z(l10);
                j0(bArr, 0, l10);
                return;
            }
            if (i10 > i11 - this.f25092h) {
                h0();
            }
            int E11 = AbstractC2031p.E(str.length());
            int i12 = this.f25092h;
            byte[] bArr2 = this.f25090f;
            try {
                try {
                    if (E11 == E10) {
                        int i13 = i12 + E11;
                        this.f25092h = i13;
                        int l11 = A0.f24958a.l(str, bArr2, i13, i11 - i13);
                        this.f25092h = i12;
                        f0((l11 - i12) - E11);
                        this.f25092h = l11;
                    } else {
                        int b10 = A0.b(str);
                        f0(b10);
                        this.f25092h = A0.f24958a.l(str, bArr2, this.f25092h, b10);
                    }
                } catch (z0 e10) {
                    this.f25092h = i12;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new C2029n(e11);
            }
        } catch (z0 e12) {
            H(str, e12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void X(int i10, int i11) {
        Z((i10 << 3) | i11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void Y(int i10, int i11) {
        i0(20);
        e0(i10, 0);
        f0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void Z(int i10) {
        i0(5);
        f0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void a0(int i10, long j6) {
        i0(20);
        e0(i10, 0);
        g0(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2031p
    public final void b0(long j6) {
        i0(10);
        g0(j6);
    }

    public final void c0(int i10) {
        int i11 = this.f25092h;
        byte[] bArr = this.f25090f;
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
        this.f25092h = i11 + 4;
        bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
    }

    public final void d0(long j6) {
        int i10 = this.f25092h;
        byte[] bArr = this.f25090f;
        bArr[i10] = (byte) (j6 & 255);
        bArr[i10 + 1] = (byte) ((j6 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j6 >> 16) & 255);
        bArr[i10 + 3] = (byte) (255 & (j6 >> 24));
        bArr[i10 + 4] = (byte) (((int) (j6 >> 32)) & 255);
        bArr[i10 + 5] = (byte) (((int) (j6 >> 40)) & 255);
        bArr[i10 + 6] = (byte) (((int) (j6 >> 48)) & 255);
        this.f25092h = i10 + 8;
        bArr[i10 + 7] = (byte) (((int) (j6 >> 56)) & 255);
    }

    public final void e0(int i10, int i11) {
        f0((i10 << 3) | i11);
    }

    public final void f0(int i10) {
        boolean z10 = AbstractC2031p.f25101e;
        byte[] bArr = this.f25090f;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f25092h;
                this.f25092h = i11 + 1;
                x0.m(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f25092h;
            this.f25092h = i12 + 1;
            x0.m(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f25092h;
            this.f25092h = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f25092h;
        this.f25092h = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void g0(long j6) {
        boolean z10 = AbstractC2031p.f25101e;
        byte[] bArr = this.f25090f;
        if (z10) {
            while ((j6 & (-128)) != 0) {
                int i10 = this.f25092h;
                this.f25092h = i10 + 1;
                x0.m(bArr, i10, (byte) ((((int) j6) & 127) | 128));
                j6 >>>= 7;
            }
            int i11 = this.f25092h;
            this.f25092h = i11 + 1;
            x0.m(bArr, i11, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            int i12 = this.f25092h;
            this.f25092h = i12 + 1;
            bArr[i12] = (byte) ((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        int i13 = this.f25092h;
        this.f25092h = i13 + 1;
        bArr[i13] = (byte) j6;
    }

    public final void h0() {
        this.f25093i.write(this.f25090f, 0, this.f25092h);
        this.f25092h = 0;
    }

    public final void i0(int i10) {
        if (this.f25091g - this.f25092h < i10) {
            h0();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void j(byte[] bArr, int i10, int i11) {
        j0(bArr, i10, i11);
    }

    public final void j0(byte[] bArr, int i10, int i11) {
        int i12 = this.f25092h;
        int i13 = this.f25091g;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f25090f;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f25092h += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f25092h = i13;
        h0();
        if (i16 <= i13) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f25092h = i16;
            return;
        }
        this.f25093i.write(bArr, i15, i16);
    }
}
