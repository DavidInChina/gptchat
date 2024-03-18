package V1;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import w.C6049A;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b  reason: collision with root package name */
    public static final C6049A f18021b = new C6049A();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f18022a;

    public E(K k10) {
        this.f18022a = k10;
    }

    public static Class b(ClassLoader classLoader, String str) {
        C6049A c6049a = f18021b;
        C6049A c6049a2 = (C6049A) c6049a.get(classLoader);
        if (c6049a2 == null) {
            c6049a2 = new C6049A();
            c6049a.put(classLoader, c6049a2);
        }
        Class cls = (Class) c6049a2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c6049a2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new RuntimeException(android.gov.nist.core.a.A("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(android.gov.nist.core.a.A("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final AbstractComponentCallbacksC1480v a(String str) {
        Context context = this.f18022a.f18064u.f18309Z;
        Object obj = AbstractComponentCallbacksC1480v.f18259Z0;
        try {
            return (AbstractComponentCallbacksC1480v) c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(android.gov.nist.core.a.A("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(android.gov.nist.core.a.A("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(android.gov.nist.core.a.A("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(android.gov.nist.core.a.A("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
