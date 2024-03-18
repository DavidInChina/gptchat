package Gd;

import Ng.F;
import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6280Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f6281Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g f6282h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC1206i abstractC1206i, g gVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6281Z = abstractC1206i;
        this.f6282h0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new d(this.f6281Z, this.f6282h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6280Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            c cVar = new c(this.f6282h0, null);
            this.f6280Y = 1;
            if (L4.a.b0(this.f6281Z, cVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
