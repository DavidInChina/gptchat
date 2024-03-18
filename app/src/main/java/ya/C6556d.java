package ya;

import Ng.H;
import W.AbstractC1607r1;
import W.R0;
import X.C;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import jf.y;
import l0.AbstractC4326r;
import v0.C5953f;

/* renamed from: ya.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6556d extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6556d f50856Z = new C6556d(1);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6556d f50857h0 = new C6556d(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50858Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6556d(int i10) {
        super(2);
        this.f50858Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f50858Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Ad.l.y(C6554b.f50849Z, C6555c.f50852Y, a5, abstractC1725n, 54, 4);
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
                C5953f Z10 = P4.a.Z();
                String v10 = H.v(R.string.voice_snackbar_feedback_thumbs_up, abstractC1725n);
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(743425465);
                float f6 = C.f21350a;
                long e10 = R0.e(5, rVar3);
                rVar3.t(false);
                AbstractC1607r1.b(Z10, v10, a10, e10, abstractC1725n, 0, 4);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                C5953f X10 = M3.H.X();
                String v11 = H.v(R.string.voice_snackbar_feedback_thumbs_down, abstractC1725n);
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(743425465);
                float f10 = C.f21350a;
                long e11 = R0.e(5, rVar5);
                rVar5.t(false);
                AbstractC1607r1.b(X10, v11, a11, e11, abstractC1725n, 0, 4);
                return;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                Mg.a aVar = Mg.b.f12127Z;
                K8.d.d0(new Ed.m(new Mg.b(Df.H.x0(100, Mg.d.f12134i0)), "123"), C6555c.f50853Z, C6555c.f50854h0, C6555c.f50855i0, a12, abstractC1725n, 3504, 16);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f50858Y) {
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
