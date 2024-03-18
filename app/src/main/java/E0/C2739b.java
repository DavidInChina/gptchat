package e0;

import id.AbstractC3557B;
import java.util.Map;
import xf.AbstractC6438a;

/* renamed from: e0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2739b implements Map.Entry, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f28681Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f28682Z;

    public C2739b(Object obj, Object obj2) {
        this.f28681Y = obj;
        this.f28682Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !AbstractC3557B.K(entry.getKey(), this.f28681Y) || !AbstractC3557B.K(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28681Y;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f28682Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f28681Y;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i11 = value.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28681Y);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
