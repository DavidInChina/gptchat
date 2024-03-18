package Ve;

import G0.C0588q;
import Sg.C1394f;
import We.C1650a;
import We.EnumC1654e;
import Xe.C1682d;
import Xe.C1683e;
import Xe.C1686h;
import Xe.C1687i;
import Xe.C1688j;
import Xe.EnumC1680b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.lifecycle.C2071f;
import cf.AbstractC2408g;
import cf.C2409h;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import jf.C3959i;
import jh.C4027i3;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitRtc$LeaveRequest;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.FrameCryptor;
import livekit.org.webrtc.FrameCryptorAlgorithm;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;
import livekit.org.webrtc.VideoTrack;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5042g;
import z.AbstractC6708l;
import zc.C6821H;

/* loaded from: classes2.dex */
public final class r0 implements F, We.x {

    /* renamed from: C  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f18859C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18862a;

    /* renamed from: b  reason: collision with root package name */
    public final C1503i0 f18863b;

    /* renamed from: c  reason: collision with root package name */
    public final EglBase f18864c;

    /* renamed from: d  reason: collision with root package name */
    public final C1488b f18865d;

    /* renamed from: e  reason: collision with root package name */
    public final Ng.B f18866e;

    /* renamed from: f  reason: collision with root package name */
    public final Ng.B f18867f;

    /* renamed from: g  reason: collision with root package name */
    public final Qe.a f18868g;

    /* renamed from: h  reason: collision with root package name */
    public final Ue.a f18869h;

    /* renamed from: i  reason: collision with root package name */
    public final Se.d f18870i;

    /* renamed from: j  reason: collision with root package name */
    public final Qe.h f18871j;

    /* renamed from: k  reason: collision with root package name */
    public C1394f f18872k;

    /* renamed from: l  reason: collision with root package name */
    public final Te.b f18873l;

    /* renamed from: m  reason: collision with root package name */
    public final Te.b f18874m;

    /* renamed from: s  reason: collision with root package name */
    public Se.c f18880s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f18881t;

    /* renamed from: u  reason: collision with root package name */
    public U3.l f18882u;

    /* renamed from: v  reason: collision with root package name */
    public final We.i f18883v;

    /* renamed from: z  reason: collision with root package name */
    public boolean f18887z;

    /* renamed from: n  reason: collision with root package name */
    public final C2409h f18875n = R4.b.C0(null, null);

    /* renamed from: o  reason: collision with root package name */
    public final C2409h f18876o = R4.b.C0(null, null);

    /* renamed from: p  reason: collision with root package name */
    public final C2409h f18877p = R4.b.C0(k0.f18808h0, new Jb.c(19, this));

    /* renamed from: q  reason: collision with root package name */
    public final C2409h f18878q = R4.b.C0(null, null);

    /* renamed from: r  reason: collision with root package name */
    public final C2409h f18879r = R4.b.C0(Boolean.FALSE, null);

    /* renamed from: w  reason: collision with root package name */
    public final C2409h f18884w = R4.b.C0(kf.w.f37484Y, null);

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f18885x = new LinkedHashMap();

    /* renamed from: y  reason: collision with root package name */
    public final C2409h f18886y = R4.b.C0(kf.v.f37483Y, null);

    /* renamed from: A  reason: collision with root package name */
    public Pe.c f18860A = new Pe.c();

