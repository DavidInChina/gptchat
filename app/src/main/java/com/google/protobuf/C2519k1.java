package com.google.protobuf;

import android.gov.nist.core.Separators;
import java.util.Map;

/* renamed from: com.google.protobuf.k1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2519k1 implements Map.Entry, Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final Comparable f27566Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f27567Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2510h1 f27568h0;

    public C2519k1(C2510h1 c2510h1, Comparable comparable, Object obj) {
        this.f27568h0 = c2510h1;
        this.f27566Y = comparable;
        this.f27567Z = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27566Y.compareTo(((C2519k1) obj).f27566Y);
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
        Comparable comparable = this.f27566Y;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f27567Z;
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
        return this.f27566Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f27567Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        int i11 = 0;
        Comparable comparable = this.f27566Y;
        if (comparable == null) {
            i10 = 0;
        } else {
            i10 = comparable.hashCode();
        }
        Object obj = this.f27567Z;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = C2510h1.f27553l0;
        this.f27568h0.b();
        Object obj2 = this.f27567Z;
        this.f27567Z = obj;
        return obj2;
    }

    public final String toString() {
        return this.f27566Y + Separators.EQUALS + this.f27567Z;
    }
}
