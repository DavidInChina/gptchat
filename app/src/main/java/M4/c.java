package m4;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import id.AbstractC3557B;
import q4.n;
import u4.e;

/* loaded from: classes.dex */
public final class c implements b {
    @Override // m4.b
    public final String a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (AbstractC3557B.K(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            Configuration configuration = nVar.f43869a.getResources().getConfiguration();
            Bitmap.Config[] configArr = e.f46388a;
            sb2.append(configuration.uiMode & 48);
            return sb2.toString();
        }
        return uri.toString();
    }
}
