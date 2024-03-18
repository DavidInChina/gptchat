package rc;

import Qg.r0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6200m;
import wd.u0;

/* renamed from: rc.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5455d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44853Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44854Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5463l f44855h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5455d(C5463l c5463l, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44855h0 = c5463l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5455d c5455d = new C5455d(this.f44855h0, abstractC4825e);
        c5455d.f44854Z = obj;
        return c5455d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5455d) create((C6200m) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44853Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            r0 r0Var = this.f44855h0.f44908e;
            u0 u0Var = new u0((C6200m) this.f44854Z);
            this.f44853Y = 1;
            if (r0Var.c(u0Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
