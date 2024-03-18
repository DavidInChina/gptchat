package ub;

import Ng.F;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f46602Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46603Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e, boolean z10) {
        super(2, abstractC4825e);
        this.f46602Y = z10;
        this.f46603Z = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f46603Z, abstractC4825e, this.f46602Y);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((v) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        if (!this.f46602Y) {
            Yg.p.Companion.getClass();
            this.f46603Z.setValue(new Yg.p(AbstractC6463a.n("instant(...)")));
        }
        return jf.y.f36177a;
    }
}
