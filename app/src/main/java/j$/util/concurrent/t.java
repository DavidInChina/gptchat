package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t extends b implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f35288a.containsValue(obj);
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
                consumer.accept(a5.f35300c);
            }
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f35288a;
        l[] lVarArr = concurrentHashMap.f35273a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC3719a abstractC3719a;
        if (obj != null) {
            Iterator it = iterator();
            do {
                abstractC3719a = (AbstractC3719a) it;
                if (!abstractC3719a.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((h) it).next()));
            abstractC3719a.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z10 = false;
        while (true) {
            AbstractC3719a abstractC3719a = (AbstractC3719a) it;
            if (abstractC3719a.hasNext()) {
                if (collection.contains(((h) it).next())) {
                    abstractC3719a.remove();
                    z10 = true;
                }
            } else {
                return z10;
            }
        }
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
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    /* renamed from: spliterator */
    public final Spliterator mo48spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f35288a;
        long j6 = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.f35273a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, j6 < 0 ? 0L : j6, 1);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }
}
