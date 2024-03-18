package Ba;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;
import wd.v0;
import wf.n;
import x8.W;

/* loaded from: classes.dex */
public final class d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2011Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f2012Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2012Z = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new d(this.f2012Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2011Y;
        j jVar = this.f2012Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    v0Var = (v0) obj;
                    if (v0Var instanceof q0) {
                        W.W(Pc.e.a(), "Failed to fetch custom instructions", ((q0) v0Var).f48450a, null, 4);
                    }
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            l lVar = jVar.f2029a;
            this.f2011Y = 1;
            obj = L4.a.m0(lVar.f44961e, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        if (obj == null) {
            this.f2011Y = 2;
            obj = jVar.a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            v0Var = (v0) obj;
            if (v0Var instanceof q0) {
            }
        }
        return y.f36177a;
    }
}
