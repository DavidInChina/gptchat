package Ah;

import Sh.EnumC1400f;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import yh.l1;

/* loaded from: classes2.dex */
public final class X implements V {

    /* renamed from: Y  reason: collision with root package name */
    public final ProtectionDomain f914Y;

    /* renamed from: Z  reason: collision with root package name */
    public final EnumC0096o f915Z;

    /* renamed from: h0  reason: collision with root package name */
    public final h0 f916h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f917i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f918j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f919k0;

    public X(EnumC0096o enumC0096o, boolean z10) {
        this(null, g0.f942Y, enumC0096o, z10, true, true);
    }

    @Override // Ah.V
    public final V a(ProtectionDomain protectionDomain) {
        return new X(protectionDomain, this.f916h0, this.f915Z, this.f917i0, this.f918j0, this.f919k0);
    }

    @Override // Ah.a0
    public final Map b(ClassLoader classLoader, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2;
        boolean z10 = this.f917i0;
        boolean z11 = this.f918j0;
        if (z10) {
            int i10 = C0083b.f925j;
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                hashMap.put(((l1) entry.getKey()).getName(), entry.getValue());
            }
            C0103w c0103w = new C0103w(classLoader, this.f919k0, hashMap, this.f914Y, this.f915Z, this.f916h0);
            linkedHashMap2 = new LinkedHashMap();
            for (l1 l1Var : linkedHashMap.keySet()) {
                try {
                    Class<?> cls = Class.forName(l1Var.getName(), false, c0103w);
                    if (!EnumC1400f.a().f16727Z && z11 && cls.getClassLoader() != c0103w) {
                        throw new IllegalStateException("Class already loaded: " + cls);
                    }
                    linkedHashMap2.put(l1Var, cls);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalStateException("Cannot load class " + l1Var, e10);
                }
            }
        } else {
            AbstractC0089h abstractC0089h = C0103w.f962g;
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                hashMap2.put(((l1) entry2.getKey()).getName(), entry2.getValue());
            }
            C0103w c0103w2 = new C0103w(classLoader, this.f919k0, hashMap2, this.f914Y, this.f915Z, this.f916h0);
            linkedHashMap2 = new LinkedHashMap();
            for (l1 l1Var2 : linkedHashMap.keySet()) {
                try {
                    Class<?> cls2 = Class.forName(l1Var2.getName(), false, c0103w2);
                    if (!EnumC1400f.a().f16727Z && z11 && cls2.getClassLoader() != c0103w2) {
                        throw new IllegalStateException("Class already loaded: " + cls2);
                    }
                    linkedHashMap2.put(l1Var2, cls2);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException("Cannot load class " + l1Var2, e11);
                }
            }
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
        if (r2 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        X x10 = (X) obj;
        if (this.f917i0 != x10.f917i0 || this.f918j0 != x10.f918j0 || this.f919k0 != x10.f919k0 || !this.f915Z.equals(x10.f915Z)) {
            return false;
        }
        ProtectionDomain protectionDomain = this.f914Y;
        ProtectionDomain protectionDomain2 = x10.f914Y;
        if (protectionDomain2 != null) {
            if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                return false;
            }
            if (this.f916h0.equals(x10.f916h0)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int hashCode = X.class.hashCode() * 31;
        ProtectionDomain protectionDomain = this.f914Y;
        if (protectionDomain != null) {
            hashCode += protectionDomain.hashCode();
        }
        int hashCode2 = this.f915Z.hashCode();
        return ((((((this.f916h0.hashCode() + ((hashCode2 + (hashCode * 31)) * 31)) * 31) + (this.f917i0 ? 1 : 0)) * 31) + (this.f918j0 ? 1 : 0)) * 31) + (this.f919k0 ? 1 : 0);
    }

    public X(ProtectionDomain protectionDomain, h0 h0Var, EnumC0096o enumC0096o, boolean z10, boolean z11, boolean z12) {
        this.f914Y = protectionDomain;
        this.f916h0 = h0Var;
        this.f915Z = enumC0096o;
        this.f917i0 = z10;
        this.f918j0 = z11;
        this.f919k0 = z12;
    }
}
