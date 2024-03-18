package lb;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.q0;

/* loaded from: classes.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f38056Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38057Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(K k10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38057Z = k10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        s sVar = new s(this.f38057Z, abstractC4825e);
        sVar.f38056Y = obj;
        return sVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((s) create((q0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f38057Z.f(new gb.I((q0) this.f38056Y));
        return jf.y.f36177a;
    }
}
