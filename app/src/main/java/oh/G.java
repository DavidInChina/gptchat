package oh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class G extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41380Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41381Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ I f41382h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41382h0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        G g10 = new G(this.f41382h0, abstractC4825e);
        g10.f41381Z = obj;
        return g10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41380Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            B0.A a5 = (B0.A) this.f41381Z;
            I i11 = this.f41382h0;
            if (!i11.f41391x0) {
                return yVar;
            }
            F f6 = new F(a5, i11, null);
            this.f41380Y = 1;
            if (Ad.l.e0(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
