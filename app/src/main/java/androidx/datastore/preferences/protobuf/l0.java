package androidx.datastore.preferences.protobuf;

import android.gov.nist.core.Separators;
import java.util.Map;

/* loaded from: classes.dex */
public final class l0 implements Map.Entry, Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final Comparable f25078Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f25079Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i0 f25080h0;

    public l0(i0 i0Var, Comparable comparable, Object obj) {
        this.f25080h0 = i0Var;
        this.f25078Y = comparable;
        this.f25079Z = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f25078Y.compareTo(((l0) obj).f25078Y);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f25078Y;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f25079Z;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f25078Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25079Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        int i11 = 0;
        Comparable comparable = this.f25078Y;
        if (comparable == null) {
            i10 = 0;
        } else {
            i10 = comparable.hashCode();
        }
        Object obj = this.f25079Z;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = i0.f25059l0;
        this.f25080h0.b();
        Object obj2 = this.f25079Z;
        this.f25079Z = obj;
        return obj2;
    }

    public final String toString() {
        return this.f25078Y + Separators.EQUALS + this.f25079Z;
    }
}
