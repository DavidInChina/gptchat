package g9;

import Ng.F;
import Yc.t;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: g9.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3218i extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31327Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3220k f31328Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3218i(C3220k c3220k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31328Z = c3220k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3218i(this.f31328Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3218i) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31327Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            t tVar = this.f31328Z.f31334c;
            this.f31327Y = 1;
            Object a5 = tVar.f22281Y.a(this);
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
