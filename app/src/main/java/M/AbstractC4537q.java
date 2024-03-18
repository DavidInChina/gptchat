package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import w.C6055b;
import w.C6060g;

/* renamed from: m.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4537q {

    /* renamed from: Y  reason: collision with root package name */
    public static final ExecutorC4518O f38780Y = new ExecutorC4518O(new ExecutorC4519P(0));

    /* renamed from: Z  reason: collision with root package name */
    public static int f38781Z = -100;

    /* renamed from: h0  reason: collision with root package name */
    public static y1.k f38782h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public static y1.k f38783i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public static Boolean f38784j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public static boolean f38785k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public static final C6060g f38786l0 = new C6060g(0);

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f38787m0 = new Object();

    /* renamed from: n0  reason: collision with root package name */
    public static final Object f38788n0 = new Object();

    public static boolean b(Context context) {
        int i10;
        if (f38784j0 == null) {
            try {
                int i11 = AbstractServiceC4516M.f38678Y;
                if (Build.VERSION.SDK_INT >= 24) {
                    i10 = AbstractC4515L.a() | 128;
                } else {
                    i10 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, AbstractServiceC4516M.class), i10).metaData;
                if (bundle != null) {
                    f38784j0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f38784j0 = Boolean.FALSE;
            }
        }
        return f38784j0.booleanValue();
    }

    public static void e(AbstractC4537q abstractC4537q) {
        synchronized (f38787m0) {
            try {
                C6060g c6060g = f38786l0;
                c6060g.getClass();
                C6055b c6055b = new C6055b(c6060g);
                while (c6055b.hasNext()) {
                    AbstractC4537q abstractC4537q2 = (AbstractC4537q) ((WeakReference) c6055b.next()).get();
                    if (abstractC4537q2 == abstractC4537q || abstractC4537q2 == null) {
                        c6055b.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void k(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f38781Z != i10) {
            f38781Z = i10;
            synchronized (f38787m0) {
                try {
                    C6060g c6060g = f38786l0;
                    c6060g.getClass();
                    C6055b c6055b = new C6055b(c6060g);
                    while (c6055b.hasNext()) {
                        AbstractC4537q abstractC4537q = (AbstractC4537q) ((WeakReference) c6055b.next()).get();
                        if (abstractC4537q != null) {
                            ((LayoutInflater$Factory2C4511H) abstractC4537q).m(true, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i10);

    public abstract void g(int i10);

    public abstract void h(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
