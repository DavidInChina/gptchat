package A2;

import A.C0007a0;
import Z.C1745x0;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.View;
import id.AbstractC3557B;
import io.sentry.EnumC3642e1;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import jf.C3959i;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f383Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f384Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f385h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f386i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f387j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f388k0;

    public /* synthetic */ B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f383Y = i10;
        this.f384Z = obj;
        this.f385h0 = obj2;
        this.f386i0 = obj3;
        this.f387j0 = obj4;
        this.f388k0 = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        H5.f fVar;
        switch (this.f383Y) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f384Z;
                final F4.a aVar = (F4.a) this.f385h0;
                Handler handler = (Handler) this.f386i0;
                final R4.a aVar2 = (R4.a) this.f387j0;
                C1745x0 c1745x0 = (C1745x0) this.f388k0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (aVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: A2.D
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i11 = r3;
                                R4.a aVar3 = aVar2;
                                F4.a aVar4 = aVar;
                                switch (i11) {
                                    case 0:
                                        U3.l lVar = ((V) aVar4.f5033Z).f498M1;
                                        Handler handler2 = (Handler) lVar.f17423Z;
                                        if (handler2 != null) {
                                            handler2.post(new RunnableC0071o(lVar, aVar3, 1));
                                            return;
                                        }
                                        return;
                                    default:
                                        U3.l lVar2 = ((V) aVar4.f5033Z).f498M1;
                                        Handler handler3 = (Handler) lVar2.f17423Z;
                                        if (handler3 != null) {
                                            handler3.post(new RunnableC0071o(lVar2, aVar3, 1));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    c1745x0.d();
                    synchronized (S.f431i0) {
                        try {
                            int i11 = S.f433k0 - 1;
                            S.f433k0 = i11;
                            if (i11 == 0) {
                                S.f432j0.shutdown();
                                S.f432j0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (aVar != null && handler.getLooper().getThread().isAlive()) {
                        i10 = 1;
                        handler.post(new Runnable() { // from class: A2.D
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i112 = r3;
                                R4.a aVar3 = aVar2;
                                F4.a aVar4 = aVar;
                                switch (i112) {
                                    case 0:
                                        U3.l lVar = ((V) aVar4.f5033Z).f498M1;
                                        Handler handler2 = (Handler) lVar.f17423Z;
                                        if (handler2 != null) {
                                            handler2.post(new RunnableC0071o(lVar, aVar3, 1));
                                            return;
                                        }
                                        return;
                                    default:
                                        U3.l lVar2 = ((V) aVar4.f5033Z).f498M1;
                                        Handler handler3 = (Handler) lVar2.f17423Z;
                                        if (handler3 != null) {
                                            handler3.post(new RunnableC0071o(lVar2, aVar3, 1));
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    } else {
                        i10 = 1;
                    }
                    c1745x0.d();
                    synchronized (S.f431i0) {
                        try {
                            int i12 = S.f433k0 - i10;
                            S.f433k0 = i12;
                            if (i12 == 0) {
                                S.f432j0.shutdown();
                                S.f432j0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 1:
                H5.c cVar = (H5.c) this.f384Z;
                h6.a aVar3 = (h6.a) this.f385h0;
                G5.d dVar = (G5.d) this.f386i0;
                h6.a aVar4 = (h6.a) this.f387j0;
                G5.d dVar2 = (G5.d) this.f388k0;
                AbstractC3557B.c0("this$0", cVar);
                AbstractC3557B.c0("$previousOrchestrator", dVar);
                AbstractC3557B.c0("$newConsent", aVar4);
                AbstractC3557B.c0("$newOrchestrator", dVar2);
                H5.a aVar5 = cVar.f7452h0;
                aVar5.getClass();
                C3959i c3959i = new C3959i(aVar3, aVar4);
                h6.a aVar6 = h6.a.f31918h0;
                boolean K10 = AbstractC3557B.K(c3959i, new C3959i(null, aVar6));
                AbstractC5091c abstractC5091c = aVar5.f7447b;
                G5.c cVar2 = aVar5.f7446a;
                if (!K10) {
                    h6.a aVar7 = h6.a.f31916Y;
                    if (!AbstractC3557B.K(c3959i, new C3959i(null, aVar7))) {
                        h6.a aVar8 = h6.a.f31917Z;
                        if (!AbstractC3557B.K(c3959i, new C3959i(null, aVar8)) && !AbstractC3557B.K(c3959i, new C3959i(aVar6, aVar8))) {
                            if (AbstractC3557B.K(c3959i, new C3959i(aVar7, aVar6)) || AbstractC3557B.K(c3959i, new C3959i(aVar8, aVar6))) {
                                fVar = new H5.i(dVar2.K(), cVar2, abstractC5091c);
                            } else if (AbstractC3557B.K(c3959i, new C3959i(aVar6, aVar7))) {
                                fVar = new H5.f(dVar.K(), dVar2.K(), cVar2, abstractC5091c);
                            } else if (AbstractC3557B.K(c3959i, new C3959i(aVar6, aVar6)) || AbstractC3557B.K(c3959i, new C3959i(aVar7, aVar7)) || AbstractC3557B.K(c3959i, new C3959i(aVar7, aVar8)) || AbstractC3557B.K(c3959i, new C3959i(aVar8, aVar8)) || AbstractC3557B.K(c3959i, new C3959i(aVar8, aVar7))) {
                                fVar = new Object();
                            } else {
                                P4.a.l0(aVar5.f7447b, 4, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new C0007a0(aVar3, 23, aVar4), null, 56);
                                fVar = new Object();
                            }
                            fVar.run();
                            cVar.f7455k0 = dVar2;
                            return;
                        }
                    }
                }
                fVar = new H5.i(dVar.K(), cVar2, abstractC5091c);
                fVar.run();
                cVar.f7455k0 = dVar2;
                return;
            default:
                AtomicReference atomicReference = (AtomicReference) this.f384Z;
                View view = (View) this.f385h0;
                List list = (List) this.f386i0;
                CountDownLatch countDownLatch = (CountDownLatch) this.f387j0;
                io.sentry.H h10 = (io.sentry.H) this.f388k0;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    io.sentry.protocol.D d10 = new io.sentry.protocol.D("android_view_system", arrayList);
                    io.sentry.protocol.E c10 = ViewHierarchyEventProcessor.c(view);
                    arrayList.add(c10);
                    ViewHierarchyEventProcessor.b(view, c10, list);
                    atomicReference.set(d10);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th3) {
                    h10.d(EnumC3642e1.ERROR, "Failed to process view hierarchy.", th3);
                    return;
                }
        }
    }
}
