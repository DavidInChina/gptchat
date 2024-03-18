package f5;

import android.util.Log;

/* renamed from: f5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2937a {

    /* renamed from: b  reason: collision with root package name */
    public static final C2937a f29641b;

    /* renamed from: a  reason: collision with root package name */
    public int f29642a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f5.a] */
    static {
        ?? obj = new Object();
        obj.f29642a = 5;
        f29641b = obj;
    }

    public static void a(int i10, String str, String str2) {
        String concat = "ArkoseSDK:".concat(str);
        if (str2.length() > 4000) {
            int length = str2.length() / 4000;
            int i11 = 0;
            while (i11 <= length) {
                int i12 = i11 + 1;
                int i13 = i12 * 4000;
                if (i13 >= str2.length()) {
                    StringBuilder q10 = android.gov.nist.core.a.q("Part ", i11, ": ");
                    q10.append(str2.substring(i11 * 4000));
                    Log.println(i10, concat, q10.toString());
                } else {
                    StringBuilder q11 = android.gov.nist.core.a.q("Part ", i11, ": ");
                    q11.append(str2.substring(i11 * 4000, i13));
                    Log.println(i10, concat, q11.toString());
                }
                i11 = i12;
            }
            return;
        }
        Log.println(i10, concat, str2);
    }

    public static void c(String str, String str2, Throwable... thArr) {
        f29641b.b(6, str, str2, thArr);
    }

    public static void d(String str, String str2, Throwable... thArr) {
        f29641b.b(4, str, str2, thArr);
    }

    public final void b(int i10, String str, String str2, Throwable... thArr) {
        if (i10 < this.f29642a) {
            return;
        }
        if (thArr.length > 0) {
            a(i10, str, str2 + '\n' + Log.getStackTraceString(thArr[0]));
            return;
        }
        a(i10, str, str2);
    }
}
