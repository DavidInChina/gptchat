package cc;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f26566Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f26567Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f26567Z = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f26567Z, abstractC4825e);
        fVar.f26566Y = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((f) create((xd.e) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f26567Z.l(new C2390e((xd.e) this.f26566Y, 0));
        return y.f36177a;
    }
}
