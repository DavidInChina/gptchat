package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199e0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ int f14838Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, Qg.e0, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f14838Y = ((Number) obj).intValue();
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1199e0) create(Integer.valueOf(((Number) obj).intValue()), (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        if (this.f14838Y > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
