package fc;

import F.AbstractC0528b;
import W.E1;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import l0.C4323o;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30222Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f30223Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Tc.f fVar, int i10) {
        super(3);
        this.f30222Y = i10;
        this.f30223Z = fVar;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f30222Y;
        Tc.f fVar = this.f30223Z;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30183b, androidx.compose.foundation.a.h(c4323o, new F9.e(fVar, 21)), null, null, AbstractC3009d.f30184c, null, null, 0.0f, 0.0f, abstractC1725n, 24582, 492);
                return;
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30185d, androidx.compose.foundation.a.h(c4323o, new F9.e(fVar, 22)), null, null, AbstractC3009d.f30186e, null, null, 0.0f, 0.0f, abstractC1725n, 24582, 492);
                return;
            case 2:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30187f, androidx.compose.foundation.a.h(c4323o, new F9.e(fVar, 23)), null, null, AbstractC3009d.f30188g, null, null, 0.0f, 0.0f, abstractC1725n, 24582, 492);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                E1.a(AbstractC3009d.f30189h, androidx.compose.foundation.a.h(c4323o, new F9.e(fVar, 24)), null, null, AbstractC3009d.f30190i, null, null, 0.0f, 0.0f, abstractC1725n, 24582, 492);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f30222Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
