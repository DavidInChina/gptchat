package Pe;

import Wh.w;
import id.AbstractC3557B;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final w f13961a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoEncoderFactory f13962b;

    /* renamed from: c  reason: collision with root package name */
    public final VideoDecoderFactory f13963c;

    /* renamed from: d  reason: collision with root package name */
    public final a f13964d;

    /* renamed from: e  reason: collision with root package name */
    public final EglBase f13965e;

    /* renamed from: f  reason: collision with root package name */
    public final PeerConnectionFactory.Options f13966f;

    public d(a aVar, int i10) {
        aVar = (i10 & 8) != 0 ? null : aVar;
        this.f13961a = null;
        this.f13962b = null;
        this.f13963c = null;
        this.f13964d = aVar;
        this.f13965e = null;
        this.f13966f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f13961a, dVar.f13961a) && AbstractC3557B.K(this.f13962b, dVar.f13962b) && AbstractC3557B.K(this.f13963c, dVar.f13963c) && AbstractC3557B.K(this.f13964d, dVar.f13964d) && AbstractC3557B.K(this.f13965e, dVar.f13965e) && AbstractC3557B.K(this.f13966f, dVar.f13966f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        w wVar = this.f13961a;
        if (wVar == null) {
            i10 = 0;
        } else {
            i10 = wVar.hashCode();
        }
        int i16 = i10 * 31;
        VideoEncoderFactory videoEncoderFactory = this.f13962b;
        if (videoEncoderFactory == null) {
            i11 = 0;
        } else {
            i11 = videoEncoderFactory.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        VideoDecoderFactory videoDecoderFactory = this.f13963c;
        if (videoDecoderFactory == null) {
            i12 = 0;
        } else {
            i12 = videoDecoderFactory.hashCode();
        }
        int i18 = (i17 + i12) * 31;
        a aVar = this.f13964d;
        if (aVar == null) {
            i13 = 0;
        } else {
            i13 = aVar.hashCode();
        }
        int i19 = (i18 + i13) * 31;
        EglBase eglBase = this.f13965e;
        if (eglBase == null) {
            i14 = 0;
        } else {
            i14 = eglBase.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        PeerConnectionFactory.Options options = this.f13966f;
        if (options != null) {
            i15 = options.hashCode();
        }
        return i20 + i15;
    }

    public final String toString() {
        return "LiveKitOverrides(okHttpClient=" + this.f13961a + ", videoEncoderFactory=" + this.f13962b + ", videoDecoderFactory=" + this.f13963c + ", audioOptions=" + this.f13964d + ", eglBase=" + this.f13965e + ", peerConnectionFactoryOptions=" + this.f13966f + ')';
    }
}
