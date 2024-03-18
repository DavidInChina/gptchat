package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.f1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4752f1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f39978Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39979Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4752f1(B1 b1, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f39979Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4752f1(this.f39979Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4752f1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39978Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.i iVar = this.f39979Z.f39711l;
            zd.j jVar = zd.j.f51975d;
            this.f39978Y = 1;
            rc.c0 c0Var = (rc.c0) iVar;
            c0Var.getClass();
            Object a5 = ((rc.Q) c0Var.f44850b).a(new rc.X(jVar, 1), this);
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
