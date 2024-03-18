package la;

import Z8.AbstractC1809m0;
import Z8.C1821t;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import m9.C4573e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;

/* loaded from: classes.dex */
public final class g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f37900Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f37901Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37901Z = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g gVar = new g(this.f37901Z, abstractC4825e);
        gVar.f37900Y = obj;
        return gVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((g) create((C4573e) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C4573e c4573e = (C4573e) this.f37900Y;
        if (c4573e == null) {
            mVar = k.f37909a;
        } else {
            mVar = new l(c4573e, false, false);
        }
        this.f37901Z.l(new C6383b(8, mVar));
        if (c4573e != null) {
            AbstractC1809m0.a().b(C1821t.f23410c, i.m(mVar));
        }
        return y.f36177a;
    }
}
