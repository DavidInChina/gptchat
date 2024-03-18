package r;

import java.util.concurrent.Executor;

/* renamed from: r.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5333a implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44147Y;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f44147Y) {
            case 1:
                b.d0().f44150f.f44155g.execute(runnable);
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
