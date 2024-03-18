package ke;

import K4.J;
import Ng.C1084s;
import Ng.G;
import Pg.C;
import Pg.C1168a;
import Wh.D;
import Wh.I;
import Wh.K;
import Wh.w;
import Wh.z;
import id.AbstractC3557B;
import ii.C3591f;
import io.ktor.websocket.A;
import io.ktor.websocket.EnumC3606a;
import java.util.List;
import java.util.concurrent.CancellationException;
import jf.y;
import ji.C4138m;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class o extends K implements io.ktor.websocket.c {

    /* renamed from: Y  reason: collision with root package name */
    public final I f37428Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4831k f37429Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C1084s f37430h0 = A7.b.j();

    /* renamed from: i0  reason: collision with root package name */
    public final C1084s f37431i0 = A7.b.j();

    /* renamed from: j0  reason: collision with root package name */
    public final Pg.k f37432j0 = Bi.c.d(0, null, 7);

    /* renamed from: k0  reason: collision with root package name */
    public final C1084s f37433k0 = A7.b.j();

    /* renamed from: l0  reason: collision with root package name */
    public final C1168a f37434l0;

    public o(w wVar, I i10, z zVar, AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("engine", wVar);
        AbstractC3557B.c0("webSocketFactory", i10);
        AbstractC3557B.c0("engineRequest", zVar);
        AbstractC3557B.c0("coroutineContext", abstractC4831k);
        this.f37428Y = i10;
        this.f37429Z = abstractC4831k;
        wf.n nVar = new n(this, zVar, null);
        C4832l c4832l = C4832l.f40334Y;
        G g10 = G.f12867Y;
        AbstractC4831k O10 = J.O(this, c4832l);
        Pg.k d10 = Bi.c.d(0, null, 6);
        G g11 = G.f12867Y;
        C1168a c1168a = new C1168a(O10, d10, true);
        c1168a.s0(g10, c1168a, nVar);
        this.f37434l0 = c1168a;
    }

    @Override // io.ktor.websocket.z
    public final void F0(long j6) {
        throw new N7.a("Max frame size switch is not supported in OkHttp engine.", 3);
    }

    @Override // io.ktor.websocket.z
    public final Object H0(io.ktor.websocket.m mVar, A a5) {
        Object n10 = d0().n(mVar, a5);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        y yVar = y.f36177a;
        if (n10 != enumC5000a) {
            n10 = yVar;
        }
        if (n10 == enumC5000a) {
            return n10;
        }
        return yVar;
    }

    @Override // io.ktor.websocket.z
    public final long P0() {
        return Long.MAX_VALUE;
    }

    @Override // Wh.K
    public final void a(C3591f c3591f, int i10, String str) {
        Object obj;
        AbstractC3557B.c0("webSocket", c3591f);
        short s10 = (short) i10;
        this.f37433k0.b0(new io.ktor.websocket.b(str, s10));
        this.f37432j0.l(null);
        StringBuilder sb2 = new StringBuilder("WebSocket session closed with code ");
        EnumC3606a enumC3606a = (EnumC3606a) EnumC3606a.f33606Z.get(Short.valueOf(s10));
        if (enumC3606a == null || (obj = enumC3606a.toString()) == null) {
            obj = Integer.valueOf(i10);
        }
        sb2.append(obj);
        sb2.append('.');
        this.f37434l0.l(new CancellationException(sb2.toString()));
    }

    @Override // Wh.K
    public final void b(C3591f c3591f, int i10, String str) {
        AbstractC3557B.c0("webSocket", c3591f);
        short s10 = (short) i10;
        this.f37433k0.b0(new io.ktor.websocket.b(str, s10));
        try {
            R4.b.m2(this.f37434l0, new io.ktor.websocket.m(new io.ktor.websocket.b(str, s10)));
        } catch (Throwable unused) {
        }
        this.f37432j0.l(null);
    }

    @Override // Wh.K
    public final void c(Wh.J j6, Throwable th2, D d10) {
        AbstractC3557B.c0("webSocket", j6);
        this.f37433k0.q0(th2);
        this.f37431i0.q0(th2);
        this.f37432j0.o(th2, false);
        this.f37434l0.l(th2);
    }

    @Override // Wh.K
    public final void d(C3591f c3591f, String str) {
        byte[] bytes = str.getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("getBytes(...)", bytes);
        R4.b.m2(this.f37432j0, new io.ktor.websocket.p(bytes, false, false, false));
    }

    @Override // io.ktor.websocket.z
    public final Pg.D d0() {
        return this.f37434l0;
    }

    @Override // Wh.K
    public final void e(C3591f c3591f, C4138m c4138m) {
        R4.b.m2(this.f37432j0, new io.ktor.websocket.l(c4138m.q(), false, false, false));
    }

    @Override // Wh.K
    public final void f(C3591f c3591f, D d10) {
        AbstractC3557B.c0("webSocket", c3591f);
        super.f(c3591f, d10);
        this.f37431i0.b0(d10);
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f37429Z;
    }

    @Override // io.ktor.websocket.z
    public final C r() {
        return this.f37432j0;
    }

    @Override // io.ktor.websocket.z
    public final Object u0(A a5) {
        return y.f36177a;
    }

    @Override // io.ktor.websocket.c
    public final void w0(List list) {
        if (list.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Extensions are not supported.".toString());
    }
}
