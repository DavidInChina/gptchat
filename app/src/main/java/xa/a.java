package Xa;

import Ng.F;
import Z.AbstractC1710f0;
import Z8.AbstractC1809m0;
import Z8.J;
import cb.C2334C;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.O;
import wf.n;

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2334C f21804Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f21805Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C2334C c2334c, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f21804Y = c2334c;
        this.f21805Z = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new a(this.f21804Y, this.f21805Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        if (((Boolean) this.f21805Z.getValue()).booleanValue()) {
            AbstractC1809m0.a().c(J.f23254c, new O(this.f21804Y.f26438a));
        }
        return y.f36177a;
    }
}
