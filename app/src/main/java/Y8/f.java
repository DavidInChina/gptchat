package Y8;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class f implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final f f22121a = new Object();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "kronos-android");
    }
}
