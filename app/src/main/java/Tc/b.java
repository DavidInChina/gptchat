package Tc;

import Ng.F;
import W.C1600p3;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17043Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f f17044Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f17045h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f17046i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i10, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17044Z = fVar;
        this.f17045h0 = i10;
        this.f17046i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new b(this.f17044Z, this.f17045h0, this.f17046i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17043Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C1600p3 c1600p3 = this.f17044Z.f17058c;
            p pVar = new p(this.f17045h0, this.f17046i0);
            this.f17043Y = 1;
            if (c1600p3.a(pVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
