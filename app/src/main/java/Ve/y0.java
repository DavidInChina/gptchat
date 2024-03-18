package Ve;

import Qg.AbstractC1207j;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$SignalResponse;
import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class y0 implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18928Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f18929Z;

    public /* synthetic */ y0(E0 e02, int i10) {
        this.f18928Y = i10;
        this.f18929Z = e02;
    }

    @Override // Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f18928Y;
        E0 e02 = this.f18929Z;
        switch (i10) {
            case 0:
                e02.f18652z0.f();
                e02.l((LivekitRtc$SignalResponse) obj);
                return yVar;
            default:
                e02.f18649w0.f();
                e02.t((LivekitRtc$SignalRequest) obj);
                return yVar;
        }
    }
}
