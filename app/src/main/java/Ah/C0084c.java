package Ah;

import java.security.PrivilegedAction;
import java.util.Arrays;

/* renamed from: Ah.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0084c implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public final String f926Y;

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f927Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0103w f928h0;

    public C0084c(C0103w c0103w, String str, byte[] bArr) {
        this.f928h0 = c0103w;
        this.f926Y = str;
        this.f927Z = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0084c.class != obj.getClass()) {
            return false;
        }
        C0084c c0084c = (C0084c) obj;
        if (this.f926Y.equals(c0084c.f926Y) && Arrays.equals(this.f927Z, c0084c.f927Z) && this.f928h0.equals(c0084c.f928h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f926Y, C0084c.class.hashCode() * 31, 31);
        return this.f928h0.hashCode() + ((Arrays.hashCode(this.f927Z) + v10) * 31);
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Class defineClass;
        String str = this.f926Y;
        int lastIndexOf = str.lastIndexOf(46);
        C0103w c0103w = this.f928h0;
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            e0 a5 = c0103w.f968d.a();
            if (a5.c()) {
                if (C0103w.f962g.a(c0103w, substring) == null) {
                    this.f928h0.definePackage(substring, a5.i(), a5.h(), a5.a(), a5.g(), a5.f(), a5.e(), a5.b());
                } else if (!a5.d()) {
                    throw new SecurityException(R.a.r("Sealing violation for package ", substring));
                }
            }
        }
        byte[] bArr = this.f927Z;
        defineClass = c0103w.defineClass(str, bArr, 0, bArr.length, c0103w.f967c);
        return defineClass;
    }
}
