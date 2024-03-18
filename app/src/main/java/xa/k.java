package xa;

import M1.w;
import Ng.F;
import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.Q;

/* loaded from: classes.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f49728Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ s f49729Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s sVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f49729Z = sVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f49729Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f49728Y;
        s sVar = this.f49729Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            Ia.j jVar = ((Q) sVar.f49768c).f44819b;
            this.f49728Y = 1;
            obj = L4.a.m0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        boolean z10 = ((zd.n) obj).f51982a;
        AbstractC1206i i02 = L4.a.i0(new w(((Q) sVar.f49768c).f44819b, 18));
        i iVar = new i(z10, sVar, null);
        this.f49728Y = 2;
        if (L4.a.b0(i02, iVar, this) == enumC5000a) {
            return enumC5000a;
        }
        return y.f36177a;
    }
}
