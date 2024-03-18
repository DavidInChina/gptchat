package g2;

import L.C0840c;
import androidx.glance.session.SessionWorker;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g2.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3140E extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ L f31035Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31036Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3153k f31037h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3140E(L l10, SessionWorker sessionWorker, C3153k c3153k) {
        super(1);
        this.f31035Y = l10;
        this.f31036Z = sessionWorker;
        this.f31037h0 = c3153k;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        L l10 = this.f31035Y;
        long a5 = l10.a();
        SessionWorker sessionWorker = this.f31036Z;
        if (Mg.b.c(a5, sessionWorker.f25280o0.f31045b) < 0) {
            long j6 = sessionWorker.f25280o0.f31045b;
            AtomicReference atomicReference = l10.f31054Z;
            C0840c c0840c = new C0840c(j6, 2);
            loop0: while (true) {
                Object obj2 = atomicReference.get();
                Object invoke = c0840c.invoke(obj2);
                while (!atomicReference.compareAndSet(obj2, invoke)) {
                    if (atomicReference.get() != obj2) {
                        break;
                    }
                }
            }
        }
        Ad.l.O0(l10, null, null, new C3139D(this.f31037h0, null), 3);
        return jf.y.f36177a;
    }
}
