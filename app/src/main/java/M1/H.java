package M1;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class H extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11405Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f11406Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f11407h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Object obj, AbstractC4825e abstractC4825e, wf.n nVar) {
        super(2, abstractC4825e);
        this.f11406Z = nVar;
        this.f11407h0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new H(this.f11407h0, abstractC4825e, this.f11406Z);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11405Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f11405Y = 1;
            obj = this.f11406Z.invoke(this.f11407h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
