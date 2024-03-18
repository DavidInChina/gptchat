package f4;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29607Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f29608Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q4.j f29609h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, q4.j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29608Z = qVar;
        this.f29609h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f29608Z, this.f29609h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29607Y;
        q qVar = this.f29608Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f29607Y = 1;
            obj = q.a(qVar, this.f29609h0, 0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        if (((q4.k) obj) instanceof q4.e) {
            qVar.getClass();
        }
        return obj;
    }
}
