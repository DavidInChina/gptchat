package mb;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y2.C6504G;

/* renamed from: mb.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4599l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4603p f39071Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f39072Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4599l(C4603p c4603p, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39071Y = c4603p;
        this.f39072Z = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4599l(this.f39071Y, this.f39072Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4599l) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C6504G c6504g = this.f39071Y.f39085g;
        c6504g.a(c6504g.k() + this.f39072Z);
        return jf.y.f36177a;
    }
}
