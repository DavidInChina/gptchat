package L;

import E0.AbstractC0461u;
import H0.T0;
import N0.AbstractC1047f;
import N0.C1046e;
import Z.AbstractC1739u0;
import Z.C1724m0;
import Z.C1741v0;
import Z.o1;
import nf.AbstractC4828h;
import r0.C5342f;

/* loaded from: classes2.dex */
public final class P0 {

    /* renamed from: a  reason: collision with root package name */
    public w0 f10029a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1739u0 f10030b;

    /* renamed from: c  reason: collision with root package name */
    public final T0 f10031c;

    /* renamed from: d  reason: collision with root package name */
    public final T0.j f10032d;

    /* renamed from: e  reason: collision with root package name */
    public T0.F f10033e;

    /* renamed from: f  reason: collision with root package name */
    public final C1724m0 f10034f;

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f10035g;

    /* renamed from: h  reason: collision with root package name */
    public AbstractC0461u f10036h;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f10037i;

    /* renamed from: j  reason: collision with root package name */
    public C1046e f10038j;

    /* renamed from: k  reason: collision with root package name */
    public final C1724m0 f10039k;

    /* renamed from: l  reason: collision with root package name */
    public final C1724m0 f10040l;

    /* renamed from: m  reason: collision with root package name */
    public final C1724m0 f10041m;

    /* renamed from: n  reason: collision with root package name */
    public final C1724m0 f10042n;

    /* renamed from: o  reason: collision with root package name */
    public final C1724m0 f10043o;

    /* renamed from: q  reason: collision with root package name */
    public final C1724m0 f10045q;

    /* renamed from: r  reason: collision with root package name */
    public final C0859l0 f10046r;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10044p = true;

    /* renamed from: s  reason: collision with root package name */
    public wf.k f10047s = C0868q.f10277t0;

    /* renamed from: t  reason: collision with root package name */
    public final G f10048t = new G(this, 4);

    /* renamed from: u  reason: collision with root package name */
    public final G f10049u = new G(this, 3);

    /* renamed from: v  reason: collision with root package name */
    public final C5342f f10050v = androidx.compose.ui.graphics.a.f();

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, T0.j] */
    public P0(w0 w0Var, C1741v0 c1741v0, T0 t02) {
        this.f10029a = w0Var;
        this.f10030b = c1741v0;
        this.f10031c = t02;
        ?? obj = new Object();
        C1046e c1046e = AbstractC1047f.f12516a;
        T0.z zVar = new T0.z(c1046e, N0.D.f12483b, (N0.D) null);
        obj.f16789a = zVar;
        obj.f16790b = new T0.k(c1046e, zVar.f16831b);
        this.f10032d = obj;
        Boolean bool = Boolean.FALSE;
        o1 o1Var = o1.f22665a;
        this.f10034f = AbstractC4828h.Z(bool, o1Var);
        this.f10035g = AbstractC4828h.Z(new Z0.e(0), o1Var);
        this.f10037i = AbstractC4828h.Z(null, o1Var);
        this.f10039k = AbstractC4828h.Z(Z.f10085Y, o1Var);
        this.f10040l = AbstractC4828h.Z(bool, o1Var);
        this.f10041m = AbstractC4828h.Z(bool, o1Var);
        this.f10042n = AbstractC4828h.Z(bool, o1Var);
        this.f10043o = AbstractC4828h.Z(bool, o1Var);
        this.f10045q = AbstractC4828h.Z(Boolean.TRUE, o1Var);
        this.f10046r = new C0859l0(t02);
    }

    public final Z a() {
        return (Z) this.f10039k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f10034f.getValue()).booleanValue();
    }

    public final AbstractC0461u c() {
        AbstractC0461u abstractC0461u = this.f10036h;
        if (abstractC0461u == null || !abstractC0461u.i()) {
            return null;
        }
        return abstractC0461u;
    }

    public final Q0 d() {
        return (Q0) this.f10037i.getValue();
    }
}
