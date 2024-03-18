package Re;

import ce.AbstractC2397c;
import df.C2636a;
import id.AbstractC3557B;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoDecoderFactory;
import livekit.org.webrtc.VideoDecoderFactory;

/* loaded from: classes2.dex */
public final class r implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15489a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f15490b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f15491c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f15492d;

    public r(p000if.a aVar, o oVar, f fVar) {
        j9.g gVar = b.f15465g;
        this.f15489a = aVar;
        this.f15490b = gVar;
        this.f15491c = oVar;
        this.f15492d = fVar;
    }

    @Override // p000if.a
    public final Object get() {
        boolean booleanValue = ((Boolean) this.f15490b.get()).booleanValue();
        EglBase.Context context = (EglBase.Context) this.f15491c.get();
        VideoDecoderFactory videoDecoderFactory = (VideoDecoderFactory) this.f15492d.get();
        AbstractC3557B.c0("webrtcInitialization", (d) this.f15489a.get());
        AbstractC3557B.c0("eglContext", context);
        if (videoDecoderFactory == null) {
            if (booleanValue) {
                return new C2636a(context);
            }
            return new SoftwareVideoDecoderFactory();
        }
        return videoDecoderFactory;
    }
}
