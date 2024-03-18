package me;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public Long f39175a;

    /* renamed from: b  reason: collision with root package name */
    public Long f39176b;

    /* renamed from: c  reason: collision with root package name */
    public Long f39177c;

    static {
        if ("TimeoutConfiguration".length() != 0) {
            return;
        }
        throw new IllegalStateException("Name can't be blank");
    }

    public M() {
        this.f39175a = 0L;
        this.f39176b = 0L;
        this.f39177c = 0L;
        this.f39175a = null;
        this.f39176b = null;
        this.f39177c = null;
    }

    public static void a(Long l10) {
        if (l10 != null && l10.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m10 = (M) obj;
        if (AbstractC3557B.K(this.f39175a, m10.f39175a) && AbstractC3557B.K(this.f39176b, m10.f39176b) && AbstractC3557B.K(this.f39177c, m10.f39177c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        Long l10 = this.f39175a;
        int i12 = 0;
        if (l10 != null) {
            i10 = l10.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Long l11 = this.f39176b;
        if (l11 != null) {
            i11 = l11.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Long l12 = this.f39177c;
        if (l12 != null) {
            i12 = l12.hashCode();
        }
        return i14 + i12;
    }
}
