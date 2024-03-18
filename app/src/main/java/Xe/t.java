package Xe;

import id.AbstractC3557B;
import java.util.List;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpSender;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public String f21931a;

    /* renamed from: b  reason: collision with root package name */
    public MediaStreamTrack f21932b;

    /* renamed from: c  reason: collision with root package name */
    public RtpSender f21933c;

    /* renamed from: d  reason: collision with root package name */
    public List f21934d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3557B.K(this.f21931a, tVar.f21931a) && AbstractC3557B.K(this.f21932b, tVar.f21932b) && AbstractC3557B.K(this.f21933c, tVar.f21933c) && AbstractC3557B.K(this.f21934d, tVar.f21934d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f21932b.hashCode() + (this.f21931a.hashCode() * 31)) * 31;
        RtpSender rtpSender = this.f21933c;
        int i11 = 0;
        if (rtpSender == null) {
            i10 = 0;
        } else {
            i10 = rtpSender.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        List list = this.f21934d;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "SimulcastTrackInfo(codec=" + this.f21931a + ", rtcTrack=" + this.f21932b + ", sender=" + this.f21933c + ", encodings=" + this.f21934d + ')';
    }
}
