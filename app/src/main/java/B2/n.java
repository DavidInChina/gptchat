package B2;

import E2.C0492y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f1813a;

    /* renamed from: b  reason: collision with root package name */
    public final C0492y f1814b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f1815c;

    public n(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C0492y c0492y) {
        this.f1815c = copyOnWriteArrayList;
        this.f1813a = i10;
        this.f1814b = c0492y;
    }

    public final void a() {
        Iterator it = this.f1815c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            AbstractC5530A.F(mVar.f1811a, new l(this, mVar.f1812b, 3));
        }
    }

    public final void b() {
        Iterator it = this.f1815c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            AbstractC5530A.F(mVar.f1811a, new l(this, mVar.f1812b, 1));
        }
    }

    public final void c() {
        Iterator it = this.f1815c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            AbstractC5530A.F(mVar.f1811a, new l(this, mVar.f1812b, 2));
        }
    }

    public final void d(int i10) {
        Iterator it = this.f1815c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            AbstractC5530A.F(mVar.f1811a, new s2.l(this, mVar.f1812b, i10, 2));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.f1815c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            AbstractC5530A.F(mVar.f1811a, new Q1.n(this, mVar.f1812b, exc, 8));
        }
    }

    public final void f() {
        Iterator it = this.f1815c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            AbstractC5530A.F(mVar.f1811a, new l(this, mVar.f1812b, 0));
        }
    }
}
