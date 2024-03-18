package Ja;

import Ng.F;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p f8917Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2311c f8918Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, C2311c c2311c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8917Y = pVar;
        this.f8918Z = c2311c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new g(this.f8917Y, this.f8918Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        return p.a(this.f8917Y, this.f8918Z);
    }
}
