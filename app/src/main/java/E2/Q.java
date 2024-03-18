package E2;

import N.C1025i;
import android.os.Looper;
import g.RunnableC3118k;
import h.C3276b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import s2.AbstractC5530A;
import v2.AbstractC5968g;
import v2.AbstractC5969h;
import z2.C6755D;

/* loaded from: classes.dex */
public final class Q extends AbstractC0469a {

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC5968g f4220h;

    /* renamed from: i  reason: collision with root package name */
    public final C3276b f4221i;

    /* renamed from: j  reason: collision with root package name */
    public final B2.q f4222j;

    /* renamed from: k  reason: collision with root package name */
    public final R4.a f4223k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4224l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4225m = true;

    /* renamed from: n  reason: collision with root package name */
    public long f4226n = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4227o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4228p;

    /* renamed from: q  reason: collision with root package name */
    public v2.F f4229q;

    /* renamed from: r  reason: collision with root package name */
    public p2.H f4230r;

    public Q(p2.H h10, AbstractC5968g abstractC5968g, C3276b c3276b, B2.q qVar, R4.a aVar, int i10) {
        this.f4230r = h10;
        this.f4220h = abstractC5968g;
        this.f4221i = c3276b;
        this.f4222j = qVar;
        this.f4223k = aVar;
        this.f4224l = i10;
    }

    @Override // E2.AbstractC0469a
    public final AbstractC0490w a(C0492y c0492y, I2.d dVar, long j6) {
        AbstractC5969h a5 = this.f4220h.a();
        v2.F f6 = this.f4229q;
        if (f6 != null) {
            a5.g(f6);
        }
        p2.C c10 = g().f41808Z;
        c10.getClass();
        Gi.e.o(this.f4281g);
        U3.u uVar = new U3.u((L2.t) this.f4221i.f31647Z);
        B2.n nVar = new B2.n(this.f4278d.f1815c, 0, c0492y);
        C1025i c1025i = new C1025i((CopyOnWriteArrayList) this.f4277c.f12352i0, 0, c0492y);
        long C10 = AbstractC5530A.C(c10.f41768n0);
        return new N(c10.f41760Y, a5, uVar, this.f4222j, nVar, this.f4223k, c1025i, this, dVar, c10.f41765k0, this.f4224l, C10);
    }

    @Override // E2.AbstractC0469a
    public final synchronized p2.H g() {
        return this.f4230r;
    }

    @Override // E2.AbstractC0469a
    public final void k(v2.F f6) {
        this.f4229q = f6;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        C6755D c6755d = this.f4281g;
        Gi.e.o(c6755d);
        B2.q qVar = this.f4222j;
        qVar.e(myLooper, c6755d);
        qVar.g();
        s();
    }

    @Override // E2.AbstractC0469a
    public final void m(AbstractC0490w abstractC0490w) {
        X[] xArr;
        N n10 = (N) abstractC0490w;
        if (n10.f4175B0) {
            for (X x10 : n10.f4211y0) {
                x10.h();
                B2.k kVar = x10.f4256h;
                if (kVar != null) {
                    kVar.c(x10.f4253e);
                    x10.f4256h = null;
                    x10.f4255g = null;
                }
            }
        }
        I2.n nVar = n10.f4202p0;
        I2.j jVar = nVar.f8009b;
        if (jVar != null) {
            jVar.a(true);
        }
        RunnableC3118k runnableC3118k = new RunnableC3118k(10, n10);
        ExecutorService executorService = nVar.f8008a;
        executorService.execute(runnableC3118k);
        executorService.shutdown();
        n10.f4207u0.removeCallbacksAndMessages(null);
        n10.f4209w0 = null;
        n10.f4191R0 = true;
    }

    @Override // E2.AbstractC0469a
    public final void o() {
        this.f4222j.release();
    }

    @Override // E2.AbstractC0469a
    public final synchronized void r(p2.H h10) {
        this.f4230r = h10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [E2.O] */
    /* JADX WARN: Type inference failed for: r7v0, types: [E2.Q, E2.a] */
    public final void s() {
        b0 b0Var = new b0(this.f4226n, this.f4227o, this.f4228p, g());
        if (this.f4225m) {
            b0Var = new O((Q) this, b0Var);
        }
        l(b0Var);
    }

    public final void t(long j6, boolean z10, boolean z11) {
        if (j6 == -9223372036854775807L) {
            j6 = this.f4226n;
        }
        if (!this.f4225m && this.f4226n == j6 && this.f4227o == z10 && this.f4228p == z11) {
            return;
        }
        this.f4226n = j6;
        this.f4227o = z10;
        this.f4228p = z11;
        this.f4225m = false;
        s();
    }

    @Override // E2.AbstractC0469a
    public final void i() {
    }
}
