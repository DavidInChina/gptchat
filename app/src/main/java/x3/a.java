package X3;

import g.RunnableC3118k;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21777Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f21778Z;

    public /* synthetic */ a(int i10, Object obj) {
        this.f21777Y = i10;
        this.f21778Z = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f21777Y;
        Object obj = this.f21778Z;
        switch (i10) {
            case 0:
                ((b) obj).f21781c.post(runnable);
                return;
            default:
                ((Executor) obj).execute(new RunnableC3118k(15, runnable));
                return;
        }
    }
}
