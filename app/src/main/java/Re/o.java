package Re;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import livekit.org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class o implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15481a;

    public o(AbstractC2400f abstractC2400f) {
        this.f15481a = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        EglBase eglBase = (EglBase) this.f15481a.get();
        AbstractC3557B.c0("eglBase", eglBase);
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        AbstractC3557B.b0("eglBase.eglBaseContext", eglBaseContext);
        return eglBaseContext;
    }
}
