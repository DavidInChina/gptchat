package Nb;

import G0.X;
import Qb.e;
import W.E1;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import jf.y;
import k6.AbstractC4194d;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.n;

/* loaded from: classes2.dex */
public final class b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12776Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ e f12777Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i10) {
        super(2);
        this.f12776Y = i10;
        this.f12777Z = eVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f12776Y;
        e eVar = this.f12777Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("StarterPromptContent");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(eVar.f14562a, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, abstractC1725n, 0, 3072, 122878);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("StarterPromptContent");
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(eVar.f14563b, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, abstractC1725n, 0, 3072, 122878);
                return;
            default:
                AbstractC4326r a11 = io.sentry.compose.b.a("StarterPromptContent");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                E1.a(R4.b.X(abstractC1725n, 1908487148, new b(eVar, 0)), AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.a.z(c4323o)), null, R4.b.X(abstractC1725n, -1595389073, new b(eVar, 1)), null, null, null, 0.0f, 0.0f, abstractC1725n, 3126, 500);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f12776Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
