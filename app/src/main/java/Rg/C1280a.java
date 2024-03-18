package Rg;

import java.util.concurrent.CancellationException;

/* renamed from: Rg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1280a extends CancellationException {

    /* renamed from: Y  reason: collision with root package name */
    public final transient Object f15524Y;

    public C1280a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f15524Y = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
