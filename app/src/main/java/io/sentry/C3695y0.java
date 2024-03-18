package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import io.sentry.protocol.C3676c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import l8.AbstractC4344b;

/* renamed from: io.sentry.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3695y0 extends AbstractC3670o implements F {

    /* renamed from: i  reason: collision with root package name */
    public static final Charset f34830i = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public final G f34831e;

    /* renamed from: f  reason: collision with root package name */
    public final E f34832f;

    /* renamed from: g  reason: collision with root package name */
    public final Q f34833g;

    /* renamed from: h  reason: collision with root package name */
    public final H f34834h;

    public C3695y0(G g10, E e10, Q q10, H h10, long j6, int i10) {
        super(g10, h10, j6, i10);
        Ad.l.Z0("Hub is required.", g10);
        this.f34831e = g10;
        Ad.l.Z0("Envelope reader is required.", e10);
        this.f34832f = e10;
        Ad.l.Z0("Serializer is required.", q10);
        this.f34833g = q10;
        Ad.l.Z0("Logger is required.", h10);
        this.f34834h = h10;
    }

    public static /* synthetic */ void d(C3695y0 c3695y0, File file, io.sentry.hints.g gVar) {
        H h10 = c3695y0.f34834h;
        if (!gVar.a()) {
            try {
                if (!file.delete()) {
                    h10.f(EnumC3642e1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                }
            } catch (RuntimeException e10) {
                h10.b(EnumC3642e1.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
    }

    @Override // io.sentry.F
    public final void a(C3686u c3686u, String str) {
        Ad.l.Z0("Path is required.", str);
        c(new File(str), c3686u);
    }

    @Override // io.sentry.AbstractC3670o
    public final boolean b(String str) {
        if (str != null && !str.startsWith(ParameterNames.SESSION) && !str.startsWith("previous_session") && !str.startsWith("startup_crash")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
        return;
     */
    @Override // io.sentry.AbstractC3670o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(File file, C3686u c3686u) {
        boolean b10 = b(file.getName());
        H h10 = this.f34834h;
        try {
            if (!b10) {
                h10.f(EnumC3642e1.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    T0 m10 = this.f34832f.m(bufferedInputStream);
                    if (m10 == null) {
                        h10.f(EnumC3642e1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        f(m10, c3686u);
                        h10.f(EnumC3642e1.DEBUG, "File '%s' is done.", file.getAbsolutePath());
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
            } catch (IOException e10) {
                h10.d(EnumC3642e1.ERROR, "Error processing envelope.", e10);
                Object v12 = AbstractC3557B.v1(c3686u);
                if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u))) {
                }
            }
        } finally {
            Object v13 = AbstractC3557B.v1(c3686u);
            if (io.sentry.hints.g.class.isInstance(AbstractC3557B.v1(c3686u)) && v13 != null) {
                d(this, file, (io.sentry.hints.g) v13);
            } else {
                AbstractC3557B.b2(h10, io.sentry.hints.g.class, v13);
            }
        }
    }

    public final U3.n e(G1 g1) {
        String str;
        H h10 = this.f34834h;
        if (g1 != null && (str = g1.f33794m0) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(str));
                if (!AbstractC4344b.B0(valueOf, false)) {
                    h10.f(EnumC3642e1.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
                } else {
                    return new U3.n(Boolean.TRUE, valueOf);
                }
            } catch (Exception unused) {
                h10.f(EnumC3642e1.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new U3.n(Boolean.TRUE, (Double) null);
    }

    public final void f(T0 t02, C3686u c3686u) {
        int i10;
        Iterator it;
        int i11;
        char c10;
        Object v12;
        Throwable th2;
        BufferedReader bufferedReader;
        Throwable th3;
        io.sentry.protocol.z zVar;
        T0 t03 = t02;
        char c11 = 0;
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        int i12 = 1;
        Object[] objArr = new Object[1];
        Iterable iterable = t03.f33865b;
        if (iterable instanceof Collection) {
            i10 = ((Collection) iterable).size();
        } else {
            Iterator it2 = iterable.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                it2.next();
                i13++;
            }
            i10 = i13;
        }
        objArr[0] = Integer.valueOf(i10);
        H h10 = this.f34834h;
        h10.f(enumC3642e1, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = iterable.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            X0 x02 = (X0) it3.next();
            int i15 = i14 + 1;
            Y0 y02 = x02.f33884a;
            if (y02 == null) {
                EnumC3642e1 enumC3642e12 = EnumC3642e1.ERROR;
                Object[] objArr2 = new Object[i12];
                objArr2[c11] = Integer.valueOf(i15);
                h10.f(enumC3642e12, "Item %d has no header", objArr2);
                c10 = c11;
                i11 = i12;
                it = it3;
            } else {
                boolean equals = EnumC3639d1.Event.equals(y02.f33890h0);
                U0 u02 = t03.f33864a;
                Y0 y03 = x02.f33884a;
                Q q10 = this.f34833g;
                Charset charset = f34830i;
                it = it3;
                G g10 = this.f34831e;
                if (equals) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(x02.d()), charset));
                        Z0 z02 = (Z0) q10.e(bufferedReader2, Z0.class);
                        if (z02 == null) {
                            h10.f(EnumC3642e1.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i15), y03.f33890h0);
                        } else {
                            io.sentry.protocol.q qVar = z02.f33838h0;
                            if (qVar != null) {
                                String str = qVar.f34607Y;
                                if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                    c3686u.c("sentry:isFromHybridSdk", Boolean.TRUE);
                                }
                            }
                            io.sentry.protocol.s sVar = u02.f33866Y;
                            if (sVar != null && !sVar.equals(z02.f33836Y)) {
                                h10.f(EnumC3642e1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i15), u02.f33866Y, z02.f33836Y);
                                bufferedReader2.close();
                                c10 = 0;
                                i11 = 1;
                            } else {
                                g10.C(z02, c3686u);
                                h10.f(EnumC3642e1.DEBUG, "Item %d is being captured.", Integer.valueOf(i15));
                                if (!g(c3686u)) {
                                    h10.f(EnumC3642e1.WARNING, "Timed out waiting for event id submission: %s", z02.f33836Y);
                                    bufferedReader2.close();
                                    return;
                                }
                            }
                        }
                        bufferedReader2.close();
                    } catch (Throwable th4) {
                        h10.d(EnumC3642e1.ERROR, "Item failed to process.", th4);
                    }
                } else if (EnumC3639d1.Transaction.equals(y03.f33890h0)) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(x02.d()), charset));
                        try {
                            zVar = (io.sentry.protocol.z) q10.e(bufferedReader, io.sentry.protocol.z.class);
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                    if (zVar == null) {
                        try {
                            h10.f(EnumC3642e1.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i15), y03.f33890h0);
                        } catch (Throwable th7) {
                            th3 = th7;
                        }
                    } else {
                        C3676c c3676c = zVar.f33837Z;
                        io.sentry.protocol.s sVar2 = u02.f33866Y;
                        if (sVar2 != null && !sVar2.equals(zVar.f33836Y)) {
                            try {
                                h10.f(EnumC3642e1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i15), u02.f33866Y, zVar.f33836Y);
                                try {
                                    bufferedReader.close();
                                    c10 = 0;
                                    i11 = 1;
                                } catch (Throwable th8) {
                                    th2 = th8;
                                    h10.d(EnumC3642e1.ERROR, "Item failed to process.", th2);
                                    v12 = AbstractC3557B.v1(c3686u);
                                    if (!(v12 instanceof io.sentry.hints.j)) {
                                    }
                                    Object v13 = AbstractC3557B.v1(c3686u);
                                    if (!io.sentry.android.core.G.class.isInstance(AbstractC3557B.v1(c3686u))) {
                                    }
                                    c10 = 0;
                                    i11 = 1;
                                    c11 = c10;
                                    i12 = i11;
                                    i14 = i15;
                                    it3 = it;
                                    t03 = t02;
                                }
                                c11 = c10;
                                i12 = i11;
                                i14 = i15;
                                it3 = it;
                                t03 = t02;
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        } else {
                            G1 g1 = u02.f33868h0;
                            if (c3676c.a() != null) {
                                c3676c.a().f33717i0 = e(g1);
                            }
                            g10.n(zVar, g1, c3686u);
                            h10.f(EnumC3642e1.DEBUG, "Item %d is being captured.", Integer.valueOf(i15));
                            if (!g(c3686u)) {
                                h10.f(EnumC3642e1.WARNING, "Timed out waiting for event id submission: %s", zVar.f33836Y);
                                bufferedReader.close();
                                return;
                            }
                        }
                        th = th9;
                        th3 = th;
                        bufferedReader.close();
                        throw th3;
                    }
                    bufferedReader.close();
                } else {
                    g10.w(new T0(u02.f33866Y, u02.f33867Z, x02), c3686u);
                    EnumC3642e1 enumC3642e13 = EnumC3642e1.DEBUG;
                    EnumC3639d1 enumC3639d1 = y03.f33890h0;
                    h10.f(enumC3642e13, "%s item %d is being captured.", enumC3639d1.getItemType(), Integer.valueOf(i15));
                    if (!g(c3686u)) {
                        h10.f(EnumC3642e1.WARNING, "Timed out waiting for item type submission: %s", enumC3639d1.getItemType());
                        return;
                    }
                }
                v12 = AbstractC3557B.v1(c3686u);
                if (!(v12 instanceof io.sentry.hints.j) && !((io.sentry.hints.j) v12).e()) {
                    h10.f(EnumC3642e1.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i15));
                    return;
                }
                Object v132 = AbstractC3557B.v1(c3686u);
                if (!io.sentry.android.core.G.class.isInstance(AbstractC3557B.v1(c3686u)) && v132 != null) {
                    io.sentry.android.core.G g11 = (io.sentry.android.core.G) v132;
                    i11 = 1;
                    g11.f33974c = new CountDownLatch(1);
                    c10 = 0;
                    g11.f33972a = false;
                    g11.f33973b = false;
                } else {
                    c10 = 0;
                    i11 = 1;
                }
                c11 = c10;
                i12 = i11;
                i14 = i15;
                it3 = it;
                t03 = t02;
            }
            c11 = c10;
            i12 = i11;
            i14 = i15;
            it3 = it;
            t03 = t02;
        }
    }

    public final boolean g(C3686u c3686u) {
        Object v12 = AbstractC3557B.v1(c3686u);
        if (v12 instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) v12).d();
        }
        AbstractC3557B.b2(this.f34834h, io.sentry.hints.f.class, v12);
        return true;
    }
}
