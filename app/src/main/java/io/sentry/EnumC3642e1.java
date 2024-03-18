package io.sentry;

import java.util.Locale;

/* renamed from: io.sentry.e1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3642e1 implements AbstractC3656j0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.AbstractC3656j0
    public void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        ((C3636c1) abstractC3693x0).t(name().toLowerCase(Locale.ROOT));
    }
}
