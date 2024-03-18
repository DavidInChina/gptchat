package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6205s;

/* loaded from: classes2.dex */
public final class T0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39872Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39873Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39873Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        T0 t02 = new T0(this.f39873Z, abstractC4825e);
        t02.f39872Y = obj;
        return t02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((T0) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        B1 b1 = this.f39873Z;
        b1.l(new s3.r((C6205s) this.f39872Y, 25, b1));
        return jf.y.f36177a;
    }
}
