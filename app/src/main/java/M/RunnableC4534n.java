package m;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.ExecutorC5333a;
import u3.AbstractC5831d;
import w.C6055b;
import w.C6060g;
import y1.AbstractC6492b;

/* renamed from: m.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4534n implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38778Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f38779Z;

    public /* synthetic */ RunnableC4534n(Context context, int i10) {
        this.f38778Y = i10;
        this.f38779Z = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        y1.k kVar;
        Object obj;
        Context context;
        int i10 = this.f38778Y;
        Context context2 = this.f38779Z;
        switch (i10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AbstractC6492b.a()) {
                            C6060g c6060g = AbstractC4537q.f38786l0;
                            c6060g.getClass();
                            C6055b c6055b = new C6055b(c6060g);
                            while (true) {
                                if (c6055b.hasNext()) {
                                    AbstractC4537q abstractC4537q = (AbstractC4537q) ((WeakReference) c6055b.next()).get();
                                    if (abstractC4537q != null && (context = ((LayoutInflater$Factory2C4511H) abstractC4537q).f38654p0) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                kVar = new y1.k(new y1.n(AbstractC4536p.a(obj)));
                                if (kVar.f50327a.isEmpty()) {
                                    String u12 = A7.b.u1(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        AbstractC4536p.b(systemService, AbstractC4535o.a(u12));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            kVar = y1.k.f50326b;
                            if (kVar.f50327a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            kVar = AbstractC4537q.f38782h0;
                            break;
                        }
                    }
                }
                AbstractC4537q.f38785k0 = true;
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC4534n(context2, 2));
                return;
            default:
                AbstractC5831d.o(context2, new ExecutorC5333a(5), AbstractC5831d.f46361a, false);
                return;
        }
    }
}
