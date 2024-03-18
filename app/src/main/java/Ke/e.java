package ke;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.F;
import Wh.w;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37381Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f37382Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37382Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f37382Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37381Y;
        k kVar = this.f37382Z;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                AbstractC4829i abstractC4829i = kVar.f37406l0.get(C1071k0.f12951Y);
                AbstractC3557B.Z(abstractC4829i);
                this.f37381Y = 1;
                if (((AbstractC1073l0) abstractC4829i).F(this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            for (Map.Entry entry : r5) {
                w wVar = (w) entry.getValue();
                wVar.f21303Z.l();
                wVar.f21302Y.b().shutdown();
            }
            return y.f36177a;
        } finally {
            for (Map.Entry entry2 : kVar.f37408n0.entrySet()) {
                w wVar2 = (w) entry2.getValue();
                wVar2.f21303Z.l();
                wVar2.f21302Y.b().shutdown();
            }
        }
    }
}ar.getClass();
        return hashSet;
    }

    public final L3.z F0() {
        if (!this.f11615l) {
            V3.e eVar = new V3.e(this);
            this.f11609f.f11520i.a(eVar);
            this.f11616m = eVar.f18342Z;
        } else {
            L3.s d10 = L3.s.d();
            d10.g(f11608n, "Already enqueued work ids (" + TextUtils.join(", ", this.f11613j) + Separators.RPAREN);
        }
        return this.f11616m;
    }
}
