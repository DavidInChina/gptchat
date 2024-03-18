package Sh;

import java.security.AccessController;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: Sh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1400f {
    AGENT(true, false),
    BUILD(true, false),
    RUNTIME(true, true),
    UNKNOWN(false, false),
    NONE(false, false);
    

    /* renamed from: m0  reason: collision with root package name */
    public static EnumC1400f f16723m0;

    /* renamed from: o0  reason: collision with root package name */
    public static final boolean f16725o0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f16726Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f16727Z;

    static {
        try {
            Class.forName("java.security.AccessController", false, null);
            f16725o0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f16725o0 = false;
        } catch (SecurityException unused2) {
            f16725o0 = true;
        }
    }

    EnumC1400f(boolean z10, boolean z11) {
        this.f16726Y = z10;
        this.f16727Z = z11;
    }

    public static EnumC1400f a() {
        Object obj;
        Object obj2;
        Object obj3;
        EnumC1400f enumC1400f = f16723m0;
        if (enumC1400f == null) {
            Uh.b bVar = new Uh.b("org.graalvm.nativeimage.imagecode");
            boolean z10 = f16725o0;
            if (z10) {
                obj = AccessController.doPrivileged(bVar);
            } else {
                obj = bVar.run();
            }
            String str = (String) obj;
            if (str == null) {
                Uh.b bVar2 = new Uh.b("java.vm.vendor");
                if (z10) {
                    obj2 = AccessController.doPrivileged(bVar2);
                } else {
                    obj2 = bVar2.run();
                }
                String str2 = (String) obj2;
                if (str2 != null && str2.toLowerCase(Locale.US).contains("graalvm")) {
                    EnumC1399e enumC1399e = EnumC1399e.f16716Y;
                    if (z10) {
                        obj3 = AccessController.doPrivileged(enumC1399e);
                    } else {
                        obj3 = enumC1399e.run();
                    }
                    enumC1400f = (EnumC1400f) obj3;
                } else {
                    enumC1400f = NONE;
                }
            } else if (str.equalsIgnoreCase("agent")) {
                enumC1400f = AGENT;
            } else if (str.equalsIgnoreCase("runtime")) {
                enumC1400f = RUNTIME;
            } else if (str.equalsIgnoreCase("buildtime")) {
                enumC1400f = BUILD;
            } else {
                enumC1400f = UNKNOWN;
            }
            f16723m0 = enumC1400f;
        }
        return enumC1400f;
    }

    public final void b(Object[] objArr, Comparator comparator) {
        if (this.f16726Y) {
            Arrays.sort(objArr, comparator);
        }
    }
}
