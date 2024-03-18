package L3;

import id.AbstractC3557B;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class h extends Enum implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public static final h f10716Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ h[] f10717Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [L3.h, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f10716Y = r12;
        f10717Z = new h[]{r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f10717Z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC3557B.c0("command", runnable);
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
