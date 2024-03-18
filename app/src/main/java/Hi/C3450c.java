package hi;

import K4.J;
import Lg.n;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import k6.AbstractC4194d;
import kf.v;
import y.AbstractC6463a;

/* renamed from: hi.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3450c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final C3450c f32390a = new Object();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        v vVar = v.f37483Y;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return vVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC3557B.K(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return vVar;
        }
    }

    public static boolean b(String str) {
        int i10;
        char c10;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j6 = 0;
                int i11 = 0;
                while (i11 < length2) {
                    char charAt = str.charAt(i11);
                    if (charAt < '\u0080') {
                        j6++;
                    } else {
                        if (charAt < '\u0800') {
                            i10 = 2;
                        } else if (charAt >= '\ud800' && charAt <= '\udfff') {
                            int i12 = i11 + 1;
                            if (i12 < length2) {
                                c10 = str.charAt(i12);
                            } else {
                                c10 = 0;
                            }
                            if (charAt <= '\udbff' && c10 >= '\udc00' && c10 <= '\udfff') {
                                j6 += 4;
                                i11 += 2;
                            } else {
                                j6++;
                                i11 = i12;
                            }
                        } else {
                            i10 = 3;
                        }
                        j6 += i10;
                    }
                    i11++;
                }
                if (length != ((int) j6)) {
                    return false;
                }
                return true;
            }
            StringBuilder q10 = android.gov.nist.core.a.q("endIndex > string.length: ", length2, " > ");
            q10.append(str.length());
            throw new IllegalArgumentException(q10.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC4194d.v("endIndex < beginIndex: ", length2, " < 0").toString());
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        String str2;
        int length;
        AbstractC3557B.c0("host", str);
        byte[] bArr = Xh.b.f21996a;
        if (Xh.b.f22001f.b(str)) {
            String h02 = J.h0(str);
            List<String> a5 = a(x509Certificate, 7);
            if (!a5.isEmpty()) {
                for (String str3 : a5) {
                    if (AbstractC3557B.K(h02, J.h0(str3))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                str = AbstractC6463a.j("US", locale, str, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a10 = a(x509Certificate, 2);
            if (!a10.isEmpty()) {
                for (String str4 : a10) {
                    if (str.length() != 0 && !n.I2(str, Separators.DOT, false) && !n.c2(str, "..", false) && str4 != null && str4.length() != 0 && !n.I2(str4, Separators.DOT, false) && !n.c2(str4, "..", false)) {
                        if (!n.c2(str, Separators.DOT, false)) {
                            str2 = str.concat(Separators.DOT);
                        } else {
                            str2 = str;
                        }
                        if (!n.c2(str4, Separators.DOT, false)) {
                            str4 = str4.concat(Separators.DOT);
                        }
                        if (b(str4)) {
                            Locale locale2 = Locale.US;
                            str4 = AbstractC6463a.j("US", locale2, str4, locale2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!n.Z1(str4, Separators.STAR, false)) {
                            if (AbstractC3557B.K(str2, str4)) {
                                return true;
                            }
                        } else if (n.I2(str4, "*.", false) && n.k2(str4, '*', 1, false, 4) == -1 && str2.length() >= str4.length() && !AbstractC3557B.K("*.", str4)) {
                            String substring = str4.substring(1);
                            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                            if (n.c2(str2, substring, false) && ((length = str2.length() - substring.length()) <= 0 || n.o2(str2, '.', length - 1, 4) == -1)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        AbstractC3557B.c0("host", str);
        AbstractC3557B.c0(ParameterNames.SESSION, sSLSession);
        if (b(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
            } catch (SSLException unused) {
                return false;
            }
        }
        return c(str, (X509Certificate) certificate);
    }
}
