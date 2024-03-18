package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final int f35298a;

    /* renamed from: b  reason: collision with root package name */
    final Object f35299b;

    /* renamed from: c  reason: collision with root package name */
    volatile Object f35300c;

    /* renamed from: d  reason: collision with root package name */
    volatile l f35301d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i10, Object obj, Object obj2) {
        this.f35298a = i10;
        this.f35299b = obj;
        this.f35300c = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i10, Object obj, Object obj2, l lVar) {
        this(i10, obj, obj2);
        this.f35301d = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l a(Object obj, int i10) {
        Object obj2;
        if (obj != null) {
            l lVar = this;
            do {
                if (lVar.f35298a == i10 && ((obj2 = lVar.f35299b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                }
                lVar = lVar.f35301d;
            } while (lVar != null);
            return null;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f35299b) || key.equals(obj2)) && (value == (obj3 = this.f35300c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f35299b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35300c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f35299b.hashCode() ^ this.f35300c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return n.b(this.f35299b, this.f35300c);
    }
}
