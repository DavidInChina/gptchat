package ji;

import id.AbstractC3557B;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ji.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4130e implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f36700Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f36701Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f36702h0;

    public C4130e(InputStream inputStream, C4124M c4124m) {
        AbstractC3557B.c0("input", inputStream);
        this.f36701Z = inputStream;
        this.f36702h0 = c4124m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f36700Y;
        Object obj = this.f36701Z;
        switch (i10) {
            case 0:
                C4131f c4131f = (C4131f) obj;
                AbstractC4122K abstractC4122K = (AbstractC4122K) this.f36702h0;
                c4131f.i();
                try {
                    abstractC4122K.close();
                    if (!c4131f.j()) {
                        return;
                    }
                    throw c4131f.k(null);
                } catch (IOException e10) {
                    if (!c4131f.j()) {
                        throw e10;
                    }
                    throw c4131f.k(e10);
                } finally {
                    c4131f.j();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        switch (this.f36700Y) {
            case 0:
                return (C4131f) this.f36701Z;
            default:
                return (C4124M) this.f36702h0;
        }
    }

    @Override // ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        int i10 = this.f36700Y;
        Object obj = this.f36701Z;
        Object obj2 = this.f36702h0;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("sink", c4135j);
                C4131f c4131f = (C4131f) obj;
                AbstractC4122K abstractC4122K = (AbstractC4122K) obj2;
                c4131f.i();
                try {
                    long g02 = abstractC4122K.g0(c4135j, j6);
                    if (!c4131f.j()) {
                        return g02;
                    }
                    throw c4131f.k(null);
                } catch (IOException e10) {
                    if (!c4131f.j()) {
                        throw e10;
                    }
                    throw c4131f.k(e10);
                } finally {
                    c4131f.j();
                }
            default:
                AbstractC3557B.c0("sink", c4135j);
                int i11 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                if (i11 == 0) {
                    return 0L;
                }
                if (i11 >= 0) {
                    try {
                        ((C4124M) obj2).f();
                        C4117F d02 = c4135j.d0(1);
                        int read = ((InputStream) obj).read(d02.f36674a, d02.f36676c, (int) Math.min(j6, 8192 - d02.f36676c));
                        if (read == -1) {
                            if (d02.f36675b == d02.f36676c) {
                                c4135j.f36720Y = d02.a();
                                AbstractC4118G.a(d02);
                            }
                            return -1L;
                        }
                        d02.f36676c += read;
                        long j10 = read;
                        c4135j.f36721Z += j10;
                        return j10;
                    } catch (AssertionError e11) {
                        if (R4.b.t1(e11)) {
                            throw new IOException(e11);
                        }
                        throw e11;
                    }
                }
                throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
        }
    }

    public final String toString() {
        switch (this.f36700Y) {
            case 0:
                return "AsyncTimeout.source(" + ((AbstractC4122K) this.f36702h0) + ')';
            default:
                return "source(" + ((InputStream) this.f36701Z) + ')';
        }
    }

    public C4130e(C4121J c4121j, C4130e c4130e) {
        this.f36701Z = c4121j;
        this.f36702h0 = c4130e;
    }
}
