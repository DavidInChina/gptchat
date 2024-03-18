package A;

import G0.AbstractC0579h;
import G0.AbstractC0585n;
import G0.AbstractC0590t;
import G0.AbstractC0591u;
import Z.C1724m0;
import Z.o1;
import android.view.View;
import l0.AbstractC4325q;
import nf.AbstractC4828h;
import q0.C5251c;
import t0.AbstractC5646e;

/* renamed from: A.z0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0056z0 extends AbstractC4325q implements AbstractC0585n, AbstractC0591u, AbstractC0590t, G0.v0, G0.j0 {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f336A0;

    /* renamed from: B0  reason: collision with root package name */
    public N0 f337B0;

    /* renamed from: C0  reason: collision with root package name */
    public View f338C0;

    /* renamed from: D0  reason: collision with root package name */
    public Z0.b f339D0;

    /* renamed from: E0  reason: collision with root package name */
    public M0 f340E0;

    /* renamed from: F0  reason: collision with root package name */
    public final C1724m0 f341F0;

    /* renamed from: G0  reason: collision with root package name */
    public long f342G0;

    /* renamed from: H0  reason: collision with root package name */
    public Z0.k f343H0;

    /* renamed from: s0  reason: collision with root package name */
    public wf.k f344s0;

    /* renamed from: t0  reason: collision with root package name */
    public wf.k f345t0;

    /* renamed from: u0  reason: collision with root package name */
    public wf.k f346u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f347v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f348w0;

    /* renamed from: x0  reason: collision with root package name */
    public long f349x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f350y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f351z0;

    public C0056z0(wf.k kVar, wf.k kVar2, wf.k kVar3, float f6, boolean z10, long j6, float f10, float f11, boolean z11, N0 n02) {
        this.f344s0 = kVar;
        this.f345t0 = kVar2;
        this.f346u0 = kVar3;
        this.f347v0 = f6;
        this.f348w0 = z10;
        this.f349x0 = j6;
        this.f350y0 = f10;
        this.f351z0 = f11;
        this.f336A0 = z11;
        this.f337B0 = n02;
        long j10 = C5251c.f43621d;
        this.f341F0 = AbstractC4828h.Z(new C5251c(j10), o1.f22665a);
        this.f342G0 = j10;
    }

    public final void A0() {
        Z0.b bVar;
        M0 m02 = this.f340E0;
        if (m02 != null) {
            ((O0) m02).b();
        }
        View view = this.f338C0;
        if (view == null || (bVar = this.f339D0) == null) {
            return;
        }
        this.f340E0 = this.f337B0.b(view, this.f348w0, this.f349x0, this.f350y0, this.f351z0, this.f336A0, bVar, this.f347v0);
        C0();
    }

    @Override // G0.v0
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final void B0() {
        Z0.b bVar;
        long j6;
        long j10;
        M0 m02 = this.f340E0;
        if (m02 == null || (bVar = this.f339D0) == null) {
            return;
        }
        long j11 = ((C5251c) this.f344s0.invoke(bVar)).f43623a;
        C1724m0 c1724m0 = this.f341F0;
        if (R4.b.z1(((C5251c) c1724m0.getValue()).f43623a) && R4.b.z1(j11)) {
            j6 = C5251c.h(((C5251c) c1724m0.getValue()).f43623a, j11);
        } else {
            j6 = C5251c.f43621d;
        }
        this.f342G0 = j6;
        if (R4.b.z1(j6)) {
            wf.k kVar = this.f345t0;
            if (kVar != null) {
                long j12 = ((C5251c) kVar.invoke(bVar)).f43623a;
                C5251c c5251c = new C5251c(j12);
                if (!R4.b.z1(j12)) {
                    c5251c = null;
                }
                if (c5251c != null) {
                    j10 = C5251c.h(((C5251c) c1724m0.getValue()).f43623a, c5251c.f43623a);
                    m02.a(this.f347v0, this.f342G0, j10);
                    C0();
                    return;
                }
            }
            j10 = C5251c.f43621d;
            m02.a(this.f347v0, this.f342G0, j10);
            C0();
            return;
        }
        ((O0) m02).b();
    }

    public final void C0() {
        Z0.b bVar;
        M0 m02 = this.f340E0;
        if (m02 == null || (bVar = this.f339D0) == null) {
            return;
        }
        O0 o02 = (O0) m02;
        long c10 = o02.c();
        Z0.k kVar = this.f343H0;
        if (!(kVar instanceof Z0.k) || c10 != kVar.f22804a) {
            wf.k kVar2 = this.f346u0;
            if (kVar2 != null) {
                kVar2.invoke(new Z0.g(bVar.p(Ng.H.z(o02.c()))));
            }
            this.f343H0 = new Z0.k(o02.c());
        }
    }

    @Override // G0.v0
    public final void W(L0.j jVar) {
        jVar.y(A0.f8a, new C0052x0(this, 0));
    }

    @Override // G0.j0
    public final void X() {
        AbstractC0579h.y(this, new C0052x0(this, 1));
    }

    @Override // G0.AbstractC0591u
    public final void b0(G0.g0 g0Var) {
        this.f341F0.setValue(new C5251c(androidx.compose.ui.layout.a.l(g0Var)));
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        ((G0.J) abstractC5646e).a();
        Ad.l.O0(p0(), null, null, new C0054y0(this, null), 3);
    }

    @Override // G0.v0
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // l0.AbstractC4325q
    public final void t0() {
        X();
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        M0 m02 = this.f340E0;
        if (m02 != null) {
            ((O0) m02).b();
        }
        this.f340E0 = null;
    }

    @Override // G0.AbstractC0590t
    public final /* synthetic */ void G() {
    }
}
