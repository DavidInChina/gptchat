package Dc;

import Ad.o;
import Ad.q;
import Z8.AbstractC1809m0;
import Z8.Y0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kf.w;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import wf.k;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public int f3493Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f3494Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f3494Z = dVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new b(this.f3494Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((b) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3493Y;
        d dVar = this.f3494Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC1809m0.a().b(Y0.f23307t, w.f37484Y);
            dVar.l(a.f3488Z);
            this.f3493Y = 1;
            obj = ((C5451O) dVar.f3497j).g(true, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            y yVar = (y) ((u0) v0Var).f48468a;
            dVar.g(o.f825a);
        } else if (v0Var instanceof q0) {
            dVar.g(new q((q0) v0Var));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        dVar.l(a.f3489h0);
        return y.f36177a;
    }
}
