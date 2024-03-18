package bb;

import h9.C3338c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6205s;

/* loaded from: classes.dex */
public final class F extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f25708Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ L f25709Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(L l10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f25709Z = l10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        F f6 = new F(this.f25709Z, abstractC4825e);
        f6.f25708Y = obj;
        return f6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((F) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f25709Z.l(new C3338c((C6205s) this.f25708Y, 1));
        return jf.y.f36177a;
    }
}
