package t3;

import Ng.F;
import Z.l1;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import java.util.Set;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import s3.C5562l;

/* loaded from: classes2.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ l1 f45690Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f45691Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j0.u f45692h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l1 l1Var, m mVar, j0.u uVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45690Y = l1Var;
        this.f45691Z = mVar;
        this.f45692h0 = uVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new j(this.f45690Y, this.f45691Z, this.f45692h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((j) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        for (C5562l c5562l : (Set) this.f45690Y.getValue()) {
            m mVar = this.f45691Z;
            if (!((List) mVar.b().f45327e.f14881Y.getValue()).contains(c5562l) && !this.f45692h0.contains(c5562l)) {
                mVar.b().b(c5562l);
            }
        }
        return jf.y.f36177a;
    }
}
