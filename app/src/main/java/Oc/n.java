package oc;

import Ng.F;
import ca.C2321m;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nc.u;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41283Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41284Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q9.j f41285h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ o f41286i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N9.c f41287j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Va.e f41288k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Q9.j jVar, o oVar, N9.c cVar, Va.e eVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41285h0 = jVar;
        this.f41286i0 = oVar;
        this.f41287j0 = cVar;
        this.f41288k0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        n nVar = new n(this.f41285h0, this.f41286i0, this.f41287j0, this.f41288k0, abstractC4825e);
        nVar.f41284Z = obj;
        return nVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        F f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41283Y;
        o oVar = this.f41286i0;
        if (i10 != 0) {
            if (i10 == 1) {
                f6 = (F) this.f41284Z;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f10 = (F) this.f41284Z;
            String str = oVar.f41290k;
            this.f41284Z = f10;
            this.f41283Y = 1;
            Object c10 = ((Oa.e) this.f41285h0).c(str, this);
            if (c10 == enumC5000a) {
                return enumC5000a;
            }
            f6 = f10;
            obj = c10;
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof u0) {
            C2321m c2321m = (C2321m) ((u0) v0Var).f48468a;
            oVar.l(new C6.a(c2321m, this.f41287j0, oVar, 18));
            if (c2321m.f26402a.f26382i != null) {
                Ad.l.O0(f6, null, null, new m(this.f41288k0, c2321m, oVar, null), 3);
            }
        } else if (v0Var instanceof q0) {
            oVar.f(new u((q0) v0Var));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
        oVar.l(i.f41269j0);
        return y.f36177a;
    }
}
