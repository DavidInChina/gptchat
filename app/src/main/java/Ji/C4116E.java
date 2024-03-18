package ji;

import id.AbstractC3557B;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import ki.AbstractC4301a;

/* renamed from: ji.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4116E implements AbstractC4137l {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4122K f36671Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4135j f36672Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public boolean f36673h0;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ji.j] */
    public C4116E(AbstractC4122K abstractC4122K) {
        AbstractC3557B.c0("source", abstractC4122K);
        this.f36671Y = abstractC4122K;
    }

    @Override // ji.AbstractC4137l
    public final long A(C4115D c4115d) {
        C4135j c4135j;
        long j6 = 0;
        while (true) {
            AbstractC4122K abstractC4122K = this.f36671Y;
            c4135j = this.f36672Z;
            if (abstractC4122K.g0(c4135j, 8192L) == -1) {
                break;
            }
            long i10 = c4135j.i();
            if (i10 > 0) {
                j6 += i10;
                c4115d.o(c4135j, i10);
            }
        }
        long j10 = c4135j.f36721Z;
        if (j10 > 0) {
            long j11 = j6 + j10;
            c4115d.o(c4135j, j10);
            return j11;
        }
        return j6;
    }

    @Override // ji.AbstractC4137l
    public final long C0() {
        J0(8L);
        return this.f36672Z.C0();
    }

    @Override // ji.AbstractC4137l
    public final long D0(C4138m c4138m) {
        AbstractC3557B.c0("targetBytes", c4138m);
        if (!this.f36673h0) {
            long j6 = 0;
            while (true) {
                C4135j c4135j = this.f36672Z;
                long p10 = c4135j.p(j6, c4138m);
                if (p10 == -1) {
                    long j10 = c4135j.f36721Z;
                    if (this.f36671Y.g0(c4135j, 8192L) == -1) {
                        return -1L;
                    }
                    j6 = Math.max(j6, j10);
                } else {
                    return p10;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // ji.AbstractC4137l
    public final boolean H() {
        if (!this.f36673h0) {
            C4135j c4135j = this.f36672Z;
            if (c4135j.H() && this.f36671Y.g0(c4135j, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4137l
    public final void J0(long j6) {
        if (o0(j6)) {
            return;
        }
        throw new EOFException();
    }

    @Override // ji.AbstractC4137l
    public final void K0(C4135j c4135j, long j6) {
        C4135j c4135j2 = this.f36672Z;
        AbstractC3557B.c0("sink", c4135j);
        try {
            J0(j6);
            c4135j2.K0(c4135j, j6);
        } catch (EOFException e10) {
            c4135j.I0(c4135j2);
            throw e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        K4.J.j(16);
        r1 = java.lang.Integer.toString(r2, 16);
        id.AbstractC3557B.b0("toString(...)", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // ji.AbstractC4137l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long O0() {
        C4135j c4135j;
        J0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean o02 = o0(i11);
            c4135j = this.f36672Z;
            if (!o02) {
                break;
            }
            byte k10 = c4135j.k(i10);
            if ((k10 < 48 || k10 > 57) && ((k10 < 97 || k10 > 102) && (k10 < 65 || k10 > 70))) {
                break;
            }
            i10 = i11;
        }
        return c4135j.O0();
    }

    @Override // ji.AbstractC4137l
    public final C4134i Q0() {
        return new C4134i(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, ji.j] */
    @Override // ji.AbstractC4137l
    public final String R(long j6) {
        long j10;
        ?? obj;
        if (j6 >= 0) {
            if (j6 == Long.MAX_VALUE) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j6 + 1;
            }
            long a5 = a((byte) 10, 0L, j10);
            int i10 = (a5 > (-1L) ? 1 : (a5 == (-1L) ? 0 : -1));
            C4135j c4135j = this.f36672Z;
            if (i10 != 0) {
                return AbstractC4301a.a(c4135j, a5);
            }
            if (j10 < Long.MAX_VALUE && o0(j10) && c4135j.k(j10 - 1) == 13 && o0(1 + j10) && c4135j.k(j10) == 10) {
                return AbstractC4301a.a(c4135j, j10);
            }
            c4135j.j(0L, Math.min(32, c4135j.f36721Z), new Object());
            throw new EOFException("\\n not found: limit=" + Math.min(c4135j.f36721Z, j6) + " content=" + obj.q(obj.f36721Z).e() + '\u2026');
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("limit < 0: ", j6).toString());
    }

    public final long a(byte b10, long j6, long j10) {
        if (!this.f36673h0) {
            if (0 <= j6 && j6 <= j10) {
                while (j6 < j10) {
                    long m10 = this.f36672Z.m(b10, j6, j10);
                    if (m10 != -1) {
                        return m10;
                    }
                    C4135j c4135j = this.f36672Z;
                    long j11 = c4135j.f36721Z;
                    if (j11 >= j10 || this.f36671Y.g0(c4135j, 8192L) == -1) {
                        return -1L;
                    }
                    j6 = Math.max(j6, j11);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j6 + " toIndex=" + j10).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f36673h0) {
            this.f36673h0 = true;
            this.f36671Y.close();
            this.f36672Z.a();
        }
    }

    @Override // ji.AbstractC4137l
    public final C4135j d() {
        return this.f36672Z;
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f36671Y.f();
    }

    @Override // ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        if (j6 >= 0) {
            if (!this.f36673h0) {
                C4135j c4135j2 = this.f36672Z;
                if (c4135j2.f36721Z == 0 && this.f36671Y.g0(c4135j2, 8192L) == -1) {
                    return -1L;
                }
                return c4135j2.g0(c4135j, Math.min(j6, c4135j2.f36721Z));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }

    public final boolean h(long j6, C4138m c4138m) {
        AbstractC3557B.c0("bytes", c4138m);
        byte[] bArr = c4138m.f36723Y;
        int length = bArr.length;
        if (!this.f36673h0) {
            if (j6 >= 0 && length >= 0 && bArr.length >= length) {
                for (int i10 = 0; i10 < length; i10++) {
                    long j10 = i10 + j6;
                    if (o0(1 + j10) && this.f36672Z.k(j10) == bArr[i10]) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4137l
    public final String h0(Charset charset) {
        C4135j c4135j = this.f36672Z;
        c4135j.I0(this.f36671Y);
        return c4135j.S(c4135j.f36721Z, charset);
    }

    public final short i() {
        J0(2L);
        return this.f36672Z.P();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f36673h0;
    }

    public final String j(long j6) {
        J0(j6);
        C4135j c4135j = this.f36672Z;
        c4135j.getClass();
        return c4135j.S(j6, Lg.a.f11131a);
    }

    @Override // ji.AbstractC4137l
    public final boolean o0(long j6) {
        C4135j c4135j;
        if (j6 >= 0) {
            if (!this.f36673h0) {
                do {
                    c4135j = this.f36672Z;
                    if (c4135j.f36721Z >= j6) {
                        return true;
                    }
                } while (this.f36671Y.g0(c4135j, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }

    @Override // ji.AbstractC4137l
    public final int p0(C4112A c4112a) {
        AbstractC3557B.c0("options", c4112a);
        if (!this.f36673h0) {
            while (true) {
                C4135j c4135j = this.f36672Z;
                int b10 = AbstractC4301a.b(c4135j, c4112a, true);
                if (b10 != -2) {
                    if (b10 != -1) {
                        c4135j.skip(c4112a.f36658Y[b10].d());
                        return b10;
                    }
                } else if (this.f36671Y.g0(c4135j, 8192L) == -1) {
                    break;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4137l
    public final C4116E peek() {
        return R4.b.J(new C4114C(this));
    }

    @Override // ji.AbstractC4137l
    public final C4138m q(long j6) {
        J0(j6);
        return this.f36672Z.q(j6);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC3557B.c0("sink", byteBuffer);
        C4135j c4135j = this.f36672Z;
        if (c4135j.f36721Z == 0 && this.f36671Y.g0(c4135j, 8192L) == -1) {
            return -1;
        }
        return c4135j.read(byteBuffer);
    }

    @Override // ji.AbstractC4137l
    public final byte readByte() {
        J0(1L);
        return this.f36672Z.readByte();
    }

    @Override // ji.AbstractC4137l
    public final void readFully(byte[] bArr) {
        C4135j c4135j = this.f36672Z;
        try {
            J0(bArr.length);
            c4135j.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                long j6 = c4135j.f36721Z;
                if (j6 > 0) {
                    int read = c4135j.read(bArr, i10, (int) j6);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    @Override // ji.AbstractC4137l
    public final int readInt() {
        J0(4L);
        return this.f36672Z.readInt();
    }

    @Override // ji.AbstractC4137l
    public final long readLong() {
        J0(8L);
        return this.f36672Z.readLong();
    }

    @Override // ji.AbstractC4137l
    public final short readShort() {
        J0(2L);
        return this.f36672Z.readShort();
    }

    @Override // ji.AbstractC4137l
    public final void skip(long j6) {
        if (!this.f36673h0) {
            while (j6 > 0) {
                C4135j c4135j = this.f36672Z;
                if (c4135j.f36721Z == 0 && this.f36671Y.g0(c4135j, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j6, c4135j.f36721Z);
                c4135j.skip(min);
                j6 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4137l
    public final String t0() {
        return R(Long.MAX_VALUE);
    }

    public final String toString() {
        return "buffer(" + this.f36671Y + ')';
    }

    @Override // ji.AbstractC4137l
    public final int v0() {
        J0(4L);
        return this.f36672Z.v0();
    }
}
