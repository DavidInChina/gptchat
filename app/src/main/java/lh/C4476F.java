package lh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lh.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4476F extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f38438Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f38439Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f38440h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4476F(r rVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38440h0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4476F c4476f = new C4476F(this.f38440h0, abstractC4825e);
        c4476f.f38439Z = obj;
        return c4476f;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4476F) create((AbstractC4471A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38438Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f38438Y = 1;
            obj = ((AbstractC4471A) this.f38439Z).c(this.f38440h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
