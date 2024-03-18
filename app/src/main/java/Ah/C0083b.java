package Ah;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;

/* renamed from: Ah.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0083b extends C0103w {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f925j = 0;

    static {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        URL b10 = this.f966b.b(str, this.f965a);
        if (b10 == null) {
            if (!this.f966b.f952Y && str.endsWith(".class")) {
                synchronized (this) {
                    try {
                        boolean z10 = false;
                        String substring = str.replace('/', '.').substring(0, str.length() - 6);
                        if (!this.f965a.containsKey(substring)) {
                            Class<?> findLoadedClass = findLoadedClass(substring);
                            if (findLoadedClass != null && findLoadedClass.getClassLoader() == this) {
                                z10 = true;
                            }
                            if (z10) {
                                return b10;
                            }
                        } else {
                            return b10;
                        }
                    } finally {
                    }
                }
            }
            return super.getResource(str);
        }
        return b10;
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        URL b10 = this.f966b.b(str, this.f965a);
        if (b10 == null) {
            return super.getResources(str);
        }
        return new C0082a(b10, super.getResources(str));
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) {
        synchronized (C0103w.f963h.a().b(this, str)) {
            Class<?> findLoadedClass = findLoadedClass(str);
            if (findLoadedClass != null) {
                return findLoadedClass;
            }
            try {
                Class findClass = findClass(str);
                if (z10) {
                    resolveClass(findClass);
                }
                return findClass;
            } catch (ClassNotFoundException unused) {
                return super.loadClass(str, z10);
            }
        }
    }
}
