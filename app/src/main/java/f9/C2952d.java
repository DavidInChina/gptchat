package f9;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nd.AbstractC4813b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5453b;

/* renamed from: f9.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2952d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29776Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4813b f29777Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2952d(AbstractC4813b abstractC4813b, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29777Z = abstractC4813b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C2952d(this.f29777Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2952d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29776Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ia.j jVar = ((C5453b) this.f29777Z).f44843a;
            this.f29776Y = 1;
            obj = L4.a.m0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
