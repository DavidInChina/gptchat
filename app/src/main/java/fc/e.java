package Fc;

import Ec.C;
import Ng.F;
import Qg.F0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5198Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f5199Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h f5200h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f5201i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, h hVar, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5199Z = gVar;
        this.f5200h0 = hVar;
        this.f5201i0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f5199Z, this.f5200h0, this.f5201i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5198Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F0 f02 = this.f5199Z.f5209j0;
            C c10 = new C(this.f5201i0, this.f5200h0.f5215h0);
            this.f5198Y = 1;
            f02.setValue(c10);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
