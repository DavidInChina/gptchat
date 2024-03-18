package kotlin.jvm.internal;

import Df.AbstractC0405d;
import Gf.AbstractC0633g;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import wf.AbstractC6216a;
import wf.AbstractC6217b;
import wf.AbstractC6218c;
import wf.AbstractC6219d;
import wf.AbstractC6220e;
import wf.AbstractC6221f;
import wf.AbstractC6222g;
import wf.AbstractC6223h;
import yf.AbstractC6583a;

/* renamed from: kotlin.jvm.internal.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4307f implements AbstractC0405d, AbstractC4306e {

    /* renamed from: Z  reason: collision with root package name */
    public static final Map f37637Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final HashMap f37638h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final LinkedHashMap f37639i0;

    /* renamed from: Y  reason: collision with root package name */
    public final Class f37640Y;

    static {
        int i10 = 0;
        List G02 = AbstractC4344b.G0(AbstractC6216a.class, wf.k.class, wf.n.class, wf.o.class, wf.p.class, wf.q.class, wf.r.class, wf.s.class, wf.t.class, wf.u.class, AbstractC6217b.class, AbstractC6218c.class, AbstractC0633g.class, AbstractC6219d.class, AbstractC6220e.class, AbstractC6221f.class, AbstractC6222g.class, AbstractC6223h.class, wf.i.class, wf.j.class, wf.l.class, wf.m.class, AbstractC0633g.class);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(G02, 10));
        for (Object obj : G02) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new C3959i((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        f37637Z = AbstractC4268D.k1(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC3557B.b0("<get-values>(...)", values);
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            AbstractC3557B.Z(str);
            sb2.append(Lg.n.P2('.', str, str));
            sb2.append("CompanionObject");
            hashMap3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f37637Z.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f37638h0 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, Lg.n.P2('.', str2, str2));
        }
        f37639i0 = linkedHashMap;
    }

    public C4307f(Class cls) {
        AbstractC3557B.c0("jClass", cls);
        this.f37640Y = cls;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C4307f) && AbstractC3557B.K(R4.b.l1(this), R4.b.l1((AbstractC0405d) obj))) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC4306e
    public final Class f() {
        return this.f37640Y;
    }

    public final int hashCode() {
        return R4.b.l1(this).hashCode();
    }

    @Override // Df.AbstractC0405d
    public final List i() {
        throw new Lc.l();
    }

    @Override // Df.AbstractC0405d
    public final String o() {
        String str;
        Class cls = this.f37640Y;
        AbstractC3557B.c0("jClass", cls);
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return Lg.n.O2(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return Lg.n.O2(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return Lg.n.N2('$', simpleName, simpleName);
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f37639i0;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    @Override // Df.AbstractC0405d
    public final String p() {
        String str;
        Class cls = this.f37640Y;
        AbstractC3557B.c0("jClass", cls);
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean isArray = cls.isArray();
        HashMap hashMap = f37638h0;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = (String) hashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getCanonicalName();
        }
        return str3;
    }

    @Override // Df.AbstractC0405d
    public final Object q() {
        throw new Lc.l();
    }

    @Override // Df.AbstractC0405d
    public final boolean r(Object obj) {
        Class cls = this.f37640Y;
        AbstractC3557B.c0("jClass", cls);
        Map map = f37637Z;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>", map);
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return Ad.l.J0(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = R4.b.l1(R4.b.n1(cls));
        }
        return cls.isInstance(obj);
    }

    public final String toString() {
        return this.f37640Y.toString() + " (Kotlin reflection is not available)";
    }
}
