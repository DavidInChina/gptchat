package H9;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.u0;

/* loaded from: classes.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f7544Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x f7545Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7545Z = xVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new s(this.f7545Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7544Y;
        x xVar = this.f7545Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            m mVar = xVar.f7560j;
            this.f7544Y = 1;
            if (mVar.f7527d) {
                obj2 = new u0(Boolean.TRUE);
            } else {
                obj2 = mVar.a(this);
            }
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        xVar.l(r.f7543Y);
        return jf.y.f36177a;
    }
}
