package W;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f19126a;

    public F1(Map map) {
        this.f19126a = map;
    }

    public final Object a(float f6) {
        Object obj;
        Iterator it = this.f19126a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f6 - ((Number) ((Map.Entry) obj).getValue()).floatValue());
                do {
                    Object next = it.next();
                    float abs2 = Math.abs(f6 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        obj = next;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final Object b(float f6, boolean z10) {
        Object obj;
        float f10;
        float f11;
        Iterator it = this.f19126a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) obj).getValue()).floatValue();
                if (z10) {
                    f10 = floatValue - f6;
                } else {
                    f10 = f6 - floatValue;
                }
                if (f10 < 0.0f) {
                    f10 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z10) {
                        f11 = floatValue2 - f6;
                    } else {
                        f11 = f6 - floatValue2;
                    }
                    if (f11 < 0.0f) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f10, f11) > 0) {
                        obj = next;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final float c(Object obj) {
        Float f6 = (Float) this.f19126a.get(obj);
        if (f6 != null) {
            return f6.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F1)) {
            return false;
        }
        return AbstractC3557B.K(this.f19126a, ((F1) obj).f19126a);
    }

    public final int hashCode() {
        return this.f19126a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f19126a + ')';
    }
}
