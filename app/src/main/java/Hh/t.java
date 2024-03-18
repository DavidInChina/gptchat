package hh;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import jf.C3959i;
import jf.C3963m;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class t implements AbstractC3440h {

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap f32381a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C3963m f32382b = R4.b.D1(C3437e.f32352h0);

    /* renamed from: c  reason: collision with root package name */
    public final C3963m f32383c = R4.b.D1(new q(this, 0));

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f32384d = R4.b.D1(new q(this, 1));

    /* renamed from: e  reason: collision with root package name */
    public AbstractC6216a f32385e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC6216a f32386f;

    /* renamed from: g  reason: collision with root package name */
    public final C3443k f32387g;

    public t(C3443k c3443k) {
        this.f32387g = c3443k;
    }

    public static void b(Jb.c cVar) {
        C3959i c3959i;
        Class<?> cls = Class.forName("android.util.Singleton");
        Field declaredField = cls.getDeclaredField("mInstance");
        declaredField.setAccessible(true);
        Method declaredMethod = cls.getDeclaredMethod("get", new Class[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            c3959i = new C3959i("android.app.ActivityManager", "IActivityManagerSingleton");
        } else {
            c3959i = new C3959i("android.app.ActivityManagerNative", "gDefault");
        }
        Class<?> cls2 = Class.forName((String) c3959i.f36155Y);
        Field declaredField2 = cls2.getDeclaredField((String) c3959i.f36156Z);
        declaredField2.setAccessible(true);
        Object obj = declaredField2.get(cls2);
        Object invoke = declaredMethod.invoke(obj, new Object[0]);
        Class<?> cls3 = Class.forName("android.app.IActivityManager");
        if (invoke != null) {
            declaredField.set(obj, cVar.invoke(cls3, invoke));
        } else {
            AbstractC3557B.A2();
            throw null;
        }
    }

    @Override // hh.AbstractC3440h
    public final void a() {
        boolean z10;
        ih.c.a();
        if (this.f32385e == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f32386f == null) {
                try {
                    c(new Xf.f(29, this));
                    b(new Jb.c(23, this));
                    return;
                } catch (Throwable th2) {
                    Ki.a aVar = R4.b.f15040a;
                    if (aVar != null) {
                        ((C3435c) aVar).a("Could not watch destroyed services\n" + Log.getStackTraceString(th2));
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException("ServiceWatcher already installed".toString());
        }
        throw new IllegalStateException("ServiceWatcher already installed".toString());
    }

    public final void c(Xf.f fVar) {
        Field declaredField = ((Class) this.f32382b.getValue()).getDeclaredField("mH");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.f32383c.getValue());
        if (obj != null) {
            Handler handler = (Handler) obj;
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            declaredField2.set(handler, fVar.invoke((Handler.Callback) declaredField2.get(handler)));
            return;
        }
        throw new ClassCastException("null cannot be cast to non-null type android.os.Handler");
    }
}
