package Li;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11232Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f11233Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ b f11234h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wf.n nVar, b bVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11233Z = nVar;
        this.f11234h0 = bVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("completion", abstractC4825e);
        return new j(this.f11233Z, this.f11234h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create(obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11232Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f11232Y = 1;
            if (this.f11233Z.invoke(this.f11234h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
