package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class R0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f1157Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ A1 f1158Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f1159h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(A1 a12, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1158Z = a12;
        this.f1159h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        R0 r02 = new R0(this.f1158Z, this.f1159h0, abstractC4825e);
        r02.f1157Y = obj;
        return r02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((R0) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f1158Z.a((AbstractC0130h1) this.f1157Y, this.f1159h0, 4);
        return jf.y.f36177a;
    }
}
