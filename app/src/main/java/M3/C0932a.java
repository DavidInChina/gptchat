package M3;

import android.content.Context;
import id.AbstractC3557B;
import java.io.File;

/* renamed from: M3.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0932a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0932a f11563a = new Object();

    public final File a(Context context) {
        AbstractC3557B.c0("context", context);
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC3557B.b0("context.noBackupFilesDir", noBackupFilesDir);
        return noBackupFilesDir;
    }
}
