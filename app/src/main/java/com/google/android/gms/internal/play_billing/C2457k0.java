package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2457k0 extends LinkedHashMap {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2457k0 f26936Z;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f26937Y = true;

    static {
        C2457k0 c2457k0 = new C2457k0();
        f26936Z = c2457k0;
        c2457k0.f26937Y = false;
    }

    public static C2457k0 a() {
        return f26936Z;
    }

    public static int e(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = Y.f26890a;
            int length = bArr.length;
            for (byte b10 : bArr) {
                length = (length * 31) + b10;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        } else if (!(obj instanceof T)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, com.google.android.gms.internal.play_billing.k0] */
    public final C2457k0 b() {
        if (isEmpty()) {
            return new C2457k0();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f26937Y = true;
        return linkedHashMap;
    }

    public final void c() {
        this.f26937Y = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final boolean d() {
        return this.f26937Y;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                z10 = value.equals(obj2);
                                continue;
                            }
                            if (!z10) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void g() {
        if (this.f26937Y) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += e(entry.getValue()) ^ e(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        Charset charset = Y.f26890a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            Charset charset = Y.f26890a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }
}
