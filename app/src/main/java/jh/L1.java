package jh;

import Wh.C1658c;
import Wh.C1663h;
import Wh.C1666k;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.util.Log;
import com.google.protobuf.AbstractC2515j0;
import com.google.protobuf.AbstractC2518k0;
import com.google.protobuf.AbstractC2527n0;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import l2.C4333d;
import mh.C4672b;
import n2.C4712c;
import s3.C5569t;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class L1 implements AbstractC2518k0, AbstractC2527n0, Td.b, androidx.lifecycle.b0 {

    /* renamed from: Y  reason: collision with root package name */
    public final int f36264Y;

    public /* synthetic */ L1(int i10) {
        this.f36264Y = i10;
    }

    public static final C1663h c(L1 l12, String str) {
        C1663h c1663h = new C1663h(str);
        C1663h.f21190d.put(str, c1663h);
        return c1663h;
    }

    public static final Wh.D e(Wh.D d10) {
        Wh.F f6;
        int i10 = Yh.a.f22426a;
        if (d10 != null) {
            f6 = d10.f21136l0;
        } else {
            f6 = null;
        }
        if (f6 != null) {
            Wh.C i11 = d10.i();
            i11.f21123g = null;
            return i11.a();
        }
        return d10;
    }

    public static int g(int i10, int i11, String str, boolean z10) {
        boolean z11;
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if ((charAt >= ' ' || charAt == '\t') && charAt < '\u007f' && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Wh.o i(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = kf.v.f37483Y;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!AbstractC3557B.K(cipherSuite, "TLS_NULL_WITH_NULL_NULL") && !AbstractC3557B.K(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                C1663h h10 = C1663h.f21188b.h(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!AbstractC3557B.K("NONE", protocol)) {
                        Wh.H m10 = H1.m(protocol);
                        try {
                            peerCertificates = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                        }
                        if (peerCertificates != null) {
                            list = Xh.b.l(Arrays.copyOf(peerCertificates, peerCertificates.length));
                            localCertificates = sSLSession.getLocalCertificates();
                            if (localCertificates != null) {
                                list2 = Xh.b.l(Arrays.copyOf(localCertificates, localCertificates.length));
                            }
                            return new Wh.o(m10, h10, list2, new H.H(9, list));
                        }
                        list = list2;
                        localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                        }
                        return new Wh.o(m10, h10, list2, new H.H(9, list));
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        throw new IllegalStateException("cipherSuite == null".toString());
    }

    public static Wh.u j(String str) {
        AbstractC3557B.c0("<this>", str);
        Matcher matcher = Wh.u.f21259c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            AbstractC3557B.b0("typeSubtype.group(1)", group);
            Locale locale = Locale.US;
            AbstractC3557B.b0("US", locale);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", group.toLowerCase(locale));
            String group2 = matcher.group(2);
            AbstractC3557B.b0("typeSubtype.group(2)", group2);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", group2.toLowerCase(locale));
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = Wh.u.f21260d.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (Lg.n.I2(group4, Separators.QUOTE, false) && Lg.n.c2(group4, Separators.QUOTE, false) && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", group4);
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(android.gov.nist.core.a.n(sb2, str, '\"').toString());
                }
            }
            return new Wh.u(str, (String[]) arrayList.toArray(new String[0]));
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.h("No subtype found for: \"", str, '\"').toString());
    }

    public static Wh.x k(String str) {
        Wh.x xVar = Wh.x.HTTP_1_0;
        if (!AbstractC3557B.K(str, "http/1.0")) {
            xVar = Wh.x.HTTP_1_1;
            if (!AbstractC3557B.K(str, "http/1.1")) {
                xVar = Wh.x.H2_PRIOR_KNOWLEDGE;
                if (!AbstractC3557B.K(str, "h2_prior_knowledge")) {
                    xVar = Wh.x.HTTP_2;
                    if (!AbstractC3557B.K(str, "h2")) {
                        xVar = Wh.x.SPDY_3;
                        if (!AbstractC3557B.K(str, "spdy/3.1")) {
                            xVar = Wh.x.QUIC;
                            if (!AbstractC3557B.K(str, "quic")) {
                                throw new IOException("Unexpected protocol: ".concat(str));
                            }
                        }
                    }
                }
            }
        }
        return xVar;
    }

    public static boolean l(String str) {
        if (!Lg.n.f2("Connection", str) && !Lg.n.f2("Keep-Alive", str) && !Lg.n.f2(SIPHeaderNames.PROXY_AUTHENTICATE, str) && !Lg.n.f2(SIPHeaderNames.PROXY_AUTHORIZATION, str) && !Lg.n.f2("TE", str) && !Lg.n.f2("Trailers", str) && !Lg.n.f2("Transfer-Encoding", str) && !Lg.n.f2("Upgrade", str)) {
            return true;
        }
        return false;
    }

    public static C4672b m(long j6, mh.r rVar) {
        AbstractC3557B.c0("range", rVar);
        return new C4672b(j6, Math.max(rVar.f39502b, Math.max(E0.j0.a(j6), E0.j0.b(j6)) * rVar.f39501a) / Math.max(E0.j0.a(j6), E0.j0.b(j6)));
    }

    public static C4672b n(long j6, mh.r rVar) {
        AbstractC3557B.c0("range", rVar);
        return new C4672b(j6, (Math.max(E0.j0.a(j6), E0.j0.b(j6)) * rVar.f39501a) / Math.max(E0.j0.a(j6), E0.j0.b(j6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1658c o(Wh.q qVar) {
        String str;
        int i10;
        int i11;
        int i12;
        String str2;
        String str3;
        Wh.q qVar2 = qVar;
        AbstractC3557B.c0("headers", qVar2);
        int size = qVar.size();
        int i13 = 0;
        boolean z10 = true;
        String str4 = null;
        boolean z11 = false;
        boolean z12 = false;
        int i14 = -1;
        int i15 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i16 = -1;
        int i17 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (i13 < size) {
            String y10 = qVar2.y(i13);
            String T = qVar2.T(i13);
            if (Lg.n.f2(y10, "Cache-Control")) {
                if (str4 == null) {
                    str4 = T;
                    i11 = 0;
                    while (i11 < T.length()) {
                        int length = T.length();
                        int i18 = i11;
                        while (true) {
                            if (i18 < length) {
                                i12 = size;
                                if (Lg.n.a2("=,;", T.charAt(i18))) {
                                    break;
                                }
                                i18++;
                                size = i12;
                            } else {
                                i12 = size;
                                i18 = T.length();
                                break;
                            }
                        }
                        String substring = T.substring(i11, i18);
                        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                        String obj = Lg.n.U2(substring).toString();
                        if (i18 == T.length() || T.charAt(i18) == ',' || T.charAt(i18) == ';') {
                            str2 = str4;
                            i11 = i18 + 1;
                            str3 = null;
                        } else {
                            int i19 = i18 + 1;
                            byte[] bArr = Xh.b.f21996a;
                            int length2 = T.length();
                            while (true) {
                                if (i19 < length2) {
                                    char charAt = T.charAt(i19);
                                    int i20 = length2;
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i19++;
                                    length2 = i20;
                                } else {
                                    i19 = T.length();
                                    break;
                                }
                            }
                            if (i19 < T.length() && T.charAt(i19) == '\"') {
                                int i21 = i19 + 1;
                                str2 = str4;
                                int k22 = Lg.n.k2(T, '\"', i21, false, 4);
                                str3 = T.substring(i21, k22);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str3);
                                i11 = k22 + 1;
                            } else {
                                str2 = str4;
                                int length3 = T.length();
                                int i22 = i19;
                                while (true) {
                                    if (i22 < length3) {
                                        int i23 = length3;
                                        if (Lg.n.a2(",;", T.charAt(i22))) {
                                            break;
                                        }
                                        i22++;
                                        length3 = i23;
                                    } else {
                                        i22 = T.length();
                                        break;
                                    }
                                }
                                String substring2 = T.substring(i19, i22);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring2);
                                str3 = Lg.n.U2(substring2).toString();
                                i11 = i22;
                            }
                        }
                        if (Lg.n.f2("no-cache", obj)) {
                            size = i12;
                            str4 = str2;
                            z11 = true;
                        } else if (Lg.n.f2("no-store", obj)) {
                            size = i12;
                            str4 = str2;
                            z12 = true;
                        } else {
                            if (Lg.n.f2("max-age", obj)) {
                                i14 = Xh.b.y(-1, str3);
                            } else if (Lg.n.f2("s-maxage", obj)) {
                                i15 = Xh.b.y(-1, str3);
                            } else if (Lg.n.f2("private", obj)) {
                                size = i12;
                                str4 = str2;
                                z13 = true;
                            } else if (Lg.n.f2("public", obj)) {
                                size = i12;
                                str4 = str2;
                                z14 = true;
                            } else if (Lg.n.f2("must-revalidate", obj)) {
                                size = i12;
                                str4 = str2;
                                z15 = true;
                            } else if (Lg.n.f2("max-stale", obj)) {
                                i16 = Xh.b.y(Integer.MAX_VALUE, str3);
                            } else if (Lg.n.f2("min-fresh", obj)) {
                                i17 = Xh.b.y(-1, str3);
                            } else if (Lg.n.f2("only-if-cached", obj)) {
                                size = i12;
                                str4 = str2;
                                z16 = true;
                            } else if (Lg.n.f2("no-transform", obj)) {
                                size = i12;
                                str4 = str2;
                                z17 = true;
                            } else if (Lg.n.f2("immutable", obj)) {
                                size = i12;
                                str4 = str2;
                                z18 = true;
                            }
                            size = i12;
                            str4 = str2;
                        }
                    }
                    i10 = size;
                    i13++;
                    qVar2 = qVar;
                    size = i10;
                }
            } else if (!Lg.n.f2(y10, "Pragma")) {
                i10 = size;
                i13++;
                qVar2 = qVar;
                size = i10;
            }
            z10 = false;
            i11 = 0;
            while (i11 < T.length()) {
            }
            i10 = size;
            i13++;
            qVar2 = qVar;
            size = i10;
        }
        String str5 = str4;
        if (!z10) {
            str = null;
        } else {
            str = str5;
        }
        return new C1658c(z11, z12, i14, i15, z13, z14, z15, i16, i17, z16, z17, z18, str);
    }

    public static Wh.u p(String str) {
        AbstractC3557B.c0("<this>", str);
        try {
            return j(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static long q(int i10, String str) {
        int g10 = g(0, i10, str, false);
        Matcher matcher = C1666k.f21222m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (g10 < i10) {
            int g11 = g(g10 + 1, i10, str, true);
            matcher.region(g10, g11);
            if (i12 == -1 && matcher.usePattern(C1666k.f21222m).matches()) {
                String group = matcher.group(1);
                AbstractC3557B.b0("matcher.group(1)", group);
                i12 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                AbstractC3557B.b0("matcher.group(2)", group2);
                i15 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                AbstractC3557B.b0("matcher.group(3)", group3);
                i16 = Integer.parseInt(group3);
            } else if (i13 == -1 && matcher.usePattern(C1666k.f21221l).matches()) {
                String group4 = matcher.group(1);
                AbstractC3557B.b0("matcher.group(1)", group4);
                i13 = Integer.parseInt(group4);
            } else {
                if (i14 == -1) {
                    Pattern pattern = C1666k.f21220k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        AbstractC3557B.b0("matcher.group(1)", group5);
                        Locale locale = Locale.US;
                        String j6 = AbstractC6463a.j("US", locale, group5, locale, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        AbstractC3557B.b0("MONTH_PATTERN.pattern()", pattern2);
                        i14 = Lg.n.l2(pattern2, j6, 0, false, 6) / 4;
                    }
                }
                if (i11 == -1 && matcher.usePattern(C1666k.f21219j).matches()) {
                    String group6 = matcher.group(1);
                    AbstractC3557B.b0("matcher.group(1)", group6);
                    i11 = Integer.parseInt(group6);
                }
            }
            g10 = g(g11 + 1, i10, str, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += 2000;
        }
        if (i11 >= 1601) {
            if (i14 != -1) {
                if (1 <= i13 && i13 < 32) {
                    if (i12 >= 0 && i12 < 24) {
                        if (i15 >= 0 && i15 < 60) {
                            if (i16 >= 0 && i16 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(Xh.b.f22000e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i11);
                                gregorianCalendar.set(2, i14 - 1);
                                gregorianCalendar.set(5, i13);
                                gregorianCalendar.set(11, i12);
                                gregorianCalendar.set(12, i15);
                                gregorianCalendar.set(13, i16);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.google.protobuf.AbstractC2518k0
    public AbstractC2515j0 a(int i10) {
        switch (this.f36264Y) {
            case 0:
                switch (i10) {
                    case 0:
                        return M1.UNKNOWN_REASON;
                    case 1:
                        return M1.CLIENT_INITIATED;
                    case 2:
                        return M1.DUPLICATE_IDENTITY;
                    case 3:
                        return M1.SERVER_SHUTDOWN;
                    case 4:
                        return M1.PARTICIPANT_REMOVED;
                    case 5:
                        return M1.ROOM_DELETED;
                    case 6:
                        return M1.STATE_MISMATCH;
                    case 7:
                        return M1.JOIN_FAILURE;
                    default:
                        return null;
                }
            case 1:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return P1.IC_JPEG;
                }
                return P1.IC_DEFAULT;
            case 2:
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return EnumC4076s3.PAUSED;
                }
                return EnumC4076s3.ACTIVE;
            case 3:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return EnumC4006e2.Cloud;
                }
                return EnumC4006e2.Standard;
            case 4:
                return EnumC4051n2.b(i10);
            case 5:
                return EnumC4066q2.b(i10);
            case 6:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return O2.TLS;
                    }
                    return O2.TCP;
                }
                return O2.UDP;
        }
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.Y b(Class cls) {
        switch (this.f36264Y) {
            case 0:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 1:
                return new C4712c();
            default:
                return new C5569t();
        }
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.Y d(Class cls, C4333d c4333d) {
        switch (this.f36264Y) {
            case 0:
                return new androidx.lifecycle.U();
            case 1:
                return b(cls);
            default:
                return b(cls);
        }
    }

    public ei.m f() {
        boolean z10;
        int i10 = this.f36264Y;
        switch (i10) {
            case 27:
                switch (i10) {
                    case 27:
                        z10 = ei.c.f29488f;
                        break;
                    default:
                        z10 = ei.k.f29508e;
                        break;
                }
                if (!z10) {
                    return null;
                }
                return new ei.c();
            default:
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    AbstractC3557B.b0("jvmVersion", property);
                    if (Integer.parseInt(property) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    AbstractC3557B.b0("putMethod", method);
                    AbstractC3557B.b0("getMethod", method2);
                    AbstractC3557B.b0("removeMethod", method3);
                    AbstractC3557B.b0("clientProviderClass", cls3);
                    AbstractC3557B.b0("serverProviderClass", cls4);
                    return new ei.i(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    public synchronized C1663h h(String str) {
        C1663h c1663h;
        String str2;
        try {
            AbstractC3557B.c0("javaName", str);
            LinkedHashMap linkedHashMap = C1663h.f21190d;
            c1663h = (C1663h) linkedHashMap.get(str);
            if (c1663h == null) {
                if (Lg.n.I2(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                    str2 = "SSL_".concat(substring);
                } else if (Lg.n.I2(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                c1663h = (C1663h) linkedHashMap.get(str2);
                if (c1663h == null) {
                    c1663h = new C1663h(str);
                }
                linkedHashMap.put(str, c1663h);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c1663h;
    }

    public void r(Td.a aVar) {
        int i10 = this.f36264Y;
        String str = aVar.f17178b;
        int i11 = aVar.f17177a;
        switch (i10) {
            case 0:
                int f6 = AbstractC6708l.f(i11);
                if (f6 != 0) {
                    if (f6 != 1) {
                        if (f6 == 2) {
                            Log.d("AndroidLog", "message=" + str);
                            return;
                        }
                        return;
                    }
                    AbstractC3612c.r("AndroidLog", "message=" + str);
                    return;
                }
                AbstractC3612c.c("AndroidLog", "message=" + str);
                return;
            default:
                System.out.println((Object) ("[Segment " + R.a.D(i11) + ' ' + str));
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L1(int i10, int i11) {
        this(8);
        this.f36264Y = i10;
        switch (i10) {
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }
}
