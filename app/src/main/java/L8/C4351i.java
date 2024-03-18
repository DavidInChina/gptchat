package l8;

import android.content.Context;
import java.io.File;

/* renamed from: l8.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4351i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f37883a;

    public C4351i(Context context) {
        this.f37883a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j6 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j6 += a(file2);
            }
        }
        return j6;
    }
}
