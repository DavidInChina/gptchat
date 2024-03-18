package r9;

import Z.AbstractC1725n;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final m f44577Z = new m(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final m f44578h0 = new m(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44579Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10) {
        super(3);
        this.f44579Y = i10;
    }

    public final void a(wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11 = 2;
        switch (this.f44579Y) {
            case 0:
                AbstractC3557B.c0("innerTextField", nVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(i10 & 14));
                return;
            default:
                AbstractC3557B.c0("innerTextField", nVar);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, Integer.valueOf(i10 & 14));
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44579Y) {
            case 0:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
