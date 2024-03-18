package lg;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class t extends IOException {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC4456a f38415Y = null;

    public t(String str) {
        super(str);
    }

    public static t a() {
        return new t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
