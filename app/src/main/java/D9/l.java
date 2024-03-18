package d9;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pd.C5148a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f28150Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f28151Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f28151Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        l lVar = new l(this.f28151Z, abstractC4825e);
        lVar.f28150Y = obj;
        return lVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((l) create((pd.c) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        pd.c cVar = (pd.c) this.f28150Y;
        boolean z10 = cVar instanceof pd.b;
        Tc.f fVar = this.f28151Z;
        if (z10) {
            Tc.f.c(fVar, ((pd.b) cVar).f43057a, 0, 14);
        } else if (cVar instanceof C5148a) {
            fVar.f17057b.l(((C5148a) cVar).f43056a);
        }
        return y.f36177a;
    }
}
