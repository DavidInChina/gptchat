package Ve;

import id.AbstractC3557B;
import livekit.org.webrtc.DataChannel;

/* loaded from: classes2.dex */
public final class I extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18667Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C1503i0 c1503i0) {
        super(1);
        this.f18667Y = c1503i0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        DataChannel dataChannel = (DataChannel) obj;
        AbstractC3557B.c0("dataChannel", dataChannel);
        String label = dataChannel.label();
        boolean K10 = AbstractC3557B.K(label, "_reliable");
        C1503i0 c1503i0 = this.f18667Y;
        if (K10) {
            c1503i0.f18793s = dataChannel;
        } else {
            if (AbstractC3557B.K(label, "_lossy")) {
                c1503i0.f18795u = dataChannel;
            }
            return jf.y.f36177a;
        }
        dataChannel.registerObserver(new E(c1503i0, dataChannel));
        return jf.y.f36177a;
    }
}
