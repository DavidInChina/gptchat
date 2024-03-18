package We;

import Sg.C1394f;
import Ve.C1488b;
import Ve.C1495e0;
import Ve.C1503i0;
import Ve.C1519y;
import Ve.EnumC1486a;
import Ve.I0;
import Ve.J0;
import Ve.r0;
import Xe.AbstractC1679a;
import Xe.C1682d;
import Xe.C1683e;
import Xe.C1687i;
import Xe.C1688j;
import Xe.I;
import android.content.Context;
import android.gov.nist.core.Separators;
import cf.AbstractC2408g;
import com.google.android.gms.internal.play_billing.N;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.C2532p;
import df.AbstractC2640e;
import id.AbstractC3557B;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import jh.C4061p2;
import jh.EnumC4056o2;
import jh.G1;
import jh.I1;
import jh.N2;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$SimulcastCodecInfo;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitModels$UserPacket;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpTransceiver;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;
import p1.AbstractC5042g;
import pf.AbstractC5156c;
import z.AbstractC6708l;
import zc.C6821H;

/* loaded from: classes2.dex */
public final class i extends w {

    /* renamed from: r  reason: collision with root package name */
    public boolean f21020r = false;

    /* renamed from: s  reason: collision with root package name */
    public final C1503i0 f21021s;

    /* renamed from: t  reason: collision with root package name */
    public final PeerConnectionFactory f21022t;

    /* renamed from: u  reason: collision with root package name */
    public final Context f21023u;

    /* renamed from: v  reason: collision with root package name */
    public final EglBase f21024v;

    /* renamed from: w  reason: collision with root package name */
    public final Xe.n f21025w;

    /* renamed from: x  reason: collision with root package name */
    public final C1488b f21026x;

    /* renamed from: y  reason: collision with root package name */
    public final wf.k f21027y;

