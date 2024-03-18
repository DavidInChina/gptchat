package Ve;

import G0.C0588q;
import Ng.AbstractC1070k;
import Ng.C1072l;
import Sg.C1394f;
import We.C1652c;
import We.C1653d;
import We.C1655f;
import We.EnumC1654e;
import Xe.C1688j;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.lifecycle.C2071f;
import bf.C2192a;
import cf.AbstractC2406e;
import cf.AbstractC2408g;
import cf.C2404c;
import cf.C2405d;
import cf.C2409h;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.protobuf.C2495c1;
import com.google.protobuf.C2540t0;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import ii.C3591f;
import io.livekit.android.room.IceCandidateJSON;
import j$.util.Objects;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import jf.C3959i;
import jh.B1;
import jh.C1;
import jh.C4027i3;
import jh.C4037k3;
import jh.EnumC4032j3;
import jh.EnumC4042l3;
import jh.EnumC4047m3;
import jh.EnumC4076s3;
import jh.F1;
import jh.K3;
import jh.M1;
import jh.Q1;
import jh.R1;
import ji.AbstractC4137l;
import ji.C4138m;
import l8.AbstractC4344b;
import livekit.LivekitModels$ClientInfo;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$Room;
import livekit.LivekitModels$SpeakerInfo;
import livekit.LivekitRtc$ConnectionQualityInfo;
import livekit.LivekitRtc$LeaveRequest;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$SignalResponse;
import livekit.LivekitRtc$StreamStateInfo;
import livekit.LivekitRtc$SubscribedCodec;
import livekit.LivekitRtc$SubscribedQuality;
import livekit.LivekitRtc$SubscribedQualityUpdate;
import livekit.LivekitRtc$SubscriptionPermissionUpdate;
import livekit.LivekitRtc$TrackPublishedResponse;
import livekit.LivekitRtc$TrackUnpublishedResponse;
import livekit.LivekitRtc$TrickleRequest;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.SessionDescription;
import livekit.org.webrtc.VideoTrack;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5156c;
import q1.AbstractC5260f;
import ud.C5902a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class E0 extends Wh.K {
    public static final u0 Companion = new Object();

    /* renamed from: F0  reason: collision with root package name */
    public static final List f18625F0 = AbstractC4344b.G0(EnumC4032j3.f36460p0, EnumC4032j3.f36452h0, EnumC4032j3.f36450Y, EnumC4032j3.f36451Z, EnumC4032j3.f36461q0, EnumC4032j3.f36457m0);

    /* renamed from: G0  reason: collision with root package name */
    public static final List f18626G0 = AbstractC4344b.G0(PeerConnection.IceServer.builder("stun:stun.l.google.com:19302").createIceServer(), PeerConnection.IceServer.builder("stun:stun1.l.google.com:19302").createIceServer());

    /* renamed from: A0  reason: collision with root package name */
    public Ng.D0 f18627A0;

    /* renamed from: B0  reason: collision with root package name */
    public Ng.D0 f18628B0;

    /* renamed from: C0  reason: collision with root package name */
    public long f18629C0;

    /* renamed from: D0  reason: collision with root package name */
    public long f18630D0;

    /* renamed from: E0  reason: collision with root package name */
    public long f18631E0;

    /* renamed from: Y  reason: collision with root package name */
    public final Wh.I f18632Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC2904d f18633Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Wh.w f18634h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Ng.B f18635i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C2192a f18636j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f18637k0;

    /* renamed from: l0  reason: collision with root package name */
    public Wh.J f18638l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f18639m0;

    /* renamed from: n0  reason: collision with root package name */
    public v0 f18640n0;

    /* renamed from: o0  reason: collision with root package name */
    public Zd.a f18641o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f18642p0;

    /* renamed from: q0  reason: collision with root package name */
    public Pe.c f18643q0;

    /* renamed from: r0  reason: collision with root package name */
    public Pe.e f18644r0;

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC1070k f18645s0;

    /* renamed from: t0  reason: collision with root package name */
    public C2071f f18646t0;

    /* renamed from: v0  reason: collision with root package name */
    public Ng.D0 f18648v0;

    /* renamed from: y0  reason: collision with root package name */
    public Ng.D0 f18651y0;

    /* renamed from: u0  reason: collision with root package name */
    public final Object f18647u0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public final Qg.r0 f18649w0 = Qg.s0.b(Integer.MAX_VALUE, 0, null, 6);

    /* renamed from: x0  reason: collision with root package name */
    public final Object f18650x0 = new Object();

    /* renamed from: z0  reason: collision with root package name */
    public final Qg.r0 f18652z0 = Qg.s0.b(Integer.MAX_VALUE, 0, null, 6);

    public E0(Wh.I i10, AbstractC2904d abstractC2904d, Wh.w wVar, Ng.B b10, C2192a c2192a) {
        AbstractC3557B.c0("websocketFactory", i10);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("okHttpClient", wVar);
        AbstractC3557B.c0("ioDispatcher", b10);
        AbstractC3557B.c0("networkInfo", c2192a);
        this.f18632Y = i10;
        this.f18633Z = abstractC2904d;
        this.f18634h0 = wVar;
        this.f18635i0 = b10;
        this.f18636j0 = c2192a;
    }

    public static void g(E0 e02, String str) {
        e02.getClass();
        AbstractC3557B.c0("reason", str);
        new Exception();
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
        e02.f18637k0 = false;
        e02.f18639m0 = false;
        C2071f c2071f = e02.f18646t0;
        if (c2071f != null) {
            c2071f.close();
        }
        Ng.D0 d02 = e02.f18648v0;
        if (d02 != null) {
            d02.k(null);
        }
        e02.f18648v0 = null;
        Ng.D0 d03 = e02.f18651y0;
        if (d03 != null) {
            d03.k(null);
        }
        e02.f18651y0 = null;
        Ng.D0 d04 = e02.f18627A0;
        if (d04 != null) {
            d04.k(null);
        }
        e02.f18627A0 = null;
        Ng.D0 d05 = e02.f18628B0;
        if (d05 != null) {
            d05.k(null);
        }
        e02.f18628B0 = null;
        Wh.J j6 = e02.f18638l0;
        if (j6 != null) {
            ((C3591f) j6).b(1000, str);
        }
        e02.f18638l0 = null;
        AbstractC1070k abstractC1070k = e02.f18645s0;
        if (abstractC1070k != null) {
            abstractC1070k.s(null);
        }
        e02.f18645s0 = null;
        e02.f18652z0.f();
        e02.f18642p0 = null;
        e02.f18643q0 = null;
        e02.f18644r0 = null;
    }

    public static SessionDescription k(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        SessionDescription.Type type;
        String type2 = livekitRtc$SessionDescription.getType();
        if (type2 != null) {
            int hashCode = type2.hashCode();
            if (hashCode != -1412808770) {
                if (hashCode != -1395375040) {
                    if (hashCode == 105650780 && type2.equals("offer")) {
                        type = SessionDescription.Type.OFFER;
                        return new SessionDescription(type, livekitRtc$SessionDescription.getSdp());
                    }
                } else if (type2.equals("pranswer")) {
                    type = SessionDescription.Type.PRANSWER;
                    return new SessionDescription(type, livekitRtc$SessionDescription.getSdp());
                }
            } else if (type2.equals("answer")) {
                type = SessionDescription.Type.ANSWER;
                return new SessionDescription(type, livekitRtc$SessionDescription.getSdp());
            }
        }
        throw new IllegalArgumentException("invalid RTC SdpType: " + livekitRtc$SessionDescription.getType());
    }

    @Override // Wh.K
    public final void a(C3591f c3591f, int i10, String str) {
        AbstractC3557B.c0("webSocket", c3591f);
        m(i10, str);
    }

    @Override // Wh.K
    public final void b(C3591f c3591f, int i10, String str) {
        AbstractC3557B.c0("webSocket", c3591f);
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // Wh.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Wh.J j6, Throwable th2, Wh.D d10) {
        String str;
        int i10;
        Charset charset;
        AbstractC3557B.c0("webSocket", j6);
        String str2 = null;
        try {
            String str3 = this.f18642p0;
            if (str3 != null) {
                StringBuilder sb2 = new StringBuilder("http");
                String substring = str3.substring(2);
                AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                sb2.append(Lg.n.B2(substring, "/rtc?", "/rtc/validate?"));
                String sb3 = sb2.toString();
                Wh.y yVar = new Wh.y();
                yVar.g(sb3);
                Wh.D f6 = this.f18634h0.b(yVar.b()).f();
                Wh.F f10 = f6.f21136l0;
                int i11 = f6.f21133i0;
                if ((200 <= i11 && i11 < 300) || f10 == null) {
                    str = null;
                } else {
                    AbstractC4137l abstractC4137l = ((Wh.E) f10).f21146h0;
                    Wh.u a5 = f10.a();
                    if (a5 == null || (charset = a5.a(Lg.a.f11131a)) == null) {
                        charset = Lg.a.f11131a;
                    }
                    str = abstractC4137l.h0(Xh.b.s(abstractC4137l, charset));
                    Ad.l.S(abstractC4137l, null);
                }
                if (f10 != null) {
                    try {
                        f10.close();
                    } catch (Throwable unused) {
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                            Mi.a.b(new Object[0]);
                        }
                        if (str == null) {
                        }
                        if (!this.f18637k0) {
                        }
                    }
                }
            } else {
                str = null;
            }
        } catch (Throwable unused2) {
            str = null;
        }
        if (str == null) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                "websocket failure: ".concat(str);
                Mi.a.b(new Object[0]);
            }
            Exception exc = new Exception(str);
            v0 v0Var = this.f18640n0;
            if (v0Var != null) {
                ((C1503i0) v0Var).j(exc);
            }
            AbstractC1070k abstractC1070k = this.f18645s0;
            if (abstractC1070k != null) {
                abstractC1070k.s(exc);
            }
        } else {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                Objects.toString(d10);
                Mi.a.b(new Object[0]);
            }
            v0 v0Var2 = this.f18640n0;
            if (v0Var2 != null) {
                ((C1503i0) v0Var2).j(th2);
            }
            AbstractC1070k abstractC1070k2 = this.f18645s0;
            if (abstractC1070k2 != null) {
                abstractC1070k2.s(th2);
            }
        }
        if (!this.f18637k0) {
            if (str == null) {
                if (d10 != null) {
                    str2 = d10.toString();
                }
                if (str2 == null) {
                    str = th2.getLocalizedMessage();
                } else {
                    str = str2;
                }
            }
            if (str == null) {
                str = "websocket failure";
            }
            if (d10 != null) {
                i10 = d10.f21133i0;
            } else {
                i10 = 3500;
            }
            m(i10, str);
        }
    }

    @Override // Wh.K
    public final void d(C3591f c3591f, String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.f(new Object[0]);
        }
    }

    @Override // Wh.K
    public final void e(C3591f c3591f, C4138m c4138m) {
        byte[] q10 = c4138m.q();
        C4037k3 newBuilder = LivekitRtc$SignalResponse.newBuilder();
        newBuilder.getClass();
        int length = q10.length;
        com.google.protobuf.J b10 = com.google.protobuf.J.b();
        newBuilder.d();
        try {
            C2495c1.f27531c.b(newBuilder.f27507Z).h(newBuilder.f27507Z, q10, 0, length, new com.google.android.gms.internal.play_billing.A(b10));
            LivekitRtc$SignalResponse livekitRtc$SignalResponse = (LivekitRtc$SignalResponse) newBuilder.b();
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                livekitRtc$SignalResponse.toString();
                Mi.a.e(new Object[0]);
            }
            if (!this.f18637k0) {
                if (livekitRtc$SignalResponse.hasJoin()) {
                    this.f18637k0 = true;
                    v();
                    long j6 = 1000;
                    this.f18629C0 = livekitRtc$SignalResponse.getJoin().getPingTimeout() * j6;
                    this.f18630D0 = livekitRtc$SignalResponse.getJoin().getPingInterval() * j6;
                    u();
                    try {
                        this.f18641o0 = new Zd.a(livekitRtc$SignalResponse.getJoin().getServerVersion());
                    } catch (Throwable unused) {
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                            Mi.a.f(new Object[0]);
                        }
                    }
                    AbstractC1070k abstractC1070k = this.f18645s0;
                    if (abstractC1070k != null) {
                        abstractC1070k.resumeWith(new C2404c(livekitRtc$SignalResponse.getJoin()));
                        return;
                    }
                    return;
                } else if (livekitRtc$SignalResponse.hasLeave()) {
                    l(livekitRtc$SignalResponse);
                    return;
                } else if (this.f18639m0) {
                    this.f18639m0 = false;
                    this.f18637k0 = true;
                    u();
                    if (livekitRtc$SignalResponse.hasReconnect()) {
                        AbstractC1070k abstractC1070k2 = this.f18645s0;
                        if (abstractC1070k2 != null) {
                            abstractC1070k2.resumeWith(new C2405d(new C2404c(livekitRtc$SignalResponse.getReconnect())));
                            return;
                        }
                        return;
                    }
                    AbstractC1070k abstractC1070k3 = this.f18645s0;
                    if (abstractC1070k3 != null) {
                        abstractC1070k3.resumeWith(new C2405d(new C2405d(jf.y.f36177a)));
                    }
                } else if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                    livekitRtc$SignalResponse.toString();
                    Mi.a.b(new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            this.f18652z0.g(livekitRtc$SignalResponse);
        } catch (C2540t0 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused2) {
            throw C2540t0.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
        if (r10.hasTransport(8) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, Pe.c cVar, Pe.e eVar, AbstractC5156c abstractC5156c) {
        ConnectivityManager connectivityManager;
        int i10;
        Iterator it;
        Object t10;
        String str3;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        g(this, "Starting new connection");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/rtc");
        B1 newBuilder = LivekitModels$ClientInfo.newBuilder();
        C1 c12 = C1.ANDROID;
        newBuilder.d();
        LivekitModels$ClientInfo.access$27300((LivekitModels$ClientInfo) newBuilder.f27507Z, c12);
        newBuilder.d();
        LivekitModels$ClientInfo.access$27500((LivekitModels$ClientInfo) newBuilder.f27507Z, "2.0.1");
        newBuilder.d();
        LivekitModels$ClientInfo.access$28000((LivekitModels$ClientInfo) newBuilder.f27507Z, "android");
        String str4 = Build.VERSION.RELEASE;
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        newBuilder.d();
        LivekitModels$ClientInfo.access$28300((LivekitModels$ClientInfo) newBuilder.f27507Z, str4);
        String str6 = Build.MANUFACTURER;
        if (str6 == null) {
            str6 = str5;
        }
        String str7 = Build.MODEL;
        if (str7 == null) {
            str7 = str5;
        }
        String obj = Lg.n.U2(str6 + ' ' + str7).toString();
        newBuilder.d();
        LivekitModels$ClientInfo.access$28600((LivekitModels$ClientInfo) newBuilder.f27507Z, obj);
        LivekitModels$ClientInfo livekitModels$ClientInfo = (LivekitModels$ClientInfo) newBuilder.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3959i("access_token", str2));
        arrayList.add(new C3959i("protocol", String.valueOf(R.a.l(cVar.f13958f))));
        if (cVar.f13959g) {
            arrayList.add(new C3959i("reconnect", "1"));
            String str8 = cVar.f13960h;
            if (str8 != null) {
                arrayList.add(new C3959i("sid", str8));
            }
        }
        arrayList.add(new C3959i("auto_subscribe", String.valueOf(cVar.f13953a ? 1 : 0)));
        arrayList.add(new C3959i("adaptive_stream", String.valueOf(eVar.f13967a ? 1 : 0)));
        arrayList.add(new C3959i("sdk", "android"));
        arrayList.add(new C3959i(ParameterNames.VERSION, livekitModels$ClientInfo.getVersion()));
        arrayList.add(new C3959i("device_model", livekitModels$ClientInfo.getDeviceModel()));
        arrayList.add(new C3959i("os", livekitModels$ClientInfo.getOs()));
        arrayList.add(new C3959i("os_version", livekitModels$ClientInfo.getOsVersion()));
        Object systemService = this.f18636j0.f25972a.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            if (networkCapabilities.hasTransport(1)) {
                i10 = 1;
            } else {
                i10 = 3;
                if (networkCapabilities.hasTransport(3)) {
                    i10 = 2;
                } else if (!networkCapabilities.hasTransport(0)) {
                    i10 = 4;
                    if (!networkCapabilities.hasTransport(4)) {
                        int i11 = 5;
                        if (!networkCapabilities.hasTransport(2)) {
                            i11 = 6;
                            if (!networkCapabilities.hasTransport(5)) {
                                if (!networkCapabilities.hasTransport(6)) {
                                }
                            }
                        }
                        i10 = i11;
                    }
                }
            }
            arrayList.add(new C3959i("network", android.gov.nist.core.a.b(i10)));
            it = arrayList.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    C3959i c3959i = (C3959i) next;
                    if (i12 == 0) {
                        str3 = Separators.QUESTION;
                    } else {
                        str3 = Separators.AND;
                    }
                    StringBuilder r10 = android.gov.nist.core.a.r(str5, str3);
                    r10.append((String) c3959i.f36155Y);
                    r10.append('=');
                    r10.append((String) c3959i.f36156Z);
                    str5 = r10.toString();
                    i12 = i13;
                } else {
                    AbstractC4344b.d1();
                    throw null;
                }
            }
            sb2.append(str5);
            String sb3 = sb2.toString();
            this.f18639m0 = cVar.f13959g;
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.c(new Object[0]);
            }
            this.f18646t0 = new C2071f(AbstractC4344b.Q0(Bi.c.z(), this.f18635i0), 1);
            this.f18642p0 = sb3;
            this.f18643q0 = cVar;
            this.f18644r0 = eVar;
            Wh.y yVar = new Wh.y();
            yVar.g(sb3);
            Wh.z b10 = yVar.b();
            C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC5156c));
            c1072l.u();
            this.f18645s0 = c1072l;
            this.f18638l0 = ((Wh.w) this.f18632Y).c(b10, this);
            t10 = c1072l.t();
            if (t10 == EnumC5000a.f41328Y) {
                com.google.android.gms.internal.play_billing.N.k0(abstractC5156c);
            }
            return t10;
        }
        i10 = 7;
        arrayList.add(new C3959i("network", android.gov.nist.core.a.b(i10)));
        it = arrayList.iterator();
        int i122 = 0;
        while (it.hasNext()) {
        }
        sb2.append(str5);
        String sb32 = sb2.toString();
        this.f18639m0 = cVar.f13959g;
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(2, 7) >= 0) {
            Mi.a.c(new Object[0]);
        }
        this.f18646t0 = new C2071f(AbstractC4344b.Q0(Bi.c.z(), this.f18635i0), 1);
        this.f18642p0 = sb32;
        this.f18643q0 = cVar;
        this.f18644r0 = eVar;
        Wh.y yVar2 = new Wh.y();
        yVar2.g(sb32);
        Wh.z b102 = yVar2.b();
        C1072l c1072l2 = new C1072l(1, AbstractC5260f.z(abstractC5156c));
        c1072l2.u();
        this.f18645s0 = c1072l2;
        this.f18638l0 = ((Wh.w) this.f18632Y).c(b102, this);
        t10 = c1072l2.t();
        if (t10 == EnumC5000a.f41328Y) {
        }
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0386  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, Xe.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(LivekitRtc$SignalResponse livekitRtc$SignalResponse) {
        int i10;
        jf.y yVar;
        int i11;
        jf.y yVar2;
        int i12;
        String str;
        int i13;
        EnumC1654e enumC1654e;
        Xe.B b10;
        Xe.z a5;
        Xe.x xVar;
        v0 v0Var;
        C1688j c1688j;
        Xe.l lVar;
        We.F f6;
        List<Xe.E> list;
        LinkedHashMap linkedHashMap;
        String str2;
        C3959i c3959i;
        String codec;
        Xe.E[] values;
        int length;
        RtpSender rtpSender;
        We.C c10;
        EnumC4042l3 messageCase = livekitRtc$SignalResponse.getMessageCase();
        int i14 = -1;
        if (messageCase == null) {
            i10 = -1;
        } else {
            i10 = w0.f18912a[messageCase.ordinal()];
        }
        int i15 = 0;
        if (i10 != -1 && i10 != 21) {
            C4832l c4832l = C4832l.f40334Y;
            Xe.r rVar = null;
            Xe.z zVar = null;
            switch (i10) {
                case 1:
                    LivekitRtc$SessionDescription answer = livekitRtc$SignalResponse.getAnswer();
                    AbstractC3557B.b0("response.answer", answer);
                    SessionDescription k10 = k(answer);
                    v0 v0Var2 = this.f18640n0;
                    if (v0Var2 != null) {
                        C1503i0 c1503i0 = (C1503i0) v0Var2;
                        PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) Ad.l.a1(c4832l, new X(c1503i0, null));
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                            Objects.toString(k10.type);
                            Objects.toString(signalingState);
                            Mi.a.e(new Object[0]);
                        }
                        Ad.l.O0(c1503i0.f18799y, null, null, new W(c1503i0, k10, null), 3);
                        return;
                    }
                    return;
                case 2:
                    LivekitRtc$SessionDescription offer = livekitRtc$SignalResponse.getOffer();
                    AbstractC3557B.b0("response.offer", offer);
                    SessionDescription k11 = k(offer);
                    v0 v0Var3 = this.f18640n0;
                    if (v0Var3 != null) {
                        C1503i0 c1503i02 = (C1503i0) v0Var3;
                        PeerConnection.SignalingState signalingState2 = (PeerConnection.SignalingState) Ad.l.a1(c4832l, new C1489b0(c1503i02, null));
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                            Objects.toString(k11.type);
                            Objects.toString(signalingState2);
                            Mi.a.e(new Object[0]);
                        }
                        Ad.l.O0(c1503i02.f18799y, null, null, new C1487a0(c1503i02, k11, null), 3);
                        return;
                    }
                    return;
                case 3:
                    String candidateInit = livekitRtc$SignalResponse.getTrickle().getCandidateInit();
                    AbstractC3557B.b0("response.trickle.candidateInit", candidateInit);
                    AbstractC2904d abstractC2904d = this.f18633Z;
                    abstractC2904d.getClass();
                    IceCandidateJSON iceCandidateJSON = (IceCandidateJSON) abstractC2904d.b(IceCandidateJSON.Companion.serializer(), candidateInit);
                    IceCandidate iceCandidate = new IceCandidate(iceCandidateJSON.f33704c, iceCandidateJSON.f33703b, iceCandidateJSON.f33702a);
                    v0 v0Var4 = this.f18640n0;
                    if (v0Var4 != null) {
                        EnumC4047m3 target = livekitRtc$SignalResponse.getTrickle().getTarget();
                        AbstractC3557B.b0("response.trickle.target", target);
                        C1503i0 c1503i03 = (C1503i0) v0Var4;
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                            iceCandidate.toString();
                            target.toString();
                            Mi.a.e(new Object[0]);
                        }
                        int ordinal = target.ordinal();
                        jf.y yVar3 = jf.y.f36177a;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                                    Mi.a.c(new Object[0]);
                                    return;
                                }
                                return;
                            }
                            C1519y c1519y = c1503i03.f18791q;
                            if (c1519y != null) {
                                C5902a c5902a = new C5902a(c1519y, 3, iceCandidate);
                                if (c1519y.f18926h.get()) {
                                    i12 = 4;
                                } else {
                                    i12 = 4;
                                    ef.e.a(new C5902a(c1519y, 4, c5902a));
                                }
                                yVar2 = yVar3;
                            } else {
                                i12 = 4;
                                yVar2 = null;
                            }
                            if (yVar2 == null && AbstractC6708l.b(i12, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.f(new Object[0]);
                                return;
                            }
                            return;
                        }
                        C1519y c1519y2 = c1503i03.f18790p;
                        if (c1519y2 != null) {
                            C5902a c5902a2 = new C5902a(c1519y2, 3, iceCandidate);
                            if (c1519y2.f18926h.get()) {
                                i11 = 4;
                            } else {
                                i11 = 4;
                                ef.e.a(new C5902a(c1519y2, 4, c5902a2));
                            }
                            yVar = yVar3;
                        } else {
                            i11 = 4;
                            yVar = null;
                        }
                        if (yVar == null && AbstractC6708l.b(i11, 7) >= 0 && Mi.a.d() > 0) {
                            Mi.a.f(new Object[0]);
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    v0 v0Var5 = this.f18640n0;
                    if (v0Var5 != null) {
                        List<LivekitModels$ParticipantInfo> participantsList = livekitRtc$SignalResponse.getUpdate().getParticipantsList();
                        AbstractC3557B.b0("response.update.participantsList", participantsList);
                        F f10 = ((C1503i0) v0Var5).f18778d;
                        if (f10 != null) {
                            r0 r0Var = (r0) f10;
                            for (LivekitModels$ParticipantInfo livekitModels$ParticipantInfo : participantsList) {
                                String sid = livekitModels$ParticipantInfo.getSid();
                                AbstractC3557B.b0("info.sid", sid);
                                String identity = livekitModels$ParticipantInfo.getIdentity();
                                LinkedHashMap linkedHashMap2 = r0Var.f18885x;
                                if (identity == null || Lg.n.n2(identity)) {
                                    Q1 q12 = (Q1) livekitModels$ParticipantInfo.toBuilder();
                                    We.m mVar = (We.m) linkedHashMap2.get(new We.n(sid));
                                    if (mVar != null) {
                                        str = mVar.f21040a;
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        str = "";
                                    }
                                    q12.d();
                                    LivekitModels$ParticipantInfo.access$7500((LivekitModels$ParticipantInfo) q12.f27507Z, str);
                                    livekitModels$ParticipantInfo = (LivekitModels$ParticipantInfo) q12.b();
                                }
                                String identity2 = livekitModels$ParticipantInfo.getIdentity();
                                AbstractC3557B.b0("info.identity", identity2);
                                We.i iVar = r0Var.f18883v;
                                String b11 = iVar.b();
                                if (b11 != null && AbstractC3557B.K(b11, identity2)) {
                                    iVar.i(livekitModels$ParticipantInfo);
                                } else {
                                    boolean z10 = !r0Var.d().containsKey(new We.m(identity2));
                                    if (livekitModels$ParticipantInfo.getState() == R1.DISCONNECTED) {
                                        r0Var.i(identity2);
                                    } else {
                                        We.C e10 = r0Var.e(livekitModels$ParticipantInfo, identity2);
                                        if (z10) {
                                            AbstractC3557B.c0("participant", e10);
                                            Te.w wVar = new Te.w(r0Var);
                                            C1394f c1394f = r0Var.f18872k;
                                            if (c1394f != null) {
                                                r0Var.f18873l.a(wVar, c1394f);
                                            } else {
                                                AbstractC3557B.C2("coroutineScope");
                                                throw null;
                                            }
                                        } else {
                                            e10.i(livekitModels$ParticipantInfo);
                                            linkedHashMap2.put(new We.n(sid), new We.m(identity2));
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                    v0 v0Var6 = this.f18640n0;
                    if (v0Var6 != null) {
                        LivekitRtc$TrackPublishedResponse trackPublished = livekitRtc$SignalResponse.getTrackPublished();
                        AbstractC3557B.b0("response.trackPublished", trackPublished);
                        C1503i0 c1503i04 = (C1503i0) v0Var6;
                        String cid = trackPublished.getCid();
                        if (cid == null) {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.b(new Object[0]);
                                return;
                            }
                            return;
                        }
                        if (trackPublished.getTrack() == null) {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.a(new Object[0]);
                            }
                        }
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                            "local track published ".concat(cid);
                            Mi.a.e(new Object[0]);
                        }
                        AbstractC4825e abstractC4825e = (AbstractC4825e) c1503i04.f18782h.remove(cid);
                        if (abstractC4825e == null) {
                            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                "missing track resolver for: ".concat(cid);
                                Mi.a.a(new Object[0]);
                                return;
                            }
                            return;
                        }
                        abstractC4825e.resumeWith(trackPublished.getTrack());
                        return;
                    }
                    return;
                case 6:
                    v0 v0Var7 = this.f18640n0;
                    if (v0Var7 != null) {
                        List<LivekitModels$SpeakerInfo> speakersList = livekitRtc$SignalResponse.getSpeakersChanged().getSpeakersList();
                        AbstractC3557B.b0("response.speakersChanged.speakersList", speakersList);
                        F f11 = ((C1503i0) v0Var7).f18778d;
                        if (f11 != null) {
                            r0 r0Var2 = (r0) f11;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            Df.v vVar = r0.f18859C[6];
                            C2409h c2409h = r0Var2.f18886y;
                            for (We.w wVar2 : (List) c2409h.d(vVar)) {
                                linkedHashMap3.put(new We.n(wVar2.f21059a), wVar2);
                            }
                            for (LivekitModels$SpeakerInfo livekitModels$SpeakerInfo : speakersList) {
                                String sid2 = livekitModels$SpeakerInfo.getSid();
                                AbstractC3557B.b0("speaker.sid", sid2);
                                We.w f12 = r0Var2.f(sid2);
                                if (f12 != null) {
                                    f12.f(livekitModels$SpeakerInfo.getLevel());
                                    f12.g(livekitModels$SpeakerInfo.getActive());
                                    if (livekitModels$SpeakerInfo.getActive()) {
                                        linkedHashMap3.put(new We.n(sid2), f12);
                                    } else {
                                        linkedHashMap3.remove(new We.n(sid2));
                                    }
                                }
                            }
                            List K22 = kf.t.K2(kf.t.F2(kf.t.K2(linkedHashMap3.values()), new C0588q(18)));
                            Df.v[] vVarArr = r0.f18859C;
                            c2409h.h(K22, vVarArr[6]);
                            Te.n nVar = new Te.n(r0Var2, (List) c2409h.d(vVarArr[6]));
                            C1394f c1394f2 = r0Var2.f18872k;
                            if (c1394f2 != null) {
                                r0Var2.f18873l.a(nVar, c1394f2);
                                return;
                            } else {
                                AbstractC3557B.C2("coroutineScope");
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                case 7:
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                        Mi.a.a(new Object[0]);
                        return;
                    }
                    return;
                case 8:
                    v0 v0Var8 = this.f18640n0;
                    if (v0Var8 != null) {
                        LivekitRtc$LeaveRequest leave = livekitRtc$SignalResponse.getLeave();
                        AbstractC3557B.b0("response.leave", leave);
                        C1503i0 c1503i05 = (C1503i0) v0Var8;
                        if (leave.getCanReconnect()) {
                            c1503i05.f18781g = true;
                            return;
                        }
                        D d10 = C1503i0.Companion;
                        c1503i05.b("Normal Closure");
                        M1 reason = leave.getReason();
                        if (reason != null) {
                            i14 = Te.x.f17207a[reason.ordinal()];
                        }
                        switch (i14) {
                            case -1:
                            case 8:
                            case 9:
                                i13 = 1;
                                break;
                            case 0:
                            default:
                                throw new RuntimeException();
                            case 1:
                                i13 = 2;
                                break;
                            case 2:
                                i13 = 3;
                                break;
                            case 3:
                                i13 = 4;
                                break;
                            case 4:
                                i13 = 5;
                                break;
                            case 5:
                                i13 = 6;
                                break;
                            case 6:
                                i13 = 7;
                                break;
                            case 7:
                                i13 = 8;
                                break;
                        }
                        F f13 = c1503i05.f18778d;
                        if (f13 != null) {
                            ((r0) f13).k(i13);
                            return;
                        }
                        return;
                    }
                    return;
                case 9:
                    v0 v0Var9 = this.f18640n0;
                    if (v0Var9 != null) {
                        String sid3 = livekitRtc$SignalResponse.getMute().getSid();
                        AbstractC3557B.b0("response.mute.sid", sid3);
                        boolean muted = livekitRtc$SignalResponse.getMute().getMuted();
                        F f14 = ((C1503i0) v0Var9).f18778d;
                        if (f14 != null) {
                            We.i iVar2 = ((r0) f14).f18883v;
                            iVar2.getClass();
                            Xe.B b12 = (Xe.B) iVar2.c().get(sid3);
                            if (b12 != null) {
                                b12.b(muted);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 10:
                    v0 v0Var10 = this.f18640n0;
                    if (v0Var10 != null) {
                        LivekitModels$Room room = livekitRtc$SignalResponse.getRoomUpdate().getRoom();
                        AbstractC3557B.b0("response.roomUpdate.room", room);
                        F f15 = ((C1503i0) v0Var10).f18778d;
                        if (f15 != null) {
                            r0 r0Var3 = (r0) f15;
                            if (room.getSid() != null) {
                                String sid4 = room.getSid();
                                AbstractC3557B.b0("update.sid", sid4);
                                r0Var3.n(sid4);
                            }
                            Df.v[] vVarArr2 = r0.f18859C;
                            Df.v vVar2 = vVarArr2[3];
                            C2409h c2409h2 = r0Var3.f18878q;
                            c2409h2.h(room.getMetadata(), vVarArr2[3]);
                            boolean j6 = r0Var3.j();
                            r0Var3.f18879r.h(Boolean.valueOf(room.getActiveRecording()), vVarArr2[4]);
                            boolean K10 = AbstractC3557B.K((String) c2409h2.d(vVar2), (String) c2409h2.d(vVarArr2[3]));
                            Te.b bVar = r0Var3.f18873l;
                            if (!K10) {
                                String str3 = (String) c2409h2.d(vVarArr2[3]);
                                Te.w wVar3 = new Te.w(r0Var3);
                                C1394f c1394f3 = r0Var3.f18872k;
                                if (c1394f3 != null) {
                                    bVar.a(wVar3, c1394f3);
                                } else {
                                    AbstractC3557B.C2("coroutineScope");
                                    throw null;
                                }
                            }
                            if (j6 != r0Var3.j()) {
                                r0Var3.j();
                                Te.w wVar4 = new Te.w(r0Var3);
                                C1394f c1394f4 = r0Var3.f18872k;
                                if (c1394f4 != null) {
                                    bVar.a(wVar4, c1394f4);
                                    return;
                                } else {
                                    AbstractC3557B.C2("coroutineScope");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 11:
                    v0 v0Var11 = this.f18640n0;
                    if (v0Var11 != null) {
                        List<LivekitRtc$ConnectionQualityInfo> updatesList = livekitRtc$SignalResponse.getConnectionQuality().getUpdatesList();
                        AbstractC3557B.b0("response.connectionQuality.updatesList", updatesList);
                        F f16 = ((C1503i0) v0Var11).f18778d;
                        if (f16 != null) {
                            r0 r0Var4 = (r0) f16;
                            for (LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo : updatesList) {
                                C1653d c1653d = EnumC1654e.Companion;
                                F1 quality = livekitRtc$ConnectionQualityInfo.getQuality();
                                AbstractC3557B.b0("info.quality", quality);
                                c1653d.getClass();
                                int ordinal2 = quality.ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 != 2) {
                                            if (ordinal2 != 3) {
                                                if (ordinal2 == 4) {
                                                    enumC1654e = EnumC1654e.f20993i0;
                                                } else {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                enumC1654e = EnumC1654e.f20994j0;
                                            }
                                        } else {
                                            enumC1654e = EnumC1654e.f20990Y;
                                        }
                                    } else {
                                        enumC1654e = EnumC1654e.f20991Z;
                                    }
                                } else {
                                    enumC1654e = EnumC1654e.f20992h0;
                                }
                                String participantSid = livekitRtc$ConnectionQualityInfo.getParticipantSid();
                                AbstractC3557B.b0("info.participantSid", participantSid);
                                We.w f17 = r0Var4.f(participantSid);
                                if (f17 != null) {
                                    f17.f21071m.h(enumC1654e, We.w.f21058q[7]);
                                    Te.p pVar = new Te.p(r0Var4, f17, enumC1654e);
                                    C1394f c1394f5 = r0Var4.f18872k;
                                    if (c1394f5 != null) {
                                        r0Var4.f18873l.a(pVar, c1394f5);
                                    } else {
                                        AbstractC3557B.C2("coroutineScope");
                                        throw null;
                                    }
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 12:
                    v0 v0Var12 = this.f18640n0;
                    if (v0Var12 != null) {
                        List<LivekitRtc$StreamStateInfo> streamStatesList = livekitRtc$SignalResponse.getStreamStateUpdate().getStreamStatesList();
                        AbstractC3557B.b0("response.streamStateUpdate.streamStatesList", streamStatesList);
                        F f18 = ((C1503i0) v0Var12).f18778d;
                        if (f18 != null) {
                            r0 r0Var5 = (r0) f18;
                            for (LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo : streamStatesList) {
                                String participantSid2 = livekitRtc$StreamStateInfo.getParticipantSid();
                                AbstractC3557B.b0("streamState.participantSid", participantSid2);
                                We.w f19 = r0Var5.f(participantSid2);
                                if (f19 != null && (b10 = (Xe.B) f19.c().get(livekitRtc$StreamStateInfo.getTrackSid())) != null && (a5 = b10.a()) != null) {
                                    Xe.w wVar5 = Xe.x.Companion;
                                    EnumC4076s3 state = livekitRtc$StreamStateInfo.getState();
                                    AbstractC3557B.b0("streamState.state", state);
                                    wVar5.getClass();
                                    int ordinal3 = state.ordinal();
                                    if (ordinal3 != 0) {
                                        if (ordinal3 != 1) {
                                            if (ordinal3 == 2) {
                                                xVar = Xe.x.f21941h0;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            xVar = Xe.x.f21940Z;
                                        }
                                    } else {
                                        xVar = Xe.x.f21939Y;
                                    }
                                    a5.f21951f.h(xVar, Xe.z.f21945g[0]);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 13:
                    Zd.a aVar = new Zd.a("0.15.1");
                    Zd.a aVar2 = this.f18641o0;
                    if ((aVar2 == null || aVar2.compareTo(aVar) > 0) && (v0Var = this.f18640n0) != null) {
                        LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate = livekitRtc$SignalResponse.getSubscribedQualityUpdate();
                        AbstractC3557B.b0("response.subscribedQualityUpdate", subscribedQualityUpdate);
                        F f20 = ((C1503i0) v0Var).f18778d;
                        if (f20 != null) {
                            We.i iVar3 = ((r0) f20).f18883v;
                            iVar3.getClass();
                            if (iVar3.f21020r) {
                                String trackSid = subscribedQualityUpdate.getTrackSid();
                                List<LivekitRtc$SubscribedCodec> subscribedCodecsList = subscribedQualityUpdate.getSubscribedCodecsList();
                                List<LivekitRtc$SubscribedQuality> subscribedQualitiesList = subscribedQualityUpdate.getSubscribedQualitiesList();
                                Object obj = iVar3.c().get(trackSid);
                                if (obj instanceof C1688j) {
                                    c1688j = (C1688j) obj;
                                } else {
                                    c1688j = null;
                                }
                                if (c1688j != null) {
                                    Xe.z a10 = c1688j.a();
                                    if (a10 instanceof Xe.l) {
                                        lVar = (Xe.l) a10;
                                    } else {
                                        lVar = null;
                                    }
                                    if (lVar != null) {
                                        We.D d11 = c1688j.f21898j;
                                        if (d11 instanceof We.F) {
                                            f6 = (We.F) d11;
                                        } else {
                                            f6 = null;
                                        }
                                        if (f6 != null) {
                                            AbstractC3557B.b0("subscribedCodecs", subscribedCodecsList);
                                            if (!subscribedCodecsList.isEmpty()) {
                                                AbstractC2408g.Companion.getClass();
                                                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                                                    subscribedCodecsList.toString();
                                                    Mi.a.e(new Object[0]);
                                                }
                                                String str4 = lVar.f21903m;
                                                LinkedHashMap linkedHashMap4 = lVar.f21904n;
                                                if (str4 == null && (!subscribedCodecsList.isEmpty())) {
                                                    List<LivekitRtc$SubscribedQuality> qualitiesList = ((LivekitRtc$SubscribedCodec) kf.t.f2(subscribedCodecsList)).getQualitiesList();
                                                    AbstractC3557B.b0("codecs.first().qualitiesList", qualitiesList);
                                                    lVar.g(qualitiesList);
                                                    list = kf.v.f37483Y;
                                                } else {
                                                    ArrayList arrayList = new ArrayList();
                                                    for (LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec : subscribedCodecsList) {
                                                        if (AbstractC3557B.K(lVar.f21903m, livekitRtc$SubscribedCodec.getCodec())) {
                                                            List<LivekitRtc$SubscribedQuality> qualitiesList2 = livekitRtc$SubscribedCodec.getQualitiesList();
                                                            AbstractC3557B.b0("codec.qualitiesList", qualitiesList2);
                                                            lVar.g(qualitiesList2);
                                                        } else {
                                                            try {
                                                                Xe.D d12 = Xe.E.Companion;
                                                                codec = livekitRtc$SubscribedCodec.getCodec();
                                                                AbstractC3557B.b0("codec.codec", codec);
                                                                d12.getClass();
                                                                values = Xe.E.values();
                                                                length = values.length;
                                                            } catch (Exception unused) {
                                                                AbstractC2408g.Companion.getClass();
                                                                if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                                                    livekitRtc$SubscribedCodec.getCodec();
                                                                    Mi.a.f(new Object[0]);
                                                                }
                                                            }
                                                            while (i15 < length) {
                                                                Xe.E e11 = values[i15];
                                                                if (Lg.n.f2(e11.f21854Y, codec)) {
                                                                    AbstractC2408g.Companion.getClass();
                                                                    if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                                                        livekitRtc$SubscribedCodec.getCodec();
                                                                        Mi.a.a(new Object[0]);
                                                                    }
                                                                    Xe.t tVar = (Xe.t) linkedHashMap4.get(e11);
                                                                    if (tVar != null) {
                                                                        rtpSender = tVar.f21933c;
                                                                    } else {
                                                                        rtpSender = null;
                                                                    }
                                                                    if (rtpSender == null) {
                                                                        Iterator<LivekitRtc$SubscribedQuality> it = livekitRtc$SubscribedCodec.getQualitiesList().iterator();
                                                                        while (true) {
                                                                            if (it.hasNext()) {
                                                                                if (it.next().getEnabled()) {
                                                                                    arrayList.add(e11);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                                                            livekitRtc$SubscribedCodec.getCodec();
                                                                            Mi.a.a(new Object[0]);
                                                                        }
                                                                        RtpSender rtpSender2 = tVar.f21933c;
                                                                        AbstractC3557B.Z(rtpSender2);
                                                                        List<LivekitRtc$SubscribedQuality> qualitiesList3 = livekitRtc$SubscribedCodec.getQualitiesList();
                                                                        AbstractC3557B.b0("codec.qualitiesList", qualitiesList3);
                                                                        Xe.l.h(rtpSender2, qualitiesList3);
                                                                    }
                                                                    i15 = 0;
                                                                } else {
                                                                    i15++;
                                                                }
                                                            }
                                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                            break;
                                                        }
                                                    }
                                                    list = arrayList;
                                                }
                                                for (Xe.E e12 : list) {
                                                    if (We.j.f21029a.contains(e12.f21854Y)) {
                                                        AbstractC2408g.Companion.getClass();
                                                        if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                                            e12.toString();
                                                            Mi.a.a(new Object[0]);
                                                        }
                                                        Xe.B b13 = (Xe.B) iVar3.c().get(lVar.f21950e);
                                                        if (b13 == null) {
                                                            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                                                Mi.a.f(new Object[0]);
                                                            }
                                                            linkedHashMap = linkedHashMap4;
                                                        } else {
                                                            C1652c c1652c = f6.f20975o;
                                                            if (c1652c != null) {
                                                                str2 = c1652c.f20987a;
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            String str5 = e12.f21854Y;
                                                            if (str2 != null) {
                                                                if (!AbstractC3557B.K(f6.f20973m, c1652c.f20987a)) {
                                                                    if (!AbstractC3557B.K(str5, c1652c.f20987a) && AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                                                        e12.toString();
                                                                        Mi.a.f(new Object[0]);
                                                                    }
                                                                    linkedHashMap = linkedHashMap4;
                                                                    We.F Q02 = We.F.Q0(f6, c1652c.f20988b, e12.f21854Y, null, null, 245);
                                                                    c3959i = new C3959i(Q02, We.i.k(lVar.e(), Q02));
                                                                    if (c3959i != null) {
                                                                        if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                                                                            Mi.a.c(new Object[0]);
                                                                        }
                                                                    } else {
                                                                        We.F f21 = (We.F) c3959i.f36155Y;
                                                                        List list2 = (List) c3959i.f36156Z;
                                                                        AbstractC3557B.c0("encodings", list2);
                                                                        if (!linkedHashMap.containsKey(e12)) {
                                                                            AbstractC3557B.c0("codec", str5);
                                                                            VideoTrack videoTrack = lVar.f21902l;
                                                                            AbstractC3557B.c0("rtcTrack", videoTrack);
                                                                            ?? obj2 = new Object();
                                                                            obj2.f21931a = str5;
                                                                            obj2.f21932b = videoTrack;
                                                                            obj2.f21933c = null;
                                                                            obj2.f21934d = list2;
                                                                            linkedHashMap.put(e12, obj2);
                                                                            Ad.l.O0(iVar3.f21061c, null, null, new C1655f(iVar3, lVar, new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, AbstractC4344b.F0(iVar3.f21059a), list2), f21, obj2, b13, f6, e12, list2, null), 3);
                                                                        } else {
                                                                            throw new IllegalStateException(e12 + " already added!");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            linkedHashMap = linkedHashMap4;
                                                            c3959i = null;
                                                            if (c3959i != null) {
                                                            }
                                                        }
                                                        linkedHashMap4 = linkedHashMap;
                                                    }
                                                }
                                            }
                                            AbstractC3557B.b0("qualities", subscribedQualitiesList);
                                            if (!subscribedQualitiesList.isEmpty()) {
                                                lVar.g(subscribedQualitiesList);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 14:
                    v0 v0Var13 = this.f18640n0;
                    if (v0Var13 != null) {
                        LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate = livekitRtc$SignalResponse.getSubscriptionPermissionUpdate();
                        AbstractC3557B.b0("response.subscriptionPermissionUpdate", subscriptionPermissionUpdate);
                        F f22 = ((C1503i0) v0Var13).f18778d;
                        if (f22 != null) {
                            String participantSid3 = subscriptionPermissionUpdate.getParticipantSid();
                            AbstractC3557B.b0("subscriptionPermissionUpdate.participantSid", participantSid3);
                            We.w f23 = ((r0) f22).f(participantSid3);
                            if (f23 instanceof We.C) {
                                c10 = (We.C) f23;
                            } else {
                                c10 = null;
                            }
                            if (c10 != null) {
                                Object obj3 = c10.c().get(subscriptionPermissionUpdate.getTrackSid());
                                if (obj3 instanceof Xe.r) {
                                    rVar = (Xe.r) obj3;
                                }
                                if (rVar != null && rVar.f21924o != subscriptionPermissionUpdate.getAllowed()) {
                                    boolean allowed = subscriptionPermissionUpdate.getAllowed();
                                    rVar.f21924o = allowed;
                                    c10.f21062d.a(new Te.l(c10, rVar, allowed), c10.f20964t);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 15:
                    v0 v0Var14 = this.f18640n0;
                    if (v0Var14 != null) {
                        String refreshToken = livekitRtc$SignalResponse.getRefreshToken();
                        AbstractC3557B.b0("response.refreshToken", refreshToken);
                        ((C1503i0) v0Var14).f18784j = refreshToken;
                        return;
                    }
                    return;
                case 16:
                    v0 v0Var15 = this.f18640n0;
                    if (v0Var15 != null) {
                        LivekitRtc$TrackUnpublishedResponse trackUnpublished = livekitRtc$SignalResponse.getTrackUnpublished();
                        AbstractC3557B.b0("response.trackUnpublished", trackUnpublished);
                        F f24 = ((C1503i0) v0Var15).f18778d;
                        if (f24 != null) {
                            We.i iVar4 = ((r0) f24).f18883v;
                            iVar4.getClass();
                            Xe.B b14 = (Xe.B) iVar4.c().get(trackUnpublished.getTrackSid());
                            if (b14 != null) {
                                zVar = b14.a();
                            }
                            if (zVar == null) {
                                AbstractC2408g.Companion.getClass();
                                if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                                    trackUnpublished.getTrackSid();
                                    Mi.a.f(new Object[0]);
                                    return;
                                }
                                return;
                            }
                            iVar4.v(zVar, true);
                            return;
                        }
                        return;
                    }
                    return;
                case 17:
                    Ng.D0 d02 = this.f18628B0;
                    if (d02 != null) {
                        d02.k(null);
                    }
                    this.f18628B0 = null;
                    return;
                case 18:
                    this.f18631E0 = new Date().getTime() - livekitRtc$SignalResponse.getPongResp().getLastPingTimestamp();
                    Ng.D0 d03 = this.f18628B0;
                    if (d03 != null) {
                        d03.k(null);
                    }
                    this.f18628B0 = null;
                    return;
                default:
                    return;
            }
        }
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
    }

    public final void m(int i10, String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
        this.f18637k0 = false;
        v0 v0Var = this.f18640n0;
        if (v0Var != null) {
            C1503i0 c1503i0 = (C1503i0) v0Var;
            if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.c(new Object[0]);
            }
            c1503i0.k();
        }
        this.f18649w0.f();
        this.f18652z0.f();
        Ng.D0 d02 = this.f18627A0;
        if (d02 != null) {
            d02.k(null);
        }
        Ng.D0 d03 = this.f18628B0;
        if (d03 != null) {
            d03.k(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, String str2, Pe.c cVar, Pe.e eVar, AbstractC4825e abstractC4825e) {
        x0 x0Var;
        int i10;
        if (abstractC4825e instanceof x0) {
            x0Var = (x0) abstractC4825e;
            int i11 = x0Var.f18918h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x0Var.f18918h0 = i11 - Integer.MIN_VALUE;
                x0 x0Var2 = x0Var;
                Object obj = x0Var2.f18916Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = x0Var2.f18918h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    x0Var2.f18918h0 = 1;
                    obj = j(str, str2, cVar, eVar, x0Var2);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                AbstractC2406e abstractC2406e = (AbstractC2406e) obj;
                AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.util.Either.Left<livekit.LivekitRtc.JoinResponse>", abstractC2406e);
                return ((C2404c) abstractC2406e).f26611a;
            }
        }
        x0Var = new x0(this, abstractC4825e);
        x0 x0Var22 = x0Var;
        Object obj3 = x0Var22.f18916Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = x0Var22.f18918h0;
        if (i10 == 0) {
        }
        AbstractC2406e abstractC2406e2 = (AbstractC2406e) obj3;
        AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.util.Either.Left<livekit.LivekitRtc.JoinResponse>", abstractC2406e2);
        return ((C2404c) abstractC2406e2).f26611a;
    }

    public final void o() {
        if (this.f18651y0 != null) {
            return;
        }
        synchronized (this.f18650x0) {
            try {
                if (this.f18651y0 == null) {
                    C2071f c2071f = this.f18646t0;
                    if (c2071f != null) {
                        this.f18651y0 = Ad.l.O0(c2071f, null, null, new z0(this, null), 3);
                    } else {
                        AbstractC3557B.C2("coroutineScope");
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, String str2, String str3, AbstractC4825e abstractC4825e) {
        A0 a02;
        int i10;
        if (abstractC4825e instanceof A0) {
            a02 = (A0) abstractC4825e;
            int i11 = a02.f18610h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a02.f18610h0 = i11 - Integer.MIN_VALUE;
                A0 a03 = a02;
                Object obj = a03.f18608Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = a03.f18610h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Pe.c cVar = this.f18643q0;
                    if (cVar == null) {
                        cVar = new Pe.c();
                    }
                    int i12 = cVar.f13958f;
                    AbstractC2469q0.q("protocolVersion", i12);
                    Pe.c cVar2 = new Pe.c(cVar.f13953a, cVar.f13954b, cVar.f13955c, cVar.f13956d, cVar.f13957e, i12);
                    cVar2.f13959g = true;
                    cVar2.f13960h = str3;
                    Pe.e eVar = this.f18644r0;
                    if (eVar == null) {
                        eVar = new Pe.e();
                    }
                    a03.f18610h0 = 1;
                    obj = j(str, str2, cVar2, eVar, a03);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                AbstractC2406e abstractC2406e = (AbstractC2406e) obj;
                AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.util.Either.Right<io.livekit.android.util.Either<livekit.LivekitRtc.ReconnectResponse, kotlin.Unit>>", abstractC2406e);
                return ((C2405d) abstractC2406e).f26612a;
            }
        }
        a02 = new A0(this, abstractC4825e);
        A0 a032 = a02;
        Object obj3 = a032.f18608Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = a032.f18610h0;
        if (i10 == 0) {
        }
        AbstractC2406e abstractC2406e2 = (AbstractC2406e) obj3;
        AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.util.Either.Right<io.livekit.android.util.Either<livekit.LivekitRtc.ReconnectResponse, kotlin.Unit>>", abstractC2406e2);
        return ((C2405d) abstractC2406e2).f26612a;
    }

    public final void q(IceCandidate iceCandidate, EnumC4047m3 enumC4047m3) {
        AbstractC3557B.c0("candidate", iceCandidate);
        String str = iceCandidate.sdp;
        String str2 = iceCandidate.sdpMid;
        int i10 = iceCandidate.sdpMLineIndex;
        AbstractC3557B.b0(SIPServerTransaction.CONTENT_SUBTYPE_SDP, str);
        IceCandidateJSON iceCandidateJSON = new IceCandidateJSON(str, i10, str2);
        K3 newBuilder = LivekitRtc$TrickleRequest.newBuilder();
        AbstractC2904d abstractC2904d = this.f18633Z;
        abstractC2904d.getClass();
        String d10 = abstractC2904d.d(IceCandidateJSON.Companion.serializer(), iceCandidateJSON);
        newBuilder.d();
        LivekitRtc$TrickleRequest.access$16500((LivekitRtc$TrickleRequest) newBuilder.f27507Z, d10);
        newBuilder.d();
        LivekitRtc$TrickleRequest.access$16900((LivekitRtc$TrickleRequest) newBuilder.f27507Z, enumC4047m3);
        C4027i3 newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.d();
        LivekitRtc$SignalRequest.access$800((LivekitRtc$SignalRequest) newBuilder2.f27507Z, (LivekitRtc$TrickleRequest) newBuilder.b());
        s((LivekitRtc$SignalRequest) newBuilder2.b());
    }

    public final void s(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        if (f18625F0.contains(livekitRtc$SignalRequest.getMessageCase())) {
            t(livekitRtc$SignalRequest);
        } else {
            this.f18649w0.g(livekitRtc$SignalRequest);
        }
    }

    public final void t(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        C4138m i10;
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Objects.toString(livekitRtc$SignalRequest);
            Mi.a.e(new Object[0]);
        }
        if (this.f18637k0 && this.f18638l0 != null) {
            C4138m c4138m = C4138m.f36722i0;
            byte[] byteArray = livekitRtc$SignalRequest.toByteArray();
            AbstractC3557B.b0("request.toByteArray()", byteArray);
            i10 = ei.l.i(byteArray, 0, -1234567890);
            Wh.J j6 = this.f18638l0;
            if ((j6 == null || !((C3591f) j6).i(2, i10)) && AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
                livekitRtc$SignalRequest.toString();
                Mi.a.b(new Object[0]);
            }
        } else if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
            Objects.toString(livekitRtc$SignalRequest);
            Mi.a.f(new Object[0]);
        }
    }

    public final void u() {
        if (this.f18627A0 == null && this.f18630D0 != 0) {
            C2071f c2071f = this.f18646t0;
            if (c2071f != null) {
                this.f18627A0 = Ad.l.O0(c2071f, null, null, new B0(this, null), 3);
            } else {
                AbstractC3557B.C2("coroutineScope");
                throw null;
            }
        }
    }

    public final void v() {
        if (this.f18648v0 != null) {
            return;
        }
        synchronized (this.f18647u0) {
            try {
                if (this.f18648v0 == null) {
                    C2071f c2071f = this.f18646t0;
                    if (c2071f != null) {
                        this.f18648v0 = Ad.l.O0(c2071f, null, null, new D0(this, null), 3);
                    } else {
                        AbstractC3557B.C2("coroutineScope");
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
