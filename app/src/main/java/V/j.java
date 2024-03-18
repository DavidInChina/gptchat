package V;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.C6694e;
import z.C6735y0;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17940Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f17941Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17941Z = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new j(this.f17941Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17940Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C6694e c6694e = this.f17941Z.f17958g;
            Float f6 = new Float(1.0f);
            C6735y0 v10 = AbstractC6696f.v(75, 0, AbstractC6657D.f51128d, 2);
            this.f17940Y = 1;
            if (C6694e.c(c6694e, f6, v10, null, this, 12) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
