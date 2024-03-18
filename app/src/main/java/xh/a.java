package Xh;

import id.AbstractC3557B;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21994a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f21995b;

    public /* synthetic */ a(String str, boolean z10) {
        this.f21994a = str;
        this.f21995b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f21994a;
        AbstractC3557B.c0("$name", str);
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f21995b);
        return thread;
    }
}
