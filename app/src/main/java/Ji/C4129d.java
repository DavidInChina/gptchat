package ji;

import id.AbstractC3557B;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ji.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4129d implements AbstractC4120I {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f36697Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f36698Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f36699h0;

    public C4129d(OutputStream outputStream, C4124M c4124m) {
        this.f36698Z = outputStream;
        this.f36699h0 = c4124m;
    }

    @Override // ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f36697Y;
        Object obj = this.f36698Z;
        switch (i10) {
            case 0:
                C4131f c4131f = (C4131f) obj;
                AbstractC4120I abstractC4120I = (AbstractC4120I) this.f36699h0;
                c4131f.i();
                try {
                    abstractC4120I.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // ji.AbstractC4120I
    public final C4124M f() {
        switch (this.f36697Y) {
            case 0:
                return (C4131f) this.f36698Z;
            default:
                return (C4124M) this.f36699h0;
        }
    }

    @Override // ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
        int i10 = this.f36697Y;
        Object obj = this.f36698Z;
        switch (i10) {
            case 0:
                C4131f c4131f = (C4131f) obj;
                AbstractC4120I abstractC4120I = (AbstractC4120I) this.f36699h0;
                c4131f.i();
                try {
                    abstractC4120I.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        int i10 = this.f36697Y;
        Object obj = this.f36698Z;
        Object obj2 = this.f36699h0;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("source", c4135j);
                AbstractC4127b.b(c4135j.f36721Z, 0L, j6);
                while (j6 > 0) {
                    C4117F c4117f = c4135j.f36720Y;
                    AbstractC3557B.Z(c4117f);
                    long j10 = 0;
                    while (true) {
                        if (j10 < 65536) {
                            j10 += c4117f.f36676c - c4117f.f36675b;
                            if (j10 >= j6) {
                                j10 = j6;
                            } else {
                                c4117f = c4117f.f36679f;
                                AbstractC3557B.Z(c4117f);
                            }
                        }
                    }
                    C4131f c4131f = (C4131f) obj;
                    AbstractC4120I abstractC4120I = (AbstractC4120I) obj2;
                    c4131f.i();
                    try {
                        abstractC4120I.o(c4135j, j10);
                        if (!c4131f.j()) {
                            j6 -= j10;
                        } else {
                            throw c4131f.k(null);
                        }
                    } catch (IOException e10) {
                        if (!c4131f.j()) {
                            throw e10;
                        }
                        throw c4131f.k(e10);
                    } finally {
                        c4131f.j();
                    }
                }
                return;
            default:
                AbstractC3557B.c0("source", c4135j);
                AbstractC4127b.b(c4135j.f36721Z, 0L, j6);
                while (j6 > 0) {
                    ((C4124M) obj2).f();
                    C4117F c4117f2 = c4135j.f36720Y;
                    AbstractC3557B.Z(c4117f2);
                    int min = (int) Math.min(j6, c4117f2.f36676c - c4117f2.f36675b);
                    ((OutputStream) obj).write(c4117f2.f36674a, c4117f2.f36675b, min);
                    int i11 = c4117f2.f36675b + min;
                    c4117f2.f36675b = i11;
                    long j11 = min;
                    j6 -= j11;
                    c4135j.f36721Z -= j11;
                    if (i11 == c4117f2.f36676c) {
                        c4135j.f36720Y = c4117f2.a();
                        AbstractC4118G.a(c4117f2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f36697Y) {
            case 0:
                return "AsyncTimeout.sink(" + ((AbstractC4120I) this.f36699h0) + ')';
            default:
                return "sink(" + ((OutputStream) this.f36698Z) + ')';
        }
    }

    public C4129d(C4121J c4121j, C4129d c4129d) {
        this.f36698Z = c4121j;
        this.f36699h0 = c4129d;
    }
}
