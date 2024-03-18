package Ec;

import com.google.android.gms.internal.play_billing.N;
import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ec.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0494a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p0.f f4606Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0494a(p0.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4606Y = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0494a(this.f4606Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C0494a) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC4194d.d(this.f4606Y);
        return jf.y.f36177a;
    }
}
