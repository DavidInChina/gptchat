package q;

import D1.RunnableC0370p0;
import K4.C0816d;
import K4.C0822j;
import Ng.AbstractC1070k;
import V1.C1471l;
import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.work.Worker;
import com.google.android.gms.internal.play_billing.AbstractC2446f;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.C2442d;
import com.google.android.gms.internal.play_billing.C2454j;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import m.ExecutorC4519P;
import n2.C4710a;
import o1.AbstractC4894i;
import o1.C4893h;
import o2.RunnableC4904a;
import q7.C5281b;
import t7.C5680b;
import u7.AbstractC5847c;
import v7.BinderC5982C;
import v7.C5983a;
import v7.C5987e;
import w7.AbstractBinderC6129a;
import w7.AbstractC6135g;

/* renamed from: q.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5216j implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43442Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f43443Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f43444h0;

    public /* synthetic */ RunnableC5216j(Object obj, int i10, Object obj2) {
        this.f43442Y = i10;
        this.f43444h0 = obj;
        this.f43443Z = obj2;
    }

    private void a() {
        U3.q c10 = ((T3.c) this.f43444h0).f16892Y.f11522k.c((String) this.f43443Z);
        if (c10 != null && c10.b()) {
            synchronized (((T3.c) this.f43444h0).f16894h0) {
                ((T3.c) this.f43444h0).f16897k0.put(Gi.e.y(c10), c10);
                Object obj = this.f43444h0;
                ((T3.c) this.f43444h0).f16898l0.put(Gi.e.y(c10), Q3.l.a(((T3.c) obj).f16899m0, c10, ((T3.c) obj).f16893Z.f21780b, (T3.c) obj));
            }
        }
    }

    private void b() {
        try {
            ((Runnable) this.f43444h0).run();
            synchronized (((V3.n) this.f43443Z).f18359i0) {
                ((V3.n) this.f43443Z).b();
            }
        } catch (Throwable th2) {
            synchronized (((V3.n) this.f43443Z).f18359i0) {
                ((V3.n) this.f43443Z).b();
                throw th2;
            }
        }
    }

    private final void c() {
        synchronized (((N7.i) this.f43444h0).f12729h0) {
            try {
                Object obj = ((N7.i) this.f43444h0).f12730i0;
                if (((N7.b) obj) != null) {
                    ((N7.b) obj).b((N7.m) this.f43443Z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        synchronized (((N7.i) this.f43444h0).f12729h0) {
            try {
                Object obj = ((N7.i) this.f43444h0).f12730i0;
                if (((N7.c) obj) != null) {
                    Exception c10 = ((N7.m) this.f43443Z).c();
                    A7.b.k0(c10);
                    ((N7.c) obj).g(c10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v55, types: [A8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [M3.J] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v53, types: [W3.i] */
    @Override // java.lang.Runnable
    public final void run() {
        p.m mVar;
        Throwable e10;
        AbstractC6135g abstractC6135g;
        Set set;
        AbstractC6135g j6;
        AbstractC6135g abstractC6135g2 = null;
        switch (this.f43442Y) {
            case 0:
                C5222m c5222m = (C5222m) this.f43444h0;
                p.o oVar = c5222m.f43455h0;
                if (oVar != null && (mVar = oVar.f41609e) != null) {
                    mVar.w(oVar);
                }
                View view = (View) c5222m.f43460m0;
                if (view != null && view.getWindowToken() != null) {
                    C5212h c5212h = (C5212h) this.f43443Z;
                    if (!c5212h.b()) {
                        if (c5212h.f41502f != null) {
                            c5212h.d(0, 0, false, false);
                        }
                    }
                    c5222m.f43471x0 = c5212h;
                }
                c5222m.f43473z0 = null;
                return;
            case 1:
            default:
                ((AbstractC1070k) this.f43443Z).q((Og.d) this.f43444h0);
                return;
            case 2:
                ((C4893h) this.f43443Z).f40452Y = this.f43444h0;
                return;
            case 3:
                ((Application) this.f43443Z).unregisterActivityLifecycleCallbacks((C4893h) this.f43444h0);
                return;
            case 4:
                try {
                    Method method = AbstractC4894i.f40461d;
                    Object obj = this.f43444h0;
                    Object obj2 = this.f43443Z;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC4894i.f40462e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e11) {
                    if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                        throw e11;
                    }
                    return;
                } catch (Throwable th2) {
                    AbstractC3612c.d("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 5:
                ((C1471l) this.f43443Z).h();
                return;
            case 6:
                RunnableC4904a runnableC4904a = (RunnableC4904a) this.f43444h0;
                Object obj3 = this.f43443Z;
                if (runnableC4904a.f40509h0.get()) {
                    o2.b bVar = runnableC4904a.f40511j0;
                    if (bVar.f40520i == runnableC4904a) {
                        SystemClock.uptimeMillis();
                        bVar.f40520i = null;
                        bVar.b();
                    }
                } else {
                    o2.b bVar2 = runnableC4904a.f40511j0;
                    if (bVar2.f40519h != runnableC4904a) {
                        if (bVar2.f40520i == runnableC4904a) {
                            SystemClock.uptimeMillis();
                            bVar2.f40520i = null;
                            bVar2.b();
                        }
                    } else if (!bVar2.f40515d) {
                        SystemClock.uptimeMillis();
                        bVar2.f40519h = null;
                        o2.c cVar = bVar2.f40513b;
                        if (cVar != null) {
                            C4710a c4710a = (C4710a) cVar;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                c4710a.i(obj3);
                            } else {
                                c4710a.g(obj3);
                            }
                        }
                    }
                }
                runnableC4904a.f40508Z = 3;
                return;
            case 7:
                try {
                    ((Worker) this.f43444h0).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th3) {
                    ((W3.i) this.f43443Z).k(th3);
                    return;
                }
            case 8:
                if (!(((M3.J) this.f43444h0).f11561u0.f20718Y instanceof W3.a)) {
                    try {
                        ((A8.a) this.f43443Z).get();
                        L3.s.d().a(M3.J.f11545w0, "Starting work for " + ((M3.J) this.f43444h0).f11548h0.f17452c);
                        Object obj4 = this.f43444h0;
                        ((M3.J) obj4).f11561u0.l(((M3.J) obj4).f11549i0.c());
                        return;
                    } catch (Throwable th4) {
                        ((M3.J) this.f43444h0).f11561u0.k(th4);
                        return;
                    }
                }
                return;
            case 9:
                Object obj5 = this.f43443Z;
                ?? r12 = this.f43444h0;
                try {
                    try {
                        L3.q qVar = (L3.q) ((M3.J) r12).f11561u0.get();
                        if (qVar == null) {
                            L3.s.d().b(M3.J.f11545w0, ((M3.J) r12).f11548h0.f17452c + " returned a null result. Treating it as a failure.");
                        } else {
                            L3.s.d().a(M3.J.f11545w0, ((M3.J) r12).f11548h0.f17452c + " returned a " + qVar + Separators.DOT);
                            ((M3.J) r12).f11551k0 = qVar;
                        }
                    } catch (Throwable th5) {
                        ((M3.J) r12).b();
                        throw th5;
                    }
                } catch (InterruptedException e12) {
                    e10 = e12;
                    L3.s.d().c(M3.J.f11545w0, ((String) obj5) + " failed because it threw an exception/error", e10);
                } catch (CancellationException e13) {
                    L3.s d10 = L3.s.d();
                    String str = M3.J.f11545w0;
                    String str2 = ((String) obj5) + " was cancelled";
                    if (d10.f10731a <= 4) {
                        Log.i(str, str2, e13);
                    }
                } catch (ExecutionException e14) {
                    e10 = e14;
                    L3.s.d().c(M3.J.f11545w0, ((String) obj5) + " failed because it threw an exception/error", e10);
                }
                r12 = (M3.J) r12;
                r12.b();
                return;
            case 10:
                L3.s d11 = L3.s.d();
                String str3 = N3.a.f12683e;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                U3.q qVar2 = (U3.q) this.f43443Z;
                sb2.append(qVar2.f17450a);
                d11.a(str3, sb2.toString());
                ((N3.a) this.f43444h0).f12684a.d(qVar2);
                return;
            case 11:
                a();
                return;
            case 12:
                b();
                return;
            case 13:
                if (!(((V3.r) this.f43444h0).f18368Y.f20718Y instanceof W3.a)) {
                    try {
                        L3.i iVar = (L3.i) ((W3.i) this.f43443Z).get();
                        if (iVar != null) {
                            L3.s.d().a(V3.r.f18367l0, "Updating notification for " + ((V3.r) this.f43444h0).f18370h0.f17452c);
                            Object obj6 = this.f43444h0;
                            ?? r13 = ((V3.r) obj6).f18368Y;
                            L3.j jVar = ((V3.r) obj6).f18372j0;
                            Context context = ((V3.r) obj6).f18369Z;
                            UUID uuid = ((V3.r) obj6).f18371i0.f10726Z.f25519a;
                            V3.s sVar = (V3.s) jVar;
                            sVar.getClass();
                            ?? obj7 = new Object();
                            sVar.f18374a.a(new RunnableC0370p0(sVar, obj7, uuid, iVar, context, 1));
                            r13.l(obj7);
                            return;
                        }
                        throw new IllegalStateException("Worker was marked important (" + ((V3.r) this.f43444h0).f18370h0.f17452c + ") but did not provide ForegroundInfo");
                    } catch (Throwable th6) {
                        ((V3.r) this.f43444h0).f18368Y.k(th6);
                        return;
                    }
                }
                return;
            case 14:
                K4.G g10 = ((C0816d) this.f43443Z).f9404f;
                C0822j c0822j = K4.H.f9362k;
                ((U3.u) g10).S(K4.F.b(24, 9, c0822j));
                C2442d c2442d = AbstractC2446f.f26919Z;
                ((K4.s) this.f43444h0).b(c0822j, C2454j.f26930j0);
                return;
            case 15:
                K4.G g11 = ((C0816d) this.f43443Z).f9404f;
                C0822j c0822j2 = K4.H.f9362k;
                ((U3.u) g11).S(K4.F.b(24, 11, c0822j2));
                ((com.revenuecat.purchases.google.usecase.d) this.f43444h0).a(c0822j2, null);
                return;
            case 16:
                K4.G g12 = ((C0816d) this.f43443Z).f9404f;
                C0822j c0822j3 = K4.H.f9362k;
                ((U3.u) g12).S(K4.F.b(24, 7, c0822j3));
                ((K4.r) this.f43444h0).a(c0822j3, new ArrayList());
                return;
            case 17:
                C0816d c0816d = (C0816d) this.f43443Z;
                C0822j c0822j4 = (C0822j) this.f43444h0;
                if (c0816d.f9402d.f9392b != null) {
                    c0816d.f9402d.f9392b.onPurchasesUpdated(c0822j4, null);
                    return;
                } else {
                    AbstractC2468q.e("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 18:
                K4.G g13 = ((C0816d) this.f43443Z).f9404f;
                C0822j c0822j5 = K4.H.f9362k;
                ((U3.u) g13).S(K4.F.b(24, 3, c0822j5));
                ((com.revenuecat.purchases.google.usecase.a) this.f43444h0).c(c0822j5);
                return;
            case 19:
                K4.G g14 = ((C0816d) this.f43443Z).f9404f;
                C0822j c0822j6 = K4.H.f9362k;
                ((U3.u) g14).S(K4.F.b(24, 13, c0822j6));
                ((com.revenuecat.purchases.google.usecase.b) this.f43444h0).a(c0822j6, null);
                return;
            case 20:
                Future future = (Future) this.f43443Z;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.f43444h0;
                    future.cancel(true);
                    AbstractC2468q.e("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                Object obj8 = this.f43444h0;
                v7.u uVar = (v7.u) obj8;
                v7.s sVar2 = (v7.s) ((C5987e) uVar.f47348k0).f47310o0.get((C5983a) uVar.f47345h0);
                if (sVar2 != null) {
                    C5680b c5680b = (C5680b) this.f43443Z;
                    if (c5680b.f45761Z == 0) {
                        uVar.f47343Y = true;
                        if (((AbstractC5847c) uVar.f47344Z).g()) {
                            if (uVar.f47343Y && (abstractC6135g = (AbstractC6135g) uVar.f47346i0) != null) {
                                ((AbstractC5847c) uVar.f47344Z).d(abstractC6135g, (Set) uVar.f47347j0);
                                return;
                            }
                            return;
                        }
                        try {
                            Object obj9 = ((v7.u) obj8).f47344Z;
                            ((AbstractC5847c) obj9).d(null, ((AbstractC5847c) obj9).a());
                            return;
                        } catch (SecurityException e15) {
                            AbstractC3612c.d("GoogleApiManager", "Failed to get service from broker. ", e15);
                            ((AbstractC5847c) uVar.f47344Z).c("Failed to get service from broker.");
                            sVar2.n(new C5680b(10), null);
                            return;
                        }
                    }
                    sVar2.n(c5680b, null);
                    return;
                }
                return;
            case 22:
                BinderC5982C binderC5982C = (BinderC5982C) this.f43444h0;
                M7.i iVar2 = (M7.i) this.f43443Z;
                C5281b c5281b = BinderC5982C.f47267h;
                C5680b c5680b2 = iVar2.f11721Z;
                if (c5680b2.f45761Z == 0) {
                    w7.u uVar2 = iVar2.f11722h0;
                    A7.b.k0(uVar2);
                    C5680b c5680b3 = uVar2.f48202h0;
                    if (c5680b3.f45761Z == 0) {
                        v7.u uVar3 = binderC5982C.f47274g;
                        IBinder iBinder = uVar2.f48201Z;
                        if (iBinder != null) {
                            int i10 = AbstractBinderC6129a.f48106b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof AbstractC6135g) {
                                j6 = (AbstractC6135g) queryLocalInterface;
                            } else {
                                j6 = new w7.J(iBinder);
                            }
                            abstractC6135g2 = j6;
                        }
                        uVar3.getClass();
                        if (abstractC6135g2 != null && (set = binderC5982C.f47271d) != null) {
                            uVar3.f47346i0 = abstractC6135g2;
                            uVar3.f47347j0 = set;
                            if (uVar3.f47343Y) {
                                ((AbstractC5847c) uVar3.f47344Z).d(abstractC6135g2, set);
                            }
                        } else {
                            AbstractC3612c.u("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            uVar3.b(new C5680b(4));
                        }
                    } else {
                        AbstractC3612c.u("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c5680b3)), new Exception());
                        binderC5982C.f47274g.b(c5680b3);
                        binderC5982C.f47273f.e();
                        return;
                    }
                } else {
                    binderC5982C.f47274g.b(c5680b2);
                }
                binderC5982C.f47273f.e();
                return;
            case 23:
                ((v7.o) this.f43444h0).getClass();
                return;
            case 24:
                c();
                return;
            case 25:
                d();
                return;
            case 26:
                synchronized (((N7.i) this.f43444h0).f12729h0) {
                    try {
                        Object obj10 = ((N7.i) this.f43444h0).f12730i0;
                        if (((N7.d) obj10) != null) {
                            ((N7.d) obj10).a(((N7.m) this.f43443Z).d());
                        }
                    } finally {
                    }
                }
                return;
            case 27:
                Object obj11 = this.f43444h0;
                try {
                    N7.m H6 = ((N7.j) obj11).f12732Z.H(((N7.m) this.f43443Z).d());
                    N7.j jVar2 = (N7.j) obj11;
                    ExecutorC4519P executorC4519P = N7.g.f12725b;
                    H6.b(executorC4519P, jVar2);
                    H6.f12736b.i(new N7.i((Executor) executorC4519P, (N7.c) jVar2));
                    H6.i();
                    H6.f12736b.i(new N7.i(executorC4519P, jVar2));
                    H6.i();
                    return;
                } catch (N7.e e16) {
                    if (e16.getCause() instanceof Exception) {
                        ((N7.j) obj11).g((Exception) e16.getCause());
                        return;
                    } else {
                        ((N7.j) obj11).g(e16);
                        return;
                    }
                } catch (CancellationException unused) {
                    ((N7.j) obj11).c();
                    return;
                } catch (Exception e17) {
                    ((N7.j) obj11).g(e17);
                    return;
                }
            case 28:
                ((AbstractC1070k) this.f43444h0).q((Ng.B) this.f43443Z);
                return;
        }
    }

    public /* synthetic */ RunnableC5216j(Object obj, Object obj2, int i10) {
        this.f43442Y = i10;
        this.f43443Z = obj;
        this.f43444h0 = obj2;
    }
}
