package pe;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.Iterator;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public l f43113Y;

    /* renamed from: Z  reason: collision with root package name */
    public Iterator f43114Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f43115h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f43116i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f43116i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new i(this.f43116i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        Iterator it;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f43115h0;
        if (i10 != 0) {
            if (i10 == 1) {
                it = this.f43114Z;
                lVar = this.f43113Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            l lVar2 = this.f43116i0;
            it = lVar2.f43130Z.iterator();
            lVar = lVar2;
        }
        while (it.hasNext()) {
            AbstractC5152d abstractC5152d = lVar.f43129Y;
            this.f43113Y = lVar;
            this.f43114Z = it;
            this.f43115h0 = 1;
            if (((wf.n) it.next()).invoke(abstractC5152d, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
