package Ja;

import Ng.F;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import n9.C4726e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8935Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f8936Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2311c f8937h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, C2311c c2311c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8936Z = pVar;
        this.f8937h0 = c2311c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f8936Z, this.f8937h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8935Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            p pVar = this.f8936Z;
            C4726e c4726e = pVar.f8950c;
            l lVar = new l(pVar, this.f8937h0, null);
            this.f8935Y = 1;
            if (p.c(pVar, c4726e, "save", lVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
