package hc;

import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;
import x8.W;

/* renamed from: hc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3386a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3386a f32178Z = new C3386a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3386a f32179h0 = new C3386a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3386a f32180i0 = new C3386a(3);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3386a f32181j0 = new C3386a(4);

    /* renamed from: k0  reason: collision with root package name */
    public static final C3386a f32182k0 = new C3386a(5);

    /* renamed from: l0  reason: collision with root package name */
    public static final C3386a f32183l0 = new C3386a(6);

    /* renamed from: m0  reason: collision with root package name */
    public static final C3386a f32184m0 = new C3386a(7);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32185Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3386a(int i10) {
        super(2);
        this.f32185Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f32185Y) {
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
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.arrow_left, abstractC1725n), Ng.H.v(R.string.design_up_button, abstractC1725n), a5, 0L, abstractC1725n, 8, 12);
                return;
            case 2:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                W.e(Ad.l.W0(null, abstractC1725n, 31), a10, null, abstractC1725n, 8, 6);
                return;
            case 3:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.custom_instructions_tips_title, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 4:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.custom_instructions_start_description, abstractC1725n), a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 6:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                Ad.l.p(Ad.l.G(R.string.custom_instructions_business_description, abstractC1725n), a13, null, abstractC1725n, 0, 6);
                return;
            case 7:
                AbstractC4326r a14 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                Ad.l.p(Ad.l.G(R.string.custom_instructions_performance_description, abstractC1725n), a14, null, abstractC1725n, 0, 6);
                return;
            default:
                AbstractC4326r a15 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                A7.b.x(6, 14, abstractC1725n, a15, null, C3393h.f32203Z, false);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f32185Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
