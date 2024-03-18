package y;

import Z.l1;
import id.AbstractC3557B;
import q0.C5251c;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import ta.AbstractC5690F;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50149Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l1 f50150Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(l1 l1Var, int i10) {
        super(1);
        this.f50149Y = i10;
        this.f50150Z = l1Var;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f50149Y;
        l1 l1Var = this.f50150Z;
        switch (i10) {
            case 0:
                ((r0.I) ((r0.x) obj)).a(((Number) l1Var.getValue()).floatValue());
                return yVar;
            case 1:
                ((wf.k) l1Var.getValue()).invoke(new C5251c(((C5251c) obj).f43623a));
                return yVar;
            default:
                AbstractC5646e abstractC5646e = (AbstractC5646e) obj;
                AbstractC3557B.c0("$this$drawWithContent", abstractC5646e);
                ((G0.J) abstractC5646e).a();
                float f6 = AbstractC5690F.f45817a;
                AbstractC5648g.k(abstractC5646e, ((r0.r) l1Var.getValue()).f44265a, 0L, 0L, 0.0f, 126);
                return yVar;
        }
    }
}
