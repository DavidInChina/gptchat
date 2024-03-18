package u3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import e1.AbstractC2767g;
import e1.C2768h;
import java.io.File;
import java.io.IOException;
import p2.j0;

/* renamed from: u3.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5836i {

    /* renamed from: a  reason: collision with root package name */
    public static final C2768h f46375a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f46376b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static j0 f46377c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC5834g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p2.j0, java.lang.Object] */
    public static j0 b(int i10, boolean z10, boolean z11) {
        ?? obj = new Object();
        obj.f42081a = i10;
        obj.f42083c = z11;
        obj.f42082b = z10;
        f46377c = obj;
        C2768h c2768h = f46375a;
        c2768h.getClass();
        if (AbstractC2767g.f28737k0.i(c2768h, null, obj)) {
            AbstractC2767g.c(c2768h);
        }
        return f46377c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:20|(1:25)(1:24)|26|(1:31)(1:30)|84|32|33|(2:82|35)(1:40)|41|(8:48|(1:56)|(1:63)|64|(2:86|68)|70|71|72)|(1:52)|(1:56)|(3:58|61|63)|64|(1:66)|86|68|70|71|72) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ce, code lost:
        r3 = 196608;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        C5835h a5;
        C5835h c5835h;
        int i10;
        if (!z10 && f46377c != null) {
            return;
        }
        synchronized (f46376b) {
            if (!z10) {
                try {
                    if (f46377c != null) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            int i12 = 0;
            if (i11 >= 28 && i11 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                if (file.exists() && length > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                if (file2.exists() && length2 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                try {
                    long a10 = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            a5 = C5835h.a(file3);
                        } catch (IOException unused) {
                            b(131072, z11, z12);
                            return;
                        }
                    } else {
                        a5 = null;
                    }
                    if (a5 != null && a5.f46373c == a10 && (i10 = a5.f46372b) != 2) {
                        i12 = i10;
                        if (z10 && z12 && i12 != 1) {
                            i12 = 2;
                        }
                        if (a5 != null && a5.f46372b == 2 && i12 == 1 && length < a5.f46374d) {
                            i12 = 3;
                        }
                        c5835h = new C5835h(1, i12, a10, length2);
                        if (a5 != null || !a5.equals(c5835h)) {
                            c5835h.b(file3);
                        }
                        b(i12, z11, z12);
                        return;
                    }
                    if (z12) {
                        i12 = 2;
                    }
                    if (z10) {
                        i12 = 2;
                    }
                    if (a5 != null) {
                        i12 = 3;
                    }
                    c5835h = new C5835h(1, i12, a10, length2);
                    if (a5 != null) {
                    }
                    c5835h.b(file3);
                    b(i12, z11, z12);
                    return;
                } catch (PackageManager.NameNotFoundException unused2) {
                    b(65536, z11, z12);
                    return;
                }
            }
            b(262144, false, false);
        }
    }
}
