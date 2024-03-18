package I4;

import io.sentry.android.core.AbstractC3612c;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8035a = new Object();

    public static void a(String str) {
        f8035a.getClass();
        HashSet hashSet = a.f8034a;
        if (!hashSet.contains(str)) {
            AbstractC3612c.s("LOTTIE", str, null);
            hashSet.add(str);
        }
    }

    public static void b(String str, Throwable th2) {
        f8035a.getClass();
        HashSet hashSet = a.f8034a;
        if (!hashSet.contains(str)) {
            AbstractC3612c.s("LOTTIE", str, th2);
            hashSet.add(str);
        }
    }
}
