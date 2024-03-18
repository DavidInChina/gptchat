package Xh;

import Lg.i;
import Lg.n;
import Wh.B;
import Wh.D;
import Wh.E;
import Wh.q;
import Wh.s;
import Wh.u;
import Wh.w;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import di.C2729c;
import ei.l;
import id.AbstractC3557B;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jh.H1;
import ji.AbstractC4122K;
import ji.AbstractC4137l;
import ji.C4112A;
import ji.C4135j;
import ji.C4138m;
import kf.t;
import l8.AbstractC4344b;
import w.C6053E;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f21996a;

    /* renamed from: c  reason: collision with root package name */
    public static final E f21998c;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f22000e;

    /* renamed from: b  reason: collision with root package name */
    public static final q f21997b = H1.r(new String[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final C4112A f21999d = l.j(l.f("efbbbf"), l.f("feff"), l.f("fffe"), l.f("0000ffff"), l.f("ffff0000"));

    /* renamed from: f  reason: collision with root package name */
    public static final i f22001f = new i("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final String f22002g = n.w2("Client", n.v2("okhttp3.", w.class.getName()));

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ji.j] */
    static {
        byte[] bArr = new byte[0];
        f21996a = bArr;
        ?? obj = new Object();
        obj.m0(bArr);
        f21998c = new E(0, (u) null, (C4135j) obj);
        int i10 = B.f21116a;
        H1.k(0, 0, null, bArr);
        C4138m c4138m = C4138m.f36722i0;
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        AbstractC3557B.Z(timeZone);
        f22000e = timeZone;
    }

    public static final boolean a(s sVar, s sVar2) {
        AbstractC3557B.c0("<this>", sVar);
        AbstractC3557B.c0("other", sVar2);
        if (AbstractC3557B.K(sVar.f21253d, sVar2.f21253d) && sVar.f21254e == sVar2.f21254e && AbstractC3557B.K(sVar.f21250a, sVar2.f21250a)) {
            return true;
        }
        return false;
    }

    public static final int b(String str, long j6, TimeUnit timeUnit) {
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j6);
                if (millis <= 2147483647L) {
                    if (millis == 0 && i10 > 0) {
                        throw new IllegalArgumentException(str.concat(" too small.").toString());
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException(str.concat(" too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(str.concat(" < 0").toString());
    }

    public static final void c(Closeable closeable) {
        AbstractC3557B.c0("<this>", closeable);
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (AbstractC3557B.K(e11.getMessage(), "bio == null")) {
                return;
            }
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final int e(char c10, int i10, int i11, String str) {
        AbstractC3557B.c0("<this>", str);
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int f(String str, int i10, int i11, String str2) {
        AbstractC3557B.c0("<this>", str);
        while (i10 < i11) {
            if (n.a2(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int g(String str, char c10, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return e(c10, i10, i11, str);
    }

    public static final boolean h(AbstractC4122K abstractC4122K, TimeUnit timeUnit) {
        AbstractC3557B.c0("<this>", abstractC4122K);
        AbstractC3557B.c0("timeUnit", timeUnit);
        try {
            return u(abstractC4122K, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        AbstractC3557B.c0("format", str);
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC3557B.c0("<this>", strArr);
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C6053E f02 = N.f0(strArr2);
                while (f02.hasNext()) {
                    if (comparator.compare(str, (String) f02.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(D d10) {
        String r10 = d10.f21135k0.r(SIPHeaderNames.CONTENT_LENGTH);
        if (r10 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(r10);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        AbstractC3557B.c0("elements", objArr);
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(AbstractC4344b.G0(Arrays.copyOf(objArr2, objArr2.length)));
        AbstractC3557B.b0("unmodifiableList(listOf(*elements.clone()))", unmodifiableList);
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (AbstractC3557B.e0(charAt, 31) <= 0 || AbstractC3557B.e0(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int n(int i10, int i11, String str) {
        AbstractC3557B.c0("<this>", str);
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i10++;
            } else {
                return i10;
            }
        }
        return i11;
    }

    public static final int o(int i10, int i11, String str) {
        AbstractC3557B.c0("<this>", str);
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i12 == i10) {
                        break;
                    }
                    i12--;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC3557B.c0("other", strArr2);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String str) {
        AbstractC3557B.c0("name", str);
        if (!n.f2(str, SIPHeaderNames.AUTHORIZATION) && !n.f2(str, "Cookie") && !n.f2(str, SIPHeaderNames.PROXY_AUTHORIZATION) && !n.f2(str, "Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int r(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        return -1;
    }

    public static final Charset s(AbstractC4137l abstractC4137l, Charset charset) {
        Charset charset2;
        AbstractC3557B.c0("<this>", abstractC4137l);
        AbstractC3557B.c0("default", charset);
        int p02 = abstractC4137l.p0(f21999d);
        if (p02 != -1) {
            if (p02 != 0) {
                if (p02 != 1) {
                    if (p02 != 2) {
                        if (p02 != 3) {
                            if (p02 == 4) {
                                Charset charset3 = Lg.a.f11131a;
                                charset2 = Lg.a.f11133c;
                                if (charset2 == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    AbstractC3557B.b0("forName(...)", charset2);
                                    Lg.a.f11133c = charset2;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            Charset charset4 = Lg.a.f11131a;
                            charset2 = Lg.a.f11134d;
                            if (charset2 == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                AbstractC3557B.b0("forName(...)", charset2);
                                Lg.a.f11134d = charset2;
                            }
                        }
                        return charset2;
                    }
                    Charset charset5 = StandardCharsets.UTF_16LE;
                    AbstractC3557B.b0("UTF_16LE", charset5);
                    return charset5;
                }
                Charset charset6 = StandardCharsets.UTF_16BE;
                AbstractC3557B.b0("UTF_16BE", charset6);
                return charset6;
            }
            Charset charset7 = StandardCharsets.UTF_8;
            AbstractC3557B.b0("UTF_8", charset7);
            return charset7;
        }
        return charset;
    }

    public static final int t(AbstractC4137l abstractC4137l) {
        AbstractC3557B.c0("<this>", abstractC4137l);
        return (abstractC4137l.readByte() & 255) | ((abstractC4137l.readByte() & 255) << 16) | ((abstractC4137l.readByte() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, ji.j] */
    public static final boolean u(AbstractC4122K abstractC4122K, int i10, TimeUnit timeUnit) {
        long j6;
        AbstractC3557B.c0("<this>", abstractC4122K);
        AbstractC3557B.c0("timeUnit", timeUnit);
        long nanoTime = System.nanoTime();
        if (abstractC4122K.f().e()) {
            j6 = abstractC4122K.f().c() - nanoTime;
        } else {
            j6 = Long.MAX_VALUE;
        }
        abstractC4122K.f().d(Math.min(j6, timeUnit.toNanos(i10)) + nanoTime);
        try {
            ?? obj = new Object();
            while (abstractC4122K.g0(obj, 8192L) != -1) {
                obj.a();
            }
            if (j6 == Long.MAX_VALUE) {
                abstractC4122K.f().a();
            } else {
                abstractC4122K.f().d(nanoTime + j6);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j6 == Long.MAX_VALUE) {
                abstractC4122K.f().a();
            } else {
                abstractC4122K.f().d(nanoTime + j6);
            }
            return false;
        } catch (Throwable th2) {
            if (j6 == Long.MAX_VALUE) {
                abstractC4122K.f().a();
            } else {
                abstractC4122K.f().d(nanoTime + j6);
            }
            throw th2;
        }
    }

    public static final q v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2729c c2729c = (C2729c) it.next();
            String r10 = c2729c.f28557a.r();
            String r11 = c2729c.f28558b.r();
            arrayList.add(r10);
            arrayList.add(n.U2(r11).toString());
        }
        return new q((String[]) arrayList.toArray(new String[0]));
    }

    public static final String w(s sVar, boolean z10) {
        AbstractC3557B.c0("<this>", sVar);
        String str = sVar.f21253d;
        if (n.Z1(str, ":", false)) {
            str = android.gov.nist.core.a.h("[", str, ']');
        }
        int i10 = sVar.f21254e;
        if (!z10) {
            char[] cArr = s.f21249j;
            if (i10 == H1.l(sVar.f21250a)) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final List x(List list) {
        AbstractC3557B.c0("<this>", list);
        List unmodifiableList = Collections.unmodifiableList(t.M2(list));
        AbstractC3557B.b0("unmodifiableList(toMutableList())", unmodifiableList);
        return unmodifiableList;
    }

    public static final int y(int i10, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        return i10;
    }

    public static final String z(int i10, int i11, String str) {
        int n10 = n(i10, i11, str);
        String substring = str.substring(n10, o(n10, i11, str));
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }
}
