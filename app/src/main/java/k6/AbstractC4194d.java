package k6;

import Ng.H;
import Z.r;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4320l;
import l0.C4323o;
import livekit.org.webrtc.Logging;
import oh.C5017d;
import q0.C5251c;
import r0.AbstractC5352p;
import r0.E;
import s2.p;
import u7.AbstractC5846b;
import u7.m;
import yh.l1;

/* renamed from: k6.d */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4194d {
    public static /* synthetic */ void A(AbstractC5846b abstractC5846b) {
        if (abstractC5846b == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static /* synthetic */ void B(m mVar) {
        if (mVar == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static void C(String str, String str2, String str3) {
        p.g(str3, str + str2);
    }

    public static /* synthetic */ String D(int i10) {
        switch (i10) {
            case 1:
                return "NETWORK_NOT_CONNECTED";
            case 2:
                return "NETWORK_ETHERNET";
            case 3:
                return "NETWORK_WIFI";
            case 4:
                return "NETWORK_WIMAX";
            case 5:
                return "NETWORK_BLUETOOTH";
            case 6:
                return "NETWORK_2G";
            case 7:
                return "NETWORK_3G";
            case 8:
                return "NETWORK_4G";
            case 9:
                return "NETWORK_5G";
            case 10:
                return "NETWORK_MOBILE_OTHER";
            case 11:
                return "NETWORK_CELLULAR";
            case 12:
                return "NETWORK_OTHER";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String E(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "BASE64_ENCODING";
                    }
                    throw null;
                }
                return "URI_ENCODING";
            }
            return "DQUOTES";
        }
        return "RAW";
    }

    public static /* synthetic */ String F(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "BROWSER";
            case 3:
                return "REACT_NATIVE";
            case 4:
                return "FLUTTER";
            case 5:
                return "NDK";
            case 6:
                return "NDK_IL2CPP";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String G(int i10) {
        switch (i10) {
            case 1:
                return "USER_APP_LAUNCH";
            case 2:
                return "INACTIVITY_TIMEOUT";
            case 3:
                return "MAX_DURATION";
            case 4:
                return "BACKGROUND_LAUNCH";
            case 5:
                return "PREWARM";
            case 6:
                return "FROM_NON_INTERACTIVE_SESSION";
            case 7:
                return "EXPLICIT_STOP";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String H(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "EXPIRED";
            }
            return "TRACKED";
        }
        return "NOT_TRACKED";
    }

    public static /* synthetic */ String I(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "APPLICATION_LAUNCH";
                }
                return "BACKGROUND";
            }
            return "FOREGROUND";
        }
        return "NONE";
    }

    public static /* synthetic */ String J(int i10) {
        switch (i10) {
            case 1:
                return "NETWORK_NOT_CONNECTED";
            case 2:
                return "NETWORK_ETHERNET";
            case 3:
                return "NETWORK_WIFI";
            case 4:
                return "NETWORK_WIMAX";
            case 5:
                return "NETWORK_BLUETOOTH";
            case 6:
                return "NETWORK_2G";
            case 7:
                return "NETWORK_3G";
            case 8:
                return "NETWORK_4G";
            case 9:
                return "NETWORK_5G";
            case 10:
                return "NETWORK_MOBILE_OTHER";
            case 11:
                return "NETWORK_CELLULAR";
            case 12:
                return "NETWORK_OTHER";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String K(int i10) {
        switch (i10) {
            case 1:
                return "START_DEFINITION";
            case 2:
                return "LABEL";
            case 3:
                return "DESTINATION";
            case 4:
                return "START_TITLE";
            case 5:
                return "TITLE";
            case 6:
                return "PARAGRAPH";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String L(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "HIGH";
            }
            return "MEDIUM";
        }
        return "LOW";
    }

    public static /* synthetic */ String M(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "LARGE";
            }
            return "MEDIUM";
        }
        return "SMALL";
    }

    public static /* synthetic */ String N(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "RARE";
            }
            return "AVERAGE";
        }
        return "FREQUENT";
    }

    public static /* synthetic */ String O(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "BASE64_ENCODING";
                }
                return "URI_ENCODING";
            }
            return "DQUOTES";
        }
        return "RAW";
    }

    public static void P(C5017d c5017d, float f6, long j6, long j10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            j6 = C5251c.f43619b;
        }
        if ((i10 & 8) != 0) {
            j10 = C5251c.f43619b;
        }
        c5017d.f41409a.f41410a.h(Float.valueOf(f6), new C5251c(j6), Float.valueOf(0.0f), new C5251c(j10));
    }

    public static /* synthetic */ int Q(String str) {
        if (str != null) {
            if (str.equals("RAW")) {
                return 1;
            }
            if (str.equals("DQUOTES")) {
                return 2;
            }
            if (str.equals("URI_ENCODING")) {
                return 3;
            }
            if (str.equals("BASE64_ENCODING")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant io.ktor.http.CookieEncoding.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static AbstractC4326r a(AbstractC4326r abstractC4326r, AbstractC4326r abstractC4326r2) {
        if (abstractC4326r2 != C4323o.f37719b) {
            return new C4320l(abstractC4326r, abstractC4326r2);
        }
        return abstractC4326r;
    }

    public static final boolean b(int i10) {
        if (i10 == 3) {
            return true;
        }
        return false;
    }

    public static int c(l1 l1Var) {
        if (l1Var.H(Boolean.TYPE)) {
            return 1;
        }
        if (l1Var.H(Byte.TYPE)) {
            return 2;
        }
        if (l1Var.H(Short.TYPE)) {
            return 3;
        }
        if (l1Var.H(Character.TYPE)) {
            return 4;
        }
        if (l1Var.H(Integer.TYPE)) {
            return 5;
        }
        if (l1Var.H(Long.TYPE)) {
            return 6;
        }
        if (l1Var.H(Float.TYPE)) {
            return 7;
        }
        if (l1Var.H(Double.TYPE)) {
            return 8;
        }
        if (l1Var.H(String.class)) {
            return 9;
        }
        if (l1Var.H(Class.class)) {
            return 10;
        }
        if (l1Var.q0()) {
            return 11;
        }
        if (l1Var.M0()) {
            return 12;
        }
        if (l1Var.T0()) {
            return 13;
        }
        return 14;
    }

    public static void d(p0.f fVar) {
        ((p0.g) fVar).a(false, true);
    }

    public static void e(AbstractC5352p abstractC5352p, E e10) {
        abstractC5352p.g(e10, 1);
    }

    public static /* synthetic */ String f(int i10) {
        switch (i10) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "EXPIRED";
                }
                throw null;
            }
            return "TRACKED";
        }
        return "NOT_TRACKED";
    }

    public static /* synthetic */ String h(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "APPLICATION_LAUNCH";
                    }
                    throw null;
                }
                return "BACKGROUND";
            }
            return "FOREGROUND";
        }
        return "NONE";
    }

    public static /* synthetic */ long i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return 5000L;
                }
                throw null;
            }
            return 2000L;
        }
        return 500L;
    }

    public static /* synthetic */ boolean j(int i10) {
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        if (i10 == 4 || i10 == 5) {
            return false;
        }
        throw null;
    }

    public static long k(w2.p pVar) {
        byte[] bArr = (byte[]) pVar.f47715b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static /* synthetic */ boolean l(int i10) {
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean m(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return true;
        }
        if (i10 == 5) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ String n(int i10) {
        switch (i10) {
            case 1:
                return "network_not_connected";
            case 2:
                return "network_ethernet";
            case 3:
                return "network_wifi";
            case 4:
                return "network_wimax";
            case 5:
                return "network_bluetooth";
            case 6:
                return "network_2G";
            case 7:
                return "network_3G";
            case 8:
                return "network_4G";
            case 9:
                return "network_5G";
            case 10:
                return "network_mobile_other";
            case 11:
                return "network_cellular";
            case 12:
                return "network_other";
            default:
                throw null;
        }
    }

    public static /* synthetic */ long o(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return 4L;
                        }
                        throw null;
                    }
                    return 3L;
                }
                return 2L;
            }
            return 1L;
        }
        return 0L;
    }

    public static /* synthetic */ int p(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return 100;
            }
            throw null;
        }
        return 10;
    }

    public static /* synthetic */ int q(int i10) {
        switch (i10) {
            case 1:
                return 90;
            case 2:
                return 66;
            case 3:
                return 83;
            case 4:
                return 67;
            case 5:
                return 73;
            case 6:
                return 74;
            case 7:
                return 70;
            case 8:
                return 68;
            case 9:
                return 115;
            case 10:
                return 99;
            case 11:
                return 101;
            case 12:
                return 64;
            case 13:
                return 91;
            case 14:
                return 0;
            default:
                throw null;
        }
    }

    public static /* synthetic */ long r(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return 35000L;
                }
                throw null;
            }
            return 10000L;
        }
        return 3000L;
    }

    public static int s(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    public static int t(l1 l1Var, int i10, int i11) {
        return (l1Var.hashCode() + i10) * i11;
    }

    public static String u(r rVar, int i10, int i11, r rVar2, boolean z10) {
        rVar.W(i10);
        String v10 = H.v(i11, rVar2);
        rVar.t(z10);
        return v10;
    }

    public static String v(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String w(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    public static void x(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
    }

    public static void y(String str, int i10, String str2) {
        Logging.d(str2, str + i10);
    }

    public static void z(String str, String str2, String str3) {
        Logging.d(str3, str + str2);
    }
}
