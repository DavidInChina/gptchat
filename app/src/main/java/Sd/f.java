package Sd;

import Df.AbstractC0405d;
import Li.q;
import Ng.F;
import Ng.Q;
import Qd.E;
import Qd.i;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f16572Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f16573Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g f16574h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, g gVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f16573Z = iVar;
        this.f16574h0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new f(this.f16573Z, this.f16574h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f16572Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            q e10 = this.f16573Z.f14611Z.e();
            AbstractC0405d b10 = C.f37623a.b(E.class);
            g gVar = this.f16574h0;
            U.i iVar = new U.i(2, gVar);
            this.f16572Y = 1;
            if (e10.f(gVar, b10, true, Q.f12904a, iVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
