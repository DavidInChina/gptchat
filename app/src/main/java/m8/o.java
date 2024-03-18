package m8;

import K4.C0813a;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import x3.r;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f38985n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f38986a;

    /* renamed from: b  reason: collision with root package name */
    public final C0813a f38987b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f38992g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f38993h;

    /* renamed from: l  reason: collision with root package name */
    public r f38997l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f38998m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f38989d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f38990e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f38991f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final k f38995j = new k(0, this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f38996k = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f38988c = "AppUpdateService";

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f38994i = new WeakReference(null);

    public o(Context context, C0813a c0813a, Intent intent) {
        this.f38986a = context;
        this.f38987b = c0813a;
        this.f38993h = intent;
    }

    public static void b(o oVar, j jVar) {
        IInterface iInterface = oVar.f38998m;
        ArrayList arrayList = oVar.f38989d;
        C0813a c0813a = oVar.f38987b;
        if (iInterface == null && !oVar.f38992g) {
            c0813a.e("Initiate binding to the service.", new Object[0]);
            arrayList.add(jVar);
            r rVar = new r(oVar, 1);
            oVar.f38997l = rVar;
            oVar.f38992g = true;
            if (!oVar.f38986a.bindService(oVar.f38993h, rVar, 1)) {
                c0813a.e("Failed to bind to the service.", new Object[0]);
                oVar.f38992g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    K0.e eVar = new K0.e();
                    N7.f fVar = ((j) it.next()).f38974Y;
                    if (fVar != null) {
                        fVar.a(eVar);
                    }
                }
                arrayList.clear();
            }
        } else if (oVar.f38992g) {
            c0813a.e("Waiting to bind to the service.", new Object[0]);
            arrayList.add(jVar);
        } else {
            jVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f38985n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f38988c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f38988c, 10);
                    handlerThread.start();
                    hashMap.put(this.f38988c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f38988c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(N7.f fVar) {
        synchronized (this.f38991f) {
            this.f38990e.remove(fVar);
        }
        a().post(new m(0, this));
    }

    public final void d() {
        HashSet hashSet = this.f38990e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((N7.f) it.next()).a(new RemoteException(String.valueOf(this.f38988c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
