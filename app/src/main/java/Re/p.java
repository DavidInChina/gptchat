package Re;

import ce.AbstractC2397c;
import id.AbstractC3557B;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;

/* loaded from: classes2.dex */
public final class p implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15482a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f15483b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f15484c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f15485d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f15486e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f15487f;

    public p(p000if.a aVar, p000if.a aVar2, s sVar, r rVar, h hVar, p000if.a aVar3) {
        this.f15482a = aVar;
        this.f15483b = aVar2;
        this.f15484c = sVar;
        this.f15485d = rVar;
        this.f15486e = hVar;
        this.f15487f = aVar3;
    }

    @Override // p000if.a
    public final Object get() {
        AudioDeviceModule audioDeviceModule = (AudioDeviceModule) this.f15483b.get();
        VideoEncoderFactory videoEncoderFactory = (VideoEncoderFactory) this.f15484c.get();
        VideoDecoderFactory videoDecoderFactory = (VideoDecoderFactory) this.f15485d.get();
        PeerConnectionFactory.Options options = (PeerConnectionFactory.Options) this.f15486e.get();
        Ue.a aVar = (Ue.a) this.f15487f.get();
        AbstractC3557B.c0("webrtcInitialization", (d) this.f15482a.get());
        AbstractC3557B.c0("audioDeviceModule", audioDeviceModule);
        AbstractC3557B.c0("videoEncoderFactory", videoEncoderFactory);
        AbstractC3557B.c0("videoDecoderFactory", videoDecoderFactory);
        AbstractC3557B.c0("memoryManager", aVar);
        PeerConnectionFactory.Builder videoDecoderFactory2 = PeerConnectionFactory.builder().setAudioDeviceModule(audioDeviceModule).setVideoEncoderFactory(videoEncoderFactory).setVideoDecoderFactory(videoDecoderFactory);
        if (options != null) {
            videoDecoderFactory2.setOptions(options);
        }
        PeerConnectionFactory createPeerConnectionFactory = videoDecoderFactory2.createPeerConnectionFactory();
        aVar.a(new a(1, createPeerConnectionFactory));
        AbstractC3557B.b0("builder()\n            .s\u2026rClosable { dispose() } }", createPeerConnectionFactory);
        return createPeerConnectionFactory;
    }
}
