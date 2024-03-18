package zc;

import bb.B0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6834m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51917Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51918Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6834m(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51918Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6834m c6834m = new C6834m(this.f51918Z, abstractC4825e);
        c6834m.f51917Y = obj;
        return c6834m;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C6834m) create((String) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f51918Z.l(new B0((String) this.f51917Y, 8));
        return jf.y.f36177a;
    }
}
