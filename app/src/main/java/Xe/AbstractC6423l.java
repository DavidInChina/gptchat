package xe;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import e4.C2799g;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import z.AbstractC6708l;

/* renamed from: xe.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6423l {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f49939a = R4.b.X1("max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc");

    /* renamed from: b  reason: collision with root package name */
    public static final Lg.i f49940b = new Lg.i("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    /* renamed from: c  reason: collision with root package name */
    public static final Set f49941c = R4.b.X1(';', ',', '\"');

    public static final void a(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (e(str.charAt(i10))) {
                throw new IllegalArgumentException("Cookie name is not valid: ".concat(str));
            }
        }
    }

    public static final String b(String str, int i10) {
        AbstractC3557B.c0("value", str);
        AbstractC2469q0.q("encoding", i10);
        int f6 = AbstractC6708l.f(i10);
        int i11 = 0;
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 != 2) {
                    if (f6 == 3) {
                        return Fe.c.b(str);
                    }
                    throw new RuntimeException();
                }
                return AbstractC6412a.f(str, true);
            } else if (!Lg.n.a2(str, '\"')) {
                while (i11 < str.length()) {
                    if (e(str.charAt(i11))) {
                        return android.gov.nist.core.a.h(Separators.DOUBLE_QUOTE, str, '\"');
                    }
                    i11++;
                }
                return str;
            } else {
                throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
            }
        }
        while (i11 < str.length()) {
            if (!e(str.charAt(i11))) {
                i11++;
            } else {
                throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in RAW format.  Consider URL_ENCODING mode");
            }
        }
        return str;
    }

    public static final Map c(String str, boolean z10) {
        AbstractC3557B.c0("cookiesHeader", str);
        Lg.i iVar = f49940b;
        iVar.getClass();
        if (str.length() >= 0) {
            return AbstractC4268D.j1(Kg.m.n1(Kg.m.h1(Kg.m.n1(new Kg.j(new C2799g(0, 2, iVar, str), Lg.h.f11152Y), C6421j.f49914k0), new J.c(12, z10)), C6421j.f49915l0));
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    public static final C6419h d(String str) {
        int i10;
        CharSequence charSequence;
        CharSequence charSequence2;
        He.b bVar;
        int Q;
        AbstractC3557B.c0("cookiesHeader", str);
        int i11 = 0;
        Map c10 = c(str, false);
        for (Map.Entry entry : c10.entrySet()) {
            if (!Lg.n.I2((String) entry.getKey(), "$", false)) {
                String str2 = (String) c10.get("$x-enc");
                if (str2 != null && (Q = AbstractC4194d.Q(str2)) != 0) {
                    i10 = Q;
                } else {
                    i10 = 1;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(c10.size()));
                for (Map.Entry entry2 : c10.entrySet()) {
                    linkedHashMap.put(Df.H.A0((String) entry2.getKey()), entry2.getValue());
                }
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                AbstractC3557B.c0("encodedValue", str4);
                int f6 = AbstractC6708l.f(i10);
                if (f6 != 0 && f6 != 1) {
                    if (f6 != 2) {
                        if (f6 == 3) {
                            str4 = Fe.c.a(str4);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        str4 = AbstractC6412a.e(str4, 0, 0, true, 11);
                    }
                } else {
                    int length = str4.length();
                    int i12 = 0;
                    while (true) {
                        charSequence = "";
                        if (i12 < length) {
                            if (!K4.J.I(str4.charAt(i12))) {
                                charSequence2 = str4.subSequence(i12, str4.length());
                                break;
                            }
                            i12++;
                        } else {
                            charSequence2 = charSequence;
                            break;
                        }
                    }
                    if (Lg.n.I2(charSequence2.toString(), Separators.DOUBLE_QUOTE, false)) {
                        int length2 = str4.length() - 1;
                        if (length2 >= 0) {
                            while (true) {
                                int i13 = length2 - 1;
                                if (!K4.J.I(str4.charAt(length2))) {
                                    charSequence = str4.subSequence(0, length2 + 1);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    length2 = i13;
                                }
                            }
                        }
                        if (Lg.n.c2(charSequence.toString(), Separators.DOUBLE_QUOTE, false)) {
                            str4 = Lg.n.x2(Lg.n.U2(str4).toString());
                        }
                    }
                }
                String str5 = str4;
                String str6 = (String) linkedHashMap.get("max-age");
                if (str6 != null) {
                    i11 = (int) com.google.android.gms.internal.play_billing.N.q(Long.parseLong(str6), 0L, 2147483647L);
                }
                int i14 = i11;
                String str7 = (String) linkedHashMap.get("expires");
                if (str7 != null) {
                    List list = AbstractC6424m.f49942a;
                    String obj = Lg.n.U2(str7).toString();
                    try {
                        bVar = C6431t.n(obj);
                    } catch (C6399D unused) {
                        AbstractC3557B.c0("<this>", obj);
                        String obj2 = Lg.n.U2(obj).toString();
                        for (String str8 : AbstractC6424m.f49942a) {
                            try {
                                bVar = new He.c(str8).b(obj);
                            } catch (He.d unused2) {
                            }
                        }
                        throw new IllegalStateException(("Failed to parse date: " + obj2).toString());
                    }
                } else {
                    bVar = null;
                }
                He.b bVar2 = bVar;
                String str9 = (String) linkedHashMap.get("domain");
                String str10 = (String) linkedHashMap.get("path");
                boolean containsKey = linkedHashMap.containsKey("secure");
                boolean containsKey2 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry3 : c10.entrySet()) {
                    String str11 = (String) entry3.getKey();
                    if (!f49939a.contains(Df.H.A0(str11)) && !AbstractC3557B.K(str11, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new C6419h(str3, str5, i10, i14, bVar2, str9, str10, containsKey, containsKey2, linkedHashMap2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean e(char c10) {
        if (!K4.J.I(c10) && AbstractC3557B.e0(c10, 32) >= 0) {
            if (!f49941c.contains(Character.valueOf(c10))) {
                return false;
            }
        }
        return true;
    }
}
