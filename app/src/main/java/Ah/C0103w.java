package Ah;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.ProtectionDomain;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Ah.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0103w extends b0 {

    /* renamed from: g  reason: collision with root package name */
    public static final AbstractC0089h f962g;

    /* renamed from: h  reason: collision with root package name */
    public static final AbstractC0101u f963h;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f964i;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f965a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC0096o f966b;

    /* renamed from: c  reason: collision with root package name */
    public final ProtectionDomain f967c;

    /* renamed from: d  reason: collision with root package name */
    public final h0 f968d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0105y f969e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessControlContext f970f;

    static {
        Object obj;
        Object obj2;
        try {
            Class.forName("java.security.AccessController", false, null);
            f964i = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f964i = false;
        } catch (SecurityException unused2) {
            f964i = true;
        }
        EnumC0086e enumC0086e = EnumC0086e.f935Y;
        boolean z10 = f964i;
        if (z10) {
            obj = AccessController.doPrivileged(enumC0086e);
        } else {
            obj = enumC0086e.run();
        }
        f962g = (AbstractC0089h) obj;
        EnumC0098q enumC0098q = EnumC0098q.f954Y;
        if (z10) {
            obj2 = AccessController.doPrivileged(enumC0098q);
        } else {
            obj2 = enumC0098q.run();
        }
        f963h = (AbstractC0101u) obj2;
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("registerAsParallelCapable", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103w(ClassLoader classLoader, boolean z10, HashMap hashMap, ProtectionDomain protectionDomain, EnumC0096o enumC0096o, h0 h0Var) {
        super(classLoader);
        AccessControlContext accessControlContext;
        EnumC0104x enumC0104x = EnumC0104x.f971Y;
        new AtomicBoolean(z10);
        this.f965a = new ConcurrentHashMap(hashMap);
        this.f967c = protectionDomain;
        this.f966b = enumC0096o;
        this.f968d = h0Var;
        this.f969e = enumC0104x;
        if (f964i) {
            accessControlContext = AccessController.getContext();
        } else {
            accessControlContext = null;
        }
        this.f970f = accessControlContext;
    }

    public static Package c(C0103w c0103w, String str) {
        return c0103w.getPackage(str);
    }

    @Override // java.lang.ClassLoader
    public final Class findClass(String str) {
        Object obj;
        byte[] a5 = this.f966b.a(str, this.f965a);
        if (a5 != null) {
            ((EnumC0104x) this.f969e).getClass();
            C0084c c0084c = new C0084c(this, str, a5);
            if (f964i) {
                obj = AccessController.doPrivileged(c0084c, this.f970f);
            } else {
                obj = c0084c.run();
            }
            return (Class) obj;
        }
        throw new ClassNotFoundException(str);
    }

    @Override // java.lang.ClassLoader
    public final URL findResource(String str) {
        return this.f966b.b(str, this.f965a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Enumeration, Ah.p, java.lang.Object] */
    @Override // java.lang.ClassLoader
    public final Enumeration findResources(String str) {
        URL b10 = this.f966b.b(str, this.f965a);
        if (b10 == null) {
            return EnumC0085d.f931Y;
        }
        ?? obj = new Object();
        obj.f953Y = b10;
        return obj;
    }
}
