package Q8;

import Z.C1733r0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14472Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ xi.c f14473Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f14474h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xi.c cVar, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14473Z = cVar;
        this.f14474h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        b bVar = new b(this.f14473Z, this.f14474h0, abstractC4825e);
        bVar.f14472Y = obj;
        return bVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((b) create((C1733r0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        ((C1733r0) this.f14472Y).setValue(this.f14473Z.a(this.f14474h0));
        return y.f36177a;
    }
}
