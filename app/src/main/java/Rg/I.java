package Rg;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class I extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15521Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f15522Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f15523h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15523h0 = abstractC1207j;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        I i10 = new I(this.f15523h0, abstractC4825e);
        i10.f15522Z = obj;
        return i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create(obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15521Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Object obj2 = this.f15522Z;
            this.f15521Y = 1;
            if (this.f15523h0.c(obj2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
