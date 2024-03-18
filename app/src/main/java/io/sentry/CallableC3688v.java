package io.sentry;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC3688v implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34781a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f34781a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
            case 2:
                return null;
            case 3:
                return new ArrayList();
            default:
                return io.sentry.android.core.internal.util.c.f34157b.a();
        }
    }
}
