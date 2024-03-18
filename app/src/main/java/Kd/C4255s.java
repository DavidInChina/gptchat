package kd;

import Df.H;
import Ng.Q;
import Pg.EnumC1170c;
import Qg.F0;
import Qg.r0;
import Qg.s0;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import dd.AbstractC2625a;
import id.AbstractC3557B;
import j$.time.Clock;
import j$.time.Instant;
import jd.AbstractC3949a;
import jf.C3961k;
import nd.AbstractC4815d;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import x8.W;

/* renamed from: kd.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4255s implements AbstractC4815d, AbstractC3949a {

    /* renamed from: h  reason: collision with root package name */
    public static final long f37345h = H.x0(30, Mg.d.f12134i0);

    /* renamed from: i  reason: collision with root package name */
    public static final long f37346i = H.x0(10, Mg.d.f12135j0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f37347j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2625a f37348a;

    /* renamed from: b  reason: collision with root package name */
    public final C4241e f37349b;

    /* renamed from: c  reason: collision with root package name */
    public final com.openai.experiment.t f37350c;

    /* renamed from: d  reason: collision with root package name */
    public final bd.d f37351d;

    /* renamed from: e  reason: collision with root package name */
    public final ge.d f37352e;

    /* renamed from: f  reason: collision with root package name */
    public final F0 f37353f = s0.c(null);

    /* renamed from: g  reason: collision with root package name */
    public final r0 f37354g = s0.a(0, 16, EnumC1170c.f14193Z);

    static {
        Mg.a aVar = Mg.b.f12127Z;
    }

    public C4255s(AbstractC2625a abstractC2625a, C4241e c4241e, com.openai.experiment.t tVar, bd.d dVar, ge.d dVar2) {
        this.f37348a = abstractC2625a;
        this.f37349b = c4241e;
        this.f37350c = tVar;
        this.f37351d = dVar;
        this.f37352e = dVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:2|(2:4|(6:6|8|34|(1:(1:(1:(6:13|28|30|(1:32)|25|33)(2:15|16))(3:17|25|33))(1:18))(2:19|(1:36))|21|(4:23|(1:37)|25|33)(7:26|(1:38)|28|30|(0)|25|33)))|7|8|34|(0)(0)|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
        r8 = com.google.android.gms.internal.play_billing.N.w(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: all -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:26:0x0074), top: B:34:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C4255s c4255s, AbstractC4825e abstractC4825e) {
        C4253q c4253q;
        Object obj;
        int i10;
        Throwable a5;
        c4255s.getClass();
        if (abstractC4825e instanceof C4253q) {
            c4253q = (C4253q) abstractC4825e;
            int i11 = c4253q.f37342i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4253q.f37342i0 = i11 - Integer.MIN_VALUE;
                obj = c4253q.f37340Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4253q.f37342i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                Object obj2 = yVar;
                                a5 = C3961k.a(obj2);
                                if (a5 != null) {
                                    W.W(Pc.e.a(), "Failed to register websocket after exponential backoff", a5, null, 4);
                                }
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj);
                        return yVar;
                    }
                    c4255s = c4253q.f37339Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    ExperimentKey.WebSocketOnForegroundEnabled webSocketOnForegroundEnabled = ExperimentKey.WebSocketOnForegroundEnabled.INSTANCE;
                    c4253q.f37339Y = c4255s;
                    c4253q.f37342i0 = 1;
                    G g10 = (G) c4255s.f37350c;
                    g10.getClass();
                    obj = G.d(g10, webSocketOnForegroundEnabled, c4253q);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    F0 f02 = c4255s.f37353f;
                    c4253q.f37339Y = null;
                    c4253q.f37342i0 = 2;
                    f02.setValue(null);
                    if (yVar == enumC5000a) {
                        return enumC5000a;
                    }
                    return yVar;
                }
                bd.d dVar = c4255s.f37351d;
                C4254r c4254r = new C4254r(c4255s, null);
                c4253q.f37339Y = null;
                c4253q.f37342i0 = 3;
                if (K8.d.M0(dVar, 0, c4254r, c4253q, 15) == enumC5000a) {
                    return enumC5000a;
                }
                Object obj22 = yVar;
                a5 = C3961k.a(obj22);
                if (a5 != null) {
                }
                return yVar;
            }
        }
        c4253q = new C4253q(c4255s, abstractC4825e);
        obj = c4253q.f37340Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4253q.f37342i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    @Override // nd.AbstractC4815d
    public final Object b(AbstractC4825e abstractC4825e) {
        Object e02 = Ad.l.e0(new C4250n(this, null), abstractC4825e);
        if (e02 == EnumC5000a.f41328Y) {
            return e02;
        }
        return jf.y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }

    public final synchronized void e(String str, Yg.p pVar) {
        AbstractC3557B.c0("url", str);
        AbstractC3557B.c0("expiresAt", pVar);
        C4243g c4243g = (C4243g) this.f37353f.getValue();
        if (c4243g != null) {
            String str2 = c4243g.f37303a;
            Yg.p pVar2 = c4243g.f37304b;
            Uri parse = Uri.parse(str2);
            Uri parse2 = Uri.parse(str);
            Yg.p.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            AbstractC3557B.b0("instant(...)", instant);
            Yg.p pVar3 = new Yg.p(instant);
            AbstractC3557B.Z(parse);
            AbstractC3557B.Z(parse2);
            if (AbstractC3557B.K(parse.getScheme(), parse2.getScheme()) && AbstractC3557B.K(parse.getAuthority(), parse2.getAuthority()) && AbstractC3557B.K(parse.getHost(), parse2.getHost()) && AbstractC3557B.K(parse.getPath(), parse2.getPath()) && Mg.b.c(pVar2.b(pVar3), f37346i) > 0) {
                return;
            }
        }
        this.f37353f.setValue(new C4243g(str, pVar));
    }
}
