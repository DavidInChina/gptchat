package qe;

import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.B;
import io.ktor.utils.io.u;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ze.AbstractC6847f;

/* loaded from: classes2.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44128Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44129Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6847f f44130h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AbstractC6847f abstractC6847f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44130h0 = abstractC6847f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        p pVar = new p(this.f44130h0, abstractC4825e);
        pVar.f44129Z = obj;
        return pVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((B) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44128Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            u uVar = ((B) this.f44129Z).f33365Y;
            this.f44128Y = 1;
            if (this.f44130h0.e(uVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
