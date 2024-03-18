package androidx.glance.session;

import Ad.l;
import L3.p;
import L3.q;
import L4.a;
import Ng.AbstractC1073l0;
import Ng.B;
import Ng.C1079o0;
import Ng.D0;
import Ng.Q;
import Qg.F0;
import Qg.s0;
import Sg.u;
import Tg.e;
import X1.b;
import Z.AbstractC1736t;
import Z.AbstractC1746y;
import Z.C1744x;
import Z.E0;
import Z1.C1769k;
import Z1.C1771m;
import Z1.v0;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.play_billing.N;
import g2.AbstractC3155m;
import g2.AbstractC3156n;
import g2.C3137B;
import g2.C3140E;
import g2.C3153k;
import g2.H;
import g2.J;
import g2.L;
import g2.s;
import g2.t;
import g2.w;
import g2.x;
import h0.C3288a;
import io.sentry.android.core.AbstractC3612c;
import java.util.HashMap;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lg2/n;", "sessionManager", "Lg2/J;", "timeouts", "LNg/B;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lg2/n;Lg2/J;LNg/B;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {

    /* renamed from: m0  reason: collision with root package name */
    public final WorkerParameters f25278m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AbstractC3156n f25279n0;

    /* renamed from: o0  reason: collision with root package name */
    public final J f25280o0;

    /* renamed from: p0  reason: collision with root package name */
    public final B f25281p0;

    /* renamed from: q0  reason: collision with root package name */
    public final String f25282q0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionWorker(Context context, WorkerParameters workerParameters, AbstractC3156n abstractC3156n, J j6, B b10, int i10, g gVar) {
        this(context, workerParameters, r3, r4, b10);
        AbstractC3156n abstractC3156n2 = (i10 & 4) != 0 ? s.f31134a : abstractC3156n;
        J j10 = (i10 & 8) != 0 ? new J() : j6;
        if ((i10 & 16) != 0) {
            e eVar = Q.f12904a;
            b10 = u.f16684a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [pf.j, wf.n] */
    /* JADX WARN: Type inference failed for: r1v20, types: [pf.j, wf.n] */
    /* JADX WARN: Type inference failed for: r1v9, types: [pf.j, wf.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(SessionWorker sessionWorker, L l10, AbstractC4825e abstractC4825e) {
        x xVar;
        x xVar2;
        EnumC5000a enumC5000a;
        int i10;
        C3153k c3153k;
        AbstractC1073l0 abstractC1073l0;
        E0 e02;
        AbstractC1736t abstractC1736t;
        C1079o0 c1079o0;
        Object obj;
        Object n02;
        L l11;
        AbstractC3155m abstractC3155m;
        C1744x c1744x;
        Context context;
        C3140E c3140e;
        SessionWorker sessionWorker2 = sessionWorker;
        sessionWorker.getClass();
        if (abstractC4825e instanceof x) {
            xVar = (x) abstractC4825e;
            int i11 = xVar.f31155o0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f31155o0 = i11 - Integer.MIN_VALUE;
                xVar2 = xVar;
                Object obj2 = xVar2.f31153m0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = xVar2.f31155o0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj2);
                                return new p(L3.g.f10714c);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC1736t = (AbstractC1736t) xVar2.f31149i0;
                        e02 = (E0) xVar2.f31148h0;
                        abstractC1073l0 = (AbstractC1073l0) xVar2.f31147Z;
                        c3153k = (C3153k) xVar2.f31146Y;
                        N.B0(obj2);
                        abstractC1736t.dispose();
                        c3153k.c();
                        abstractC1073l0.k(null);
                        c1079o0 = e02.f22484u;
                        obj = y.f36177a;
                        if (c1079o0.b0(obj)) {
                            synchronized (e02.f22466c) {
                                e02.f22480q = true;
                            }
                        }
                        xVar2.f31146Y = null;
                        xVar2.f31147Z = null;
                        xVar2.f31148h0 = null;
                        xVar2.f31149i0 = null;
                        xVar2.f31155o0 = 3;
                        n02 = a.n0(e02.f22483t, new AbstractC5163j(2, null), xVar2);
                        if (n02 == enumC5000a) {
                            obj = n02;
                        }
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return new p(L3.g.f10714c);
                    }
                    C1744x c1744x2 = xVar2.f31152l0;
                    e02 = xVar2.f31151k0;
                    abstractC1073l0 = xVar2.f31150j0;
                    c3153k = (C3153k) xVar2.f31149i0;
                    abstractC3155m = (AbstractC3155m) xVar2.f31148h0;
                    l11 = (L) xVar2.f31147Z;
                    N.B0(obj2);
                    c1744x = c1744x2;
                    sessionWorker2 = (SessionWorker) xVar2.f31146Y;
                } else {
                    N.B0(obj2);
                    AbstractC3155m a5 = ((D5.a) sessionWorker2.f25279n0).a(sessionWorker2.f25282q0);
                    if (a5 == null) {
                        if (sessionWorker2.f25278m0.f25521c != 0) {
                            AbstractC3612c.r("GlanceSessionWorker", "SessionWorker attempted restart but Session is not available for " + sessionWorker2.f25282q0);
                            return new p(L3.g.f10714c);
                        }
                        throw new IllegalStateException(("No session available for key " + sessionWorker2.f25282q0).toString());
                    }
                    C3153k c3153k2 = new C3153k(l10);
                    D0 O02 = l.O0(l10, null, null, new AbstractC5163j(2, null), 3);
                    v0 v0Var = new v0(50);
                    E0 e03 = new E0(l10.f31053Y.i());
                    b bVar = new b(v0Var);
                    Object obj3 = AbstractC1746y.f22769a;
                    C1744x c1744x3 = new C1744x(e03, bVar);
                    c1744x3.n(new C3288a(new C1769k(sessionWorker2.f10725Y, (C1771m) a5, 1), true, -1784282257));
                    F0 c10 = s0.c(Boolean.FALSE);
                    l.O0(l10, c3153k2, null, new g2.y(e03, null), 2);
                    l.O0(l10, null, null, new C3137B(e03, a5, c10, sessionWorker, v0Var, l10, null), 3);
                    ?? abstractC5163j = new AbstractC5163j(2, null);
                    xVar2.f31146Y = sessionWorker2;
                    xVar2.f31147Z = l10;
                    xVar2.f31148h0 = a5;
                    xVar2.f31149i0 = c3153k2;
                    xVar2.f31150j0 = O02;
                    xVar2.f31151k0 = e03;
                    xVar2.f31152l0 = c1744x3;
                    xVar2.f31155o0 = 1;
                    if (a.n0(c10, abstractC5163j, xVar2) != enumC5000a) {
                        c1744x = c1744x3;
                        l11 = l10;
                        abstractC3155m = a5;
                        e02 = e03;
                        c3153k = c3153k2;
                        abstractC1073l0 = O02;
                    } else {
                        return enumC5000a;
                    }
                }
                context = sessionWorker2.f10725Y;
                c3140e = new C3140E(l11, sessionWorker2, c3153k);
                xVar2.f31146Y = c3153k;
                xVar2.f31147Z = abstractC1073l0;
                xVar2.f31148h0 = e02;
                xVar2.f31149i0 = c1744x;
                xVar2.f31150j0 = null;
                xVar2.f31151k0 = null;
                xVar2.f31152l0 = null;
                xVar2.f31155o0 = 2;
                if (abstractC3155m.c(context, c3140e, xVar2) == enumC5000a) {
                    abstractC1736t = c1744x;
                    abstractC1736t.dispose();
                    c3153k.c();
                    abstractC1073l0.k(null);
                    c1079o0 = e02.f22484u;
                    obj = y.f36177a;
                    if (c1079o0.b0(obj)) {
                    }
                    xVar2.f31146Y = null;
                    xVar2.f31147Z = null;
                    xVar2.f31148h0 = null;
                    xVar2.f31149i0 = null;
                    xVar2.f31155o0 = 3;
                    n02 = a.n0(e02.f22483t, new AbstractC5163j(2, null), xVar2);
                    if (n02 == enumC5000a) {
                    }
                    if (obj == enumC5000a) {
                    }
                    return new p(L3.g.f10714c);
                }
                return enumC5000a;
            }
        }
        xVar = new x(sessionWorker2, abstractC4825e);
        xVar2 = xVar;
        Object obj22 = xVar2.f31153m0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = xVar2.f31155o0;
        if (i10 == 0) {
        }
        context = sessionWorker2.f10725Y;
        c3140e = new C3140E(l11, sessionWorker2, c3153k);
        xVar2.f31146Y = c3153k;
        xVar2.f31147Z = abstractC1073l0;
        xVar2.f31148h0 = e02;
        xVar2.f31149i0 = c1744x;
        xVar2.f31150j0 = null;
        xVar2.f31151k0 = null;
        xVar2.f31152l0 = null;
        xVar2.f31155o0 = 2;
        if (abstractC3155m.c(context, c3140e, xVar2) == enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        t tVar;
        int i10;
        q qVar;
        if (abstractC4825e instanceof t) {
            tVar = (t) abstractC4825e;
            int i11 = tVar.f31137h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f31137h0 = i11 - Integer.MIN_VALUE;
                Object obj = tVar.f31135Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = tVar.f31137h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    H h10 = this.f25280o0.f31047d;
                    w wVar = new w(this, null);
                    tVar.f31137h0 = 1;
                    obj = A7.b.W1(h10, tVar, wVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                qVar = (q) obj;
                if (qVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                    L3.g gVar = new L3.g(hashMap);
                    L3.g.b(gVar);
                    return new p(gVar);
                }
                return qVar;
            }
        }
        tVar = new t(this, abstractC4825e);
        Object obj2 = tVar.f31135Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = tVar.f31137h0;
        if (i10 == 0) {
        }
        qVar = (q) obj2;
        if (qVar != null) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final B g() {
        return this.f25281p0;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, s.f31134a, null, null, 24, null);
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, AbstractC3156n abstractC3156n, J j6, B b10) {
        super(context, workerParameters);
        this.f25278m0 = workerParameters;
        this.f25279n0 = abstractC3156n;
        this.f25280o0 = j6;
        this.f25281p0 = b10;
        L3.g gVar = this.f10726Z.f25520b;
        abstractC3156n.getClass();
        Object obj = gVar.f10715a.get("KEY");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            this.f25282q0 = str;
            return;
        }
        throw new IllegalStateException("SessionWorker must be started with a key".toString());
    }
}
