package ob;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kb.C4222g;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;
import wf.n;

/* loaded from: classes2.dex */
public final class i extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f41225Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f41226Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41226Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        i iVar = new i(this.f41226Z, abstractC4825e);
        iVar.f41225Y = obj;
        return iVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((i) create((q0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f41226Z.f(new C4222g((q0) this.f41225Y));
        return y.f36177a;
    }
}
