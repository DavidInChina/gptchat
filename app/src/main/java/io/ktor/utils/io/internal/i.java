package io.ktor.utils.io.internal;

import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class i extends n {

    /* renamed from: c  reason: collision with root package name */
    public final ByteBuffer f33458c;

    /* renamed from: d  reason: collision with root package name */
    public final ByteBuffer f33459d;

    /* renamed from: e  reason: collision with root package name */
    public final h f33460e;

    /* renamed from: f  reason: collision with root package name */
    public final j f33461f;

    /* renamed from: g  reason: collision with root package name */
    public final m f33462g;

    /* renamed from: h  reason: collision with root package name */
    public final k f33463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10, ByteBuffer byteBuffer) {
        super(byteBuffer, new p(byteBuffer.capacity() - i10));
        AbstractC3557B.c0("backingBuffer", byteBuffer);
        if (byteBuffer.position() == 0) {
            if (byteBuffer.limit() == byteBuffer.capacity()) {
                ByteBuffer duplicate = byteBuffer.duplicate();
                AbstractC3557B.b0("backingBuffer.duplicate()", duplicate);
                this.f33458c = duplicate;
                ByteBuffer duplicate2 = byteBuffer.duplicate();
                AbstractC3557B.b0("backingBuffer.duplicate()", duplicate2);
                this.f33459d = duplicate2;
                this.f33460e = new h(this);
                this.f33461f = new j(this);
                this.f33462g = new m(this);
                this.f33463h = new k(this);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // io.ktor.utils.io.internal.n
    public final ByteBuffer a() {
        return this.f33459d;
    }

    @Override // io.ktor.utils.io.internal.n
    public final ByteBuffer b() {
        return this.f33458c;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n c() {
        return this.f33461f;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n d() {
        return this.f33462g;
    }

    public final String toString() {
        return "Initial";
    }

    public /* synthetic */ i(ByteBuffer byteBuffer) {
        this(8, byteBuffer);
    }
}
