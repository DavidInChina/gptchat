package Ng;

import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes.dex */
public final class u0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public y0 f12982Z;

    /* renamed from: h0  reason: collision with root package name */
    public Sg.p f12983h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f12984i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f12985j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ v0 f12986k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(AbstractC4825e abstractC4825e, v0 v0Var) {
        super(2, abstractC4825e);
        this.f12986k0 = v0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        u0 u0Var = new u0(abstractC4825e, this.f12986k0);
        u0Var.f12985j0 = obj;
        return u0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((Kg.l) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:25:0x0077). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Kg.l lVar;
        y0 y0Var;
        Sg.p pVar;
        y0 e10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12984i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    pVar = this.f12983h0;
                    y0Var = this.f12982Z;
                    lVar = (Kg.l) this.f12985j0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    pVar = pVar.j();
                    if (!AbstractC3557B.K(pVar, y0Var)) {
                        if (pVar instanceof C1080p) {
                            this.f12985j0 = lVar;
                            this.f12982Z = y0Var;
                            this.f12983h0 = pVar;
                            this.f12984i0 = 2;
                            lVar.c(((C1080p) pVar).f12962j0, this);
                            EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                            return enumC5000a;
                        }
                        pVar = pVar.j();
                        if (!AbstractC3557B.K(pVar, y0Var)) {
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Kg.l lVar2 = (Kg.l) this.f12985j0;
            Object U10 = this.f12986k0.U();
            if (U10 instanceof C1080p) {
                AbstractC1082q abstractC1082q = ((C1080p) U10).f12962j0;
                this.f12984i0 = 1;
                lVar2.c(abstractC1082q, this);
                return enumC5000a;
            } else if ((U10 instanceof AbstractC1063g0) && (e10 = ((AbstractC1063g0) U10).e()) != null) {
                Object i11 = e10.i();
                AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", i11);
                Sg.p pVar2 = (Sg.p) i11;
                lVar = lVar2;
                y0Var = e10;
                pVar = pVar2;
                if (!AbstractC3557B.K(pVar, y0Var)) {
                }
            }
        }
        return jf.y.f36177a;
    }
}
