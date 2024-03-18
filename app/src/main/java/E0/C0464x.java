package E0;

import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4326r;
import y.AbstractC6463a;
import yf.AbstractC6583a;

/* renamed from: E0.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464x extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4092Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f4093Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0464x(int i10, List list) {
        super(2);
        this.f4092Y = i10;
        this.f4093Z = list;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f4092Y;
        List<Va.c> list = this.f4093Z;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    wf.n nVar = (wf.n) list.get(i12);
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    int i13 = rVar2.P;
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5805c;
                    rVar2.W(-692256719);
                    if (rVar2.f22696a instanceof AbstractC1707e) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                            AbstractC6463a.q(i13, rVar2, i13, c0581j);
                        }
                        nVar.invoke(rVar2, 0);
                        rVar2.t(true);
                        rVar2.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                return;
            default:
                AbstractC4326r a5 = io.sentry.compose.b.a("ConversationDetailsScreenContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(1240432799);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (Va.c cVar : list) {
                    arrayList.add(Ng.H.v(cVar.f18499a, rVar4));
                }
                rVar4.t(false);
                j4.c(K8.d.Q0(arrayList), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar4, 0, 0, 262142);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f4092Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
