package Db;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f3444Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3445Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f3446h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3446h0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        b bVar = new b(this.f3446h0, abstractC4825e);
        bVar.f3445Z = obj;
        return bVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3444Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.Q0(c5760d, this.f3446h0.f3481b.f18574i);
            P4.a.R0(c5760d, "dashboard/public/countries", null, 23);
            R4.b.L1(c5760d, "expand", "dial_code,label_local");
            Fe.a aVar = Vc.m.f18555c;
            y yVar = y.f36177a;
            Fe.l lVar = c5760d.f46130f;
            lVar.e(aVar, yVar);
            lVar.e(Vc.m.f18553a, yVar);
            lVar.e(Vc.m.f18554b, yVar);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f3445Z);
            this.f3444Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
