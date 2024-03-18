package cc;

import Ng.H;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import l0.AbstractC4326r;

/* renamed from: cc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2388c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26562Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f26563Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2388c(o oVar, int i10) {
        super(2);
        this.f26562Y = i10;
        this.f26563Z = oVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f26562Y;
        o oVar = this.f26563Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("DeactivatedAccountScreen");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                String d10 = oVar.d();
                r rVar2 = (r) abstractC1725n;
                rVar2.W(445282508);
                if (d10 == null) {
                    d10 = H.v(R.string.deactivated_account_placeholder_name, rVar2);
                }
                rVar2.t(false);
                objArr[0] = d10;
                j4.b(H.w(R.string.deactivated_account_title, objArr, rVar2), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20303d, rVar2, 0, 0, 65534);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("DeactivatedAccountScreen");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(H.v(oVar.c(), abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f26562Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
