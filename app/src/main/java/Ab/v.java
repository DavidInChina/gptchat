package ab;

import Ng.F;
import cb.C2334C;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f24131Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1945C f24132Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C1945C c1945c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f24132Z = c1945c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f24132Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f24131Y;
        C1945C c1945c = this.f24132Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Va.e eVar = c1945c.f24060j;
            this.f24131Y = 1;
            obj = ((Ya.r) eVar).b(c1945c.f24062l, this, true);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            c1945c.l(new Ya.b((C2334C) ((u0) v0Var).f48468a, 1));
        } else if (v0Var instanceof q0) {
            c1945c.f(new C1959m((q0) v0Var));
        } else if (v0Var instanceof p0) {
            c1945c.l(new Ya.b(null, 1));
        } else {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
