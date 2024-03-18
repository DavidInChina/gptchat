package ji;

import id.AbstractC3557B;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class t implements AbstractC4120I {

    /* renamed from: Y  reason: collision with root package name */
    public final C4115D f36741Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Deflater f36742Z;

    /* renamed from: h0  reason: collision with root package name */
    public final ci.f f36743h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f36744i0;

    /* renamed from: j0  reason: collision with root package name */
    public final CRC32 f36745j0 = new CRC32();

    public t(AbstractC4120I abstractC4120I) {
        C4115D c4115d = new C4115D(abstractC4120I);
        this.f36741Y = c4115d;
        Deflater deflater = new Deflater(-1, true);
        this.f36742Z = deflater;
        this.f36743h0 = new ci.f(c4115d, deflater);
        C4135j c4135j = c4115d.f36669Z;
        c4135j.P0(8075);
        c4135j.w0(8);
        c4135j.w0(0);
        c4135j.H0(0);
        c4135j.w0(0);
        c4135j.w0(0);
    }

    @Override // ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th2;
        Deflater deflater = this.f36742Z;
        C4115D c4115d = this.f36741Y;
        if (this.f36744i0) {
            return;
        }
        try {
            ci.f fVar = this.f36743h0;
            ((Deflater) fVar.f26679i0).finish();
            fVar.a(false);
            c4115d.a((int) this.f36745j0.getValue());
            c4115d.a((int) deflater.getBytesRead());
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            deflater.end();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        try {
            c4115d.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        this.f36744i0 = true;
        if (th2 == null) {
            return;
        }
        throw th2;
    }

    @Override // ji.AbstractC4120I
    public final C4124M f() {
        return this.f36741Y.f36668Y.f();
    }

    @Override // ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
        this.f36743h0.flush();
    }

    @Override // ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        AbstractC3557B.c0("source", c4135j);
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return;
            }
            C4117F c4117f = c4135j.f36720Y;
            AbstractC3557B.Z(c4117f);
            long j10 = j6;
            while (j10 > 0) {
                int min = (int) Math.min(j10, c4117f.f36676c - c4117f.f36675b);
                this.f36745j0.update(c4117f.f36674a, c4117f.f36675b, min);
                j10 -= min;
                c4117f = c4117f.f36679f;
                AbstractC3557B.Z(c4117f);
            }
            this.f36743h0.o(c4135j, j6);
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }
}
