package V1;

import io.sentry.android.core.AbstractC3612c;
import j.AbstractC3873c;
import j.C3872b;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class C implements AbstractC3873c {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18018Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f18019Z;

    public /* synthetic */ C(K k10, int i10) {
        this.f18018Y = i10;
        this.f18019Z = k10;
    }

    @Override // j.AbstractC3873c
    public final void d(Object obj) {
        int i10;
        int i11 = this.f18018Y;
        K k10 = this.f18019Z;
        switch (i11) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (((Boolean) arrayList.get(i12)).booleanValue()) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i12] = i10;
                }
                H h10 = (H) k10.f18033D.pollFirst();
                if (h10 == null) {
                    AbstractC3612c.r("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = h10.f18025Y;
                if (k10.f18046c.t(str) == null) {
                    AbstractC3612c.r("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                C3872b c3872b = (C3872b) obj;
                H h11 = (H) k10.f18033D.pollLast();
                if (h11 == null) {
                    AbstractC3612c.r("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str2 = h11.f18025Y;
                AbstractComponentCallbacksC1480v t10 = k10.f18046c.t(str2);
                if (t10 == null) {
                    AbstractC3612c.r("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                t10.w(h11.f18026Z, c3872b.f35796Y, c3872b.f35797Z);
                return;
        }
    }
}
