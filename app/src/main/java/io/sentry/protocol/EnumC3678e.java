package io.sentry.protocol;

import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Locale;

/* renamed from: io.sentry.protocol.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC3678e implements AbstractC3656j0 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.AbstractC3656j0
    public void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        ((C3636c1) abstractC3693x0).t(toString().toLowerCase(Locale.ROOT));
    }
}
