package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes3.dex */
final class k implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final Object f35295a;

    /* renamed from: b  reason: collision with root package name */
    Object f35296b;

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap f35297c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f35295a = obj;
        this.f35296b = obj2;
        this.f35297c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f35295a) || key.equals(obj2)) && (value == (obj3 = this.f35296b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f35295a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35296b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f35295a.hashCode() ^ this.f35296b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f35296b;
        this.f35296b = obj;
        this.f35297c.put(this.f35295a, obj);
        return obj2;
    }

    public final String toString() {
        return n.b(this.f35295a, this.f35296b);
    }
}
