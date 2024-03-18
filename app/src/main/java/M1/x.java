package M1;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import o9.C4957e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11469Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11470Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ J f11471h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(J j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11471h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        x xVar = new x(this.f11471h0, abstractC4825e);
        xVar.f11470Z = obj;
        return xVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11469Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC1207j abstractC1207j = (AbstractC1207j) this.f11470Z;
            J j6 = this.f11471h0;
            K k10 = (K) j6.f11423g.getValue();
            if (!(k10 instanceof C0922c)) {
                j6.f11425i.l(new n(k10));
            }
            w wVar = new w(new C4957e(j6.f11423g, new t(k10, null), 1), 0);
            this.f11469Y = 1;
            if (L4.a.j0(this, wVar, abstractC1207j) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
