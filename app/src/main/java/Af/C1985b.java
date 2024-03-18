package af;

import Ng.F;
import cf.AbstractC2406e;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: af.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1985b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f24168Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1988e f24169Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4825e f24170h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1985b(C1988e c1988e, AbstractC4825e abstractC4825e, AbstractC4825e abstractC4825e2) {
        super(2, abstractC4825e2);
        this.f24169Z = c1988e;
        this.f24170h0 = abstractC4825e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1985b(this.f24169Z, this.f24170h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1985b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f24168Y;
        C1988e c1988e = this.f24169Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Wg.d dVar = c1988e.f24183a;
            this.f24168Y = 1;
            if (dVar.e(null, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        AbstractC2406e abstractC2406e = c1988e.f24186d;
        Wg.d dVar2 = c1988e.f24183a;
        AbstractC4825e abstractC4825e = this.f24170h0;
        if (abstractC2406e != null) {
            dVar2.g(null);
            abstractC4825e.resumeWith(abstractC2406e);
        } else {
            c1988e.f24187e.add(abstractC4825e);
            dVar2.g(null);
        }
        return y.f36177a;
    }
}
