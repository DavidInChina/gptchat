package gc;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p0.l f31567Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p0.l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31567Y = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f31567Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f31567Y.a();
        return y.f36177a;
    }
}