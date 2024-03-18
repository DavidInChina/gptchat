package hi;

import id.AbstractC3557B;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: hi.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3449b implements AbstractC3451d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f32389a;

    public C3449b(X509Certificate... x509CertificateArr) {
        AbstractC3557B.c0("caCerts", x509CertificateArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            AbstractC3557B.b0("caCert.subjectX500Principal", subjectX500Principal);
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f32389a = linkedHashMap;
    }

    @Override // hi.AbstractC3451d
    public final X509Certificate a(X509Certificate x509Certificate) {
        Set set = (Set) this.f32389a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof C3449b) || !AbstractC3557B.K(((C3449b) obj).f32389a, this.f32389a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32389a.hashCode();
    }
}
