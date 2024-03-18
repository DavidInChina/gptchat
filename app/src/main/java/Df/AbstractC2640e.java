package df;

import cf.AbstractC2408g;
import id.AbstractC3557B;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kf.t;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpCapabilities;
import livekit.org.webrtc.RtpTransceiver;
import z.AbstractC6708l;

/* renamed from: df.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2640e {
    public static final void a(RtpTransceiver rtpTransceiver, String str, wf.k kVar) {
        AbstractC3557B.c0("targetCodec", str);
        AbstractC3557B.c0("capabilitiesGetter", kVar);
        RtpCapabilities rtpCapabilities = (RtpCapabilities) kVar.invoke(MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO);
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
        List<RtpCapabilities.CodecCapability> list = rtpCapabilities.codecs;
        AbstractC3557B.b0("capabilities.codecs", list);
        for (RtpCapabilities.CodecCapability codecCapability : list) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                String str2 = codecCapability.name;
                Objects.toString(codecCapability.kind);
                Objects.toString(codecCapability.parameters);
                Mi.a.e(new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (RtpCapabilities.CodecCapability codecCapability2 : rtpCapabilities.codecs) {
            String str3 = codecCapability2.mimeType;
            AbstractC3557B.b0("codec.mimeType", str3);
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
            if (AbstractC3557B.K(lowerCase, "audio/opus")) {
                arrayList.add(codecCapability2);
            } else if (!AbstractC3557B.K(lowerCase, "video/".concat(str))) {
                arrayList3.add(codecCapability2);
            } else if (AbstractC3557B.K(str, "h264")) {
                if (AbstractC3557B.K(codecCapability2.parameters.get("profile-level-id"), "42e01f")) {
                    arrayList.add(codecCapability2);
                } else {
                    arrayList2.add(codecCapability2);
                }
            } else {
                arrayList.add(codecCapability2);
            }
        }
        rtpTransceiver.setCodecPreferences(t.w2(arrayList3, t.w2(arrayList2, arrayList)));
    }
}
