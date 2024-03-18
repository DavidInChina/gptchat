package la;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import m9.AbstractC4569a;
import m9.EnumC4572d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37902Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f37903Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ EnumC4572d f37904h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, EnumC4572d enumC4572d, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37903Z = iVar;
        this.f37904h0 = enumC4572d;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new h(this.f37903Z, this.f37904h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37902Y;
        i iVar = this.f37903Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            i.p(iVar, null, Boolean.TRUE, 5);
            AbstractC4569a abstractC4569a = iVar.f37905j;
            this.f37902Y = 1;
            obj = ((D9.e) abstractC4569a).a(this.f37904h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var != null) {
            if (v0Var instanceof q0) {
                q0 q0Var = (q0) v0Var;
                i.p(iVar, Boolean.TRUE, null, 6);
            }
            if (v0Var instanceof u0) {
                y yVar = (y) ((u0) v0Var).f48468a;
                i.p(iVar, Boolean.FALSE, null, 6);
            }
        }
        i.p(iVar, null, Boolean.FALSE, 5);
        return y.f36177a;
    }
}
