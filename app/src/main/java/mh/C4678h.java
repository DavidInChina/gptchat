package mh;

import Z.AbstractC1710f0;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import l0.AbstractC4313e;
import oh.C5014a;
import oh.C5020g;
import oh.C5022i;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;
import z.C6678S;

/* renamed from: mh.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4678h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39445Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f39446Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f39447h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4678h(Object obj, int i10, Object obj2) {
        super(1);
        this.f39445Y = i10;
        this.f39446Z = obj;
        this.f39447h0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [Hi.a, Hi.b] */
    public final Hi.c a(Hi.c cVar) {
        int i10 = this.f39445Y;
        Object obj = this.f39447h0;
        Object obj2 = this.f39446Z;
        switch (i10) {
            case 5:
                AbstractC3557B.c0("appStart", cVar);
                SystemClock.uptimeMillis();
                MotionEvent motionEvent = (MotionEvent) obj2;
                motionEvent.getEventTime();
                String str = (String) obj;
                AbstractC3557B.b0("activityClassName", str);
                motionEvent.getRawX();
                motionEvent.getRawY();
                return Hi.c.a(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, new Hi.b(str), -536870913);
            default:
                AbstractC3557B.c0("appStart", cVar);
                SystemClock.uptimeMillis();
                return (Hi.c) ((wf.n) obj).invoke(cVar, new Hi.b((String) obj2));
        }
    }

    public final Z.M c(Z.N n10) {
        int i10 = this.f39445Y;
        Object obj = this.f39447h0;
        Object obj2 = this.f39446Z;
        switch (i10) {
            case 1:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                return new C6678S((C4663H) obj2, 12, (AbstractC1710f0) obj);
            case 2:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                C4663H c4663h = (C4663H) obj2;
                P p10 = c4663h.f39404a;
                AbstractC3557B.a0("null cannot be cast to non-null type me.saket.telephoto.zoomable.RealZoomableState", p10);
                ((C4686p) p10).f39494n.setValue((C5020g) obj);
                return new x(c4663h, 0);
            default:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                C4663H c4663h2 = (C4663H) obj2;
                c4663h2.f39407d.setValue((kh.m) obj);
                return new x(c4663h2, 1);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        float f10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39445Y;
        Object obj2 = this.f39447h0;
        Object obj3 = this.f39446Z;
        switch (i10) {
            case 0:
                long j6 = ((C5251c) obj).f43623a;
                C4686p c4686p = (C4686p) obj3;
                long d10 = c4686p.h().d();
                C4672b c4672b = (C4672b) obj2;
                AbstractC3557B.c0("zoom", c4672b);
                C5252d K10 = A7.b.K(j6, androidx.compose.ui.layout.a.m(d10, c4672b.b()));
                long d11 = K10.d();
                long j10 = C5254f.f43638c;
                if (d11 != j10) {
                    long e10 = c4686p.e();
                    AbstractC4313e abstractC4313e = (AbstractC4313e) c4686p.f39485e.getValue();
                    Z0.l lVar = (Z0.l) c4686p.f39489i.getValue();
                    AbstractC3557B.c0("alignment", abstractC4313e);
                    AbstractC3557B.c0("layoutDirection", lVar);
                    if (e10 != j10) {
                        AbstractC3957g C12 = R4.b.C1(EnumC3958h.f36153Z, new C5014a(e10, abstractC4313e, K10, lVar));
                        K10.e();
                        if (K10.f() >= C5254f.d(e10)) {
                            f6 = com.google.android.gms.internal.play_billing.N.o(C5251c.d(K10.e()), com.google.android.gms.internal.play_billing.N.l(C5254f.d(e10) - K10.f(), 0.0f), 0.0f);
                        } else {
                            f6 = (int) (((Z0.i) C12.getValue()).f22799a >> 32);
                        }
                        if (K10.c() >= C5254f.b(e10)) {
                            f10 = com.google.android.gms.internal.play_billing.N.o(C5251c.e(K10.e()), com.google.android.gms.internal.play_billing.N.l(C5254f.b(e10) - K10.c(), 0.0f), 0.0f);
                        } else {
                            f10 = (int) (((Z0.i) C12.getValue()).f22799a & 4294967295L);
                        }
                        int i11 = C5251c.f43622e;
                        return new C5251c(R4.b.r(f6, f10));
                    }
                    throw new IllegalStateException("Whoops Modifier.zoomable() is not supposed to handle gestures yet. Please file an issue on https://github.com/saket/telephoto/issues?".toString());
                }
                throw new IllegalStateException("The zoomable content is too large to safely calculate its draw region. This can happen if you're using an unusually large value for ZoomSpec#maxZoomFactor (for e.g., Float.MAX_VALUE). Please file an issue on https://github.com/saket/telephoto/issues if you think this is a mistake.".toString());
            case 1:
                return c((Z.N) obj);
            case 2:
                return c((Z.N) obj);
            case 3:
                return c((Z.N) obj);
            case 4:
                B0.u uVar = (B0.u) obj;
                AbstractC3557B.c0("drag", uVar);
                ((wf.k) obj3).invoke(new C5022i(((B0.u) obj2).f1672c, com.google.android.gms.internal.play_billing.N.o((C5251c.e(r9.y.Q0(uVar, false)) * 0.004f) + 1.0f, 0.1f, 2.0f)));
                uVar.a();
                return yVar;
            case 5:
                return a((Hi.c) obj);
            case 6:
                MotionEvent motionEvent = (MotionEvent) obj;
                AbstractC3557B.c0("motionEvent", motionEvent);
                Ii.A a5 = (Ii.A) obj3;
                if (!a5.f8618n0) {
                    a5.f8618n0 = true;
                    a5.f8610Y.invoke(new C4678h(motionEvent, 5, ((Activity) obj2).getClass().getName()));
                }
                return yVar;
            case 7:
                return a((Hi.c) obj);
            default:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                AbstractC3557B.c0("viewTreeObserver", viewTreeObserver);
                Ii.I i12 = (Ii.I) obj3;
                Object obj4 = ((kotlin.jvm.internal.B) obj2).f37622Y;
                if (obj4 != null) {
                    switch (((Ii.q) i12).f8680Y) {
                        case 0:
                            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj4);
                            break;
                        default:
                            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) obj4);
                            break;
                    }
                    return yVar;
                }
                AbstractC3557B.C2("listener");
                throw null;
        }
    }
}
