package oc;

import Ng.F;
import Ya.r;
import ca.C2321m;
import cb.C2334C;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import ja.C3930b;
import ja.C3931c;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41279Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Va.e f41280Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2321m f41281h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ o f41282i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Va.e eVar, C2321m c2321m, o oVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41280Z = eVar;
        this.f41281h0 = c2321m;
        this.f41282i0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f41280Z, this.f41281h0, this.f41282i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C3931c c3931c;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41279Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            String str = this.f41281h0.f26402a.f26382i;
            this.f41279Y = 1;
            obj = ((r) this.f41280Z).b(str, this, true);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        boolean z10 = v0Var instanceof u0;
        o oVar = this.f41282i0;
        if (z10) {
            C2334C c2334c = (C2334C) ((u0) v0Var).f48468a;
            oVar.l(new Ya.b(c2334c, 4));
            C3931c.Companion.getClass();
            c3931c = C3930b.a(c2334c);
        } else if (v0Var instanceof q0) {
            q0 q0Var = (q0) v0Var;
            c3931c = new C3931c(oVar.f41289j.getString(R.string.anonymous_gizmo), false, false, (String) null, false, 30);
        } else if (v0Var instanceof p0) {
            oVar.l(new Ya.b(null, 4));
            C3931c.Companion.getClass();
            c3931c = C3930b.a(null);
        } else {
            throw new RuntimeException();
        }
        oVar.l(new nb.d(20, c3931c));
        return y.f36177a;
    }
}
