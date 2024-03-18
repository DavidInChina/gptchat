package v2;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements w8.g {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47122Y;

    @Override // w8.g
    public final boolean apply(Object obj) {
        switch (this.f47122Y) {
            case 0:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            default:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
        }
    }
}
