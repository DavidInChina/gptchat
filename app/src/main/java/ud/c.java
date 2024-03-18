package Ud;

import Ad.l;
import Ng.F;
import Qd.C1186e;
import Qd.i;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17707Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17708Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f17709h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ i f17710i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17709h0 = dVar;
        this.f17710i0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c cVar = new c(this.f17709h0, this.f17710i0, abstractC4825e);
        cVar.f17708Z = obj;
        return cVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        F f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17707Y;
        d dVar = this.f17709h0;
        if (i10 != 0) {
            if (i10 == 1) {
                f6 = (F) this.f17708Z;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f10 = (F) this.f17708Z;
            if (dVar.f17711a > 0) {
                f6 = f10;
            }
            return y.f36177a;
        }
        while (l.F0(f6)) {
            this.f17710i0.i().b(C1186e.f14598Y);
            long j6 = dVar.f17711a;
            this.f17708Z = f6;
            this.f17707Y = 1;
            if (R4.b.p0(j6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
