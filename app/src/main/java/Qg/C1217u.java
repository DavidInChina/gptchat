package Qg;

import Rg.AbstractC1282c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1217u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14925Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f14926Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Pg.C f14927h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217u(kotlin.jvm.internal.B b10, Pg.C c10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14926Z = b10;
        this.f14927h0 = c10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1217u c1217u = new C1217u(this.f14926Z, this.f14927h0, abstractC4825e);
        c1217u.f14925Y = obj;
        return c1217u;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Pg.s sVar = new Pg.s(((Pg.s) obj).f14247a);
        jf.y yVar = jf.y.f36177a;
        ((C1217u) create(sVar, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Object obj2 = ((Pg.s) this.f14925Y).f14247a;
        boolean z10 = obj2 instanceof Pg.r;
        kotlin.jvm.internal.B b10 = this.f14926Z;
        if (!z10) {
            b10.f37622Y = obj2;
        }
        if (z10) {
            Throwable a5 = Pg.s.a(obj2);
            if (a5 == null) {
                this.f14927h0.k(new Rg.q());
                b10.f37622Y = AbstractC1282c.f15532d;
            } else {
                throw a5;
            }
        }
        return jf.y.f36177a;
    }
}
