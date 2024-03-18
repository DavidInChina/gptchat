package lf;

import id.AbstractC3557B;
import java.util.Map;
import xf.AbstractC6441d;

/* renamed from: lf.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4438c implements Map.Entry, AbstractC6441d {

    /* renamed from: Y  reason: collision with root package name */
    public final C4439d f38309Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f38310Z;

    public C4438c(C4439d c4439d, int i10) {
        AbstractC3557B.c0("map", c4439d);
        this.f38309Y = c4439d;
        this.f38310Z = i10;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC3557B.K(entry.getKey(), getKey()) && AbstractC3557B.K(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f38309Y.f38312Y[this.f38310Z];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f38309Y.f38313Z;
        AbstractC3557B.Z(objArr);
        return objArr[this.f38310Z];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        Object key = getKey();
        int i11 = 0;
        if (key != null) {
            i10 = key.hashCode();
        } else {
            i10 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C4439d c4439d = this.f38309Y;
        c4439d.b();
        Object[] objArr = c4439d.f38313Z;
        if (objArr == null) {
            int length = c4439d.f38312Y.length;
            if (length >= 0) {
                objArr = new Object[length];
                c4439d.f38313Z = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        int i10 = this.f38310Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
