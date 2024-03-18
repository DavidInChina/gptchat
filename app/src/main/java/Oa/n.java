package oa;

import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41139Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41140Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41141h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41141h0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        n nVar = new n(this.f41141h0, abstractC4825e);
        nVar.f41140Z = obj;
        return nVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((C2311c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41139Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ea.a aVar = this.f41141h0.f41047b;
            this.f41139Y = 1;
            obj = ((xa.f) aVar).d((C2311c) this.f41140Z, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
