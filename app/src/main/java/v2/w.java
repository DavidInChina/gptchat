package v2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public class w extends i {

    /* renamed from: h0  reason: collision with root package name */
    public final int f47142h0;

    public w() {
        super(a(2008, 1));
        this.f47142h0 = 1;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static w b(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && AbstractC4344b.k1(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new w("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new w(iOException, i11, i10);
    }

    public w(String str, int i10) {
        super(str, a(i10, 1));
        this.f47142h0 = 1;
    }

    public w(String str, IOException iOException, int i10) {
        super(a(i10, 1), str, iOException);
        this.f47142h0 = 1;
    }

    public w(IOException iOException, int i10, int i11) {
        super(a(i10, i11), iOException);
        this.f47142h0 = i11;
    }
}
