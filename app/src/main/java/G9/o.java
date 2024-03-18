package G9;

import W.j4;
import Z.AbstractC1725n;
import jf.y;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6150Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ba.c f6151Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Ba.c cVar, int i10) {
        super(2);
        this.f6150Y = i10;
        this.f6151Z = cVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f6150Y;
        Ba.c cVar = this.f6151Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ConversationDetailsScreenContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                String str = cVar.f2009b;
                if (str == null) {
                    str = "";
                }
                j4.b(str, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("ConversationDetailsScreenContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                String str2 = cVar.f2010c;
                if (str2 == null) {
                    str2 = "";
                }
                j4.b(str2, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f6150Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
