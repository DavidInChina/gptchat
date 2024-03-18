package io.sentry;

import id.AbstractC3557B;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: io.sentry.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3679q extends AbstractC3670o implements F {

    /* renamed from: e  reason: collision with root package name */
    public final G f34681e;

    /* renamed from: f  reason: collision with root package name */
    public final Q f34682f;

    /* renamed from: g  reason: collision with root package name */
    public final H f34683g;

    public C3679q(G g10, Q q10, H h10, long j6, int i10) {
        super(g10, h10, j6, i10);
        Ad.l.Z0("Hub is required.", g10);
        this.f34681e = g10;
        Ad.l.Z0("Serializer is required.", q10);
        this.f34682f = q10;
        Ad.l.Z0("Logger is required.", h10);
        this.f34683g = h10;
    }

    public static void d(C3679q c3679q, File file, io.sentry.hints.g gVar) {
        c3679q.getClass();
        boolean a5 = gVar.a();
        H h10 = c3679q.f34683g;
        if (!a5) {
            try {
                if (!file.delete()) {
                    h10.f(EnumC3642e1.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
                }
            } catch (Throwable th2) {
                h10.b(EnumC3642e1.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
            h10.f(EnumC3642e1.DEBUG, "Deleted file %s.", file.getAbsolutePath());
            return;
        }
        h10.f(EnumC3642e1.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.F
    public final void a(C3686u c3686u, String str) {
        Ad.l.Z0("Path is required.", str);
        c(new File(str), c3686u);
    }

    @Override // io.sentry.AbstractC3670o
    public final boolean b(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
        return;
     */
    @Override // io.sentry.AbstractC3670o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(File file, C3686u c3686u) {
        Object v12;
        boolean isFile = file.isFile();
        H h10 = this.f34683g;
        if (!isFile) {
            h10.f(EnumC3642e1.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
        } else if (!file.getName().endsWith(".envelope")) {
            h10.f(EnumC3642e1.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
        } else {
            try {
                if (!file.getParentFile().canWrite()) {
                    h10.f(EnumC3642e1.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                    return;
                }
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        T0 h11 = this.f34682f.h(bufferedInputStream);
                        if (h11 == null) {
                            h10.f(EnumC3642e1.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f34681e.w(h11, c3686u);
                        }
                        Object v13 = AbstractC3557B.v1(c3686u);
                        if (io.sentry.hints.f.class.isInstance(AbstractC3557B.v1(c3686u)) && v13 != null) {
                            if (!((io.sentry.hints.f) v13).d()) {
                                h10.f(EnumC3642e1.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                            }
                        } else {
                            AbstractC3557B.b2(h10, io.sentry.hints.f.class, v13);
                        }
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException e10) {
                    h10.b(EnumC3642e1.ERROR, e10, "File '%s' cannot be found.", file.getAbsolutePath());
                    v12 = AbstractC3557B.v1(c3686u);
                    if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u))) {
                    }
                } catch (IOException e11) {
                    h10.b(EnumC3642e1.ERROR, e11, "I/O on file '%s' failed.", file.getAbsolutePath());
                    v12 = AbstractC3557B.v1(c3686u);
                    if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u))) {
                    }
                } catch (Throwable th4) {
                    h10.b(EnumC3642e1.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                    Object v14 = AbstractC3557B.v1(c3686u);
                    if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) && v14 != null) {
                        ((io.sentry.hints.g) v14).c(false);
                        h10.b(EnumC3642e1.INFO, th4, "File '%s' won't retry.", file.getAbsolutePath());
                    } else {
                        AbstractC3557B.b2(h10, io.sentry.hints.g.class, v14);
                    }
                    v12 = AbstractC3557B.v1(c3686u);
                    if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u))) {
                    }
                }
            } finally {
                Object v15 = AbstractC3557B.v1(c3686u);
                if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) && v15 != null) {
                    d(this, file, (io.sentry.hints.g) v15);
                } else {
                    AbstractC3557B.b2(h10, io.sentry.hints.g.class, v15);
                }
            }
        }
    }
}
