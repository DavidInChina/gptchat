package kh;

import Cd.I;
import Ng.H;
import Z.N;
import id.AbstractC3557B;
import jf.y;
import mh.C4686p;
import mh.P;
import q0.C5254f;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37570Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P f37571Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(P p10, int i10) {
        super(1);
        this.f37570Y = i10;
        this.f37571Z = p10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f37570Y;
        P p10 = this.f37571Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$DisposableEffect", (N) obj);
                C4686p c4686p = (C4686p) p10;
                boolean booleanValue = ((Boolean) c4686p.f39483c.getValue()).booleanValue();
                c4686p.f39483c.setValue(Boolean.FALSE);
                return new I(p10, booleanValue, 1);
            default:
                ((C4686p) p10).f39491k.setValue(new C5254f(H.z(((Z0.k) obj).f22804a)));
                return y.f36177a;
        }
    }
}
