package z;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6692d extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6694e f51226Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6692d(C6694e c6694e, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51226Y = c6694e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6692d(this.f51226Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((C6692d) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C6694e.a(this.f51226Y);
        return jf.y.f36177a;
    }
}
