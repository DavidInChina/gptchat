package G9;

import ca.C2311c;
import cb.C2334C;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class s extends AbstractC5163j implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ C2311c f6161Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Ba.c f6162Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ C2334C f6163h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ v f6164i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, AbstractC4825e abstractC4825e) {
        super(4, abstractC4825e);
        this.f6164i0 = vVar;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        s sVar = new s(this.f6164i0, (AbstractC4825e) obj4);
        sVar.f6161Y = (C2311c) obj;
        sVar.f6162Z = (Ba.c) obj2;
        sVar.f6163h0 = (C2334C) obj3;
        y yVar = y.f36177a;
        sVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f6164i0.l(new C6.a(this.f6161Y, this.f6163h0, this.f6162Z, 5));
        return y.f36177a;
    }
}
