package g2;

import androidx.glance.session.SessionWorker;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class u extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ L f31138Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31139Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SessionWorker sessionWorker, L l10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f31138Y = l10;
        this.f31139Z = sessionWorker;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new u(this.f31139Z, this.f31138Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((u) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f31138Y.b(this.f31139Z.f25280o0.f31046c);
        return jf.y.f36177a;
    }
}
