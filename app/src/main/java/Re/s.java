package Re;

import ce.AbstractC2397c;
import df.C2637b;
import id.AbstractC3557B;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;

/* loaded from: classes2.dex */
public final class s implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15493a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f15494b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f15495c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f15496d;

    public s(p000if.a aVar, o oVar, f fVar) {
        j9.g gVar = b.f15465g;
        this.f15493a = aVar;
        this.f15494b = gVar;
        this.f15495c = oVar;
        this.f15496d = fVar;
    }

    @Override // p000if.a
    public final Object get() {
        boolean booleanValue = ((Boolean) this.f15494b.get()).booleanValue();
        EglBase.Context context = (EglBase.Context) this.f15495c.get();
        VideoEncoderFactory videoEncoderFactory = (VideoEncoderFactory) this.f15496d.get();
        AbstractC3557B.c0("webrtcInitialization", (d) this.f15493a.get());
        AbstractC3557B.c0("eglContext", context);
        if (videoEncoderFactory == null) {
            if (booleanValue) {
                return new C2637b(context);
            }
            return new SoftwareVideoEncoderFactory();
        }
        return videoEncoderFactory;
    }
}
