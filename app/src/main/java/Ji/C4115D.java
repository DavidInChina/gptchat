package ji;

import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* renamed from: ji.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4115D implements AbstractC4136k {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4120I f36668Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4135j f36669Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public boolean f36670h0;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ji.j] */
    public C4115D(AbstractC4120I abstractC4120I) {
        AbstractC3557B.c0("sink", abstractC4120I);
        this.f36668Y = abstractC4120I;
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k I(int i10) {
        if (!this.f36670h0) {
            this.f36669Z.w0(i10);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final long I0(AbstractC4122K abstractC4122K) {
        long j6 = 0;
        while (true) {
            long g02 = ((C4130e) abstractC4122K).g0(this.f36669Z, 8192L);
            if (g02 != -1) {
                j6 += g02;
                N();
            } else {
                return j6;
            }
        }
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k M(C4138m c4138m) {
        AbstractC3557B.c0("byteString", c4138m);
        if (!this.f36670h0) {
            this.f36669Z.f0(c4138m);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k M0(long j6) {
        if (!this.f36670h0) {
            this.f36669Z.A0(j6);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k N() {
        if (!this.f36670h0) {
            C4135j c4135j = this.f36669Z;
            long i10 = c4135j.i();
            if (i10 > 0) {
                this.f36668Y.o(c4135j, i10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void a(int i10) {
        if (!this.f36670h0) {
            this.f36669Z.H0(AbstractC4127b.d(i10));
            N();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k c0(String str) {
        AbstractC3557B.c0("string", str);
        if (!this.f36670h0) {
            this.f36669Z.S0(str);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th2;
        AbstractC4120I abstractC4120I = this.f36668Y;
        if (!this.f36670h0) {
            try {
                C4135j c4135j = this.f36669Z;
                long j6 = c4135j.f36721Z;
                if (j6 > 0) {
                    abstractC4120I.o(c4135j, j6);
                }
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                abstractC4120I.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            this.f36670h0 = true;
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @Override // ji.AbstractC4136k
    public final C4135j d() {
        return this.f36669Z;
    }

    @Override // ji.AbstractC4120I
    public final C4124M f() {
        return this.f36668Y.f();
    }

    @Override // ji.AbstractC4136k, ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
        if (!this.f36670h0) {
            C4135j c4135j = this.f36669Z;
            long j6 = c4135j.f36721Z;
            int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            AbstractC4120I abstractC4120I = this.f36668Y;
            if (i10 > 0) {
                abstractC4120I.o(c4135j, j6);
            }
            abstractC4120I.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k i0(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("source", bArr);
        if (!this.f36670h0) {
            this.f36669Z.u0(bArr, i10, i11);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f36670h0;
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k l0(long j6) {
        if (!this.f36670h0) {
            this.f36669Z.F0(j6);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        AbstractC3557B.c0("source", c4135j);
        if (!this.f36670h0) {
            this.f36669Z.o(c4135j, j6);
            N();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f36668Y + ')';
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k u() {
        if (!this.f36670h0) {
            C4135j c4135j = this.f36669Z;
            long j6 = c4135j.f36721Z;
            if (j6 > 0) {
                this.f36668Y.o(c4135j, j6);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k v(int i10) {
        if (!this.f36670h0) {
            this.f36669Z.P0(i10);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC3557B.c0("source", byteBuffer);
        if (!this.f36670h0) {
            int write = this.f36669Z.write(byteBuffer);
            N();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k y(int i10) {
        if (!this.f36670h0) {
            this.f36669Z.H0(i10);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k z0(byte[] bArr) {
        if (!this.f36670h0) {
            this.f36669Z.m0(bArr);
            N();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
