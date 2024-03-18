package Sh;

import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16702a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f16703b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f16704c;

    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f16704c = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f16704c = false;
        } catch (SecurityException unused2) {
            f16704c = true;
        }
        try {
            Uh.b bVar = new Uh.b("net.bytebuddy.experimental");
            if (f16704c) {
                obj = AccessController.doPrivileged(bVar);
            } else {
                obj = bVar.run();
            }
            z10 = Boolean.parseBoolean((String) obj);
        } catch (Exception unused3) {
        }
        f16702a = z10;
        f16703b = 589824;
    }

    public static Nh.b a(byte[] bArr) {
        boolean z10;
        ph.f f6 = ph.f.f(bArr);
        ph.f fVar = ph.f.f43181B0;
        if (f6.compareTo(fVar) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (f16702a) {
                bArr[4] = (byte) (fVar.c() >>> 8);
                bArr[5] = (byte) fVar.c();
                bArr[6] = (byte) (fVar.b() >>> 8);
                bArr[7] = (byte) fVar.b();
                Nh.b bVar = new Nh.b(bArr, true);
                bArr[4] = (byte) (f6.c() >>> 8);
                bArr[5] = (byte) f6.c();
                bArr[6] = (byte) (f6.b() >>> 8);
                bArr[7] = (byte) f6.b();
                return bVar;
            }
            throw new IllegalArgumentException(f6 + " is not supported by the current version of Byte Buddy which officially supports " + fVar + " - update Byte Buddy or set net.bytebuddy.experimental as a VM property");
        }
        return new Nh.b(bArr, true);
    }
}
