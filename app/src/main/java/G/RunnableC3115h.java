package g;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.view.View;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.EnumC3642e1;
import io.sentry.G;
import io.sentry.P;
import io.sentry.r1;
import j.AbstractC3873c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o1.AbstractC4890e;
import r1.AbstractC5355b;
import u.BinderC5819a;

/* renamed from: g.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3115h implements Runnable, io.sentry.backpressure.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30952Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f30953Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f30954h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f30955i0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunnableC3115h(int i10, ArrayList arrayList) {
        this(arrayList, i10, (Throwable) null);
        this.f30952Y = 5;
    }

    @Override // io.sentry.backpressure.a
    public final int a() {
        return this.f30953Z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3873c abstractC3873c;
        int i10 = this.f30952Y;
        int i11 = 0;
        Object obj = this.f30955i0;
        Object obj2 = this.f30954h0;
        switch (i10) {
            case 0:
                C3116i c3116i = (C3116i) obj2;
                int i12 = this.f30953Z;
                Object obj3 = ((J0.a) obj).f8729Y;
                String str = (String) c3116i.f35810a.get(Integer.valueOf(i12));
                if (str != null) {
                    j.f fVar = (j.f) c3116i.f35814e.get(str);
                    if (fVar != null && (abstractC3873c = fVar.f35806a) != null) {
                        if (c3116i.f35813d.remove(str)) {
                            abstractC3873c.d(obj3);
                            return;
                        }
                        return;
                    }
                    c3116i.f35816g.remove(str);
                    c3116i.f35815f.put(str, obj3);
                    return;
                }
                return;
            case 1:
                ((C3116i) obj2).a(this.f30953Z, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 2:
                ((BinderC5819a) obj2).getClass();
                throw null;
            case 3:
                String[] strArr = (String[]) obj;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj2;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i11 < length) {
                    iArr[i11] = packageManager.checkPermission(strArr[i11], packageName);
                    i11++;
                }
                ((AbstractC4890e) activity).onRequestPermissionsResult(this.f30953Z, strArr, iArr);
                return;
            case 4:
                int i13 = this.f30953Z;
                AbstractC5355b abstractC5355b = (AbstractC5355b) ((F4.a) obj).f5033Z;
                if (abstractC5355b != null) {
                    abstractC5355b.e(i13);
                    return;
                }
                return;
            case 5:
                List list = (List) obj;
                int size = list.size();
                if (this.f30953Z != 1) {
                    while (i11 < size) {
                        ((Q1.j) list.get(i11)).a();
                        i11++;
                    }
                    return;
                }
                while (i11 < size) {
                    ((Q1.j) list.get(i11)).b();
                    i11++;
                }
                return;
            case 6:
                ((O3.j) obj).b((Intent) obj2, this.f30953Z);
                return;
            case 7:
                ((SystemForegroundService) obj2).f25547j0.notify(this.f30953Z, (Notification) obj);
                return;
            case 8:
                ((BottomSheetBehavior) obj2).E((View) obj, this.f30953Z, false);
                return;
            default:
                if (((G) obj2).g()) {
                    if (this.f30953Z > 0) {
                        ((r1) obj).getLogger().f(EnumC3642e1.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
                    }
                    this.f30953Z = 0;
                } else {
                    int i14 = this.f30953Z;
                    if (i14 < 10) {
                        this.f30953Z = i14 + 1;
                        ((r1) obj).getLogger().f(EnumC3642e1.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f30953Z));
                    }
                }
                P executorService = ((r1) obj).getExecutorService();
                if (!executorService.f()) {
                    executorService.l(this, (long) ErrorBoundaryKt.SAMPLING_RATE);
                    return;
                }
                return;
        }
    }

    @Override // io.sentry.backpressure.a
    public final void start() {
        P executorService = ((r1) this.f30955i0).getExecutorService();
        if (!executorService.f()) {
            executorService.l(this, 500);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunnableC3115h(Q1.j jVar, int i10) {
        this(Arrays.asList(jVar), i10, (Throwable) null);
        this.f30952Y = 5;
        R4.b.U(jVar, "initCallback cannot be null");
    }

    public RunnableC3115h(r1 r1Var) {
        io.sentry.A a5 = io.sentry.A.f33710a;
        this.f30952Y = 9;
        this.f30953Z = 0;
        this.f30955i0 = r1Var;
        this.f30954h0 = a5;
    }

    public /* synthetic */ RunnableC3115h(Object obj, int i10, Object obj2, int i11) {
        this.f30952Y = i11;
        this.f30954h0 = obj;
        this.f30953Z = i10;
        this.f30955i0 = obj2;
    }

    public /* synthetic */ RunnableC3115h(Object obj, Intent intent, int i10) {
        this.f30952Y = 6;
        this.f30955i0 = obj;
        this.f30954h0 = intent;
        this.f30953Z = i10;
    }

    public /* synthetic */ RunnableC3115h(Object obj, Object obj2, int i10, int i11) {
        this.f30952Y = i11;
        this.f30954h0 = obj;
        this.f30955i0 = obj2;
        this.f30953Z = i10;
    }

    public RunnableC3115h(List list, int i10, Throwable th2) {
        this.f30952Y = 5;
        R4.b.U(list, "initCallbacks cannot be null");
        this.f30955i0 = new ArrayList(list);
        this.f30953Z = i10;
        this.f30954h0 = th2;
    }
}
