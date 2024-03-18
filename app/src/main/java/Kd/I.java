package Kd;

import Dd.C0382c;
import Dd.C0396q;
import Dd.C0398t;
import Dd.EnumC0401w;
import Dd.N;
import Dd.Q;
import Dd.W;
import Ng.D0;
import Qg.F0;
import Qg.r0;
import Qg.s0;
import Ve.AbstractC1490c;
import Ve.C1488b;
import Ve.C1503i0;
import Ve.C1505j0;
import Ve.C1520z;
import Ve.t0;
import Xe.C1686h;
import Z8.Y0;
import android.app.Application;
import android.content.Context;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Build;
import ce.AbstractC2400f;
import ce.C2396b;
import ce.C2398d;
import cf.AbstractC2408g;
import com.openai.experiment.ExperimentKey;
import e9.C2821n;
import f9.C2957i;
import fa.C2969F;
import g9.C3214e;
import g9.C3221l;
import h9.C3340e;
import i9.C3515g;
import id.AbstractC3557B;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import jf.C3963m;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import ld.C4428a;
import ld.C4429b;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import nf.AbstractC4825e;
import o9.C4953a;
import of.EnumC5000a;
import rb.C5426p;
import wd.C6171F;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: I  reason: collision with root package name */
    public static final boolean f9668I;

    /* renamed from: J  reason: collision with root package name */
    public static final Pe.b f9669J;

    /* renamed from: A  reason: collision with root package name */
    public final r0 f9670A;

    /* renamed from: B  reason: collision with root package name */
    public final Ld.d f9671B;

    /* renamed from: C  reason: collision with root package name */
    public final Ld.e f9672C;

    /* renamed from: D  reason: collision with root package name */
    public final C5426p f9673D;

    /* renamed from: E  reason: collision with root package name */
    public final C5426p f9674E;

    /* renamed from: F  reason: collision with root package name */
    public final F0 f9675F;

    /* renamed from: G  reason: collision with root package name */
    public final F0 f9676G;

    /* renamed from: H  reason: collision with root package name */
    public D0 f9677H;

    /* renamed from: a  reason: collision with root package name */
    public final C4428a f9678a;

    /* renamed from: b  reason: collision with root package name */
    public final com.openai.experiment.t f9679b;

    /* renamed from: c  reason: collision with root package name */
    public final Application f9680c;

    /* renamed from: d  reason: collision with root package name */
    public final Dd.B f9681d;

    /* renamed from: e  reason: collision with root package name */
    public final Q f9682e;

    /* renamed from: f  reason: collision with root package name */
    public final p f9683f;

    /* renamed from: g  reason: collision with root package name */
    public final W f9684g;

    /* renamed from: h  reason: collision with root package name */
    public final C4953a f9685h;

    /* renamed from: i  reason: collision with root package name */
    public final F0 f9686i;

    /* renamed from: j  reason: collision with root package name */
    public final Rg.o f9687j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9688k;

    /* renamed from: l  reason: collision with root package name */
    public final JavaAudioDeviceModule f9689l;

    /* renamed from: m  reason: collision with root package name */
    public final Ve.r0 f9690m;

    /* renamed from: n  reason: collision with root package name */
    public final Pc.g f9691n;

    /* renamed from: o  reason: collision with root package name */
    public final C3963m f9692o;

    /* renamed from: p  reason: collision with root package name */
    public final F0 f9693p;

    /* renamed from: q  reason: collision with root package name */
    public final F0 f9694q;

    /* renamed from: r  reason: collision with root package name */
    public final r0 f9695r;

    /* renamed from: s  reason: collision with root package name */
    public final r0 f9696s;

    /* renamed from: t  reason: collision with root package name */
    public final F0 f9697t;

    /* renamed from: u  reason: collision with root package name */
    public final F0 f9698u;

    /* renamed from: v  reason: collision with root package name */
    public final F0 f9699v;

    /* renamed from: w  reason: collision with root package name */
    public final F0 f9700w;

    /* renamed from: x  reason: collision with root package name */
    public final r0 f9701x;

    /* renamed from: y  reason: collision with root package name */
    public final r0 f9702y;

    /* renamed from: z  reason: collision with root package name */
    public final r0 f9703z;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9668I = z10;
        f9669J = new Pe.b();
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [ce.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16, types: [ce.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [if.a, java.lang.Object, ce.a] */
    public I(C4429b c4429b, C4428a c4428a, com.openai.experiment.t tVar, Application application, Dd.B b10, Q q10, p pVar, W w10, C4953a c4953a) {
        f9.r rVar;
        AbstractC3557B.c0("releaseCompletable", c4429b);
        AbstractC3557B.c0("coroutineScope", c4428a);
        AbstractC3557B.c0("experimentManager", tVar);
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("api", b10);
        AbstractC3557B.c0("voiceSessionObserver", q10);
        AbstractC3557B.c0("broadcastReceiver", pVar);
        AbstractC3557B.c0("settingsRepository", w10);
        AbstractC3557B.c0("dispatcherProvider", c4953a);
        this.f9678a = c4428a;
        this.f9679b = tVar;
        this.f9680c = application;
        this.f9681d = b10;
        this.f9682e = q10;
        this.f9683f = pVar;
        this.f9684g = w10;
        this.f9685h = c4953a;
        F0 c10 = s0.c(null);
        this.f9686i = c10;
        this.f9687j = L4.a.V0(c10, new Q3.h(8, null));
        this.f9688k = ((com.openai.experiment.G) tVar).c(ExperimentKey.VoiceInterruptibilityEnabled.INSTANCE);
        JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(application);
        boolean z10 = f9668I;
        JavaAudioDeviceModule.Builder useHardwareNoiseSuppressor = builder.setUseHardwareAcousticEchoCanceler(z10).setUseHardwareNoiseSuppressor(z10);
        Pe.b bVar = f9669J;
        JavaAudioDeviceModule createAudioDeviceModule = useHardwareNoiseSuppressor.setAudioAttributes(bVar.f13952b).setSamplesReadyCallback(new q(this)).setPlaybackSamplesReadyCallback(new q(this)).createAudioDeviceModule();
        this.f9689l = createAudioDeviceModule;
        Qe.g gVar = new Qe.g(application);
        gVar.f14689c = AbstractC4344b.G0(Wd.d.class, Wd.g.class, Wd.f.class, Wd.e.class);
        gVar.f14688b = new Jb.c(14, this);
        Pe.d dVar = new Pe.d(new Pe.a(bVar, gVar, createAudioDeviceModule), 55);
        Context applicationContext = application.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            AbstractC2408g.Companion.getClass();
            if (AbstractC6708l.b(4, 7) >= 0 && Mi.a.d() > 0) {
                Mi.a.f(new Object[0]);
            }
        }
        AbstractC3557B.b0("ctx", applicationContext);
        Re.e eVar = new Re.e(dVar);
        C3214e c3214e = new C3214e(new Re.f(eVar, 5), 10);
        Object obj = C2396b.f26595c;
        AbstractC2400f a5 = C2396b.a(AbstractC4344b.N(c3214e));
        C3214e c3214e2 = new C3214e(a5, 11);
        j9.g gVar2 = Re.b.f15462d;
        Object obj2 = ce.h.f26602c;
        f9.r N10 = AbstractC4344b.N(gVar2);
        if (!(N10 instanceof ce.h) && !(N10 instanceof C2396b)) {
            ?? obj3 = new Object();
            obj3.f26604b = ce.h.f26602c;
            obj3.f26603a = N10;
            rVar = obj3;
        } else {
            rVar = N10;
        }
        C2398d a10 = C2398d.a(applicationContext);
        f9.r N11 = AbstractC4344b.N(new C3214e(a10, 9));
        if (!(N11 instanceof ce.h) && !(N11 instanceof C2396b)) {
            ?? obj4 = new Object();
            obj4.f26604b = ce.h.f26602c;
            obj4.f26603a = N11;
            N11 = obj4;
        }
        j9.g gVar3 = Re.b.f15460b;
        AbstractC2400f a11 = C2396b.a(AbstractC4344b.N(new C3221l(c3214e2, rVar, a5, gVar3, N11, 1)));
        AbstractC2400f a12 = C2396b.a(AbstractC4344b.N(new C3214e(a10, 8)));
        Re.f fVar = new Re.f(eVar, 0);
        Re.g gVar4 = new Re.g(eVar);
        C3214e c3214e3 = new C3214e(new Re.f(eVar, 2), 7);
        C3214e c3214e4 = new C3214e(c3214e3, 6);
        AbstractC2400f a13 = C2396b.a(AbstractC4344b.N(Re.b.f15463e));
        AbstractC2400f a14 = C2396b.a(AbstractC4344b.N(new C2821n(new Re.f(eVar, 3), c3214e3, a13, C2396b.a(AbstractC4344b.N(new C3214e(Re.b.f15461c, 5))), 7)));
        AbstractC2400f a15 = C2396b.a(AbstractC4344b.N(new Re.n(fVar, gVar4, c3214e4, a10, a13, a14)));
        AbstractC2400f a16 = C2396b.a(AbstractC4344b.N(new C2957i(new Re.f(eVar, 4), a13, 10)));
        Re.o oVar = new Re.o(a16);
        AbstractC2400f a17 = C2396b.a(AbstractC4344b.N(new Re.p(a12, a15, new Re.s(a12, oVar, new Re.f(eVar, 7)), new Re.r(a12, oVar, new Re.f(eVar, 6)), new Re.h(eVar), a13)));
        AbstractC2400f a18 = C2396b.a(AbstractC4344b.N(new C3515g(a11, C2398d.a(new Ve.A(new C1520z(a17))), gVar3, 3)));
        AbstractC2400f a19 = C2396b.a(AbstractC4344b.N(AbstractC1490c.f18734a));
        ?? obj5 = new Object();
        f9.r N12 = AbstractC4344b.N(C2398d.a(new Xe.n(new C1686h(a17, a10, a16, a19, obj5))));
        if (obj5.f26594a == null) {
            obj5.f26594a = N12;
            Ve.s0 s0Var = ((t0) C2398d.a(new t0(new Ve.s0(a18, a16, C2398d.a(new We.l(new We.k(a18, a17, a10, a16, C2398d.a(new Object()), obj5, a19, new Re.q(a17)))), a19, C2396b.a(AbstractC4344b.N(new C3515g(C2396b.a(AbstractC4344b.N(new C3214e(a10, 4))), new Re.f(eVar, 1), c3214e3, 2))), a13, C2398d.a(new Se.d(new y7.b(12, a17))), a14))).f26598a).f18905a;
            final Ve.r0 r0Var = new Ve.r0(applicationContext, (C1503i0) s0Var.f18892a.get(), (EglBase) s0Var.f18893b.get(), (We.l) s0Var.f18894c.get(), (C1488b) s0Var.f18895d.get(), (Ng.B) s0Var.f18896e.get(), (Ng.B) s0Var.f18897f.get(), (Qe.a) s0Var.f18898g.get(), (Ue.a) s0Var.f18899h.get(), (Se.d) s0Var.f18900i.get(), (Qe.h) s0Var.f18901j.get());
            r0Var.f18881t = false;
            r0Var.f18883v.f21020r = false;
            r0Var.f18882u = null;
            this.f9690m = r0Var;
            this.f9691n = Bi.c.i1(Pc.b.f13932j0);
            this.f9692o = R4.b.D1(new zc.u(6, this));
            F0 c11 = s0.c(new C0398t(N.f3525Z, null));
            this.f9693p = c11;
            this.f9694q = c11;
            r0 b11 = s0.b(0, 0, null, 7);
            this.f9695r = b11;
            this.f9696s = b11;
            F0 c12 = s0.c("UNKNOWN");
            this.f9697t = c12;
            this.f9698u = c12;
            F0 c13 = s0.c(C0834j.f9747a);
            this.f9699v = c13;
            this.f9700w = c13;
            r0 b12 = s0.b(0, 0, null, 7);
            this.f9701x = b12;
            this.f9702y = b12;
            r0 b13 = s0.b(0, 0, null, 7);
            this.f9703z = b13;
            this.f9670A = b13;
            this.f9671B = new Ld.d(0.5f);
            this.f9672C = new Ld.e();
            this.f9673D = new C5426p(R4.b.j1(new kotlin.jvm.internal.t(1, r0Var) { // from class: Kd.E

                /* renamed from: Z  reason: collision with root package name */
                public final /* synthetic */ int f9658Z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r0Var, Ve.r0.class, "remoteParticipants", "getRemoteParticipants()Ljava/util/Map;", 0);
                    this.f9658Z = r14;
                    if (r14 != 1) {
                    } else {
                        super(r0Var, Ve.r0.class, "sid", "getSid-CC6JpwI()Ljava/lang/String;", 0);
                    }
                }

                @Override // Df.q
                public final Object get() {
                    String str;
                    switch (this.f9658Z) {
                        case 0:
                            return ((Ve.r0) this.receiver).d();
                        default:
                            Ve.r0 r0Var2 = (Ve.r0) this.receiver;
                            r0Var2.getClass();
                            C1505j0 c1505j0 = (C1505j0) r0Var2.f18875n.d(Ve.r0.f18859C[0]);
                            if (c1505j0 != null) {
                                str = c1505j0.f18804a;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                return null;
                            }
                            return new C1505j0(str);
                    }
                }
            }), 18);
            this.f9674E = new C5426p(R4.b.j1(new kotlin.jvm.internal.t(0, r0Var) { // from class: Kd.E

                /* renamed from: Z  reason: collision with root package name */
                public final /* synthetic */ int f9658Z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r0Var, Ve.r0.class, "remoteParticipants", "getRemoteParticipants()Ljava/util/Map;", 0);
                    this.f9658Z = r14;
                    if (r14 != 1) {
                    } else {
                        super(r0Var, Ve.r0.class, "sid", "getSid-CC6JpwI()Ljava/lang/String;", 0);
                    }
                }

                @Override // Df.q
                public final Object get() {
                    String str;
                    switch (this.f9658Z) {
                        case 0:
                            return ((Ve.r0) this.receiver).d();
                        default:
                            Ve.r0 r0Var2 = (Ve.r0) this.receiver;
                            r0Var2.getClass();
                            C1505j0 c1505j0 = (C1505j0) r0Var2.f18875n.d(Ve.r0.f18859C[0]);
                            if (c1505j0 != null) {
                                str = c1505j0.f18804a;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                return null;
                            }
                            return new C1505j0(str);
                    }
                }
            }), 19);
            F0 c14 = s0.c(null);
            this.f9675F = c14;
            this.f9676G = c14;
            L4.a.E0(L4.a.I0(new r(this, null), r0Var.f18874m.f17185b), this.f9678a);
            L4.a.E0(L4.a.I0(new t(this, null), L4.a.i0(new C5426p(L4.a.I0(new s(this, null), L4.a.i0(c13)), 20))), this.f9678a);
            L4.a.E0(L4.a.I0(new u(this, null), this.f9683f.f9759f), this.f9678a);
            L4.a.E0(new Qg.D(L4.a.I0(new v(this, null), c13), new C3340e(this, null, 1)), this.f9678a);
            c4429b.a(new w(this, null));
            return;
        }
        throw new IllegalStateException();
    }

    public static final void a(I i10, C0398t c0398t) {
        Double d10;
        D0 d02 = i10.f9677H;
        if (d02 != null) {
            d02.k(null);
        }
        x8.W.F(i10.f9691n, "Received new state " + c0398t, null, 6);
        if (c0398t.f3573a == N.f3528j0 && (d10 = c0398t.f3574b) != null) {
            i10.f9677H = Ad.l.O0(i10.f9678a, null, null, new C(i10, d10, c0398t, null), 3);
        } else {
            i10.j(c0398t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Ed.n nVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, AbstractC4825e abstractC4825e) {
        x xVar;
        int i10;
        I i11;
        Vc.x xVar2;
        if (abstractC4825e instanceof x) {
            xVar = (x) abstractC4825e;
            int i12 = xVar.f9776i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                xVar.f9776i0 = i12 - Integer.MIN_VALUE;
                x xVar3 = xVar;
                Object obj = xVar3.f9774Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = xVar3.f9776i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = xVar3.f9773Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    F0 f02 = this.f9699v;
                    if (f02.getValue() instanceof C0833i) {
                        x8.W.F(this.f9691n, "Already connected", null, 6);
                        return yVar;
                    }
                    this.f9686i.setValue(new K(str3, str4, str6, nVar));
                    f02.setValue(C0834j.f9747a);
                    this.f9693p.setValue(new C0398t(N.f3525Z, null));
                    xVar3.f9773Y = this;
                    xVar3.f9776i0 = 1;
                    obj = e(str, str2, str4, str5, str6, z10, xVar3);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    i11 = this;
                }
                xVar2 = (Vc.x) obj;
                if (!(xVar2 instanceof Vc.w)) {
                    Ed.f fVar = (Ed.f) ((Vc.w) xVar2).f18565a;
                    x8.W.M(i11.f9691n, "Connecting to room", null, 6);
                    String str7 = fVar.f4670b;
                    xVar3.f9773Y = null;
                    xVar3.f9776i0 = 2;
                    if (i11.c(str7, fVar.f4671c, fVar.f4672d, xVar3) == enumC5000a) {
                        return enumC5000a;
                    }
                } else if (xVar2 instanceof Vc.r) {
                    Vc.r rVar = (Vc.r) xVar2;
                    i11.f9699v.setValue(l.f9749a);
                } else if (!(xVar2 instanceof Vc.q)) {
                    throw new RuntimeException();
                }
                return yVar;
            }
        }
        xVar = new x(this, abstractC4825e);
        x xVar32 = xVar;
        Object obj2 = xVar32.f9774Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = xVar32.f9776i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        xVar2 = (Vc.x) obj2;
        if (!(xVar2 instanceof Vc.w)) {
        }
        return yVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:2|(2:4|(13:6|8|62|(1:(1:(4:12|13|54|55)(2:15|16))(2:17|18))(10:19|58|20|(1:22)|25|(4:27|56|28|29)|33|60|34|(1:36)(1:37))|38|39|40|(1:42)(1:43)|(1:45)|46|(1:48)|54|55))|7|8|62|(0)(0)|38|39|40|(0)(0)|(0)|46|(0)|54|55|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[Catch: Exception -> 0x0031, TryCatch #3 {Exception -> 0x0031, blocks: (B:13:0x002c, B:18:0x003e, B:38:0x0084, B:40:0x0088, B:42:0x009b, B:46:0x00a2), top: B:62:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, AbstractC4825e abstractC4825e) {
        y yVar;
        EnumC5000a enumC5000a;
        int i10;
        Exception e10;
        K k10;
        I i11;
        C1505j0 c1505j0;
        String str4;
        We.i iVar;
        Ve.r0 r0Var;
        if (abstractC4825e instanceof y) {
            yVar = (y) abstractC4825e;
            int i12 = yVar.f9780i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                yVar.f9780i0 = i12 - Integer.MIN_VALUE;
                Object obj = yVar.f9778Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = yVar.f9780i0;
                kf.w wVar = kf.w.f37484Y;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            I i13 = yVar.f9777Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = yVar.f9777Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    try {
                        K k11 = (K) this.f9686i.getValue();
                        if (k11 != null) {
                            k11.a(Y0.f23303p, wVar);
                        }
                        r0Var = this.f9690m;
                        if (str3 != null) {
                            U3.l lVar = new U3.l();
                            try {
                                L4.a.O0((Se.a) lVar.f17423Z, str3);
                                r0Var.f18882u = lVar;
                            } catch (Exception e11) {
                                e = e11;
                                e10 = e;
                                str = this;
                                k10 = (K) str.f9686i.getValue();
                                if (k10 != null) {
                                    k10.a(Y0.f23304q, wVar);
                                }
                                x8.W.F(str.f9691n, "Failed to connect to webrtc", e10, 4);
                                str.f9699v.setValue(l.f9749a);
                                return jf.y.f36177a;
                            }
                        }
                        yVar.f9777Y = this;
                        yVar.f9780i0 = 1;
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                    try {
                        Df.v[] vVarArr = Ve.r0.f18859C;
                        if (r0Var.b(str, str2, new Pe.c(), yVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        i11 = this;
                    } catch (Exception e13) {
                        e = e13;
                        e10 = e;
                        str = this;
                        k10 = (K) str.f9686i.getValue();
                        if (k10 != null) {
                        }
                        x8.W.F(str.f9691n, "Failed to connect to webrtc", e10, 4);
                        str.f9699v.setValue(l.f9749a);
                        return jf.y.f36177a;
                    }
                }
                Pc.g gVar = i11.f9691n;
                Ve.r0 r0Var2 = i11.f9690m;
                r0Var2.getClass();
                c1505j0 = (C1505j0) r0Var2.f18875n.d(Ve.r0.f18859C[0]);
                if (c1505j0 == null) {
                    str4 = c1505j0.f18804a;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = null;
                }
                x8.W.F(gVar, "Connected to room " + str4, null, 6);
                x8.W.F(i11.f9691n, "Setting microphone enabled", null, 6);
                iVar = r0Var2.f18883v;
                yVar.f9777Y = i11;
                yVar.f9780i0 = 2;
                if (iVar.u(true, yVar) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        yVar = new y(this, abstractC4825e);
        Object obj2 = yVar.f9778Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = yVar.f9780i0;
        kf.w wVar2 = kf.w.f37484Y;
        if (i10 == 0) {
        }
        Pc.g gVar2 = i11.f9691n;
        Ve.r0 r0Var22 = i11.f9690m;
        r0Var22.getClass();
        c1505j0 = (C1505j0) r0Var22.f18875n.d(Ve.r0.f18859C[0]);
        if (c1505j0 == null) {
        }
        if (str4 == null) {
        }
        x8.W.F(gVar2, "Connected to room " + str4, null, 6);
        x8.W.F(i11.f9691n, "Setting microphone enabled", null, 6);
        iVar = r0Var22.f18883v;
        yVar.f9777Y = i11;
        yVar.f9780i0 = 2;
        if (iVar.u(true, yVar) == enumC5000a) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Type inference failed for: r1v5, types: [Ed.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        z zVar;
        int i10;
        I i11;
        K k10;
        Exception e10;
        if (abstractC4825e instanceof z) {
            zVar = (z) abstractC4825e;
            int i12 = zVar.f9784i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zVar.f9784i0 = i12 - Integer.MIN_VALUE;
                Object obj = zVar.f9782Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = zVar.f9784i0;
                Mg.b bVar = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        i11 = zVar.f9781Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                        } catch (Exception e11) {
                            e10 = e11;
                            x8.W.W(i11.f9691n, "Failed to disconnect", e10, null, 4);
                            i11.f9699v.setValue(C0835k.f9748a);
                            i11.f9693p.setValue(new C0398t(N.f3525Z, null));
                            k10 = (K) i11.f9686i.getValue();
                            if (k10 != null) {
                            }
                            i11.f9675F.setValue(bVar);
                            return jf.y.f36177a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Pc.g gVar = this.f9691n;
                    x8.W.F(gVar, "Disconnecting from room", null, 6);
                    try {
                        x8.W.F(gVar, "Setting microphone disabled", null, 6);
                        We.i iVar = this.f9690m.f18883v;
                        zVar.f9781Y = this;
                        zVar.f9784i0 = 1;
                        if (iVar.u(false, zVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        i11 = this;
                    } catch (Exception e12) {
                        e10 = e12;
                        i11 = this;
                        x8.W.W(i11.f9691n, "Failed to disconnect", e10, null, 4);
                        i11.f9699v.setValue(C0835k.f9748a);
                        i11.f9693p.setValue(new C0398t(N.f3525Z, null));
                        k10 = (K) i11.f9686i.getValue();
                        if (k10 != null) {
                        }
                        i11.f9675F.setValue(bVar);
                        return jf.y.f36177a;
                    }
                }
                i11.f9690m.c();
                i11.f9699v.setValue(C0835k.f9748a);
                i11.f9693p.setValue(new C0398t(N.f3525Z, null));
                k10 = (K) i11.f9686i.getValue();
                if (k10 != null) {
                    Yg.p pVar = k10.f9719g;
                    if (pVar != null) {
                        Yg.p.Companion.getClass();
                        bVar = new Mg.b(new Yg.p(AbstractC6463a.n("instant(...)")).b(pVar));
                    }
                    bVar = new Ed.m(bVar, k10.f9713a);
                }
                i11.f9675F.setValue(bVar);
                return jf.y.f36177a;
            }
        }
        zVar = new z(this, abstractC4825e);
        Object obj2 = zVar.f9782Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = zVar.f9784i0;
        Mg.b bVar2 = null;
        if (i10 == 0) {
        }
        i11.f9690m.c();
        i11.f9699v.setValue(C0835k.f9748a);
        i11.f9693p.setValue(new C0398t(N.f3525Z, null));
        k10 = (K) i11.f9686i.getValue();
        if (k10 != null) {
        }
        i11.f9675F.setValue(bVar2);
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028a  */
    /* JADX WARN: Type inference failed for: r0v25, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0271 -> B:63:0x027b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, String str4, String str5, boolean z10, AbstractC4825e abstractC4825e) {
        A a5;
        int i10;
        String str6;
        int i11;
        kotlin.jvm.internal.B b10;
        I i12;
        String str7;
        int i13;
        String str8;
        String str9;
        String str10;
        A a10;
        boolean z11;
        String str11;
        int i14;
        String str12;
        I i15;
        kf.w wVar;
        String str13;
        String str14;
        kotlin.jvm.internal.B b11;
        kotlin.jvm.internal.B b12;
        String str15;
        int i16;
        boolean z12;
        Object obj;
        EnumC5000a enumC5000a;
        I i17;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        kotlin.jvm.internal.B b13;
        int i18;
        int i19;
        int i20;
        C6171F c6171f;
        K k10;
        String str21;
        Ed.c cVar;
        r0 r0Var;
        String str22;
        String str23;
        Ed.c cVar2;
        String str24;
        if (abstractC4825e instanceof A) {
            a5 = (A) abstractC4825e;
            int i21 = a5.f9644t0;
            if ((i21 & Integer.MIN_VALUE) != 0) {
                a5.f9644t0 = i21 - Integer.MIN_VALUE;
                Object obj2 = a5.f9642r0;
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                i10 = a5.f9644t0;
                kf.w wVar2 = kf.w.f37484Y;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    int i22 = a5.f9640p0;
                                    i11 = a5.f9639o0;
                                    boolean z13 = a5.f9638n0;
                                    kotlin.jvm.internal.B b14 = a5.f9636l0;
                                    String str25 = a5.f9635k0;
                                    String str26 = a5.f9634j0;
                                    String str27 = a5.f9633i0;
                                    String str28 = a5.f9632h0;
                                    String str29 = a5.f9631Z;
                                    i12 = a5.f9630Y;
                                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                                    str8 = str27;
                                    i13 = i22;
                                    EnumC5000a enumC5000a3 = enumC5000a2;
                                    boolean z14 = z13;
                                    str6 = str25;
                                    A a11 = a5;
                                    str9 = str28;
                                    b10 = b14;
                                    int i23 = 1;
                                    str7 = str29;
                                    kf.w wVar3 = wVar2;
                                    str10 = str7;
                                    a10 = a11;
                                    wVar2 = wVar3;
                                    z11 = z14;
                                    enumC5000a2 = enumC5000a3;
                                    str11 = str26;
                                    I i24 = i12;
                                    i14 = i13 + i23;
                                    str12 = str6;
                                    i15 = i24;
                                    if (i14 < i11) {
                                        K k11 = (K) i15.f9686i.getValue();
                                        if (k11 != null) {
                                            k11.a(Y0.f23311x, wVar2);
                                        }
                                        a10.f9630Y = i15;
                                        a10.f9631Z = str10;
                                        a10.f9632h0 = str9;
                                        a10.f9633i0 = str8;
                                        a10.f9634j0 = str11;
                                        a10.f9635k0 = str12;
                                        a10.f9636l0 = b10;
                                        a10.f9638n0 = z11;
                                        a10.f9639o0 = i11;
                                        a10.f9640p0 = i14;
                                        a10.f9641q0 = i14;
                                        a10.f9644t0 = 1;
                                        Enum a12 = i15.f9684g.a(a10);
                                        if (a12 == enumC5000a2) {
                                            return enumC5000a2;
                                        }
                                        i17 = i15;
                                        str17 = str9;
                                        a5 = a10;
                                        b13 = b10;
                                        str19 = str11;
                                        i19 = i14;
                                        str20 = str12;
                                        i18 = i11;
                                        str18 = str8;
                                        i20 = i19;
                                        str16 = str10;
                                        obj2 = a12;
                                        String str30 = ((Ed.i) obj2).f4682Y.f52002Y;
                                        if (str20 == null) {
                                            c6171f = new C6171F(str20);
                                        } else {
                                            c6171f = null;
                                        }
                                        k10 = (K) i17.f9686i.getValue();
                                        if (k10 == null) {
                                            str21 = k10.f9713a;
                                        } else {
                                            str21 = null;
                                        }
                                        wVar = wVar2;
                                        cVar = new Ed.c(str30, str18, str16, str17, str19, i17.f9688k, str21, c6171f, ((com.openai.experiment.G) i17.f9679b).c(ExperimentKey.VoiceMessageStreamingEnabled.INSTANCE), z11);
                                        r0Var = i17.f9703z;
                                        a5.f9630Y = i17;
                                        a5.f9631Z = str16;
                                        a5.f9632h0 = str17;
                                        a5.f9633i0 = str18;
                                        a5.f9634j0 = str19;
                                        a5.f9635k0 = str20;
                                        a5.f9636l0 = b13;
                                        a5.f9637m0 = cVar;
                                        a5.f9638n0 = z11;
                                        a5.f9639o0 = i18;
                                        a5.f9640p0 = i19;
                                        a5.f9641q0 = i20;
                                        a5.f9644t0 = 2;
                                        if (r0Var.c(cVar, a5) != enumC5000a2) {
                                            return enumC5000a2;
                                        }
                                        str22 = str18;
                                        str23 = str19;
                                        b12 = b13;
                                        cVar2 = cVar;
                                        str24 = str17;
                                        str6 = str20;
                                        boolean z15 = z11;
                                        Dd.B b15 = i17.f9681d;
                                        a5.f9630Y = i17;
                                        a5.f9631Z = str16;
                                        a5.f9632h0 = str24;
                                        a5.f9633i0 = str22;
                                        a5.f9634j0 = str23;
                                        a5.f9635k0 = str6;
                                        a5.f9636l0 = b12;
                                        a5.f9637m0 = b12;
                                        a5.f9638n0 = z15;
                                        a5.f9639o0 = i18;
                                        a5.f9640p0 = i19;
                                        a5.f9641q0 = i20;
                                        a5.f9644t0 = 3;
                                        b15.getClass();
                                        String str31 = str22;
                                        Dd.A a13 = new Dd.A(b15, cVar2, null);
                                        Df.w a14 = kotlin.jvm.internal.C.a(Ed.f.class);
                                        int i25 = i20;
                                        int i26 = i19;
                                        Je.a n22 = R4.b.n2(Df.H.O(a14), kotlin.jvm.internal.C.f37623a.b(Ed.f.class), a14);
                                        Yc.a aVar = b15.f3503a;
                                        aVar.getClass();
                                        obj2 = x8.W.S(aVar, n22, a13, a5);
                                        if (obj2 != enumC5000a2) {
                                            return enumC5000a2;
                                        }
                                        z12 = z15;
                                        str7 = str16;
                                        i12 = i17;
                                        str14 = str31;
                                        i16 = i25;
                                        str13 = str24;
                                        b11 = b12;
                                        str15 = str23;
                                        i11 = i18;
                                        i13 = i26;
                                        b12.f37622Y = obj2;
                                        obj = b11.f37622Y;
                                        if (!(obj instanceof Vc.w)) {
                                            K k12 = (K) i12.f9686i.getValue();
                                            if (k12 != null) {
                                                k12.a(Y0.f23312y, wVar);
                                            }
                                            return b11.f37622Y;
                                        }
                                        wVar3 = wVar;
                                        if (obj instanceof Vc.r) {
                                            Pc.g gVar = i12.f9691n;
                                            String e10 = android.gov.nist.core.a.e("Failed to get token: attempt ", i16 + 1);
                                            Object obj3 = b11.f37622Y;
                                            enumC5000a = enumC5000a2;
                                            AbstractC3557B.a0("null cannot be cast to non-null type com.openai.network.NetworkResult.Error", obj3);
                                            x8.W.F(gVar, e10, ((Vc.r) obj3).f18561a, 4);
                                            K k13 = (K) i12.f9686i.getValue();
                                            if (k13 != null) {
                                                k13.a(Y0.f23310w, wVar3);
                                            }
                                        } else {
                                            enumC5000a = enumC5000a2;
                                        }
                                        a5.f9630Y = i12;
                                        a5.f9631Z = str7;
                                        a5.f9632h0 = str13;
                                        a5.f9633i0 = str14;
                                        a5.f9634j0 = str15;
                                        a5.f9635k0 = str6;
                                        a5.f9636l0 = b11;
                                        a5.f9637m0 = null;
                                        a5.f9638n0 = z12;
                                        a5.f9639o0 = i11;
                                        a5.f9640p0 = i13;
                                        a5.f9644t0 = 4;
                                        enumC5000a3 = enumC5000a;
                                        if (R4.b.p0(5000L, a5) == enumC5000a3) {
                                            return enumC5000a3;
                                        }
                                        z14 = z12;
                                        b10 = b11;
                                        str8 = str14;
                                        i23 = 1;
                                        String str32 = str15;
                                        a11 = a5;
                                        str9 = str13;
                                        str26 = str32;
                                        str10 = str7;
                                        a10 = a11;
                                        wVar2 = wVar3;
                                        z11 = z14;
                                        enumC5000a2 = enumC5000a3;
                                        str11 = str26;
                                        I i242 = i12;
                                        i14 = i13 + i23;
                                        str12 = str6;
                                        i15 = i242;
                                        if (i14 < i11) {
                                        }
                                    } else {
                                        return b10.f37622Y;
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                i16 = a5.f9641q0;
                                i13 = a5.f9640p0;
                                int i27 = a5.f9639o0;
                                boolean z16 = a5.f9638n0;
                                b12 = (kotlin.jvm.internal.B) a5.f9637m0;
                                kotlin.jvm.internal.B b16 = a5.f9636l0;
                                str6 = a5.f9635k0;
                                String str33 = a5.f9634j0;
                                str14 = a5.f9633i0;
                                str13 = a5.f9632h0;
                                str7 = a5.f9631Z;
                                I i28 = a5.f9630Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj2);
                                wVar = wVar2;
                                str15 = str33;
                                b11 = b16;
                                i11 = i27;
                                i12 = i28;
                                z12 = z16;
                                b12.f37622Y = obj2;
                                obj = b11.f37622Y;
                                if (!(obj instanceof Vc.w)) {
                                }
                            }
                        } else {
                            i20 = a5.f9641q0;
                            i19 = a5.f9640p0;
                            i18 = a5.f9639o0;
                            z11 = a5.f9638n0;
                            cVar2 = (Ed.c) a5.f9637m0;
                            kotlin.jvm.internal.B b17 = a5.f9636l0;
                            String str34 = a5.f9635k0;
                            str23 = a5.f9634j0;
                            String str35 = a5.f9633i0;
                            String str36 = a5.f9632h0;
                            String str37 = a5.f9631Z;
                            i17 = a5.f9630Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            wVar = wVar2;
                            str22 = str35;
                            str24 = str36;
                            str16 = str37;
                            str6 = str34;
                            b12 = b17;
                            boolean z152 = z11;
                            Dd.B b152 = i17.f9681d;
                            a5.f9630Y = i17;
                            a5.f9631Z = str16;
                            a5.f9632h0 = str24;
                            a5.f9633i0 = str22;
                            a5.f9634j0 = str23;
                            a5.f9635k0 = str6;
                            a5.f9636l0 = b12;
                            a5.f9637m0 = b12;
                            a5.f9638n0 = z152;
                            a5.f9639o0 = i18;
                            a5.f9640p0 = i19;
                            a5.f9641q0 = i20;
                            a5.f9644t0 = 3;
                            b152.getClass();
                            String str312 = str22;
                            Dd.A a132 = new Dd.A(b152, cVar2, null);
                            Df.w a142 = kotlin.jvm.internal.C.a(Ed.f.class);
                            int i252 = i20;
                            int i262 = i19;
                            Je.a n222 = R4.b.n2(Df.H.O(a142), kotlin.jvm.internal.C.f37623a.b(Ed.f.class), a142);
                            Yc.a aVar2 = b152.f3503a;
                            aVar2.getClass();
                            obj2 = x8.W.S(aVar2, n222, a132, a5);
                            if (obj2 != enumC5000a2) {
                            }
                        }
                    } else {
                        i20 = a5.f9641q0;
                        i19 = a5.f9640p0;
                        i18 = a5.f9639o0;
                        z11 = a5.f9638n0;
                        b13 = a5.f9636l0;
                        str20 = a5.f9635k0;
                        str19 = a5.f9634j0;
                        str18 = a5.f9633i0;
                        str17 = a5.f9632h0;
                        str16 = a5.f9631Z;
                        I i29 = a5.f9630Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                        i17 = i29;
                        String str302 = ((Ed.i) obj2).f4682Y.f52002Y;
                        if (str20 == null) {
                        }
                        k10 = (K) i17.f9686i.getValue();
                        if (k10 == null) {
                        }
                        wVar = wVar2;
                        cVar = new Ed.c(str302, str18, str16, str17, str19, i17.f9688k, str21, c6171f, ((com.openai.experiment.G) i17.f9679b).c(ExperimentKey.VoiceMessageStreamingEnabled.INSTANCE), z11);
                        r0Var = i17.f9703z;
                        a5.f9630Y = i17;
                        a5.f9631Z = str16;
                        a5.f9632h0 = str17;
                        a5.f9633i0 = str18;
                        a5.f9634j0 = str19;
                        a5.f9635k0 = str20;
                        a5.f9636l0 = b13;
                        a5.f9637m0 = cVar;
                        a5.f9638n0 = z11;
                        a5.f9639o0 = i18;
                        a5.f9640p0 = i19;
                        a5.f9641q0 = i20;
                        a5.f9644t0 = 2;
                        if (r0Var.c(cVar, a5) != enumC5000a2) {
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    ?? obj4 = new Object();
                    obj4.f37622Y = Vc.q.f18560a;
                    i15 = this;
                    str11 = str4;
                    str12 = str5;
                    z11 = z10;
                    b10 = obj4;
                    a10 = a5;
                    i14 = 0;
                    i11 = 3;
                    str10 = str;
                    str9 = str2;
                    str8 = str3;
                    if (i14 < i11) {
                    }
                }
            }
        }
        a5 = new A(this, abstractC4825e);
        Object obj22 = a5.f9642r0;
        EnumC5000a enumC5000a22 = EnumC5000a.f41328Y;
        i10 = a5.f9644t0;
        kf.w wVar22 = kf.w.f37484Y;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|(2:4|(9:6|8|(1:(1:(5:12|31|13|29|30)(2:15|16))(1:17))(2:18|(1:20)(1:21))|22|33|23|(1:25)|29|30))|7|8|(0)(0)|22|33|23|(0)|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        r9 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Dd.K k10, AbstractC4825e abstractC4825e) {
        D d10;
        EnumC5000a enumC5000a;
        int i10;
        I i11;
        We.i iVar;
        byte[] bytes;
        if (abstractC4825e instanceof D) {
            d10 = (D) abstractC4825e;
            int i12 = d10.f9657j0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                d10.f9657j0 = i12 - Integer.MIN_VALUE;
                Object obj = d10.f9655h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = d10.f9657j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            I i13 = d10.f9653Y;
                            try {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                            } catch (Exception e10) {
                                Exception e11 = e10;
                                x8.W.F(i13.f9691n, "Failed to publish message", e11, 4);
                                return jf.y.f36177a;
                            }
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10 = d10.f9654Z;
                    i11 = d10.f9653Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    r0 r0Var = this.f9701x;
                    d10.f9653Y = this;
                    d10.f9654Z = k10;
                    d10.f9657j0 = 1;
                    if (r0Var.c(k10, d10) == enumC5000a) {
                        return enumC5000a;
                    }
                    i11 = this;
                }
                String d11 = md.b.f39132a.d(Dd.K.Companion.serializer(), k10);
                x8.W.F(i11.f9691n, "Publishing message: ".concat(d11), null, 6);
                iVar = i11.f9690m.f18883v;
                bytes = d11.getBytes(Lg.a.f11131a);
                AbstractC3557B.b0("getBytes(...)", bytes);
                d10.f9653Y = i11;
                d10.f9654Z = null;
                d10.f9657j0 = 2;
                if (We.i.q(iVar, bytes, d10) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        d10 = new D(this, abstractC4825e);
        Object obj2 = d10.f9655h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = d10.f9657j0;
        if (i10 == 0) {
        }
        String d112 = md.b.f39132a.d(Dd.K.Companion.serializer(), k10);
        x8.W.F(i11.f9691n, "Publishing message: ".concat(d112), null, 6);
        iVar = i11.f9690m.f18883v;
        bytes = d112.getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("getBytes(...)", bytes);
        d10.f9653Y = i11;
        d10.f9654Z = null;
        d10.f9657j0 = 2;
        if (We.i.q(iVar, bytes, d10) == enumC5000a) {
        }
        return jf.y.f36177a;
    }

    public final Object g(C2969F c2969f, AbstractC4825e abstractC4825e) {
        x8.W.F(this.f9691n, "relayMessage", null, 6);
        EnumC0401w enumC0401w = EnumC0401w.f3578h0;
        Dd.G g10 = Dd.H.Companion;
        Object f6 = f(new Dd.K(enumC0401w, new C0396q(Ad.l.h1(c2969f))), abstractC4825e);
        if (f6 == EnumC5000a.f41328Y) {
            return f6;
        }
        return jf.y.f36177a;
    }

    public final Object h(AbstractC4825e abstractC4825e) {
        x8.W.F(this.f9691n, "Resuming listening", null, 6);
        Object f6 = f(new Dd.K(EnumC0401w.f3577Z, new C0382c(Dd.H.f3515j0)), abstractC4825e);
        if (f6 == EnumC5000a.f41328Y) {
            return f6;
        }
        return jf.y.f36177a;
    }

    public final Object i(AbstractC4825e abstractC4825e) {
        x8.W.F(this.f9691n, "Manually stopping listening intently", null, 6);
        Object f6 = f(new Dd.K(EnumC0401w.f3577Z, new C0382c(Dd.H.f3513h0)), abstractC4825e);
        if (f6 == EnumC5000a.f41328Y) {
            return f6;
        }
        return jf.y.f36177a;
    }

    public final void j(C0398t c0398t) {
        F0 f02;
        Object value;
        Yg.p pVar;
        Set I12 = R4.b.I1(N.f3526h0, N.f3527i0);
        if (this.f9688k) {
            I12.add(N.f3528j0);
        }
        boolean contains = I12.contains(c0398t.f3573a);
        Pc.g gVar = this.f9691n;
        JavaAudioDeviceModule javaAudioDeviceModule = this.f9689l;
        if (contains) {
            x8.W.F(gVar, "Unmuting microphone", null, 6);
            javaAudioDeviceModule.setMicrophoneMute(false);
        } else {
            x8.W.F(gVar, "Muting microphone", null, 6);
            javaAudioDeviceModule.setMicrophoneMute(true);
        }
        K k10 = (K) this.f9686i.getValue();
        if (k10 != null) {
            N n10 = c0398t.f3573a;
            AbstractC3557B.c0("state", n10);
            int ordinal = n10.ordinal();
            if (ordinal != 3) {
                if (ordinal != 5) {
                    if (ordinal == 6 && (pVar = k10.f9721i) != null) {
                        k10.f9721i = null;
                        Yg.p.Companion.getClass();
                        k10.a(Y0.f23301n, P4.a.o0(new C3959i("latency", Long.valueOf(Mg.b.e(new Yg.p(AbstractC6463a.n("instant(...)")).b(pVar))))));
                    }
                } else if (k10.f9721i == null) {
                    Yg.p.Companion.getClass();
                    k10.f9721i = new Yg.p(AbstractC6463a.n("instant(...)"));
                }
            } else if (k10.f9720h == null) {
                Yg.p.Companion.getClass();
                Yg.p pVar2 = new Yg.p(AbstractC6463a.n("instant(...)"));
                k10.f9720h = pVar2;
                long b10 = pVar2.b(k10.f9718f);
                k10.a(Y0.f23300m, P4.a.o0(new C3959i("latency", Long.valueOf(Mg.b.e(b10)))));
                long e10 = Mg.b.e(b10);
                do {
                    f02 = k10.f9722j;
                    value = f02.getValue();
                } while (!f02.e(value, AbstractC4268D.g1((Map) value, new C3959i("First Listening Latency", Long.valueOf(e10)))));
            }
        }
        this.f9693p.setValue(c0398t);
    }
}
