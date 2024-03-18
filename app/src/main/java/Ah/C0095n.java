package Ah;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URLEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;

/* renamed from: Ah.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0095n implements PrivilegedAction {

    /* renamed from: h0  reason: collision with root package name */
    public static final boolean f946h0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f947Y;

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f948Z;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f946h0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f946h0 = z10;
            Th.y a5 = Th.y.a(AbstractC0094m.class);
            if (f946h0) {
            }
            AbstractC2469q0.p(obj);
        } catch (SecurityException unused2) {
            z10 = true;
            f946h0 = z10;
            Th.y a52 = Th.y.a(AbstractC0094m.class);
            if (f946h0) {
            }
            AbstractC2469q0.p(obj);
        }
        Th.y a522 = Th.y.a(AbstractC0094m.class);
        if (f946h0) {
            obj = AccessController.doPrivileged(a522);
        } else {
            obj = a522.run();
        }
        AbstractC2469q0.p(obj);
    }

    public C0095n(String str, byte[] bArr) {
        this.f947Y = str;
        this.f948Z = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0095n.class != obj.getClass()) {
            return false;
        }
        C0095n c0095n = (C0095n) obj;
        if (this.f947Y.equals(c0095n.f947Y) && Arrays.equals(this.f948Z, c0095n.f948Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f948Z) + E9.f.v(this.f947Y, C0095n.class.hashCode() * 31, 31);
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String str = this.f947Y;
        try {
            String encode = URLEncoder.encode(str.replace('.', '/'), "UTF-8");
            new C0093l(this.f948Z);
            URI.create("bytebuddy://" + encode);
            throw null;
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException("Could not find encoding: UTF-8", e10);
        } catch (MalformedURLException e11) {
            throw new IllegalStateException(R.a.r("Cannot create URL for ", str), e11);
        }
    }
}
