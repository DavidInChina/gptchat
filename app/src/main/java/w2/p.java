package w2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final p f47713c = new p(Collections.emptyMap());

    /* renamed from: a  reason: collision with root package name */
    public int f47714a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f47715b;

    public p(Map map) {
        this.f47715b = Collections.unmodifiableMap(map);
    }

    public static boolean b(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final p a(U3.l lVar) {
        byte[] bArr;
        Map map = this.f47715b;
        HashMap hashMap = new HashMap(map);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList((List) lVar.f17424h0));
        for (int i10 = 0; i10 < unmodifiableList.size(); i10++) {
            hashMap.remove(unmodifiableList.get(i10));
        }
        HashMap hashMap2 = new HashMap((Map) lVar.f17423Z);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(w8.e.f48221c);
            } else if (value2 instanceof byte[]) {
                bArr = (byte[]) value2;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        if (b(map, hashMap)) {
            return this;
        }
        return new p(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            return b(this.f47715b, ((p) obj).f47715b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f47714a == 0) {
            int i10 = 0;
            for (Map.Entry entry : this.f47715b.entrySet()) {
                i10 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f47714a = i10;
        }
        return this.f47714a;
    }
}
