package Ad;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f791Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f792Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f792Z = gVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        a aVar = new a(this.f792Z, abstractC4825e);
        aVar.f791Y = obj;
        return aVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((a) create((i) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f792Z.i((i) this.f791Y);
        return jf.y.f36177a;
    }
}
