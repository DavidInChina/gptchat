package ai;

import G0.C0588q;
import Wh.C1663h;
import Wh.C1664i;
import Wh.C1665j;
import id.AbstractC3557B;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kf.q;
import mf.C4648a;

/* renamed from: ai.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2006b {

    /* renamed from: a  reason: collision with root package name */
    public final List f24218a;

    /* renamed from: b  reason: collision with root package name */
    public int f24219b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24220c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24221d;

    public C2006b(List list) {
        AbstractC3557B.c0("connectionSpecs", list);
        this.f24218a = list;
    }

    public final C1665j a(SSLSocket sSLSocket) {
        C1665j c1665j;
        int i10;
        boolean z10;
        String[] strArr;
        String[] strArr2;
        int i11 = this.f24219b;
        List list = this.f24218a;
        int size = list.size();
        while (true) {
            if (i11 < size) {
                c1665j = (C1665j) list.get(i11);
                if (c1665j.b(sSLSocket)) {
                    this.f24219b = i11 + 1;
                    break;
                }
                i11++;
            } else {
                c1665j = null;
                break;
            }
        }
        if (c1665j != null) {
            int i12 = this.f24219b;
            int size2 = list.size();
            while (true) {
                i10 = 0;
                if (i12 < size2) {
                    if (((C1665j) list.get(i12)).b(sSLSocket)) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.f24220c = z10;
            boolean z11 = this.f24221d;
            String[] strArr3 = c1665j.f21217c;
            if (strArr3 != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                AbstractC3557B.b0("sslSocket.enabledCipherSuites", enabledCipherSuites);
                strArr = Xh.b.p(enabledCipherSuites, strArr3, C1663h.f21189c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr4 = c1665j.f21218d;
            if (strArr4 != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                AbstractC3557B.b0("sslSocket.enabledProtocols", enabledProtocols);
                strArr2 = Xh.b.p(enabledProtocols, strArr4, C4648a.f39277Y);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            AbstractC3557B.b0("supportedCipherSuites", supportedCipherSuites);
            C0588q c0588q = C1663h.f21189c;
            byte[] bArr = Xh.b.f21996a;
            int length = supportedCipherSuites.length;
            while (true) {
                if (i10 < length) {
                    if (c0588q.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (z11 && i10 != -1) {
                AbstractC3557B.b0("cipherSuitesIntersection", strArr);
                String str = supportedCipherSuites[i10];
                AbstractC3557B.b0("supportedCipherSuites[indexOfFallbackScsv]", str);
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
                strArr = (String[]) copyOf;
                strArr[q.l3(strArr)] = str;
            }
            C1664i c1664i = new C1664i(c1665j);
            AbstractC3557B.b0("cipherSuitesIntersection", strArr);
            c1664i.c((String[]) Arrays.copyOf(strArr, strArr.length));
            AbstractC3557B.b0("tlsVersionsIntersection", strArr2);
            c1664i.f((String[]) Arrays.copyOf(strArr2, strArr2.length));
            C1665j a5 = c1664i.a();
            if (a5.c() != null) {
                sSLSocket.setEnabledProtocols(a5.f21218d);
            }
            if (a5.a() != null) {
                sSLSocket.setEnabledCipherSuites(a5.f21217c);
            }
            return c1665j;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f24221d);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        AbstractC3557B.Z(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        AbstractC3557B.b0("toString(this)", arrays);
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }
}
