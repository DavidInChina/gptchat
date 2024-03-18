package Q1;

import java.util.concurrent.ThreadFactory;
import s2.AbstractC5530A;

/* renamed from: Q1.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC1173a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14316b;

    public /* synthetic */ ThreadFactoryC1173a(String str, int i10) {
        this.f14315a = i10;
        this.f14316b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f14315a;
        String str = this.f14316b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                int i11 = AbstractC5530A.f45131a;
                return new Thread(runnable, str);
        }
    }
}
