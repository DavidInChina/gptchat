package A2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f425Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f426Z;

    public /* synthetic */ O(int i10, Object obj) {
        this.f425Y = i10;
        this.f426Z = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f425Y;
        Object obj = this.f426Z;
        switch (i10) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            case 1:
                ((Handler) obj).post(runnable);
                return;
            case 2:
                ((Handler) obj).post(runnable);
                return;
            default:
                ((Choreographer) obj).postFrameCallback(new T0.E(0, runnable));
                return;
        }
    }
}
