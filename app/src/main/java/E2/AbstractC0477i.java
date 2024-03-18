package E2;

import N.C1025i;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import z2.C6755D;

/* renamed from: E2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0477i extends AbstractC0469a {

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f4356h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public Handler f4357i;

    /* renamed from: j  reason: collision with root package name */
    public v2.F f4358j;

    @Override // E2.AbstractC0469a
    public final void c() {
        for (C0476h c0476h : this.f4356h.values()) {
            c0476h.f4350a.b(c0476h.f4351b);
        }
    }

    @Override // E2.AbstractC0469a
    public final void e() {
        for (C0476h c0476h : this.f4356h.values()) {
            c0476h.f4350a.d(c0476h.f4351b);
        }
    }

    @Override // E2.AbstractC0469a
    public void i() {
        for (C0476h c0476h : this.f4356h.values()) {
            c0476h.f4350a.i();
        }
    }

    @Override // E2.AbstractC0469a
    public void o() {
        HashMap hashMap = this.f4356h;
        for (C0476h c0476h : hashMap.values()) {
            c0476h.f4350a.n(c0476h.f4351b);
            AbstractC0469a abstractC0469a = c0476h.f4350a;
            U3.n nVar = c0476h.f4352c;
            abstractC0469a.q(nVar);
            abstractC0469a.p(nVar);
        }
        hashMap.clear();
    }

    public abstract C0492y s(Object obj, C0492y c0492y);

    public abstract void v(Object obj, AbstractC0469a abstractC0469a, p2.g0 g0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [E2.g, E2.z] */
    /* JADX WARN: Type inference failed for: r2v0, types: [E2.C, U3.n, java.lang.Object, B2.o] */
    /* JADX WARN: Type inference failed for: r3v3, types: [E2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [B2.m, java.lang.Object] */
    public final void w(final Object obj, AbstractC0469a abstractC0469a) {
        HashMap hashMap = this.f4356h;
        Gi.e.l(!hashMap.containsKey(obj));
        ?? r12 = new AbstractC0493z() { // from class: E2.g
            @Override // E2.AbstractC0493z
            public final void a(AbstractC0469a abstractC0469a2, p2.g0 g0Var) {
                AbstractC0477i.this.v(obj, abstractC0469a2, g0Var);
            }
        };
        ?? obj2 = new Object();
        obj2.f17429i0 = this;
        obj2.f17427Z = new C1025i((CopyOnWriteArrayList) this.f4277c.f12352i0, 0, (C0492y) null);
        obj2.f17428h0 = new B2.n(this.f4278d.f1815c, 0, null);
        obj2.f17426Y = obj;
        hashMap.put(obj, new C0476h(abstractC0469a, r12, obj2));
        Handler handler = this.f4357i;
        handler.getClass();
        C1025i c1025i = abstractC0469a.f4277c;
        c1025i.getClass();
        ?? obj3 = new Object();
        obj3.f4126a = handler;
        obj3.f4127b = obj2;
        ((CopyOnWriteArrayList) c1025i.f12352i0).add(obj3);
        Handler handler2 = this.f4357i;
        handler2.getClass();
        B2.n nVar = abstractC0469a.f4278d;
        nVar.getClass();
        ?? obj4 = new Object();
        obj4.f1811a = handler2;
        obj4.f1812b = obj2;
        nVar.f1815c.add(obj4);
        v2.F f6 = this.f4358j;
        C6755D c6755d = this.f4281g;
        Gi.e.o(c6755d);
        abstractC0469a.j(r12, f6, c6755d);
        if (!(!this.f4276b.isEmpty())) {
            abstractC0469a.b(r12);
        }
    }

    public long t(Object obj, long j6) {
        return j6;
    }

    public int u(int i10, Object obj) {
        return i10;
    }
}
