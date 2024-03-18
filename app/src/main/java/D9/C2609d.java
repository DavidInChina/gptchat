package d9;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import f9.AbstractC2949a;
import f9.C2962n;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.Q;

/* renamed from: d9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2609d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f28131Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2949a f28132Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2609d(AbstractC2949a abstractC2949a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f28132Z = abstractC2949a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C2609d(this.f28132Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2609d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f28131Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ia.j jVar = ((Q) ((xd.h) ((C2962n) this.f28132Z).f29863u.get())).f44819b;
            this.f28131Y = 1;
            obj = L4.a.o0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        zd.n nVar = (zd.n) obj;
        if (nVar != null) {
            return nVar.f51984c;
        }
        return null;
    }
}
