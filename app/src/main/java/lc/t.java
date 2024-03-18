package Lc;

import android.os.Build;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11020a;

    static {
        String str = Build.PRODUCT;
        AbstractC3557B.Z(str);
        boolean z10 = false;
        if (Lg.n.I2(str, "sdk_gphone", false) || Lg.n.I2(str, "sdk_google_phone", false) || Lg.n.I2(str, "sdk_phone", false)) {
            z10 = true;
        }
        f11020a = z10;
    }
}
