package Rb;

import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15310Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f15311Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(F f6, int i10) {
        super(2);
        this.f15310Y = i10;
        this.f15311Z = f6;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f15310Y;
        F f6 = this.f15311Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("RootReason");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(f6.f15262a, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20307h, abstractC1725n, 0, 0, 65534);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("RootReason");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(f6.f15263b, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20313n, abstractC1725n, 0, 0, 65534);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f15310Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
