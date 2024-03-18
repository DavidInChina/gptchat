package m;

import java.util.concurrent.Executor;

/* renamed from: m.P  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC4519P implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38687Y;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f38687Y) {
            case 0:
                new Thread(runnable).start();
                return;
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
