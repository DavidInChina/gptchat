package C9;

import Ng.F;
import Qg.F0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public F0 f2748Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2749Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f2750h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2750h0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new a(this.f2750h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        F0 f02;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2749Z;
        if (i10 != 0) {
            if (i10 == 1) {
                f02 = this.f2748Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            l lVar = this.f2750h0;
            F0 f03 = lVar.f2801j;
            this.f2748Y = f03;
            this.f2749Z = 1;
            obj = lVar.f(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            f02 = f03;
        }
        f02.setValue(obj);
        return y.f36177a;
    }
}
