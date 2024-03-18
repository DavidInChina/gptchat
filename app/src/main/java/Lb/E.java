package lb;

import com.google.android.gms.internal.play_billing.N;
import gb.O;
import gb.k0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class E extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f37932Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f37933Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f37934h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f37933Z = k10;
        this.f37934h0 = k0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new E(this.f37934h0, this.f37933Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((E) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37932Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            k0 k0Var = this.f37934h0;
            String str = ((O) k0Var).f31368a;
            String str2 = ((O) k0Var).f31369b;
            this.f37932Y = 1;
            if (K.m(this.f37933Z, str, str2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
