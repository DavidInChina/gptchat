package t1;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* renamed from: t1.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5660f {
    public static int a(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri d(Object obj) {
        return ((Icon) obj).getUri();
    }
}
