package io.sentry;

import android.gov.nist.core.Separators;
import io.sentry.protocol.C3674a;
import io.sentry.protocol.C3675b;
import io.sentry.protocol.C3676c;
import io.sentry.protocol.C3677d;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC3678e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3659k0 implements Q {

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f34406c = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final r1 f34407a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f34408b;

    public C3659k0(r1 r1Var) {
        this.f34407a = r1Var;
        HashMap hashMap = new HashMap();
        this.f34408b = hashMap;
        hashMap.put(C3674a.class, new C3637d(21));
        hashMap.put(C3640e.class, new C3637d(0));
        hashMap.put(C3675b.class, new C3637d(22));
        hashMap.put(C3676c.class, new C3637d(23));
        hashMap.put(DebugImage.class, new C3637d(24));
        hashMap.put(C3677d.class, new C3637d(25));
        hashMap.put(io.sentry.protocol.f.class, new C3637d(26));
        hashMap.put(EnumC3678e.class, new C3637d(27));
        hashMap.put(io.sentry.protocol.h.class, new C3637d(29));
        hashMap.put(io.sentry.protocol.j.class, new io.sentry.protocol.i(0));
        hashMap.put(io.sentry.protocol.k.class, new io.sentry.protocol.i(1));
        hashMap.put(io.sentry.protocol.l.class, new io.sentry.protocol.i(2));
        hashMap.put(io.sentry.protocol.m.class, new io.sentry.protocol.i(3));
        hashMap.put(B0.class, new C3637d(1));
        hashMap.put(C0.class, new C3637d(2));
        hashMap.put(io.sentry.profilemeasurements.a.class, new C3637d(19));
        hashMap.put(io.sentry.profilemeasurements.b.class, new C3637d(20));
        hashMap.put(io.sentry.protocol.n.class, new io.sentry.protocol.i(4));
        hashMap.put(io.sentry.protocol.p.class, new io.sentry.protocol.i(6));
        hashMap.put(io.sentry.protocol.q.class, new io.sentry.protocol.i(7));
        hashMap.put(U0.class, new C3637d(4));
        hashMap.put(Y0.class, new C3637d(5));
        hashMap.put(Z0.class, new C3637d(6));
        hashMap.put(io.sentry.protocol.r.class, new io.sentry.protocol.i(8));
        hashMap.put(EnumC3639d1.class, new C3637d(7));
        hashMap.put(EnumC3642e1.class, new C3637d(8));
        hashMap.put(C3645f1.class, new C3637d(9));
        hashMap.put(io.sentry.protocol.t.class, new io.sentry.protocol.i(10));
        hashMap.put(io.sentry.protocol.u.class, new io.sentry.protocol.i(11));
        hashMap.put(io.sentry.protocol.v.class, new io.sentry.protocol.i(12));
        hashMap.put(io.sentry.protocol.w.class, new io.sentry.protocol.i(13));
        hashMap.put(io.sentry.protocol.x.class, new io.sentry.protocol.i(14));
        hashMap.put(M0.class, new C3637d(3));
        hashMap.put(io.sentry.protocol.y.class, new io.sentry.protocol.i(15));
        hashMap.put(io.sentry.protocol.z.class, new io.sentry.protocol.i(16));
        hashMap.put(y1.class, new C3637d(10));
        hashMap.put(A1.class, new C3637d(11));
        hashMap.put(B1.class, new C3637d(12));
        hashMap.put(C1.class, new C3637d(13));
        hashMap.put(io.sentry.protocol.C.class, new io.sentry.protocol.i(18));
        hashMap.put(io.sentry.protocol.g.class, new C3637d(28));
        hashMap.put(N1.class, new C3637d(16));
        hashMap.put(io.sentry.clientreport.a.class, new C3637d(17));
        hashMap.put(io.sentry.protocol.E.class, new io.sentry.protocol.i(20));
        hashMap.put(io.sentry.protocol.D.class, new io.sentry.protocol.i(19));
    }

    public final String a(Object obj, boolean z10) {
        StringWriter stringWriter = new StringWriter();
        r1 r1Var = this.f34407a;
        C3636c1 c3636c1 = new C3636c1(stringWriter, r1Var.getMaxDepth());
        if (z10) {
            io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) c3636c1.f34285Z;
            bVar.getClass();
            bVar.f34795i0 = Separators.HT;
            bVar.f34796j0 = ": ";
        }
        c3636c1.v(r1Var.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.Q
    public final void b(T0 t02, OutputStream outputStream) {
        r1 r1Var = this.f34407a;
        Ad.l.Z0("The SentryEnvelope object is required.", t02);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f34406c));
        try {
            t02.f33864a.serialize(new C3636c1(bufferedWriter, r1Var.getMaxDepth()), r1Var.getLogger());
            bufferedWriter.write(Separators.RETURN);
            for (X0 x02 : t02.f33865b) {
                try {
                    byte[] d10 = x02.d();
                    x02.f33884a.serialize(new C3636c1(bufferedWriter, r1Var.getMaxDepth()), r1Var.getLogger());
                    bufferedWriter.write(Separators.RETURN);
                    bufferedWriter.flush();
                    outputStream.write(d10);
                    bufferedWriter.write(Separators.RETURN);
                } catch (Exception e10) {
                    r1Var.getLogger().d(EnumC3642e1.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.Q
    public final Object e(Reader reader, Class cls) {
        r1 r1Var = this.f34407a;
        try {
            C3653i0 c3653i0 = new C3653i0(reader);
            Z z10 = (Z) this.f34408b.get(cls);
            if (z10 != null) {
                Object cast = cls.cast(z10.a(c3653i0, r1Var.getLogger()));
                c3653i0.close();
                return cast;
            } else if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                c3653i0.close();
                return null;
            } else {
                Object T02 = c3653i0.T0();
                c3653i0.close();
                return T02;
            }
        } catch (Exception e10) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.Q
    public final T0 h(BufferedInputStream bufferedInputStream) {
        r1 r1Var = this.f34407a;
        try {
            return r1Var.getEnvelopeReader().m(bufferedInputStream);
        } catch (IOException e10) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.Q
    public final String j(Map map) {
        return a(map, false);
    }

    @Override // io.sentry.Q
    public final Object k(BufferedReader bufferedReader, Class cls, C3637d c3637d) {
        r1 r1Var = this.f34407a;
        try {
            C3653i0 c3653i0 = new C3653i0(bufferedReader);
            if (Collection.class.isAssignableFrom(cls)) {
                if (c3637d == null) {
                    Object T02 = c3653i0.T0();
                    c3653i0.close();
                    return T02;
                }
                ArrayList w02 = c3653i0.w0(r1Var.getLogger(), c3637d);
                c3653i0.close();
                return w02;
            }
            Object T03 = c3653i0.T0();
            c3653i0.close();
            return T03;
        } catch (Throwable th2) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Error when deserializing", th2);
            return null;
        }
    }

    @Override // io.sentry.Q
    public final void n(Object obj, BufferedWriter bufferedWriter) {
        Ad.l.Z0("The entity is required.", obj);
        r1 r1Var = this.f34407a;
        H logger = r1Var.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        if (logger.g(enumC3642e1)) {
            r1Var.getLogger().f(enumC3642e1, "Serializing object: %s", a(obj, r1Var.isEnablePrettySerializationOutput()));
        }
        new C3636c1(bufferedWriter, r1Var.getMaxDepth()).v(r1Var.getLogger(), obj);
        bufferedWriter.flush();
    }
}
