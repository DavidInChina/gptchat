package K8;

import android.gov.nist.core.Separators;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements Map.Entry {

    /* renamed from: Y  reason: collision with root package name */
    public l f9559Y;

    /* renamed from: Z  reason: collision with root package name */
    public l f9560Z;

    /* renamed from: h0  reason: collision with root package name */
    public l f9561h0;

    /* renamed from: i0  reason: collision with root package name */
    public l f9562i0;

    /* renamed from: j0  reason: collision with root package name */
    public l f9563j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f9564k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f9565l0;

    /* renamed from: m0  reason: collision with root package name */
    public Object f9566m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f9567n0;

    public l(boolean z10) {
        this.f9564k0 = null;
        this.f9565l0 = z10;
        this.f9563j0 = this;
        this.f9562i0 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f9564k0;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f9566m0;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9564k0;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9566m0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f9564k0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        Object obj2 = this.f9566m0;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f9565l0) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f9566m0;
        this.f9566m0 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9564k0 + Separators.EQUALS + this.f9566m0;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.f9559Y = lVar;
        this.f9564k0 = obj;
        this.f9565l0 = z10;
        this.f9567n0 = 1;
        this.f9562i0 = lVar2;
        this.f9563j0 = lVar3;
        lVar3.f9562i0 = this;
        lVar2.f9563j0 = this;
    }
}
