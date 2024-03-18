package Wh;

import java.io.Closeable;
import ji.AbstractC4137l;

/* loaded from: classes2.dex */
public abstract class F implements Closeable {
    public abstract u a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Xh.b.c(((E) this).f21146h0);
    }

    public abstract r.f h();

    public abstract AbstractC4137l i();
}
