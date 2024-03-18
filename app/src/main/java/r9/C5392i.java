package r9;

import W.AbstractC1607r1;
import W.C1567j0;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;

/* renamed from: r9.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5392i extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5392i f44566Z = new C5392i(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5392i f44567h0 = new C5392i(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5392i f44568i0 = new C5392i(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C5392i f44569j0 = new C5392i(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C5392i f44570k0 = new C5392i(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44571Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5392i(int i10) {
        super(2);
        this.f44571Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f44571Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.arrow_left, abstractC1725n), Ng.H.v(R.string.design_up_button, abstractC1725n), a5, 0L, abstractC1725n, 8, 12);
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
                C1567j0.f20165a.a(a10, 0.0f, 0.0f, null, 0L, abstractC1725n, 196608, 31);
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
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.arrow_left, abstractC1725n), Ng.H.v(R.string.design_up_button, abstractC1725n), a11, 0L, abstractC1725n, 8, 12);
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
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.close_lg, abstractC1725n), Ng.H.v(R.string.design_search_clear, abstractC1725n), a12, 0L, abstractC1725n, 8, 12);
                return;
            default:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44571Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
