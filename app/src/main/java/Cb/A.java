package Cb;

import Mb.AbstractC0949d0;
import Mb.C0942a;
import Mb.C0951e0;
import Mb.C0954g;
import Z8.AbstractC1809m0;
import Z8.C1808m;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import b9.EnumC2132a;
import c9.AbstractC2307a;
import com.openai.experiment.ExperimentKey;
import id.AbstractC3557B;
import java.util.List;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f2858Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f2859Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0949d0 f2860h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f2861i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AbstractActivityC4532l abstractActivityC4532l, AbstractC0949d0 abstractC0949d0, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2859Z = fVar;
        this.f2860h0 = abstractC0949d0;
        this.f2861i0 = abstractActivityC4532l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        A a5 = new A(this.f2861i0, this.f2860h0, this.f2859Z, abstractC4825e);
        a5.f2858Y = obj;
        return a5;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((A) create((Mb.Y) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        ActivityInfo activityInfo;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Mb.Y y10 = (Mb.Y) this.f2858Y;
        boolean z10 = y10 instanceof Mb.V;
        Tc.f fVar = this.f2859Z;
        AbstractActivityC4532l abstractActivityC4532l = this.f2861i0;
        if (z10) {
            Mb.V v10 = (Mb.V) y10;
            fVar.a(v10.f11854a, v10.f11855b, v10.f11856c, new F.s(y10, abstractActivityC4532l, fVar, 26));
        } else if (y10 instanceof Mb.X) {
            EnumC2132a enumC2132a = ((Mb.X) y10).f11868a;
            C0954g c0954g = (C0954g) this.f2860h0;
            c0954g.getClass();
            AbstractC3557B.c0("activity", abstractActivityC4532l);
            AbstractC3557B.c0("provider", enumC2132a);
            if (((C0951e0) c0954g.f808e.getValue()).f11915b == null) {
                c0954g.l(new nb.d(4, enumC2132a));
                AbstractC2307a.f26366b.getClass();
                List list = AbstractC2307a.f26367c;
                ResolveInfo resolveActivity = abstractActivityC4532l.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 65536);
                if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
                    str = activityInfo.packageName;
                } else {
                    str = null;
                }
                if (!kf.t.X1(list, str)) {
                    ExperimentKey.BrowserLoginAllowlist browserLoginAllowlist = ExperimentKey.BrowserLoginAllowlist.INSTANCE;
                    com.openai.experiment.G g10 = (com.openai.experiment.G) c0954g.f11939o;
                    if (!g10.c(browserLoginAllowlist)) {
                        if (g10.c(ExperimentKey.BrowserLoginWarning.INSTANCE)) {
                            c0954g.l(C0942a.f11885n0);
                        } else {
                            c0954g.m(abstractActivityC4532l);
                        }
                    }
                }
                c0954g.m(abstractActivityC4532l);
            }
        } else if (y10 instanceof Mb.U) {
            Bi.c.r1(fVar.f17057b, ((Mb.U) y10).f11851a);
        } else if (y10 instanceof Mb.W) {
            AbstractC1809m0.a().b(C1808m.f23387c, kf.w.f37484Y);
            N7.m a5 = ((Mb.W) y10).f11862a.a(abstractActivityC4532l);
            A9.b bVar = new A9.b(1, C0315z.f2975Y);
            a5.getClass();
            N7.l lVar = N7.g.f12724a;
            a5.b(lVar, bVar);
            a5.f12736b.i(new N7.i(lVar, new A9.a(1)));
            a5.i();
        }
        return jf.y.f36177a;
    }
}
