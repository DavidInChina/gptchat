package U;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6473k;
import z.AbstractC6696f;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f17359Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f17360Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f17361h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, float f6, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f17360Z = nVar;
        this.f17361h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new l(this.f17360Z, this.f17361h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((l) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17359Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            n nVar = this.f17360Z;
            float h10 = nVar.f17369e.h();
            C6473k c6473k = new C6473k(8, nVar);
            this.f17359Y = 1;
            if (AbstractC6696f.c(h10, this.f17361h0, 0.0f, AbstractC6696f.u(0.0f, 0.0f, null, 7), c6473k, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
