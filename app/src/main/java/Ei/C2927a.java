package ei;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fi.n;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jh.H1;
import kf.q;

/* renamed from: ei.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2927a extends m {

    /* renamed from: d  reason: collision with root package name */
    public static final H1 f29482d = new H1(27, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f29483e;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f29484c;

    static {
        boolean z10 = false;
        if (l.h() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        f29483e = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2927a() {
        Object obj;
        fi.l lVar;
        fi.l lVar2;
        n[] nVarArr = new n[4];
        if (l.h() && Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        nVarArr[0] = obj;
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
        this.f29484c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC3557B.c0("protocols", list);
        Iterator it = this.f29484c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f29484c.iterator();
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
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        AbstractC3557B.c0("hostname", str);
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
