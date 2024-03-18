package Wh;

import id.AbstractC3557B;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import jf.C3963m;
import sb.C5605e;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final H f21235a;

    /* renamed from: b  reason: collision with root package name */
    public final C1663h f21236b;

    /* renamed from: c  reason: collision with root package name */
    public final List f21237c;

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f21238d;

    public o(H h10, C1663h c1663h, List list, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("tlsVersion", h10);
        AbstractC3557B.c0("cipherSuite", c1663h);
        AbstractC3557B.c0("localCertificates", list);
        this.f21235a = h10;
        this.f21236b = c1663h;
        this.f21237c = list;
        this.f21238d = R4.b.D1(new C5605e(abstractC6216a, 21));
    }

    public final List a() {
        return (List) this.f21238d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f21235a == this.f21235a && AbstractC3557B.K(oVar.f21236b, this.f21236b) && AbstractC3557B.K(oVar.a(), a()) && AbstractC3557B.K(oVar.f21237c, this.f21237c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f21236b.hashCode();
        int hashCode2 = a().hashCode();
        return this.f21237c.hashCode() + ((hashCode2 + ((hashCode + ((this.f21235a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        List<Certificate> a5 = a();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(a5, 10));
        for (Certificate certificate : a5) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                AbstractC3557B.b0("type", str2);
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f21235a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f21236b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f21237c;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                AbstractC3557B.b0("type", str);
            }
            arrayList2.add(str);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
