package io.ktor.utils.io.jvm.javaio;

import id.AbstractC3557B;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final f f33498a = new Object();

    @Override // io.ktor.utils.io.jvm.javaio.j
    public final void a(long j6) {
        if (j6 >= 0) {
            LockSupport.parkNanos(j6);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // io.ktor.utils.io.jvm.javaio.j
    public final void b(Object obj) {
        Thread thread = (Thread) obj;
        AbstractC3557B.c0("token", thread);
        LockSupport.unpark(thread);
    }
}
