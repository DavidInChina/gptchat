package P1;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f13777Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f13778Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ n f13779h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13779h0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c cVar = new c(this.f13779h0, abstractC4825e);
        cVar.f13778Z = obj;
        return cVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((h) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f13777Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f13777Y = 1;
            obj = this.f13779h0.invoke((h) this.f13778Z, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        h hVar = (h) obj;
        ((b) hVar).f13776b.set(true);
        return hVar;
    }
}
