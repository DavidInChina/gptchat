package ji;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: ji.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface AbstractC4120I extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    C4124M f();

    void flush();

    void o(C4135j c4135j, long j6);
}
