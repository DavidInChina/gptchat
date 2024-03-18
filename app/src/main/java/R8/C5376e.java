package r8;

import Q1.u;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.android.vending.licensing.ILicensingService;
import io.sentry.android.core.AbstractC3612c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import s8.AbstractC5593j;
import s8.C5592i;

/* renamed from: r8.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5376e {

    /* renamed from: c  reason: collision with root package name */
    public static final u f44468c = new u("ReviewService", 5);

    /* renamed from: a  reason: collision with root package name */
    public final C5592i f44469a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44470b;

    public C5376e(Context context) {
        String str;
        this.f44470b = context.getPackageName();
        u uVar = AbstractC5593j.f45464a;
        try {
            if (context.getPackageManager().getApplicationInfo(ILicensingService.SERVICE_PACKAGE, 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(ILicensingService.SERVICE_PACKAGE, 64).signatures;
                if (signatureArr != null && (r3 = signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            }
                        }
                        this.f44469a = new C5592i(context, f44468c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(ILicensingService.SERVICE_PACKAGE));
                        return;
                    }
                    return;
                }
                Object[] objArr = new Object[0];
                u uVar2 = AbstractC5593j.f45464a;
                uVar2.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    AbstractC3612c.r("PlayCore", u.e(uVar2.f14350Z, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
