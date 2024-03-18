package Ve;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1496f extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1519y f18753Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496f(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18753Y = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1496f(this.f18753Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((C1496f) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C1519y c1519y = this.f18753Y;
        c1519y.f18926h.set(true);
        c1519y.f18921c.dispose();
        return jf.y.f36177a;
    }
}
