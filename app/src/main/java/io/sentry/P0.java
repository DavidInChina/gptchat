package io.sentry;

import G0.C0588q;
import V1.C1464e;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import i7.C3482a;
import id.AbstractC3557B;
import io.sentry.android.core.C3629u;
import io.sentry.protocol.C3676c;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import l8.AbstractC4344b;
import u5.RunnableC5841a;
import v4.CallableC5972b;

/* loaded from: classes2.dex */
public final class P0 {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f33851a;

    /* renamed from: b  reason: collision with root package name */
    public final io.sentry.transport.h f33852b;

    /* renamed from: c  reason: collision with root package name */
    public final SecureRandom f33853c;

    /* renamed from: d  reason: collision with root package name */
    public final C0588q f33854d = new C0588q();

    /* renamed from: e  reason: collision with root package name */
    public final I f33855e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [io.sentry.V, java.lang.Object] */
    public P0(r1 r1Var) {
        String str;
        I i10;
        SecureRandom secureRandom;
        this.f33851a = r1Var;
        V transportFactory = r1Var.getTransportFactory();
        boolean z10 = transportFactory instanceof C3691w0;
        V v10 = transportFactory;
        if (z10) {
            ?? obj = new Object();
            r1Var.setTransportFactory(obj);
            v10 = obj;
        }
        s3.z zVar = new s3.z(r1Var.getDsn());
        URI uri = (URI) zVar.f45398e;
        String uri2 = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str2 = (String) zVar.f45396c;
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb2.append(r1Var.getSentryClientName());
        sb2.append(",sentry_key=");
        sb2.append((String) zVar.f45397d);
        if (str2 != null && str2.length() > 0) {
            str = ",sentry_secret=".concat(str2);
        } else {
            str = "";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        String sentryClientName = r1Var.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put(SIPHeaderNames.USER_AGENT, sentryClientName);
        hashMap.put("X-Sentry-Auth", sb3);
        this.f33852b = v10.c(r1Var, new U3.c(uri2, hashMap));
        if (r1Var.isEnableMetrics()) {
            i10 = new RunnableC3671o0(r1Var, this);
        } else {
            i10 = io.sentry.metrics.c.f34433Y;
        }
        this.f33855e = i10;
        if (r1Var.getSampleRate() == null) {
            secureRandom = null;
        } else {
            secureRandom = new SecureRandom();
        }
        this.f33853c = secureRandom;
    }

    public static ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3607a) it.next()).getClass();
        }
        return arrayList2;
    }

    public static ArrayList i(C3686u c3686u) {
        ArrayList arrayList = new ArrayList(c3686u.f34765b);
        C3607a c3607a = c3686u.f34766c;
        if (c3607a != null) {
            arrayList.add(c3607a);
        }
        C3607a c3607a2 = c3686u.f34767d;
        if (c3607a2 != null) {
            arrayList.add(c3607a2);
        }
        C3607a c3607a3 = c3686u.f34768e;
        if (c3607a3 != null) {
            arrayList.add(c3607a3);
        }
        return arrayList;
    }

    public final void a(O0 o02, N n10) {
        if (n10 != null) {
            if (o02.f33839i0 == null) {
                o02.f33839i0 = ((D0) n10).f33766e;
            }
            if (o02.f33844n0 == null) {
                o02.f33844n0 = ((D0) n10).f33765d;
            }
            if (o02.f33840j0 == null) {
                o02.f33840j0 = new HashMap(new HashMap(P4.a.p0(((D0) n10).f33769h)));
            } else {
                for (Map.Entry entry : P4.a.p0(((D0) n10).f33769h).entrySet()) {
                    if (!o02.f33840j0.containsKey(entry.getKey())) {
                        o02.f33840j0.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            List list = o02.f33848r0;
            if (list == null) {
                o02.f33848r0 = new ArrayList(new ArrayList(((D0) n10).f33768g));
            } else {
                E1 e12 = ((D0) n10).f33768g;
                if (!e12.isEmpty()) {
                    list.addAll(e12);
                    Collections.sort(list, this.f33854d);
                }
            }
            if (o02.f33850t0 == null) {
                o02.f33850t0 = new HashMap(new HashMap(((D0) n10).f33770i));
            } else {
                for (Map.Entry entry2 : ((D0) n10).f33770i.entrySet()) {
                    if (!o02.f33850t0.containsKey(entry2.getKey())) {
                        o02.f33850t0.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Iterator it = new C3676c(((D0) n10).f33777p).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                Object key = entry3.getKey();
                C3676c c3676c = o02.f33837Z;
                if (!c3676c.containsKey(key)) {
                    c3676c.put((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    public final T0 b(O0 o02, ArrayList arrayList, y1 y1Var, G1 g1, B0 b02) {
        io.sentry.protocol.s sVar;
        ArrayList arrayList2 = new ArrayList();
        r1 r1Var = this.f33851a;
        if (o02 != null) {
            Q serializer = r1Var.getSerializer();
            Charset charset = X0.f33883d;
            Ad.l.Z0("ISerializer is required.", serializer);
            C3636c1 c3636c1 = new C3636c1((Callable) new CallableC5972b(serializer, 4, o02));
            arrayList2.add(new X0(new Y0(EnumC3639d1.resolve(o02), new V0(c3636c1, 8), "application/json", (String) null, (String) null), new V0(c3636c1, 9)));
            sVar = o02.f33836Y;
        } else {
            sVar = null;
        }
        if (y1Var != null) {
            arrayList2.add(X0.b(r1Var.getSerializer(), y1Var));
        }
        if (b02 != null) {
            long maxTraceFileSize = r1Var.getMaxTraceFileSize();
            Q serializer2 = r1Var.getSerializer();
            Charset charset2 = X0.f33883d;
            File file = b02.f33731Y;
            C3636c1 c3636c12 = new C3636c1((Callable) new W0(file, maxTraceFileSize, b02, serializer2));
            arrayList2.add(new X0(new Y0(EnumC3639d1.Profile, new V0(c3636c12, 6), "application-json", file.getName(), (String) null), new V0(c3636c12, 7)));
            if (sVar == null) {
                sVar = new io.sentry.protocol.s(b02.f33725B0);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3607a c3607a = (C3607a) it.next();
                Q serializer3 = r1Var.getSerializer();
                H logger = r1Var.getLogger();
                long maxAttachmentSize = r1Var.getMaxAttachmentSize();
                Charset charset3 = X0.f33883d;
                C3636c1 c3636c13 = new C3636c1((Callable) new W0(maxAttachmentSize, c3607a, logger, serializer3));
                arrayList2.add(new X0(new Y0(EnumC3639d1.Attachment, new V0(c3636c13, 4), c3607a.f33908d, c3607a.f33907c, c3607a.f33909e), new V0(c3636c13, 5)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new T0(new U0(sVar, r1Var.getSdkVersion(), g1), arrayList2);
    }

    public final io.sentry.protocol.s c(T0 t02, C3686u c3686u) {
        if (c3686u == null) {
            c3686u = new C3686u();
        }
        try {
            c3686u.a();
            return l(t02, c3686u);
        } catch (IOException e10) {
            this.f33851a.getLogger().d(EnumC3642e1.ERROR, "Failed to capture envelope.", e10);
            return io.sentry.protocol.s.f34619Z;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:(3:82|1ad|91)(1:94)|(4:99|(1:(2:102|105)(1:103))|104|105)(1:98)|106|(1:113)(1:112)|(3:(4:118|(1:120)|122|(1:124))|117|(10:130|(1:135)(1:134)|178|136|(2:(2:139|140)|153)(2:(3:146|(1:148)(2:149|(1:151)(1:152))|140)|153)|(1:155)(1:156)|157|(1:159)|(2:166|(1:168)(1:169))|170)(2:128|129))|115|(0)|130|(1:132)|135|178|136|(0)(0)|(0)(0)|157|(0)|(4:162|164|166|(0)(0))|170) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0242, code lost:
        if (r1.f34841l0 != r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0253, code lost:
        if (r1.f34837h0.get() <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0291, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0293, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02de, code lost:
        r19.f33851a.getLogger().b(io.sentry.EnumC3642e1.WARNING, r0, "Capturing event %s failed.", r13);
        r13 = io.sentry.protocol.s.f34619Z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
        if (r0.f33904z0 == io.sentry.EnumC3642e1.DEBUG) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c6 A[Catch: b -> 0x0291, IOException -> 0x0293, TryCatch #5 {b -> 0x0291, IOException -> 0x0293, blocks: (B:136:0x0277, B:139:0x0285, B:146:0x0297, B:148:0x029e, B:149:0x02a3, B:151:0x02ba, B:155:0x02c6, B:157:0x02cd, B:159:0x02d9), top: B:178:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d9 A[Catch: b -> 0x0291, IOException -> 0x0293, TRY_LEAVE, TryCatch #5 {b -> 0x0291, IOException -> 0x0293, blocks: (B:136:0x0277, B:139:0x0285, B:146:0x0297, B:148:0x029e, B:149:0x02a3, B:151:0x02ba, B:155:0x02c6, B:157:0x02cd, B:159:0x02d9), top: B:178:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Type inference failed for: r4v11, types: [io.sentry.I1, io.sentry.A1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.protocol.s d(C3686u c3686u, N n10, Z0 z02) {
        Z0 j6;
        y1 y1Var;
        y1 y1Var2;
        Z0 z03;
        boolean z10;
        io.sentry.protocol.s sVar;
        T t10;
        Object v12;
        G1 g1;
        ArrayList arrayList;
        T0 b10;
        G1 g12;
        io.sentry.protocol.s sVar2;
        SecureRandom secureRandom;
        y1 y1Var3;
        U3.n nVar;
        double parseDouble;
        Double valueOf;
        boolean z11;
        z1 l10;
        ArrayList arrayList2;
        String str;
        Z0 z04 = z02;
        if (m(z04, c3686u) && n10 != null) {
            c3686u.f34765b.addAll(new CopyOnWriteArrayList(((D0) n10).f33778q));
        }
        H logger = this.f33851a.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "Capturing event: %s", z04.f33836Y);
        Throwable th2 = z04.f33845o0;
        if (th2 instanceof io.sentry.exception.a) {
            th2 = ((io.sentry.exception.a) th2).f34327Z;
        }
        if (th2 != null && this.f33851a.containsIgnoredExceptionForType(th2)) {
            this.f33851a.getLogger().f(enumC3642e1, "Event was dropped as the exception %s is ignored", th2.getClass());
            this.f33851a.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC3652i.Error);
            return io.sentry.protocol.s.f34619Z;
        }
        if (m(z04, c3686u)) {
            if (n10 != null) {
                a(z04, n10);
                if (z04.f33895A0 == null) {
                    D0 d02 = (D0) n10;
                    T t11 = d02.f33763b;
                    if (t11 != null) {
                        str = t11.getName();
                    } else {
                        str = d02.f33764c;
                    }
                    z04.f33895A0 = str;
                }
                if (z04.f33896B0 == null) {
                    ArrayList arrayList3 = ((D0) n10).f33767f;
                    if (arrayList3 != null) {
                        arrayList2 = new ArrayList(arrayList3);
                    } else {
                        arrayList2 = null;
                    }
                    z04.f33896B0 = arrayList2;
                }
                D0 d03 = (D0) n10;
                EnumC3642e1 enumC3642e12 = d03.f33762a;
                if (enumC3642e12 != null) {
                    z04.f33904z0 = enumC3642e12;
                }
                T t12 = d03.f33763b;
                if (t12 != null && (l10 = t12.l()) != null) {
                    t12 = l10;
                }
                C3676c c3676c = z04.f33837Z;
                if (c3676c.a() == null) {
                    if (t12 == null) {
                        s3.z zVar = d03.f33779r;
                        io.sentry.protocol.B b11 = I1.f33801u0;
                        Boolean bool = (Boolean) zVar.f45397d;
                        if (bool == null) {
                            nVar = null;
                        } else {
                            nVar = new U3.n(bool, (Double) null);
                        }
                        C3634c c3634c = (C3634c) zVar.f45398e;
                        if (c3634c != null) {
                            c3634c.f34281c = false;
                            String b12 = c3634c.b("sentry-sample_rate");
                            if (b12 != null) {
                                try {
                                    parseDouble = Double.parseDouble(b12);
                                } catch (NumberFormatException unused) {
                                }
                                if (AbstractC4344b.B0(Double.valueOf(parseDouble), false)) {
                                    valueOf = Double.valueOf(parseDouble);
                                    if (bool == null) {
                                        z11 = bool.booleanValue();
                                    } else {
                                        z11 = false;
                                    }
                                    Boolean valueOf2 = Boolean.valueOf(z11);
                                    if (valueOf == null) {
                                        nVar = new U3.n(valueOf2, valueOf);
                                    } else {
                                        nVar = new U3.n(valueOf2, (Double) null);
                                    }
                                }
                            }
                            valueOf = null;
                            if (bool == null) {
                            }
                            Boolean valueOf22 = Boolean.valueOf(z11);
                            if (valueOf == null) {
                            }
                        }
                        ?? a12 = new A1((io.sentry.protocol.s) zVar.f45394a, (B1) zVar.f45395b, "default", (B1) zVar.f45396c, null);
                        a12.f33806t0 = W.SENTRY;
                        a12.f33802p0 = "<unlabeled transaction>";
                        a12.f33804r0 = nVar;
                        a12.f33803q0 = I1.f33801u0;
                        a12.f33805s0 = c3634c;
                        c3676c.b(a12);
                    } else {
                        c3676c.b(t12.s());
                    }
                }
                z04 = j(z04, c3686u, d03.f33771j);
            }
            if (z04 == null) {
                this.f33851a.getLogger().f(EnumC3642e1.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.s.f34619Z;
            }
        }
        j6 = j(z04, c3686u, this.f33851a.getEventProcessors());
        if (j6 != null) {
            r1 r1Var = this.f33851a;
            if (r1Var.getBeforeSend() != null) {
                try {
                } catch (Throwable th3) {
                    r1Var.getLogger().d(EnumC3642e1.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th3);
                }
            }
            if (j6 == null) {
                this.f33851a.getLogger().f(EnumC3642e1.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                this.f33851a.getClientReportRecorder().a(io.sentry.clientreport.d.BEFORE_SEND, EnumC3652i.Error);
            }
        }
        if (j6 != null) {
            return io.sentry.protocol.s.f34619Z;
        }
        if (n10 != null) {
            D0 d04 = (D0) n10;
            synchronized (d04.f33774m) {
                try {
                    if (d04.f33773l != null) {
                        y1Var = d04.f33773l.clone();
                    } else {
                        y1Var = null;
                    }
                } finally {
                }
            }
        } else {
            y1Var = null;
        }
        if (y1Var != null && y1Var.f34841l0 != x1.Ok) {
            y1Var2 = null;
        } else {
            if (AbstractC3557B.u2(c3686u)) {
                if (n10 != null) {
                    y1Var3 = ((D0) n10).d(new C3482a(this, j6, c3686u, 6));
                    y1Var2 = y1Var3;
                } else {
                    this.f33851a.getLogger().f(EnumC3642e1.INFO, "Scope is null on client.captureEvent", new Object[0]);
                }
            }
            y1Var3 = null;
            y1Var2 = y1Var3;
        }
        r1 r1Var2 = this.f33851a;
        if (r1Var2.getSampleRate() != null && (secureRandom = this.f33853c) != null && r1Var2.getSampleRate().doubleValue() < secureRandom.nextDouble()) {
            this.f33851a.getLogger().f(EnumC3642e1.DEBUG, "Event %s was dropped due to sampling decision.", j6.f33836Y);
            this.f33851a.getClientReportRecorder().a(io.sentry.clientreport.d.SAMPLE_RATE, EnumC3652i.Error);
            z03 = null;
        } else {
            z03 = j6;
        }
        if (y1Var2 != null) {
            if (y1Var != null) {
                x1 x1Var = y1Var2.f34841l0;
                x1 x1Var2 = x1.Crashed;
                if (x1Var == x1Var2) {
                }
                if (y1Var2.f34837h0.get() > 0) {
                }
            }
            z10 = true;
            if (z03 != null && !z10) {
                this.f33851a.getLogger().f(EnumC3642e1.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
                return io.sentry.protocol.s.f34619Z;
            }
            io.sentry.protocol.s sVar3 = io.sentry.protocol.s.f34619Z;
            if (z03 == null && (sVar2 = z03.f33836Y) != null) {
                sVar = sVar2;
            } else {
                sVar = sVar3;
            }
            if (!io.sentry.hints.b.class.isInstance(AbstractC3557B.v1(c3686u))) {
                if (z03 != null) {
                    g12 = C3634c.a(z03, this.f33851a).f();
                    g1 = g12;
                }
                g1 = null;
            } else {
                if (n10 != null) {
                    T t13 = ((D0) n10).f33763b;
                    if (t13 != null) {
                        g12 = t13.d();
                    } else {
                        Object obj = ((D0) n10).c(new C1464e(this.f33851a, 26, n10)).f45398e;
                        if (((C3634c) obj) != null) {
                            g12 = ((C3634c) obj).f();
                        } else {
                            g12 = null;
                        }
                    }
                    g1 = g12;
                }
                g1 = null;
            }
            if (z03 == null) {
                arrayList = i(c3686u);
            } else {
                arrayList = null;
            }
            b10 = b(z03, arrayList, y1Var2, g1, null);
            c3686u.a();
            if (b10 != null) {
                sVar = l(b10, c3686u);
            }
            if (n10 != null && (t10 = ((D0) n10).f33763b) != null && io.sentry.hints.k.class.isInstance(AbstractC3557B.v1(c3686u))) {
                v12 = AbstractC3557B.v1(c3686u);
                if (!(v12 instanceof io.sentry.hints.c)) {
                    ((io.sentry.hints.c) v12).f(t10.n());
                    t10.g(C1.ABORTED, false, c3686u);
                } else {
                    t10.g(C1.ABORTED, false, null);
                }
            }
            return sVar;
        }
        z10 = false;
        if (z03 != null) {
        }
        io.sentry.protocol.s sVar32 = io.sentry.protocol.s.f34619Z;
        if (z03 == null) {
        }
        sVar = sVar32;
        if (!io.sentry.hints.b.class.isInstance(AbstractC3557B.v1(c3686u))) {
        }
        if (z03 == null) {
        }
        b10 = b(z03, arrayList, y1Var2, g1, null);
        c3686u.a();
        if (b10 != null) {
        }
        if (n10 != null) {
            v12 = AbstractC3557B.v1(c3686u);
            if (!(v12 instanceof io.sentry.hints.c)) {
            }
        }
        return sVar;
        j6 = null;
        if (j6 == null) {
        }
        if (j6 != null) {
        }
    }

    public final void e(y1 y1Var, C3686u c3686u) {
        Ad.l.Z0("Session is required.", y1Var);
        r1 r1Var = this.f33851a;
        String str = y1Var.f34847r0;
        if (str != null && !str.isEmpty()) {
            try {
                Q serializer = r1Var.getSerializer();
                io.sentry.protocol.q sdkVersion = r1Var.getSdkVersion();
                Ad.l.Z0("Serializer is required.", serializer);
                c(new T0(null, sdkVersion, X0.b(serializer, y1Var)), c3686u);
                return;
            } catch (IOException e10) {
                r1Var.getLogger().d(EnumC3642e1.ERROR, "Failed to capture session.", e10);
                return;
            }
        }
        r1Var.getLogger().f(EnumC3642e1.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
    }

    public final io.sentry.protocol.s f(io.sentry.protocol.z zVar, G1 g1, N n10, C3686u c3686u, B0 b02) {
        C3686u c3686u2;
        io.sentry.protocol.s sVar;
        io.sentry.protocol.z zVar2 = zVar;
        if (c3686u == null) {
            c3686u2 = new C3686u();
        } else {
            c3686u2 = c3686u;
        }
        if (m(zVar, c3686u2) && n10 != null) {
            c3686u2.f34765b.addAll(new CopyOnWriteArrayList(((D0) n10).f33778q));
        }
        r1 r1Var = this.f33851a;
        H logger = r1Var.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "Capturing transaction: %s", zVar2.f33836Y);
        io.sentry.protocol.s sVar2 = io.sentry.protocol.s.f34619Z;
        io.sentry.protocol.s sVar3 = zVar2.f33836Y;
        if (sVar3 != null) {
            sVar = sVar3;
        } else {
            sVar = sVar2;
        }
        if (m(zVar, c3686u2)) {
            a(zVar, n10);
            if (n10 != null) {
                zVar2 = k(zVar, c3686u2, ((D0) n10).f33771j);
            }
            if (zVar2 == null) {
                r1Var.getLogger().f(enumC3642e1, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (zVar2 != null) {
            zVar2 = k(zVar2, c3686u2, r1Var.getEventProcessors());
        }
        if (zVar2 == null) {
            r1Var.getLogger().f(enumC3642e1, "Transaction was dropped by Event processors.", new Object[0]);
            return sVar2;
        }
        r1Var.getBeforeSendTransaction();
        try {
            T0 b10 = b(zVar2, h(i(c3686u2)), null, g1, b02);
            c3686u2.a();
            if (b10 != null) {
                return l(b10, c3686u2);
            }
            return sVar;
        } catch (io.sentry.exception.b | IOException e10) {
            r1Var.getLogger().b(EnumC3642e1.WARNING, e10, "Capturing transaction %s failed.", sVar);
            return io.sentry.protocol.s.f34619Z;
        }
    }

    public final void g(boolean z10) {
        long shutdownTimeoutMillis;
        io.sentry.transport.h hVar = this.f33852b;
        r1 r1Var = this.f33851a;
        r1Var.getLogger().f(EnumC3642e1.INFO, "Closing SentryClient.", new Object[0]);
        try {
            this.f33855e.close();
        } catch (IOException e10) {
            r1Var.getLogger().d(EnumC3642e1.WARNING, "Failed to close the metrics aggregator.", e10);
        }
        if (z10) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = r1Var.getShutdownTimeoutMillis();
            } catch (IOException e11) {
                r1Var.getLogger().d(EnumC3642e1.WARNING, "Failed to close the connection to the Sentry Server.", e11);
            }
        }
        hVar.l(shutdownTimeoutMillis);
        hVar.c(z10);
        for (r rVar : r1Var.getEventProcessors()) {
            if (rVar instanceof Closeable) {
                try {
                    ((Closeable) rVar).close();
                } catch (IOException e12) {
                    r1Var.getLogger().f(EnumC3642e1.WARNING, "Failed to close the event processor {}.", rVar, e12);
                }
            }
        }
    }

    public final Z0 j(Z0 z02, C3686u c3686u, List list) {
        r1 r1Var = this.f33851a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r rVar = (r) it.next();
            try {
                boolean z10 = rVar instanceof C3629u;
                boolean isInstance = io.sentry.hints.b.class.isInstance(AbstractC3557B.v1(c3686u));
                if (isInstance && z10) {
                    z02 = rVar.a(z02, c3686u);
                    continue;
                } else if (!isInstance && !z10) {
                    z02 = rVar.a(z02, c3686u);
                    continue;
                }
            } catch (Throwable th2) {
                r1Var.getLogger().b(EnumC3642e1.ERROR, th2, "An exception occurred while processing event by processor: %s", rVar.getClass().getName());
                continue;
            }
            if (z02 == null) {
                r1Var.getLogger().f(EnumC3642e1.DEBUG, "Event was dropped by a processor: %s", rVar.getClass().getName());
                r1Var.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC3652i.Error);
                break;
            }
        }
        return z02;
    }

    public final io.sentry.protocol.z k(io.sentry.protocol.z zVar, C3686u c3686u, List list) {
        r1 r1Var = this.f33851a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r rVar = (r) it.next();
            try {
                zVar = rVar.h(zVar, c3686u);
                continue;
            } catch (Throwable th2) {
                r1Var.getLogger().b(EnumC3642e1.ERROR, th2, "An exception occurred while processing transaction by processor: %s", rVar.getClass().getName());
                continue;
            }
            if (zVar == null) {
                r1Var.getLogger().f(EnumC3642e1.DEBUG, "Transaction was dropped by a processor: %s", rVar.getClass().getName());
                r1Var.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC3652i.Transaction);
                break;
            }
        }
        return zVar;
    }

    public final io.sentry.protocol.s l(T0 t02, C3686u c3686u) {
        r1 r1Var = this.f33851a;
        AbstractC3657j1 beforeEnvelopeCallback = r1Var.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.f33863h0.submit(new RunnableC5841a(spotlightIntegration, 15, t02));
                } catch (RejectedExecutionException e10) {
                    spotlightIntegration.f33862Z.d(EnumC3642e1.WARNING, "Spotlight envelope submission rejected.", e10);
                }
            } catch (Throwable th2) {
                r1Var.getLogger().d(EnumC3642e1.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        this.f33852b.L(t02, c3686u);
        io.sentry.protocol.s sVar = t02.f33864a.f33866Y;
        if (sVar == null) {
            return io.sentry.protocol.s.f34619Z;
        }
        return sVar;
    }

    public final boolean m(O0 o02, C3686u c3686u) {
        if (AbstractC3557B.u2(c3686u)) {
            return true;
        }
        this.f33851a.getLogger().f(EnumC3642e1.DEBUG, "Event was cached so not applying scope: %s", o02.f33836Y);
        return false;
    }
}
