package android.gov.nist.core;

import android.gov.nist.javax.sip.header.NameMap;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.datastore.preferences.protobuf.AbstractC2031p;
import androidx.glance.appwidget.protobuf.AbstractC2055o;
import com.google.android.gms.internal.play_billing.H;
import java.util.List;
import s2.p;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static String A(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return AbstractC2055o.o2(i10) + i11 + i12 + i13;
    }

    public static /* synthetic */ String C(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "PLUGGED_WIRELESS";
            }
            return "PLUGGED_AC";
        }
        return "PLUGGED_USB";
    }

    public static /* synthetic */ String D(int i10) {
        switch (i10) {
            case 1:
                return "Charging";
            case 2:
                return "Full";
            case 3:
                return "Unknown";
            case 4:
                return "Unplugged";
            case 5:
                return "Discharging";
            case 6:
                return "Undefined";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i10) {
        switch (i10) {
            case 1:
                return "CRITICAL";
            case 2:
                return "ERROR";
            case 3:
                return "WARN";
            case 4:
                return "INFO";
            case 5:
                return "DEBUG";
            case 6:
                return "TRACE";
            case 7:
                return "EMERGENCY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 1:
                return "critical";
            case 2:
                return "error";
            case 3:
                return "warn";
            case 4:
                return ParameterNames.INFO;
            case 5:
                return "debug";
            case 6:
                return "trace";
            case 7:
                return "emergency";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String b(int i10) {
        switch (i10) {
            case 1:
                return "wifi";
            case 2:
                return "ethernet";
            case 3:
                return "cellular";
            case 4:
                return "vpn";
            case 5:
                return "bluetooth";
            case 6:
                return "other";
            case 7:
                return "";
            default:
                throw null;
        }
    }

    public static int c(int i10, int i11, int i12) {
        return H.D1(i10) + i11 + i12;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return AbstractC2031p.E(i10) + i11 + i12 + i13;
    }

    public static String e(String str, int i10) {
        return str + i10;
    }

    public static String f(String str, long j6) {
        return str + j6;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, char c10) {
        return str + str2 + c10;
    }

    public static String i(String str, String str2, Class cls, String str3, Class cls2) {
        NameMap.putNameMap(str, str2);
        NameMap.putNameMap(str3, cls.getName());
        return cls2.getName();
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, long j6, String str) {
        sb2.append(j6);
        sb2.append(str);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder p(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder q(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder r(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static /* synthetic */ void u(Object obj) {
        throw new ClassCastException();
    }

    public static void v(String str, int i10, String str2) {
        p.g(str2, str + i10);
    }

    public static void w(String str, String str2, StackLogger stackLogger) {
        stackLogger.logDebug(str + str2);
    }

    public static void x(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void y(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static int z(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }
}
