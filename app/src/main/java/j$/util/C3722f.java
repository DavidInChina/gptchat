package j$.util;

import j$.util.Map;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3722f implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Map f35340a;

    /* renamed from: b  reason: collision with root package name */
    final Object f35341b = this;

    /* renamed from: c  reason: collision with root package name */
    private transient java.util.Set f35342c;

    /* renamed from: d  reason: collision with root package name */
    private transient java.util.Set f35343d;

    /* renamed from: e  reason: collision with root package name */
    private transient java.util.Collection f35344e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3722f(java.util.Map map) {
        this.f35340a = (java.util.Map) Objects.requireNonNull(map);
    }

    private static java.util.Set a(java.util.Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f35209e;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f35209e;
            return (java.util.Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new Error("Unable to instantiate a synchronized list.", e10);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f35341b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f35341b) {
            this.f35340a.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
        r5 = r3;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj2;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            if (map instanceof Map) {
                obj2 = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                loop0: while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    while (true) {
                        Object apply = biFunction.apply(obj, obj3);
                        if (apply != null) {
                            if (obj3 == null) {
                                obj3 = concurrentMap.putIfAbsent(obj, apply);
                                if (obj3 == null) {
                                    break loop0;
                                }
                            } else if (concurrentMap.replace(obj, obj3, apply)) {
                                break;
                            }
                        } else if (obj3 == null || concurrentMap.remove(obj, obj3)) {
                            break;
                        }
                    }
                }
                obj2 = null;
            } else {
                obj2 = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        Object apply;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            if (map instanceof Map) {
                obj2 = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj3 = concurrentMap.get(obj);
                obj2 = (obj3 == null && (apply = function.apply(obj)) != null && (obj3 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj3;
            } else {
                obj2 = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        r5 = r3;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            if (map instanceof Map) {
                obj2 = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    if (obj3 == null) {
                        obj2 = null;
                        break;
                    }
                    Object apply = biFunction.apply(obj, obj3);
                    if (apply == null) {
                        if (concurrentMap.remove(obj, obj3)) {
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj3, apply)) {
                        break;
                    }
                }
            } else {
                obj2 = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f35341b) {
            containsKey = this.f35340a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f35341b) {
            containsValue = this.f35340a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set;
        synchronized (this.f35341b) {
            try {
                if (this.f35343d == null) {
                    this.f35343d = a(this.f35340a.entrySet(), this.f35341b);
                }
                set = this.f35343d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f35341b) {
            equals = this.f35340a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f35341b) {
            Map.EL.forEach(this.f35340a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f35341b) {
            obj2 = this.f35340a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            if (map instanceof Map) {
                obj3 = ((Map) map).getOrDefault(obj, obj2);
            } else if (map instanceof ConcurrentMap) {
                Object obj4 = ((ConcurrentMap) map).get(obj);
                if (obj4 != null) {
                    obj2 = obj4;
                }
                obj3 = obj2;
            } else {
                obj3 = map.get(obj);
            }
        }
        return obj3;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f35341b) {
            hashCode = this.f35340a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f35341b) {
            isEmpty = this.f35340a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set;
        synchronized (this.f35341b) {
            try {
                if (this.f35342c == null) {
                    this.f35342c = a(this.f35340a.keySet(), this.f35341b);
                }
                set = this.f35342c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6 = null;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj3;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            if (map instanceof Map) {
                obj3 = ((Map) map).merge(obj, obj2, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                Objects.requireNonNull(obj2);
                loop0: while (true) {
                    Object obj4 = concurrentMap.get(obj);
                    while (true) {
                        if (obj4 != null) {
                            break;
                        }
                        obj4 = concurrentMap.putIfAbsent(obj, obj2);
                        if (obj4 == null) {
                            break loop0;
                        }
                    }
                }
                obj3 = obj2;
            } else {
                obj3 = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj3;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f35341b) {
            put = this.f35340a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f35341b) {
            this.f35340a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object a5;
        synchronized (this.f35341b) {
            a5 = Map.EL.a(this.f35340a, obj, obj2);
        }
        return a5;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f35341b) {
            remove = this.f35340a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : map.get(obj);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f35341b) {
            java.util.Map map = this.f35340a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.u uVar = new j$.util.concurrent.u(0, concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(uVar);
                } else {
                    j$.util.concurrent.n.a(concurrentMap, uVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f35341b) {
            size = this.f35340a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f35341b) {
            obj = this.f35340a.toString();
        }
        return obj;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection;
        Constructor constructor;
        Throwable e10;
        Constructor constructor2;
        java.util.Collection collection2;
        synchronized (this.f35341b) {
            try {
                if (this.f35344e == null) {
                    java.util.Collection values = this.f35340a.values();
                    Object obj = this.f35341b;
                    constructor = DesugarCollections.f35208d;
                    if (constructor == null) {
                        collection2 = Collections.synchronizedCollection(values);
                    } else {
                        try {
                            constructor2 = DesugarCollections.f35208d;
                            collection2 = (java.util.Collection) constructor2.newInstance(values, obj);
                        } catch (IllegalAccessException e11) {
                            e10 = e11;
                            throw new Error("Unable to instantiate a synchronized list.", e10);
                        } catch (InstantiationException e12) {
                            e10 = e12;
                            throw new Error("Unable to instantiate a synchronized list.", e10);
                        } catch (InvocationTargetException e13) {
                            e10 = e13;
                            throw new Error("Unable to instantiate a synchronized list.", e10);
                        }
                    }
                    this.f35344e = collection2;
                }
                collection = this.f35344e;
            } finally {
            }
        }
        return collection;
    }
}
