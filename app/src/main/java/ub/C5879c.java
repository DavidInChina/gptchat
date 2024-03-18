package ub;

import Ng.H;
import W.AbstractC1607r1;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;

/* renamed from: ub.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5879c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5879c f46539Z = new C5879c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5879c f46540h0 = new C5879c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5879c f46541i0 = new C5879c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C5879c f46542j0 = new C5879c(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46543Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5879c(int i10) {
        super(2);
        this.f46543Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f46543Y) {
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
                AbstractC1607r1.b(Gi.e.z(), H.v(R.string.content_description_close, abstractC1725n), a5, 0L, abstractC1725n, 0, 12);
                return;
            case 2:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC1607r1.b(Gi.e.z(), H.v(R.string.content_description_close, abstractC1725n), a10, 0L, abstractC1725n, 0, 12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46543Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
