package Xe;

import Ve.C1488b;
import android.content.Context;
import cf.AbstractC2408g;
import cf.C2409h;
import id.AbstractC3557B;
import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jh.EnumC4085u2;
import livekit.LivekitRtc$SubscribedQuality;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;
import livekit.org.webrtc.VideoTrack;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public class l extends J {

    /* renamed from: j  reason: collision with root package name */
    public final VideoCapturer f21900j;

    /* renamed from: k  reason: collision with root package name */
    public final EglBase f21901k;

    /* renamed from: l  reason: collision with root package name */
    public final VideoTrack f21902l;

    /* renamed from: m  reason: collision with root package name */
    public String f21903m;

    /* renamed from: o  reason: collision with root package name */
    public final C2409h f21905o;

    /* renamed from: p  reason: collision with root package name */
    public RtpTransceiver f21906p;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f21899r = {kotlin.jvm.internal.C.f37623a.e(new kotlin.jvm.internal.q(l.class, "options", "getOptions()Lio/livekit/android/room/track/LocalVideoTrackOptions;", 0))};
    public static final k Companion = new Object();

    /* renamed from: n  reason: collision with root package name */
    public final LinkedHashMap f21904n = new LinkedHashMap();

    /* renamed from: q  reason: collision with root package name */
    public final Ue.a f21907q = new Ue.a();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(VideoCapturer videoCapturer, VideoSource videoSource, String str, m mVar, VideoTrack videoTrack, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, C1488b c1488b, n nVar) {
        super(str, videoTrack);
        AbstractC3557B.c0("options", mVar);
        AbstractC3557B.c0("peerConnectionFactory", peerConnectionFactory);
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("eglBase", eglBase);
        AbstractC3557B.c0("defaultsManager", c1488b);
        AbstractC3557B.c0("trackFactory", nVar);
        this.f21900j = videoCapturer;
        this.f21901k = eglBase;
        this.f21902l = videoTrack;
        this.f21905o = R4.b.C0(mVar, null);
    }

    public static void h(RtpSender rtpSender, List list) {
        List<RtpParameters.Encoding> list2;
        String str;
        String str2;
        Object obj;
        List<RtpParameters.Encoding> list3;
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters == null || (list2 = parameters.encodings) == null) {
            return;
        }
        RtpParameters.Encoding encoding = (RtpParameters.Encoding) kf.t.h2(list2);
        if (encoding != null) {
            str = encoding.scalabilityMode;
        } else {
            str = null;
        }
        if (str != null) {
            RtpParameters.Encoding encoding2 = (RtpParameters.Encoding) kf.t.f2(list2);
            EnumC4085u2 enumC4085u2 = EnumC4085u2.OFF;
            Iterator it = list.iterator();
            EnumC4085u2 enumC4085u22 = enumC4085u2;
            while (it.hasNext()) {
                LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality = (LivekitRtc$SubscribedQuality) it.next();
                if (livekitRtc$SubscribedQuality.getEnabled() && (enumC4085u22 == enumC4085u2 || livekitRtc$SubscribedQuality.getQuality().a() > enumC4085u22.a())) {
                    enumC4085u22 = livekitRtc$SubscribedQuality.getQuality();
                    AbstractC3557B.b0("quality.quality", enumC4085u22);
                }
            }
            if (enumC4085u22 == enumC4085u2) {
                if (encoding2.active) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                        Mi.a.e(new Object[0]);
                    }
                    encoding2.active = false;
                } else {
                    return;
                }
            } else if (!encoding2.active) {
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                    Mi.a.e(new Object[0]);
                }
                encoding2.active = true;
            } else {
                return;
            }
        } else {
            Iterator it2 = list.iterator();
            boolean z10 = false;
            while (it2.hasNext()) {
                LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality2 = (LivekitRtc$SubscribedQuality) it2.next();
                String[] strArr = af.f.f24188a;
                EnumC4085u2 quality = livekitRtc$SubscribedQuality2.getQuality();
                AbstractC3557B.b0("quality.quality", quality);
                int ordinal = quality.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            str2 = null;
                        } else {
                            str2 = "f";
                        }
                    } else {
                        str2 = "h";
                    }
                } else {
                    str2 = "q";
                }
                if (str2 != null) {
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (AbstractC3557B.K(((RtpParameters.Encoding) obj).rid, str2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    RtpParameters.Encoding encoding3 = (RtpParameters.Encoding) obj;
                    if (encoding3 == null) {
                        if (list2.size() == 1 && livekitRtc$SubscribedQuality2.getQuality() == EnumC4085u2.LOW) {
                            list3 = list2;
                        } else {
                            list3 = null;
                        }
                        if (list3 != null) {
                            encoding3 = (RtpParameters.Encoding) kf.t.f2(list3);
                        } else {
                            encoding3 = null;
                        }
                        if (encoding3 == null) {
                        }
                    }
                    if (encoding3.active != livekitRtc$SubscribedQuality2.getEnabled()) {
                        encoding3.active = livekitRtc$SubscribedQuality2.getEnabled();
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                            Objects.toString(livekitRtc$SubscribedQuality2.getQuality());
                            livekitRtc$SubscribedQuality2.getEnabled();
                            Mi.a.e(new Object[0]);
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10) {
                return;
            }
        }
        rtpSender.setParameters(rtpSender.getParameters());
    }

    @Override // Xe.z
    public final void a() {
        super.a();
        this.f21900j.dispose();
        this.f21907q.close();
    }

    @Override // Xe.J, Xe.z
    public final MediaStreamTrack b() {
        return this.f21902l;
    }

    @Override // Xe.J, Xe.z
    public void c() {
        this.f21900j.stopCapture();
        super.c();
    }

    @Override // Xe.J
    public final VideoTrack d() {
        return this.f21902l;
    }

    public final u e() {
        Ze.h hVar;
        VideoCapturer videoCapturer = this.f21900j;
        if (videoCapturer instanceof Ze.h) {
            hVar = (Ze.h) videoCapturer;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            Size a5 = hVar.a(f().f21911d.f21850a, f().f21911d.f21851b);
            return new u(a5.width, a5.height);
        }
        return new u(f().f21911d.f21850a, f().f21911d.f21851b);
    }

    public final m f() {
        return (m) this.f21905o.d(f21899r[0]);
    }

    public final void g(List list) {
        RtpSender rtpSender;
        RtpTransceiver rtpTransceiver = this.f21906p;
        if (rtpTransceiver != null) {
            rtpSender = rtpTransceiver.getSender();
        } else {
            rtpSender = null;
        }
        if (rtpSender == null) {
            return;
        }
        h(rtpSender, list);
    }
}
