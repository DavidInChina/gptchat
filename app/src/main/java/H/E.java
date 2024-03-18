package H;

import B.AbstractC0130h1;
import E0.g0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class E extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6539Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f6540Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f6541h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f6542i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f6, float f10, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6540Z = f6;
        this.f6541h0 = f10;
        this.f6542i0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new E(this.f6540Z, this.f6541h0, this.f6542i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6539Y;
        jf.y yVar = jf.y.f36177a;
        F f6 = this.f6540Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f6539Y = 1;
            Object j6 = f6.f6567v.j(this);
            if (j6 != enumC5000a) {
                j6 = yVar;
            }
            if (j6 == enumC5000a) {
                return enumC5000a;
            }
        }
        float f10 = this.f6541h0;
        double d10 = f10;
        if (-0.5d <= d10 && d10 <= 0.5d) {
            int i11 = 0;
            if (f6.h() > 0) {
                i11 = com.google.android.gms.internal.play_billing.N.p(this.f6542i0, 0, f6.h() - 1);
            }
            A a5 = f6.f6549d;
            a5.f6527b.i(i11);
            a5.f6531f.b(i11);
            if (Math.abs(f10) == 0.0f) {
                f10 = 0.0f;
            }
            a5.f6528c.i(f10);
            a5.f6530e = null;
            g0 g0Var = (g0) f6.f6568w.getValue();
            if (g0Var != null) {
                ((androidx.compose.ui.node.a) g0Var).k();
            }
            return yVar;
        }
        throw new IllegalArgumentException(("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5").toString());
    }
}
