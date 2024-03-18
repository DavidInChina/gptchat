package s2;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.AbstractC3612c;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f45173a = new Object();

    public static String a(String str, Throwable th2) {
        String str2;
        if (th2 == null) {
            str2 = null;
        } else {
            synchronized (f45173a) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 != null) {
                        try {
                            if (th3 instanceof UnknownHostException) {
                                str2 = "UnknownHostException (no network)";
                            } else {
                                th3 = th3.getCause();
                            }
                        } finally {
                        }
                    } else {
                        str2 = Log.getStackTraceString(th2).trim().replace(Separators.HT, "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder r10 = android.gov.nist.core.a.r(str, "\n  ");
            r10.append(str2.replace(Separators.RETURN, "\n  "));
            r10.append('\n');
            return r10.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (f45173a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f45173a) {
            AbstractC3612c.c(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f45173a) {
            AbstractC3612c.c(str, a(str2, th2));
        }
    }

    public static void e(String str, Exception exc) {
        synchronized (f45173a) {
            Log.i("BundleUtil", a(str, exc));
        }
    }

    public static void f(String str, String str2) {
        synchronized (f45173a) {
            Log.i(str, a(str2, null));
        }
    }

    public static void g(String str, String str2) {
        synchronized (f45173a) {
            AbstractC3612c.r(str, a(str2, null));
        }
    }

    public static void h(String str, String str2, Throwable th2) {
        synchronized (f45173a) {
            AbstractC3612c.r(str, a(str2, th2));
        }
    }
}
