package v;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.util.ArrayList;
import nf.AbstractC4828h;

/* renamed from: v.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5932a implements AbstractC5933b {
    @Override // v.AbstractC5933b
    public final ArrayList a(PackageManager packageManager, String str) {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(AbstractC4828h.M(signature));
            }
        } else {
            arrayList.add(AbstractC4828h.M(signingInfo.getSigningCertificateHistory()[0]));
        }
        return arrayList;
    }
}
