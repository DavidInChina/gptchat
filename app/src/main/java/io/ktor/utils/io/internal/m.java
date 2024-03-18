package io.ktor.utils.io.internal;

import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class m extends n {

    /* renamed from: c  reason: collision with root package name */
    public final i f33467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar) {
        super(iVar.f33468a, iVar.f33469b);
        AbstractC3557B.c0("initial", iVar);
        this.f33467c = iVar;
    }

    @Override // io.ktor.utils.io.internal.n
    public final ByteBuffer b() {
        return this.f33467c.f33458c;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n c() {
        return this.f33467c.f33463h;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n f() {
        return this.f33467c.f33460e;
    }

    public final String toString() {
        return "Writing";
    }
}
