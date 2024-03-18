package Kd;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y2.C6504G;

/* renamed from: Kd.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0828d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0830f f9729Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f9730Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0828d(C0830f c0830f, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9729Y = c0830f;
        this.f9730Z = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0828d(this.f9729Y, this.f9730Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C0828d) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C0830f c0830f = this.f9729Y;
        c0830f.f9734b.b(p2.H.b(v2.C.buildRawResourceUri(this.f9730Z)));
        C6504G c6504g = c0830f.f9734b;
        c6504g.u();
        c6504g.x(true);
        return jf.y.f36177a;
    }
}
