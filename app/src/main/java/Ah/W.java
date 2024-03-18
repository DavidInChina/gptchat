package Ah;

import java.security.ProtectionDomain;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class W implements V {

    /* renamed from: Y  reason: collision with root package name */
    public final ProtectionDomain f911Y;

    /* renamed from: Z  reason: collision with root package name */
    public final h0 f912Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f913h0;

    public W(ProtectionDomain protectionDomain, h0 h0Var, boolean z10) {
        this.f911Y = protectionDomain;
        this.f912Z = h0Var;
        this.f913h0 = z10;
    }

    @Override // Ah.V
    public final V a(ProtectionDomain protectionDomain) {
        return new W(protectionDomain, this.f912Z, this.f913h0);
    }

    @Override // Ah.a0
    public final Map b(ClassLoader classLoader, LinkedHashMap linkedHashMap) {
        if (classLoader != null) {
            return new L(classLoader, this.f911Y, this.f912Z, this.f913h0).Y(linkedHashMap);
        }
        throw new IllegalArgumentException("Cannot inject classes into the bootstrap class loader");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        if (r2 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w10 = (W) obj;
        if (this.f913h0 != w10.f913h0) {
            return false;
        }
        ProtectionDomain protectionDomain = this.f911Y;
        ProtectionDomain protectionDomain2 = w10.f911Y;
        if (protectionDomain2 != null) {
            if (protectionDomain == null || !protectionDomain.equals(protectionDomain2)) {
                return false;
            }
            if (this.f912Z.equals(w10.f912Z)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int hashCode = W.class.hashCode() * 31;
        ProtectionDomain protectionDomain = this.f911Y;
        if (protectionDomain != null) {
            hashCode += protectionDomain.hashCode();
        }
        return ((this.f912Z.hashCode() + (hashCode * 31)) * 31) + (this.f913h0 ? 1 : 0);
    }
}
