package ji;

import id.AbstractC3557B;

/* renamed from: ji.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4143r implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4122K f36739Y;

    public AbstractC4143r(AbstractC4122K abstractC4122K) {
        AbstractC3557B.c0("delegate", abstractC4122K);
        this.f36739Y = abstractC4122K;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36739Y.close();
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f36739Y.f();
    }

    @Override // ji.AbstractC4122K
    public long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        return this.f36739Y.g0(c4135j, j6);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f36739Y + ')';
    }
}
