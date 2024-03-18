package We;

import Qg.v0;
import Qg.x0;
import Sg.C1394f;
import Ve.r0;
import cf.C2409h;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$ParticipantPermission;
import rb.C5426p;

/* loaded from: classes2.dex */
public abstract class w {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f21058q;

    /* renamed from: a  reason: collision with root package name */
    public String f21059a;

    /* renamed from: b  reason: collision with root package name */
    public final Ng.B f21060b;

    /* renamed from: c  reason: collision with root package name */
    public C1394f f21061c;

    /* renamed from: d  reason: collision with root package name */
    public final Te.b f21062d;

    /* renamed from: e  reason: collision with root package name */
    public final Te.b f21063e;

    /* renamed from: f  reason: collision with root package name */
    public final C2409h f21064f = R4.b.C0(null, null);

    /* renamed from: g  reason: collision with root package name */
    public final C2409h f21065g;

    /* renamed from: h  reason: collision with root package name */
    public final C2409h f21066h;

    /* renamed from: i  reason: collision with root package name */
    public final C2409h f21067i;

    /* renamed from: j  reason: collision with root package name */
    public final C2409h f21068j;

    /* renamed from: k  reason: collision with root package name */
    public final C2409h f21069k;

    /* renamed from: l  reason: collision with root package name */
    public final C2409h f21070l;

    /* renamed from: m  reason: collision with root package name */
    public final C2409h f21071m;

    /* renamed from: n  reason: collision with root package name */
    public final C2409h f21072n;

    /* renamed from: o  reason: collision with root package name */
    public x f21073o;

