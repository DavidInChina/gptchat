package D;

import Ng.F;
import Qg.AbstractC1206i;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f3182Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f3183Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f3184h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3183Z = lVar;
        this.f3184h0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new g(this.f3183Z, this.f3184h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3182Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ArrayList arrayList = new ArrayList();
            AbstractC1206i a5 = this.f3183Z.a();
            f fVar = new f(arrayList, this.f3184h0, 0);
            this.f3182Y = 1;
            if (a5.b(fVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
