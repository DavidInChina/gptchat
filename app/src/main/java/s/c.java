package s;

import android.gov.nist.core.Separators;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements Map.Entry {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f45003Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f45004Z;

    /* renamed from: h0  reason: collision with root package name */
    public c f45005h0;

    /* renamed from: i0  reason: collision with root package name */
    public c f45006i0;

    public c(Object obj, Object obj2) {
        this.f45003Y = obj;
        this.f45004Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45003Y.equals(cVar.f45003Y) && this.f45004Z.equals(cVar.f45004Z)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f45003Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f45004Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f45003Y.hashCode() ^ this.f45004Z.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f45003Y + Separators.EQUALS + this.f45004Z;
    }
}
