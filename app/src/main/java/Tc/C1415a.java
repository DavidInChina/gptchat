package Tc;

import Ng.F;
import W.C1585m3;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Tc.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1415a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ f f17042Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415a(f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17042Y = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1415a(this.f17042Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C1415a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C1585m3 c1585m3 = (C1585m3) this.f17042Y.f17058c.f20299b.getValue();
        if (c1585m3 != null) {
            c1585m3.a();
        }
        return jf.y.f36177a;
    }
}
