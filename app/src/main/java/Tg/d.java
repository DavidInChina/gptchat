package Tg;

import Ng.AbstractC1055c0;
import Ng.B;
import java.util.concurrent.Executor;
import nf.AbstractC4831k;
import nf.C4832l;

/* loaded from: classes.dex */
public final class d extends AbstractC1055c0 implements Executor {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f17246Z = new B();

    /* renamed from: h0  reason: collision with root package name */
    public static final B f17247h0;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ng.B, Tg.d] */
    static {
        l lVar = l.f17262Z;
        int i10 = Sg.B.f16631a;
        if (64 >= i10) {
            i10 = 64;
        }
        f17247h0 = lVar.u0(A7.b.K1(i10, 0, 0, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // Ng.B
    public final void O(AbstractC4831k abstractC4831k, Runnable runnable) {
        f17247h0.O(abstractC4831k, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        r(C4832l.f40334Y, runnable);
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        f17247h0.r(abstractC4831k, runnable);
    }

    @Override // Ng.B
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // Ng.B
    public final B u0(int i10) {
        return l.f17262Z.u0(1);
    }
}
