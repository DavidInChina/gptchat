package lb;

import com.google.android.gms.internal.play_billing.N;
import gb.Y;
import gb.k0;
import gb.l0;
import kotlin.jvm.internal.C4302a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class u extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38060Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38061Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f38062h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38061Z = k10;
        this.f38062h0 = k0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new u(this.f38062h0, this.f38061Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((u) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [kotlin.jvm.internal.a, wf.k] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38060Y;
        K k10 = this.f38061Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            k10.l(n.f38042k0);
            String str = ((Y) this.f38062h0).f31380a;
            boolean z10 = ((l0) k10.e()).f31484f;
            K k11 = this.f38061Z;
            ?? c4302a = new C4302a(1, k11, K.class, "onDownloadImageSuccess", "onDownloadImageSuccess()V");
            s sVar = new s(k11, null);
            t tVar = new t(k10, null);
            this.f38060Y = 1;
            if (k10.f37957m.a(str, z10, c4302a, sVar, tVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        k10.l(n.f38043l0);
        return jf.y.f36177a;
    }
}
