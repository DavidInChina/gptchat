package ai;

import K4.C0823k;
import Uf.A;
import Wh.C;
import Wh.C1656a;
import Wh.C1662g;
import Wh.C1665j;
import Wh.D;
import Wh.G;
import Wh.s;
import Wh.w;
import Wh.x;
import Wh.y;
import Wh.z;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import di.C2724A;
import di.C2725B;
import di.E;
import di.EnumC2728b;
import di.t;
import di.u;
import hi.C3450c;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import jh.H1;
import jh.L1;
import ji.C4115D;
import ji.C4116E;
import ji.C4138m;
import lc.C4385I;

/* loaded from: classes.dex */
public final class m extends di.j {

    /* renamed from: b  reason: collision with root package name */
    public final G f24278b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f24279c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f24280d;

    /* renamed from: e  reason: collision with root package name */
    public Wh.o f24281e;

    /* renamed from: f  reason: collision with root package name */
    public x f24282f;

    /* renamed from: g  reason: collision with root package name */
    public t f24283g;

    /* renamed from: h  reason: collision with root package name */
    public C4116E f24284h;

    /* renamed from: i  reason: collision with root package name */
    public C4115D f24285i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f24286j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f24287k;

    /* renamed from: l  reason: collision with root package name */
    public int f24288l;

    /* renamed from: m  reason: collision with root package name */
    public int f24289m;

    /* renamed from: n  reason: collision with root package name */
    public int f24290n;

    /* renamed from: o  reason: collision with root package name */
    public int f24291o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f24292p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f24293q = Long.MAX_VALUE;

    public m(n nVar, G g10) {
        AbstractC3557B.c0("connectionPool", nVar);
        AbstractC3557B.c0("route", g10);
        this.f24278b = g10;
    }

    public static void d(w wVar, G g10, IOException iOException) {
        AbstractC3557B.c0("client", wVar);
        AbstractC3557B.c0("failedRoute", g10);
        AbstractC3557B.c0("failure", iOException);
        if (g10.f21149b.type() != Proxy.Type.DIRECT) {
            C1656a c1656a = g10.f21148a;
            c1656a.f21165h.connectFailed(c1656a.f21166i.h(), g10.f21149b.address(), iOException);
        }
        C0823k c0823k = wVar.f21301H0;
        synchronized (c0823k) {
            c0823k.f9441a.add(g10);
        }
    }

