package zc;

import Dd.C0398t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6472j;

/* renamed from: zc.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6818E extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51826Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51827Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6818E(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51827Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6818E c6818e = new C6818E(this.f51827Z, abstractC4825e);
        c6818e.f51826Y = obj;
        return c6818e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C6818E) create(obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Object obj2 = this.f51826Y;
        if ((obj2 instanceof Kd.m) || (obj2 instanceof C0398t)) {
            this.f51827Z.l(new C6472j(4, obj2));
        }
        return jf.y.f36177a;
    }
}
