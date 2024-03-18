package y1;

import android.os.Trace;

/* loaded from: classes2.dex */
public abstract class p {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
