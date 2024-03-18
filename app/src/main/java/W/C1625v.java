package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1625v extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f20487Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f20488Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.o f20489h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625v(C c10, AbstractC4825e abstractC4825e, wf.o oVar) {
        super(1, abstractC4825e);
        this.f20488Z = c10;
        this.f20489h0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1625v(this.f20488Z, abstractC4825e, this.f20489h0);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1625v) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20487Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C c10 = this.f20488Z;
            A a5 = new A(c10, 1);
            C1620u c1620u = new C1620u(c10, null, this.f20489h0);
            this.f20487Y = 1;
            if (kotlin.jvm.internal.m.m(a5, c1620u, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
