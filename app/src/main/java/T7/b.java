package Vd;

import Lg.n;
import id.AbstractC3557B;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class j {
    public static String a() {
        String format = ((SimpleDateFormat) k.f18606a.get()).format(new Date());
        AbstractC3557B.b0("formatters.get().format(date)", format);
        return n.A2(format, "UTC", "Z");
    }
}
