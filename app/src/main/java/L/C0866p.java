package L;

import java.util.concurrent.atomic.AtomicLong;
import wf.AbstractC6216a;

/* renamed from: L.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0866p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10259Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N.j0 f10260Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0866p(N.j0 j0Var, int i10) {
        super(0);
        this.f10259Y = i10;
        this.f10260Z = j0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        N.j0 j0Var = this.f10260Z;
        int i10 = this.f10259Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        AtomicLong atomicLong = ((N.m0) j0Var).f12376d;
                        long andIncrement = atomicLong.getAndIncrement();
                        while (andIncrement == 0) {
                            andIncrement = atomicLong.getAndIncrement();
                        }
                        return Long.valueOf(andIncrement);
                    default:
                        AtomicLong atomicLong2 = ((N.m0) j0Var).f12376d;
                        long andIncrement2 = atomicLong2.getAndIncrement();
                        while (andIncrement2 == 0) {
                            andIncrement2 = atomicLong2.getAndIncrement();
                        }
                        return Long.valueOf(andIncrement2);
                }
            default:
                switch (i10) {
                    case 0:
                        AtomicLong atomicLong3 = ((N.m0) j0Var).f12376d;
                        long andIncrement3 = atomicLong3.getAndIncrement();
                        while (andIncrement3 == 0) {
                            andIncrement3 = atomicLong3.getAndIncrement();
                        }
                        return Long.valueOf(andIncrement3);
                    default:
                        AtomicLong atomicLong4 = ((N.m0) j0Var).f12376d;
                        long andIncrement4 = atomicLong4.getAndIncrement();
                        while (andIncrement4 == 0) {
                            andIncrement4 = atomicLong4.getAndIncrement();
                        }
                        return Long.valueOf(andIncrement4);
                }
        }
    }
}
