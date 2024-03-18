package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f33468a;

    /* renamed from: b  reason: collision with root package name */
    public final p f33469b;

    public n(ByteBuffer byteBuffer, p pVar) {
        this.f33468a = byteBuffer;
        this.f33469b = pVar;
    }

    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public n c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public n d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public n e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public n f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