    /* renamed from: p  reason: collision with root package name */
    public final C2409h f21074p;

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(w.class, "participantInfo", "getParticipantInfo()Llivekit/LivekitModels$ParticipantInfo;", 0);
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f21058q = new Df.v[]{d10.e(qVar), E9.f.w(w.class, "identity", "getIdentity-4WamZwg()Ljava/lang/String;", 0, d10), E9.f.w(w.class, "audioLevel", "getAudioLevel()F", 0, d10), E9.f.w(w.class, "isSpeaking", "isSpeaking()Z", 0, d10), E9.f.w(w.class, "name", "getName()Ljava/lang/String;", 0, d10), E9.f.w(w.class, "metadata", "getMetadata()Ljava/lang/String;", 0, d10), E9.f.w(w.class, "permissions", "getPermissions()Lio/livekit/android/room/participant/ParticipantPermission;", 0, d10), E9.f.w(w.class, "connectionQuality", "getConnectionQuality()Lio/livekit/android/room/participant/ConnectionQuality;", 0, d10), E9.f.w(w.class, "lastSpokeAt", "getLastSpokeAt()Ljava/lang/Long;", 0, d10), E9.f.w(w.class, "trackPublications", "getTrackPublications()Ljava/util/Map;", 0, d10), d10.g(new kotlin.jvm.internal.u(w.class, "audioTrackPublications", "getAudioTrackPublications()Ljava/util/List;", 0)), d10.g(new kotlin.jvm.internal.u(w.class, "videoTrackPublications", "getVideoTrackPublications()Ljava/util/List;", 0))};
    }

    public w(String str, String str2, Ng.B b10) {
        m mVar;
        AbstractC3557B.c0("coroutineDispatcher", b10);
        this.f21059a = str;
        this.f21060b = b10;
        C1394f g10 = Ad.l.g(b10.plus(Bi.c.z()));
        this.f21061c = Ad.l.g(b10.plus(Bi.c.z()));
        Te.b bVar = new Te.b();
        this.f21062d = bVar;
        this.f21063e = bVar;
        if (str2 != null) {
            mVar = new m(str2);
        } else {
            mVar = null;
        }
        this.f21065g = R4.b.C0(mVar, null);
        this.f21066h = R4.b.C0(Float.valueOf(0.0f), null);
        this.f21067i = R4.b.C0(Boolean.FALSE, new p(this, 0));
        this.f21068j = R4.b.C0(null, new p(this, 2));
        this.f21069k = R4.b.C0(null, new p(this, 1));
        this.f21070l = R4.b.C0(null, new p(this, 3));
        this.f21071m = R4.b.C0(EnumC1654e.f20993i0, null);
        this.f21072n = R4.b.C0(null, null);
        this.f21074p = R4.b.C0(kf.w.f37484Y, null);
        Rg.o V02 = L4.a.V0(new C5426p(R4.b.j1(new kotlin.jvm.internal.t(0, this) { // from class: We.o

            /* renamed from: Z  reason: collision with root package name */
            public final /* synthetic */ int f21042Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, w.class, "trackPublications", "getTrackPublications()Ljava/util/Map;", 0);
                this.f21042Z = r14;
                if (r14 != 1) {
                } else {
                    super(this, w.class, "trackPublications", "getTrackPublications()Ljava/util/Map;", 0);
                }
            }

            @Override // Df.q
            public final Object get() {
                switch (this.f21042Z) {
                    case 0:
                        return ((w) this.receiver).c();
                    default:
                        return ((w) this.receiver).c();
                }
            }
        }), 21), new Q3.h(13, null));
        x0 x0Var = v0.f14935a;
        kf.v vVar = kf.v.f37483Y;
        L4.a.S0(V02, g10, x0Var, vVar);
        L4.a.S0(L4.a.V0(new C5426p(R4.b.j1(new kotlin.jvm.internal.t(1, this) { // from class: We.o

            /* renamed from: Z  reason: collision with root package name */
            public final /* synthetic */ int f21042Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, w.class, "trackPublications", "getTrackPublications()Ljava/util/Map;", 0);
                this.f21042Z = r14;
                if (r14 != 1) {
                } else {
                    super(this, w.class, "trackPublications", "getTrackPublications()Ljava/util/Map;", 0);
                }
            }

            @Override // Df.q
            public final Object get() {
                switch (this.f21042Z) {
                    case 0:
                        return ((w) this.receiver).c();
                    default:
                        return ((w) this.receiver).c();
                }
            }
        }), 22), new Q3.h(13, null)), g10, x0Var, vVar);
    }

    public final void a(Xe.B b10) {
        Xe.z a5 = b10.a();
        if (a5 != null) {
            a5.f21950e = b10.f21844c;
        }
        LinkedHashMap m12 = AbstractC4268D.m1(c());
        m12.put(b10.f21844c, b10);
        h(m12);
    }

    public final String b() {
        m mVar = (m) this.f21065g.d(f21058q[1]);
        if (mVar != null) {
            return mVar.f21040a;
        }
        return null;
    }

    public final Map c() {
        return (Map) this.f21074p.d(f21058q[9]);
    }

    public final void d(Xe.B b10) {
        AbstractC3557B.c0("trackPublication", b10);
        x xVar = this.f21073o;
        if (xVar != null) {
            r0 r0Var = (r0) xVar;
            Te.n nVar = new Te.n(r0Var, b10, this, 0);
            C1394f c1394f = r0Var.f18872k;
            if (c1394f != null) {
                r0Var.f18873l.a(nVar, c1394f);
            } else {
                AbstractC3557B.C2("coroutineScope");
                throw null;
            }
        }
        this.f21062d.a(new Te.h(this, b10, 0), this.f21061c);
    }

    public final void e(Xe.B b10) {
        AbstractC3557B.c0("trackPublication", b10);
        x xVar = this.f21073o;
        if (xVar != null) {
            r0 r0Var = (r0) xVar;
            Te.n nVar = new Te.n(r0Var, b10, this, 2);
            C1394f c1394f = r0Var.f18872k;
            if (c1394f != null) {
                r0Var.f18873l.a(nVar, c1394f);
            } else {
                AbstractC3557B.C2("coroutineScope");
                throw null;
            }
        }
        this.f21062d.a(new Te.h(this, b10, 1), this.f21061c);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(cls2, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type io.livekit.android.room.participant.Participant", obj);
        if (AbstractC3557B.K(this.f21059a, ((w) obj).f21059a)) {
            return true;
        }
        return false;
    }

    public final void f(float f6) {
        Df.v vVar = f21058q[2];
        this.f21066h.h(Float.valueOf(f6), vVar);
    }

    public final void g(boolean z10) {
        Df.v vVar = f21058q[3];
        this.f21067i.h(Boolean.valueOf(z10), vVar);
    }

    public final void h(LinkedHashMap linkedHashMap) {
        this.f21074p.h(linkedHashMap, f21058q[9]);
    }

    public final int hashCode() {
        return this.f21059a.hashCode();
    }

    public void i(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        String sid = livekitModels$ParticipantInfo.getSid();
        AbstractC3557B.b0("info.sid", sid);
        this.f21059a = sid;
        String identity = livekitModels$ParticipantInfo.getIdentity();
        AbstractC3557B.b0("info.identity", identity);
        Df.v[] vVarArr = f21058q;
        Df.v vVar = vVarArr[1];
        this.f21065g.h(new m(identity), vVar);
        this.f21064f.h(livekitModels$ParticipantInfo, vVarArr[0]);
        this.f21069k.h(livekitModels$ParticipantInfo.getMetadata(), vVarArr[5]);
        this.f21068j.h(livekitModels$ParticipantInfo.getName(), vVarArr[4]);
        if (livekitModels$ParticipantInfo.hasPermission()) {
            y yVar = z.Companion;
            LivekitModels$ParticipantPermission permission = livekitModels$ParticipantInfo.getPermission();
            AbstractC3557B.b0("info.permission", permission);
            yVar.getClass();
            this.f21070l.h(new z(permission.getCanPublish(), permission.getCanSubscribe(), permission.getCanPublishData(), permission.getHidden(), permission.getRecorder()), vVarArr[6]);
        }
    }
}
