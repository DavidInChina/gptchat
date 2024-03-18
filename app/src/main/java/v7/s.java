package v7;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import t7.C5680b;
import t7.C5682d;
import w.C6049A;
import w7.AbstractC6134f;
import w7.C6127E;
import w7.C6131c;

/* loaded from: classes2.dex */
public final class s implements u7.h, u7.i {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6134f f47329b;

    /* renamed from: c  reason: collision with root package name */
    public final C5983a f47330c;

    /* renamed from: d  reason: collision with root package name */
    public final C3636c1 f47331d;

    /* renamed from: g  reason: collision with root package name */
    public final int f47334g;

    /* renamed from: h  reason: collision with root package name */
    public final BinderC5982C f47335h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f47336i;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C5987e f47340m;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f47328a = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f47332e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f47333f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f47337j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public C5680b f47338k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f47339l = 0;

    public s(C5987e c5987e, u7.g gVar) {
        this.f47340m = c5987e;
        Looper looper = c5987e.f47313r0.getLooper();
        C6131c a5 = gVar.a().a();
        Bi.c cVar = (Bi.c) gVar.f46458c.f17492Z;
        A7.b.k0(cVar);
        AbstractC6134f V10 = cVar.V(gVar.f46456a, looper, a5, gVar.f46459d, this, this);
        String str = gVar.f46457b;
        if (str != null) {
            V10.f48156r = str;
        }
        this.f47329b = V10;
        this.f47330c = gVar.f46460e;
        this.f47331d = new C3636c1(14);
        this.f47334g = gVar.f46462g;
        if (V10.g()) {
            this.f47335h = new BinderC5982C(c5987e.f47305j0, c5987e.f47313r0, gVar.a().a());
        } else {
            this.f47335h = null;
        }
    }

    public final void a(C5680b c5680b) {
        HashSet hashSet = this.f47332e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (M3.H.P(c5680b, C5680b.f45759j0)) {
                AbstractC6134f abstractC6134f = this.f47329b;
                if (!abstractC6134f.p() || abstractC6134f.f48140b == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
            }
            throw null;
        }
        hashSet.clear();
    }

