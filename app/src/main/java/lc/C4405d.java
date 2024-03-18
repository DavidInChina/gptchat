package lc;

import E.AbstractC0438w;
import F.AbstractC0528b;
import W.AbstractC1607r1;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: lc.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4405d extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4405d f38191Z = new C4405d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4405d f38192h0 = new C4405d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4405d f38193i0 = new C4405d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C4405d f38194j0 = new C4405d(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C4405d f38195k0 = new C4405d(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C4405d f38196l0 = new C4405d(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C4405d f38197m0 = new C4405d(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C4405d f38198n0 = new C4405d(7);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38199Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4405d(int i10) {
        super(3);
        this.f38199Y = i10;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f38199Y) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_debug, abstractC1725n), a5, 0L, abstractC1725n, 0, 6);
                return;
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_app, abstractC1725n), a10, 0L, abstractC1725n, 0, 6);
                return;
            case 2:
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_account, abstractC1725n), a11, 0L, abstractC1725n, 0, 6);
                return;
            case 3:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_speech, abstractC1725n), a12, 0L, abstractC1725n, 0, 6);
                return;
            case 4:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.settings_language_info, abstractC1725n), androidx.compose.foundation.layout.a.s(c4323o, p9.r.f42841e, p9.r.f42840d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20311l, abstractC1725n, 0, 0, 65532);
                return;
            case 5:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_about, abstractC1725n), a13, 0L, abstractC1725n, 0, 6);
                return;
            case 6:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42842f), abstractC1725n);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f38199Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BadgedBox", (AbstractC0438w) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.lab, abstractC1725n), null, a5, 0L, abstractC1725n, 56, 12);
                return yVar;
            case 3:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 4:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 5:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 6:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
