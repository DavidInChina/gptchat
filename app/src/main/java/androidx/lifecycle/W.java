package androidx.lifecycle;

import android.app.Application;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public abstract class W {

    /* renamed from: a  reason: collision with root package name */
    public static final List f25338a = AbstractC4344b.G0(Application.class, P.class);

    /* renamed from: b  reason: collision with root package name */
    public static final List f25339b = AbstractC4344b.F0(P.class);

    public static final Constructor a(Class cls, List list) {
        AbstractC3557B.c0("signature", list);
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC3557B.b0("modelClass.constructors", constructors);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC3557B.b0("constructor.parameterTypes", parameterTypes);
            List z32 = kf.q.z3(parameterTypes);
            if (AbstractC3557B.K(list, z32)) {
                return constructor;
            }
            if (list.size() == z32.size() && z32.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final Y b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (Y) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
