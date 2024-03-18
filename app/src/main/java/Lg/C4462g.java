package lg;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: lg.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4462g {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f38388a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38389b;

    /* renamed from: c  reason: collision with root package name */
    public int f38390c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final OutputStream f38391d;

    public C4462g(OutputStream outputStream, byte[] bArr) {
        this.f38391d = outputStream;
        this.f38388a = bArr;
        this.f38389b = bArr.length;
    }

    public static int a(int i10, int i11) {
        return c(i11) + h(i10);
    }

    public static int b(int i10, int i11) {
        return c(i11) + h(i10);
    }

    public static int c(int i10) {
        if (i10 >= 0) {
            return f(i10);
        }
        return 10;
    }

    public static int d(int i10, AbstractC4456a abstractC4456a) {
        return e(abstractC4456a) + h(i10);
    }

    public static int e(AbstractC4456a abstractC4456a) {
        int a5 = abstractC4456a.a();
        return f(a5) + a5;
    }

    public static int f(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int g(long j6) {
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (((-16384) & j6) == 0) {
            return 2;
        }
        if (((-2097152) & j6) == 0) {
            return 3;
        }
        if (((-268435456) & j6) == 0) {
            return 4;
        }
        if (((-34359738368L) & j6) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j6) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j6) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j6) == 0) {
            return 8;
        }
        if ((j6 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int h(int i10) {
        return f(i10 << 3);
    }

    public static C4462g j(OutputStream outputStream, int i10) {
        return new C4462g(outputStream, new byte[i10]);
    }

    public final void i() {
        if (this.f38391d != null) {
            k();
        }
    }

    public final void k() {
        OutputStream outputStream = this.f38391d;
        if (outputStream != null) {
            outputStream.write(this.f38388a, 0, this.f38390c);
            this.f38390c = 0;
            return;
        }
        throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public final void l(int i10, int i11) {
        x(i10, 0);
        n(i11);
    }

    public final void m(int i10, int i11) {
        x(i10, 0);
        n(i11);
    }

    public final void n(int i10) {
        if (i10 >= 0) {
            v(i10);
        } else {
            w(i10);
        }
    }

    public final void o(int i10, AbstractC4456a abstractC4456a) {
        x(i10, 2);
        p(abstractC4456a);
    }

    public final void p(AbstractC4456a abstractC4456a) {
        v(abstractC4456a.a());
        abstractC4456a.d(this);
    }

    public final void q(int i10) {
        byte b10 = (byte) i10;
        if (this.f38390c == this.f38389b) {
            k();
        }
        int i11 = this.f38390c;
        this.f38390c = i11 + 1;
        this.f38388a[i11] = b10;
    }

    public final void r(AbstractC4460e abstractC4460e) {
        int size = abstractC4460e.size();
        int i10 = this.f38390c;
        int i11 = this.f38389b;
        int i12 = i11 - i10;
        byte[] bArr = this.f38388a;
        if (i12 >= size) {
            abstractC4460e.s(0, i10, size, bArr);
            this.f38390c += size;
            return;
        }
        abstractC4460e.s(0, i10, i12, bArr);
        int i13 = size - i12;
        this.f38390c = i11;
        k();
        if (i13 <= i11) {
            abstractC4460e.s(i12, 0, i13, bArr);
            this.f38390c = i13;
        } else if (i12 >= 0) {
            if (i13 >= 0) {
                int i14 = i12 + i13;
                if (i14 <= abstractC4460e.size()) {
                    if (i13 > 0) {
                        abstractC4460e.u0(this.f38391d, i12, i13);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i14);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Source offset < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public final void s(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f38390c;
        int i11 = this.f38389b;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f38388a;
        if (i12 >= length) {
            System.arraycopy(bArr, 0, bArr2, i10, length);
            this.f38390c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        int i13 = length - i12;
        this.f38390c = i11;
        k();
        if (i13 <= i11) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f38390c = i13;
            return;
        }
        this.f38391d.write(bArr, i12, i13);
    }

    public final void t(int i10) {
        q(i10 & 255);
        q((i10 >> 8) & 255);
        q((i10 >> 16) & 255);
        q((i10 >> 24) & 255);
    }

    public final void u(long j6) {
        q(((int) j6) & 255);
        q(((int) (j6 >> 8)) & 255);
        q(((int) (j6 >> 16)) & 255);
        q(((int) (j6 >> 24)) & 255);
        q(((int) (j6 >> 32)) & 255);
        q(((int) (j6 >> 40)) & 255);
        q(((int) (j6 >> 48)) & 255);
        q(((int) (j6 >> 56)) & 255);
    }

    public final void v(int i10) {
        while ((i10 & (-128)) != 0) {
            q((i10 & 127) | 128);
            i10 >>>= 7;
        }
        q(i10);
    }

    public final void w(long j6) {
        while (((-128) & j6) != 0) {
            q((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        q((int) j6);
    }

    public final void x(int i10, int i11) {
        v((i10 << 3) | i11);
    }
}
