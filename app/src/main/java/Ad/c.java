package Ad;

import Qg.r0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f796Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f797Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h f798h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, h hVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f797Z = gVar;
        this.f798h0 = hVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new c(this.f797Z, this.f798h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((c) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f796Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            r0 r0Var = this.f797Z.f810g;
            h hVar = this.f798h0;
            AbstractC3557B.c0("effect", hVar);
            w wVar = new w(hVar);
            this.f796Y = 1;
            if (r0Var.c(wVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
