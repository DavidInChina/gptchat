package mb;

import Qg.r0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4591d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39055Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4603p f39056Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4591d(C4603p c4603p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39056Z = c4603p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4591d(this.f39056Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4591d) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39055Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            this.f39055Y = 1;
            if (R4.b.p0(1000L, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        r0 r0Var = this.f39056Z.f39080b;
        hb.v vVar = hb.v.f32138a;
        this.f39055Y = 2;
        if (r0Var.c(vVar, this) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
