package hb;

import Df.H;
import W.AbstractC1607r1;
import Z.AbstractC1725n;
import java.util.ArrayList;
import l0.AbstractC4326r;
import l0.C4323o;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;

/* renamed from: hb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3382a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3382a f32093Z = new C3382a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3382a f32094h0 = new C3382a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3382a f32095i0 = new C3382a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32096Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3382a(int i10) {
        super(2);
        this.f32096Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        AbstractC4326r abstractC4326r;
        C4323o c4323o = C4323o.f37719b;
        switch (this.f32096Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C5953f c5953f = H.f3634a;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Filled.Replay10", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    long j6 = r0.r.f44254b;
                    N n10 = new N(j6);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(11.99f, 5.0f);
                    pVar.w(1.0f);
                    pVar.o(-5.0f, 5.0f);
                    pVar.o(5.0f, 5.0f);
                    pVar.w(7.0f);
                    pVar.h(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                    pVar.u(-2.69f, 6.0f, -6.0f, 6.0f);
                    pVar.u(-6.0f, -2.69f, -6.0f, -6.0f);
                    pVar.m(-2.0f);
                    pVar.h(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                    pVar.u(8.0f, -3.58f, 8.0f, -8.0f);
                    pVar.t(16.41f, 5.0f, 11.99f, 5.0f);
                    pVar.f();
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    N n11 = new N(j6);
                    Wh.p pVar2 = new Wh.p(0);
                    pVar2.p(10.89f, 16.0f);
                    pVar2.m(-0.85f);
                    pVar2.x(-3.26f);
                    pVar2.o(-1.01f, 0.31f);
                    pVar2.x(-0.69f);
                    pVar2.o(1.77f, -0.63f);
                    pVar2.m(0.09f);
                    pVar2.w(16.0f);
                    pVar2.f();
                    C5952e.b(c5952e, pVar2.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
                    N n12 = new N(j6);
                    Wh.p p10 = R.a.p(0, 15.17f, 14.24f);
                    p10.h(0.0f, 0.32f, -0.03f, 0.6f, -0.1f, 0.82f);
                    p10.u(-0.17f, 0.42f, -0.29f, 0.57f);
                    p10.u(-0.28f, 0.26f, -0.45f, 0.33f);
                    p10.u(-0.37f, 0.1f, -0.59f, 0.1f);
                    p10.u(-0.41f, -0.03f, -0.59f, -0.1f);
                    p10.u(-0.33f, -0.18f, -0.46f, -0.33f);
                    p10.u(-0.23f, -0.34f, -0.3f, -0.57f);
                    p10.u(-0.11f, -0.5f, -0.11f, -0.82f);
                    p10.w(13.5f);
                    p10.h(0.0f, -0.32f, 0.03f, -0.6f, 0.1f, -0.82f);
                    p10.u(0.17f, -0.42f, 0.29f, -0.57f);
                    p10.u(0.28f, -0.26f, 0.45f, -0.33f);
                    p10.u(0.37f, -0.1f, 0.59f, -0.1f);
                    p10.u(0.41f, 0.03f, 0.59f, 0.1f);
                    p10.h(0.18f, 0.07f, 0.33f, 0.18f, 0.46f, 0.33f);
                    p10.u(0.23f, 0.34f, 0.3f, 0.57f);
                    p10.u(0.11f, 0.5f, 0.11f, 0.82f);
                    p10.w(14.24f);
                    p10.f();
                    p10.p(14.32f, 13.38f);
                    p10.h(0.0f, -0.19f, -0.01f, -0.35f, -0.04f, -0.48f);
                    p10.u(-0.07f, -0.23f, -0.12f, -0.31f);
                    p10.u(-0.11f, -0.14f, -0.19f, -0.17f);
                    p10.u(-0.16f, -0.05f, -0.25f, -0.05f);
                    p10.u(-0.18f, 0.02f, -0.25f, 0.05f);
                    p10.u(-0.14f, 0.09f, -0.19f, 0.17f);
                    p10.u(-0.09f, 0.18f, -0.12f, 0.31f);
                    p10.u(-0.04f, 0.29f, -0.04f, 0.48f);
                    p10.x(0.97f);
                    p10.h(0.0f, 0.19f, 0.01f, 0.35f, 0.04f, 0.48f);
                    p10.u(0.07f, 0.24f, 0.12f, 0.32f);
                    p10.u(0.11f, 0.14f, 0.19f, 0.17f);
                    p10.u(0.16f, 0.05f, 0.25f, 0.05f);
                    p10.u(0.18f, -0.02f, 0.25f, -0.05f);
                    p10.u(0.14f, -0.09f, 0.19f, -0.17f);
                    p10.u(0.09f, -0.19f, 0.11f, -0.32f);
                    p10.u(0.04f, -0.29f, 0.04f, -0.48f);
                    p10.w(13.38f);
                    p10.f();
                    C5952e.b(c5952e, p10.f21239a, 0, n12, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    H.f3634a = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, a5, 0L, abstractC1725n, 48, 12);
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
                C5953f c5953f2 = com.google.android.gms.internal.play_billing.N.f26868a;
                if (c5953f2 != null) {
                    abstractC4326r = a10;
                } else {
                    C5952e c5952e2 = new C5952e("Filled.Forward10", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = AbstractC5944H.f46870a;
                    abstractC4326r = a10;
                    long j10 = r0.r.f44254b;
                    N n13 = new N(j10);
                    Wh.p p11 = R.a.p(0, 18.0f, 13.0f);
                    p11.h(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
                    p11.u(-6.0f, -2.69f, -6.0f, -6.0f);
                    p11.u(2.69f, -6.0f, 6.0f, -6.0f);
                    p11.x(4.0f);
                    p11.o(5.0f, -5.0f);
                    p11.o(-5.0f, -5.0f);
                    p11.x(4.0f);
                    p11.h(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
                    p11.h(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                    p11.u(8.0f, -3.58f, 8.0f, -8.0f);
                    p11.l(18.0f);
                    p11.f();
                    C5952e.b(c5952e2, p11.f21239a, 0, n13, null, 1.0f, 0, 2, 1.0f);
                    N n14 = new N(j10);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new v0.n(10.86f, 15.94f));
                    arrayList.add(new v0.u(0.0f, -4.27f));
                    arrayList.add(new v0.u(-0.09f, 0.0f));
                    arrayList.add(new v0.u(-1.77f, 0.63f));
                    arrayList.add(new v0.u(0.0f, 0.69f));
                    arrayList.add(new v0.u(1.01f, -0.31f));
                    arrayList.add(new v0.u(0.0f, 3.26f));
                    arrayList.add(C5957j.f46979c);
                    C5952e.b(c5952e2, arrayList, 0, n14, null, 1.0f, 0, 2, 1.0f);
                    N n15 = new N(j10);
                    Wh.p pVar3 = new Wh.p(0);
                    pVar3.p(12.25f, 13.44f);
                    pVar3.x(0.74f);
                    pVar3.h(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f);
                    pVar3.h(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f);
                    pVar3.x(-0.74f);
                    pVar3.h(0.0f, -1.9f, -1.31f, -1.82f, -1.44f, -1.82f);
                    pVar3.g(13.55f, 11.62f, 12.25f, 11.53f, 12.25f, 13.44f);
                    pVar3.f();
                    pVar3.p(14.29f, 13.32f);
                    pVar3.x(0.97f);
                    pVar3.h(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f);
                    pVar3.h(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f);
                    pVar3.x(-0.97f);
                    pVar3.h(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f);
                    pVar3.g(14.07f, 12.3f, 14.29f, 12.57f, 14.29f, 13.32f);
                    pVar3.f();
                    C5952e.b(c5952e2, pVar3.f21239a, 0, n15, null, 1.0f, 0, 2, 1.0f);
                    c5953f2 = c5952e2.c();
                    com.google.android.gms.internal.play_billing.N.f26868a = c5953f2;
                }
                AbstractC1607r1.b(c5953f2, null, abstractC4326r, 0L, abstractC1725n, 48, 12);
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
                AbstractC1607r1.b(P4.a.P(), null, a11, 0L, abstractC1725n, 48, 12);
                return;
            case 3:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                s.a(b.f32097Z, new t(true, true, "00:00", false, false, true, 264), c4323o, abstractC1725n, 390, 0);
                return;
            case 4:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                s.a(b.f32098h0, new t(true, true, "00:00", true, false, true, 264), c4323o, abstractC1725n, 390, 0);
                return;
            default:
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                s.a(b.f32099i0, new t(true, true, "00:00", true, true, true, 264), c4323o, abstractC1725n, 390, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f32096Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
