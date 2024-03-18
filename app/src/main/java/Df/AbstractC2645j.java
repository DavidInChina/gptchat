package df;

import jh.C4022h3;
import livekit.LivekitRtc$SessionDescription;
import livekit.org.webrtc.SessionDescription;

/* renamed from: df.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2645j {
    public static final LivekitRtc$SessionDescription a(SessionDescription sessionDescription) {
        C4022h3 newBuilder = LivekitRtc$SessionDescription.newBuilder();
        String str = sessionDescription.description;
        newBuilder.d();
        ((LivekitRtc$SessionDescription) newBuilder.f27507Z).setSdp(str);
        String canonicalForm = sessionDescription.type.canonicalForm();
        newBuilder.d();
        ((LivekitRtc$SessionDescription) newBuilder.f27507Z).setType(canonicalForm);
        return (LivekitRtc$SessionDescription) newBuilder.b();
    }
}