    public final void b(Status status) {
        A7.b.h0(this.f47340m.f47313r0);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z10) {
        boolean z11;
        A7.b.h0(this.f47340m.f47313r0);
        boolean z12 = true;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (runtimeException != null) {
            z12 = false;
        }
        if (z11 != z12) {
            Iterator it = this.f47328a.iterator();
            while (it.hasNext()) {
                G g10 = (G) it.next();
                if (!z10 || g10.f47280a == 2) {
                    if (status != null) {
                        g10.a(status);
                    } else {
                        g10.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void d() {
        LinkedList linkedList = this.f47328a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            G g10 = (G) arrayList.get(i10);
            if (this.f47329b.p()) {
                if (j(g10)) {
                    linkedList.remove(g10);
                }
            } else {
                return;
            }
        }
    }

    public final void e() {
        C5987e c5987e = this.f47340m;
        A7.b.h0(c5987e.f47313r0);
        this.f47338k = null;
        a(C5680b.f45759j0);
        if (this.f47336i) {
            H7.d dVar = c5987e.f47313r0;
            C5983a c5983a = this.f47330c;
            dVar.removeMessages(11, c5983a);
            c5987e.f47313r0.removeMessages(9, c5983a);
            this.f47336i = false;
        }
        Iterator it = this.f47333f.values().iterator();
        if (!it.hasNext()) {
            d();
            i();
            return;
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final void f(int i10) {
        A7.b.h0(this.f47340m.f47313r0);
        this.f47338k = null;
        this.f47336i = true;
        String str = this.f47329b.f48139a;
        C3636c1 c3636c1 = this.f47331d;
        c3636c1.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        c3636c1.y(true, new Status(20, sb2.toString(), null, null));
        C5983a c5983a = this.f47330c;
        H7.d dVar = this.f47340m.f47313r0;
        dVar.sendMessageDelayed(Message.obtain(dVar, 9, c5983a), 5000L);
        C5983a c5983a2 = this.f47330c;
        H7.d dVar2 = this.f47340m.f47313r0;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 11, c5983a2), 120000L);
        this.f47340m.f47307l0.x();
        Iterator it = this.f47333f.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    @Override // v7.AbstractC5986d
    public final void g(int i10) {
        Looper myLooper = Looper.myLooper();
        C5987e c5987e = this.f47340m;
        if (myLooper == c5987e.f47313r0.getLooper()) {
            f(i10);
        } else {
            c5987e.f47313r0.post(new T3.e(this, i10, 1));
        }
    }

    @Override // v7.AbstractC5991i
    public final void h(C5680b c5680b) {
        n(c5680b, null);
    }

    public final void i() {
        C5987e c5987e = this.f47340m;
        H7.d dVar = c5987e.f47313r0;
        C5983a c5983a = this.f47330c;
        dVar.removeMessages(12, c5983a);
        H7.d dVar2 = c5987e.f47313r0;
        dVar2.sendMessageDelayed(dVar2.obtainMessage(12, c5983a), c5987e.f47301Y);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [w.A, w.f] */
    public final boolean j(G g10) {
        C5682d c5682d;
        C5682d[] c5682dArr;
        if (!(g10 instanceof x)) {
            AbstractC6134f abstractC6134f = this.f47329b;
            g10.d(this.f47331d, abstractC6134f.g());
            try {
                g10.c(this);
            } catch (DeadObjectException unused) {
                g(1);
                abstractC6134f.c("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        x xVar = (x) g10;
        C5682d[] g11 = xVar.g(this);
        if (g11 != null && g11.length != 0) {
            C6127E c6127e = this.f47329b.f48159u;
            if (c6127e == null) {
                c5682dArr = null;
            } else {
                c5682dArr = c6127e.f48080Z;
            }
            if (c5682dArr == null) {
                c5682dArr = new C5682d[0];
            }
            ?? c6049a = new C6049A(c5682dArr.length);
            for (C5682d c5682d2 : c5682dArr) {
                c6049a.put(c5682d2.f45767Y, Long.valueOf(c5682d2.c()));
            }
            int length = g11.length;
            for (int i10 = 0; i10 < length; i10++) {
                c5682d = g11[i10];
                Long l10 = (Long) c6049a.get(c5682d.f45767Y);
                if (l10 == null || l10.longValue() < c5682d.c()) {
                    break;
                }
            }
        }
        c5682d = null;
        if (c5682d == null) {
            AbstractC6134f abstractC6134f2 = this.f47329b;
            g10.d(this.f47331d, abstractC6134f2.g());
            try {
                g10.c(this);
            } catch (DeadObjectException unused2) {
                g(1);
                abstractC6134f2.c("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        AbstractC3612c.r("GoogleApiManager", this.f47329b.getClass().getName() + " could not execute call because it requires feature (" + c5682d.f45767Y + ", " + c5682d.c() + ").");
        if (this.f47340m.f47314s0 && xVar.f(this)) {
            t tVar = new t(this.f47330c, c5682d);
            int indexOf = this.f47337j.indexOf(tVar);
            if (indexOf >= 0) {
                t tVar2 = (t) this.f47337j.get(indexOf);
                this.f47340m.f47313r0.removeMessages(15, tVar2);
                H7.d dVar = this.f47340m.f47313r0;
                dVar.sendMessageDelayed(Message.obtain(dVar, 15, tVar2), 5000L);
            } else {
                this.f47337j.add(tVar);
                H7.d dVar2 = this.f47340m.f47313r0;
                dVar2.sendMessageDelayed(Message.obtain(dVar2, 15, tVar), 5000L);
                H7.d dVar3 = this.f47340m.f47313r0;
                dVar3.sendMessageDelayed(Message.obtain(dVar3, 16, tVar), 120000L);
                C5680b c5680b = new C5680b(2, null);
                if (!k(c5680b)) {
                    this.f47340m.b(c5680b, this.f47334g);
                }
            }
            return false;
        }
        xVar.b(new u7.n(c5682d));
        return true;
    }

    public final boolean k(C5680b c5680b) {
        synchronized (C5987e.f47299v0) {
            this.f47340m.getClass();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [L7.c, w7.f] */
    public final void l() {
        C5987e c5987e = this.f47340m;
        A7.b.h0(c5987e.f47313r0);
        AbstractC6134f abstractC6134f = this.f47329b;
        if (!abstractC6134f.p() && !abstractC6134f.q()) {
            try {
                int w10 = c5987e.f47307l0.w(c5987e.f47305j0, abstractC6134f);
                if (w10 != 0) {
                    C5680b c5680b = new C5680b(w10, null);
                    String name = abstractC6134f.getClass().getName();
                    String c5680b2 = c5680b.toString();
                    AbstractC3612c.r("GoogleApiManager", "The service for " + name + " is not available: " + c5680b2);
                    n(c5680b, null);
                    return;
                }
                u uVar = new u(c5987e, abstractC6134f, this.f47330c);
                if (abstractC6134f.g()) {
                    BinderC5982C binderC5982C = this.f47335h;
                    A7.b.k0(binderC5982C);
                    L7.c cVar = binderC5982C.f47273f;
                    if (cVar != null) {
                        cVar.e();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(binderC5982C));
                    C6131c c6131c = binderC5982C.f47272e;
                    c6131c.f48115i = valueOf;
                    Handler handler = binderC5982C.f47269b;
                    Looper looper = handler.getLooper();
                    binderC5982C.f47273f = binderC5982C.f47270c.V(binderC5982C.f47268a, looper, c6131c, c6131c.f48114h, binderC5982C, binderC5982C);
                    binderC5982C.f47274g = uVar;
                    Set set = binderC5982C.f47271d;
                    if (set != null && !set.isEmpty()) {
                        binderC5982C.f47273f.h();
                    } else {
                        handler.post(new RunnableC5981B(0, binderC5982C));
                    }
                }
                try {
                    abstractC6134f.f48147i = uVar;
                    abstractC6134f.v(2, null);
                } catch (SecurityException e10) {
                    n(new C5680b(10), e10);
                }
            } catch (IllegalStateException e11) {
                n(new C5680b(10), e11);
            }
        }
    }

    public final void m(G g10) {
        A7.b.h0(this.f47340m.f47313r0);
        boolean p10 = this.f47329b.p();
        LinkedList linkedList = this.f47328a;
        if (p10) {
            if (j(g10)) {
                i();
                return;
            } else {
                linkedList.add(g10);
                return;
            }
        }
        linkedList.add(g10);
        C5680b c5680b = this.f47338k;
        if (c5680b != null && c5680b.f45761Z != 0 && c5680b.f45762h0 != null) {
            n(c5680b, null);
        } else {
            l();
        }
    }

    public final void n(C5680b c5680b, RuntimeException runtimeException) {
        L7.c cVar;
        A7.b.h0(this.f47340m.f47313r0);
        BinderC5982C binderC5982C = this.f47335h;
        if (binderC5982C != null && (cVar = binderC5982C.f47273f) != null) {
            cVar.e();
        }
        A7.b.h0(this.f47340m.f47313r0);
        this.f47338k = null;
        this.f47340m.f47307l0.x();
        a(c5680b);
        if ((this.f47329b instanceof y7.d) && c5680b.f45761Z != 24) {
            C5987e c5987e = this.f47340m;
            c5987e.f47302Z = true;
            H7.d dVar = c5987e.f47313r0;
            dVar.sendMessageDelayed(dVar.obtainMessage(19), 300000L);
        }
        if (c5680b.f45761Z == 4) {
            b(C5987e.f47298u0);
        } else if (this.f47328a.isEmpty()) {
            this.f47338k = c5680b;
        } else if (runtimeException != null) {
            A7.b.h0(this.f47340m.f47313r0);
            c(null, runtimeException, false);
        } else if (this.f47340m.f47314s0) {
            c(C5987e.c(this.f47330c, c5680b), null, true);
            if (!this.f47328a.isEmpty() && !k(c5680b) && !this.f47340m.b(c5680b, this.f47334g)) {
                if (c5680b.f45761Z == 18) {
                    this.f47336i = true;
                }
                if (this.f47336i) {
                    C5987e c5987e2 = this.f47340m;
                    C5983a c5983a = this.f47330c;
                    H7.d dVar2 = c5987e2.f47313r0;
                    dVar2.sendMessageDelayed(Message.obtain(dVar2, 9, c5983a), 5000L);
                    return;
                }
                b(C5987e.c(this.f47330c, c5680b));
            }
        } else {
            b(C5987e.c(this.f47330c, c5680b));
        }
    }

    public final void o(C5680b c5680b) {
        A7.b.h0(this.f47340m.f47313r0);
        AbstractC6134f abstractC6134f = this.f47329b;
        String name = abstractC6134f.getClass().getName();
        String valueOf = String.valueOf(c5680b);
        abstractC6134f.c("onSignInFailed for " + name + " with " + valueOf);
        n(c5680b, null);
    }

    @Override // v7.AbstractC5986d
    public final void onConnected() {
        Looper myLooper = Looper.myLooper();
        C5987e c5987e = this.f47340m;
        if (myLooper == c5987e.f47313r0.getLooper()) {
            e();
        } else {
            c5987e.f47313r0.post(new RunnableC5981B(1, this));
        }
    }

    public final void p() {
        AbstractC5990h[] abstractC5990hArr;
        C5987e c5987e = this.f47340m;
        A7.b.h0(c5987e.f47313r0);
        Status status = C5987e.f47297t0;
        b(status);
        C3636c1 c3636c1 = this.f47331d;
        c3636c1.getClass();
        c3636c1.y(false, status);
        for (AbstractC5990h abstractC5990h : (AbstractC5990h[]) this.f47333f.keySet().toArray(new AbstractC5990h[0])) {
            m(new F(new N7.f()));
        }
        a(new C5680b(4));
        AbstractC6134f abstractC6134f = this.f47329b;
        if (abstractC6134f.p()) {
            r rVar = new r(this);
            abstractC6134f.getClass();
            c5987e.f47313r0.post(new RunnableC5981B(2, rVar));
        }
    }
}
