package G3;

import android.gov.nist.core.Separators;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    public final View f5982b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5981a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5983c = new ArrayList();

    public z(View view) {
        this.f5982b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f5982b == zVar.f5982b && this.f5981a.equals(zVar.f5981a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5981a.hashCode() + (this.f5982b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        StringBuilder r10 = android.gov.nist.core.a.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        r10.append(this.f5982b);
        r10.append(Separators.RETURN);
        String g10 = android.gov.nist.core.a.g(r10.toString(), "    values:");
        for (String str : this.f5981a.keySet()) {
            g10 = g10 + "    " + str + ": " + hashMap.get(str) + Separators.RETURN;
        }
        return g10;
    }
}