    /* renamed from: z  reason: collision with root package name */
    public List f21028z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1503i0 c1503i0, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, C1687i c1687i, Xe.n nVar, C1488b c1488b, Ng.B b10, wf.k kVar) {
        super("", null, b10);
        AbstractC3557B.c0("engine", c1503i0);
        AbstractC3557B.c0("peerConnectionFactory", peerConnectionFactory);
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("eglBase", eglBase);
        AbstractC3557B.c0("screencastVideoTrackFactory", c1687i);
        AbstractC3557B.c0("videoTrackFactory", nVar);
        AbstractC3557B.c0("defaultsManager", c1488b);
        AbstractC3557B.c0("coroutineDispatcher", b10);
        AbstractC3557B.c0("capabilitiesGetter", kVar);
        this.f21021s = c1503i0;
        this.f21022t = peerConnectionFactory;
        this.f21023u = context;
        this.f21024v = eglBase;
        this.f21025w = nVar;
        this.f21026x = c1488b;
        this.f21027y = kVar;
    }

    public static List k(Xe.u uVar, F f6) {
        int i10;
        int i11;
        Object obj;
        Xe.F f10 = f6.f20971k;
        boolean z10 = f6.f20972l;
        if ((f10 != null || z10) && (i10 = uVar.f21935a) != 0 && (i11 = uVar.f21936b) != 0) {
            if (f10 == null) {
                List a5 = af.f.a(i10, i11);
                int max = Math.max(i10, i11);
                Iterator it = a5.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((I) obj).a().f21850a >= max) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                I i12 = (I) obj;
                if (i12 == null) {
                    i12 = (I) kf.t.o2(a5);
                }
                f10 = i12.b();
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                    Objects.toString(f10);
                    Mi.a.a(new Object[0]);
                }
            }
            ArrayList arrayList = new ArrayList();
            String str = f6.f20974n;
            if (str != null && R4.b.x1(f6.f20973m)) {
                RtpParameters.Encoding a10 = f10.a(null, 1.0d);
                a10.scalabilityMode = str;
                arrayList.add(a10);
                return arrayList;
            }
            if (z10) {
                List a11 = af.f.a(i10, i11);
                I i13 = (I) a11.get(1);
                I i14 = (I) a11.get(0);
                int max2 = Math.max(i10, i11);
                if (max2 >= 960) {
                    Xe.C a12 = i14.a();
                    double d10 = max2;
                    Xe.C a13 = i13.a();
                    l(arrayList, i14.b(), d10 / Math.max(a12.f21850a, a12.f21851b));
                    l(arrayList, i13.b(), d10 / Math.max(a13.f21850a, a13.f21851b));
                } else {
                    Xe.C a14 = i14.a();
                    l(arrayList, i14.b(), max2 / Math.max(a14.f21850a, a14.f21851b));
                }
                l(arrayList, f10, 1.0d);
            } else {
                arrayList.add(f10.a(null, 1.0d));
            }
            Collections.reverse(arrayList);
            return arrayList;
        }
        return kf.v.f37483Y;
    }

    public static final void l(ArrayList arrayList, Xe.F f6, double d10) {
        if (d10 < 1.0d) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.f(new Object[0]);
                return;
            }
            return;
        }
        int size = arrayList.size();
        String[] strArr = af.f.f24188a;
        if (size < 3) {
            arrayList.add(f6.a(strArr[arrayList.size()], d10));
            return;
        }
        throw new IllegalStateException("Attempting to add more encodings than we have rids for!");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Xe.a, Xe.d] */
    public static C1682d m(i iVar) {
        C1683e c1683e = iVar.f21026x.f18728a;
        iVar.getClass();
        AbstractC3557B.c0("options", c1683e);
        C1682d.Companion.getClass();
        Context context = iVar.f21023u;
        AbstractC3557B.c0("context", context);
        PeerConnectionFactory peerConnectionFactory = iVar.f21022t;
        AbstractC3557B.c0("factory", peerConnectionFactory);
        if (AbstractC5042g.a(context, "android.permission.RECORD_AUDIO") == 0) {
            MediaConstraints mediaConstraints = new MediaConstraints();
            mediaConstraints.optional.addAll(AbstractC4344b.G0(new MediaConstraints.KeyValuePair("googEchoCancellation", String.valueOf(c1683e.f21889b)), new MediaConstraints.KeyValuePair("googAutoGainControl", String.valueOf(c1683e.f21890c)), new MediaConstraints.KeyValuePair("googHighpassFilter", String.valueOf(c1683e.f21891d)), new MediaConstraints.KeyValuePair("googNoiseSuppression", String.valueOf(c1683e.f21888a)), new MediaConstraints.KeyValuePair("googTypingNoiseDetection", String.valueOf(c1683e.f21892e))));
            AudioTrack createAudioTrack = peerConnectionFactory.createAudioTrack(UUID.randomUUID().toString(), peerConnectionFactory.createAudioSource(mediaConstraints));
            AbstractC3557B.b0("rtcAudioTrack", createAudioTrack);
            return new AbstractC1679a("", createAudioTrack);
        }
        throw new SecurityException("Record audio permissions are required to create an audio track.");
    }

    public static Object p(i iVar, C1682d c1682d, AbstractC5156c abstractC5156c) {
        return iVar.o(c1682d, new C1651b(iVar.f21026x.f18729b), abstractC5156c);
    }

    public static Object q(i iVar, byte[] bArr, Kd.D d10) {
        I1 i12;
        iVar.getClass();
        if (bArr.length <= 15000) {
            int f6 = AbstractC6708l.f(1);
            if (f6 != 0) {
                if (f6 == 1) {
                    i12 = I1.LOSSY;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i12 = I1.RELIABLE;
            }
            C4061p2 newBuilder = LivekitModels$UserPacket.newBuilder();
            C2532p s10 = AbstractC2534q.s(bArr, 0, bArr.length);
            newBuilder.d();
            ((LivekitModels$UserPacket) newBuilder.f27507Z).setPayload(s10);
            String str = iVar.f21059a;
            newBuilder.d();
            ((LivekitModels$UserPacket) newBuilder.f27507Z).setParticipantSid(str);
            G1 newBuilder2 = LivekitModels$DataPacket.newBuilder();
            newBuilder2.d();
            ((LivekitModels$DataPacket) newBuilder2.f27507Z).setUser((LivekitModels$UserPacket) newBuilder.b());
            newBuilder2.d();
            ((LivekitModels$DataPacket) newBuilder2.f27507Z).setKind(i12);
            Object l10 = iVar.f21021s.l((LivekitModels$DataPacket) newBuilder2.b(), d10);
            if (l10 != EnumC5000a.f41328Y) {
                return jf.y.f36177a;
            }
            return l10;
        }
        throw new IllegalArgumentException("cannot publish data larger than 15000");
    }

    @Override // We.w
    public final void i(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        C1688j c1688j;
        boolean d10;
        super.i(livekitModels$ParticipantInfo);
        for (LivekitModels$TrackInfo livekitModels$TrackInfo : livekitModels$ParticipantInfo.getTracksList()) {
            Object obj = c().get(livekitModels$TrackInfo.getSid());
            if (obj instanceof C1688j) {
                c1688j = (C1688j) obj;
            } else {
                c1688j = null;
            }
            if (c1688j != null && livekitModels$TrackInfo.getMuted() != (d10 = c1688j.d())) {
                this.f21021s.n(this.f21059a, d10);
            }
        }
    }

    public final void j() {
        for (Xe.B b10 : c().values()) {
            Xe.z a5 = b10.a();
            if (a5 != null) {
                a5.c();
                v(a5, false);
                try {
                    a5.a();
                } catch (Exception unused) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                        b10.toString();
                        Mi.a.a(new Object[0]);
                    }
                }
            }
        }
    }

    public final List n() {
        C1688j c1688j;
        ArrayList arrayList = new ArrayList();
        for (Xe.B b10 : c().values()) {
            if (b10 instanceof C1688j) {
                c1688j = (C1688j) b10;
            } else {
                c1688j = null;
            }
            if (c1688j != null) {
                arrayList.add(c1688j);
            }
        }
        return kf.t.K2(arrayList);
    }

    public final Object o(C1682d c1682d, C1651b c1651b, AbstractC5156c abstractC5156c) {
        RtpParameters.Encoding encoding = new RtpParameters.Encoding(null, true, null);
        Integer num = c1651b.f20982k;
        if (num != null && num.intValue() > 0) {
            encoding.maxBitrateBps = c1651b.f20982k;
        }
        Object r10 = r(c1682d, c1651b, new C6821H(20, c1651b), AbstractC4344b.F0(encoding), abstractC5156c);
        if (r10 == EnumC5000a.f41328Y) {
            return r10;
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Xe.z zVar, D d10, wf.k kVar, List list, AbstractC4825e abstractC4825e) {
        g gVar;
        EnumC5000a enumC5000a;
        int i10;
        int i11;
        Xe.z zVar2;
        D d11;
        List list2;
        String str;
        i iVar;
        LivekitModels$TrackInfo livekitModels$TrackInfo;
        RtpTransceiver rtpTransceiver;
        Integer num;
        i iVar2;
        String str2;
        D d12;
        List list3;
        F f6;
        Object h10;
        String str3;
        String str4;
        Xe.z zVar3 = zVar;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i12 = gVar.f21014n0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f21014n0 = i12 - Integer.MIN_VALUE;
                Object obj = gVar.f21012l0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f21014n0;
                if (i10 != 0) {
                    N.B0(obj);
                    List<C1688j> n10 = n();
                    if (!n10.isEmpty()) {
                        for (C1688j c1688j : n10) {
                            if (AbstractC3557B.K(c1688j.a(), zVar3)) {
                                return Boolean.FALSE;
                            }
                        }
                    }
                    String id2 = zVar.b().id();
                    N2 newBuilder = LivekitRtc$AddTrackRequest.newBuilder();
                    AbstractC3557B.b0("this", newBuilder);
                    kVar.invoke(newBuilder);
                    AbstractC3557B.b0("cid", id2);
                    String name = d10.getName();
                    if (name == null) {
                        name = zVar3.f21948c;
                    }
                    EnumC4056o2 b10 = Xe.v.b(zVar3.f21949d);
                    String a5 = d10.a();
                    gVar.f21006Y = this;
                    gVar.f21007Z = zVar3;
                    gVar.f21008h0 = d10;
                    gVar.f21009i0 = list;
                    gVar.f21010j0 = id2;
                    gVar.f21014n0 = 1;
                    i11 = 1;
                    Object a10 = this.f21021s.a(id2, name, b10, a5, newBuilder, gVar);
                    if (a10 == enumC5000a) {
                        return enumC5000a;
                    }
                    d12 = d10;
                    iVar2 = this;
                    str2 = id2;
                    obj = a10;
                    list3 = list;
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    livekitModels$TrackInfo = gVar.f21011k0;
                    str = gVar.f21010j0;
                    list2 = gVar.f21009i0;
                    d11 = gVar.f21008h0;
                    zVar2 = gVar.f21007Z;
                    iVar = gVar.f21006Y;
                    N.B0(obj);
                    i11 = 1;
                    rtpTransceiver = (RtpTransceiver) obj;
                    if (!(zVar2 instanceof Xe.l)) {
                        ((Xe.l) zVar2).f21906p = rtpTransceiver;
                    } else if (zVar2 instanceof C1682d) {
                        ((C1682d) zVar2).f21887i = rtpTransceiver;
                    } else {
                        throw new IllegalArgumentException("Trying to publish a non local track of type " + zVar2.getClass());
                    }
                    if (rtpTransceiver != null) {
                        return Boolean.FALSE;
                    }
                    C1503i0 c1503i0 = iVar.f21021s;
                    AbstractC3557B.b0("transceiver.sender", rtpTransceiver.getSender());
                    c1503i0.getClass();
                    zVar2.getClass();
                    if ((list2.isEmpty() ^ i11) != 0 && (d11 instanceof F)) {
                        F f10 = (F) d11;
                        if (R4.b.x1(f10.f20973m)) {
                            RtpParameters.Encoding encoding = (RtpParameters.Encoding) kf.t.h2(list2);
                            if ((encoding != null ? encoding.maxBitrateBps : null) != null) {
                                AbstractC3557B.b0("cid", str);
                                I0 i02 = new I0(((RtpParameters.Encoding) kf.t.f2(list2)).maxBitrateBps != null ? num.intValue() / 1000 : 0, f10.f20973m);
                                C1503i0 c1503i02 = iVar.f21021s;
                                c1503i02.getClass();
                                C1519y c1519y = c1503i02.f18790p;
                                if (c1519y != null) {
                                    c1519y.f18925g.put(new J0(str), i02);
                                }
                            }
                        }
                    }
                    if (d11 instanceof F) {
                        F f11 = (F) d11;
                        AbstractC2640e.a(rtpTransceiver, f11.f20973m, iVar.f21027y);
                        ((Xe.l) zVar2).f21903m = f11.f20973m;
                    }
                    C1688j c1688j2 = new C1688j(livekitModels$TrackInfo, zVar2, iVar, d11);
                    iVar.a(c1688j2);
                    x xVar = iVar.f21073o;
                    if (xVar != null) {
                        r0 r0Var = (r0) xVar;
                        Se.c cVar = r0Var.f18880s;
                        if (cVar != null) {
                            Xe.z a11 = c1688j2.a();
                            AbstractC3557B.Z(a11);
                            cVar.a(a11, c1688j2, iVar, r0Var);
                        }
                        Te.n nVar = new Te.n(r0Var, c1688j2, iVar, i11);
                        C1394f c1394f = r0Var.f18872k;
                        if (c1394f == null) {
                            AbstractC3557B.C2("coroutineScope");
                            throw null;
                        }
                        r0Var.f18873l.a(nVar, c1394f);
                    }
                    iVar.f21062d.a(new Te.d(iVar, c1688j2, 0), iVar.f21061c);
                    return Boolean.TRUE;
                } else {
                    String str5 = gVar.f21010j0;
                    list3 = gVar.f21009i0;
                    d12 = gVar.f21008h0;
                    Xe.z zVar4 = gVar.f21007Z;
                    iVar2 = gVar.f21006Y;
                    N.B0(obj);
                    i11 = 1;
                    str2 = str5;
                    zVar3 = zVar4;
                }
                LivekitModels$TrackInfo livekitModels$TrackInfo2 = (LivekitModels$TrackInfo) obj;
                if (d12 instanceof F) {
                    List<LivekitModels$SimulcastCodecInfo> codecsList = livekitModels$TrackInfo2.getCodecsList();
                    AbstractC3557B.b0("trackInfo.codecsList", codecsList);
                    LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo = (LivekitModels$SimulcastCodecInfo) kf.t.h2(codecsList);
                    String mimeType = livekitModels$SimulcastCodecInfo != null ? livekitModels$SimulcastCodecInfo.getMimeType() : null;
                    if (mimeType != null) {
                        List G22 = Lg.n.G2(mimeType, new String[]{Separators.SLASH});
                        if (mimeType.length() <= i11) {
                            G22 = null;
                        }
                        if (G22 == null || (str4 = (String) G22.get(i11)) == null) {
                            str3 = null;
                        } else {
                            str3 = str4.toLowerCase(Locale.ROOT);
                            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", str3);
                        }
                        if (str3 != null) {
                            F f12 = (F) d12;
                            if (!AbstractC3557B.K(str3, f12.f20973m)) {
                                AbstractC2408g.Companion.getClass();
                                if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                    "falling back to server selected codec: ".concat(str3);
                                    Mi.a.a(new Object[0]);
                                }
                                F Q02 = F.Q0(f12, null, str3, null, null, 247);
                                AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.room.track.LocalVideoTrack", zVar3);
                                Xe.u e10 = ((Xe.l) zVar3).e();
                                iVar2.getClass();
                                list2 = k(e10, Q02);
                                f6 = Q02;
                                RtpTransceiver.RtpTransceiverInit rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, AbstractC4344b.F0(iVar2.f21059a), list2);
                                MediaStreamTrack b11 = zVar3.b();
                                gVar.f21006Y = iVar2;
                                gVar.f21007Z = zVar3;
                                gVar.f21008h0 = f6;
                                gVar.f21009i0 = list2;
                                gVar.f21010j0 = str2;
                                gVar.f21011k0 = livekitModels$TrackInfo2;
                                gVar.f21014n0 = 2;
                                C1519y c1519y2 = iVar2.f21021s.f18790p;
                                h10 = c1519y2 != null ? c1519y2.h(new Ve.N(b11, rtpTransceiverInit, null), gVar) : null;
                                if (h10 == enumC5000a) {
                                    return enumC5000a;
                                }
                                i iVar3 = iVar2;
                                zVar2 = zVar3;
                                livekitModels$TrackInfo = livekitModels$TrackInfo2;
                                obj = h10;
                                iVar = iVar3;
                                String str6 = str2;
                                d11 = f6;
                                str = str6;
                                rtpTransceiver = (RtpTransceiver) obj;
                                if (!(zVar2 instanceof Xe.l)) {
                                }
                                if (rtpTransceiver != null) {
                                }
                            }
                        }
                    }
                }
                D d13 = d12;
                list2 = list3;
                f6 = d13;
                RtpTransceiver.RtpTransceiverInit rtpTransceiverInit2 = new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, AbstractC4344b.F0(iVar2.f21059a), list2);
                MediaStreamTrack b112 = zVar3.b();
                gVar.f21006Y = iVar2;
                gVar.f21007Z = zVar3;
                gVar.f21008h0 = f6;
                gVar.f21009i0 = list2;
                gVar.f21010j0 = str2;
                gVar.f21011k0 = livekitModels$TrackInfo2;
                gVar.f21014n0 = 2;
                C1519y c1519y22 = iVar2.f21021s.f18790p;
                if (c1519y22 != null) {
                }
                if (h10 == enumC5000a) {
                }
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj2 = gVar.f21012l0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = gVar.f21014n0;
        if (i10 != 0) {
        }
        LivekitModels$TrackInfo livekitModels$TrackInfo22 = (LivekitModels$TrackInfo) obj2;
        if (d12 instanceof F) {
        }
        D d132 = d12;
        list2 = list3;
        f6 = d132;
        RtpTransceiver.RtpTransceiverInit rtpTransceiverInit22 = new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, AbstractC4344b.F0(iVar2.f21059a), list2);
        MediaStreamTrack b1122 = zVar3.b();
        gVar.f21006Y = iVar2;
        gVar.f21007Z = zVar3;
        gVar.f21008h0 = f6;
        gVar.f21009i0 = list2;
        gVar.f21010j0 = str2;
        gVar.f21011k0 = livekitModels$TrackInfo22;
        gVar.f21014n0 = 2;
        C1519y c1519y222 = iVar2.f21021s.f18790p;
        if (c1519y222 != null) {
        }
        if (h10 == enumC5000a) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final Object s(Xe.l lVar, F f6, AbstractC5156c abstractC5156c) {
        boolean x12 = R4.b.x1(f6.f20973m);
        ?? obj = new Object();
        obj.f37622Y = f6;
        if (x12) {
            this.f21020r = true;
            if (f6.f20975o == null) {
                obj.f37622Y = F.Q0(f6, null, null, null, new C1652c(), 223);
            }
            F f10 = (F) obj.f37622Y;
            if (f10.f20974n == null) {
                obj.f37622Y = F.Q0(f10, null, null, "L3T3_KEY", null, 239);
            }
        }
        List k10 = k(lVar.e(), (F) obj.f37622Y);
        String[] strArr = af.f.f24188a;
        Object r10 = r(lVar, (D) obj.f37622Y, new C6.a(lVar, (Object) obj, af.f.b(lVar.e().f21935a, lVar.e().f21936b, k10, x12), 26), k10, abstractC5156c);
        if (r10 == EnumC5000a.f41328Y) {
            return r10;
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        i iVar;
        Iterator it;
        List list;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f21019j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f21019j0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f21017h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f21019j0;
                if (i10 == 0) {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = hVar.f21016Z;
                    iVar = hVar.f21015Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    List list2 = this.f21028z;
                    if (list2 != null) {
                        list = kf.t.K2(list2);
                    } else {
                        list = kf.v.f37483Y;
                    }
                    this.f21028z = null;
                    iVar = this;
                    it = list.iterator();
                }
                while (it.hasNext()) {
                    C1688j c1688j = (C1688j) it.next();
                    Xe.z a5 = c1688j.a();
                    if (a5 != null) {
                        iVar.v(a5, false);
                        if (!c1688j.d()) {
                            boolean z10 = a5 instanceof C1682d;
                            D d10 = c1688j.f21898j;
                            if (z10) {
                                AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.room.participant.AudioTrackPublishOptions", d10);
                                hVar.f21015Y = iVar;
                                hVar.f21016Z = it;
                                hVar.f21019j0 = 1;
                                if (iVar.o((C1682d) a5, (C1651b) d10, hVar) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } else if (a5 instanceof Xe.l) {
                                AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.room.participant.VideoTrackPublishOptions", d10);
                                hVar.f21015Y = iVar;
                                hVar.f21016Z = it;
                                hVar.f21019j0 = 2;
                                if (iVar.s((Xe.l) a5, (F) d10, hVar) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } else {
                                throw new IllegalStateException("LocalParticipant has a non local track publish?");
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return jf.y.f36177a;
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj2 = hVar.f21017h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f21019j0;
        if (i10 == 0) {
        }
        while (it.hasNext()) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r7 == of.EnumC5000a.f41328Y) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v7, types: [Xe.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(boolean z10, AbstractC5156c abstractC5156c) {
        C1688j c1688j;
        ?? r12;
        Object obj;
        Xe.z a5;
        Iterator it = c().entrySet().iterator();
        while (true) {
            c1688j = null;
            if (it.hasNext()) {
                r12 = (Xe.B) ((Map.Entry) it.next()).getValue();
                int i10 = r12.f21847f;
                if (i10 == 2 || (i10 == 4 && r12.f21845d == 1)) {
                    break;
                }
            } else {
                r12 = 0;
                break;
            }
        }
        if (r12 instanceof C1688j) {
            c1688j = r12;
        }
        jf.y yVar = jf.y.f36177a;
        if (z10) {
            if (c1688j != null) {
                c1688j.b(false);
            } else {
                obj = p(this, m(this), abstractC5156c);
            }
        } else if (c1688j != null && (a5 = c1688j.a()) != null) {
            if (c1688j.f21847f == 3) {
                v(a5, true);
            } else {
                c1688j.b(true);
                if (c1688j.f21847f == 1 && (a5 instanceof Xe.l)) {
                    ((Xe.l) a5).f21900j.stopCapture();
                }
            }
        }
        obj = yVar;
        if (obj == EnumC5000a.f41328Y) {
            return obj;
        }
        return yVar;
    }

    public final void v(Xe.z zVar, boolean z10) {
        Object obj;
        Iterator it = n().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3557B.K(((C1688j) obj).a(), zVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1688j c1688j = (C1688j) obj;
        if (c1688j == null) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.a(new Object[0]);
                return;
            }
            return;
        }
        String str = c1688j.f21844c;
        LinkedHashMap m12 = AbstractC4268D.m1(c());
        m12.remove(str);
        h(m12);
        C1503i0 c1503i0 = this.f21021s;
        if (c1503i0.f() == EnumC1486a.f18719Z) {
            MediaStreamTrack b10 = zVar.b();
            AbstractC3557B.c0("rtcTrack", b10);
            Ad.l.a1(C4832l.f40334Y, new C1495e0(c1503i0, b10, null));
        }
        if (z10) {
            zVar.c();
        }
        x xVar = this.f21073o;
        if (xVar != null) {
            ((r0) xVar).m(this, c1688j);
        }
        this.f21062d.a(new Te.d(this, c1688j, 1), this.f21061c);
    }
}
