package Ag;

import id.AbstractC3557B;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public final Lock f848a;

    public a(Lock lock) {
        AbstractC3557B.c0("lock", lock);
        this.f848a = lock;
    }

    @Override // Ag.t
    public final void a() {
        this.f848a.unlock();
    }

    @Override // Ag.t
    public void b() {
        this.f848a.lock();
    }
}
