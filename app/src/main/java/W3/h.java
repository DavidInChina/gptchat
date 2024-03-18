package W3;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class h extends Enum implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public static final h f20721Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ h[] f20722Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, W3.h] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f20721Y = r12;
        f20722Z = new h[]{r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f20722Z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
