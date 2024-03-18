package u4;

import Lg.n;
import Wh.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import kf.t;
import q1.AbstractC5260f;
import r4.C5364a;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config[] f46388a;

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f46389b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f46390c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f46388a = configArr;
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f46389b = config;
        f46390c = new q((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !n.n2(str)) {
            String T22 = n.T2(n.T2(str, '#'), '?');
            return mimeTypeMap.getMimeTypeFromExtension(n.P2('.', n.P2('/', T22, T22), ""));
        }
        return null;
    }

    public static final File c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null".toString());
    }

    public static final boolean d(Uri uri) {
        if (AbstractC3557B.K(uri.getScheme(), "file") && AbstractC3557B.K((String) t.h2(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int e(AbstractC5260f abstractC5260f, r4.g gVar) {
        if (abstractC5260f instanceof C5364a) {
            return ((C5364a) abstractC5260f).f44429h;
        }
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Integer.MAX_VALUE;
            }
            throw new RuntimeException();
        }
        return Integer.MIN_VALUE;
    }
}
