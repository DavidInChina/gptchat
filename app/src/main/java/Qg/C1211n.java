package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1211n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14879Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14880Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1211n(AbstractC1206i abstractC1206i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14880Z = abstractC1206i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1211n(this.f14880Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1211n) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14879Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f14879Y = 1;
            Object b10 = this.f14880Z.b(Rg.A.f15509Y, this);
            if (b10 != enumC5000a) {
                b10 = yVar;
            }
            if (b10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
