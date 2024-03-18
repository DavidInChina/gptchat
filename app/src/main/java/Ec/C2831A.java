package ec;

import na.F0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ec.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2831A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f29122Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2847Q f29123Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2831A(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29123Z = c2847q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2831A c2831a = new C2831A(this.f29123Z, abstractC4825e);
        c2831a.f29122Y = obj;
        return c2831a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C2831A) create((zd.n) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f29123Z.l(new F0((zd.n) this.f29122Y, 1));
        return jf.y.f36177a;
    }
}
