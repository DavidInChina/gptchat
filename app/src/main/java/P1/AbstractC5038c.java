package p1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: p1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5038c {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
