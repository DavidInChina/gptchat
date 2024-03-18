package ji;

import id.AbstractC3557B;

/* renamed from: ji.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4142q implements AbstractC4120I {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4120I f36738Y;

    public AbstractC4142q(AbstractC4120I abstractC4120I) {
        AbstractC3557B.c0("delegate", abstractC4120I);
        this.f36738Y = abstractC4120I;
    }

    @Override // ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36738Y.close();
    }

    @Override // ji.AbstractC4120I
    public final C4124M f() {
        return this.f36738Y.f();
    }

    @Override // ji.AbstractC4120I, java.io.Flushable
    public void flush() {
        this.f36738Y.flush();
    }

    @Override // ji.AbstractC4120I
    public void o(C4135j c4135j, long j6) {
        AbstractC3557B.c0("source", c4135j);
        this.f36738Y.o(c4135j, j6);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f36738Y + ')';
    }
}
