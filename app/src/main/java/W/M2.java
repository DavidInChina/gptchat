package W;

import D1.C0373t;
import Z.AbstractC1725n;

/* loaded from: classes2.dex */
public final class M2 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19369Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0373t f19370Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19371h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M2(C0373t c0373t, wf.n nVar, int i10) {
        super(2);
        this.f19369Y = i10;
        this.f19370Z = c0373t;
        this.f19371h0 = nVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19369Y;
        wf.n nVar = this.f19371h0;
        C0373t c0373t = this.f19370Z;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                A7.b.k(S2.f19673b.b(c0373t), nVar, abstractC1725n, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                A7.b.k(S2.f19673b.b(c0373t), nVar, abstractC1725n, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19369Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
