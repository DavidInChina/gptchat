package androidx.lifecycle;

import android.app.Application;
import id.AbstractC3557B;
import java.lang.reflect.InvocationTargetException;
import l2.C4333d;

/* loaded from: classes.dex */
public final class a0 extends Z {

    /* renamed from: j0  reason: collision with root package name */
    public static a0 f25353j0;

    /* renamed from: i0  reason: collision with root package name */
    public final Application f25354i0;

    public a0(Application application) {
        this.f25354i0 = application;
    }

    public final Y a(Class cls, Application application) {
        if (AbstractC2067b.class.isAssignableFrom(cls)) {
            try {
                Y y10 = (Y) cls.getConstructor(Application.class).newInstance(application);
                AbstractC3557B.b0("{\n                try {\n\u2026          }\n            }", y10);
                return y10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
        return super.b(cls);
    }

    @Override // androidx.lifecycle.Z, androidx.lifecycle.b0
    public final Y b(Class cls) {
        Application application = this.f25354i0;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.Z, androidx.lifecycle.b0
    public final Y d(Class cls, C4333d c4333d) {
        if (this.f25354i0 != null) {
            return b(cls);
        }
        Application application = (Application) c4333d.f37739a.get(Z.f25347Y);
        if (application != null) {
            return a(cls, application);
        }
        if (!AbstractC2067b.class.isAssignableFrom(cls)) {
            return super.b(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
