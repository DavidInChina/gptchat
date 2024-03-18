package lg;

import android.gov.nist.core.Separators;
import java.util.Map;

/* renamed from: lg.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4448F implements Comparable, Map.Entry {

    /* renamed from: Y  reason: collision with root package name */
    public final Comparable f38345Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f38346Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4444B f38347h0;

    public C4448F(C4444B c4444b, Comparable comparable, Object obj) {
        this.f38347h0 = c4444b;
        this.f38345Y = comparable;
        this.f38346Z = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f38345Y.compareTo(((C4448F) obj).f38345Y);
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
        Comparable comparable = this.f38345Y;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f38346Z;
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
        return this.f38345Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f38346Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        int i11 = 0;
        Comparable comparable = this.f38345Y;
        if (comparable == null) {
            i10 = 0;
        } else {
            i10 = comparable.hashCode();
        }
        Object obj = this.f38346Z;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = C4444B.f38337k0;
        this.f38347h0.b();
        Object obj2 = this.f38346Z;
        this.f38346Z = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f38345Y);
        String valueOf2 = String.valueOf(this.f38346Z);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb2.append(valueOf);
        sb2.append(Separators.EQUALS);
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
