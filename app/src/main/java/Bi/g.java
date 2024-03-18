package bi;

import Wh.B;
import Wh.C;
import Wh.C1656a;
import Wh.C1662g;
import Wh.D;
import Wh.F;
import Wh.G;
import Wh.r;
import Wh.s;
import Wh.t;
import Wh.w;
import Wh.y;
import Wh.z;
import ai.j;
import ai.m;
import ai.n;
import ai.o;
import ai.p;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import di.C2727a;
import id.AbstractC3557B;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kf.v;
import m.C4528h;

/* loaded from: classes2.dex */
public final class g implements t {

    /* renamed from: a  reason: collision with root package name */
    public final w f26033a;

    public g(w wVar) {
        AbstractC3557B.c0("client", wVar);
        this.f26033a = wVar;
    }

    public static int d(D d10, int i10) {
        String h10 = D.h(d10, SIPHeaderNames.RETRY_AFTER);
        if (h10 == null) {
            return i10;
        }
        Pattern compile = Pattern.compile("\\d+");
        AbstractC3557B.b0("compile(...)", compile);
        if (compile.matcher(h10).matches()) {
            Integer valueOf = Integer.valueOf(h10);
            AbstractC3557B.b0("valueOf(header)", valueOf);
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
        throw new java.lang.IllegalArgumentException("priorResponse.body != null".toString());
     */
    @Override // Wh.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D a(f fVar) {
        int i10;
        List<Exception> list;
        ai.e eVar;
        C1662g c1662g;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        z zVar = fVar.f26028e;
        j jVar = fVar.f26024a;
        boolean z10 = true;
        List list2 = v.f37483Y;
        D d10 = null;
        int i11 = 0;
        z zVar2 = zVar;
        boolean z11 = true;
        while (true) {
            jVar.getClass();
            AbstractC3557B.c0("request", zVar2);
            if (jVar.f24266q0 == null) {
                synchronized (jVar) {
                    try {
                        if (jVar.f24268s0 ^ z10) {
                            if (!(jVar.f24267r0 ^ z10)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } else {
                            throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z11) {
                    n nVar = jVar.f24258i0;
                    s sVar = zVar2.f21336a;
                    boolean z12 = sVar.f21258i;
                    w wVar = jVar.f24255Y;
                    if (z12) {
                        SSLSocketFactory sSLSocketFactory2 = wVar.f21317u0;
                        if (sSLSocketFactory2 != null) {
                            HostnameVerifier hostnameVerifier2 = wVar.f21321y0;
                            c1662g = wVar.f21322z0;
                            sSLSocketFactory = sSLSocketFactory2;
                            hostnameVerifier = hostnameVerifier2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        c1662g = null;
                    }
                    list = list2;
                    i10 = i11;
                    jVar.f24263n0 = new ai.f(nVar, new C1656a(sVar.f21253d, sVar.f21254e, wVar.f21312p0, wVar.f21316t0, sSLSocketFactory, hostnameVerifier, c1662g, wVar.f21315s0, wVar.f21313q0, wVar.f21320x0, wVar.f21319w0, wVar.f21314r0), jVar, jVar.f24259j0);
                } else {
                    list = list2;
                    i10 = i11;
                }
                try {
                    if (!jVar.f24270u0) {
                        try {
                            try {
                                D b10 = fVar.b(zVar2);
                                if (d10 != null) {
                                    C i12 = b10.i();
                                    C i13 = d10.i();
                                    i13.f21123g = null;
                                    D a5 = i13.a();
                                    if (a5.f21136l0 != null) {
                                        break;
                                    }
                                    i12.f21126j = a5;
                                    b10 = i12.a();
                                }
                                d10 = b10;
                                eVar = jVar.f24266q0;
                            } catch (Throwable th3) {
                                th = th3;
                                jVar.g(true);
                                throw th;
                            }
                        } catch (o e10) {
                            List<Exception> list3 = list;
                            if (c(e10.f24300Z, jVar, zVar2, false)) {
                                list2 = kf.t.x2(e10.f24299Y, list3);
                                jVar.g(true);
                                z10 = true;
                                z11 = false;
                                i11 = i10;
                            } else {
                                IOException iOException = e10.f24299Y;
                                AbstractC3557B.c0("<this>", iOException);
                                for (Exception exc : list3) {
                                    P4.a.m(iOException, exc);
                                }
                                throw iOException;
                            }
                        } catch (IOException e11) {
                            if (c(e11, jVar, zVar2, !(e11 instanceof C2727a))) {
                                list2 = kf.t.x2(e11, list);
                                jVar.g(true);
                                z10 = true;
                                i11 = i10;
                                z11 = false;
                            } else {
                                for (Exception exc2 : list) {
                                    P4.a.m(e11, exc2);
                                }
                                throw e11;
                            }
                        }
                        try {
                            zVar2 = b(d10, eVar);
                            if (zVar2 == null) {
                                if (eVar != null && eVar.f24237e) {
                                    if (!jVar.f24265p0) {
                                        jVar.f24265p0 = true;
                                        jVar.f24260k0.j();
                                    } else {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                }
                                jVar.g(false);
                                return d10;
                            }
                            B b11 = zVar2.f21339d;
                            if (b11 != null && (b11 instanceof ke.s)) {
                                jVar.g(false);
                                return d10;
                            }
                            F f6 = d10.f21136l0;
                            if (f6 != null) {
                                Xh.b.c(f6);
                            }
                            i11 = i10 + 1;
                            if (i11 <= 20) {
                                jVar.g(true);
                                list2 = list;
                                z11 = true;
                                z10 = true;
                            } else {
                                throw new ProtocolException("Too many follow-up requests: " + i11);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            jVar.g(true);
                            throw th;
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public final z b(D d10, ai.e eVar) {
        G g10;
        String h10;
        r rVar;
        s sVar;
        m mVar;
        B b10 = null;
        if (eVar != null && (mVar = eVar.f24239g) != null) {
            g10 = mVar.f24278b;
        } else {
            g10 = null;
        }
        int i10 = d10.f21133i0;
        z zVar = d10.f21130Y;
        String str = zVar.f21337b;
        boolean z10 = false;
        if (i10 != 307 && i10 != 308) {
            if (i10 != 401) {
                if (i10 != 421) {
                    if (i10 != 503) {
                        if (i10 != 407) {
                            if (i10 != 408) {
                                switch (i10) {
                                    case RCHTTPStatusCodes.UNSUCCESSFUL /* 300 */:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else if (!this.f26033a.f21307k0) {
                                return null;
                            } else {
                                B b11 = zVar.f21339d;
                                if (b11 != null && (b11 instanceof ke.s)) {
                                    return null;
                                }
                                D d11 = d10.f21139o0;
                                if ((d11 != null && d11.f21133i0 == 408) || d(d10, 0) > 0) {
                                    return null;
                                }
                                return d10.f21130Y;
                            }
                        } else {
                            AbstractC3557B.Z(g10);
                            if (g10.f21149b.type() == Proxy.Type.HTTP) {
                                ((Wh.n) this.f26033a.f21315s0).getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        D d12 = d10.f21139o0;
                        if ((d12 != null && d12.f21133i0 == 503) || d(d10, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return d10.f21130Y;
                    }
                } else {
                    B b12 = zVar.f21339d;
                    if ((b12 != null && (b12 instanceof ke.s)) || eVar == null || !(!AbstractC3557B.K(eVar.f24235c.f24241b.f21166i.f21253d, eVar.f24239g.f24278b.f21148a.f21166i.f21253d))) {
                        return null;
                    }
                    m mVar2 = eVar.f24239g;
                    synchronized (mVar2) {
                        mVar2.f24287k = true;
                    }
                    return d10.f21130Y;
                }
            } else {
                ((Wh.n) this.f26033a.f21308l0).getClass();
                return null;
            }
        }
        w wVar = this.f26033a;
        if (!wVar.f21309m0 || (h10 = D.h(d10, "Location")) == null) {
            return null;
        }
        z zVar2 = d10.f21130Y;
        s sVar2 = zVar2.f21336a;
        sVar2.getClass();
        try {
            rVar = new r();
            rVar.c(sVar2, h10);
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        if (rVar != null) {
            sVar = rVar.b();
        } else {
            sVar = null;
        }
        if (sVar == null) {
            return null;
        }
        if (!AbstractC3557B.K(sVar.f21250a, zVar2.f21336a.f21250a) && !wVar.f21310n0) {
            return null;
        }
        y b13 = zVar2.b();
        if (U3.f.i0(str)) {
            boolean K10 = AbstractC3557B.K(str, "PROPFIND");
            int i11 = d10.f21133i0;
            if (K10 || i11 == 308 || i11 == 307) {
                z10 = true;
            }
            if ((!AbstractC3557B.K(str, "PROPFIND")) && i11 != 308 && i11 != 307) {
                b13.e("GET", null);
            } else {
                if (z10) {
                    b10 = zVar2.f21339d;
                }
                b13.e(str, b10);
            }
            if (!z10) {
                b13.f("Transfer-Encoding");
                b13.f(SIPHeaderNames.CONTENT_LENGTH);
                b13.f(SIPHeaderNames.CONTENT_TYPE);
            }
        }
        if (!Xh.b.a(zVar2.f21336a, sVar)) {
            b13.f(SIPHeaderNames.AUTHORIZATION);
        }
        b13.f21331a = sVar;
        return b13.b();
    }

    public final boolean c(IOException iOException, j jVar, z zVar, boolean z10) {
        p pVar;
        m mVar;
        B b10;
        if (!this.f26033a.f21307k0) {
            return false;
        }
        if ((z10 && (((b10 = zVar.f21339d) != null && (b10 instanceof ke.s)) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z10))) {
            return false;
        }
        ai.f fVar = jVar.f24263n0;
        AbstractC3557B.Z(fVar);
        int i10 = fVar.f24246g;
        if (i10 != 0 || fVar.f24247h != 0 || fVar.f24248i != 0) {
            if (fVar.f24249j == null) {
                G g10 = null;
                if (i10 <= 1 && fVar.f24247h <= 1 && fVar.f24248i <= 0 && (mVar = fVar.f24242c.f24264o0) != null) {
                    synchronized (mVar) {
                        if (mVar.f24288l == 0) {
                            if (Xh.b.a(mVar.f24278b.f21148a.f21166i, fVar.f24241b.f21166i)) {
                                g10 = mVar.f24278b;
                            }
                        }
                    }
                }
                if (g10 != null) {
                    fVar.f24249j = g10;
                } else {
                    C4528h c4528h = fVar.f24244e;
                    if ((c4528h == null || !c4528h.n()) && (pVar = fVar.f24245f) != null && !pVar.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
