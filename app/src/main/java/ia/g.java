package Ia;

import Ja.p;
import Ng.Q;
import Qg.F0;
import ca.C2311c;
import ca.EnumC2320l;
import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import vd.AbstractC6027b;
import vd.AbstractC6030e;
import vd.EnumC6026a;
import wd.C6168C;
import wf.n;

/* loaded from: classes2.dex */
public final class g extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public l f8504Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f8505Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f8506h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f8507i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8507i0 = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g gVar = new g(this.f8507i0, abstractC4825e);
        gVar.f8506h0 = obj;
        return gVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((C2311c) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        Object obj2;
        l lVar;
        EnumC2320l enumC2320l;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8505Z;
        if (i10 != 0) {
            if (i10 == 1) {
                lVar = this.f8504Y;
                obj2 = (AbstractC6027b) this.f8506h0;
                try {
                    N.B0(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    ((k9.c) obj2).a();
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C2311c c2311c = (C2311c) this.f8506h0;
            if (c2311c != null) {
                enumC2320l = c2311c.f26385l;
            } else {
                enumC2320l = null;
            }
            if (enumC2320l == EnumC2320l.f26398Y) {
                C2311c a5 = C2311c.a(c2311c, null, null, null, null, null, null, null, EnumC2320l.f26399Z, null, 14335);
                l lVar2 = this.f8507i0;
                F0 f02 = lVar2.f8530e;
                f02.setValue(AbstractC4268D.g1((Map) f02.getValue(), new C3959i(new C6168C(a5.f26374a), a5)));
                k9.c a10 = ((k9.d) AbstractC6030e.a()).a(EnumC6026a.f47474j0);
                try {
                    a10.b();
                    p pVar = lVar2.f8526a;
                    this.f8506h0 = a10;
                    this.f8504Y = lVar2;
                    this.f8505Z = 1;
                    pVar.f8948a.getClass();
                    obj = Ad.l.n1(this, Q.f12906c, new Ja.g(pVar, c2311c, null));
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    obj2 = a10;
                    lVar = lVar2;
                } catch (Throwable th4) {
                    th2 = th4;
                    obj2 = a10;
                    ((k9.c) obj2).a();
                    throw th2;
                }
            }
            return y.f36177a;
        }
        C2311c c2311c2 = (C2311c) obj;
        F0 f03 = lVar.f8530e;
        f03.setValue(AbstractC4268D.g1((Map) f03.getValue(), new C3959i(new C6168C(c2311c2.f26374a), c2311c2)));
        ((k9.c) obj2).a();
        return y.f36177a;
    }
}
