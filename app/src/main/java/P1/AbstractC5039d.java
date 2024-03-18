package p1;

import android.content.Context;

/* renamed from: p1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5039d {
    public static int a(Context context, int i10) {
        return context.getColor(i10);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
