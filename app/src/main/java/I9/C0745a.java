package I9;

import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1607r1;
import W.G3;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import cb.C2362c0;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import v0.C5952e;
import v0.C5953f;
import y.AbstractC6463a;

/* renamed from: I9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8290Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C0745a f8270Z = new C0745a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0745a f8271h0 = new C0745a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0745a f8272i0 = new C0745a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0745a f8273j0 = new C0745a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0745a f8274k0 = new C0745a(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C0745a f8275l0 = new C0745a(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C0745a f8276m0 = new C0745a(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C0745a f8277n0 = new C0745a(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C0745a f8278o0 = new C0745a(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C0745a f8279p0 = new C0745a(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final C0745a f8280q0 = new C0745a(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final C0745a f8281r0 = new C0745a(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final C0745a f8282s0 = new C0745a(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final C0745a f8283t0 = new C0745a(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final C0745a f8284u0 = new C0745a(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final C0745a f8285v0 = new C0745a(16);

    /* renamed from: w0  reason: collision with root package name */
    public static final C0745a f8286w0 = new C0745a(18);

    /* renamed from: x0  reason: collision with root package name */
    public static final C0745a f8287x0 = new C0745a(20);

    /* renamed from: y0  reason: collision with root package name */
    public static final C0745a f8288y0 = new C0745a(22);

    /* renamed from: z0  reason: collision with root package name */
    public static final C0745a f8289z0 = new C0745a(23);

    /* renamed from: A0  reason: collision with root package name */
    public static final C0745a f8266A0 = new C0745a(25);

    /* renamed from: B0  reason: collision with root package name */
    public static final C0745a f8267B0 = new C0745a(26);

    /* renamed from: C0  reason: collision with root package name */
    public static final C0745a f8268C0 = new C0745a(28);

    /* renamed from: D0  reason: collision with root package name */
    public static final C0745a f8269D0 = new C0745a(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0745a(int i10) {
        super(2);
        this.f8290Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f8290Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmo_pin_action, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.pin, abstractC1725n), null, a10, 0L, abstractC1725n, 56, 12);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmo_unpin_action, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 3:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.unpin, abstractC1725n), null, a12, 0L, abstractC1725n, 56, 12);
                return;
            case 4:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                L4.a.T(Ng.H.v(R.string.conversations_role_assistant, abstractC1725n), a13, 0, 0, abstractC1725n, 0, 14);
                return;
            case 5:
                AbstractC4326r a14 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                K8.d.z(null, AbstractC4194d.a((G0.X) a14, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b)), null, abstractC1725n, 390, 0);
                return;
            case 6:
                AbstractC4326r a15 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                L4.a.T(Ng.H.v(R.string.conversations_side_bar_explore, abstractC1725n), a15, 0, 0, abstractC1725n, 0, 14);
                return;
            case 7:
                AbstractC4326r a16 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                C5953f c5953f = P4.a.f13815f;
                if (c5953f == null) {
                    float f6 = (float) 24.0d;
                    C5952e c5952e = new C5952e("All-products", f6, f6, 24.0f, 24.0f, 0L, 0, false, 224);
                    r0.N n10 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                    Wh.p p10 = R.a.p(0, 6.75f, 4.5f);
                    p10.g(5.5074f, 4.5f, 4.5f, 5.5074f, 4.5f, 6.75f);
                    p10.g(4.5f, 7.9926f, 5.5074f, 9.0f, 6.75f, 9.0f);
                    p10.g(7.9926f, 9.0f, 9.0f, 7.9926f, 9.0f, 6.75f);
                    p10.g(9.0f, 5.5074f, 7.9926f, 4.5f, 6.75f, 4.5f);
                    p10.f();
                    p10.p(2.5f, 6.75f);
                    p10.g(2.5f, 4.4028f, 4.4028f, 2.5f, 6.75f, 2.5f);
                    p10.g(9.0972f, 2.5f, 11.0f, 4.4028f, 11.0f, 6.75f);
                    p10.g(11.0f, 9.0972f, 9.0972f, 11.0f, 6.75f, 11.0f);
                    p10.g(4.4028f, 11.0f, 2.5f, 9.0972f, 2.5f, 6.75f);
                    p10.f();
                    C5952e.b(c5952e, p10.f21239a, 1, n10, null, 0.0f, 0, 0, 4.0f);
                    r0.N n11 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                    Wh.p p11 = R.a.p(0, 17.25f, 4.5f);
                    p11.g(16.0074f, 4.5f, 15.0f, 5.5074f, 15.0f, 6.75f);
                    p11.g(15.0f, 7.9926f, 16.0074f, 9.0f, 17.25f, 9.0f);
                    p11.g(18.4926f, 9.0f, 19.5f, 7.9926f, 19.5f, 6.75f);
                    p11.g(19.5f, 5.5074f, 18.4926f, 4.5f, 17.25f, 4.5f);
                    p11.f();
                    p11.p(13.0f, 6.75f);
                    p11.g(13.0f, 4.4028f, 14.9028f, 2.5f, 17.25f, 2.5f);
                    p11.g(19.5972f, 2.5f, 21.5f, 4.4028f, 21.5f, 6.75f);
                    p11.g(21.5f, 9.0972f, 19.5972f, 11.0f, 17.25f, 11.0f);
                    p11.g(14.9028f, 11.0f, 13.0f, 9.0972f, 13.0f, 6.75f);
                    p11.f();
                    C5952e.b(c5952e, p11.f21239a, 1, n11, null, 0.0f, 0, 0, 4.0f);
                    r0.N n12 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                    Wh.p p12 = R.a.p(0, 6.75f, 15.0f);
                    p12.g(5.5074f, 15.0f, 4.5f, 16.0074f, 4.5f, 17.25f);
                    p12.g(4.5f, 18.4926f, 5.5074f, 19.5f, 6.75f, 19.5f);
                    p12.g(7.9926f, 19.5f, 9.0f, 18.4926f, 9.0f, 17.25f);
                    p12.g(9.0f, 16.0074f, 7.9926f, 15.0f, 6.75f, 15.0f);
                    p12.f();
                    p12.p(2.5f, 17.25f);
                    p12.g(2.5f, 14.9028f, 4.4028f, 13.0f, 6.75f, 13.0f);
                    p12.g(9.0972f, 13.0f, 11.0f, 14.9028f, 11.0f, 17.25f);
                    p12.g(11.0f, 19.5972f, 9.0972f, 21.5f, 6.75f, 21.5f);
                    p12.g(4.4028f, 21.5f, 2.5f, 19.5972f, 2.5f, 17.25f);
                    p12.f();
                    C5952e.b(c5952e, p12.f21239a, 1, n12, null, 0.0f, 0, 0, 4.0f);
                    r0.N n13 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                    Wh.p p13 = R.a.p(0, 17.25f, 15.0f);
                    p13.g(16.0074f, 15.0f, 15.0f, 16.0074f, 15.0f, 17.25f);
                    p13.g(15.0f, 18.4926f, 16.0074f, 19.5f, 17.25f, 19.5f);
                    p13.g(18.4926f, 19.5f, 19.5f, 18.4926f, 19.5f, 17.25f);
                    p13.g(19.5f, 16.0074f, 18.4926f, 15.0f, 17.25f, 15.0f);
                    p13.f();
                    p13.p(13.0f, 17.25f);
                    p13.g(13.0f, 14.9028f, 14.9028f, 13.0f, 17.25f, 13.0f);
                    p13.g(19.5972f, 13.0f, 21.5f, 14.9028f, 21.5f, 17.25f);
                    p13.g(21.5f, 19.5972f, 19.5972f, 21.5f, 17.25f, 21.5f);
                    p13.g(14.9028f, 21.5f, 13.0f, 19.5972f, 13.0f, 17.25f);
                    p13.f();
                    C5952e.b(c5952e, p13.f21239a, 1, n13, null, 0.0f, 0, 0, 4.0f);
                    c5953f = c5952e.c();
                    P4.a.f13815f = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, a16, 0L, abstractC1725n, 48, 12);
                return;
            case 8:
                AbstractC4326r a17 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversations_rename_button, abstractC1725n), a17, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 9:
                AbstractC4326r a18 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                AbstractC1607r1.b(R4.b.i1(), null, a18, 0L, abstractC1725n, 48, 12);
                return;
            case 10:
                AbstractC4326r a19 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar11 = (Z.r) abstractC1725n;
                    if (rVar11.B()) {
                        rVar11.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversations_archive_button, abstractC1725n), a19, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 11:
                AbstractC4326r a20 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar12 = (Z.r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.archive, abstractC1725n), null, a20, 0L, abstractC1725n, 56, 12);
                return;
            case 12:
                AbstractC4326r a21 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar13 = (Z.r) abstractC1725n;
                    if (rVar13.B()) {
                        rVar13.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversations_delete_button, abstractC1725n), a21, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 13:
                AbstractC4326r a22 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar14 = (Z.r) abstractC1725n;
                    if (rVar14.B()) {
                        rVar14.P();
                        return;
                    }
                }
                AbstractC1607r1.b(M3.H.Q(), null, a22, 0L, abstractC1725n, 48, 12);
                return;
            case 14:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar15 = (Z.r) abstractC1725n;
                    if (rVar15.B()) {
                        rVar15.P();
                        return;
                    }
                }
                x8.W.l(C0755f.f8337Y, androidx.compose.foundation.layout.e.f24739c, abstractC1725n, 54, 0);
                return;
            case 15:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar16 = (Z.r) abstractC1725n;
                    if (rVar16.B()) {
                        rVar16.P();
                        return;
                    }
                }
                G3.a(androidx.compose.foundation.layout.e.f24739c, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC0757g.f8344b, abstractC1725n, 12582918, 126);
                return;
            case 16:
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar17 = (Z.r) abstractC1725n;
                    if (rVar17.B()) {
                        rVar17.P();
                        return;
                    }
                }
                x8.W.m(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), abstractC1725n, 6, 0);
                return;
            case 17:
                L0.u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar18 = (Z.r) abstractC1725n;
                    if (rVar18.B()) {
                        rVar18.P();
                        return;
                    }
                }
                G3.a(androidx.compose.foundation.layout.e.f24739c, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC0757g.f8345c, abstractC1725n, 12582918, 126);
                return;
            case 18:
                L0.u uVar5 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar19 = (Z.r) abstractC1725n;
                    if (rVar19.B()) {
                        rVar19.P();
                        return;
                    }
                }
                K8.d.C(C0755f.f8338Z, androidx.compose.foundation.layout.e.f24739c, abstractC1725n, 54, 0);
                return;
            case 19:
                L0.u uVar6 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar20 = (Z.r) abstractC1725n;
                    if (rVar20.B()) {
                        rVar20.P();
                        return;
                    }
                }
                G3.a(androidx.compose.foundation.layout.e.f24739c, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC0759h.f8355b, abstractC1725n, 12582918, 126);
                return;
            case 20:
                L0.u uVar7 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar21 = (Z.r) abstractC1725n;
                    if (rVar21.B()) {
                        rVar21.P();
                        return;
                    }
                }
                K8.d.D(androidx.compose.foundation.layout.e.f24739c, abstractC1725n, 6, 0);
                return;
            case 21:
                L0.u uVar8 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar22 = (Z.r) abstractC1725n;
                    if (rVar22.B()) {
                        rVar22.P();
                        return;
                    }
                }
                G3.a(androidx.compose.foundation.layout.e.f24739c, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC0759h.f8356c, abstractC1725n, 12582918, 126);
                return;
            case 22:
                L0.u uVar9 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar23 = (Z.r) abstractC1725n;
                    if (rVar23.B()) {
                        rVar23.P();
                        return;
                    }
                }
                j4.b("Placeholder chat title for a conversation that hasn't loaded yet", Bi.c.I1(c4323o, true, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, abstractC1725n, 6, 3072, 122876);
                return;
            case 23:
                L0.u uVar10 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar24 = (Z.r) abstractC1725n;
                    if (rVar24.B()) {
                        rVar24.P();
                        return;
                    }
                }
                A7.b.C(androidx.compose.foundation.layout.e.f24739c, abstractC1725n, 6, 0);
                return;
            case 24:
                L0.u uVar11 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar25 = (Z.r) abstractC1725n;
                    if (rVar25.B()) {
                        rVar25.P();
                        return;
                    }
                }
                G3.a(androidx.compose.foundation.layout.e.f24739c, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC0761i.f8366b, abstractC1725n, 12582918, 126);
                return;
            case 25:
                AbstractC4326r a23 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar26 = (Z.r) abstractC1725n;
                    if (rVar26.B()) {
                        rVar26.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversation_sidebar_search_history, abstractC1725n), a23, ((W.P0) ((Z.r) abstractC1725n).m(W.R0.f19593a)).f19535s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131066);
                return;
            case 26:
                AbstractC4326r a24 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar27 = (Z.r) abstractC1725n;
                    if (rVar27.B()) {
                        rVar27.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.search, abstractC1725n), null, a24, 0L, abstractC1725n, 56, 12);
                return;
            default:
                L0.u uVar12 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar28 = (Z.r) abstractC1725n;
                    if (rVar28.B()) {
                        rVar28.P();
                        return;
                    }
                }
                Z.r rVar29 = (Z.r) abstractC1725n;
                rVar29.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar29);
                rVar29.W(-1323940314);
                int i11 = rVar29.P;
                AbstractC1732q0 p14 = rVar29.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i12 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar29.f22696a instanceof AbstractC1707e) {
                    rVar29.Z();
                    if (rVar29.f22695O) {
                        rVar29.o(c0582k);
                    } else {
                        rVar29.k0();
                    }
                    U3.f.n0(rVar29, c10, C0583l.f5808f);
                    U3.f.n0(rVar29, p14, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar29.f22695O || !AbstractC3557B.K(rVar29.K(), Integer.valueOf(i11))) {
                        AbstractC6463a.q(i11, rVar29, i11, c0581j);
                    }
                    AbstractC6463a.r(0, i12, new Z.L0(rVar29), rVar29, 2058660585);
                    d1.a(Ad.l.W0(null, rVar29, 31), true, androidx.compose.foundation.layout.e.d(c4323o, 0.8f), null, null, rVar29, 440, 24);
                    AbstractC6463a.v(rVar29, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8290Y) {
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
            case 17:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 18:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 19:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 20:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 21:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 22:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 23:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 24:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 25:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 26:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 27:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 28:
                j1 j1Var = (j1) obj;
                List list = (List) obj2;
                AbstractC3557B.c0("$this$setOnEach", j1Var);
                AbstractC3557B.c0("it", list);
                return j1.e(j1Var, false, false, false, list, null, false, null, false, null, null, null, null, false, 131007);
            default:
                j1 j1Var2 = (j1) obj;
                C2362c0 c2362c0 = (C2362c0) obj2;
                AbstractC3557B.c0("$this$setOnEach", j1Var2);
                AbstractC3557B.c0("it", c2362c0);
                return j1.e(j1Var2, false, false, false, null, c2362c0, false, null, false, null, null, null, null, false, 130943);
        }
    }
}
