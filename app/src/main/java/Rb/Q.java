package Rb;

import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15290Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f15291Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(C c10, int i10) {
        super(2);
        this.f15290Y = i10;
        this.f15291Z = c10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f15290Y;
        C c10 = this.f15291Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ReasonWithOptions");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(c10.f15250b, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20307h, abstractC1725n, 0, 0, 65534);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("ReasonWithOptions");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                String str = c10.f15254f;
                if (str == null) {
                    str = "";
                }
                j4.b(str, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("ReasonWithOptions");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(c10.f15250b, a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20310k, abstractC1725n, 0, 0, 65534);
                return;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("RootReason");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                j4.b(c10.f15250b, a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20310k, abstractC1725n, 0, 0, 65534);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f15290Y) {
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
