package lb;

import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import gb.h0;
import gb.k0;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;
import wd.v0;

/* loaded from: classes2.dex */
public final class D extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f37929Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f37930Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f37931h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f37930Z = k10;
        this.f37931h0 = k0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new D(this.f37931h0, this.f37930Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((D) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37929Y;
        K k10 = this.f37930Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            T9.a aVar = k10.f37954j;
            C2969F c2969f = ((h0) this.f37931h0).f31446a;
            this.f37929Y = 1;
            obj = ((C4972C) aVar).k(c2969f, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof q0) {
            k10.f(new gb.I((q0) v0Var));
        }
        return jf.y.f36177a;
    }
}
