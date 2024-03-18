package yh;

import Qh.AbstractC1239q;
import Sh.EnumC1398d;
import Sh.EnumC1400f;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import th.AbstractC5806n;
import th.C5805m;
import wh.AbstractC6240e;
import wh.AbstractC6242g;
import wh.AbstractC6256u;
import wh.C6254s;
import yh.l1;

/* renamed from: yh.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6641v extends AbstractC6635s implements Serializable {

    /* renamed from: m0  reason: collision with root package name */
    public static final HashMap f51088m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final boolean f51089n0;

    /* renamed from: i0  reason: collision with root package name */
    public final Class f51090i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient /* synthetic */ vh.j f51091j0;

    /* renamed from: k0  reason: collision with root package name */
    public transient /* synthetic */ C6254s f51092k0;

    /* renamed from: l0  reason: collision with root package name */
    public transient /* synthetic */ C5805m f51093l0;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    static {
        Object obj;
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f51089n0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f51089n0 = z10;
            Th.y a5 = Th.y.a(AbstractC6639u.class);
            if (f51089n0) {
            }
            AbstractC2469q0.p(obj);
            HashMap hashMap = new HashMap();
            f51088m0 = hashMap;
            hashMap.put(zh.H.class, new C6641v(zh.H.class));
            hashMap.put(Class.class, new C6641v(Class.class));
            hashMap.put(Throwable.class, new C6641v(Throwable.class));
            hashMap.put(Annotation.class, new C6641v(Annotation.class));
            hashMap.put(Object.class, new C6641v(Object.class));
            hashMap.put(String.class, new C6641v(String.class));
            hashMap.put(Boolean.class, new C6641v(Boolean.class));
            hashMap.put(Byte.class, new C6641v(Byte.class));
            hashMap.put(Short.class, new C6641v(Short.class));
            hashMap.put(Character.class, new C6641v(Character.class));
            hashMap.put(Integer.class, new C6641v(Integer.class));
            hashMap.put(Long.class, new C6641v(Long.class));
            hashMap.put(Float.class, new C6641v(Float.class));
            hashMap.put(Double.class, new C6641v(Double.class));
            Class cls = Void.TYPE;
            hashMap.put(cls, new C6641v(cls));
            Class cls2 = Boolean.TYPE;
            hashMap.put(cls2, new C6641v(cls2));
            Class cls3 = Byte.TYPE;
            hashMap.put(cls3, new C6641v(cls3));
            Class cls4 = Short.TYPE;
            hashMap.put(cls4, new C6641v(cls4));
            Class cls5 = Character.TYPE;
            hashMap.put(cls5, new C6641v(cls5));
            Class cls6 = Integer.TYPE;
            hashMap.put(cls6, new C6641v(cls6));
            Class cls7 = Long.TYPE;
            hashMap.put(cls7, new C6641v(cls7));
            Class cls8 = Float.TYPE;
            hashMap.put(cls8, new C6641v(cls8));
            Class cls9 = Double.TYPE;
            hashMap.put(cls9, new C6641v(cls9));
        } catch (SecurityException unused2) {
            z10 = true;
            f51089n0 = z10;
            Th.y a52 = Th.y.a(AbstractC6639u.class);
            if (f51089n0) {
            }
            AbstractC2469q0.p(obj);
            HashMap hashMap2 = new HashMap();
            f51088m0 = hashMap2;
            hashMap2.put(zh.H.class, new C6641v(zh.H.class));
            hashMap2.put(Class.class, new C6641v(Class.class));
            hashMap2.put(Throwable.class, new C6641v(Throwable.class));
            hashMap2.put(Annotation.class, new C6641v(Annotation.class));
            hashMap2.put(Object.class, new C6641v(Object.class));
            hashMap2.put(String.class, new C6641v(String.class));
            hashMap2.put(Boolean.class, new C6641v(Boolean.class));
            hashMap2.put(Byte.class, new C6641v(Byte.class));
            hashMap2.put(Short.class, new C6641v(Short.class));
            hashMap2.put(Character.class, new C6641v(Character.class));
            hashMap2.put(Integer.class, new C6641v(Integer.class));
            hashMap2.put(Long.class, new C6641v(Long.class));
            hashMap2.put(Float.class, new C6641v(Float.class));
            hashMap2.put(Double.class, new C6641v(Double.class));
            Class cls10 = Void.TYPE;
            hashMap2.put(cls10, new C6641v(cls10));
            Class cls22 = Boolean.TYPE;
            hashMap2.put(cls22, new C6641v(cls22));
            Class cls32 = Byte.TYPE;
            hashMap2.put(cls32, new C6641v(cls32));
            Class cls42 = Short.TYPE;
            hashMap2.put(cls42, new C6641v(cls42));
            Class cls52 = Character.TYPE;
            hashMap2.put(cls52, new C6641v(cls52));
            Class cls62 = Integer.TYPE;
            hashMap2.put(cls62, new C6641v(cls62));
            Class cls72 = Long.TYPE;
            hashMap2.put(cls72, new C6641v(cls72));
            Class cls82 = Float.TYPE;
            hashMap2.put(cls82, new C6641v(cls82));
            Class cls92 = Double.TYPE;
            hashMap2.put(cls92, new C6641v(cls92));
        }
        Th.y a522 = Th.y.a(AbstractC6639u.class);
        if (f51089n0) {
            obj = AccessController.doPrivileged(a522);
        } else {
            obj = a522.run();
        }
        AbstractC2469q0.p(obj);
        HashMap hashMap22 = new HashMap();
        f51088m0 = hashMap22;
        hashMap22.put(zh.H.class, new C6641v(zh.H.class));
        hashMap22.put(Class.class, new C6641v(Class.class));
        hashMap22.put(Throwable.class, new C6641v(Throwable.class));
        hashMap22.put(Annotation.class, new C6641v(Annotation.class));
        hashMap22.put(Object.class, new C6641v(Object.class));
        hashMap22.put(String.class, new C6641v(String.class));
        hashMap22.put(Boolean.class, new C6641v(Boolean.class));
        hashMap22.put(Byte.class, new C6641v(Byte.class));
        hashMap22.put(Short.class, new C6641v(Short.class));
        hashMap22.put(Character.class, new C6641v(Character.class));
        hashMap22.put(Integer.class, new C6641v(Integer.class));
        hashMap22.put(Long.class, new C6641v(Long.class));
        hashMap22.put(Float.class, new C6641v(Float.class));
        hashMap22.put(Double.class, new C6641v(Double.class));
        Class cls102 = Void.TYPE;
        hashMap22.put(cls102, new C6641v(cls102));
        Class cls222 = Boolean.TYPE;
        hashMap22.put(cls222, new C6641v(cls222));
        Class cls322 = Byte.TYPE;
        hashMap22.put(cls322, new C6641v(cls322));
        Class cls422 = Short.TYPE;
        hashMap22.put(cls422, new C6641v(cls422));
        Class cls522 = Character.TYPE;
        hashMap22.put(cls522, new C6641v(cls522));
        Class cls622 = Integer.TYPE;
        hashMap22.put(cls622, new C6641v(cls622));
        Class cls722 = Long.TYPE;
        hashMap22.put(cls722, new C6641v(cls722));
        Class cls822 = Float.TYPE;
        hashMap22.put(cls822, new C6641v(cls822));
        Class cls922 = Double.TYPE;
        hashMap22.put(cls922, new C6641v(cls922));
    }

    public C6641v(Class cls) {
        this.f51090i0 = cls;
    }

    public static l1 l1(Class cls) {
        l1 l1Var = (l1) f51088m0.get(cls);
        if (l1Var == null) {
            return new C6641v(cls);
        }
        return l1Var;
    }

    @Override // yh.l1
    public final AbstractC6624m A() {
        throw null;
    }

    @Override // yh.l1
    public final H1 F() {
        return new q1(this.f51090i0.getDeclaredClasses());
    }

    @Override // yh.AbstractC6635s, yh.AbstractC6632q
    public final boolean H(Type type) {
        if (type != this.f51090i0 && !super.H(type)) {
            return false;
        }
        return true;
    }

    @Override // yh.l1
    public final boolean K() {
        return this.f51090i0.isAnonymousClass();
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean K0(l1 l1Var) {
        if (((l1Var instanceof C6641v) && ((C6641v) l1Var).f51090i0.isAssignableFrom(this.f51090i0)) || AbstractC6635s.j1(l1Var, this)) {
            return true;
        }
        return false;
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        boolean z10 = AbstractC6635s.f51074Z;
        Class cls = this.f51090i0;
        if (z10) {
            if (cls.getSuperclass() == null) {
                l1.a aVar = l1.a.f51045N;
                return null;
            }
            return C6633q0.i1(cls.getSuperclass());
        } else if (cls.getSuperclass() == null) {
            return null;
        } else {
            return new C6595b0(cls);
        }
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5636h.a
    public final boolean M0() {
        return this.f51090i0.isAnnotation();
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean N(l1 l1Var) {
        if (!(l1Var instanceof C6641v)) {
            return super.N(l1Var);
        }
        Class cls = ((C6641v) l1Var).f51090i0;
        throw null;
    }

    @Override // yh.l1
    public final String R0() {
        Class<?> cls = this.f51090i0;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return null;
        }
        int indexOf = canonicalName.indexOf(47);
        if (indexOf == -1) {
            return canonicalName;
        }
        StringBuilder sb2 = new StringBuilder(canonicalName.substring(0, indexOf));
        while (cls.isArray()) {
            sb2.append("[]");
            cls = cls.getComponentType();
        }
        return sb2.toString();
    }

    @Override // yh.AbstractC6632q
    public final boolean T0() {
        return this.f51090i0.isArray();
    }

    @Override // yh.l1
    public final vh.l U0() {
        vh.j jVar;
        if (this.f51091j0 != null) {
            jVar = null;
        } else {
            EnumC1400f a5 = EnumC1400f.a();
            Field[] declaredFields = this.f51090i0.getDeclaredFields();
            a5.b(declaredFields, EnumC1398d.f16714Y);
            jVar = new vh.j(declaredFields);
        }
        if (jVar == null) {
            return this.f51091j0;
        }
        this.f51091j0 = jVar;
        return jVar;
    }

    @Override // yh.l1
    public final l1 W() {
        Class<?> enclosingClass = this.f51090i0.getEnclosingClass();
        if (enclosingClass == null) {
            return null;
        }
        return l1(enclosingClass);
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        throw null;
    }

    @Override // yh.AbstractC6635s, yh.l1, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        Class<?> declaringClass = this.f51090i0.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        return l1(declaringClass);
    }

    @Override // yh.AbstractC6632q
    public final boolean a1() {
        return this.f51090i0.isPrimitive();
    }

    @Override // yh.l1
    public final H1 b1() {
        throw null;
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean c1() {
        return this.f51090i0.isMemberClass();
    }

    @Override // yh.l1
    public final H1 d0() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.f51090i0.isAssignableFrom(((yh.C6641v) r3).f51090i0) == false) goto L6;
     */
    @Override // yh.AbstractC6635s, yh.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(l1 l1Var) {
        if (l1Var instanceof C6641v) {
        }
        if (AbstractC6635s.j1(this, l1Var)) {
            return true;
        }
        return false;
    }

    @Override // yh.AbstractC6635s, yh.l1, yh.AbstractC6632q
    /* renamed from: g */
    public final l1 mo119g() {
        Class<?> componentType = this.f51090i0.getComponentType();
        if (componentType == null) {
            return null;
        }
        return l1(componentType);
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        C5805m c5805m;
        if (this.f51093l0 != null) {
            c5805m = null;
        } else {
            c5805m = new C5805m(this.f51090i0.getDeclaredAnnotations());
        }
        if (c5805m == null) {
            return this.f51093l0;
        }
        this.f51093l0 = c5805m;
        return c5805m;
    }

    @Override // sh.AbstractC5637i.a
    public final String getDescriptor() {
        Class cls = this.f51090i0;
        String name = cls.getName();
        int indexOf = name.indexOf(47);
        if (indexOf == -1) {
            StringBuilder sb2 = new StringBuilder();
            Nh.r.a(cls, sb2);
            return sb2.toString();
        }
        return TokenNames.f24315L + name.substring(0, indexOf).replace('.', '/') + Separators.SEMICOLON;
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        String name = this.f51090i0.getName();
        int indexOf = name.indexOf(47);
        if (indexOf != -1) {
            return name.substring(0, indexOf);
        }
        return name;
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean h0(Class cls) {
        if (!cls.isAssignableFrom(this.f51090i0) && !super.h0(cls)) {
            return false;
        }
        return true;
    }

    @Override // yh.l1, yh.AbstractC6632q
    public final AbstractC6256u i() {
        C6254s c6254s;
        if (this.f51092k0 != null) {
            c6254s = null;
        } else {
            c6254s = new C6254s(this.f51090i0);
        }
        if (c6254s == null) {
            return this.f51092k0;
        }
        this.f51092k0 = c6254s;
        return c6254s;
    }

    @Override // yh.l1
    public final boolean m() {
        return this.f51090i0.isLocalClass();
    }

    @Override // yh.l1
    public final String o() {
        Class<?> cls = this.f51090i0;
        String simpleName = cls.getSimpleName();
        int indexOf = simpleName.indexOf(47);
        if (indexOf == -1) {
            return simpleName;
        }
        StringBuilder sb2 = new StringBuilder(simpleName.substring(0, indexOf));
        while (cls.isArray()) {
            sb2.append("[]");
            cls = cls.getComponentType();
        }
        return sb2.toString();
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        boolean z10 = AbstractC6635s.f51074Z;
        z1 z1Var = l1.f51044g0;
        Class cls = this.f51090i0;
        if (z10) {
            if (!cls.isArray()) {
                return new z1(cls.getInterfaces());
            }
            return z1Var;
        } else if (!cls.isArray()) {
            return new D1(cls);
        } else {
            return z1Var;
        }
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        Class cls = Void.TYPE;
        Class cls2 = this.f51090i0;
        if (cls2 == cls) {
            return Hh.o.ZERO;
        }
        if (cls2 != Double.TYPE && cls2 != Long.TYPE) {
            return Hh.o.SINGLE;
        }
        return Hh.o.DOUBLE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [yh.G1, Qh.q] */
    @Override // sh.AbstractC5641m
    public final G1 r0() {
        if (AbstractC6635s.f51074Z) {
            return new AbstractC1239q(1);
        }
        return new y1(this.f51090i0.getTypeParameters());
    }

    @Override // yh.l1
    public final AbstractC6242g s0() {
        Class cls = this.f51090i0;
        Method enclosingMethod = cls.getEnclosingMethod();
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingMethod != null) {
            return new AbstractC6240e(enclosingMethod);
        }
        if (enclosingConstructor != null) {
            return new AbstractC6240e(enclosingConstructor);
        }
        return null;
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f51090i0.getModifiers();
    }

    @Override // yh.l1
    public final l1 v() {
        throw null;
    }

    @Override // yh.AbstractC6635s, yh.AbstractC6632q
    public final l1.a w0() {
        return C6633q0.i1(this.f51090i0);
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean x() {
        throw null;
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean x0() {
        throw null;
    }

    @Override // yh.l1
    public final AbstractC6597c z() {
        Class cls = this.f51090i0;
        if (!cls.isArray() && !cls.isPrimitive()) {
            Package r12 = cls.getPackage();
            if (r12 == null) {
                String name = cls.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    return AbstractC6597c.f50995J;
                }
                return new C6594b(1, name.substring(0, lastIndexOf));
            }
            return new C6594b(0, r12);
        }
        return null;
    }
}
