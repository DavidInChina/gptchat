package m;

import B2.C0206g;
import B2.C0207h;
import E2.C0492y;
import V1.C1468i;
import V1.e0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.auth0.android.provider.AuthenticationActivity;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g5.C3200b;
import h.C3276b;
import h5.C3325c;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import io.sentry.android.core.AbstractC3612c;
import j5.AbstractC3910a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k5.C4180f;
import p2.C5065s;
import p2.g0;
import p2.r0;
import r1.AbstractC5355b;
import s2.AbstractC5530A;
import u3.AbstractC5833f;
import y2.C6502E;
import y2.C6504G;
import y2.C6507J;
import y2.C6510M;
import y2.C6527n;
import y2.SurfaceHolder$CallbackC6500C;
import y2.d0;
import y2.f0;
import y2.h0;
import z2.C6757b;

/* renamed from: m.N  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4517N implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38679Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f38680Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f38681h0;

    public /* synthetic */ RunnableC4517N(Object obj, int i10, Object obj2) {
        this.f38679Y = i10;
        this.f38680Z = obj;
        this.f38681h0 = obj2;
    }

    private final void a() {
        x3.s sVar = (x3.s) this.f38680Z;
        String[] strArr = (String[]) this.f38681h0;
        int i10 = x3.q.f48714b;
        AbstractC3557B.c0("this$0", sVar);
        AbstractC3557B.c0("$tables", strArr);
        x3.n nVar = sVar.f48719b;
        nVar.getClass();
        AbstractC3557B.c0("tables", (String[]) Arrays.copyOf(strArr, strArr.length));
        synchronized (nVar.f48706j) {
            Iterator it = nVar.f48706j.iterator();
            while (true) {
                s.e eVar = (s.e) it;
                if (eVar.hasNext()) {
                    Map.Entry entry = (Map.Entry) eVar.next();
                    AbstractC3557B.b0("(observer, wrapper)", entry);
                    x3.m mVar = (x3.m) entry.getValue();
                    ((x3.p) entry.getKey()).getClass();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        long j6;
        boolean z10;
        boolean z11;
        L2.B b10;
        Handler handler;
        long j10 = -9223372036854775807L;
        boolean z12 = false;
        int i10 = 1;
        switch (this.f38679Y) {
            case 0:
                Runnable runnable = (Runnable) this.f38681h0;
                ((ExecutorC4518O) this.f38680Z).getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 1:
                H0.J.a((H0.O) this.f38680Z, (LongSparseArray) this.f38681h0);
                return;
            case 2:
                ((AbstractC5355b) this.f38680Z).f((Typeface) this.f38681h0);
                return;
            case 3:
                C1468i c1468i = (C1468i) this.f38680Z;
                e0 e0Var = (e0) this.f38681h0;
                AbstractC3557B.c0("$transitionInfo", c1468i);
                AbstractC3557B.c0("$operation", e0Var);
                c1468i.b();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + e0Var + " has completed");
                    return;
                }
                return;
            case 4:
            default:
                com.auth0.android.request.internal.b bVar = (com.auth0.android.request.internal.b) this.f38680Z;
                AbstractC3910a abstractC3910a = (AbstractC3910a) this.f38681h0;
                AbstractC3557B.c0("this$0", bVar);
                com.auth0.android.request.internal.m mVar = bVar.f26723e;
                AbstractC3557B.c0("$callback", abstractC3910a);
                try {
                    mVar.b(new RunnableC4517N(abstractC3910a, 27, bVar.b()));
                    return;
                } catch (C3200b e10) {
                    mVar.b(new RunnableC4517N(abstractC3910a, 28, e10));
                    return;
                }
            case 5:
                W1.e eVar = (W1.e) this.f38681h0;
                W1.b bVar2 = W1.c.f20682a;
                AbstractC3557B.c0("$violation", eVar);
                AbstractC3612c.d("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) this.f38680Z), eVar);
                throw eVar;
            case 6:
                ((I2.e) this.f38681h0).a(((s2.s) this.f38680Z).d());
                return;
            case 7:
                C6504G c6504g = (C6504G) this.f38680Z;
                C6507J c6507j = (C6507J) this.f38681h0;
                int i11 = c6504g.f50344C - c6507j.f50395c;
                c6504g.f50344C = i11;
                if (c6507j.f50396d) {
                    c6504g.f50345D = c6507j.f50397e;
                    c6504g.f50346E = true;
                }
                if (c6507j.f50398f) {
                    c6504g.f50347F = c6507j.f50399g;
                }
                if (i11 == 0) {
                    g0 g0Var = c6507j.f50394b.f50536a;
                    if (!c6504g.f50360W.f50536a.r() && g0Var.r()) {
                        c6504g.f50361X = -1;
                        c6504g.f50362Y = 0L;
                    }
                    if (!g0Var.r()) {
                        List asList = Arrays.asList(((h0) g0Var).f50615p0);
                        if (asList.size() == c6504g.f50376o.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Gi.e.n(z11);
                        for (int i12 = 0; i12 < asList.size(); i12++) {
                            ((C6502E) c6504g.f50376o.get(i12)).f50338b = (g0) asList.get(i12);
                        }
                    }
                    if (c6504g.f50346E) {
                        if (c6507j.f50394b.f50537b.equals(c6504g.f50360W.f50537b) && c6507j.f50394b.f50539d == c6504g.f50360W.f50553r) {
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            if (!g0Var.r() && !c6507j.f50394b.f50537b.b()) {
                                d0 d0Var = c6507j.f50394b;
                                C0492y c0492y = d0Var.f50537b;
                                long j11 = d0Var.f50539d;
                                Object obj = c0492y.f4420a;
                                p2.e0 e0Var2 = c6504g.f50375n;
                                g0Var.i(obj, e0Var2);
                                j10 = j11 + e0Var2.f42026j0;
                            } else {
                                j10 = c6507j.f50394b.f50539d;
                            }
                        }
                        j6 = j10;
                        z10 = i10;
                    } else {
                        j6 = -9223372036854775807L;
                        z10 = false;
                    }
                    c6504g.f50346E = false;
                    c6504g.B(c6507j.f50394b, 1, c6504g.f50347F, z10, c6504g.f50345D, j6, -1);
                    return;
                }
                return;
            case 8:
                f0 f0Var = (f0) this.f38681h0;
                ((C6510M) this.f38680Z).getClass();
                try {
                    C6510M.d(f0Var);
                    return;
                } catch (C6527n e11) {
                    s2.p.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
                    throw new RuntimeException(e11);
                }
            case 9:
                final String str = (String) this.f38681h0;
                int i13 = AbstractC5530A.f45131a;
                z2.w wVar = (z2.w) ((SurfaceHolder$CallbackC6500C) ((U3.l) this.f38680Z).f17424h0).f50334Y.f50379r;
                final C6757b M10 = wVar.M();
                wVar.N(M10, 1012, new s2.m(M10, str, 1) { // from class: z2.n

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51517Y;

                    {
                        this.f51517Y = r3;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51517Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                abstractC6758c.getClass();
                                return;
                        }
                    }
                });
                return;
            case 10:
                C0206g c0206g = (C0206g) this.f38680Z;
                C5065s c5065s = (C5065s) this.f38681h0;
                C0207h c0207h = c0206g.f1779i0;
                if (c0207h.f1797t0 != 0 && !c0206g.f1778h0) {
                    Looper looper = c0207h.f1801x0;
                    looper.getClass();
                    c0206g.f1777Z = c0207h.a(looper, c0206g.f1776Y, c5065s, false);
                    c0207h.f1795r0.add(c0206g);
                    return;
                }
                return;
            case 11:
                E2.N n10 = (E2.N) this.f38680Z;
                L2.B b11 = (L2.B) this.f38681h0;
                if (n10.f4210x0 == null) {
                    b10 = b11;
                } else {
                    b10 = new L2.u(-9223372036854775807L);
                }
                n10.f4178E0 = b10;
                if (b11.j() == -9223372036854775807L && n10.f4179F0 != -9223372036854775807L) {
                    n10.f4178E0 = new E2.I(n10, n10.f4178E0);
                }
                n10.f4179F0 = n10.f4178E0.j();
                if (!n10.f4185L0 && b11.j() == -9223372036854775807L) {
                    z12 = true;
                }
                n10.f4180G0 = z12;
                if (z12) {
                    i10 = 7;
                }
                n10.f4181H0 = i10;
                n10.f4198l0.t(n10.f4179F0, b11.e(), n10.f4180G0);
                if (!n10.f4175B0) {
                    n10.t();
                    return;
                }
                return;
            case 12:
                AbstractC2469q0.p(((C3636c1) this.f38680Z).f34286h0);
                int i14 = F2.a.f5031k;
                throw null;
            case 13:
                ((Gi.e) this.f38680Z).getClass();
                throw null;
            case 14:
                J2.w wVar2 = (J2.w) this.f38680Z;
                wVar2.getClass();
                int i15 = AbstractC5530A.f45131a;
                C6504G c6504g2 = ((SurfaceHolder$CallbackC6500C) wVar2.f8837b).f50334Y;
                c6504g2.getClass();
                c6504g2.f50373l.l(25, new C3276b(9, (r0) this.f38681h0));
                return;
            case 15:
                J2.w wVar3 = (J2.w) this.f38680Z;
                wVar3.getClass();
                int i16 = AbstractC5530A.f45131a;
                z2.w wVar4 = (z2.w) ((SurfaceHolder$CallbackC6500C) wVar3.f8837b).f50334Y.f50379r;
                C6757b M11 = wVar4.M();
                wVar4.N(M11, 1030, new z2.m(M11, (Exception) this.f38681h0, 0));
                return;
            case 16:
                J2.w wVar5 = (J2.w) this.f38680Z;
                final String str2 = (String) this.f38681h0;
                wVar5.getClass();
                int i17 = AbstractC5530A.f45131a;
                z2.w wVar6 = (z2.w) ((SurfaceHolder$CallbackC6500C) wVar5.f8837b).f50334Y.f50379r;
                final C6757b M12 = wVar6.M();
                wVar6.N(M12, 1019, new s2.m(M12, str2, 0) { // from class: z2.n

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51517Y;

                    {
                        this.f51517Y = r3;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51517Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                abstractC6758c.getClass();
                                return;
                        }
                    }
                });
                return;
            case 17:
                Context context = (Context) this.f38681h0;
                ((ProfileInstallerInitializer) this.f38680Z).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = AbstractC5833f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new RunnableC4534n(context, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 18:
                a();
                return;
            case 19:
                Runnable runnable2 = (Runnable) this.f38681h0;
                AbstractC3557B.c0("$command", runnable2);
                AbstractC3557B.c0("this$0", (ExecutorC4518O) this.f38680Z);
                try {
                    runnable2.run();
                    return;
                } finally {
                }
            case 20:
                A8.a aVar = (A8.a) this.f38681h0;
                if (((M3.J) this.f38680Z).f11561u0.f20718Y instanceof W3.a) {
                    aVar.cancel(true);
                    return;
                }
                return;
            case 21:
                N3.d dVar = (N3.d) this.f38680Z;
                M3.w wVar7 = (M3.w) this.f38681h0;
                AbstractC3557B.c0("this$0", dVar);
                AbstractC3557B.c0("$token", wVar7);
                dVar.f12706b.a(wVar7, 3);
                return;
            case 22:
                List<R3.b> list = (List) this.f38680Z;
                S3.f fVar = (S3.f) this.f38681h0;
                AbstractC3557B.c0("$listenersList", list);
                AbstractC3557B.c0("this$0", fVar);
                for (R3.b bVar3 : list) {
                    bVar3.a(fVar.f16120e);
                }
                return;
            case 23:
                V3.r rVar = (V3.r) this.f38680Z;
                W3.i iVar = (W3.i) this.f38681h0;
                if (!(rVar.f18368Y.f20718Y instanceof W3.a)) {
                    iVar.l(rVar.f18371i0.a());
                    return;
                } else {
                    iVar.cancel(true);
                    return;
                }
            case 24:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f38680Z;
                A8.a aVar2 = (A8.a) this.f38681h0;
                AbstractC3557B.c0("this$0", constraintTrackingWorker);
                AbstractC3557B.c0("$innerFuture", aVar2);
                synchronized (constraintTrackingWorker.f25550k0) {
                    try {
                        if (constraintTrackingWorker.f25551l0) {
                            W3.i iVar2 = constraintTrackingWorker.f25552m0;
                            AbstractC3557B.b0("future", iVar2);
                            String str3 = Y3.a.f22098a;
                            iVar2.j(new Object());
                        } else {
                            constraintTrackingWorker.f25552m0.l(aVar2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 25:
                V4.c cVar = (V4.c) this.f38680Z;
                W4.b bVar4 = (W4.b) this.f38681h0;
                AbstractC3557B.c0("this$0", cVar);
                AbstractC3557B.c0("$shaderParams", bVar4);
                wf.k onDrawFrameListener = cVar.getOnDrawFrameListener();
                if (onDrawFrameListener != null) {
                    onDrawFrameListener.invoke(bVar4);
                    return;
                }
                return;
            case 26:
                C4180f c4180f = (C4180f) this.f38680Z;
                C3325c c3325c = (C3325c) this.f38681h0;
                c4180f.getClass();
                AbstractC3557B.c0("error", c3325c);
                AuthenticationActivity authenticationActivity = c4180f.f37062a;
                authenticationActivity.getClass();
                com.google.android.gms.internal.play_billing.N n11 = k5.P.f37058b;
                AbstractC3557B.Z(n11);
                n11.A(c3325c);
                authenticationActivity.finish();
                return;
            case 27:
                AbstractC3910a abstractC3910a2 = (AbstractC3910a) this.f38680Z;
                AbstractC3557B.c0("$callback", abstractC3910a2);
                abstractC3910a2.a(this.f38681h0);
                return;
            case 28:
                AbstractC3910a abstractC3910a3 = (AbstractC3910a) this.f38680Z;
                C3200b c3200b = (C3200b) this.f38681h0;
                AbstractC3557B.c0("$callback", abstractC3910a3);
                AbstractC3557B.c0("$uError", c3200b);
                abstractC3910a3.d(c3200b);
                return;
        }
    }

    public /* synthetic */ RunnableC4517N(ExecutorC4518O executorC4518O, Runnable runnable) {
        this.f38679Y = 19;
        this.f38681h0 = runnable;
        this.f38680Z = executorC4518O;
    }
}
