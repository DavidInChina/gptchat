package na;

import E.AbstractC0429m;
import E.C0424h;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1607r1;
import W.AbstractC1617t1;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import androidx.compose.material3.MinimumInteractiveModifier;
import com.openai.chatgpt.R;
import f9.C2958j;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import l8.AbstractC4344b;
import q1.AbstractC5260f;
import qa.C5293c;
import qa.C5294d;
import qa.C5295e;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: na.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4771m extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40049Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f40050Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f40051h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4771m(AbstractC4326r abstractC4326r, Tc.f fVar, int i10) {
        super(2);
        this.f40049Y = i10;
        this.f40050Z = abstractC4326r;
        this.f40051h0 = fVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4317i c4317i = C4310b.f37703p0;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r abstractC4326r = this.f40050Z;
        int i11 = this.f40049Y;
        Tc.f fVar = this.f40051h0;
        switch (i11) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(androidx.compose.foundation.a.h(abstractC4326r, new F9.e(fVar, 5)), 1.0f);
                Z.m1 m1Var = AbstractC1617t1.f20423a;
                AbstractC4326r g10 = d10.g(MinimumInteractiveModifier.f24779b);
                C0424h c0424h = AbstractC0429m.f3911e;
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(693286680);
                E0.N a5 = E.p0.a(c0424h, c4317i, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(g10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a5, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i13, rVar2, 0, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("MemoryConversationBanner");
                    AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.memory, rVar2), null, a10, 0L, rVar2, 56, 12);
                    float f6 = p9.r.f42840d;
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, f6), rVar2);
                    j4.b(Ng.H.v(R.string.disclosure_memory_off, rVar2), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, f6), rVar2);
                    AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.info, rVar2), null, a10, 0L, rVar2, 56, 12);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC4326r a11 = io.sentry.compose.b.a("TemporaryConversationBanner");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, C4777o.f40072Z, abstractC1725n, 6);
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-1390219808);
                boolean g11 = rVar4.g(abstractC1710f0);
                Object K10 = rVar4.K();
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (g11 || K10 == iVar) {
                    K10 = R.a.o(abstractC1710f0, 4, rVar4);
                }
                rVar4.t(false);
                AbstractC4326r d11 = androidx.compose.foundation.layout.e.d(androidx.compose.foundation.a.h(abstractC4326r, (AbstractC6216a) K10), 1.0f);
                Z.m1 m1Var2 = AbstractC1617t1.f20423a;
                AbstractC4326r g12 = d11.g(MinimumInteractiveModifier.f24779b);
                C0424h c0424h2 = AbstractC0429m.f3911e;
                rVar4.W(693286680);
                E0.N a12 = E.p0.a(c0424h2, c4317i, rVar4);
                rVar4.W(-1323940314);
                int i14 = rVar4.P;
                AbstractC1732q0 p11 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(g12);
                if (rVar4.f22696a instanceof AbstractC1707e) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k2);
                    } else {
                        rVar4.k0();
                    }
                    U3.f.n0(rVar4, a12, C0583l.f5808f);
                    U3.f.n0(rVar4, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar4, i14, c0581j2);
                    }
                    AbstractC6463a.t(rVar4, i15, rVar4, 0, 2058660585);
                    AbstractC4326r a13 = io.sentry.compose.b.a("TemporaryConversationBanner");
                    AbstractC1607r1.b(AbstractC5260f.x(), null, a13, 0L, rVar4, 48, 12);
                    float f10 = p9.r.f42840d;
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, f10), rVar4);
                    j4.b(Ng.H.v(R.string.conversations_menu_temporary_chat, rVar4), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 0, 0, 131070);
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, f10), rVar4);
                    C5953f c5953f = AbstractC5260f.f43654e;
                    if (c5953f == null) {
                        C5952e c5952e = new C5952e("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i16 = AbstractC5944H.f46870a;
                        r0.N n10 = new r0.N(r0.r.f44254b);
                        Wh.p pVar = new Wh.p(0);
                        pVar.p(11.0f, 7.0f);
                        pVar.m(2.0f);
                        pVar.x(2.0f);
                        pVar.m(-2.0f);
                        pVar.f();
                        pVar.p(11.0f, 11.0f);
                        pVar.m(2.0f);
                        pVar.x(6.0f);
                        pVar.m(-2.0f);
                        pVar.f();
                        pVar.p(12.0f, 2.0f);
                        pVar.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        pVar.u(4.48f, 10.0f, 10.0f, 10.0f);
                        pVar.u(10.0f, -4.48f, 10.0f, -10.0f);
                        pVar.t(17.52f, 2.0f, 12.0f, 2.0f);
                        pVar.f();
                        pVar.p(12.0f, 20.0f);
                        pVar.h(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                        pVar.u(3.59f, -8.0f, 8.0f, -8.0f);
                        pVar.u(8.0f, 3.59f, 8.0f, 8.0f);
                        pVar.u(-3.59f, 8.0f, -8.0f, 8.0f);
                        pVar.f();
                        C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e.c();
                        AbstractC5260f.f43654e = c5953f;
                    }
                    AbstractC1607r1.b(c5953f, null, a13, 0L, rVar4, 48, 12);
                    AbstractC6463a.v(rVar4, false, true, false, false);
                    if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                        p9.s sVar = fVar.f17059d;
                        AbstractC3557B.c0("stringResolver", sVar);
                        C2958j c2958j = (C2958j) sVar;
                        String a14 = c2958j.a(R.string.disclosure_temporary_title);
                        String a15 = c2958j.a(R.string.disclosure_temporary_history_title);
                        String a16 = c2958j.a(R.string.disclosure_temporary_history_subtitle);
                        Integer valueOf = Integer.valueOf((int) R.drawable.chat_temporary);
                        p9.o oVar = p9.o.f42824v0;
                        C5295e c5295e = new C5295e(new wd.n0(new C5294d(a14, (String) null, AbstractC4344b.G0(new C5293c(a15, a16, null, valueOf, oVar, 4), new C5293c(c2958j.a(R.string.disclosure_temporary_training_title), c2958j.a(R.string.disclosure_temporary_training_subtitle), null, Integer.valueOf((int) R.drawable.file_blank), oVar, 4), new C5293c(c2958j.a(R.string.disclosure_temporary_learning_title), c2958j.a(R.string.disclosure_temporary_learning_subtitle), null, Integer.valueOf((int) R.drawable.memory), oVar, 4)), c2958j.a(R.string.disclosure_continue), 6)));
                        rVar4.W(-1390219095);
                        boolean g13 = rVar4.g(abstractC1710f0);
                        Object K11 = rVar4.K();
                        if (g13 || K11 == iVar) {
                            K11 = R.a.o(abstractC1710f0, 5, rVar4);
                        }
                        rVar4.t(false);
                        K8.d.q(fVar, c5295e, (AbstractC6216a) K11, a11, rVar4, 72, 8);
                        return;
                    }
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40049Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
