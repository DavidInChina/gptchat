package sd;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class i extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ k f45542Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45542Y = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new i(this.f45542Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((i) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f45542Y.f44959c.delete();
        return y.f36177a;
    }
}
