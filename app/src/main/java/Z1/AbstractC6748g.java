package z1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.C4528h;
import q.r;
import s1.AbstractC5528j;
import w.C6049A;
import w.C6068o;

/* renamed from: z1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6748g {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f51450b;

    /* renamed from: a  reason: collision with root package name */
    public static final C6068o f51449a = new C6068o(16);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f51451c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final C6049A f51452d = new C6049A(0);

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, z1.j, java.util.concurrent.ThreadFactory] */
    static {
        ?? obj = new Object();
        obj.f51459a = "fonts-androidx";
        obj.f51460b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) ErrorBoundaryKt.SAMPLING_RATE, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f51450b = threadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6747f a(String str, Context context, r rVar, int i10) {
        C6068o c6068o = f51449a;
        Typeface typeface = (Typeface) c6068o.b(str);
        if (typeface != null) {
            return new C6747f(typeface);
        }
        try {
            C4528h a5 = AbstractC6744c.a(context, rVar);
            int i11 = a5.f38769Y;
            int i12 = 1;
            if (i11 != 0) {
                if (i11 == 1) {
                    i12 = -2;
                    if (i12 != 0) {
                        return new C6747f(i12);
                    }
                    Typeface G10 = AbstractC5528j.f45113a.G(context, (C6749h[]) a5.f38770Z, i10);
                    if (G10 != null) {
                        c6068o.c(str, G10);
                        return new C6747f(G10);
                    }
                    return new C6747f(-3);
                }
                i12 = -3;
                if (i12 != 0) {
                }
            } else {
                C6749h[] c6749hArr = (C6749h[]) a5.f38770Z;
                if (c6749hArr != null && c6749hArr.length != 0) {
                    int length = c6749hArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            int i14 = c6749hArr[i13].f51457e;
                            if (i14 != 0) {
                                if (i14 >= 0) {
                                    i12 = i14;
                                }
                            } else {
                                i13++;
                            }
                        } else {
                            i12 = 0;
                            break;
                        }
                    }
                }
                if (i12 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new C6747f(-1);
        }
    }
}
