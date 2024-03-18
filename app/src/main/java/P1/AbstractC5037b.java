package p1;

import android.content.Context;
import java.io.File;

/* renamed from: p1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5037b {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File[] c(Context context) {
        return context.getObbDirs();
    }
}
