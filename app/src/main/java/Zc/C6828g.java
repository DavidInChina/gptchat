package zc;

import Dd.C0398t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6828g extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51901Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f51902Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f51903h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Q f51904i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6828g(Q q10, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f51901Y = i10;
        this.f51904i0 = q10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f51901Y;
        Q q10 = this.f51904i0;
        switch (i10) {
            case 0:
                C6828g c6828g = new C6828g(q10, (AbstractC4825e) obj3, 0);
                c6828g.f51902Z = (Kd.m) obj;
                c6828g.f51903h0 = (C0398t) obj2;
                c6828g.invokeSuspend(yVar);
                return yVar;
            default:
                C6828g c6828g2 = new C6828g(q10, (AbstractC4825e) obj3, 1);
                c6828g2.f51902Z = (String) obj;
                c6828g2.f51903h0 = (String) obj2;
                c6828g2.invokeSuspend(yVar);
                return yVar;
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f51901Y;
        Q q10 = this.f51904i0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                q10.l(new Ra.l((Kd.m) this.f51902Z, 27, (C0398t) this.f51903h0));
                return yVar;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                q10.l(new C6.a(20, q10, (String) this.f51902Z, (String) this.f51903h0));
                return yVar;
        }
    }
}
