package p1;

import Ng.H;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o1.K;
import o1.M;
import r1.AbstractC5356c;
import r1.p;

/* renamed from: p1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5042g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f41723a = new Object();

    public static int a(Context context, String str) {
        if (str != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                M m10 = new M(context);
                if (i10 >= 24) {
                    if (K.a(m10.f40446a)) {
                        return 0;
                    }
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String packageName = context.getApplicationContext().getPackageName();
                    int i11 = applicationInfo.uid;
                    try {
                        Class<?> cls = Class.forName(AppOpsManager.class.getName());
                        Class<?> cls2 = Integer.TYPE;
                        Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                        Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                        num.getClass();
                        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i11), packageName)).intValue() == 0) {
                            return 0;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                        return 0;
                    }
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r5.f44297c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        r1.k kVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        r1.l lVar = new r1.l(resources, theme);
        synchronized (p.f44308c) {
            try {
                SparseArray sparseArray = (SparseArray) p.f44307b.get(lVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (kVar = (r1.k) sparseArray.get(i10)) != null) {
                    if (kVar.f44296b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (kVar.f44297c != 0) {
                            }
                            colorStateList2 = kVar.f44295a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i10);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 == null) {
            ThreadLocal threadLocal = p.f44306a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            resources.getValue(i10, typedValue, true);
            int i11 = typedValue.type;
            if (i11 < 28 || i11 > 31) {
                try {
                    colorStateList = AbstractC5356c.a(resources, resources.getXml(i10), theme);
                } catch (Exception e10) {
                    AbstractC3612c.s("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
                }
            }
            if (colorStateList != null) {
                p.a(lVar, i10, colorStateList, theme);
                return colorStateList;
            }
            return r1.j.b(resources, i10, theme);
        }
        return colorStateList2;
    }

    public static String c(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (H.n(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(android.gov.nist.core.a.A("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        int i11 = i10 & 2;
        if (i11 == 0 && (i10 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            AbstractC5041f.a(context, broadcastReceiver, intentFilter, null, null, i10);
        } else if (i12 >= 26) {
            AbstractC5040e.a(context, broadcastReceiver, intentFilter, null, null, i10);
        } else if ((i10 & 4) != 0) {
            context.registerReceiver(broadcastReceiver, intentFilter, c(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
