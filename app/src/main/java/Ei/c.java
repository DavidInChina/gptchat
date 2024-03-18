package ei;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fi.n;
import hi.AbstractC3451d;
import id.AbstractC3557B;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jh.L1;
import kf.q;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: e  reason: collision with root package name */
    public static final L1 f29487e = new L1(27, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f29488f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f29489c;

    /* renamed from: d  reason: collision with root package name */
    public final fi.i f29490d;

    static {
        boolean z10 = false;
        if (l.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f29488f = z10;
    }

    public c() {
        fi.f fVar;
        fi.l lVar;
        fi.l lVar2;
        Method method;
        Method method2;
        n[] nVarArr = new n[4];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            fVar = new fi.f(cls);
        } catch (Exception e10) {
            m.f29511a.getClass();
            m.i(5, "unable to load android socket classes", e10);
            fVar = null;
        }
        nVarArr[0] = fVar;
        nVarArr[1] = new fi.m(fi.f.f30910f);
        switch (fi.k.f30921a.f29510Y) {
            case 2:
                lVar = fi.h.f30917b;
                break;
            default:
                lVar = fi.k.f30922b;
                break;
        }
        nVarArr[2] = new fi.m(lVar);
        switch (fi.h.f30916a.f29510Y) {
            case 2:
                lVar2 = fi.h.f30917b;
                break;
            default:
                lVar2 = fi.k.f30922b;
                break;
        }
        nVarArr[3] = new fi.m(lVar2);
        ArrayList h32 = q.h3(nVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = h32.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).b()) {
                arrayList.add(next);
            }
        }
        this.f29489c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f29490d = new fi.i(method3, method, method2);
    }

    @Override // ei.m
    public final A7.b b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        fi.c cVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            cVar = new fi.c(x509TrustManager, x509TrustManagerExtensions);
        }
        if (cVar == null) {
            return super.b(x509TrustManager);
        }
        return cVar;
    }

    @Override // ei.m
    public final AbstractC3451d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C2928b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // ei.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC3557B.c0("protocols", list);
        Iterator it = this.f29489c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((n) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // ei.m
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        AbstractC3557B.c0("address", inetSocketAddress);
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    @Override // ei.m
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f29489c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((n) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar == null) {
            return null;
        }
        return nVar.c(sSLSocket);
    }

    @Override // ei.m
    public final Object g() {
        fi.i iVar = this.f29490d;
        iVar.getClass();
        Method method = iVar.f30918a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = iVar.f30919b;
            AbstractC3557B.Z(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ei.m
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        AbstractC3557B.c0("hostname", str);
        if (Build.VERSION.SDK_INT >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted;
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // ei.m
    public final void k(String str, Object obj) {
        AbstractC3557B.c0("message", str);
        fi.i iVar = this.f29490d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f30920c;
                AbstractC3557B.Z(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        m.j(this, str, 5, 4);
    }
}
