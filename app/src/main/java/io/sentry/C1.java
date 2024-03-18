package io.sentry;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Locale;

/* loaded from: classes.dex */
public enum C1 implements AbstractC3656j0 {
    OK(RCHTTPStatusCodes.SUCCESS, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(RCHTTPStatusCodes.BAD_REQUEST),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(RCHTTPStatusCodes.NOT_FOUND),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(RCHTTPStatusCodes.BAD_REQUEST),
    ABORTED(409),
    OUT_OF_RANGE(RCHTTPStatusCodes.BAD_REQUEST),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);
    
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    C1(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    public static C1 fromHttpStatusCode(int i10) {
        C1[] values;
        for (C1 c12 : values()) {
            if (c12.matches(i10)) {
                return c12;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        if (i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.AbstractC3656j0
    public void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        ((C3636c1) abstractC3693x0).t(name().toLowerCase(Locale.ROOT));
    }

    public static C1 fromHttpStatusCode(Integer num, C1 c12) {
        C1 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : c12;
        return fromHttpStatusCode != null ? fromHttpStatusCode : c12;
    }

    C1(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
