package V3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18354a = L3.s.f("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        L3.s.d().a(r2, "Skipping component enablement for ".concat(r8.getName()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, Class cls, boolean z10) {
        int i10;
        String str;
        String str2 = "disabled";
        String str3 = f18354a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z11 = true;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            L3.s d10 = L3.s.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(Separators.SP);
            if (z10) {
                str = "enabled";
            } else {
                str = str2;
            }
            sb2.append(str);
            d10.a(str3, sb2.toString());
        } catch (Exception e10) {
            L3.s d11 = L3.s.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            if (z10) {
                str2 = "enabled";
            }
            sb3.append(str2);
            String sb4 = sb3.toString();
            if (d11.f10731a <= 3) {
                Log.d(str3, sb4, e10);
            }
        }
    }
}
