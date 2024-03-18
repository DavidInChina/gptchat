package G;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6691c0;
import z.C6692d;
import z.C6694e;

/* renamed from: G.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0562q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5547Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f5548Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0562q(r rVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5548Z = rVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0562q(this.f5548Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0562q) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5547Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6694e c6694e = this.f5548Z.f5558h;
            this.f5547Y = 1;
            c6694e.getClass();
            Object a5 = C6691c0.a(c6694e.f51235h, new C6692d(c6694e, null), this);
            if (a5 != enumC5000a) {
                a5 = yVar;
            }
            if (a5 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
