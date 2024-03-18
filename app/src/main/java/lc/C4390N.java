package lc;

import W.AbstractC1547f0;
import W.j4;
import Z.AbstractC1725n;
import l0.AbstractC4326r;

/* renamed from: lc.N  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4390N extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38104Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4393Q f38105Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4390N(C4393Q c4393q, int i10) {
        super(2);
        this.f38104Y = i10;
        this.f38105Z = c4393q;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f38104Y;
        C4393Q c4393q = this.f38105Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("SettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1547f0.b(R4.b.X(abstractC1725n, -641154738, new C4389M(c4393q, 0)), a5, AbstractC4407f.f38258x, abstractC1725n, 390, 2);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("SettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Ed.i iVar = c4393q.f38120i;
                if (iVar != null) {
                    j4.b(Ng.H.v(iVar.f4683Z, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                    return;
                }
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("SettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(c4393q.f38112a.f48458b.f48353b, a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                Integer V02 = A7.b.V0(c4393q.f38112a);
                if (V02 != null) {
                    j4.b(Ng.H.v(V02.intValue(), abstractC1725n), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                    return;
                }
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f38104Y) {
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
