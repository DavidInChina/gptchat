package bb;

import E.AbstractC0429m;
import E.AbstractC0440y;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1607r1;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import cb.C2334C;
import cb.C2341J;
import cb.C2344M;
import cb.C2347P;
import cb.C2353W;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import l8.AbstractC4344b;
import y.AbstractC6463a;

/* renamed from: bb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2153a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2153a f25765Z = new C2153a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2153a f25766h0 = new C2153a(3);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2153a f25767i0 = new C2153a(4);

    /* renamed from: j0  reason: collision with root package name */
    public static final C2153a f25768j0 = new C2153a(5);

    /* renamed from: k0  reason: collision with root package name */
    public static final C2153a f25769k0 = new C2153a(6);

    /* renamed from: l0  reason: collision with root package name */
    public static final C2153a f25770l0 = new C2153a(13);

    /* renamed from: m0  reason: collision with root package name */
    public static final C2153a f25771m0 = new C2153a(14);

    /* renamed from: n0  reason: collision with root package name */
    public static final C2153a f25772n0 = new C2153a(15);

    /* renamed from: o0  reason: collision with root package name */
    public static final C2153a f25773o0 = new C2153a(17);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25774Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2153a(int i10) {
        super(2);
        this.f25774Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4316h c4316h = C4310b.f37705r0;
        C4323o c4323o = C4323o.f37719b;
        switch (this.f25774Y) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-483455358);
                E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar3);
                rVar3.W(-1323940314);
                int i11 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i12 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, a5, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i11))) {
                        AbstractC6463a.q(i11, rVar3, i11, c0581j);
                    }
                    AbstractC6463a.t(rVar3, i12, rVar3, 0, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                    K8.d.e0(0, 2, rVar3, a10, AbstractC4344b.G0(new C2344M("1 day", "Since creation"), new C2344M("2", "Conversations")));
                    K8.d.e0(8, 2, rVar3, a10, AbstractC4344b.G0(new C2344M("1 day", "Since creation"), new C2341J("Writing", null), new C2344M("2", "Conversations")));
                    K8.d.e0(8, 2, rVar3, a10, AbstractC4344b.G0(new C2347P("4.4", "10"), new C2341J("Productivity", 4), new C2344M("10k", "Conversations")));
                    AbstractC6463a.v(rVar3, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                K8.d.B(Ad.l.W0(null, abstractC1725n, 31), a11, null, abstractC1725n, 8, 6);
                return;
            case 3:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmo_details_category, abstractC1725n), a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 4:
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmo_rating_submit, abstractC1725n), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 6:
                AbstractC4326r a14 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmo_rating_add_note_hint, abstractC1725n), a14, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 7:
                AbstractC4326r a15 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                r9.y.k(Ad.l.W0(null, abstractC1725n, 31), a15, null, abstractC1725n, 8, 6);
                return;
            case 8:
                AbstractC4326r a16 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                r9.y.k(Ad.l.W0(null, abstractC1725n, 31), a16, null, abstractC1725n, 8, 6);
                return;
            case 9:
                AbstractC4326r a17 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar11 = (Z.r) abstractC1725n;
                    if (rVar11.B()) {
                        rVar11.P();
                        return;
                    }
                }
                L4.a.j(Ad.l.W0(null, abstractC1725n, 31), a17, null, abstractC1725n, 8, 6);
                return;
            case 10:
                AbstractC4326r a18 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar12 = (Z.r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                L4.a.j(Ad.l.W0(null, abstractC1725n, 31), a18, null, abstractC1725n, 8, 6);
                return;
            case 11:
                AbstractC4326r a19 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar13 = (Z.r) abstractC1725n;
                    if (rVar13.B()) {
                        rVar13.P();
                        return;
                    }
                }
                L4.a.j(Ad.l.W0(null, abstractC1725n, 31), a19, null, abstractC1725n, 8, 6);
                return;
            case 12:
                AbstractC4326r a20 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar14 = (Z.r) abstractC1725n;
                    if (rVar14.B()) {
                        rVar14.P();
                        return;
                    }
                }
                L4.a.j(Ad.l.W0(null, abstractC1725n, 31), a20, null, abstractC1725n, 8, 6);
                return;
            case 13:
                AbstractC4326r a21 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar15 = (Z.r) abstractC1725n;
                    if (rVar15.B()) {
                        rVar15.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmos_store_category_all, abstractC1725n), a21, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 14:
                AbstractC4326r a22 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar16 = (Z.r) abstractC1725n;
                    if (rVar16.B()) {
                        rVar16.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmos_store_category_my_gpts, abstractC1725n), a22, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 15:
                L0.u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar17 = (Z.r) abstractC1725n;
                    if (rVar17.B()) {
                        rVar17.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.lock_key_hole, abstractC1725n), null, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42830a), 0L, abstractC1725n, 56, 8);
                return;
            case 16:
                L0.u uVar5 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar18 = (Z.r) abstractC1725n;
                    if (rVar18.B()) {
                        rVar18.P();
                        return;
                    }
                }
                Z.r rVar19 = (Z.r) abstractC1725n;
                rVar19.W(-483455358);
                E0.N a23 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar19);
                rVar19.W(-1323940314);
                int i13 = rVar19.P;
                AbstractC1732q0 p11 = rVar19.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar19.f22696a instanceof AbstractC1707e) {
                    rVar19.Z();
                    if (rVar19.f22695O) {
                        rVar19.o(c0582k2);
                    } else {
                        rVar19.k0();
                    }
                    U3.f.n0(rVar19, a23, C0583l.f5808f);
                    U3.f.n0(rVar19, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar19.f22695O || !AbstractC3557B.K(rVar19.K(), Integer.valueOf(i13))) {
                        AbstractC6463a.q(i13, rVar19, i13, c0581j2);
                    }
                    AbstractC6463a.t(rVar19, i14, rVar19, 0, 2058660585);
                    rVar19.W(-365446548);
                    for (Number number : AbstractC4344b.G0(1, 9, 10, 99)) {
                        int intValue = number.intValue();
                        C2353W c2353w = new C2353W();
                        C2334C.Companion.getClass();
                        L4.a.i(c2353w, C2334C.f26437B, C2170j.f25837Z, null, p9.q.f42833d, String.valueOf(intValue), false, false, rVar19, 390, RCHTTPStatusCodes.SUCCESS);
                    }
                    AbstractC6463a.v(rVar19, false, false, true, false);
                    rVar19.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                L0.u uVar6 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar20 = (Z.r) abstractC1725n;
                    if (rVar20.B()) {
                        rVar20.P();
                        return;
                    }
                }
                j4.b("Normal GPT title", Bi.c.I1(c4323o, true, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20307h, abstractC1725n, 6, 0, 65532);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f25774Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 10:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 11:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 12:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 13:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 14:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 15:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 16:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
