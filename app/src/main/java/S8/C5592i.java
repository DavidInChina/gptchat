package s8;

import Q1.u;
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
import m8.k;
import x3.r;

/* renamed from: s8.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5592i {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f45450n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f45451a;

    /* renamed from: b  reason: collision with root package name */
    public final u f45452b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f45457g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f45458h;

    /* renamed from: l  reason: collision with root package name */
    public r f45462l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f45463m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f45454d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f45455e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f45456f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final k f45460j = new k(1, this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f45461k = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f45453c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f45459i = new WeakReference(null);

    public C5592i(Context context, u uVar, Intent intent) {
        this.f45451a = context;
        this.f45452b = uVar;
        this.f45458h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f45450n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f45453c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f45453c, 10);
                    handlerThread.start();
                    hashMap.put(this.f45453c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f45453c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f45456f) {
            try {
                Iterator it = this.f45455e.iterator();
                while (it.hasNext()) {
                    ((N7.f) it.next()).a(new RemoteException(String.valueOf(this.f45453c).concat(" : Binder has died.")));
                }
                this.f45455e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
