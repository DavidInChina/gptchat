package sc;

import Ng.Q;
import Tg.e;
import Z8.AbstractC1809m0;
import Z8.C1796g;
import android.app.Application;
import android.content.pm.FeatureInfo;
import android.telephony.TelephonyManager;
import id.AbstractC3557B;
import jf.C3959i;
import jf.y;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import od.EnumC4990a;

/* renamed from: sc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5610a implements AbstractC4991b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f45528a;

    public C5610a(Application application) {
        this.f45528a = application;
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return null;
    }

    @Override // od.AbstractC4991b
    public final Object b(AbstractC4825e abstractC4825e) {
        FeatureInfo featureInfo;
        Application application = this.f45528a;
        FeatureInfo[] systemAvailableFeatures = application.getPackageManager().getSystemAvailableFeatures();
        AbstractC3557B.b0("getSystemAvailableFeatures(...)", systemAvailableFeatures);
        int length = systemAvailableFeatures.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                featureInfo = systemAvailableFeatures[i10];
                if (AbstractC3557B.K(featureInfo.name, "android.hardware.telephony")) {
                    break;
                }
                i10++;
            } else {
                featureInfo = null;
                break;
            }
        }
        y yVar = y.f36177a;
        if (featureInfo == null) {
            return yVar;
        }
        TelephonyManager telephonyManager = (TelephonyManager) application.getSystemService(TelephonyManager.class);
        if (telephonyManager.getSimState() != 5) {
            return yVar;
        }
        AbstractC1809m0.a().b(C1796g.f23347c, P4.a.o0(new C3959i("simOperator", telephonyManager.getSimOperator())));
        return yVar;
    }

    @Override // od.AbstractC4991b
    public final e c() {
        return Q.f12904a;
    }

    @Override // od.AbstractC4991b
    public final Object d(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final void e() {
    }
}
