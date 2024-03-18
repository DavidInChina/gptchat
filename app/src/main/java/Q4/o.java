package q4;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import jf.C3959i;
import kf.w;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class o implements Iterable, AbstractC6438a {

    /* renamed from: Z  reason: collision with root package name */
    public static final o f43884Z = new o(w.f37484Y);

    /* renamed from: Y  reason: collision with root package name */
    public final Map f43885Y;

    public o(Map map) {
        this.f43885Y = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            if (AbstractC3557B.K(this.f43885Y, ((o) obj).f43885Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43885Y.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f43885Y;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2469q0.p(entry.getValue());
            arrayList.add(new C3959i((String) entry.getKey(), null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f43885Y + ')';
    }
}