    /* renamed from: B  reason: collision with root package name */
    public final S3.h f18861B = new S3.h(2, this);

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(r0.class, "sid", "getSid-CC6JpwI()Ljava/lang/String;", 0);
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f18859C = new Df.v[]{d10.e(qVar), E9.f.w(r0.class, "name", "getName()Ljava/lang/String;", 0, d10), E9.f.w(r0.class, "state", "getState()Lio/livekit/android/room/Room$State;", 0, d10), E9.f.w(r0.class, "metadata", "getMetadata()Ljava/lang/String;", 0, d10), E9.f.w(r0.class, "isRecording", "isRecording()Z", 0, d10), E9.f.w(r0.class, "mutableRemoteParticipants", "getMutableRemoteParticipants()Ljava/util/Map;", 0, d10), E9.f.w(r0.class, "mutableActiveSpeakers", "getMutableActiveSpeakers()Ljava/util/List;", 0, d10)};
    }

    public r0(Context context, C1503i0 c1503i0, EglBase eglBase, We.l lVar, C1488b c1488b, Ng.B b10, Ng.B b11, Qe.a aVar, Ue.a aVar2, Se.d dVar, Qe.h hVar) {
        AbstractC3557B.c0("engine", c1503i0);
        AbstractC3557B.c0("eglBase", eglBase);
        AbstractC3557B.c0("localParticipantFactory", lVar);
        AbstractC3557B.c0("defaultsManager", c1488b);
        AbstractC3557B.c0("defaultDispatcher", b10);
        AbstractC3557B.c0("ioDispatcher", b11);
        AbstractC3557B.c0("audioHandler", aVar);
        AbstractC3557B.c0("closeableManager", aVar2);
        AbstractC3557B.c0("e2EEManagerFactory", dVar);
        AbstractC3557B.c0("communicationWorkaround", hVar);
        this.f18862a = context;
        this.f18863b = c1503i0;
        this.f18864c = eglBase;
        this.f18865d = c1488b;
        this.f18866e = b10;
        this.f18867f = b11;
        this.f18868g = aVar;
        this.f18869h = aVar2;
        this.f18870i = dVar;
        this.f18871j = hVar;
        Te.b bVar = new Te.b();
        this.f18873l = bVar;
        this.f18874m = bVar;
        c1503i0.f18778d = this;
        We.k kVar = lVar.f21039a;
        We.i iVar = new We.i((C1503i0) kVar.f21030a.get(), (PeerConnectionFactory) kVar.f21031b.get(), (Context) kVar.f21032c.get(), (EglBase) kVar.f21033d.get(), (C1687i) kVar.f21034e.get(), (Xe.n) kVar.f21035f.get(), (C1488b) kVar.f21036g.get(), (Ng.B) kVar.f21037h.get(), (wf.k) kVar.f21038i.get());
        iVar.f21073o = this;
        this.f18883v = iVar;
    }

    public static final Object a(r0 r0Var, Te.w wVar, AbstractC4825e abstractC4825e) {
        Object b10;
        k0 g10 = r0Var.g();
        k0 k0Var = k0.f18807Z;
        jf.y yVar = jf.y.f36177a;
        if (g10 == k0Var && (b10 = r0Var.f18873l.b(wVar, abstractC4825e)) == EnumC5000a.f41328Y) {
            return b10;
        }
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025d  */
    /* JADX WARN: Type inference failed for: r6v12, types: [Se.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, Pe.c cVar, AbstractC4825e abstractC4825e) {
        l0 l0Var;
        EnumC5000a enumC5000a;
        int i10;
        r0 r0Var;
        C3959i c3959i;
        EnumC1680b enumC1680b;
        Pe.e eVar;
        String str3;
        String str4;
        r0 r0Var2;
        C1503i0 c1503i0;
        String str5;
        Pe.e eVar2;
        String str6;
        r0 r0Var3;
        Se.c cVar2;
        r0 r0Var4;
        Map d10;
        Pe.c cVar3 = cVar;
        if (abstractC4825e instanceof l0) {
            l0Var = (l0) abstractC4825e;
            int i11 = l0Var.f18823o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l0Var.f18823o0 = i11 - Integer.MIN_VALUE;
                Object obj = l0Var.f18821m0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = l0Var.f18823o0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar3 = (Pe.c) l0Var.f18815Z;
                            r0Var = l0Var.f18814Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            if (cVar3.f13957e) {
                                We.i iVar = r0Var.f18883v;
                                Xe.m a5 = Xe.m.a(iVar.f21026x.f18730c, null, null, 15);
                                Xe.k kVar = Xe.l.Companion;
                                PeerConnectionFactory peerConnectionFactory = iVar.f21022t;
                                Context context = iVar.f21023u;
                                EglBase eglBase = iVar.f21024v;
                                Xe.n nVar = iVar.f21025w;
                                kVar.getClass();
                                AbstractC3557B.c0("peerConnectionFactory", peerConnectionFactory);
                                AbstractC3557B.c0("context", context);
                                AbstractC3557B.c0("rootEglBase", eglBase);
                                AbstractC3557B.c0("trackFactory", nVar);
                                if (AbstractC5042g.a(context, "android.permission.CAMERA") == 0) {
                                    VideoSource createVideoSource = peerConnectionFactory.createVideoSource(a5.f21908a);
                                    createVideoSource.setVideoProcessor(null);
                                    for (Ze.c cVar4 : kf.t.F2(Ze.g.f23707a, new C0588q(19))) {
                                        if (cVar4.c(context)) {
                                            Ze.i iVar2 = new Ze.i();
                                            CameraEnumerator b10 = cVar4.b(context);
                                            String b11 = Ze.g.b(b10, a5.f21909b, a5.f21910c);
                                            if (b11 == null) {
                                                c3959i = null;
                                            } else {
                                                VideoCapturer d11 = cVar4.d(context, a5, iVar2);
                                                if (b10.isBackFacing(b11)) {
                                                    enumC1680b = EnumC1680b.f21885Z;
                                                } else if (b10.isFrontFacing(b11)) {
                                                    enumC1680b = EnumC1680b.f21884Y;
                                                } else {
                                                    enumC1680b = null;
                                                }
                                                c3959i = new C3959i(d11, Xe.m.a(a5, b11, enumC1680b, 9));
                                            }
                                            if (c3959i == null) {
                                                AbstractC2408g.Companion.getClass();
                                                if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                                    Mi.a.a(new Object[0]);
                                                }
                                                c3959i = null;
                                            }
                                            if (c3959i != null) {
                                                VideoCapturer videoCapturer = (VideoCapturer) c3959i.f36155Y;
                                                Xe.m mVar = (Xe.m) c3959i.f36156Z;
                                                SurfaceTextureHelper create = SurfaceTextureHelper.create("VideoCaptureThread", eglBase.getEglBaseContext());
                                                videoCapturer.initialize(create, context, createVideoSource.getCapturerObserver());
                                                VideoTrack createVideoTrack = peerConnectionFactory.createVideoTrack(UUID.randomUUID().toString(), createVideoSource);
                                                AbstractC3557B.b0("rtcTrack", createVideoTrack);
                                                C1686h c1686h = nVar.f21912a;
                                                Xe.l lVar = new Xe.l(videoCapturer, createVideoSource, "", mVar, createVideoTrack, (PeerConnectionFactory) c1686h.f21893a.get(), (Context) c1686h.f21894b.get(), (EglBase) c1686h.f21895c.get(), (C1488b) c1686h.f21896d.get(), (Xe.n) c1686h.f21897e.get());
                                                Ue.a aVar = lVar.f21907q;
                                                AbstractC3557B.b0("surfaceTextureHelper", create);
                                                Ue.b bVar = new Ue.b(create);
                                                synchronized (aVar) {
                                                    if (aVar.f17714Y) {
                                                        bVar.close();
                                                    } else {
                                                        aVar.f17715Z.put(createVideoTrack, bVar);
                                                    }
                                                }
                                                l0Var.f18814Y = null;
                                                l0Var.f18815Z = null;
                                                l0Var.f18823o0 = 4;
                                                We.i iVar3 = r0Var.f18883v;
                                                We.E e10 = iVar3.f21026x.f18731d;
                                                AbstractC3557B.c0("base", e10);
                                                if (iVar3.s(lVar, new We.F(null, e10.f20965j, e10.f20966k, e10.f20967l, e10.f20968m, e10.f20969n, 0, null), l0Var) == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                return yVar;
                                            }
                                            throw new Lc.l(0);
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                throw new SecurityException("Camera permissions are required to create a camera video track.");
                            }
                            return yVar;
                        }
                        cVar3 = (Pe.c) l0Var.f18815Z;
                        r0Var = l0Var.f18814Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        Object systemService = r0Var.f18862a.getSystemService("connectivity");
                        AbstractC3557B.a0("null cannot be cast to non-null type android.net.ConnectivityManager", systemService);
                        ((ConnectivityManager) systemService).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), r0Var.f18861B);
                        if (cVar3.f13956d) {
                            C1682d m10 = We.i.m(r0Var.f18883v);
                            l0Var.f18814Y = r0Var;
                            l0Var.f18815Z = cVar3;
                            l0Var.f18823o0 = 3;
                            if (We.i.p(r0Var.f18883v, m10, l0Var) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        if (cVar3.f13957e) {
                        }
                    } else {
                        r0 r0Var5 = l0Var.f18820l0;
                        cVar2 = l0Var.f18819k0;
                        Pe.e eVar3 = l0Var.f18818j0;
                        Pe.c cVar5 = l0Var.f18817i0;
                        String str7 = l0Var.f18816h0;
                        str5 = (String) l0Var.f18815Z;
                        r0Var3 = l0Var.f18814Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        r0Var4 = r0Var5;
                        eVar2 = eVar3;
                        cVar3 = cVar5;
                        str6 = str7;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C1394f c1394f = this.f18872k;
                    if (c1394f != null) {
                        Ad.l.P(c1394f, null);
                    }
                    this.f18872k = Ad.l.g(this.f18866e.plus(Bi.c.z()));
                    boolean z10 = this.f18881t;
                    We.i iVar4 = this.f18883v;
                    boolean z11 = iVar4.f21020r;
                    C1488b c1488b = this.f18865d;
                    C1683e c1683e = c1488b.f18728a;
                    Xe.m mVar2 = c1488b.f18730c;
                    C1650a c1650a = c1488b.f18729b;
                    We.E e11 = c1488b.f18731d;
                    U3.l lVar2 = this.f18882u;
                    eVar2 = new Pe.e(z10, z11, lVar2, c1683e, mVar2, c1650a, e11);
                    if (!Ad.l.F0(iVar4.f21061c)) {
                        iVar4.f21061c = Ad.l.g(iVar4.f21060b.plus(Bi.c.z()));
                    }
                    C1394f c1394f2 = this.f18872k;
                    if (c1394f2 != null) {
                        Ad.l.O0(c1394f2, null, null, new n0(this, null), 3);
                        o(k0.f18806Y);
                        this.f18860A = cVar3;
                        if (lVar2 != null) {
                            Se.a aVar2 = (Se.a) lVar2.f17423Z;
                            PeerConnectionFactory peerConnectionFactory2 = (PeerConnectionFactory) ((p000if.a) this.f18870i.f16587a.f50831Z).get();
                            AbstractC3557B.c0("keyProvider", aVar2);
                            AbstractC3557B.c0("peerConnectionFactory", peerConnectionFactory2);
                            ?? obj2 = new Object();
                            obj2.f16583d = new LinkedHashMap();
                            obj2.f16584e = FrameCryptorAlgorithm.AES_GCM;
                            obj2.f16581b = aVar2;
                            obj2.f16582c = peerConnectionFactory2;
                            C6821H c6821h = new C6821H(19, this);
                            l0Var.f18814Y = this;
                            l0Var.f18815Z = str;
                            str6 = str2;
                            l0Var.f18816h0 = str6;
                            l0Var.f18817i0 = cVar3;
                            l0Var.f18818j0 = eVar2;
                            l0Var.f18819k0 = obj2;
                            l0Var.f18820l0 = this;
                            l0Var.f18823o0 = 1;
                            if (!AbstractC3557B.K(obj2.f16580a, this)) {
                                obj2.c();
                            }
                            obj2.f16586g = true;
                            obj2.f16580a = this;
                            obj2.f16585f = c6821h;
                            Map c10 = iVar4.c();
                            if (c10 != null) {
                                for (Map.Entry entry : c10.entrySet()) {
                                    r0 r0Var6 = obj2.f16580a;
                                    AbstractC3557B.Z(r0Var6);
                                    Xe.B b12 = (Xe.B) entry.getValue();
                                    if (b12.a() != null) {
                                        Xe.z a10 = b12.a();
                                        AbstractC3557B.Z(a10);
                                        obj2.a(a10, b12, r0Var6.f18883v, this);
                                    }
                                }
                            }
                            r0 r0Var7 = obj2.f16580a;
                            if (r0Var7 != null && (d10 = r0Var7.d()) != null) {
                                for (Map.Entry entry2 : d10.entrySet()) {
                                    We.C c11 = (We.C) entry2.getValue();
                                    for (Map.Entry entry3 : c11.c().entrySet()) {
                                        Xe.B b13 = (Xe.B) entry3.getValue();
                                        if (b13.a() != null) {
                                            Xe.z a11 = b13.a();
                                            AbstractC3557B.Z(a11);
                                            obj2.b(this, c11, a11, b13);
                                        }
                                    }
                                }
                            }
                            if (yVar == enumC5000a) {
                                return enumC5000a;
                            }
                            r0Var4 = this;
                            r0Var3 = r0Var4;
                            str5 = str;
                            cVar2 = obj2;
                        } else {
                            r0Var2 = this;
                            str4 = str;
                            str3 = str2;
                            eVar = eVar2;
                            c1503i0 = r0Var2.f18863b;
                            l0Var.f18814Y = r0Var2;
                            l0Var.f18815Z = cVar3;
                            l0Var.f18816h0 = null;
                            l0Var.f18817i0 = null;
                            l0Var.f18818j0 = null;
                            l0Var.f18819k0 = null;
                            l0Var.f18820l0 = null;
                            l0Var.f18823o0 = 2;
                            c1503i0.f18799y.close();
                            c1503i0.f18799y = new C2071f(AbstractC4344b.Q0(Bi.c.z(), c1503i0.f18777c), 1);
                            c1503i0.f18783i = str4;
                            c1503i0.f18784j = str3;
                            c1503i0.f18785k = cVar3;
                            c1503i0.f18786l = eVar;
                            if (c1503i0.g(str4, str3, cVar3, eVar, l0Var) == enumC5000a) {
                                return enumC5000a;
                            }
                            r0Var = r0Var2;
                            Object systemService2 = r0Var.f18862a.getSystemService("connectivity");
                            AbstractC3557B.a0("null cannot be cast to non-null type android.net.ConnectivityManager", systemService2);
                            ((ConnectivityManager) systemService2).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), r0Var.f18861B);
                            if (cVar3.f13956d) {
                            }
                            if (cVar3.f13957e) {
                            }
                        }
                    } else {
                        AbstractC3557B.C2("coroutineScope");
                        throw null;
                    }
                }
                r0Var4.f18880s = cVar2;
                r0Var2 = r0Var3;
                str3 = str6;
                eVar = eVar2;
                str4 = str5;
                c1503i0 = r0Var2.f18863b;
                l0Var.f18814Y = r0Var2;
                l0Var.f18815Z = cVar3;
                l0Var.f18816h0 = null;
                l0Var.f18817i0 = null;
                l0Var.f18818j0 = null;
                l0Var.f18819k0 = null;
                l0Var.f18820l0 = null;
                l0Var.f18823o0 = 2;
                c1503i0.f18799y.close();
                c1503i0.f18799y = new C2071f(AbstractC4344b.Q0(Bi.c.z(), c1503i0.f18777c), 1);
                c1503i0.f18783i = str4;
                c1503i0.f18784j = str3;
                c1503i0.f18785k = cVar3;
                c1503i0.f18786l = eVar;
                if (c1503i0.g(str4, str3, cVar3, eVar, l0Var) == enumC5000a) {
                }
            }
        }
        l0Var = new l0(this, abstractC4825e);
        Object obj3 = l0Var.f18821m0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = l0Var.f18823o0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        r0Var4.f18880s = cVar2;
        r0Var2 = r0Var3;
        str3 = str6;
        eVar = eVar2;
        str4 = str5;
        c1503i0 = r0Var2.f18863b;
        l0Var.f18814Y = r0Var2;
        l0Var.f18815Z = cVar3;
        l0Var.f18816h0 = null;
        l0Var.f18817i0 = null;
        l0Var.f18818j0 = null;
        l0Var.f18819k0 = null;
        l0Var.f18820l0 = null;
        l0Var.f18823o0 = 2;
        c1503i0.f18799y.close();
        c1503i0.f18799y = new C2071f(AbstractC4344b.Q0(Bi.c.z(), c1503i0.f18777c), 1);
        c1503i0.f18783i = str4;
        c1503i0.f18784j = str3;
        c1503i0.f18785k = cVar3;
        c1503i0.f18786l = eVar;
        if (c1503i0.g(str4, str3, cVar3, eVar, l0Var) == enumC5000a) {
        }
    }

    public final void c() {
        E0 e02 = this.f18863b.f18775a;
        e02.getClass();
        C4027i3 newBuilder = LivekitRtc$SignalRequest.newBuilder();
        newBuilder.d();
        LivekitRtc$SignalRequest.access$2300((LivekitRtc$SignalRequest) newBuilder.f27507Z, (LivekitRtc$LeaveRequest) LivekitRtc$LeaveRequest.newBuilder().b());
        e02.s((LivekitRtc$SignalRequest) newBuilder.b());
        h(2);
    }

    public final Map d() {
        return (Map) this.f18884w.d(f18859C[5]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final synchronized We.C e(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo, String str) {
        ?? obj = new Object();
        Object obj2 = d().get(new We.m(str));
        obj.f37622Y = obj2;
        if (obj2 != null) {
            return (We.C) obj2;
        }
        We.C c10 = new We.C(livekitModels$ParticipantInfo, this.f18863b.f18775a, this.f18867f, this.f18866e);
        obj.f37622Y = c10;
        c10.f21073o = this;
        C1394f c1394f = this.f18872k;
        if (c1394f != null) {
            Ad.l.O0(c1394f, null, null, new p0(obj, this, null), 3);
            ((We.C) obj.f37622Y).i(livekitModels$ParticipantInfo);
            LinkedHashMap m12 = AbstractC4268D.m1(d());
            m12.put(new We.m(str), obj.f37622Y);
            this.f18884w.h(m12, f18859C[5]);
            this.f18885x.put(new We.n(((We.C) obj.f37622Y).f21059a), new We.m(str));
            return (We.C) obj.f37622Y;
        }
        AbstractC3557B.C2("coroutineScope");
        throw null;
    }

    public final We.w f(String str) {
        AbstractC3557B.c0("sid", str);
        We.i iVar = this.f18883v;
        if (AbstractC3557B.K(str, iVar.f21059a)) {
            return iVar;
        }
        return (We.w) d().get(this.f18885x.get(new We.n(str)));
    }

    public final k0 g() {
        return (k0) this.f18877p.d(f18859C[2]);
    }

    public final void h(int i10) {
        k0 g10 = g();
        k0 k0Var = k0.f18808h0;
        if (g10 == k0Var) {
            return;
        }
        try {
            Object systemService = this.f18862a.getSystemService("connectivity");
            AbstractC3557B.a0("null cannot be cast to non-null type android.net.ConnectivityManager", systemService);
            ((ConnectivityManager) systemService).unregisterNetworkCallback(this.f18861B);
        } catch (IllegalArgumentException unused) {
        }
        o(k0Var);
        Se.c cVar = this.f18880s;
        if (cVar != null) {
            cVar.c();
        }
        this.f18880s = null;
        We.i iVar = this.f18883v;
        iVar.j();
        for (We.m mVar : kf.t.O2(d().keySet())) {
            i(mVar.f21040a);
        }
        n(null);
        Df.v[] vVarArr = f18859C;
        this.f18878q.h(null, vVarArr[3]);
        this.f18876o.h(null, vVarArr[1]);
        Df.v vVar = vVarArr[4];
        this.f18879r.h(Boolean.FALSE, vVar);
        this.f18885x.clear();
        D d10 = C1503i0.Companion;
        this.f18863b.b("Normal Closure");
        iVar.j();
        Ad.l.P(iVar.f21061c, null);
        iVar.f21059a = "";
        Df.v[] vVarArr2 = We.w.f21058q;
        iVar.f21068j.h(null, vVarArr2[4]);
        iVar.f21065g.h(null, vVarArr2[1]);
        iVar.f21069k.h(null, vVarArr2[5]);
        iVar.f21064f.h(null, vVarArr2[0]);
        iVar.f21070l.h(null, vVarArr2[6]);
        iVar.f21071m.h(EnumC1654e.f20993i0, vVarArr2[7]);
        Ad.l.b1(new q0(this, i10, null));
        C1394f c1394f = this.f18872k;
        if (c1394f != null) {
            Ad.l.P(c1394f, null);
        } else {
            AbstractC3557B.C2("coroutineScope");
            throw null;
        }
    }

    public final void i(String str) {
        LinkedHashMap m12 = AbstractC4268D.m1(d());
        We.C c10 = (We.C) m12.remove(new We.m(str));
        if (c10 == null) {
            return;
        }
        for (Xe.B b10 : kf.t.K2(c10.c().values())) {
            c10.k(b10.f21844c);
        }
        this.f18884w.h(m12, f18859C[5]);
        Te.s sVar = new Te.s(this, c10);
        C1394f c1394f = this.f18872k;
        if (c1394f != null) {
            this.f18873l.a(sVar, c1394f);
        } else {
            AbstractC3557B.C2("coroutineScope");
            throw null;
        }
    }

    public final boolean j() {
        return ((Boolean) this.f18879r.d(f18859C[4])).booleanValue();
    }

    public final void k(int i10) {
        AbstractC2469q0.q("reason", i10);
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
        h(i10);
    }

    public final void l() {
        We.i iVar = this.f18883v;
        List<C1688j> K22 = kf.t.K2(iVar.n());
        if (iVar.f21028z == null) {
            iVar.f21028z = K22;
        }
        LinkedHashMap m12 = AbstractC4268D.m1(iVar.c());
        m12.clear();
        iVar.h(m12);
        for (C1688j c1688j : K22) {
            We.x xVar = iVar.f21073o;
            if (xVar != null) {
                ((r0) xVar).m(iVar, c1688j);
            }
            iVar.f21062d.a(new Te.d(iVar, c1688j, 1), iVar.f21061c);
        }
        for (We.m mVar : kf.t.O2(d().keySet())) {
            i(mVar.f21040a);
        }
    }

    public final void m(We.i iVar, C1688j c1688j) {
        We.m mVar;
        We.m mVar2;
        AbstractC3557B.c0("publication", c1688j);
        AbstractC3557B.c0("participant", iVar);
        Se.c cVar = this.f18880s;
        if (cVar != null) {
            AbstractC3557B.Z(c1688j.a());
            String str = c1688j.f21844c;
            String b10 = iVar.b();
            LinkedHashMap linkedHashMap = cVar.f16583d;
            if (b10 != null) {
                mVar = new We.m(b10);
            } else {
                mVar = null;
            }
            FrameCryptor frameCryptor = (FrameCryptor) linkedHashMap.get(new C3959i(str, mVar));
            if (frameCryptor != null) {
                frameCryptor.setEnabled(false);
                frameCryptor.dispose();
                if (b10 != null) {
                    mVar2 = new We.m(b10);
                } else {
                    mVar2 = null;
                }
                C3959i c3959i = new C3959i(str, mVar2);
                Ad.l.I(linkedHashMap);
                linkedHashMap.remove(c3959i);
            }
        }
        Te.n nVar = new Te.n(this, c1688j, iVar, 3);
        C1394f c1394f = this.f18872k;
        if (c1394f != null) {
            this.f18873l.a(nVar, c1394f);
        } else {
            AbstractC3557B.C2("coroutineScope");
            throw null;
        }
    }

    public final void n(String str) {
        C1505j0 c1505j0;
        Df.v vVar = f18859C[0];
        if (str != null) {
            c1505j0 = new C1505j0(str);
        } else {
            c1505j0 = null;
        }
        this.f18875n.h(c1505j0, vVar);
    }

    public final void o(k0 k0Var) {
        this.f18877p.h(k0Var, f18859C[2]);
    }
}
