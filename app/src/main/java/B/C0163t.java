package B;

import Ng.AbstractC1073l0;
import Qg.AbstractC1207j;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: B.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163t implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1494Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ng.F f1495Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1496h0;

    public C0163t(kotlin.jvm.internal.B b10, Ng.F f6, wf.n nVar) {
        this.f1494Y = b10;
        this.f1495Z = f6;
        this.f1496h0 = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        C0160s c0160s;
        int i10;
        C0163t c0163t;
        if (abstractC4825e instanceof C0160s) {
            c0160s = (C0160s) abstractC4825e;
            int i11 = c0160s.f1486j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0160s.f1486j0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c0160s.f1484h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0160s.f1486j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        obj = c0160s.f1483Z;
                        c0163t = c0160s.f1482Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) this.f1494Y.f37622Y;
                    if (abstractC1073l0 != null) {
                        abstractC1073l0.k(new CancellationException());
                        c0160s.f1482Y = this;
                        c0160s.f1483Z = obj;
                        c0160s.getClass();
                        c0160s.f1486j0 = 1;
                        if (abstractC1073l0.F(c0160s) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    c0163t = this;
                }
                kotlin.jvm.internal.B b10 = c0163t.f1494Y;
                Ng.G g10 = Ng.G.f12870i0;
                wf.n nVar = c0163t.f1496h0;
                Ng.F f6 = c0163t.f1495Z;
                b10.f37622Y = Ad.l.O0(f6, null, g10, new r(nVar, obj, f6, null), 1);
                return jf.y.f36177a;
            }
        }
        c0160s = new C0160s(this, abstractC4825e);
        Object obj22 = c0160s.f1484h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0160s.f1486j0;
        if (i10 == 0) {
        }
        kotlin.jvm.internal.B b102 = c0163t.f1494Y;
        Ng.G g102 = Ng.G.f12870i0;
        wf.n nVar2 = c0163t.f1496h0;
        Ng.F f62 = c0163t.f1495Z;
        b102.f37622Y = Ad.l.O0(f62, null, g102, new r(nVar2, obj, f62, null), 1);
        return jf.y.f36177a;
    }
}
