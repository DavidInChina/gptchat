package Kd;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class w extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ I f9772Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(I i10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f9772Y = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new w(this.f9772Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((w) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        I i10 = this.f9772Y;
        i10.f9690m.f18869h.close();
        ((C0830f) i10.f9692o.getValue()).f9734b.v();
        return jf.y.f36177a;
    }
}
