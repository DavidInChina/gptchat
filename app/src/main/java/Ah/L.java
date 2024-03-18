package Ah;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.Permission;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class L extends Df.H {

    /* renamed from: j  reason: collision with root package name */
    public static final E f894j;

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f895k;

    /* renamed from: f  reason: collision with root package name */
    public final ClassLoader f896f;

    /* renamed from: g  reason: collision with root package name */
    public final ProtectionDomain f897g;

    /* renamed from: h  reason: collision with root package name */
    public final h0 f898h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f899i;

    static {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            Class.forName("java.security.AccessController", false, null);
            f895k = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f895k = false;
        } catch (SecurityException unused2) {
            f895k = true;
        }
        EnumC0106z enumC0106z = EnumC0106z.f973Y;
        boolean z10 = f895k;
        if (z10) {
            obj = AccessController.doPrivileged(enumC0106z);
        } else {
            obj = enumC0106z.run();
        }
        f894j = (E) obj;
        Th.y a5 = Th.y.a(K.class);
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

    public L(ClassLoader classLoader, ProtectionDomain protectionDomain, h0 h0Var, boolean z10) {
        if (classLoader != null) {
            this.f896f = classLoader;
            this.f897g = protectionDomain;
            this.f898h = h0Var;
            this.f899i = z10;
            return;
        }
        throw new IllegalArgumentException("Cannot inject classes into the bootstrap class loader");
    }

    @Override // Ah.U
    public final HashMap b(LinkedHashMap linkedHashMap) {
        Iterator it;
        String str;
        IllegalStateException e10;
        J a5 = f894j.a();
        HashMap hashMap = new HashMap();
        for (Iterator it2 = linkedHashMap.entrySet().iterator(); it2.hasNext(); it2 = it) {
            Map.Entry entry = (Map.Entry) it2.next();
            synchronized (a5.g(this.f896f, (String) entry.getKey())) {
                Class b10 = a5.b(this.f896f, (String) entry.getKey());
                if (b10 == null) {
                    int lastIndexOf = ((String) entry.getKey()).lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        String substring = ((String) entry.getKey()).substring(0, lastIndexOf);
                        h0 h0Var = this.f898h;
                        String str2 = (String) entry.getKey();
                        e0 a10 = h0Var.a();
                        if (a10.c()) {
                            if (a5.f(this.f896f, substring) == null) {
                                try {
                                    it = it2;
                                    str = substring;
                                } catch (IllegalStateException e11) {
                                    e10 = e11;
                                    it = it2;
                                    str = substring;
                                }
                                try {
                                    a5.e(this.f896f, substring, a10.i(), a10.h(), a10.a(), a10.g(), a10.f(), a10.e(), a10.b());
                                } catch (IllegalStateException e12) {
                                    e10 = e12;
                                    if (a5.c(this.f896f, str) != null) {
                                        if (!a10.d()) {
                                            throw new SecurityException("Sealing violation for package " + str + " (getPackage fallback)");
                                        }
                                        b10 = a5.d(this.f896f, (String) entry.getKey(), this.f897g, (byte[]) entry.getValue());
                                        hashMap.put(entry.getKey(), b10);
                                    } else {
                                        throw e10;
                                    }
                                }
                            } else {
                                it = it2;
                                if (!a10.d()) {
                                    throw new SecurityException("Sealing violation for package " + substring);
                                }
                            }
                            b10 = a5.d(this.f896f, (String) entry.getKey(), this.f897g, (byte[]) entry.getValue());
                        }
                    }
                    it = it2;
                    b10 = a5.d(this.f896f, (String) entry.getKey(), this.f897g, (byte[]) entry.getValue());
                } else {
                    it = it2;
                    if (this.f899i) {
                        throw new IllegalStateException("Cannot inject already loaded type: " + b10);
                    }
                }
                hashMap.put(entry.getKey(), b10);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r2 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l10 = (L) obj;
        if (this.f899i != l10.f899i || !this.f896f.equals(l10.f896f)) {
            return false;
        }
        ProtectionDomain protectionDomain = this.f897g;
        ProtectionDomain protectionDomain2 = l10.f897g;
        if (protectionDomain2 != null) {
            if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                return false;
            }
            if (this.f898h.equals(l10.f898h)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int hashCode = (this.f896f.hashCode() + (L.class.hashCode() * 31)) * 31;
        ProtectionDomain protectionDomain = this.f897g;
        if (protectionDomain != null) {
            hashCode += protectionDomain.hashCode();
        }
        return ((this.f898h.hashCode() + (hashCode * 31)) * 31) + (this.f899i ? 1 : 0);
    }
}
