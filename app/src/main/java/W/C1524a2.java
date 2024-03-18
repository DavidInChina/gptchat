package W;

import Z.AbstractC1725n;
import Z.C1723m;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;
import l0.C4310b;
import wf.AbstractC6216a;

/* renamed from: W.a2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1524a2 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f19891Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19892Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f19893h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19894i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f19895j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f19896k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ r0.L f19897l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ long f19898m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ long f19899n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ float f19900o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19901p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f19902q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19903r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524a2(long j6, AbstractC6216a abstractC6216a, C1550f3 c1550f3, AbstractC4326r abstractC4326r, float f6, wf.k kVar, r0.L l10, long j10, long j11, float f10, wf.n nVar, Ng.F f11, wf.o oVar) {
        super(3);
        this.f19891Y = j6;
        this.f19892Z = abstractC6216a;
        this.f19893h0 = c1550f3;
        this.f19894i0 = abstractC4326r;
        this.f19895j0 = f6;
        this.f19896k0 = kVar;
        this.f19897l0 = l10;
        this.f19898m0 = j10;
        this.f19899n0 = j11;
        this.f19900o0 = f10;
        this.f19901p0 = nVar;
        this.f19902q0 = f11;
        this.f19903r0 = oVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        int i10;
        androidx.compose.foundation.layout.d dVar = (androidx.compose.foundation.layout.d) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((Z.r) abstractC1725n).g(dVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 19) == 18) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        int g10 = Z0.a.g(dVar.f24736b);
        C1550f3 c1550f3 = this.f19893h0;
        if (((EnumC1555g3) c1550f3.f20062c.f18998g.getValue()) != EnumC1555g3.f20078Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        A7.b.T(this.f19891Y, this.f19892Z, z10, abstractC1725n, 0);
        String w10 = kotlin.jvm.internal.m.w(R.string.m3c_bottom_sheet_pane_title, abstractC1725n);
        AbstractC4326r a5 = androidx.compose.foundation.layout.b.f24731a.a(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.e.n(this.f19894i0, 0.0f, this.f19895j0, 1), 1.0f), C4310b.f37694Z);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1482644208);
        boolean g11 = rVar2.g(w10);
        Object K10 = rVar2.K();
        Object obj4 = C1723m.f22654Y;
        if (g11 || K10 == obj4) {
            K10 = new G(w10, 3);
            rVar2.h0(K10);
        }
        rVar2.t(false);
        AbstractC4326r a10 = L0.l.a(a5, false, (wf.k) K10);
        rVar2.W(-1482644143);
        boolean g12 = rVar2.g(c1550f3);
        Object K11 = rVar2.K();
        if (g12 || K11 == obj4) {
            K11 = new W1(c1550f3, 0);
            rVar2.h0(K11);
        }
        rVar2.t(false);
        AbstractC4326r o10 = androidx.compose.foundation.layout.a.o(a10, (wf.k) K11);
        rVar2.W(-1482643839);
        boolean g13 = rVar2.g(c1550f3);
        Object K12 = rVar2.K();
        B.W0 w02 = B.W0.f1213Y;
        wf.k kVar = this.f19896k0;
        if (g13 || K12 == obj4) {
            float f6 = AbstractC1545e3.f20036a;
            K12 = new C1535c3(c1550f3, kVar);
            rVar2.h0(K12);
        }
        rVar2.t(false);
        AbstractC4326r a11 = androidx.compose.ui.input.nestedscroll.a.a(o10, (A0.a) K12, null);
        C c10 = c1550f3.f20062c;
        B.F f10 = c10.f18996e;
        boolean c11 = c1550f3.c();
        if (c10.f19002k.getValue() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        rVar2.W(-1482643097);
        boolean g14 = rVar2.g(kVar);
        Object K13 = rVar2.K();
        if (g14 || K13 == obj4) {
            K13 = new Q(kVar, null, 2);
            rVar2.h0(K13);
        }
        rVar2.t(false);
        G3.a(androidx.compose.ui.layout.a.k(B.G0.c(a11, f10, w02, c11, null, z11, (wf.o) K13, false, 168), new C1584m2(c1550f3, g10)), this.f19897l0, this.f19898m0, this.f19899n0, this.f19900o0, 0.0f, null, R4.b.X(rVar2, 1096570852, new I(this.f19901p0, this.f19893h0, this.f19892Z, this.f19902q0, this.f19903r0, 2)), rVar2, 12582912, 96);
        return jf.y.f36177a;
    }
}
