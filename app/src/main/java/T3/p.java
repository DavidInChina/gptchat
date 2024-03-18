package t3;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import id.AbstractC3557B;
import java.util.Locale;
import q5.EnumC5273c;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45703Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f45704Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, int i10) {
        super(0);
        this.f45703Y = i10;
        this.f45704Z = context;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        UiModeManager uiModeManager;
        int i10 = this.f45703Y;
        Context context = this.f45704Z;
        switch (i10) {
            case 0:
                return A7.b.U(context);
            case 1:
                switch (i10) {
                    case 1:
                        return u4.e.c(context);
                    default:
                        return u4.e.c(context);
                }
            case 2:
                switch (i10) {
                    case 1:
                        return u4.e.c(context);
                    default:
                        return u4.e.c(context);
                }
            default:
                Object systemService = context.getSystemService("uimode");
                TelephonyManager telephonyManager = null;
                if (systemService instanceof UiModeManager) {
                    uiModeManager = (UiModeManager) systemService;
                } else {
                    uiModeManager = null;
                }
                if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3557B.b0("appContext.packageManager", packageManager);
                    if (!packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.tv")) {
                        String str = Build.MODEL;
                        AbstractC3557B.b0("MODEL", str);
                        Locale locale = Locale.US;
                        String j6 = AbstractC6463a.j("US", locale, str, locale, "this as java.lang.String).toLowerCase(locale)");
                        boolean z10 = false;
                        if (!Lg.n.Z1(j6, "tablet", false) && !Lg.n.Z1(j6, "sm-t", false) && context.getResources().getConfiguration().smallestScreenWidthDp < 800) {
                            String lowerCase = str.toLowerCase(locale);
                            AbstractC3557B.b0("this as java.lang.String).toLowerCase(locale)", lowerCase);
                            if (!Lg.n.Z1(lowerCase, "phone", false)) {
                                Object systemService2 = context.getSystemService("phone");
                                if (systemService2 instanceof TelephonyManager) {
                                    telephonyManager = (TelephonyManager) systemService2;
                                }
                                if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                                    z10 = true;
                                }
                                if (!(true ^ z10)) {
                                    return EnumC5273c.f43922i0;
                                }
                            }
                            return EnumC5273c.f43919Y;
                        }
                        return EnumC5273c.f43920Z;
                    }
                }
                return EnumC5273c.f43921h0;
        }
    }
}
