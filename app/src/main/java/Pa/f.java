package Pa;

import Qg.l0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import kf.v;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes2.dex */
public final class f extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f13901Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l0 f13902Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l0 l0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13902Z = l0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f13902Z, abstractC4825e);
        fVar.f13901Y = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((f) create((a) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        l0 l0Var;
        Object value;
        v vVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        if (!AbstractC3557B.K(((a) this.f13901Y).f13887b, T9.i.f16976a)) {
            do {
                l0Var = this.f13902Z;
                value = l0Var.getValue();
                vVar = v.f37483Y;
                ((b) value).getClass();
            } while (!l0Var.e(value, new b(vVar)));
            return y.f36177a;
        }
        return y.f36177a;
    }
}
