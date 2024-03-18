package d7;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: a  reason: collision with root package name */
    public final List f28096a;

    public j(ArrayList arrayList) {
        this.f28096a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.f28096a.equals(((j) ((p) obj)).f28096a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28096a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f28096a + "}";
    }
}
