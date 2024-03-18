package na;

import android.content.Intent;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class N0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39838Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39839Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N0(B1 b1, int i10) {
        super(1);
        this.f39838Y = i10;
        this.f39839Z = b1;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f39838Y;
        B1 b1 = this.f39839Z;
        switch (i10) {
            case 0:
                Intent intent = (Intent) obj;
                AbstractC3557B.c0("it", intent);
                b1.f(new C4783q(intent));
                return jf.y.f36177a;
            default:
                zd.n nVar = (zd.n) obj;
                AbstractC3557B.c0("$this$update", nVar);
                return zd.n.a(nVar, false, null, false, false, false, false, false, false, ((D1) b1.e()).f39747B, false, 3071);
        }
    }
}
