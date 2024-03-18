package Yc;

import Qg.n0;
import Vc.z;
import com.google.android.gms.internal.play_billing.N;
import f9.AbstractC2949a;
import f9.C2954f;
import f9.C2962n;
import g9.C3220k;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5472v;

/* loaded from: classes.dex */
public final class j extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f22244Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f22245Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f22245Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new j(this.f22245Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((j) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        f9.w wVar;
        Object obj2;
        C2954f c2954f;
        n0 n0Var;
        AbstractC2949a abstractC2949a;
        xd.b bVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22244Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f22244Y = 1;
            Object value = ((C3220k) ((z) this.f22245Z.f22252b.get())).f31338g.f14881Y.getValue();
            if (value instanceof f9.w) {
                wVar = (f9.w) value;
            } else {
                wVar = null;
            }
            if (wVar == null || (c2954f = (C2954f) wVar.f29979j.get()) == null || (n0Var = c2954f.f29786d) == null || (abstractC2949a = (AbstractC2949a) n0Var.f14881Y.getValue()) == null || (bVar = (xd.b) ((C2962n) abstractC2949a).f29829d.f29985p.get()) == null || (obj2 = ((C5472v) bVar).a(this)) != enumC5000a) {
                obj2 = yVar;
            }
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
