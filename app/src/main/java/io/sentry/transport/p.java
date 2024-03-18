package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* loaded from: classes.dex */
public final class p extends AbstractQueuedSynchronizer {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ int f34760Y = 0;

    public p(int i10) {
        setState(i10);
    }

    public static int a(p pVar) {
        return pVar.getState();
    }

    public static void b(p pVar) {
        int state;
        do {
            state = pVar.getState();
        } while (!pVar.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i10) {
        if (getState() == 0) {
            return 1;
        }
        return -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i10) {
        int state;
        int i11;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i11 = state - 1;
        } while (!compareAndSetState(state, i11));
        if (i11 != 0) {
            return false;
        }
        return true;
    }
}
