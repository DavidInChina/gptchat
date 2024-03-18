package mb;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4589b extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4603p f39052Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4589b(C4603p c4603p, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f39052Y = c4603p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4589b(this.f39052Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((C4589b) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f39052Y.f39085g.v();
        return jf.y.f36177a;
    }
}
