package We;

import Sg.C1394f;
import Ve.E0;
import Ve.r0;
import androidx.lifecycle.C2071f;
import cf.AbstractC2408g;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.AbstractC4273I;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$TrackInfo;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.FrameCryptor;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.VideoTrack;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class C extends w {
    public static final A Companion = new Object();

    /* renamed from: r  reason: collision with root package name */
    public final E0 f20962r;

    /* renamed from: s  reason: collision with root package name */
    public final Ng.B f20963s;

    /* renamed from: t  reason: collision with root package name */
    public final C2071f f20964t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo, E0 e02, Ng.B b10, Ng.B b11) {
        super(r0, r1, b11);
        AbstractC3557B.c0("signalClient", e02);
        AbstractC3557B.c0("ioDispatcher", b10);
        AbstractC3557B.c0("defaultDispatcher", b11);
        String sid = livekitModels$ParticipantInfo.getSid();
        AbstractC3557B.b0("info.sid", sid);
        String identity = livekitModels$ParticipantInfo.getIdentity();
        AbstractC3557B.b0("info.identity", identity);
        this.f20962r = e02;
        this.f20963s = b10;
        this.f20964t = new C2071f(b11.plus(Bi.c.z()), 1);
        super.i(livekitModels$ParticipantInfo);
    }

    @Override // We.w
    public final void i(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        Xe.r rVar;
        super.i(livekitModels$ParticipantInfo);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (LivekitModels$TrackInfo livekitModels$TrackInfo : livekitModels$ParticipantInfo.getTracksList()) {
            String sid = livekitModels$TrackInfo.getSid();
            AbstractC3557B.b0("trackSid", sid);
            Object obj = c().get(sid);
            if (obj instanceof Xe.r) {
                rVar = (Xe.r) obj;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                rVar = new Xe.r(livekitModels$TrackInfo, this, this.f20963s);
                linkedHashMap2.put(sid, rVar);
                a(rVar);
            } else {
                rVar.c(livekitModels$TrackInfo);
            }
            linkedHashMap.put(sid, rVar);
        }
        for (Xe.r rVar2 : linkedHashMap2.values()) {
            if (this.f21073o != null) {
                AbstractC3557B.c0("publication", rVar2);
            }
            this.f21062d.a(new Te.i(this, rVar2), this.f21061c);
        }
        for (String str : AbstractC4273I.t2(c().keySet(), linkedHashMap.keySet())) {
            Xe.B b10 = (Xe.B) c().get(str);
            if (b10 != null) {
                k(b10.f21844c);
            }
        }
    }

    public final void j(MediaStreamTrack mediaStreamTrack, String str, wf.k kVar, RtpReceiver rtpReceiver, boolean z10, int i10) {
        Xe.r rVar;
        Xe.z zVar;
        AbstractC3557B.c0("mediaTrack", mediaStreamTrack);
        AbstractC3557B.c0("sid", str);
        AbstractC3557B.c0("statsGetter", kVar);
        AbstractC3557B.c0("receiver", rtpReceiver);
        Object obj = c().get(str);
        if (obj instanceof Xe.r) {
            rVar = (Xe.r) obj;
        } else {
            rVar = null;
        }
        Te.b bVar = this.f21062d;
        if (rVar == null) {
            if (i10 == 0) {
                Xe.A a5 = new Xe.A("Could not find published track with sid: ".concat(str), 1);
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                    String str2 = this.f21059a;
                    StringBuilder sb2 = new StringBuilder("Sid(value=");
                    sb2.append(str2);
                    sb2.append(')');
                    Mi.a.b(new Object[0]);
                }
                x xVar = this.f21073o;
                if (xVar != null) {
                    r0 r0Var = (r0) xVar;
                    Te.w wVar = new Te.w(r0Var);
                    C1394f c1394f = r0Var.f18872k;
                    if (c1394f != null) {
                        r0Var.f18873l.a(wVar, c1394f);
                    } else {
                        AbstractC3557B.C2("coroutineScope");
                        throw null;
                    }
                }
                bVar.a(new Te.c(this, a5, str), this.f21061c);
                return;
            }
            Ad.l.O0(this.f20964t, null, null, new B(this, mediaStreamTrack, str, kVar, rtpReceiver, z10, i10, null), 3);
            return;
        }
        String kind = mediaStreamTrack.kind();
        if (AbstractC3557B.K(kind, MediaStreamTrack.AUDIO_TRACK_KIND)) {
            zVar = new Xe.o((AudioTrack) mediaStreamTrack, rtpReceiver);
        } else if (AbstractC3557B.K(kind, MediaStreamTrack.VIDEO_TRACK_KIND)) {
            zVar = new Xe.s((VideoTrack) mediaStreamTrack, z10, this.f20963s, rtpReceiver);
        } else {
            throw new Xe.A(R.a.r("invalid track type: ", kind), 2);
        }
        rVar.e(zVar);
        rVar.f21924o = true;
        String str3 = rVar.f21843b;
        AbstractC3557B.c0("<set-?>", str3);
        zVar.f21948c = str3;
        zVar.f21950e = rVar.f21844c;
        a(rVar);
        ef.e.a(new Xe.y(zVar, 1));
        x xVar2 = this.f21073o;
        if (xVar2 != null) {
            r0 r0Var2 = (r0) xVar2;
            Se.c cVar = r0Var2.f18880s;
            if (cVar != null) {
                cVar.b(r0Var2, this, zVar, rVar);
            }
            Te.n nVar = new Te.n(r0Var2, zVar, rVar, this, 0);
            C1394f c1394f2 = r0Var2.f18872k;
            if (c1394f2 != null) {
                r0Var2.f18873l.a(nVar, c1394f2);
            } else {
                AbstractC3557B.C2("coroutineScope");
                throw null;
            }
        }
        bVar.a(new Te.k(this, zVar, rVar, 0), this.f21061c);
    }

    public final void k(String str) {
        Xe.r rVar;
        m mVar;
        m mVar2;
        AbstractC3557B.c0("trackSid", str);
        Object obj = c().get(str);
        if (obj instanceof Xe.r) {
            rVar = (Xe.r) obj;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            return;
        }
        LinkedHashMap m12 = AbstractC4268D.m1(c());
        m12.remove(str);
        h(m12);
        Xe.z a5 = rVar.a();
        Te.b bVar = this.f21062d;
        if (a5 != null) {
            try {
                a5.c();
            } catch (Exception unused) {
            }
            x xVar = this.f21073o;
            if (xVar != null) {
                r0 r0Var = (r0) xVar;
                Se.c cVar = r0Var.f18880s;
                if (cVar != null) {
                    String str2 = rVar.f21844c;
                    String b10 = b();
                    LinkedHashMap linkedHashMap = cVar.f16583d;
                    if (b10 != null) {
                        mVar = new m(b10);
                    } else {
                        mVar = null;
                    }
                    FrameCryptor frameCryptor = (FrameCryptor) linkedHashMap.get(new C3959i(str2, mVar));
                    if (frameCryptor != null) {
                        frameCryptor.setEnabled(false);
                        frameCryptor.dispose();
                        if (b10 != null) {
                            mVar2 = new m(b10);
                        } else {
                            mVar2 = null;
                        }
                        C3959i c3959i = new C3959i(str2, mVar2);
                        Ad.l.I(linkedHashMap);
                        linkedHashMap.remove(c3959i);
                    }
                }
                Te.n nVar = new Te.n(r0Var, a5, rVar, this, 1);
                C1394f c1394f = r0Var.f18872k;
                if (c1394f != null) {
                    r0Var.f18873l.a(nVar, c1394f);
                } else {
                    AbstractC3557B.C2("coroutineScope");
                    throw null;
                }
            }
            bVar.a(new Te.k(this, a5, rVar, 1), this.f21061c);
        }
        x xVar2 = this.f21073o;
        if (xVar2 != null) {
            r0 r0Var2 = (r0) xVar2;
            Te.n nVar2 = new Te.n(r0Var2, rVar, this, 3);
            C1394f c1394f2 = r0Var2.f18872k;
            if (c1394f2 != null) {
                r0Var2.f18873l.a(nVar2, c1394f2);
            } else {
                AbstractC3557B.C2("coroutineScope");
                throw null;
            }
        }
        bVar.a(new Te.d(this, rVar), this.f21061c);
        rVar.e(null);
    }
}
