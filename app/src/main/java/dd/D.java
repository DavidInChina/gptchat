package E2;

import N.C1025i;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z2.C6755D;

/* renamed from: E2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0469a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4275a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f4276b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final C1025i f4277c = new C1025i(3);

    /* renamed from: d  reason: collision with root package name */
    public final B2.n f4278d = new B2.n(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e  reason: collision with root package name */
    public Looper f4279e;

    /* renamed from: f  reason: collision with root package name */
    public p2.g0 f4280f;

    /* renamed from: g  reason: collision with root package name */
    public C6755D f4281g;

    public abstract AbstractC0490w a(C0492y c0492y, I2.d dVar, long j6);

    public final void b(AbstractC0493z abstractC0493z) {
        HashSet hashSet = this.f4276b;
        boolean z10 = !hashSet.isEmpty();
        hashSet.remove(abstractC0493z);
        if (z10 && hashSet.isEmpty()) {
            c();
        }
    }

    public final void d(AbstractC0493z abstractC0493z) {
        this.f4279e.getClass();
        HashSet hashSet = this.f4276b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(abstractC0493z);
        if (isEmpty) {
            e();
        }
    }

    public p2.g0 f() {
        return null;
    }

    public abstract p2.H g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(AbstractC0493z abstractC0493z, v2.F f6, C6755D c6755d) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f4279e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.l(z10);
        this.f4281g = c6755d;
        p2.g0 g0Var = this.f4280f;
        this.f4275a.add(abstractC0493z);
        if (this.f4279e == null) {
            this.f4279e = myLooper;
            this.f4276b.add(abstractC0493z);
            k(f6);
        } else if (g0Var != null) {
            d(abstractC0493z);
            abstractC0493z.a(this, g0Var);
        }
    }

    public abstract void k(v2.F f6);

    public final void l(p2.g0 g0Var) {
        this.f4280f = g0Var;
        Iterator it = this.f4275a.iterator();
        while (it.hasNext()) {
            ((AbstractC0493z) it.next()).a(this, g0Var);
        }
    }

    public abstract void m(AbstractC0490w abstractC0490w);

    public final void n(AbstractC0493z abstractC0493z) {
        ArrayList arrayList = this.f4275a;
        arrayList.remove(abstractC0493z);
        if (arrayList.isEmpty()) {
            this.f4279e = null;
            this.f4280f = null;
            this.f4281g = null;
            this.f4276b.clear();
            o();
            return;
        }
        b(abstractC0493z);
    }

    public abstract void o();

    public final void p(B2.o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4278d.f1815c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            B2.m mVar = (B2.m) it.next();
            if (mVar.f1812b == oVar) {
                copyOnWriteArrayList.remove(mVar);
            }
        }
    }

    public final void q(C c10) {
        C1025i c1025i = this.f4277c;
        Iterator it = ((CopyOnWriteArrayList) c1025i.f12352i0).iterator();
        while (it.hasNext()) {
            B b10 = (B) it.next();
            if (b10.f4127b == c10) {
                ((CopyOnWriteArrayList) c1025i.f12352i0).remove(b10);
            }
        }
    }

    public void c() {
    }

    public void e() {
    }

    public void r(p2.H h10) {
    }
}
