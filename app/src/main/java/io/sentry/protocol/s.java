package io.sentry.protocol;

import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class s implements AbstractC3656j0 {

    /* renamed from: Z  reason: collision with root package name */
    public static final s f34619Z = new s(new UUID(0, 0));

    /* renamed from: Y  reason: collision with root package name */
    public final UUID f34620Y;

    public s(UUID uuid) {
        this.f34620Y = uuid == null ? UUID.randomUUID() : uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass() && this.f34620Y.compareTo(((s) obj).f34620Y) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34620Y.hashCode();
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        ((C3636c1) abstractC3693x0).t(toString());
    }

    public final String toString() {
        String uuid = this.f34620Y.toString();
        Charset charset = io.sentry.util.e.f34777a;
        if (uuid.equals("0000-0000")) {
            uuid = "00000000-0000-0000-0000-000000000000";
        }
        return uuid.replace("-", "");
    }

    public s(String str) {
        Charset charset = io.sentry.util.e.f34777a;
        str = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        str = str.length() == 32 ? new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString() : str;
        if (str.length() == 36) {
            this.f34620Y = UUID.fromString(str);
            return;
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
    }
}
