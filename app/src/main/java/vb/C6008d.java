package vb;

import Ng.F;
import a7.AbstractC1932a;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: vb.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6008d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1932a f47431Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6008d(AbstractC1932a abstractC1932a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f47431Y = abstractC1932a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6008d(this.f47431Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C6008d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        ((a7.d) this.f47431Y).a();
        return y.f36177a;
    }
}
