package t7;

import android.os.RemoteException;
import io.sentry.android.core.AbstractC3612c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import w7.K;
import w7.w;

/* loaded from: classes.dex */
public abstract class n extends K {

    /* renamed from: b  reason: collision with root package name */
    public final int f45787b;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        if (bArr.length == 25) {
            this.f45787b = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] l(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof w)) {
            try {
                w wVar = (w) obj;
                if (((n) wVar).f45787b != this.f45787b) {
                    return false;
                }
                return Arrays.equals(m(), (byte[]) new B7.a(((n) wVar).m()).f1986b);
            } catch (RemoteException e10) {
                AbstractC3612c.d("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45787b;
    }

    public abstract byte[] m();
}
