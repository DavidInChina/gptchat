package lb;

import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import gb.e0;
import gb.k0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lb.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4363C extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f37926Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f37927Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f37928h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4363C(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f37927Z = k10;
        this.f37928h0 = k0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4363C(this.f37928h0, this.f37927Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4363C) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37926Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C2969F c2969f = ((e0) this.f37928h0).f31423a;
            this.f37926Y = 1;
            if (K.p(this.f37927Z, c2969f, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
