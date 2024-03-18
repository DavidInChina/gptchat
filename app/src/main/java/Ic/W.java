package ic;

import id.AbstractC3557B;
import jc.C3942j;
import xe.C6405J;

/* loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32981Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3942j f32982Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(C3942j c3942j, int i10) {
        super(1);
        this.f32981Y = i10;
        this.f32982Z = c3942j;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f32981Y;
        C3942j c3942j = this.f32982Z;
        switch (i10) {
            case 0:
                P p10 = (P) obj;
                AbstractC3557B.c0("$this$setState", p10);
                return P.e(p10, null, false, false, kf.t.t2(p10.f32964d, c3942j), null, false, null, null, 247);
            default:
                C6405J c6405j = (C6405J) obj;
                AbstractC3557B.c0("$this$url", c6405j);
                P4.a.n(c6405j, new String[]{c3942j.f36111a});
                return jf.y.f36177a;
        }
    }
}
