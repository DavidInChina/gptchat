package sb;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: sb.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5606f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p0.l f45506Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5606f(p0.l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45506Y = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5606f(this.f45506Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C5606f) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        K8.d.N0(this.f45506Y);
        return y.f36177a;
    }
}
