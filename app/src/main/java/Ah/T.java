package Ah;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.Permission;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class T extends Df.H {

    /* renamed from: i  reason: collision with root package name */
    public static final O f905i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f906j = null;

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f907k;

    /* renamed from: f  reason: collision with root package name */
    public final ClassLoader f908f;

    /* renamed from: g  reason: collision with root package name */
    public final ProtectionDomain f909g;

    /* renamed from: h  reason: collision with root package name */
    public final O f910h = f905i;

    static {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            Class.forName("java.security.AccessController", false, null);
            f907k = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f907k = false;
        } catch (SecurityException unused2) {
            f907k = true;
        }
        M m10 = M.f900Y;
        boolean z10 = f907k;
        if (z10) {
            obj = AccessController.doPrivileged(m10);
        } else {
            obj = m10.run();
        }
        f905i = (O) obj;
        Th.y a5 = Th.y.a(S.class);
        if (z10) {
            obj2 = AccessController.doPrivileged(a5);
        } else {
            obj2 = a5.run();
        }
        AbstractC2469q0.p(obj2);
        Uh.a aVar = new Uh.a(Permission.class);
        if (z10) {
            obj3 = AccessController.doPrivileged(aVar);
        } else {
            obj3 = aVar.run();
        }
        Method method = (Method) obj3;
    }

    public T(ClassLoader classLoader, ProtectionDomain protectionDomain) {
        this.f908f = classLoader;
        this.f909g = protectionDomain;
    }

    @Override // Ah.U
    public final HashMap b(LinkedHashMap linkedHashMap) {
        this.f910h.a();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
        if (r2 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t10 = (T) obj;
        ClassLoader classLoader = this.f908f;
        ClassLoader classLoader2 = t10.f908f;
        if (classLoader2 != null) {
            if (classLoader == null || !classLoader.equals(classLoader2)) {
                return false;
            }
            ProtectionDomain protectionDomain = this.f909g;
            ProtectionDomain protectionDomain2 = t10.f909g;
            if (protectionDomain2 != null) {
                if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                    return false;
                }
                if (this.f910h.equals(t10.f910h)) {
                    return true;
                }
                return false;
            }
        }
    }

    public final int hashCode() {
        int hashCode = T.class.hashCode() * 31;
        ClassLoader classLoader = this.f908f;
        if (classLoader != null) {
            hashCode += classLoader.hashCode();
        }
        int i10 = hashCode * 31;
        ProtectionDomain protectionDomain = this.f909g;
        if (protectionDomain != null) {
            i10 += protectionDomain.hashCode();
        }
        return this.f910h.hashCode() + (i10 * 31);
    }
}
