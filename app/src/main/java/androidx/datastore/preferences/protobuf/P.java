package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class P extends LinkedHashMap {

    /* renamed from: Z  reason: collision with root package name */
    public static final P f25002Z;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f25003Y = true;

    static {
        P p10 = new P();
        f25002Z = p10;
        p10.f25003Y = false;
    }

    public final void a() {
        if (this.f25003Y) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, androidx.datastore.preferences.protobuf.P] */
    public final P b() {
        if (isEmpty()) {
            return new P();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f25003Y = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
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
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10;
        int i11 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i12 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = B.f24959a;
                i10 = bArr.length;
                for (byte b10 : bArr) {
                    i10 = (i10 * 31) + b10;
                }
                if (i10 == 0) {
                    i10 = 1;
                }
            } else {
                i10 = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = B.f24959a;
                int length = bArr2.length;
                for (byte b11 : bArr2) {
                    length = (length * 31) + b11;
                }
                if (length != 0) {
                    i12 = length;
                }
            } else {
                i12 = value.hashCode();
            }
            i11 += i10 ^ i12;
        }
        return i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = B.f24959a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = B.f24959a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
