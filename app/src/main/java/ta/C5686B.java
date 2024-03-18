package ta;

import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6783B;

/* renamed from: ta.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5686B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6783B f45803Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f45804Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5686B(C6783B c6783b, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45803Y = c6783b;
        this.f45804Z = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5686B(this.f45803Y, this.f45804Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C5686B) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C6783B c6783b = this.f45803Y;
        if (c6783b.f51758a.f16830a.f12512Y.length() > 0 || (!c6783b.f51762e.isEmpty())) {
            float f6 = AbstractC5690F.f45817a;
            this.f45804Z.setValue(Boolean.FALSE);
        }
        return jf.y.f36177a;
    }
}
