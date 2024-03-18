package ci;

import id.AbstractC3557B;
import java.io.IOException;
import java.util.zip.Deflater;
import ji.AbstractC4118G;
import ji.AbstractC4120I;
import ji.AbstractC4127b;
import ji.AbstractC4136k;
import ji.C4115D;
import ji.C4117F;
import ji.C4124M;
import ji.C4135j;
import ji.C4144s;

/* loaded from: classes2.dex */
public final class f implements AbstractC4120I {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26676Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f26677Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f26678h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f26679i0;

    public f(C4135j c4135j, Deflater deflater) {
        this(R4.b.I(c4135j), deflater);
    }

    public final void a(boolean z10) {
        C4117F d02;
        int deflate;
        AbstractC4136k abstractC4136k = (AbstractC4136k) this.f26678h0;
        C4135j d10 = abstractC4136k.d();
        while (true) {
            d02 = d10.d0(1);
            Object obj = this.f26679i0;
            byte[] bArr = d02.f36674a;
            if (z10) {
                try {
                    int i10 = d02.f36676c;
                    deflate = ((Deflater) obj).deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                int i11 = d02.f36676c;
                deflate = ((Deflater) obj).deflate(bArr, i11, 8192 - i11);
            }
            if (deflate > 0) {
                d02.f36676c += deflate;
                d10.f36721Z += deflate;
                abstractC4136k.N();
            } else if (((Deflater) obj).needsInput()) {
                break;
            }
        }
        if (d02.f36675b == d02.f36676c) {
            d10.f36720Y = d02.a();
            AbstractC4118G.a(d02);
        }
    }

    @Override // ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th2;
        int i10 = this.f26676Y;
        Object obj = this.f26678h0;
        Object obj2 = this.f26679i0;
        switch (i10) {
            case 0:
                if (!this.f26677Z) {
                    this.f26677Z = true;
                    h hVar = (h) obj2;
                    C4144s c4144s = (C4144s) obj;
                    hVar.getClass();
                    C4124M c4124m = c4144s.f36740e;
                    c4144s.f36740e = C4124M.f36687d;
                    c4124m.a();
                    c4124m.b();
                    hVar.f26685e = 3;
                    return;
                }
                return;
            default:
                if (!this.f26677Z) {
                    try {
                        ((Deflater) obj2).finish();
                        a(false);
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    try {
                        ((Deflater) obj2).end();
                    } catch (Throwable th4) {
                        if (th2 == null) {
                            th2 = th4;
                        }
                    }
                    try {
                        ((AbstractC4136k) obj).close();
                    } catch (Throwable th5) {
                        if (th2 == null) {
                            th2 = th5;
                        }
                    }
                    this.f26677Z = true;
                    if (th2 == null) {
                        return;
                    }
                    throw th2;
                }
                return;
        }
    }

    @Override // ji.AbstractC4120I
    public final C4124M f() {
        int i10 = this.f26676Y;
        Object obj = this.f26678h0;
        switch (i10) {
            case 0:
                return (C4144s) obj;
            default:
                return ((AbstractC4136k) obj).f();
        }
    }

    @Override // ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
        switch (this.f26676Y) {
            case 0:
                if (!this.f26677Z) {
                    ((h) this.f26679i0).f26684d.flush();
                    return;
                }
                return;
            default:
                a(true);
                ((AbstractC4136k) this.f26678h0).flush();
                return;
        }
    }

    @Override // ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        int i10 = this.f26676Y;
        Object obj = this.f26679i0;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("source", c4135j);
                if (!this.f26677Z) {
                    long j10 = c4135j.f36721Z;
                    byte[] bArr = Xh.b.f21996a;
                    if (j6 >= 0 && 0 <= j10 && j10 >= j6) {
                        ((h) obj).f26684d.o(c4135j, j6);
                        return;
                    }
                    throw new ArrayIndexOutOfBoundsException();
                }
                throw new IllegalStateException("closed".toString());
            default:
                AbstractC3557B.c0("source", c4135j);
                AbstractC4127b.b(c4135j.f36721Z, 0L, j6);
                while (j6 > 0) {
                    C4117F c4117f = c4135j.f36720Y;
                    AbstractC3557B.Z(c4117f);
                    int min = (int) Math.min(j6, c4117f.f36676c - c4117f.f36675b);
                    ((Deflater) obj).setInput(c4117f.f36674a, c4117f.f36675b, min);
                    a(false);
                    long j11 = min;
                    c4135j.f36721Z -= j11;
                    int i11 = c4117f.f36675b + min;
                    c4117f.f36675b = i11;
                    if (i11 == c4117f.f36676c) {
                        c4135j.f36720Y = c4117f.a();
                        AbstractC4118G.a(c4117f);
                    }
                    j6 -= j11;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f26676Y) {
            case 1:
                return "DeflaterSink(" + ((AbstractC4136k) this.f26678h0) + ')';
            default:
                return super.toString();
        }
    }

    public f(C4115D c4115d, Deflater deflater) {
        this.f26678h0 = c4115d;
        this.f26679i0 = deflater;
    }

    public f(h hVar) {
        this.f26679i0 = hVar;
        this.f26678h0 = new C4144s(hVar.f26684d.f());
    }
}
