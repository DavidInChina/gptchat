package Ab;

import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class o extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f771Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f772Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f773h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Map f774i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ p f775j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar, String str, Map map, p pVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f772Z = jVar;
        this.f773h0 = str;
        this.f774i0 = map;
        this.f775j0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new o(this.f772Z, this.f773h0, this.f774i0, this.f775j0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((o) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f771Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f771Y = 1;
            obj = this.f772Z.a(this.f773h0, this.f774i0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        boolean z10 = v0Var instanceof u0;
        p pVar = this.f775j0;
        if (z10) {
            String str = (String) ((u0) v0Var).f48468a;
            if (str != null) {
                pVar.f(new f(str));
            }
        } else if (v0Var instanceof q0) {
            pVar.f(new g((q0) v0Var));
            pVar.h(new n(pVar, null));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        return y.f36177a;
    }
}
