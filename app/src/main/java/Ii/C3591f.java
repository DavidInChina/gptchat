package ii;

import Df.H;
import Lg.n;
import Wh.D;
import Wh.J;
import Wh.K;
import Wh.x;
import Wh.z;
import ai.l;
import di.r;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import ji.AbstractC4136k;
import ji.AbstractC4137l;
import ji.C4133h;
import ji.C4135j;
import ji.C4138m;
import ji.v;
import l8.AbstractC4344b;

/* renamed from: ii.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3591f implements J, AbstractC3593h {

    /* renamed from: x  reason: collision with root package name */
    public static final List f33267x = AbstractC4344b.F0(x.HTTP_1_1);

    /* renamed from: a  reason: collision with root package name */
    public final z f33268a;

    /* renamed from: b  reason: collision with root package name */
    public final K f33269b;

    /* renamed from: c  reason: collision with root package name */
    public final Random f33270c;

    /* renamed from: d  reason: collision with root package name */
    public final long f33271d;

    /* renamed from: f  reason: collision with root package name */
    public final long f33273f;

    /* renamed from: g  reason: collision with root package name */
    public final String f33274g;

    /* renamed from: h  reason: collision with root package name */
    public ai.j f33275h;

    /* renamed from: i  reason: collision with root package name */
    public C3590e f33276i;

    /* renamed from: j  reason: collision with root package name */
    public C3594i f33277j;

    /* renamed from: k  reason: collision with root package name */
    public C3595j f33278k;

    /* renamed from: l  reason: collision with root package name */
    public final Zh.c f33279l;

    /* renamed from: m  reason: collision with root package name */
    public String f33280m;

    /* renamed from: n  reason: collision with root package name */
    public l f33281n;

    /* renamed from: q  reason: collision with root package name */
    public long f33284q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f33285r;

    /* renamed from: t  reason: collision with root package name */
    public String f33287t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f33288u;

    /* renamed from: v  reason: collision with root package name */
    public int f33289v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f33290w;

    /* renamed from: e  reason: collision with root package name */
    public C3592g f33272e = null;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayDeque f33282o = new ArrayDeque();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayDeque f33283p = new ArrayDeque();

    /* renamed from: s  reason: collision with root package name */
    public int f33286s = -1;

    public C3591f(Zh.f fVar, z zVar, K k10, Random random, long j6, long j10) {
        C4138m i10;
        AbstractC3557B.c0("taskRunner", fVar);
        AbstractC3557B.c0("originalRequest", zVar);
        AbstractC3557B.c0("listener", k10);
        this.f33268a = zVar;
        this.f33269b = k10;
        this.f33270c = random;
        this.f33271d = j6;
        this.f33273f = j10;
        this.f33279l = fVar.f();
        String str = zVar.f21337b;
        if (AbstractC3557B.K("GET", str)) {
            C4138m c4138m = C4138m.f36722i0;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            i10 = ei.l.i(bArr, 0, -1234567890);
            this.f33274g = i10.a();
            return;
        }
        throw new IllegalArgumentException(R.a.r("Request must be GET: ", str).toString());
    }

    public final void a(D d10, ai.e eVar) {
        int i10 = d10.f21133i0;
        if (i10 == 101) {
            String h10 = D.h(d10, "Connection");
            if (n.f2("Upgrade", h10)) {
                String h11 = D.h(d10, "Upgrade");
                if (n.f2("websocket", h11)) {
                    String h12 = D.h(d10, "Sec-WebSocket-Accept");
                    C4138m c4138m = C4138m.f36722i0;
                    String a5 = ei.l.g(this.f33274g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
                    if (AbstractC3557B.K(a5, h12)) {
                        if (eVar != null) {
                            return;
                        }
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a5 + "' but was '" + h12 + '\'');
                }
                throw new ProtocolException(android.gov.nist.core.a.h("Expected 'Upgrade' header value 'websocket' but was '", h11, '\''));
            }
            throw new ProtocolException(android.gov.nist.core.a.h("Expected 'Connection' header value 'Upgrade' but was '", h10, '\''));
        }
        StringBuilder sb2 = new StringBuilder("Expected HTTP 101 response but was '");
        sb2.append(i10);
        sb2.append(' ');
        throw new ProtocolException(android.gov.nist.core.a.n(sb2, d10.f21132h0, '\''));
    }

    public final boolean b(int i10, String str) {
        String str2;
        synchronized (this) {
            C4138m c4138m = null;
            try {
                if (i10 >= 1000 && i10 < 5000) {
                    if ((1004 <= i10 && i10 < 1007) || (1015 <= i10 && i10 < 3000)) {
                        str2 = "Code " + i10 + " is reserved and may not be used.";
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = "Code must be in range [1000,5000): " + i10;
                }
                if (str2 == null) {
                    if (str != null) {
                        C4138m c4138m2 = C4138m.f36722i0;
                        c4138m = ei.l.g(str);
                        if (c4138m.f36723Y.length > 123) {
                            throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                        }
                    }
                    if (!this.f33288u && !this.f33285r) {
                        this.f33285r = true;
                        this.f33283p.add(new C3588c(i10, c4138m));
                        h();
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException(str2.toString());
            } finally {
            }
        }
    }

    public final void c(Exception exc, D d10) {
        synchronized (this) {
            if (this.f33288u) {
                return;
            }
            this.f33288u = true;
            l lVar = this.f33281n;
            this.f33281n = null;
            C3594i c3594i = this.f33277j;
            this.f33277j = null;
            C3595j c3595j = this.f33278k;
            this.f33278k = null;
            this.f33279l.e();
            try {
                this.f33269b.c(this, exc, d10);
            } finally {
                if (lVar != null) {
                    Xh.b.c(lVar);
                }
                if (c3594i != null) {
                    Xh.b.c(c3594i);
                }
                if (c3595j != null) {
                    Xh.b.c(c3595j);
                }
            }
        }
    }

    public final void d(String str, l lVar) {
        boolean z10;
        boolean z11;
        AbstractC3557B.c0("name", str);
        C3592g c3592g = this.f33272e;
        AbstractC3557B.Z(c3592g);
        synchronized (this) {
            try {
                this.f33280m = str;
                this.f33281n = lVar;
                boolean z12 = lVar.f24274Y;
                AbstractC4136k abstractC4136k = lVar.f24276h0;
                Random random = this.f33270c;
                boolean z13 = c3592g.f33291a;
                if (z12) {
                    z10 = c3592g.f33293c;
                } else {
                    z10 = c3592g.f33295e;
                }
                this.f33278k = new C3595j(z12, abstractC4136k, random, z13, z10, this.f33273f);
                this.f33276i = new C3590e(this);
                long j6 = this.f33271d;
                if (j6 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j6);
                    this.f33279l.c(new r(str.concat(" ping"), this, nanos, 1), nanos);
                }
                if (!this.f33283p.isEmpty()) {
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z14 = lVar.f24274Y;
        AbstractC4137l abstractC4137l = lVar.f24275Z;
        boolean z15 = c3592g.f33291a;
        if (!z14) {
            z11 = c3592g.f33293c;
        } else {
            z11 = c3592g.f33295e;
        }
        this.f33277j = new C3594i(z14, abstractC4137l, this, z15, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        while (this.f33286s == -1) {
            C3594i c3594i = this.f33277j;
            AbstractC3557B.Z(c3594i);
            c3594i.h();
            if (c3594i.f33306o0) {
                c3594i.a();
            } else {
                int i10 = c3594i.f33303l0;
                if (i10 != 1 && i10 != 2) {
                    byte[] bArr = Xh.b.f21996a;
                    String hexString = Integer.toHexString(i10);
                    AbstractC3557B.b0("toHexString(this)", hexString);
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!c3594i.f33302k0) {
                    long j6 = c3594i.f33304m0;
                    int i11 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                    C4135j c4135j = c3594i.f33309r0;
                    if (i11 > 0) {
                        c3594i.f33298Z.K0(c4135j, j6);
                        if (!c3594i.f33297Y) {
                            C4133h c4133h = c3594i.f33312u0;
                            AbstractC3557B.Z(c4133h);
                            c4135j.F(c4133h);
                            c4133h.h(c4135j.f36721Z - c3594i.f33304m0);
                            byte[] bArr2 = c3594i.f33311t0;
                            AbstractC3557B.Z(bArr2);
                            H.B0(c4133h, bArr2);
                            c4133h.close();
                        }
                    }
                    if (!c3594i.f33305n0) {
                        while (!c3594i.f33302k0) {
                            c3594i.h();
                            if (!c3594i.f33306o0) {
                                break;
                            }
                            c3594i.a();
                        }
                        if (c3594i.f33303l0 != 0) {
                            int i12 = c3594i.f33303l0;
                            byte[] bArr3 = Xh.b.f21996a;
                            String hexString2 = Integer.toHexString(i12);
                            AbstractC3557B.b0("toHexString(this)", hexString2);
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    } else if (c3594i.f33307p0) {
                        C3586a c3586a = c3594i.f33310s0;
                        if (c3586a == null) {
                            c3586a = new C3586a(1, c3594i.f33301j0);
                            c3594i.f33310s0 = c3586a;
                        }
                        AbstractC3557B.c0("buffer", c4135j);
                        C4135j c4135j2 = c3586a.f33256h0;
                        if (c4135j2.f36721Z == 0) {
                            boolean z10 = c3586a.f33255Z;
                            Object obj = c3586a.f33257i0;
                            if (z10) {
                                ((Inflater) obj).reset();
                            }
                            c4135j2.I0(c4135j);
                            c4135j2.H0(65535);
                            Inflater inflater = (Inflater) obj;
                            long bytesRead = inflater.getBytesRead() + c4135j2.f36721Z;
                            do {
                                ((v) c3586a.f33258j0).a(c4135j, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                            AbstractC3593h abstractC3593h = c3594i.f33299h0;
                            if (i10 != 1) {
                            }
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    } else {
                        AbstractC3593h abstractC3593h2 = c3594i.f33299h0;
                        if (i10 != 1) {
                            String V10 = c4135j.V();
                            C3591f c3591f = (C3591f) abstractC3593h2;
                            c3591f.getClass();
                            c3591f.f33269b.d(c3591f, V10);
                        } else {
                            C4138m q10 = c4135j.q(c4135j.f36721Z);
                            C3591f c3591f2 = (C3591f) abstractC3593h2;
                            c3591f2.getClass();
                            AbstractC3557B.c0("bytes", q10);
                            c3591f2.f33269b.e(c3591f2, q10);
                        }
                    }
                }
                throw new IOException("closed");
            }
        }
    }

    public final void f(int i10, String str) {
        l lVar;
        C3595j c3595j;
        C3594i c3594i;
        if (i10 != -1) {
            synchronized (this) {
                if (this.f33286s == -1) {
                    this.f33286s = i10;
                    this.f33287t = str;
                    lVar = null;
                    if (this.f33285r && this.f33283p.isEmpty()) {
                        l lVar2 = this.f33281n;
                        this.f33281n = null;
                        c3594i = this.f33277j;
                        this.f33277j = null;
                        c3595j = this.f33278k;
                        this.f33278k = null;
                        this.f33279l.e();
                        lVar = lVar2;
                    } else {
                        c3594i = null;
                        c3595j = null;
                    }
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.f33269b.b(this, i10, str);
                if (lVar != null) {
                    this.f33269b.a(this, i10, str);
                }
                if (c3595j != null) {
                    return;
                }
                return;
            } finally {
                if (lVar != null) {
                    Xh.b.c(lVar);
                }
                if (c3594i != null) {
                    Xh.b.c(c3594i);
                }
                if (c3595j != null) {
                    Xh.b.c(c3595j);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final synchronized void g(C4138m c4138m) {
        try {
            AbstractC3557B.c0("payload", c4138m);
            if (!this.f33288u && (!this.f33285r || !this.f33283p.isEmpty())) {
                this.f33282o.add(c4138m);
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void h() {
        byte[] bArr = Xh.b.f21996a;
        C3590e c3590e = this.f33276i;
        if (c3590e != null) {
            this.f33279l.c(c3590e, 0L);
        }
    }

    public final synchronized boolean i(int i10, C4138m c4138m) {
        if (!this.f33288u && !this.f33285r) {
            long j6 = this.f33284q;
            byte[] bArr = c4138m.f36723Y;
            if (bArr.length + j6 > 16777216) {
                b(1001, null);
                return false;
            }
            this.f33284q = j6 + bArr.length;
            this.f33283p.add(new C3589d(i10, c4138m));
            h();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
        if (r2 < 3000) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #4 {all -> 0x0082, blocks: (B:28:0x0076, B:31:0x0085, B:33:0x0089, B:34:0x0095, B:36:0x00a2, B:38:0x00a8, B:40:0x00ac, B:58:0x00d7, B:59:0x00eb, B:62:0x00fc, B:63:0x0105, B:64:0x0106, B:66:0x0110, B:67:0x0113, B:70:0x011e, B:72:0x0122, B:80:0x013e, B:81:0x0143, B:35:0x0096, B:69:0x011b), top: B:90:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: all -> 0x0082, TryCatch #4 {all -> 0x0082, blocks: (B:28:0x0076, B:31:0x0085, B:33:0x0089, B:34:0x0095, B:36:0x00a2, B:38:0x00a8, B:40:0x00ac, B:58:0x00d7, B:59:0x00eb, B:62:0x00fc, B:63:0x0105, B:64:0x0106, B:66:0x0110, B:67:0x0113, B:70:0x011e, B:72:0x0122, B:80:0x013e, B:81:0x0143, B:35:0x0096, B:69:0x011b), top: B:90:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[Catch: all -> 0x0082, TryCatch #4 {all -> 0x0082, blocks: (B:28:0x0076, B:31:0x0085, B:33:0x0089, B:34:0x0095, B:36:0x00a2, B:38:0x00a8, B:40:0x00ac, B:58:0x00d7, B:59:0x00eb, B:62:0x00fc, B:63:0x0105, B:64:0x0106, B:66:0x0110, B:67:0x0113, B:70:0x011e, B:72:0x0122, B:80:0x013e, B:81:0x0143, B:35:0x0096, B:69:0x011b), top: B:90:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ji.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j() {
        Closeable closeable;
        C3594i c3594i;
        String str;
        Object obj;
        Closeable closeable2;
        int i10;
        C3594i c3594i2;
        synchronized (this) {
            try {
                if (this.f33288u) {
                    return false;
                }
                C3595j c3595j = this.f33278k;
                Object poll = this.f33282o.poll();
                String str2 = null;
                try {
                    if (poll == null) {
                        obj = this.f33283p.poll();
                        if (obj instanceof C3588c) {
                            i10 = this.f33286s;
                            String str3 = this.f33287t;
                            if (i10 != -1) {
                                closeable2 = this.f33281n;
                                this.f33281n = null;
                                c3594i = this.f33277j;
                                this.f33277j = null;
                                closeable = this.f33278k;
                                this.f33278k = null;
                                this.f33279l.e();
                                str = str3;
                            } else {
                                long j6 = ((C3588c) obj).f33262c;
                                this.f33279l.c(new C3590e(this.f33280m + " cancel", this), TimeUnit.MILLISECONDS.toNanos(j6));
                                closeable2 = null;
                                c3594i = null;
                                closeable = null;
                                str = str3;
                            }
                            if (poll == null) {
                                AbstractC3557B.Z(c3595j);
                                c3595j.a(10, (C4138m) poll);
                            } else if (obj instanceof C3589d) {
                                C3589d c3589d = (C3589d) obj;
                                AbstractC3557B.Z(c3595j);
                                c3595j.h(c3589d.f33263a, c3589d.f33264b);
                                synchronized (this) {
                                    this.f33284q -= c3589d.f33264b.d();
                                }
                            } else if (obj instanceof C3588c) {
                                C3588c c3588c = (C3588c) obj;
                                AbstractC3557B.Z(c3595j);
                                int i11 = c3588c.f33260a;
                                C4138m c4138m = c3588c.f33261b;
                                C4138m c4138m2 = C4138m.f36722i0;
                                if (i11 != 0 || c4138m != null) {
                                    if (i11 != 0) {
                                        if (i11 >= 1000 && i11 < 5000) {
                                            if (1004 <= i11) {
                                                if (i11 < 1007) {
                                                    str2 = "Code " + i11 + " is reserved and may not be used.";
                                                    if (str2 != null) {
                                                        throw new IllegalArgumentException(str2.toString());
                                                    }
                                                }
                                            }
                                            if (1015 <= i11) {
                                            }
                                            if (str2 != null) {
                                            }
                                        }
                                        str2 = "Code must be in range [1000,5000): " + i11;
                                        if (str2 != null) {
                                        }
                                    }
                                    ?? obj2 = new Object();
                                    obj2.P0(i11);
                                    if (c4138m != null) {
                                        obj2.f0(c4138m);
                                    }
                                    c4138m2 = obj2.q(obj2.f36721Z);
                                }
                                c3595j.a(8, c4138m2);
                                c3595j.f33321n0 = true;
                                if (closeable2 != null) {
                                    K k10 = this.f33269b;
                                    AbstractC3557B.Z(str);
                                    k10.a(this, i10, str);
                                }
                            } else {
                                throw new AssertionError();
                            }
                            return true;
                        } else if (obj == null) {
                            return false;
                        } else {
                            c3594i2 = null;
                        }
                    } else {
                        obj = null;
                        c3594i2 = null;
                    }
                    if (poll == null) {
                    }
                    return true;
                } finally {
                    if (closeable2 != null) {
                        Xh.b.c(closeable2);
                    }
                    if (c3594i != null) {
                        Xh.b.c(c3594i);
                    }
                    if (closeable != null) {
                        Xh.b.c(closeable);
                    }
                }
                c3594i = c3594i2;
                closeable = c3594i;
                i10 = -1;
                closeable2 = closeable;
                str = c3594i2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
