package w2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import k6.AbstractC4194d;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6084b f47653a;

    /* renamed from: b  reason: collision with root package name */
    public final long f47654b = 5242880;

    /* renamed from: c  reason: collision with root package name */
    public final int f47655c = 20480;

    /* renamed from: d  reason: collision with root package name */
    public v2.l f47656d;

    /* renamed from: e  reason: collision with root package name */
    public long f47657e;

    /* renamed from: f  reason: collision with root package name */
    public File f47658f;

    /* renamed from: g  reason: collision with root package name */
    public OutputStream f47659g;

    /* renamed from: h  reason: collision with root package name */
    public long f47660h;

    /* renamed from: i  reason: collision with root package name */
    public long f47661i;

    /* renamed from: j  reason: collision with root package name */
    public r f47662j;

    public d(AbstractC6084b abstractC6084b) {
        this.f47653a = abstractC6084b;
    }

    public final void a() {
        boolean z10;
        OutputStream outputStream = this.f47659g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            AbstractC5530A.g(this.f47659g);
            this.f47659g = null;
            File file = this.f47658f;
            this.f47658f = null;
            long j6 = this.f47660h;
            t tVar = (t) this.f47653a;
            synchronized (tVar) {
                if (file.exists()) {
                    if (j6 == 0) {
                        file.delete();
                        return;
                    }
                    u b10 = u.b(file, j6, -9223372036854775807L, tVar.f47724c);
                    b10.getClass();
                    l h10 = tVar.f47724c.h(b10.f47688Y);
                    h10.getClass();
                    Gi.e.n(h10.a(b10.f47689Z, b10.f47690h0));
                    long k10 = AbstractC4194d.k(h10.f47700e);
                    if (k10 != -1) {
                        if (b10.f47689Z + b10.f47690h0 <= k10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Gi.e.n(z10);
                    }
                    if (tVar.f47725d != null) {
                        try {
                            tVar.f47725d.d(b10.f47690h0, b10.f47693k0, file.getName());
                        } catch (IOException e10) {
                            throw new IOException(e10);
                        }
                    }
                    tVar.b(b10);
                    try {
                        tVar.f47724c.p();
                        tVar.notifyAll();
                    } catch (IOException e11) {
                        throw new IOException(e11);
                    }
                }
            }
        } catch (Throwable th2) {
            AbstractC5530A.g(this.f47659g);
            this.f47659g = null;
            File file2 = this.f47658f;
            this.f47658f = null;
            file2.delete();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [w2.r, java.io.BufferedOutputStream] */
    public final void b(v2.l lVar) {
        long j6;
        File c10;
        long j10 = lVar.f47101g;
        if (j10 == -1) {
            j6 = -1;
        } else {
            j6 = Math.min(j10 - this.f47661i, this.f47657e);
        }
        AbstractC6084b abstractC6084b = this.f47653a;
        String str = lVar.f47102h;
        int i10 = AbstractC5530A.f45131a;
        long j11 = lVar.f47100f + this.f47661i;
        t tVar = (t) abstractC6084b;
        synchronized (tVar) {
            try {
                tVar.d();
                l h10 = tVar.f47724c.h(str);
                h10.getClass();
                Gi.e.n(h10.a(j11, j6));
                if (!tVar.f47722a.exists()) {
                    t.e(tVar.f47722a);
                    tVar.l();
                }
                q qVar = (q) tVar.f47723b;
                if (j6 != -1) {
                    qVar.a(tVar, j6);
                } else {
                    qVar.getClass();
                }
                File file = new File(tVar.f47722a, Integer.toString(tVar.f47727f.nextInt(10)));
                if (!file.exists()) {
                    t.e(file);
                }
                c10 = u.c(file, h10.f47696a, j11, System.currentTimeMillis());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f47658f = c10;
        File file2 = this.f47658f;
        io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file2), file2);
        if (this.f47655c > 0) {
            r rVar = this.f47662j;
            if (rVar == null) {
                this.f47662j = new BufferedOutputStream(p10, this.f47655c);
            } else {
                rVar.a(p10);
            }
            this.f47659g = this.f47662j;
        } else {
            this.f47659g = p10;
        }
        this.f47660h = 0L;
    }
}
