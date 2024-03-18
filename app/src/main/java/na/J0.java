package na;

import java.util.Set;
import kf.AbstractC4273I;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class J0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39811Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39812Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39812Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new J0(this.f39812Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Qg.F0 f02;
        Object value;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39811Y;
        B1 b1 = this.f39812Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Qg.F0 f03 = b1.f808e;
            ?? abstractC5163j = new AbstractC5163j(2, null);
            this.f39811Y = 1;
            if (L4.a.n0(f03, abstractC5163j, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        xd.i iVar = b1.f39711l;
        zd.j jVar = zd.j.f51975d;
        rc.c0 c0Var = (rc.c0) iVar;
        c0Var.getClass();
        do {
            f02 = c0Var.f44851c;
            value = f02.getValue();
        } while (!f02.e(value, AbstractC4273I.v2((Set) value, jVar)));
        Ia.j jVar2 = new Ia.j(c0Var.f44852d, 4, jVar);
        H0.p1 p1Var = new H0.p1(1, b1);
        this.f39811Y = 2;
        if (jVar2.b(p1Var, this) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
