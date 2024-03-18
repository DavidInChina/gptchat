package u8;

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

/* renamed from: u8.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5852b {

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f46472o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f46473a;

    /* renamed from: b  reason: collision with root package name */
    public final C5865o f46474b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f46479g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f46480h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC5868r f46481i;

    /* renamed from: m  reason: collision with root package name */
    public x3.r f46485m;

    /* renamed from: n  reason: collision with root package name */
    public IInterface f46486n;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f46476d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f46477e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f46478f = new Object();

    /* renamed from: k  reason: collision with root package name */
    public final m8.k f46483k = new m8.k(2, this);

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f46484l = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f46475c = "ExpressIntegrityService";

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference f46482j = new WeakReference(null);

    public C5852b(Context context, C5865o c5865o, Intent intent) {
        o8.g gVar = o8.g.f40946a;
        this.f46473a = context;
        this.f46474b = c5865o;
        this.f46480h = intent;
        this.f46481i = gVar;
    }

    public static void b(C5852b c5852b, AbstractRunnableC5866p abstractRunnableC5866p) {
        IInterface iInterface = c5852b.f46486n;
        ArrayList arrayList = c5852b.f46476d;
        C5865o c5865o = c5852b.f46474b;
        if (iInterface == null && !c5852b.f46479g) {
            c5865o.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(abstractRunnableC5866p);
            x3.r rVar = new x3.r(c5852b, 3);
            c5852b.f46485m = rVar;
            c5852b.f46479g = true;
            if (!c5852b.f46473a.bindService(c5852b.f46480h, rVar, 1)) {
                c5865o.b("Failed to bind to the service.", new Object[0]);
                c5852b.f46479g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC5866p) it.next()).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (c5852b.f46479g) {
            c5865o.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(abstractRunnableC5866p);
        } else {
            abstractRunnableC5866p.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f46472o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f46475c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f46475c, 10);
                    handlerThread.start();
                    hashMap.put(this.f46475c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f46475c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(N7.f fVar) {
        synchronized (this.f46478f) {
            this.f46477e.remove(fVar);
        }
        a().post(new C5851a(1, this));
    }

    public final void d() {
        HashSet hashSet = this.f46477e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((N7.f) it.next()).a(new RemoteException(String.valueOf(this.f46475c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
