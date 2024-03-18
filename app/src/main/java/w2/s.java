package w2;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class s extends Thread {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f47719Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ t f47720Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f47720Z = tVar;
        this.f47719Y = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f47720Z) {
            this.f47719Y.open();
            t.a(this.f47720Z);
            this.f47720Z.f47723b.getClass();
        }
    }
}
