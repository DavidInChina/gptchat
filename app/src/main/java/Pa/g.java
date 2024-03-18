package Pa;

import Qg.l0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import wf.n;
import x8.W;

/* loaded from: classes2.dex */
public final class g extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f13903Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f13904Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h f13905h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l0 f13906i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, l0 l0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13905h0 = hVar;
        this.f13906i0 = l0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g gVar = new g(this.f13905h0, this.f13906i0, abstractC4825e);
        gVar.f13904Z = obj;
        return gVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((a) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        l0 l0Var;
        Object value;
        String str;
        String str2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f13903Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            a aVar = (a) this.f13904Z;
            String str3 = aVar.f13886a;
            if (str3 != null && (str = aVar.f13889d) != null && (str2 = aVar.f13888c) != null) {
                k kVar = this.f13905h0.f13907a;
                this.f13903Y = 1;
                obj = kVar.a(str3, str2, str, 2, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            return y.f36177a;
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            List list = (List) ((u0) v0Var).f48468a;
            do {
                l0Var = this.f13906i0;
                value = l0Var.getValue();
                ((b) value).getClass();
                AbstractC3557B.c0("suggestedReplies", list);
            } while (!l0Var.e(value, new b(list)));
        } else if (v0Var instanceof q0) {
            Pc.c a5 = Pc.e.a();
            W.W(a5, "Error fetching suggestions: " + ((q0) v0Var), null, null, 6);
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        return y.f36177a;
    }
}
