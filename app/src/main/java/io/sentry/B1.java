package io.sentry;

import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes.dex */
public final class B1 implements AbstractC3656j0 {

    /* renamed from: Z  reason: collision with root package name */
    public static final B1 f33752Z = new B1(new UUID(0, 0));

    /* renamed from: Y  reason: collision with root package name */
    public final String f33753Y;

    public B1(String str) {
        Ad.l.Z0("value is required", str);
        this.f33753Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B1.class == obj.getClass()) {
            return this.f33753Y.equals(((B1) obj).f33753Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33753Y.hashCode();
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        ((C3636c1) abstractC3693x0).t(this.f33753Y);
    }

    public final String toString() {
        return this.f33753Y;
    }

    public B1() {
        this(UUID.randomUUID());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B1(UUID uuid) {
        this((r3.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : r3).replace("-", "").substring(0, 16));
        String uuid2 = uuid.toString();
        Charset charset = io.sentry.util.e.f34777a;
    }
}
