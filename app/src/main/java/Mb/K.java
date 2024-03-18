package Mb;

import com.openai.chatgpt.R;
import f9.C2958j;
import id.AbstractC3557B;
import t9.AbstractC5684a;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11804Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f11805Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(S s10, int i10) {
        super(1);
        this.f11804Y = i10;
        this.f11805Z = s10;
    }

    public final G a(G g10) {
        Integer num;
        boolean z10;
        int i10 = this.f11804Y;
        S s10 = this.f11805Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", g10);
                Cf.g D02 = com.google.android.gms.internal.play_billing.N.D0(2, 18);
                Yg.r rVar = g10.f11780c;
                if (rVar != null) {
                    num = Integer.valueOf(AbstractC5684a.a(rVar, ((Yg.a) s10.f11838m).a()));
                } else {
                    num = null;
                }
                if (num != null && D02.s(num.intValue())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return G.e(g10, null, null, null, null, null, null, null, false, false, z10, false, false, 3583);
            default:
                AbstractC3557B.c0("$this$setState", g10);
                return G.e(g10, null, null, null, null, ((C2958j) s10.f11837l).a(R.string.onboarding_invalid_date), null, null, false, false, false, false, false, 4079);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f11804Y) {
            case 0:
                return a((G) obj);
            case 1:
                return a((G) obj);
            default:
                Cb.Y y10 = (Cb.Y) obj;
                AbstractC3557B.c0("it", y10);
                return Cb.Y.a(y10, Cb.g0.f2943h0, null, null, null, null, ((Yg.a) this.f11805Z.f11838m).a(), null, 94);
        }
    }
}
