package lh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final r f38505a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f38506b;

    public s(r rVar, LinkedHashMap linkedHashMap) {
        this.f38505a = rVar;
        this.f38506b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3557B.K(this.f38505a, sVar.f38505a) && AbstractC3557B.K(this.f38506b, sVar.f38506b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38506b.hashCode() + (this.f38505a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapRegionTileGrid(base=" + this.f38505a + ", foreground=" + this.f38506b + Separators.RPAREN;
    }
}
