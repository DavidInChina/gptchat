package o1;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: o1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4894i {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f40458a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f40459b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f40460c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f40461d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f40462e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f40463f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f40464g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(22:2|35|3|5|33|6|8|31|9|11|(12:41|14|15|(6:39|18|19|(3:37|24|25)|26|27)|17|19|(1:21)|37|24|25|26|27)|13|15|(0)|17|19|(0)|37|24|25|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method declaredMethod2;
        Class cls3;
        int i10;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f40458a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f40459b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f40460c = field2;
        Class cls4 = f40458a;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            f40461d = declaredMethod;
            cls2 = f40458a;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                f40462e = declaredMethod2;
                cls3 = f40458a;
                i10 = Build.VERSION.SDK_INT;
                if ((i10 != 26 || i10 == 27) && cls3 != null) {
                    Class<?> cls5 = Boolean.TYPE;
                    Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                    declaredMethod3.setAccessible(true);
                    method = declaredMethod3;
                }
                f40463f = method;
            }
            declaredMethod2 = null;
            f40462e = declaredMethod2;
            cls3 = f40458a;
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 26) {
            }
            Class<?> cls52 = Boolean.TYPE;
            Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls52, Configuration.class, Configuration.class, cls52, cls52);
            declaredMethod32.setAccessible(true);
            method = declaredMethod32;
            f40463f = method;
        }
        declaredMethod = null;
        f40461d = declaredMethod;
        cls2 = f40458a;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        f40462e = declaredMethod2;
        cls3 = f40458a;
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
        }
        Class<?> cls522 = Boolean.TYPE;
        Method declaredMethod322 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls522, Configuration.class, Configuration.class, cls522, cls522);
        declaredMethod322.setAccessible(true);
        method = declaredMethod322;
        f40463f = method;
    }
}
