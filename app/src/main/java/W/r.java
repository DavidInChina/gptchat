package W;

import Ng.AbstractC1073l0;
import Qg.AbstractC1207j;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class r implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f20362Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ng.F f20363Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20364h0;

    public r(kotlin.jvm.internal.B b10, Ng.F f6, wf.n nVar) {
        this.f20362Y = b10;
        this.f20363Z = f6;
        this.f20364h0 = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        C1601q c1601q;
        int i10;
        r rVar;
        if (abstractC4825e instanceof C1601q) {
            c1601q = (C1601q) abstractC4825e;
            int i11 = c1601q.f20319j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1601q.f20319j0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1601q.f20317h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1601q.f20319j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = c1601q.f20316Z;
                        rVar = c1601q.f20315Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) this.f20362Y.f37622Y;
                    if (abstractC1073l0 != null) {
                        abstractC1073l0.k(new CancellationException());
                        c1601q.f20315Y = this;
                        c1601q.f20316Z = obj;
                        c1601q.getClass();
                        c1601q.f20319j0 = 1;
                        if (abstractC1073l0.F(c1601q) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    rVar = this;
                }
                kotlin.jvm.internal.B b10 = rVar.f20362Y;
                Ng.G g10 = Ng.G.f12870i0;
                wf.n nVar = rVar.f20364h0;
                Ng.F f6 = rVar.f20363Z;
                b10.f37622Y = Ad.l.O0(f6, null, g10, new C1596p(nVar, obj, f6, null), 1);
                return jf.y.f36177a;
            }
        }
        c1601q = new C1601q(this, abstractC4825e);
        Object obj22 = c1601q.f20317h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1601q.f20319j0;
        if (i10 == 0) {
        }
        kotlin.jvm.internal.B b102 = rVar.f20362Y;
        Ng.G g102 = Ng.G.f12870i0;
        wf.n nVar2 = rVar.f20364h0;
        Ng.F f62 = rVar.f20363Z;
        b102.f37622Y = Ad.l.O0(f62, null, g102, new C1596p(nVar2, obj, f62, null), 1);
        return jf.y.f36177a;
    }
}
