package Ah;

import java.net.URL;
import java.security.ProtectionDomain;

/* loaded from: classes2.dex */
public final class D implements J, E {

    /* renamed from: a  reason: collision with root package name */
    public final String f880a;

    public D(String str) {
        this.f880a = str;
    }

    @Override // Ah.J
    public final Class b(ClassLoader classLoader, String str) {
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // Ah.J
    public final Package c(ClassLoader classLoader, String str) {
        throw new UnsupportedOperationException("Cannot get package using reflection: " + this.f880a);
    }

    @Override // Ah.J
    public final Class d(ClassLoader classLoader, String str, ProtectionDomain protectionDomain, byte[] bArr) {
        throw new UnsupportedOperationException("Cannot define class using reflection: " + this.f880a);
    }

    @Override // Ah.J
    public final Package e(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
        throw new UnsupportedOperationException("Cannot define package using injection: " + this.f880a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        if (this.f880a.equals(((D) obj).f880a)) {
            return true;
        }
        return false;
    }

    @Override // Ah.J
    public final Package f(ClassLoader classLoader, String str) {
        throw new UnsupportedOperationException("Cannot get defined package using reflection: " + this.f880a);
    }

    public final int hashCode() {
        return this.f880a.hashCode() + (D.class.hashCode() * 31);
    }

    @Override // Ah.E
    public final J a() {
        return this;
    }

    @Override // Ah.J
    public final Object g(ClassLoader classLoader, String str) {
        return classLoader;
    }
}
