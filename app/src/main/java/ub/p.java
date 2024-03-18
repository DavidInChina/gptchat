package ub;

import Ng.F;
import Z.AbstractC1710f0;
import ca.C2317i;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public n f46580Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f46581Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2317i f46582h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46583i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C2317i c2317i, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46582h0 = c2317i;
        this.f46583i0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new p(this.f46582h0, this.f46583i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46581Z;
        if (i10 != 0) {
            if (i10 == 1) {
                nVar = this.f46580Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            n d10 = s.d(this.f46582h0);
            this.f46580Y = d10;
            this.f46581Z = 1;
            if (R4.b.p0(3200L, this) == enumC5000a) {
                return enumC5000a;
            }
            nVar = d10;
        }
        this.f46583i0.setValue(nVar);
        return jf.y.f36177a;
    }
}
