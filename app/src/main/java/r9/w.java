package r9;

import A.B0;
import B.L0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class w extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44615Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F.J f44616Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ L0 f44617h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(F.J j6, L0 l02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44616Z = j6;
        this.f44617h0 = l02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new w(this.f44616Z, this.f44617h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44615Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            v vVar = new v(this.f44617h0, null);
            this.f44615Y = 1;
            if (this.f44616Z.c(B0.f14Y, vVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
