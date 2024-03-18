package io.ktor.utils.io.jvm.javaio;

import id.AbstractC3557B;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final l f33509a = new Object();

    @Override // io.ktor.utils.io.jvm.javaio.j
    public final void a(long j6) {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.j
    public final void b(Object obj) {
        Thread thread = (Thread) obj;
        AbstractC3557B.c0("token", thread);
        LockSupport.unpark(thread);
    }
}
