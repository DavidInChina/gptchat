package Ei;

import Gi.c;
import Gi.d;
import Gi.e;
import fi.C3100a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import n2.C4711b;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f4820a;

    /* renamed from: b  reason: collision with root package name */
    public static final C4711b f4821b = new C4711b(9);

    /* renamed from: c  reason: collision with root package name */
    public static final C3100a f4822c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f4823d;

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f4824e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f4825f;

    /* JADX WARN: Type inference failed for: r0v1, types: [fi.a, java.lang.Object] */
    static {
        String str;
        boolean z10;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            z10 = false;
        } else {
            z10 = str.equalsIgnoreCase("true");
        }
        f4823d = z10;
        f4824e = new String[]{"1.6", "1.7"};
        f4825f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSet;
        try {
            try {
                try {
                    try {
                        if (!f()) {
                            linkedHashSet = b();
                            i(linkedHashSet);
                        } else {
                            linkedHashSet = null;
                        }
                        StaticLoggerBinder.getSingleton();
                        f4820a = 3;
                        h(linkedHashSet);
                    } catch (NoSuchMethodError e10) {
                        String message = e10.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            f4820a = 2;
                            e.P("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            e.P("Your binding is version 1.5.5 or earlier.");
                            e.P("Upgrade your binding to version 1.6.x.");
                        }
                        throw e10;
                    }
                } catch (Exception e11) {
                    f4820a = 2;
                    e.Q("Failed to instantiate SLF4J LoggerFactory", e11);
                    throw new IllegalStateException("Unexpected initialization failure", e11);
                }
            } catch (NoClassDefFoundError e12) {
                String message2 = e12.getMessage();
                if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    f4820a = 2;
                    e.Q("Failed to instantiate SLF4J LoggerFactory", e12);
                    throw e12;
                }
                f4820a = 4;
                e.P("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                e.P("Defaulting to no-operation (NOP) logger implementation");
                e.P("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public static LinkedHashSet b() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            String str = f4825f;
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(str);
            } else {
                enumeration = classLoader.getResources(str);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e10) {
            e.Q("Error getting resources from path", e10);
        }
        return linkedHashSet;
    }

    public static ILoggerFactory c() {
        if (f4820a == 0) {
            synchronized (b.class) {
                try {
                    if (f4820a == 0) {
                        f4820a = 1;
                        a();
                        if (f4820a == 3) {
                            j();
                        }
                    }
                } finally {
                }
            }
        }
        int i10 = f4820a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return f4822c;
                    }
                    throw new IllegalStateException("Unreachable code");
                }
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            }
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        return f4821b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.SecurityManager] */
    public static a d(Class cls) {
        int i10;
        d dVar;
        a e10 = e(cls.getName());
        if (f4823d) {
            d dVar2 = e.f6516a;
            Class cls2 = null;
            d dVar3 = dVar2;
            if (dVar2 == null) {
                if (e.f6517b) {
                    dVar3 = null;
                } else {
                    try {
                        dVar = new SecurityManager();
                    } catch (SecurityException unused) {
                        dVar = null;
                    }
                    e.f6516a = dVar;
                    e.f6517b = true;
                    dVar3 = dVar;
                }
            }
            if (dVar3 != null) {
                Class[] classContext = dVar3.getClassContext();
                String name = e.class.getName();
                int i11 = 0;
                while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
                    i11++;
                }
                if (i11 < classContext.length && (i10 = i11 + 2) < classContext.length) {
                    cls2 = classContext[i10];
                } else {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
            }
            if (cls2 != null && (!cls2.isAssignableFrom(cls))) {
                e.P("Detected logger name mismatch. Given name: \"" + e10.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                e.P("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return e10;
    }

    public static a e(String str) {
        return c().a(str);
    }

    public static boolean f() {
        String str;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains("android");
    }

    public static void g() {
        C4711b c4711b = f4821b;
        synchronized (c4711b) {
            try {
                c4711b.f39601Z = true;
                Iterator it = new ArrayList(((Map) c4711b.f39602h0).values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    cVar.f6510Z = e(cVar.f6509Y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) f4821b.f39603i0;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Fi.b bVar = (Fi.b) it2.next();
                if (bVar != null) {
                    c cVar2 = bVar.f5410a;
                    String str = cVar2.f6509Y;
                    if (cVar2.f6510Z != null) {
                        if (!(cVar2.f6510Z instanceof Gi.b)) {
                            if (cVar2.e()) {
                                if (cVar2.e()) {
                                    try {
                                        cVar2.f6512i0.invoke(cVar2.f6510Z, bVar);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                }
                            } else {
                                e.P(str);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                }
                int i11 = i10 + 1;
                if (i10 == 0) {
                    if (bVar.f5410a.e()) {
                        e.P("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        e.P("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        e.P("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(bVar.f5410a.f6510Z instanceof Gi.b)) {
                        e.P("The following set of substitute loggers may have been accessed");
                        e.P("during the initialization phase. Logging calls during this");
                        e.P("phase were not honored. However, subsequent logging calls to these");
                        e.P("loggers will work as normally expected.");
                        e.P("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i10 = i11;
            }
            arrayList.clear();
        }
        C4711b c4711b2 = f4821b;
        ((Map) c4711b2.f39602h0).clear();
        ((LinkedBlockingQueue) c4711b2.f39603i0).clear();
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null && linkedHashSet.size() > 1) {
            e.P("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
        }
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            e.P("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                e.P("Found binding in [" + ((URL) it.next()) + "]");
            }
            e.P("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z10 = false;
            for (String str2 : f4824e) {
                if (str.startsWith(str2)) {
                    z10 = true;
                }
            }
            if (!z10) {
                e.P("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f4824e).toString());
                e.P("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            e.Q("Unexpected problem occured during version sanity check", th2);
        }
    }
}
