package Fc;

import Ec.C0499f;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;
import wd.v0;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f5220Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f5221Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f5221Z = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new k(this.f5221Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((k) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5220Y;
        o oVar = this.f5221Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            g gVar = oVar.f5227j;
            this.f5220Y = 1;
            obj = gVar.a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof q0) {
            oVar.f(new C0499f((q0) v0Var));
        }
        return y.f36177a;
    }
}
