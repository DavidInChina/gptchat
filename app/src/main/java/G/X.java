package G;

import L.AbstractC0861m0;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import cb.C2373n;
import id.AbstractC3557B;
import q0.C5251c;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class X extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5470Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f5471Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC6216a abstractC6216a, int i10) {
        super(1);
        this.f5470Y = i10;
        this.f5471Z = abstractC6216a;
    }

    public final void a(AbstractC0861m0 abstractC0861m0) {
        int i10 = this.f5470Y;
        AbstractC6216a abstractC6216a = this.f5471Z;
        switch (i10) {
            case 6:
                AbstractC3557B.c0("$this$$receiver", abstractC0861m0);
                abstractC6216a.mo122invoke();
                return;
            case 7:
                AbstractC3557B.c0("$this$$receiver", abstractC0861m0);
                abstractC6216a.mo122invoke();
                return;
            default:
                AbstractC3557B.c0("$this$$receiver", abstractC0861m0);
                abstractC6216a.mo122invoke();
                return;
        }
    }

    public final void c(View view) {
        int i10 = this.f5470Y;
        AbstractC6216a abstractC6216a = this.f5471Z;
        switch (i10) {
            case 11:
                AbstractC3557B.c0("decorView", view);
                AbstractC3557B.c0("onDrawCallback", abstractC6216a);
                be.e eVar = new be.e(view, abstractC6216a);
                int i11 = Build.VERSION.SDK_INT;
                View view2 = eVar.f25953Z;
                if (i11 < 26) {
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    AbstractC3557B.b0("view.viewTreeObserver", viewTreeObserver);
                    if (!viewTreeObserver.isAlive() || !view2.isAttachedToWindow()) {
                        view2.addOnAttachStateChangeListener(eVar);
                        return;
                    }
                }
                view2.getViewTreeObserver().addOnDrawListener(eVar);
                return;
            default:
                AbstractC3557B.c0("it", view);
                abstractC6216a.mo122invoke();
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long j6;
        long j10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f5470Y;
        AbstractC6216a abstractC6216a = this.f5471Z;
        switch (i10) {
            case 0:
                F f6 = (F) abstractC6216a.mo122invoke();
                int a5 = f6.a();
                int i11 = 0;
                while (true) {
                    if (i11 < a5) {
                        if (!AbstractC3557B.K(f6.b(i11), obj)) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                return Integer.valueOf(i11);
            case 1:
                long j11 = ((C5251c) obj).f43623a;
                abstractC6216a.mo122invoke();
                return yVar;
            case 2:
                Z0.b bVar = (Z0.b) obj;
                switch (i10) {
                    case 2:
                        j6 = ((C5251c) abstractC6216a.mo122invoke()).f43623a;
                        break;
                    default:
                        j6 = ((C5251c) abstractC6216a.mo122invoke()).f43623a;
                        break;
                }
                return new C5251c(j6);
            case 3:
                Z0.b bVar2 = (Z0.b) obj;
                switch (i10) {
                    case 2:
                        j10 = ((C5251c) abstractC6216a.mo122invoke()).f43623a;
                        break;
                    default:
                        j10 = ((C5251c) abstractC6216a.mo122invoke()).f43623a;
                        break;
                }
                return new C5251c(j10);
            case 4:
                Throwable th2 = (Throwable) obj;
                abstractC6216a.mo122invoke();
                return yVar;
            case 5:
                AbstractC3557B.c0("it", (C2373n) obj);
                abstractC6216a.mo122invoke();
                return yVar;
            case 6:
                a((AbstractC0861m0) obj);
                return yVar;
            case 7:
                a((AbstractC0861m0) obj);
                return yVar;
            case 8:
                a((AbstractC0861m0) obj);
                return yVar;
            case 9:
                ((Number) obj).intValue();
                abstractC6216a.mo122invoke();
                return yVar;
            case 10:
                Ed.m mVar = (Ed.m) obj;
                abstractC6216a.mo122invoke();
                return yVar;
            case 11:
                c((View) obj);
                return yVar;
            case 12:
                return abstractC6216a.mo122invoke();
            case 13:
                AbstractC3557B.c0("it", obj);
                return abstractC6216a.mo122invoke();
            default:
                c((View) obj);
                return yVar;
        }
    }
}
