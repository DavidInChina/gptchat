package H9;

import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.v0;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public x f7552Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f7553Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x f7554h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ k f7555i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, k kVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f7554h0 = xVar;
        this.f7555i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new v(this.f7554h0, this.f7555i0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((v) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        x xVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7553Z;
        k kVar = this.f7555i0;
        if (i10 != 0) {
            if (i10 == 1) {
                xVar = this.f7552Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            x xVar2 = this.f7554h0;
            Ea.a aVar = xVar2.f7561k;
            C2311c c2311c = ((j) kVar).f7519a;
            this.f7552Y = xVar2;
            this.f7553Z = 1;
            Object a5 = ((xa.f) aVar).a(c2311c, false, this);
            if (a5 == enumC5000a) {
                return enumC5000a;
            }
            xVar = xVar2;
            obj = a5;
        }
        x.n(xVar, (v0) obj, ((j) kVar).f7519a);
        return jf.y.f36177a;
    }
}
