package ob;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kb.AbstractC4232q;
import kb.C4228m;
import lb.C4368e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class g extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f41221Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f41222Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4232q f41223h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, AbstractC4232q abstractC4232q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f41222Z = lVar;
        this.f41223h0 = abstractC4232q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new g(this.f41222Z, this.f41223h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((g) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41221Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            l lVar = this.f41222Z;
            C4368e c4368e = lVar.f41234l;
            String str = ((C4228m) this.f41223h0).f37261a;
            e eVar = new e(lVar, null);
            f fVar = new f(lVar, null);
            this.f41221Y = 1;
            if (c4368e.b(str, eVar, fVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
