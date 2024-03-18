package Li;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ q f11240Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f11241Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, c cVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11240Y = qVar;
        this.f11241Z = cVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("completion", abstractC4825e);
        return new l(this.f11240Y, this.f11241Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((l) create(obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f11240Y.f11255a.add(this.f11241Z);
        return y.f36177a;
    }
}
