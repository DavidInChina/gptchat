package O0;

import android.text.Layout;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Layout.Alignment f13314a;

    /* renamed from: b  reason: collision with root package name */
    public static final Layout.Alignment f13315b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (AbstractC3557B.K(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC3557B.K(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f13314a = alignment;
        f13315b = alignment2;
    }
}
