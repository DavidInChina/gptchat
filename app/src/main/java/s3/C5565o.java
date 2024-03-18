package s3;

import Qg.D0;
import Qg.F0;
import Qg.n0;
import Qg.s0;
import android.util.Log;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.d0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kf.AbstractC4273I;
import kf.C4288m;

/* renamed from: s3.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5565o {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f45323a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    public final F0 f45324b;

    /* renamed from: c  reason: collision with root package name */
    public final F0 f45325c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45326d;

    /* renamed from: e  reason: collision with root package name */
    public final n0 f45327e;

    /* renamed from: f  reason: collision with root package name */
    public final n0 f45328f;

    /* renamed from: g  reason: collision with root package name */
    public final W f45329g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractC5568s f45330h;

    public C5565o(AbstractC5568s abstractC5568s, W w10) {
        AbstractC3557B.c0("navigator", w10);
        this.f45330h = abstractC5568s;
        F0 c10 = s0.c(kf.v.f37483Y);
        this.f45324b = c10;
        F0 c11 = s0.c(kf.x.f37485Y);
        this.f45325c = c11;
        this.f45327e = new n0(c10);
        this.f45328f = new n0(c11);
        this.f45329g = w10;
    }

    public final void a(C5562l c5562l) {
        AbstractC3557B.c0("backStackEntry", c5562l);
        ReentrantLock reentrantLock = this.f45323a;
        reentrantLock.lock();
        try {
            F0 f02 = this.f45324b;
            f02.setValue(kf.t.x2(c5562l, (Collection) f02.getValue()));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C5562l c5562l) {
        C5569t c5569t;
        AbstractC3557B.c0("entry", c5562l);
        AbstractC5568s abstractC5568s = this.f45330h;
        boolean K10 = AbstractC3557B.K(abstractC5568s.f45365z.get(c5562l), Boolean.TRUE);
        F0 f02 = this.f45325c;
        f02.setValue(AbstractC4273I.s2((Set) f02.getValue(), c5562l));
        abstractC5568s.f45365z.remove(c5562l);
        C4288m c4288m = abstractC5568s.f45346g;
        boolean contains = c4288m.contains(c5562l);
        F0 f03 = abstractC5568s.f45348i;
        if (!contains) {
            abstractC5568s.w(c5562l);
            if (c5562l.f45312m0.f25386f.a(EnumC2082q.f25377h0)) {
                c5562l.g(EnumC2082q.f25375Y);
            }
            boolean z10 = c4288m instanceof Collection;
            String str = c5562l.f45310k0;
            if (!z10 || !c4288m.isEmpty()) {
                Iterator it = c4288m.iterator();
                while (it.hasNext()) {
                    if (AbstractC3557B.K(((C5562l) it.next()).f45310k0, str)) {
                        break;
                    }
                }
            }
            if (!K10 && (c5569t = abstractC5568s.f45355p) != null) {
                AbstractC3557B.c0("backStackEntryId", str);
                d0 d0Var = (d0) c5569t.f45367d.remove(str);
                if (d0Var != null) {
                    d0Var.a();
                }
            }
            abstractC5568s.x();
            f03.setValue(abstractC5568s.u());
        } else if (!this.f45326d) {
            abstractC5568s.x();
            abstractC5568s.f45347h.setValue(kf.t.M2(c4288m));
            f03.setValue(abstractC5568s.u());
        }
    }

    public final void c(C5562l c5562l, boolean z10) {
        AbstractC3557B.c0("popUpTo", c5562l);
        AbstractC5568s abstractC5568s = this.f45330h;
        W b10 = abstractC5568s.f45361v.b(c5562l.f45306Z.f45215Y);
        if (AbstractC3557B.K(b10, this.f45329g)) {
            wf.k kVar = abstractC5568s.f45364y;
            if (kVar != null) {
                kVar.invoke(c5562l);
                d(c5562l);
                return;
            }
            L.N n10 = new L.N(this, c5562l, z10, 2);
            C4288m c4288m = abstractC5568s.f45346g;
            int indexOf = c4288m.indexOf(c5562l);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + c5562l + " as it was not found on the current back stack");
                return;
            }
            int i10 = indexOf + 1;
            if (i10 != c4288m.f37476h0) {
                abstractC5568s.q(((C5562l) c4288m.get(i10)).f45306Z.f45221l0, true, false);
            }
            AbstractC5568s.t(abstractC5568s, c5562l);
            n10.mo122invoke();
            abstractC5568s.y();
            abstractC5568s.c();
            return;
        }
        Object obj = abstractC5568s.f45362w.get(b10);
        AbstractC3557B.Z(obj);
        ((C5565o) obj).c(c5562l, z10);
    }

    public final void d(C5562l c5562l) {
        AbstractC3557B.c0("popUpTo", c5562l);
        ReentrantLock reentrantLock = this.f45323a;
        reentrantLock.lock();
        try {
            F0 f02 = this.f45324b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) f02.getValue()) {
                if (!(!AbstractC3557B.K((C5562l) obj, c5562l))) {
                    break;
                }
                arrayList.add(obj);
            }
            f02.setValue(arrayList);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(C5562l c5562l, boolean z10) {
        Object obj;
        AbstractC3557B.c0("popUpTo", c5562l);
        F0 f02 = this.f45325c;
        Iterable iterable = (Iterable) f02.getValue();
        boolean z11 = iterable instanceof Collection;
        n0 n0Var = this.f45327e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C5562l) it.next()) == c5562l) {
                    Iterable<C5562l> iterable2 = (Iterable) n0Var.f14881Y.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (C5562l c5562l2 : iterable2) {
                            if (c5562l2 == c5562l) {
                            }
                        }
                    }
                }
            }
            this.f45330h.f45365z.put(c5562l, Boolean.valueOf(z10));
        }
        f02.setValue(AbstractC4273I.v2((Set) f02.getValue(), c5562l));
        List list = (List) n0Var.f14881Y.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                C5562l c5562l3 = (C5562l) obj;
                if (!AbstractC3557B.K(c5562l3, c5562l)) {
                    D0 d02 = n0Var.f14881Y;
                    if (((List) d02.getValue()).lastIndexOf(c5562l3) < ((List) d02.getValue()).lastIndexOf(c5562l)) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        C5562l c5562l4 = (C5562l) obj;
        if (c5562l4 != null) {
            f02.setValue(AbstractC4273I.v2((Set) f02.getValue(), c5562l4));
        }
        c(c5562l, z10);
        this.f45330h.f45365z.put(c5562l, Boolean.valueOf(z10));
    }

    public final void f(C5562l c5562l) {
        AbstractC3557B.c0("backStackEntry", c5562l);
        AbstractC5568s abstractC5568s = this.f45330h;
        W b10 = abstractC5568s.f45361v.b(c5562l.f45306Z.f45215Y);
        if (AbstractC3557B.K(b10, this.f45329g)) {
            wf.k kVar = abstractC5568s.f45363x;
            if (kVar != null) {
                kVar.invoke(c5562l);
                a(c5562l);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + c5562l.f45306Z + " outside of the call to navigate(). ");
            return;
        }
        Object obj = abstractC5568s.f45362w.get(b10);
        if (obj != null) {
            ((C5565o) obj).f(c5562l);
            return;
        }
        throw new IllegalStateException(R.a.t(new StringBuilder("NavigatorBackStack for "), c5562l.f45306Z.f45215Y, " should already be created").toString());
    }
}
