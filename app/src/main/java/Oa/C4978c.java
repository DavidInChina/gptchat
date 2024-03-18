package oa;

import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: oa.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4978c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41089Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41090Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41091h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4978c(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41091h0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4978c c4978c = new C4978c(this.f41091h0, abstractC4825e);
        c4978c.f41090Z = obj;
        return c4978c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4978c) create((C2311c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41089Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ea.a aVar = this.f41091h0.f41047b;
            this.f41089Y = 1;
            obj = ((xa.f) aVar).a((C2311c) this.f41090Z, true, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
