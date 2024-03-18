package Ve;

import Ng.AbstractC1073l0;
import Sg.C1394f;
import android.os.SystemClock;
import androidx.lifecycle.C2071f;
import cf.AbstractC2406e;
import cf.AbstractC2408g;
import cf.C2404c;
import cf.C2405d;
import cf.C2409h;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2536r0;
import id.AbstractC3557B;
import java.net.ConnectException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jh.C4027i3;
import jh.EnumC4056o2;
import jh.EnumC4109z1;
import jh.I1;
import jh.N2;
import jh.O1;
import jh.Y2;
import l8.AbstractC4344b;
import livekit.LivekitModels$ClientConfiguration;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$ICEServer;
import livekit.LivekitRtc$JoinResponse;
import livekit.LivekitRtc$MuteTrackRequest;
import livekit.LivekitRtc$ReconnectResponse;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import nf.C4833m;
import of.EnumC5000a;
import q1.AbstractC5260f;
import z.AbstractC6708l;

/* renamed from: Ve.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1503i0 implements v0 {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f18774A = {kotlin.jvm.internal.C.f37623a.e(new kotlin.jvm.internal.q(C1503i0.class, "connectionState", "getConnectionState$livekit_android_sdk_release()Lio/livekit/android/room/ConnectionState;", 0))};
    public static final D Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final E0 f18775a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1492d f18776b;

    /* renamed from: c  reason: collision with root package name */
    public final Ng.B f18777c;

    /* renamed from: d  reason: collision with root package name */
    public F f18778d;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC1073l0 f18780f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18781g;

    /* renamed from: i  reason: collision with root package name */
    public String f18783i;

    /* renamed from: j  reason: collision with root package name */
    public String f18784j;

    /* renamed from: k  reason: collision with root package name */
    public Pe.c f18785k;

    /* renamed from: l  reason: collision with root package name */
    public Pe.e f18786l;

    /* renamed from: m  reason: collision with root package name */
    public String f18787m;

    /* renamed from: n  reason: collision with root package name */
    public final C f18788n;

    /* renamed from: o  reason: collision with root package name */
    public final H0 f18789o;

    /* renamed from: p  reason: collision with root package name */
    public C1519y f18790p;

    /* renamed from: q  reason: collision with root package name */
    public C1519y f18791q;

    /* renamed from: r  reason: collision with root package name */
    public DataChannel f18792r;

    /* renamed from: s  reason: collision with root package name */
    public DataChannel f18793s;

    /* renamed from: t  reason: collision with root package name */
    public DataChannel f18794t;

    /* renamed from: u  reason: collision with root package name */
    public DataChannel f18795u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f18796v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18798x;

    /* renamed from: y  reason: collision with root package name */
    public C2071f f18799y;

    /* renamed from: e  reason: collision with root package name */
    public final C2409h f18779e = R4.b.C0(EnumC1486a.f18720h0, new Jb.c(18, this));

    /* renamed from: z  reason: collision with root package name */
    public final int f18800z = 1;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f18782h = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public boolean f18797w = true;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, Ve.D] */
    static {
        new MediaConstraints().optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
    }

    public C1503i0(E0 e02, AbstractC1492d abstractC1492d, Ng.B b10) {
        AbstractC3557B.c0("client", e02);
        AbstractC3557B.c0("pctFactory", abstractC1492d);
        AbstractC3557B.c0("ioDispatcher", b10);
        this.f18775a = e02;
        this.f18776b = abstractC1492d;
        this.f18777c = b10;
        this.f18788n = new C(this, e02);
        this.f18789o = new H0(this, e02);
        this.f18799y = new C2071f(AbstractC4344b.Q0(Bi.c.z(), b10), 1);
        e02.f18640n0 = this;
    }

    public static PeerConnection.RTCConfiguration h(AbstractC2406e abstractC2406e, Pe.c cVar) {
        List<LivekitRtc$ICEServer> list;
        kf.v vVar;
        PeerConnection.RTCConfiguration rTCConfiguration;
        ArrayList arrayList = new ArrayList();
        boolean z10 = abstractC2406e instanceof C2404c;
        if (z10) {
            list = ((LivekitRtc$JoinResponse) ((C2404c) abstractC2406e).f26611a).getIceServersList();
        } else if (abstractC2406e instanceof C2405d) {
            list = ((LivekitRtc$ReconnectResponse) ((C2405d) abstractC2406e).f26612a).getIceServersList();
        } else {
            throw new RuntimeException();
        }
        Iterator<LivekitRtc$ICEServer> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vVar = kf.v.f37483Y;
            if (!hasNext) {
                break;
            }
            LivekitRtc$ICEServer next = it.next();
            AbstractC3557B.b0("serverInfo", next);
            PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(next.getUrlsList());
            String username = next.getUsername();
            String str = "";
            if (username == null) {
                username = str;
            }
            PeerConnection.IceServer.Builder username2 = builder.setUsername(username);
            String credential = next.getCredential();
            if (credential != null) {
                str = credential;
            }
            PeerConnection.IceServer createIceServer = username2.setPassword(str).setTlsAlpnProtocols(vVar).setTlsEllipticCurves(vVar).createIceServer();
            AbstractC3557B.b0("serverInfo.toWebrtc()", createIceServer);
            arrayList.add(createIceServer);
        }
        if (arrayList.isEmpty()) {
            E0.Companion.getClass();
            arrayList.addAll(E0.f18626G0);
        }
        PeerConnection.RTCConfiguration rTCConfiguration2 = cVar.f13955c;
        if (rTCConfiguration2 != null) {
            rTCConfiguration = new PeerConnection.RTCConfiguration(vVar);
            rTCConfiguration.iceTransportsType = rTCConfiguration2.iceTransportsType;
            List<PeerConnection.IceServer> list2 = rTCConfiguration2.iceServers;
            rTCConfiguration.iceServers = list2;
            rTCConfiguration.bundlePolicy = rTCConfiguration2.bundlePolicy;
            rTCConfiguration.certificate = rTCConfiguration2.certificate;
            rTCConfiguration.rtcpMuxPolicy = rTCConfiguration2.rtcpMuxPolicy;
            rTCConfiguration.tcpCandidatePolicy = rTCConfiguration2.tcpCandidatePolicy;
            rTCConfiguration.candidateNetworkPolicy = rTCConfiguration2.candidateNetworkPolicy;
            rTCConfiguration.audioJitterBufferMaxPackets = rTCConfiguration2.audioJitterBufferMaxPackets;
            rTCConfiguration.audioJitterBufferFastAccelerate = rTCConfiguration2.audioJitterBufferFastAccelerate;
            rTCConfiguration.iceConnectionReceivingTimeout = rTCConfiguration2.iceConnectionReceivingTimeout;
            rTCConfiguration.iceBackupCandidatePairPingInterval = rTCConfiguration2.iceBackupCandidatePairPingInterval;
            rTCConfiguration.keyType = rTCConfiguration2.keyType;
            rTCConfiguration.continualGatheringPolicy = rTCConfiguration2.continualGatheringPolicy;
            rTCConfiguration.iceCandidatePoolSize = rTCConfiguration2.iceCandidatePoolSize;
            rTCConfiguration.pruneTurnPorts = rTCConfiguration2.pruneTurnPorts;
            rTCConfiguration.turnPortPrunePolicy = rTCConfiguration2.turnPortPrunePolicy;
            rTCConfiguration.presumeWritableWhenFullyRelayed = rTCConfiguration2.presumeWritableWhenFullyRelayed;
            rTCConfiguration.surfaceIceCandidatesOnIceTransportTypeChanged = rTCConfiguration2.surfaceIceCandidatesOnIceTransportTypeChanged;
            rTCConfiguration.iceCheckIntervalStrongConnectivityMs = rTCConfiguration2.iceCheckIntervalStrongConnectivityMs;
            rTCConfiguration.iceCheckIntervalWeakConnectivityMs = rTCConfiguration2.iceCheckIntervalWeakConnectivityMs;
            rTCConfiguration.iceCheckMinInterval = rTCConfiguration2.iceCheckMinInterval;
            rTCConfiguration.iceUnwritableTimeMs = rTCConfiguration2.iceUnwritableTimeMs;
            rTCConfiguration.iceUnwritableMinChecks = rTCConfiguration2.iceUnwritableMinChecks;
            rTCConfiguration.stunCandidateKeepaliveIntervalMs = rTCConfiguration2.stunCandidateKeepaliveIntervalMs;
            rTCConfiguration.stableWritableConnectionPingIntervalMs = rTCConfiguration2.stableWritableConnectionPingIntervalMs;
            rTCConfiguration.disableIPv6OnWifi = rTCConfiguration2.disableIPv6OnWifi;
            rTCConfiguration.maxIPv6Networks = rTCConfiguration2.maxIPv6Networks;
            rTCConfiguration.enableDscp = rTCConfiguration2.enableDscp;
            rTCConfiguration.enableCpuOveruseDetection = rTCConfiguration2.enableCpuOveruseDetection;
            rTCConfiguration.suspendBelowMinBitrate = rTCConfiguration2.suspendBelowMinBitrate;
            rTCConfiguration.screencastMinBitrate = rTCConfiguration2.screencastMinBitrate;
            rTCConfiguration.combinedAudioVideoBwe = rTCConfiguration2.combinedAudioVideoBwe;
            rTCConfiguration.networkPreference = rTCConfiguration2.networkPreference;
            rTCConfiguration.sdpSemantics = rTCConfiguration2.sdpSemantics;
            rTCConfiguration.turnCustomizer = rTCConfiguration2.turnCustomizer;
            rTCConfiguration.activeResetSrtpParams = rTCConfiguration2.activeResetSrtpParams;
            rTCConfiguration.allowCodecSwitching = rTCConfiguration2.allowCodecSwitching;
            rTCConfiguration.cryptoOptions = rTCConfiguration2.cryptoOptions;
            rTCConfiguration.turnLoggingId = rTCConfiguration2.turnLoggingId;
            rTCConfiguration.enableImplicitRollback = rTCConfiguration2.enableImplicitRollback;
            rTCConfiguration.offerExtmapAllowMixed = rTCConfiguration2.offerExtmapAllowMixed;
            AbstractC3557B.b0("iceServers", list2);
            ArrayList M22 = kf.t.M2(list2);
            List<PeerConnection.IceServer> list3 = cVar.f13954b;
            if (list3 != null) {
                for (PeerConnection.IceServer iceServer : list3) {
                    if (!M22.contains(iceServer)) {
                        M22.add(iceServer);
                    }
                }
            }
            if (M22.isEmpty()) {
                List<PeerConnection.IceServer> list4 = rTCConfiguration.iceServers;
                AbstractC3557B.b0("iceServers", list4);
                for (PeerConnection.IceServer iceServer2 : list4) {
                    if (!M22.contains(iceServer2)) {
                        M22.add(iceServer2);
                    }
                }
            }
            rTCConfiguration.iceServers = M22;
        } else {
            PeerConnection.RTCConfiguration rTCConfiguration3 = new PeerConnection.RTCConfiguration(arrayList);
            rTCConfiguration3.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
            rTCConfiguration3.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
            rTCConfiguration = rTCConfiguration3;
        }
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration = null;
        if (z10) {
            Object obj = ((C2404c) abstractC2406e).f26611a;
            if (((LivekitRtc$JoinResponse) obj).hasClientConfiguration()) {
                livekitModels$ClientConfiguration = ((LivekitRtc$JoinResponse) obj).getClientConfiguration();
            }
        } else if (abstractC2406e instanceof C2405d) {
            Object obj2 = ((C2405d) abstractC2406e).f26612a;
            if (((LivekitRtc$ReconnectResponse) obj2).hasClientConfiguration()) {
                livekitModels$ClientConfiguration = ((LivekitRtc$ReconnectResponse) obj2).getClientConfiguration();
            }
        } else {
            throw new RuntimeException();
        }
        if (livekitModels$ClientConfiguration != null && livekitModels$ClientConfiguration.getForceRelay() == EnumC4109z1.ENABLED) {
            rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.RELAY;
        }
        return rTCConfiguration;
    }

    public final Object a(String str, String str2, EnumC4056o2 enumC4056o2, String str3, N2 n22, AbstractC4825e abstractC4825e) {
        O1 o12;
        U3.l lVar;
        LinkedHashMap linkedHashMap = this.f18782h;
        if (linkedHashMap.get(str) == null) {
            C4833m c4833m = new C4833m(AbstractC5260f.z(abstractC4825e));
            linkedHashMap.put(str, c4833m);
            E0 e02 = this.f18775a;
            e02.getClass();
            AbstractC3557B.c0("name", str2);
            Pe.e eVar = e02.f18644r0;
            if (eVar == null || (lVar = eVar.f13969c) == null || (o12 = (O1) lVar.f17424h0) == null) {
                o12 = O1.NONE;
            }
            n22.d();
            LivekitRtc$AddTrackRequest.access$11800((LivekitRtc$AddTrackRequest) n22.f27507Z, str);
            n22.d();
            LivekitRtc$AddTrackRequest.access$12100((LivekitRtc$AddTrackRequest) n22.f27507Z, str2);
            n22.d();
            LivekitRtc$AddTrackRequest.access$12500((LivekitRtc$AddTrackRequest) n22.f27507Z, enumC4056o2);
            if (str3 != null) {
                n22.d();
                LivekitRtc$AddTrackRequest.access$16000((LivekitRtc$AddTrackRequest) n22.f27507Z, str3);
            } else {
                n22.d();
                LivekitRtc$AddTrackRequest.access$16100((LivekitRtc$AddTrackRequest) n22.f27507Z);
            }
            n22.d();
            LivekitRtc$AddTrackRequest.access$15800((LivekitRtc$AddTrackRequest) n22.f27507Z, o12);
            C4027i3 newBuilder = LivekitRtc$SignalRequest.newBuilder();
            newBuilder.d();
            LivekitRtc$SignalRequest.access$1100((LivekitRtc$SignalRequest) newBuilder.f27507Z, (LivekitRtc$AddTrackRequest) n22.b());
            e02.s((LivekitRtc$SignalRequest) newBuilder.b());
            Object b10 = c4833m.b();
            if (b10 == EnumC5000a.f41328Y) {
                com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
            }
            return b10;
        }
        throw new Xe.A(android.gov.nist.core.a.A("Track with same ID ", str, " has already been published!"), 0);
    }

    public final void b(String str) {
        AbstractC3557B.c0("reason", str);
        if (this.f18797w) {
            return;
        }
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            "Close - ".concat(str);
            Mi.a.e(new Object[0]);
        }
        this.f18797w = true;
        AbstractC1073l0 abstractC1073l0 = this.f18780f;
        if (abstractC1073l0 != null) {
            abstractC1073l0.k(null);
        }
        this.f18780f = null;
        this.f18799y.close();
        this.f18798x = false;
        this.f18783i = null;
        this.f18784j = null;
        this.f18785k = null;
        this.f18786l = null;
        this.f18787m = null;
        ef.e.a(new zc.u(14, this));
        E0.g(this.f18775a, str);
        m(EnumC1486a.f18720h0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LivekitRtc$JoinResponse livekitRtc$JoinResponse, Pe.c cVar, AbstractC4825e abstractC4825e) {
        H h10;
        int i10;
        C1503i0 c1503i0;
        C1503i0 c1503i02;
        DataChannel dataChannel;
        C1503i0 c1503i03;
        C1519y c1519y;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse2;
        PeerConnection.RTCConfiguration rTCConfiguration;
        C1503i0 c1503i04;
        boolean subscriberPrimary;
        C1519y c1519y2;
        PeerConnection.RTCConfiguration rTCConfiguration2;
        C1519y c1519y3;
        String str;
        if (abstractC4825e instanceof H) {
            h10 = (H) abstractC4825e;
            int i11 = h10.f18662k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h10.f18662k0 = i11 - Integer.MIN_VALUE;
                Object obj = h10.f18660i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = h10.f18662k0;
                jf.y yVar = jf.y.f36177a;
                DataChannel dataChannel2 = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    c1503i02 = h10.f18657Y;
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    dataChannel2 = (DataChannel) obj;
                                    c1503i0 = c1503i02;
                                    c1503i0.f18794t = dataChannel2;
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1503i03 = (C1503i0) h10.f18658Z;
                            c1503i0 = h10.f18657Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            dataChannel = (DataChannel) obj;
                            c1503i03.f18792r = dataChannel;
                            DataChannel.Init init = new DataChannel.Init();
                            init.ordered = true;
                            init.maxRetransmits = 0;
                            c1519y = c1503i0.f18790p;
                            if (c1519y != null) {
                                L l10 = new L(init, c1503i0, null);
                                h10.f18657Y = c1503i0;
                                h10.f18658Z = null;
                                h10.f18659h0 = null;
                                h10.f18662k0 = 4;
                                obj = c1519y.h(l10, h10);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                c1503i02 = c1503i0;
                                dataChannel2 = (DataChannel) obj;
                                c1503i0 = c1503i02;
                            }
                            c1503i0.f18794t = dataChannel2;
                            return yVar;
                        }
                        rTCConfiguration = h10.f18659h0;
                        livekitRtc$JoinResponse2 = (LivekitRtc$JoinResponse) h10.f18658Z;
                        c1503i04 = h10.f18657Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        LivekitRtc$JoinResponse livekitRtc$JoinResponse3 = livekitRtc$JoinResponse2;
                        PeerConnection.RTCConfiguration rTCConfiguration3 = rTCConfiguration;
                        c1503i03 = c1503i04;
                        H0 h02 = c1503i03.f18789o;
                        c1503i03.f18791q = ((A) c1503i03.f18776b).a(rTCConfiguration3, h02, null);
                        M m10 = new M(c1503i03);
                        subscriberPrimary = livekitRtc$JoinResponse3.getSubscriberPrimary();
                        C c10 = c1503i03.f18788n;
                        if (subscriberPrimary) {
                            h02.f18665c = new I(c1503i03);
                            h02.f18666d = m10;
                            c10.f18617c = new J(c1503i03);
                        } else {
                            c10.f18617c = m10;
                        }
                        DataChannel.Init init2 = new DataChannel.Init();
                        init2.ordered = true;
                        c1519y2 = c1503i03.f18790p;
                        if (c1519y2 != null) {
                            K k10 = new K(init2, c1503i03, null);
                            h10.f18657Y = c1503i03;
                            h10.f18658Z = c1503i03;
                            h10.f18659h0 = null;
                            h10.f18662k0 = 3;
                            obj = c1519y2.h(k10, h10);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            c1503i0 = c1503i03;
                            dataChannel = (DataChannel) obj;
                            c1503i03.f18792r = dataChannel;
                            DataChannel.Init init3 = new DataChannel.Init();
                            init3.ordered = true;
                            init3.maxRetransmits = 0;
                            c1519y = c1503i0.f18790p;
                            if (c1519y != null) {
                            }
                            c1503i0.f18794t = dataChannel2;
                            return yVar;
                        }
                        c1503i0 = c1503i03;
                        dataChannel = null;
                        c1503i03.f18792r = dataChannel;
                        DataChannel.Init init32 = new DataChannel.Init();
                        init32.ordered = true;
                        init32.maxRetransmits = 0;
                        c1519y = c1503i0.f18790p;
                        if (c1519y != null) {
                        }
                        c1503i0.f18794t = dataChannel2;
                        return yVar;
                    }
                    PeerConnection.RTCConfiguration rTCConfiguration4 = h10.f18659h0;
                    LivekitRtc$JoinResponse livekitRtc$JoinResponse4 = (LivekitRtc$JoinResponse) h10.f18658Z;
                    c1503i04 = h10.f18657Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    rTCConfiguration2 = rTCConfiguration4;
                    livekitRtc$JoinResponse = livekitRtc$JoinResponse4;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (this.f18790p != null && this.f18791q != null) {
                        return yVar;
                    }
                    if (livekitRtc$JoinResponse.hasParticipant()) {
                        str = livekitRtc$JoinResponse.getParticipant().getSid();
                    } else {
                        str = null;
                    }
                    this.f18787m = str;
                    rTCConfiguration2 = h(new C2404c(livekitRtc$JoinResponse), cVar);
                    C1519y c1519y4 = this.f18790p;
                    if (c1519y4 != null) {
                        h10.f18657Y = this;
                        h10.f18658Z = livekitRtc$JoinResponse;
                        h10.f18659h0 = rTCConfiguration2;
                        h10.f18662k0 = 1;
                        if (c1519y4.a(h10) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    c1503i04 = this;
                }
                PeerConnection.RTCConfiguration rTCConfiguration5 = rTCConfiguration2;
                livekitRtc$JoinResponse2 = livekitRtc$JoinResponse;
                rTCConfiguration = rTCConfiguration5;
                AbstractC1492d abstractC1492d = c1503i04.f18776b;
                C c11 = c1503i04.f18788n;
                c1503i04.f18790p = ((A) abstractC1492d).a(rTCConfiguration, c11, c11);
                c1519y3 = c1503i04.f18791q;
                if (c1519y3 != null) {
                    h10.f18657Y = c1503i04;
                    h10.f18658Z = livekitRtc$JoinResponse2;
                    h10.f18659h0 = rTCConfiguration;
                    h10.f18662k0 = 2;
                    if (c1519y3.a(h10) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                LivekitRtc$JoinResponse livekitRtc$JoinResponse32 = livekitRtc$JoinResponse2;
                PeerConnection.RTCConfiguration rTCConfiguration32 = rTCConfiguration;
                c1503i03 = c1503i04;
                H0 h022 = c1503i03.f18789o;
                c1503i03.f18791q = ((A) c1503i03.f18776b).a(rTCConfiguration32, h022, null);
                M m102 = new M(c1503i03);
                subscriberPrimary = livekitRtc$JoinResponse32.getSubscriberPrimary();
                C c102 = c1503i03.f18788n;
                if (subscriberPrimary) {
                }
                DataChannel.Init init22 = new DataChannel.Init();
                init22.ordered = true;
                c1519y2 = c1503i03.f18790p;
                if (c1519y2 != null) {
                }
            }
        }
        h10 = new H(this, abstractC4825e);
        Object obj2 = h10.f18660i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = h10.f18662k0;
        jf.y yVar2 = jf.y.f36177a;
        DataChannel dataChannel22 = null;
        if (i10 == 0) {
        }
        PeerConnection.RTCConfiguration rTCConfiguration52 = rTCConfiguration2;
        livekitRtc$JoinResponse2 = livekitRtc$JoinResponse;
        rTCConfiguration = rTCConfiguration52;
        AbstractC1492d abstractC1492d2 = c1503i04.f18776b;
        C c112 = c1503i04.f18788n;
        c1503i04.f18790p = ((A) abstractC1492d2).a(rTCConfiguration, c112, c112);
        c1519y3 = c1503i04.f18791q;
        if (c1519y3 != null) {
        }
        LivekitRtc$JoinResponse livekitRtc$JoinResponse322 = livekitRtc$JoinResponse2;
        PeerConnection.RTCConfiguration rTCConfiguration322 = rTCConfiguration;
        c1503i03 = c1503i04;
        H0 h0222 = c1503i03.f18789o;
        c1503i03.f18791q = ((A) c1503i03.f18776b).a(rTCConfiguration322, h0222, null);
        M m1022 = new M(c1503i03);
        subscriberPrimary = livekitRtc$JoinResponse322.getSubscriberPrimary();
        C c1022 = c1503i03.f18788n;
        if (subscriberPrimary) {
        }
        DataChannel.Init init222 = new DataChannel.Init();
        init222.ordered = true;
        c1519y2 = c1503i03.f18790p;
        if (c1519y2 != null) {
        }
    }

    public final DataChannel d(I1 i12) {
        int ordinal = i12.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return null;
            }
            return this.f18794t;
        }
        return this.f18792r;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0108 -> B:47:0x00c5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(I1 i12, AbstractC4825e abstractC4825e) {
        T t10;
        Object obj;
        int i10;
        long j6;
        C1503i0 c1503i0;
        DataChannel dataChannel;
        boolean z10;
        C1503i0 c1503i02;
        I1 i13;
        DataChannel d10;
        C1503i0 c1503i03;
        if (abstractC4825e instanceof T) {
            t10 = (T) abstractC4825e;
            int i11 = t10.f18701k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t10.f18701k0 = i11 - Integer.MIN_VALUE;
                obj = t10.f18699i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = t10.f18701k0;
                jf.y yVar = jf.y.f36177a;
                PeerConnection.IceConnectionState iceConnectionState = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    j6 = t10.f18698h0;
                                    dataChannel = (DataChannel) t10.f18697Z;
                                    c1503i0 = t10.f18696Y;
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    if (SystemClock.elapsedRealtime() < j6) {
                                        C1519y c1519y = c1503i0.f18790p;
                                        if (c1519y != null) {
                                            t10.f18696Y = c1503i0;
                                            t10.f18697Z = dataChannel;
                                            t10.f18698h0 = j6;
                                            t10.f18701k0 = 3;
                                            obj = c1519y.d(t10);
                                            if (obj == enumC5000a) {
                                                return enumC5000a;
                                            }
                                            if (((Boolean) obj).booleanValue()) {
                                                z10 = true;
                                                if (!z10 && dataChannel.state() == DataChannel.State.OPEN) {
                                                    return yVar;
                                                }
                                                t10.f18696Y = c1503i0;
                                                t10.f18697Z = dataChannel;
                                                t10.f18698h0 = j6;
                                                t10.f18701k0 = 4;
                                                if (R4.b.p0(50L, t10) == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                if (SystemClock.elapsedRealtime() < j6) {
                                                }
                                            }
                                            z10 = false;
                                            if (!z10) {
                                            }
                                            t10.f18696Y = c1503i0;
                                            t10.f18697Z = dataChannel;
                                            t10.f18698h0 = j6;
                                            t10.f18701k0 = 4;
                                            if (R4.b.p0(50L, t10) == enumC5000a) {
                                            }
                                            if (SystemClock.elapsedRealtime() < j6) {
                                            }
                                        } else {
                                            z10 = false;
                                            if (!z10) {
                                            }
                                            t10.f18696Y = c1503i0;
                                            t10.f18697Z = dataChannel;
                                            t10.f18698h0 = j6;
                                            t10.f18701k0 = 4;
                                            if (R4.b.p0(50L, t10) == enumC5000a) {
                                            }
                                            if (SystemClock.elapsedRealtime() < j6) {
                                            }
                                        }
                                    } else {
                                        throw new ConnectException("could not establish publisher connection");
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                j6 = t10.f18698h0;
                                dataChannel = (DataChannel) t10.f18697Z;
                                c1503i0 = t10.f18696Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                if (((Boolean) obj).booleanValue()) {
                                }
                                z10 = false;
                                if (!z10) {
                                }
                                t10.f18696Y = c1503i0;
                                t10.f18697Z = dataChannel;
                                t10.f18698h0 = j6;
                                t10.f18701k0 = 4;
                                if (R4.b.p0(50L, t10) == enumC5000a) {
                                }
                                if (SystemClock.elapsedRealtime() < j6) {
                                }
                            }
                        } else {
                            i13 = (I1) t10.f18697Z;
                            c1503i03 = t10.f18696Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            c1503i02 = c1503i03;
                            iceConnectionState = (PeerConnection.IceConnectionState) obj;
                            if (iceConnectionState != PeerConnection.IceConnectionState.CHECKING) {
                                c1503i02.i();
                            }
                            d10 = c1503i02.d(i13);
                            if (d10 != null) {
                                if (d10.state() == DataChannel.State.OPEN) {
                                    return yVar;
                                }
                                dataChannel = d10;
                                c1503i0 = c1503i02;
                                j6 = SystemClock.elapsedRealtime() + 20000;
                                if (SystemClock.elapsedRealtime() < j6) {
                                }
                            } else {
                                throw new IllegalArgumentException("Unknown data packet kind!");
                            }
                        }
                    } else {
                        i13 = (I1) t10.f18697Z;
                        c1503i02 = t10.f18696Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!this.f18796v) {
                        return yVar;
                    }
                    C1519y c1519y2 = this.f18790p;
                    if (c1519y2 != null) {
                        t10.f18696Y = this;
                        i13 = i12;
                        t10.f18697Z = i13;
                        t10.f18701k0 = 1;
                        obj = c1519y2.d(t10);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c1503i02 = this;
                    } else {
                        throw new Exception("Publisher isn't setup yet! Is room not connected?!", null);
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    C1519y c1519y3 = c1503i02.f18790p;
                    if (c1519y3 != null) {
                        t10.f18696Y = c1503i02;
                        t10.f18697Z = i13;
                        t10.f18701k0 = 2;
                        obj = c1519y3.c(t10);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c1503i03 = c1503i02;
                        c1503i02 = c1503i03;
                        iceConnectionState = (PeerConnection.IceConnectionState) obj;
                    }
                    if (iceConnectionState != PeerConnection.IceConnectionState.CHECKING) {
                    }
                }
                d10 = c1503i02.d(i13);
                if (d10 != null) {
                }
            }
        }
        t10 = new T(this, abstractC4825e);
        obj = t10.f18699i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = t10.f18701k0;
        jf.y yVar2 = jf.y.f36177a;
        PeerConnection.IceConnectionState iceConnectionState2 = null;
        if (i10 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        d10 = c1503i02.d(i13);
        if (d10 != null) {
        }
    }

    public final EnumC1486a f() {
        return (EnumC1486a) this.f18779e.d(f18774A[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, Pe.c cVar, Pe.e eVar, AbstractC4825e abstractC4825e) {
        U u10;
        EnumC5000a enumC5000a;
        int i10;
        C1503i0 c1503i0;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse;
        F f6;
        byte[] bArr;
        if (abstractC4825e instanceof U) {
            u10 = (U) abstractC4825e;
            int i11 = u10.f18706j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u10.f18706j0 = i11 - Integer.MIN_VALUE;
                Object obj = u10.f18704h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = u10.f18706j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            livekitRtc$JoinResponse = (LivekitRtc$JoinResponse) u10.f18703Z;
                            c1503i0 = u10.f18702Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            if (!c1503i0.f18796v) {
                                c1503i0.i();
                            }
                            c1503i0.f18775a.o();
                            return livekitRtc$JoinResponse;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (Pe.c) u10.f18703Z;
                    C1503i0 c1503i02 = u10.f18702Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c1503i0 = c1503i02;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    u10.f18702Y = this;
                    u10.f18703Z = cVar;
                    u10.f18706j0 = 1;
                    obj = this.f18775a.n(str, str2, cVar, eVar, u10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c1503i0 = this;
                }
                livekitRtc$JoinResponse = (LivekitRtc$JoinResponse) obj;
                f6 = c1503i0.f18778d;
                if (f6 != null) {
                    r0 r0Var = (r0) f6;
                    AbstractC3557B.c0("response", livekitRtc$JoinResponse);
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                        livekitRtc$JoinResponse.getServerVersion();
                        Mi.a.c(new Object[0]);
                    }
                    if (livekitRtc$JoinResponse.getRoom().getSid() != null) {
                        String sid = livekitRtc$JoinResponse.getRoom().getSid();
                        AbstractC3557B.b0("response.room.sid", sid);
                        r0Var.n(sid);
                    } else {
                        r0Var.n(null);
                    }
                    String name = livekitRtc$JoinResponse.getRoom().getName();
                    Df.v[] vVarArr = r0.f18859C;
                    r0Var.f18876o.h(name, vVarArr[1]);
                    r0Var.f18878q.h(livekitRtc$JoinResponse.getRoom().getMetadata(), vVarArr[3]);
                    if (r0Var.f18880s != null && livekitRtc$JoinResponse.getSifTrailer().size() != 0) {
                        Se.c cVar2 = r0Var.f18880s;
                        AbstractC3557B.Z(cVar2);
                        AbstractC2534q sifTrailer = livekitRtc$JoinResponse.getSifTrailer();
                        int size = sifTrailer.size();
                        if (size == 0) {
                            bArr = AbstractC2536r0.f27585b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            sifTrailer.I(size, bArr2);
                            bArr = bArr2;
                        }
                        AbstractC3557B.b0("response.sifTrailer.toByteArray()", bArr);
                        Se.a aVar = cVar2.f16581b;
                        aVar.getClass();
                        aVar.f16578a.setSifTrailer(bArr);
                    }
                    if (livekitRtc$JoinResponse.getRoom().getActiveRecording() != r0Var.j()) {
                        boolean activeRecording = livekitRtc$JoinResponse.getRoom().getActiveRecording();
                        Df.v vVar = vVarArr[4];
                        r0Var.f18879r.h(Boolean.valueOf(activeRecording), vVar);
                        r0Var.j();
                        Te.w wVar = new Te.w(r0Var);
                        C1394f c1394f = r0Var.f18872k;
                        if (c1394f != null) {
                            r0Var.f18873l.a(wVar, c1394f);
                        } else {
                            AbstractC3557B.C2("coroutineScope");
                            throw null;
                        }
                    }
                    if (livekitRtc$JoinResponse.hasParticipant()) {
                        LivekitModels$ParticipantInfo participant = livekitRtc$JoinResponse.getParticipant();
                        AbstractC3557B.b0("response.participant", participant);
                        r0Var.f18883v.i(participant);
                        List<LivekitModels$ParticipantInfo> otherParticipantsList = livekitRtc$JoinResponse.getOtherParticipantsList();
                        AbstractC3557B.b0("response.otherParticipantsList", otherParticipantsList);
                        if (!otherParticipantsList.isEmpty()) {
                            List<LivekitModels$ParticipantInfo> otherParticipantsList2 = livekitRtc$JoinResponse.getOtherParticipantsList();
                            AbstractC3557B.b0("response.otherParticipantsList", otherParticipantsList2);
                            for (LivekitModels$ParticipantInfo livekitModels$ParticipantInfo : otherParticipantsList2) {
                                String identity = livekitModels$ParticipantInfo.getIdentity();
                                AbstractC3557B.b0("info.identity", identity);
                                r0Var.e(livekitModels$ParticipantInfo, identity);
                            }
                        }
                    } else {
                        throw new Exception("server didn't return a local participant", null);
                    }
                }
                c1503i0.f18797w = false;
                c1503i0.f18796v = livekitRtc$JoinResponse.getSubscriberPrimary();
                u10.f18702Y = c1503i0;
                u10.f18703Z = livekitRtc$JoinResponse;
                u10.f18706j0 = 2;
                if (c1503i0.c(livekitRtc$JoinResponse, cVar, u10) == enumC5000a) {
                    return enumC5000a;
                }
                if (!c1503i0.f18796v) {
                }
                c1503i0.f18775a.o();
                return livekitRtc$JoinResponse;
            }
        }
        u10 = new U(this, abstractC4825e);
        Object obj2 = u10.f18704h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = u10.f18706j0;
        if (i10 == 0) {
        }
        livekitRtc$JoinResponse = (LivekitRtc$JoinResponse) obj2;
        f6 = c1503i0.f18778d;
        if (f6 != null) {
        }
        c1503i0.f18797w = false;
        c1503i0.f18796v = livekitRtc$JoinResponse.getSubscriberPrimary();
        u10.f18702Y = c1503i0;
        u10.f18703Z = livekitRtc$JoinResponse;
        u10.f18706j0 = 2;
        if (c1503i0.c(livekitRtc$JoinResponse, cVar, u10) == enumC5000a) {
        }
        if (!c1503i0.f18796v) {
        }
        c1503i0.f18775a.o();
        return livekitRtc$JoinResponse;
    }

    public final void i() {
        if (!this.f18775a.f18637k0) {
            return;
        }
        this.f18798x = true;
        Ad.l.O0(this.f18799y, null, null, new V(this, null), 3);
    }

    public final void j(Throwable th2) {
        F f6;
        if (f() == EnumC1486a.f18718Y && (f6 = this.f18778d) != null) {
            r0 r0Var = (r0) f6;
            r0Var.f18873l.f17184a.g(new Te.w(r0Var));
        }
    }

    public final synchronized void k() {
        AbstractC1073l0 abstractC1073l0 = this.f18780f;
        if (abstractC1073l0 != null && abstractC1073l0.a()) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.a(new Object[0]);
            }
        } else if (this.f18797w) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.a(new Object[0]);
            }
        } else {
            String str = this.f18783i;
            String str2 = this.f18784j;
            if (str != null && str2 != null) {
                boolean z10 = this.f18781g;
                this.f18781g = false;
                Ng.D0 O02 = Ad.l.O0(this.f18799y, null, null, new C1491c0(this, z10, str, str2, null), 3);
                this.f18780f = O02;
                O02.V(new Oc.c(this, 17, O02));
                return;
            }
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.f(new Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(LivekitModels$DataPacket livekitModels$DataPacket, AbstractC4825e abstractC4825e) {
        C1497f0 c1497f0;
        int i10;
        C1503i0 c1503i0;
        DataChannel d10;
        if (abstractC4825e instanceof C1497f0) {
            c1497f0 = (C1497f0) abstractC4825e;
            int i11 = c1497f0.f18758j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1497f0.f18758j0 = i11 - Integer.MIN_VALUE;
                Object obj = c1497f0.f18756h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1497f0.f18758j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        livekitModels$DataPacket = c1497f0.f18755Z;
                        c1503i0 = c1497f0.f18754Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    I1 kind = livekitModels$DataPacket.getKind();
                    AbstractC3557B.b0("dataPacket.kind", kind);
                    c1497f0.f18754Y = this;
                    c1497f0.f18755Z = livekitModels$DataPacket;
                    c1497f0.f18758j0 = 1;
                    if (e(kind, c1497f0) == enumC5000a) {
                        return enumC5000a;
                    }
                    c1503i0 = this;
                }
                DataChannel.Buffer buffer = new DataChannel.Buffer(ByteBuffer.wrap(livekitModels$DataPacket.toByteArray()), true);
                I1 kind2 = livekitModels$DataPacket.getKind();
                AbstractC3557B.b0("dataPacket.kind", kind2);
                d10 = c1503i0.d(kind2);
                if (d10 == null) {
                    d10.send(buffer);
                    return jf.y.f36177a;
                }
                throw new Xe.A("channel not established for " + livekitModels$DataPacket.getKind().name(), 3);
            }
        }
        c1497f0 = new C1497f0(this, abstractC4825e);
        Object obj2 = c1497f0.f18756h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1497f0.f18758j0;
        if (i10 == 0) {
        }
        DataChannel.Buffer buffer2 = new DataChannel.Buffer(ByteBuffer.wrap(livekitModels$DataPacket.toByteArray()), true);
        I1 kind22 = livekitModels$DataPacket.getKind();
        AbstractC3557B.b0("dataPacket.kind", kind22);
        d10 = c1503i0.d(kind22);
        if (d10 == null) {
        }
    }

    public final void m(EnumC1486a enumC1486a) {
        this.f18779e.h(enumC1486a, f18774A[0]);
    }

    public final void n(String str, boolean z10) {
        AbstractC3557B.c0("sid", str);
        E0 e02 = this.f18775a;
        e02.getClass();
        Y2 newBuilder = LivekitRtc$MuteTrackRequest.newBuilder();
        newBuilder.d();
        LivekitRtc$MuteTrackRequest.access$17300((LivekitRtc$MuteTrackRequest) newBuilder.f27507Z, str);
        newBuilder.d();
        LivekitRtc$MuteTrackRequest.access$17600((LivekitRtc$MuteTrackRequest) newBuilder.f27507Z, z10);
        C4027i3 newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.d();
        LivekitRtc$SignalRequest.access$1400((LivekitRtc$SignalRequest) newBuilder2.f27507Z, (LivekitRtc$MuteTrackRequest) newBuilder.b());
        e02.s((LivekitRtc$SignalRequest) newBuilder2.b());
    }
}
