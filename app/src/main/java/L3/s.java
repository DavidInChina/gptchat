package L3;

import android.util.Log;
import io.sentry.android.core.AbstractC3612c;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10729b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile s f10730c;

    /* renamed from: a  reason: collision with root package name */
    public final int f10731a;

    public s(int i10) {
        this.f10731a = i10;
    }

    public static s d() {
        s sVar;
        synchronized (f10729b) {
            try {
                if (f10730c == null) {
                    f10730c = new s(3);
                }
                sVar = f10730c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f10731a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f10731a <= 6) {
            AbstractC3612c.c(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th2) {
        if (this.f10731a <= 6) {
            AbstractC3612c.d(str, str2, th2);
        }
    }

    public final void e(String str, String str2) {
        if (this.f10731a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f10731a <= 5) {
            AbstractC3612c.r(str, str2);
        }
    }
}
