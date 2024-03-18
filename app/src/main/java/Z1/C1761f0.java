package Z1;

import W.j4;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: Z1.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1761f0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22958Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f22959Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1761f0(int i10, int i11) {
        super(2);
        this.f22958Y = i11;
        this.f22959Z = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f22958Y;
        int i12 = this.f22959Z;
        switch (i11) {
            case 0:
                K4.J.d(abstractC1725n, i12 | 1);
                return;
            case 1:
                L4.a.O(abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 2:
                AbstractC4326r a5 = io.sentry.compose.b.a("MessageSpreadsheetContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(i12, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 3:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(i12 + ".cta it.cta", Bi.c.I1(c4323o, true, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131068);
                return;
            case 4:
                x8.W.z(abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 5:
                AbstractC4326r a10 = io.sentry.compose.b.a("SubscriptionPackageView");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(i12, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 130558);
                return;
            case 6:
                R4.b.x(abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                R4.b.x(abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f22958Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
