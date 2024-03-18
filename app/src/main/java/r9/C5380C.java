package r9;

import E.q0;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import x8.W;

/* renamed from: r9.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5380C extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44482Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f44483Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f44484h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5380C(boolean z10, wf.n nVar, int i10) {
        super(3);
        this.f44482Y = i10;
        this.f44483Z = z10;
        this.f44484h0 = nVar;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44482Y;
        boolean z10 = this.f44483Z;
        wf.n nVar = this.f44484h0;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$OutlinedButton", q0Var);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                W.A(z10, nVar, abstractC1725n, 0);
                return;
            default:
                AbstractC3557B.c0("$this$Button", q0Var);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                W.A(z10, nVar, abstractC1725n, 0);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44482Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
