package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.j1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0136j1 extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ long f1371Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0139k1 f1372Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136j1(C0139k1 c0139k1, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f1372Z = c0139k1;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Ng.F f6 = (Ng.F) obj;
        long j6 = ((Z0.p) obj2).f22815a;
        C0136j1 c0136j1 = new C0136j1(this.f1372Z, (AbstractC4825e) obj3);
        c0136j1.f1371Y = j6;
        jf.y yVar = jf.y.f36177a;
        c0136j1.invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        long j6 = this.f1371Y;
        C0139k1 c0139k1 = this.f1372Z;
        Ad.l.O0(c0139k1.f1397v0.c(), null, null, new C0133i1(c0139k1, j6, null), 3);
        return jf.y.f36177a;
    }
}