    @Override // di.j
    public final synchronized void a(t tVar, E e10) {
        int i10;
        AbstractC3557B.c0("connection", tVar);
        AbstractC3557B.c0("settings", e10);
        if ((e10.f28540a & 16) != 0) {
            i10 = e10.f28541b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f24291o = i10;
    }

    @Override // di.j
    public final void b(C2724A c2724a) {
        AbstractC3557B.c0("stream", c2724a);
        c2724a.c(EnumC2728b.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b A[EDGE_INSN: B:82:0x014b->B:68:0x014b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, int i11, int i12, int i13, boolean z10, j jVar, Wh.n nVar) {
        IOException e10;
        Socket socket;
        Socket socket2;
        G g10;
        AbstractC3557B.c0("call", jVar);
        AbstractC3557B.c0("eventListener", nVar);
        if (this.f24282f == null) {
            List list = this.f24278b.f21148a.f21168k;
            C2006b c2006b = new C2006b(list);
            C1656a c1656a = this.f24278b.f21148a;
            if (c1656a.f21160c == null) {
                if (list.contains(C1665j.f21214g)) {
                    String str = this.f24278b.f21148a.f21166i.f21253d;
                    ei.m mVar = ei.m.f29511a;
                    if (!ei.m.f29511a.h(str)) {
                        throw new o(new UnknownServiceException(android.gov.nist.core.a.A("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (c1656a.f21167j.contains(x.H2_PRIOR_KNOWLEDGE)) {
                throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            o oVar = null;
            do {
                try {
                    G g11 = this.f24278b;
                    try {
                        if (g11.f21148a.f21160c != null && g11.f21149b.type() == Proxy.Type.HTTP) {
                            f(i10, i11, i12, jVar, nVar);
                            if (this.f24279c == null) {
                                g10 = this.f24278b;
                                if (g10.f21148a.f21160c == null && g10.f21149b.type() == Proxy.Type.HTTP && this.f24279c == null) {
                                    throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                                }
                                this.f24293q = System.nanoTime();
                                return;
                            }
                        } else {
                            try {
                                e(i10, i11, jVar, nVar);
                            } catch (IOException e11) {
                                e10 = e11;
                                socket = this.f24280d;
                                if (socket != null) {
                                    Xh.b.d(socket);
                                }
                                socket2 = this.f24279c;
                                if (socket2 != null) {
                                    Xh.b.d(socket2);
                                }
                                this.f24280d = null;
                                this.f24279c = null;
                                this.f24284h = null;
                                this.f24285i = null;
                                this.f24281e = null;
                                this.f24282f = null;
                                this.f24283g = null;
                                this.f24291o = 1;
                                G g12 = this.f24278b;
                                InetSocketAddress inetSocketAddress = g12.f21150c;
                                Proxy proxy = g12.f21149b;
                                AbstractC3557B.c0("inetSocketAddress", inetSocketAddress);
                                AbstractC3557B.c0("proxy", proxy);
                                if (oVar != null) {
                                    oVar = new o(e10);
                                } else {
                                    P4.a.m(oVar.f24299Y, e10);
                                    oVar.f24300Z = e10;
                                }
                                if (z10) {
                                    break;
                                }
                                c2006b.f24221d = true;
                                if (!c2006b.f24220c) {
                                    break;
                                } else if (e10 instanceof ProtocolException) {
                                    break;
                                } else if (e10 instanceof InterruptedIOException) {
                                    break;
                                } else {
                                    if (e10 instanceof SSLHandshakeException) {
                                        if (e10.getCause() instanceof CertificateException) {
                                            break;
                                        }
                                    }
                                    if (e10 instanceof SSLPeerUnverifiedException) {
                                        break;
                                    } else if (!(e10 instanceof SSLException)) {
                                    }
                                }
                                throw oVar;
                            }
                        }
                        g(c2006b, i13, jVar, nVar);
                        G g13 = this.f24278b;
                        InetSocketAddress inetSocketAddress2 = g13.f21150c;
                        Proxy proxy2 = g13.f21149b;
                        AbstractC3557B.c0("inetSocketAddress", inetSocketAddress2);
                        AbstractC3557B.c0("proxy", proxy2);
                        g10 = this.f24278b;
                        if (g10.f21148a.f21160c == null) {
                        }
                        this.f24293q = System.nanoTime();
                        return;
                    } catch (IOException e12) {
                        e10 = e12;
                        socket = this.f24280d;
                        if (socket != null) {
                        }
                        socket2 = this.f24279c;
                        if (socket2 != null) {
                        }
                        this.f24280d = null;
                        this.f24279c = null;
                        this.f24284h = null;
                        this.f24285i = null;
                        this.f24281e = null;
                        this.f24282f = null;
                        this.f24283g = null;
                        this.f24291o = 1;
                        G g122 = this.f24278b;
                        InetSocketAddress inetSocketAddress3 = g122.f21150c;
                        Proxy proxy3 = g122.f21149b;
                        AbstractC3557B.c0("inetSocketAddress", inetSocketAddress3);
                        AbstractC3557B.c0("proxy", proxy3);
                        if (oVar != null) {
                        }
                        if (z10) {
                        }
                        throw oVar;
                    }
                } catch (IOException e13) {
                    e10 = e13;
                }
            } while (!(e10 instanceof SSLException));
            throw oVar;
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void e(int i10, int i11, j jVar, Wh.n nVar) {
        int i12;
        Socket socket;
        G g10 = this.f24278b;
        Proxy proxy = g10.f21149b;
        C1656a c1656a = g10.f21148a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i12 = -1;
        } else {
            i12 = k.f24273a[type.ordinal()];
        }
        if (i12 != 1 && i12 != 2) {
            socket = new Socket(proxy);
        } else {
            socket = c1656a.f21159b.createSocket();
            AbstractC3557B.Z(socket);
        }
        this.f24279c = socket;
        InetSocketAddress inetSocketAddress = this.f24278b.f21150c;
        nVar.getClass();
        AbstractC3557B.c0("call", jVar);
        AbstractC3557B.c0("inetSocketAddress", inetSocketAddress);
        socket.setSoTimeout(i11);
        try {
            ei.m mVar = ei.m.f29511a;
            ei.m.f29511a.e(socket, this.f24278b.f21150c, i10);
            try {
                this.f24284h = R4.b.J(R4.b.a2(socket));
                this.f24285i = R4.b.I(R4.b.Y1(socket));
            } catch (NullPointerException e10) {
                if (!AbstractC3557B.K(e10.getMessage(), "throw with null exception")) {
                    return;
                }
                throw new IOException(e10);
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f24278b.f21150c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, j jVar, Wh.n nVar) {
        y yVar = new y();
        G g10 = this.f24278b;
        s sVar = g10.f21148a.f21166i;
        AbstractC3557B.c0("url", sVar);
        yVar.f21331a = sVar;
        yVar.e("CONNECT", null);
        C1656a c1656a = g10.f21148a;
        yVar.d("Host", Xh.b.w(c1656a.f21166i, true));
        yVar.d("Proxy-Connection", "Keep-Alive");
        yVar.d(SIPHeaderNames.USER_AGENT, "okhttp/4.12.0");
        z b10 = yVar.b();
        C c10 = new C();
        c10.d(b10);
        c10.f21118b = x.HTTP_1_1;
        c10.f21119c = 407;
        c10.f21120d = "Preemptive Authenticate";
        c10.f21123g = Xh.b.f21998c;
        c10.f21127k = -1L;
        c10.f21128l = -1L;
        Wh.p pVar = c10.f21122f;
        pVar.getClass();
        H1.i(SIPHeaderNames.PROXY_AUTHENTICATE);
        H1.j("OkHttp-Preemptive", SIPHeaderNames.PROXY_AUTHENTICATE);
        pVar.v(SIPHeaderNames.PROXY_AUTHENTICATE);
        pVar.a(SIPHeaderNames.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
        c10.a();
        ((Wh.n) c1656a.f21163f).getClass();
        e(i10, i11, jVar, nVar);
        C4116E c4116e = this.f24284h;
        AbstractC3557B.Z(c4116e);
        C4115D c4115d = this.f24285i;
        AbstractC3557B.Z(c4115d);
        ci.h hVar = new ci.h(null, this, c4116e, c4115d);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4116e.f36671Y.f().g(i11, timeUnit);
        c4115d.f36668Y.f().g(i12, timeUnit);
        hVar.i(b10.f21338c, "CONNECT " + Xh.b.w(b10.f21336a, true) + " HTTP/1.1");
        hVar.a();
        C d10 = hVar.d(false);
        AbstractC3557B.Z(d10);
        d10.d(b10);
        D a5 = d10.a();
        long k10 = Xh.b.k(a5);
        if (k10 != -1) {
            ci.e h10 = hVar.h(k10);
            Xh.b.u(h10, Integer.MAX_VALUE, timeUnit);
            h10.close();
        }
        int i13 = a5.f21133i0;
        if (i13 != 200) {
            if (i13 == 407) {
                ((Wh.n) c1656a.f21163f).getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(android.gov.nist.core.a.e("Unexpected response code for CONNECT: ", i13));
        } else if (c4116e.f36672Z.H() && c4115d.f36669Z.H()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(C2006b c2006b, int i10, j jVar, Wh.n nVar) {
        Throwable th2;
        C4138m i11;
        C1656a c1656a = this.f24278b.f21148a;
        SSLSocketFactory sSLSocketFactory = c1656a.f21160c;
        x xVar = x.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c1656a.f21167j;
            x xVar2 = x.H2_PRIOR_KNOWLEDGE;
            if (list.contains(xVar2)) {
                this.f24280d = this.f24279c;
                this.f24282f = xVar2;
                m(i10);
                return;
            }
            this.f24280d = this.f24279c;
            this.f24282f = xVar;
            return;
        }
        nVar.getClass();
        AbstractC3557B.c0("call", jVar);
        C1656a c1656a2 = this.f24278b.f21148a;
        SSLSocketFactory sSLSocketFactory2 = c1656a2.f21160c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            AbstractC3557B.Z(sSLSocketFactory2);
            Socket socket = this.f24279c;
            s sVar = c1656a2.f21166i;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, sVar.f21253d, sVar.f21254e, true);
            AbstractC3557B.a0("null cannot be cast to non-null type javax.net.ssl.SSLSocket", createSocket);
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C1665j a5 = c2006b.a(sSLSocket2);
                if (a5.f21216b) {
                    ei.m mVar = ei.m.f29511a;
                    ei.m.f29511a.d(sSLSocket2, c1656a2.f21166i.f21253d, c1656a2.f21167j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC3557B.b0("sslSocketSession", session);
                Wh.o i12 = L1.i(session);
                HostnameVerifier hostnameVerifier = c1656a2.f21161d;
                AbstractC3557B.Z(hostnameVerifier);
                if (!hostnameVerifier.verify(c1656a2.f21166i.f21253d, session)) {
                    List a10 = i12.a();
                    if (!a10.isEmpty()) {
                        Object obj = a10.get(0);
                        AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
                        X509Certificate x509Certificate = (X509Certificate) obj;
                        StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                        sb2.append(c1656a2.f21166i.f21253d);
                        sb2.append(" not verified:\n              |    certificate: ");
                        C1662g c1662g = C1662g.f21185c;
                        StringBuilder sb3 = new StringBuilder("sha256/");
                        C4138m c4138m = C4138m.f36722i0;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        AbstractC3557B.b0("publicKey.encoded", encoded);
                        i11 = ei.l.i(encoded, 0, -1234567890);
                        sb3.append(i11.c("SHA-256").a());
                        sb2.append(sb3.toString());
                        sb2.append("\n              |    DN: ");
                        sb2.append(x509Certificate.getSubjectDN().getName());
                        sb2.append("\n              |    subjectAltNames: ");
                        sb2.append(kf.t.w2(C3450c.a(x509Certificate, 2), C3450c.a(x509Certificate, 7)));
                        sb2.append("\n              ");
                        throw new SSLPeerUnverifiedException(Bi.c.N1(sb2.toString()));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + c1656a2.f21166i.f21253d + " not verified (no certificates)");
                }
                C1662g c1662g2 = c1656a2.f21162e;
                AbstractC3557B.Z(c1662g2);
                this.f24281e = new Wh.o(i12.f21235a, i12.f21236b, i12.f21237c, new C4385I(c1662g2, i12, c1656a2, 12));
                c1662g2.a(c1656a2.f21166i.f21253d, new A(22, this));
                if (a5.f21216b) {
                    ei.m mVar2 = ei.m.f29511a;
                    str = ei.m.f29511a.f(sSLSocket2);
                }
                this.f24280d = sSLSocket2;
                this.f24284h = R4.b.J(R4.b.a2(sSLSocket2));
                this.f24285i = R4.b.I(R4.b.Y1(sSLSocket2));
                if (str != null) {
                    xVar = L1.k(str);
                }
                this.f24282f = xVar;
                ei.m mVar3 = ei.m.f29511a;
                ei.m.f29511a.a(sSLSocket2);
                if (this.f24282f == x.HTTP_2) {
                    m(i10);
                }
            } catch (Throwable th3) {
                th2 = th3;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    ei.m mVar4 = ei.m.f29511a;
                    ei.m.f29511a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Xh.b.d(sSLSocket);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public final synchronized void h() {
        this.f24289m++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (hi.C3450c.c(r0, (java.security.cert.X509Certificate) r10) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(C1656a c1656a, List list) {
        Wh.o oVar;
        AbstractC3557B.c0("address", c1656a);
        byte[] bArr = Xh.b.f21996a;
        if (this.f24292p.size() < this.f24291o && !this.f24286j) {
            G g10 = this.f24278b;
            if (!g10.f21148a.a(c1656a)) {
                return false;
            }
            s sVar = c1656a.f21166i;
            String str = sVar.f21253d;
            C1656a c1656a2 = g10.f21148a;
            if (AbstractC3557B.K(str, c1656a2.f21166i.f21253d)) {
                return true;
            }
            if (this.f24283g != null && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    G g11 = (G) it.next();
                    Proxy.Type type = g11.f21149b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && g10.f21149b.type() == type2) {
                        if (AbstractC3557B.K(g10.f21150c, g11.f21150c)) {
                            if (c1656a.f21161d != C3450c.f32390a) {
                                return false;
                            }
                            byte[] bArr2 = Xh.b.f21996a;
                            s sVar2 = c1656a2.f21166i;
                            if (sVar.f21254e == sVar2.f21254e) {
                                String str2 = sVar2.f21253d;
                                String str3 = sVar.f21253d;
                                if (!AbstractC3557B.K(str3, str2)) {
                                    if (!this.f24287k && (oVar = this.f24281e) != null) {
                                        List a5 = oVar.a();
                                        if (!a5.isEmpty()) {
                                            Object obj = a5.get(0);
                                            AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
                                        }
                                    }
                                }
                                try {
                                    C1662g c1662g = c1656a.f21162e;
                                    AbstractC3557B.Z(c1662g);
                                    Wh.o oVar2 = this.f24281e;
                                    AbstractC3557B.Z(oVar2);
                                    List a10 = oVar2.a();
                                    AbstractC3557B.c0("hostname", str3);
                                    AbstractC3557B.c0("peerCertificates", a10);
                                    c1662g.a(str3, new C4385I(c1662g, a10, str3, 11));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(boolean z10) {
        long j6;
        byte[] bArr = Xh.b.f21996a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f24279c;
        AbstractC3557B.Z(socket);
        Socket socket2 = this.f24280d;
        AbstractC3557B.Z(socket2);
        C4116E c4116e = this.f24284h;
        AbstractC3557B.Z(c4116e);
        boolean z11 = false;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        t tVar = this.f24283g;
        if (tVar != null) {
            return tVar.j(nanoTime);
        }
        synchronized (this) {
            j6 = nanoTime - this.f24293q;
        }
        if (j6 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            socket2.setSoTimeout(1);
            boolean z12 = !c4116e.H();
            socket2.setSoTimeout(soTimeout);
            z11 = z12;
            return z11;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return z11;
        }
    }

    public final bi.d k(w wVar, bi.f fVar) {
        Socket socket = this.f24280d;
        AbstractC3557B.Z(socket);
        C4116E c4116e = this.f24284h;
        AbstractC3557B.Z(c4116e);
        C4115D c4115d = this.f24285i;
        AbstractC3557B.Z(c4115d);
        t tVar = this.f24283g;
        if (tVar != null) {
            return new u(wVar, this, fVar, tVar);
        }
        int i10 = fVar.f26030g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4116e.f36671Y.f().g(i10, timeUnit);
        c4115d.f36668Y.f().g(fVar.f26031h, timeUnit);
        return new ci.h(wVar, this, c4116e, c4115d);
    }

    public final synchronized void l() {
        this.f24286j = true;
    }

    public final void m(int i10) {
        String str;
        int i11;
        int a5;
        Socket socket = this.f24280d;
        AbstractC3557B.Z(socket);
        C4116E c4116e = this.f24284h;
        AbstractC3557B.Z(c4116e);
        C4115D c4115d = this.f24285i;
        AbstractC3557B.Z(c4115d);
        socket.setSoTimeout(0);
        Zh.f fVar = Zh.f.f23776i;
        di.h hVar = new di.h(fVar);
        String str2 = this.f24278b.f21148a.f21166i.f21253d;
        AbstractC3557B.c0("peerName", str2);
        hVar.f28585c = socket;
        if (hVar.f28583a) {
            str = Xh.b.f22002g + ' ' + str2;
        } else {
            str = "MockWebServer ".concat(str2);
        }
        AbstractC3557B.c0("<set-?>", str);
        hVar.f28586d = str;
        hVar.f28587e = c4116e;
        hVar.f28588f = c4115d;
        hVar.f28589g = this;
        hVar.f28591i = i10;
        t tVar = new t(hVar);
        this.f24283g = tVar;
        E e10 = t.f28621G0;
        if ((e10.f28540a & 16) != 0) {
            i11 = e10.f28541b[4];
        } else {
            i11 = Integer.MAX_VALUE;
        }
        this.f24291o = i11;
        C2725B c2725b = tVar.f28625D0;
        synchronized (c2725b) {
            try {
                if (!c2725b.f28534j0) {
                    if (c2725b.f28531Z) {
                        Logger logger = C2725B.f28529l0;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(Xh.b.i(">> CONNECTION " + di.g.f28579a.e(), new Object[0]));
                        }
                        c2725b.f28530Y.M(di.g.f28579a);
                        c2725b.f28530Y.flush();
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        tVar.f28625D0.r(tVar.f28645w0);
        if (tVar.f28645w0.a() != 65535) {
            tVar.f28625D0.F(0, a5 - 65535);
        }
        fVar.f().c(new Zh.b(tVar.f28631i0, 0, tVar.f28626E0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        G g10 = this.f24278b;
        sb2.append(g10.f21148a.f21166i.f21253d);
        sb2.append(':');
        sb2.append(g10.f21148a.f21166i.f21254e);
        sb2.append(", proxy=");
        sb2.append(g10.f21149b);
        sb2.append(" hostAddress=");
        sb2.append(g10.f21150c);
        sb2.append(" cipherSuite=");
        Wh.o oVar = this.f24281e;
        if (oVar == null || (obj = oVar.f21236b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f24282f);
        sb2.append('}');
        return sb2.toString();
    }
}
