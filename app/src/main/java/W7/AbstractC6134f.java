package w7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import n2.C4711b;
import t7.C5680b;
import t7.C5682d;
import u7.AbstractC5847c;
import v7.AbstractC5986d;
import v7.AbstractC5991i;

/* renamed from: w7.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6134f implements AbstractC5847c {

    /* renamed from: z  reason: collision with root package name */
    public static final C5682d[] f48138z = new C5682d[0];

    /* renamed from: a  reason: collision with root package name */
    public volatile String f48139a;

    /* renamed from: b  reason: collision with root package name */
    public C4711b f48140b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f48141c;

    /* renamed from: d  reason: collision with root package name */
    public final I f48142d;

    /* renamed from: e  reason: collision with root package name */
    public final z f48143e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f48144f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f48145g;

    /* renamed from: h  reason: collision with root package name */
    public x f48146h;

    /* renamed from: i  reason: collision with root package name */
    public AbstractC6130b f48147i;

    /* renamed from: j  reason: collision with root package name */
    public IInterface f48148j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f48149k;

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnectionC6124B f48150l;

    /* renamed from: m  reason: collision with root package name */
    public int f48151m;

    /* renamed from: n  reason: collision with root package name */
    public final J0.a f48152n;

    /* renamed from: o  reason: collision with root package name */
    public final J0.a f48153o;

    /* renamed from: p  reason: collision with root package name */
    public final int f48154p;

    /* renamed from: q  reason: collision with root package name */
    public final String f48155q;

    /* renamed from: r  reason: collision with root package name */
    public volatile String f48156r;

    /* renamed from: s  reason: collision with root package name */
    public C5680b f48157s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f48158t;

    /* renamed from: u  reason: collision with root package name */
    public volatile C6127E f48159u;

    /* renamed from: v  reason: collision with root package name */
    public final AtomicInteger f48160v;

    /* renamed from: w  reason: collision with root package name */
    public final C6131c f48161w;

    /* renamed from: x  reason: collision with root package name */
    public final Set f48162x;

    /* renamed from: y  reason: collision with root package name */
    public final Account f48163y;

    public AbstractC6134f(Context context, Looper looper, int i10, C6131c c6131c, AbstractC5986d abstractC5986d, AbstractC5991i abstractC5991i) {
        synchronized (I.f48095h) {
            try {
                if (I.f48096i == null) {
                    I.f48096i = new I(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        I i11 = I.f48096i;
        Object obj = t7.e.f45770c;
        A7.b.k0(abstractC5986d);
        A7.b.k0(abstractC5991i);
        J0.a aVar = new J0.a(abstractC5986d);
        J0.a aVar2 = new J0.a(abstractC5991i);
        String str = c6131c.f48113g;
        this.f48139a = null;
        this.f48144f = new Object();
        this.f48145g = new Object();
        this.f48149k = new ArrayList();
        this.f48151m = 1;
        this.f48157s = null;
        this.f48158t = false;
        this.f48159u = null;
        this.f48160v = new AtomicInteger(0);
        A7.b.l0(context, "Context must not be null");
        this.f48141c = context;
        A7.b.l0(looper, "Looper must not be null");
        A7.b.l0(i11, "Supervisor must not be null");
        this.f48142d = i11;
        this.f48143e = new z(this, looper);
        this.f48154p = i10;
        this.f48152n = aVar;
        this.f48153o = aVar2;
        this.f48155q = str;
        this.f48161w = c6131c;
        this.f48163y = c6131c.f48107a;
        Set<Scope> set = c6131c.f48109c;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f48162x = set;
    }

    public static /* bridge */ /* synthetic */ void t(AbstractC6134f abstractC6134f) {
        int i10;
        int i11;
        synchronized (abstractC6134f.f48144f) {
            i10 = abstractC6134f.f48151m;
        }
        if (i10 == 3) {
            abstractC6134f.f48158t = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        z zVar = abstractC6134f.f48143e;
        zVar.sendMessage(zVar.obtainMessage(i11, abstractC6134f.f48160v.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean u(AbstractC6134f abstractC6134f, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC6134f.f48144f) {
            try {
                if (abstractC6134f.f48151m != i10) {
                    return false;
                }
                abstractC6134f.v(i11, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // u7.AbstractC5847c
    public final Set a() {
        if (g()) {
            return this.f48162x;
        }
        return Collections.emptySet();
    }

    @Override // u7.AbstractC5847c
    public final void c(String str) {
        this.f48139a = str;
        e();
    }

    @Override // u7.AbstractC5847c
    public final void d(AbstractC6135g abstractC6135g, Set set) {
        Throwable e10;
        Bundle k10 = k();
        String str = this.f48156r;
        int i10 = t7.f.f45772a;
        Scope[] scopeArr = C6133e.f48122t0;
        Bundle bundle = new Bundle();
        int i11 = this.f48154p;
        C5682d[] c5682dArr = C6133e.f48123u0;
        C6133e c6133e = new C6133e(6, i11, i10, null, null, scopeArr, bundle, null, c5682dArr, c5682dArr, true, 0, false, str);
        c6133e.f48127i0 = this.f48141c.getPackageName();
        c6133e.f48130l0 = k10;
        if (set != null) {
            c6133e.f48129k0 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (g()) {
            Account account = this.f48163y;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            c6133e.f48131m0 = account;
            if (abstractC6135g != null) {
                c6133e.f48128j0 = abstractC6135g.asBinder();
            }
        }
        c6133e.f48132n0 = f48138z;
        c6133e.f48133o0 = j();
        if (s()) {
            c6133e.f48136r0 = true;
        }
        try {
            synchronized (this.f48145g) {
                try {
                    x xVar = this.f48146h;
                    if (xVar != null) {
                        xVar.g(new BinderC6123A(this, this.f48160v.get()), c6133e);
                    } else {
                        AbstractC3612c.r("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (DeadObjectException e11) {
            AbstractC3612c.s("GmsClient", "IGmsServiceBroker.getService failed", e11);
            int i12 = this.f48160v.get();
            z zVar = this.f48143e;
            zVar.sendMessage(zVar.obtainMessage(6, i12, 3));
        } catch (RemoteException e12) {
            e10 = e12;
            AbstractC3612c.s("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i13 = this.f48160v.get();
            C6125C c6125c = new C6125C(this, 8, null, null);
            z zVar2 = this.f48143e;
            zVar2.sendMessage(zVar2.obtainMessage(1, i13, -1, c6125c));
        } catch (SecurityException e13) {
            throw e13;
        } catch (RuntimeException e14) {
            e10 = e14;
            AbstractC3612c.s("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i132 = this.f48160v.get();
            C6125C c6125c2 = new C6125C(this, 8, null, null);
            z zVar22 = this.f48143e;
            zVar22.sendMessage(zVar22.obtainMessage(1, i132, -1, c6125c2));
        }
    }

    @Override // u7.AbstractC5847c
    public final void e() {
        this.f48160v.incrementAndGet();
        synchronized (this.f48149k) {
            try {
                int size = this.f48149k.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((v) this.f48149k.get(i10)).d();
                }
                this.f48149k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f48145g) {
            this.f48146h = null;
        }
        v(1, null);
    }

    @Override // u7.AbstractC5847c
    public /* bridge */ /* synthetic */ boolean g() {
        return false;
    }

    public abstract IInterface i(IBinder iBinder);

    public /* bridge */ /* synthetic */ C5682d[] j() {
        return f48138z;
    }

    public Bundle k() {
        return new Bundle();
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.f48144f) {
            try {
                if (this.f48151m != 5) {
                    if (p()) {
                        iInterface = this.f48148j;
                        A7.b.l0(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String m();

    public abstract String n();

    public boolean o() {
        if (f() >= 211700000) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f48144f) {
            if (this.f48151m == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f48144f) {
            int i10 = this.f48151m;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void r() {
        System.currentTimeMillis();
    }

    public /* bridge */ /* synthetic */ boolean s() {
        return false;
    }

    public final void v(int i10, IInterface iInterface) {
        boolean z10;
        C4711b c4711b;
        boolean z11 = false;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface != null) {
            z11 = true;
        }
        if (z10 == z11) {
            synchronized (this.f48144f) {
                try {
                    this.f48151m = i10;
                    this.f48148j = iInterface;
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            if (i10 == 4) {
                                A7.b.k0(iInterface);
                                System.currentTimeMillis();
                            }
                        } else {
                            ServiceConnectionC6124B serviceConnectionC6124B = this.f48150l;
                            if (serviceConnectionC6124B != null && (c4711b = this.f48140b) != null) {
                                AbstractC3612c.c("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) c4711b.f39602h0) + " on " + ((String) c4711b.f39603i0));
                                I i11 = this.f48142d;
                                String str = (String) this.f48140b.f39602h0;
                                A7.b.k0(str);
                                String str2 = (String) this.f48140b.f39603i0;
                                if (this.f48155q == null) {
                                    this.f48141c.getClass();
                                }
                                i11.b(str, str2, serviceConnectionC6124B, this.f48140b.f39601Z);
                                this.f48160v.incrementAndGet();
                            }
                            ServiceConnectionC6124B serviceConnectionC6124B2 = new ServiceConnectionC6124B(this, this.f48160v.get());
                            this.f48150l = serviceConnectionC6124B2;
                            C4711b c4711b2 = new C4711b(n(), o());
                            this.f48140b = c4711b2;
                            if (c4711b2.f39601Z && f() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f48140b.f39602h0)));
                            }
                            I i12 = this.f48142d;
                            String str3 = (String) this.f48140b.f39602h0;
                            A7.b.k0(str3);
                            String str4 = (String) this.f48140b.f39603i0;
                            String str5 = this.f48155q;
                            if (str5 == null) {
                                str5 = this.f48141c.getClass().getName();
                            }
                            if (!i12.c(new C6128F(str3, str4, this.f48140b.f39601Z), serviceConnectionC6124B2, str5)) {
                                C4711b c4711b3 = this.f48140b;
                                AbstractC3612c.r("GmsClient", "unable to connect to service: " + ((String) c4711b3.f39602h0) + " on " + ((String) c4711b3.f39603i0));
                                int i13 = this.f48160v.get();
                                C6126D c6126d = new C6126D(this, 16);
                                z zVar = this.f48143e;
                                zVar.sendMessage(zVar.obtainMessage(7, i13, -1, c6126d));
                            }
                        }
                    } else {
                        ServiceConnectionC6124B serviceConnectionC6124B3 = this.f48150l;
                        if (serviceConnectionC6124B3 != null) {
                            I i14 = this.f48142d;
                            String str6 = (String) this.f48140b.f39602h0;
                            A7.b.k0(str6);
                            String str7 = (String) this.f48140b.f39603i0;
                            if (this.f48155q == null) {
                                this.f48141c.getClass();
                            }
                            i14.b(str6, str7, serviceConnectionC6124B3, this.f48140b.f39601Z);
                            this.f48150l = null;
                        }
                    }
                } finally {
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
