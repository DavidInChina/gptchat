package mb;

import Qg.r0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4578C extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39018Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4586K f39019Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4578C(C4586K c4586k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39019Z = c4586k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4578C(this.f39019Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((C4578C) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39018Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
            throw new RuntimeException();
        }
        N.B0(obj);
        C4586K c4586k = this.f39019Z;
        r0 r0Var = c4586k.n().f39083e;
        C4577B c4577b = new C4577B(c4586k, 0);
        this.f39018Y = 1;
        r0Var.getClass();
        r0.n(r0Var, c4577b, this);
        return enumC5000a;
    }
}
