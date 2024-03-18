package mb;

import Qg.r0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4590c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39053Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4603p f39054Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4590c(C4603p c4603p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39054Z = c4603p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4590c(this.f39054Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4590c) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39053Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            r0 r0Var = this.f39054Z.f39080b;
            hb.x xVar = hb.x.f32140a;
            this.f39053Y = 1;
            if (r0Var.c(xVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
