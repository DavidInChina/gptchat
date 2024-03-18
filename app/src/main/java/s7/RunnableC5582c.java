package s7;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import s2.s;

/* renamed from: s7.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5582c implements Runnable {

    /* renamed from: h0  reason: collision with root package name */
    public static final s f45428h0 = new s("RevokeAccessOperation", new String[0]);

    /* renamed from: Y  reason: collision with root package name */
    public final String f45429Y;

    /* renamed from: Z  reason: collision with root package name */
    public final v7.k f45430Z = new BasePendingResult(null);

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.common.api.internal.BasePendingResult, v7.k] */
    public RunnableC5582c(String str) {
        A7.b.i0(str);
        this.f45429Y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = f45428h0;
        Status status = Status.f26804l0;
        try {
            String str = this.f45429Y;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f26802j0;
            } else {
                AbstractC3612c.c((String) sVar.f45182b, ((String) sVar.f45183c).concat("Unable to revoke access!"));
            }
            sVar.b("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            AbstractC3612c.c((String) sVar.f45182b, ((String) sVar.f45183c).concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            AbstractC3612c.c((String) sVar.f45182b, ((String) sVar.f45183c).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.f45430Z.J0(status);
    }
}
