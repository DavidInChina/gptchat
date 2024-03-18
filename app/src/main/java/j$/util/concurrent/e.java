package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e extends b implements Set, j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f35288a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f35288a.f(entry.getKey(), entry.getValue(), false) == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f35288a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.f35288a.f35273a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    return;
                }
                consumer.accept(new k(a5.f35299b, a5.f35300c, this.f35288a));
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        l[] lVarArr = this.f35288a.f35273a;
        int i10 = 0;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    break;
                }
                i10 += a5.hashCode();
            }
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.util.concurrent.a, java.util.Iterator] */
    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f35288a;
        l[] lVarArr = concurrentHashMap.f35273a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new AbstractC3719a(lVarArr, length, length, concurrentHashMap);
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f35288a.remove(key, value);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f35288a;
        concurrentHashMap.getClass();
        predicate.getClass();
        l[] lVarArr = concurrentHashMap.f35273a;
        boolean z10 = false;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    break;
                }
                Object obj = a5.f35299b;
                Object obj2 = a5.f35300c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
    /* renamed from: spliterator */
    public final Spliterator mo48spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f35288a;
        long j6 = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.f35273a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        long j10 = 0;
        if (j6 >= 0) {
            j10 = j6;
        }
        return new f(lVarArr, length, 0, length, j10, concurrentHashMap);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }
}
