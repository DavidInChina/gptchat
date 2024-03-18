package Ve;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1506k extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1519y f18805Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506k(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18805Y = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1506k(this.f18805Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1506k) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        return this.f18805Y.f18921c.iceConnectionState();
    }
}
