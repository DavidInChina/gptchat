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
public final class f extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f41219Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f41220Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41220Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f41220Z, abstractC4825e);
        fVar.f41219Y = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((f) create((q0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f41220Z.f(new C4222g((q0) this.f41219Y));
        return y.f36177a;
    }
}
