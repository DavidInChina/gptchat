package j7;

import Ii.A;
import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.N;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.revenuecat.purchases.amazon.AmazonBilling;
import h.C3276b;
import i8.C3486d;
import i8.C3494l;
import id.AbstractC3557B;
import io.sentry.L0;
import io.sentry.android.core.AppLifecycleIntegration;
import io.sentry.android.core.C3614e;
import io.sentry.android.core.C3626q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import wf.AbstractC6216a;

/* renamed from: j7.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3921k implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f36073Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f36074Z;

    public /* synthetic */ RunnableC3921k(int i10, Object obj) {
        this.f36073Y = i10;
        this.f36074Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36073Y) {
            case 0:
                C3922l c3922l = (C3922l) this.f36074Z;
                c3922l.getClass();
                ((k7.k) c3922l.f36078d).k(new C3276b(26, c3922l));
                return;
            case 1:
                ((CarouselLayoutManager) this.f36074Z).j0();
                return;
            case 2:
            default:
                A a5 = (A) this.f36074Z;
                AbstractC3557B.c0("this$0", a5);
                ArrayList arrayList = a5.f8624t0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC6216a) it.next()).mo122invoke();
                }
                arrayList.clear();
                return;
            case 3:
                v7.l lVar = (v7.l) this.f36074Z;
                lVar.f47317c = false;
                L1.e eVar = ((SideSheetBehavior) lVar.f47316b).f27236i;
                if (eVar != null && eVar.f()) {
                    lVar.b(lVar.f47318d);
                    return;
                }
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) lVar.f47316b;
                if (sideSheetBehavior.f27235h == 2) {
                    sideSheetBehavior.r(lVar.f47318d);
                    return;
                }
                return;
            case 4:
                ((C3486d) this.f36074Z).t(true);
                return;
            case 5:
                C3494l c3494l = (C3494l) this.f36074Z;
                boolean isPopupShowing = c3494l.f32778h.isPopupShowing();
                c3494l.t(isPopupShowing);
                c3494l.f32783m = isPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.f36074Z).f27299k0.requestLayout();
                return;
            case 7:
                AmazonBilling.b((wf.k) this.f36074Z);
                return;
            case 8:
                AmazonBilling.a((AmazonBilling) this.f36074Z);
                return;
            case 9:
                ThreadLocal threadLocal = L0.f33815a;
                File[] listFiles = ((File) this.f36074Z).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.lastModified() < L0.f33819e - TimeUnit.MINUTES.toMillis(5L)) {
                            N.x(file);
                        }
                    }
                    return;
                }
                return;
            case 10:
                ((C3614e) this.f36074Z).f34093a.f24909a.x();
                return;
            case 11:
                C3626q c3626q = (C3626q) this.f36074Z;
                c3626q.f34226g = c3626q.a(null, true);
                return;
            case 12:
                ((AppLifecycleIntegration) this.f36074Z).i();
                return;
            case 13:
                Ii.k kVar = (Ii.k) this.f36074Z;
                AbstractC3557B.c0("this$0", kVar);
                kVar.f8666f = Long.valueOf(SystemClock.uptimeMillis());
                return;
        }
    }
}
