package yh;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import th.AbstractC5806n;
import yh.l1;

/* renamed from: yh.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6633q0 extends AbstractC6638t0 {

    /* renamed from: i0  reason: collision with root package name */
    public static final HashMap f51068i0;

    /* renamed from: Z  reason: collision with root package name */
    public final Class f51069Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Y f51070h0;

    static {
        HashMap hashMap = new HashMap();
        f51068i0 = hashMap;
        hashMap.put(zh.H.class, new C6633q0(zh.H.class));
        hashMap.put(Class.class, new C6633q0(Class.class));
        hashMap.put(Throwable.class, new C6633q0(Throwable.class));
        hashMap.put(Annotation.class, new C6633q0(Annotation.class));
        hashMap.put(Object.class, new C6633q0(Object.class));
        hashMap.put(String.class, new C6633q0(String.class));
        hashMap.put(Boolean.class, new C6633q0(Boolean.class));
        hashMap.put(Byte.class, new C6633q0(Byte.class));
        hashMap.put(Short.class, new C6633q0(Short.class));
        hashMap.put(Character.class, new C6633q0(Character.class));
        hashMap.put(Integer.class, new C6633q0(Integer.class));
        hashMap.put(Long.class, new C6633q0(Long.class));
        hashMap.put(Float.class, new C6633q0(Float.class));
        hashMap.put(Double.class, new C6633q0(Double.class));
        Class cls = Void.TYPE;
        hashMap.put(cls, new C6633q0(cls));
        Class cls2 = Boolean.TYPE;
        hashMap.put(cls2, new C6633q0(cls2));
        Class cls3 = Byte.TYPE;
        hashMap.put(cls3, new C6633q0(cls3));
        Class cls4 = Short.TYPE;
        hashMap.put(cls4, new C6633q0(cls4));
        Class cls5 = Character.TYPE;
        hashMap.put(cls5, new C6633q0(cls5));
        Class cls6 = Integer.TYPE;
        hashMap.put(cls6, new C6633q0(cls6));
        Class cls7 = Long.TYPE;
        hashMap.put(cls7, new C6633q0(cls7));
        Class cls8 = Float.TYPE;
        hashMap.put(cls8, new C6633q0(cls8));
        Class cls9 = Double.TYPE;
        hashMap.put(cls9, new C6633q0(cls9));
    }

    public C6633q0(Class cls, Y y10) {
        this.f51069Z = cls;
        this.f51070h0 = y10;
    }

    public static l1.a i1(Class cls) {
        l1.a aVar = (l1.a) f51068i0.get(cls);
        if (aVar == null) {
            return new C6633q0(cls);
        }
        return aVar;
    }

    @Override // yh.AbstractC6638t0, yh.AbstractC6643w, yh.AbstractC6632q
    public final boolean H(Type type) {
        if (this.f51069Z != type && !super.H(type)) {
            return false;
        }
        return true;
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        Class<?> componentType = this.f51069Z.getComponentType();
        if (componentType == null) {
            return null;
        }
        return new C6633q0(componentType, this.f51070h0.b());
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f51070h0.f();
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        Class<?> declaringClass = this.f51069Z.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        return new C6633q0(declaringClass, this.f51070h0.e());
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1(this.f51069Z);
    }

    public C6633q0(Class cls) {
        this(cls, X.f50977Y);
    }
}
