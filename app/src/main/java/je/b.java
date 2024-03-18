package je;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import he.C3416a;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5761e;
import wf.n;

/* loaded from: classes.dex */
public final class b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f36124Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f36125Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5761e f36126h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, C5761e c5761e, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f36125Z = cVar;
        this.f36126h0 = c5761e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new b(this.f36125Z, this.f36126h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f36124Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            c cVar = this.f36125Z;
            AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) cVar.i().get(C1071k0.f12951Y);
            if (abstractC1073l0 != null) {
                z10 = abstractC1073l0.a();
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                this.f36124Y = 1;
                obj = ((ke.k) cVar).j(this.f36126h0, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                throw new C3416a();
            }
        }
        return obj;
    }
}
