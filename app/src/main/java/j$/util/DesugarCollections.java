package j$.util;

import j$.util.Collection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class DesugarCollections {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f35205a;

    /* renamed from: b  reason: collision with root package name */
    private static final Field f35206b;

    /* renamed from: c  reason: collision with root package name */
    private static final Field f35207c;

    /* renamed from: d  reason: collision with root package name */
    private static final Constructor f35208d;

    /* renamed from: e  reason: collision with root package name */
    private static final Constructor f35209e;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f35205a = cls;
        Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f35206b = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f35207c = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(java.util.Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f35209e = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(java.util.Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f35208d = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(java.util.Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f35206b;
        if (field == null) {
            try {
                java.util.Collection collection2 = (java.util.Collection) f35207c.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(collection)) {
                java.util.Collection collection3 = (java.util.Collection) f35207c.get(collection);
                removeIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
            }
            return removeIf;
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e11);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C3722f(map);
    }
}
