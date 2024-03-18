package L2;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p2.AbstractC5060m;
import s2.AbstractC5530A;
import v2.AbstractC5969h;

/* loaded from: classes2.dex */
public final class m implements r {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5060m f10624b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10625c;

    /* renamed from: d  reason: collision with root package name */
    public long f10626d;

    /* renamed from: f  reason: collision with root package name */
    public int f10628f;

    /* renamed from: g  reason: collision with root package name */
    public int f10629g;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f10627e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10623a = new byte[4096];

    static {
        p2.I.a("media3.extractor");
    }

    public m(AbstractC5969h abstractC5969h, long j6, long j10) {
        this.f10624b = abstractC5969h;
        this.f10626d = j6;
        this.f10625c = j10;
    }

    @Override // L2.r
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        int i13 = this.f10629g;
        if (i13 == 0) {
            i12 = 0;
        } else {
            i12 = Math.min(i13, i11);
            System.arraycopy(this.f10627e, 0, bArr, i10, i12);
            r(i12);
        }
        int i14 = i12;
        while (i14 < i11 && i14 != -1) {
            i14 = q(bArr, i10, i11, i14, z10);
        }
        if (i14 != -1) {
            this.f10626d += i14;
        }
        if (i14 == -1) {
            return false;
        }
        return true;
    }

    @Override // L2.r
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        if (!m(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f10627e, this.f10628f - i11, bArr, i10, i11);
        return true;
    }

    @Override // L2.r
    public final long d() {
        return this.f10626d + this.f10628f;
    }

    @Override // L2.r
    public final void e(int i10) {
        m(i10, false);
    }

    @Override // L2.r
    public final int f(int i10) {
        int min = Math.min(this.f10629g, i10);
        r(min);
        if (min == 0) {
            byte[] bArr = this.f10623a;
            min = q(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f10626d += min;
        }
        return min;
    }

    @Override // L2.r
    public final long h() {
        return this.f10625c;
    }

    @Override // L2.r
    public final int i(byte[] bArr, int i10, int i11) {
        int i12;
        p(i11);
        int i13 = this.f10629g;
        int i14 = this.f10628f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = q(this.f10627e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f10629g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f10627e, this.f10628f, bArr, i10, i12);
        this.f10628f += i12;
        return i12;
    }

    @Override // L2.r
    public final void k() {
        this.f10628f = 0;
    }

    @Override // L2.r
    public final void l(int i10) {
        int min = Math.min(this.f10629g, i10);
        r(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = q(this.f10623a, -i11, Math.min(i10, this.f10623a.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.f10626d += i11;
        }
    }

    @Override // L2.r
    public final boolean m(int i10, boolean z10) {
        p(i10);
        int i11 = this.f10629g - this.f10628f;
        while (i11 < i10) {
            i11 = q(this.f10627e, this.f10628f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f10629g = this.f10628f + i11;
        }
        this.f10628f += i10;
        return true;
    }

    @Override // L2.r
    public final void n(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    @Override // L2.r
    public final long o() {
        return this.f10626d;
    }

    public final void p(int i10) {
        int i11 = this.f10628f + i10;
        byte[] bArr = this.f10627e;
        if (i11 > bArr.length) {
            this.f10627e = Arrays.copyOf(this.f10627e, AbstractC5530A.i(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int q(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f10624b.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    public final void r(int i10) {
        byte[] bArr;
        int i11 = this.f10629g - i10;
        this.f10629g = i11;
        this.f10628f = 0;
        byte[] bArr2 = this.f10627e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f10627e = bArr;
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f10629g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f10627e, 0, bArr, i10, min);
            r(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = q(bArr, i10, i11, 0, true);
        }
        if (i13 != -1) {
            this.f10626d += i13;
        }
        return i13;
    }

    @Override // L2.r
    public final void readFully(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }
}
