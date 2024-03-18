package G;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6694e;

/* renamed from: G.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0560o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5543Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f5544Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0560o(r rVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5544Z = rVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0560o(this.f5544Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0560o) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5543Y;
        r rVar = this.f5544Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6694e c6694e = rVar.f5557g;
            int i11 = Z0.i.f22798c;
            Z0.i iVar = new Z0.i(Z0.i.f22797b);
            this.f5543Y = 1;
            if (c6694e.f(iVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        int i12 = Z0.i.f22798c;
        long j6 = Z0.i.f22797b;
        int i13 = r.f5550n;
        rVar.c(j6);
        rVar.b(false);
        return jf.y.f36177a;
    }
}
