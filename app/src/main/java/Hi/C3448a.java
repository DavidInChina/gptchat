package hi;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import id.AbstractC3557B;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: hi.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3448a extends A7.b {

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC3451d f32388m;

    public C3448a(AbstractC3451d abstractC3451d) {
        AbstractC3557B.c0("trustRootIndex", abstractC3451d);
        this.f32388m = abstractC3451d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3448a) && AbstractC3557B.K(((C3448a) obj).f32388m, this.f32388m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32388m.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    @Override // A7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List n0(String str, List list) {
        AbstractC3557B.c0(ReferencesHeader.CHAIN, list);
        AbstractC3557B.c0("hostname", str);
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        AbstractC3557B.b0("queue.removeFirst()", removeFirst);
        arrayList.add(removeFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a5 = this.f32388m.a(x509Certificate);
            if (a5 != null) {
                if (arrayList.size() > 1 || !AbstractC3557B.K(x509Certificate, a5)) {
                    arrayList.add(a5);
                }
                if (AbstractC3557B.K(a5.getIssuerDN(), a5.getSubjectDN())) {
                    try {
                        a5.verify(a5.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                        z10 = true;
                    }
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                AbstractC3557B.b0("queue.iterator()", it);
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.X509Certificate", next);
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC3557B.K(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused2) {
                        }
                    }
                    while (it.hasNext()) {
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
