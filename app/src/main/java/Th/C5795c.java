package th;

import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashMap;
import uh.AbstractC5929a;
import uh.C5930b;
import wh.AbstractC6240e;
import wh.AbstractC6242g;
import wh.C6238c;
import yh.C6641v;
import yh.l1;

/* renamed from: th.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5795c extends AbstractC5793a implements AbstractC5798f {

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f46211g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f46212h;

    /* renamed from: e  reason: collision with root package name */
    public final Annotation f46213e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f46214f;

    static {
        try {
            Class.forName("java.security.AccessController", false, null);
            f46212h = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f46212h = false;
        } catch (SecurityException unused2) {
            f46212h = true;
        }
        f46211g = new Object[0];
    }

    public C5795c(Annotation annotation, Class cls) {
        this.f46213e = annotation;
        this.f46214f = cls;
    }

    public static HashMap h(Annotation annotation) {
        Method[] declaredMethods;
        HashMap hashMap = new HashMap();
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            try {
                hashMap.put(method.getName(), i(method.getReturnType(), method.invoke(annotation, f46211g)));
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Cannot access " + method, e10);
            } catch (InvocationTargetException e11) {
                Throwable targetException = e11.getTargetException();
                if (targetException instanceof TypeNotPresentException) {
                    hashMap.put(method.getName(), new C5790W(((TypeNotPresentException) targetException).typeName()));
                } else if (targetException instanceof EnumConstantNotPresentException) {
                    EnumConstantNotPresentException enumConstantNotPresentException = (EnumConstantNotPresentException) targetException;
                    hashMap.put(method.getName(), new C5787T(0, new C6641v(enumConstantNotPresentException.enumType()), enumConstantNotPresentException.constantName()));
                } else if (targetException instanceof AnnotationTypeMismatchException) {
                    AnnotationTypeMismatchException annotationTypeMismatchException = (AnnotationTypeMismatchException) targetException;
                    hashMap.put(method.getName(), new C5787T(2, new AbstractC6240e(annotationTypeMismatchException.element()), annotationTypeMismatchException.foundType()));
                } else if (!(targetException instanceof IncompleteAnnotationException)) {
                    throw new IllegalStateException("Cannot read " + method, targetException);
                }
            }
        }
        return hashMap;
    }

    public static AbstractC5809q i(Class cls, Object obj) {
        if (Enum.class.isAssignableFrom(cls)) {
            return new C5788U(new C5930b((Enum) obj));
        }
        int i10 = 0;
        if (Enum[].class.isAssignableFrom(cls)) {
            Enum[] enumArr = (Enum[]) obj;
            int length = enumArr.length;
            AbstractC5929a[] abstractC5929aArr = new AbstractC5929a[length];
            int length2 = enumArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length2) {
                abstractC5929aArr[i12] = new C5930b(enumArr[i11]);
                i11++;
                i12++;
            }
            l1 l12 = C6641v.l1(cls.getComponentType());
            ArrayList arrayList = new ArrayList(length);
            while (i10 < length) {
                AbstractC5929a abstractC5929a = abstractC5929aArr[i10];
                if (abstractC5929a.b().equals(l12)) {
                    arrayList.add(new C5788U(abstractC5929a));
                    i10++;
                } else {
                    throw new IllegalArgumentException(abstractC5929a + " is not of " + l12);
                }
            }
            return new C5785Q(AbstractC5929a.class, l12, arrayList);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            return new C5811s(new C5797e(C6641v.l1(cls), h((Annotation) obj)));
        } else {
            if (Annotation[].class.isAssignableFrom(cls)) {
                Annotation[] annotationArr = (Annotation[]) obj;
                int length3 = annotationArr.length;
                AbstractC5802j[] abstractC5802jArr = new AbstractC5802j[length3];
                int length4 = annotationArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length4) {
                    abstractC5802jArr[i14] = new C5797e(C6641v.l1(cls.getComponentType()), h(annotationArr[i13]));
                    i13++;
                    i14++;
                }
                l1 l13 = C6641v.l1(cls.getComponentType());
                ArrayList arrayList2 = new ArrayList(length3);
                while (i10 < length3) {
                    AbstractC5802j abstractC5802j = abstractC5802jArr[i10];
                    if (abstractC5802j.d().equals(l13)) {
                        arrayList2.add(new C5811s(abstractC5802j));
                        i10++;
                    } else {
                        throw new IllegalArgumentException(abstractC5802j + " is not of " + l13);
                    }
                }
                return new C5785Q(AbstractC5802j.class, l13, arrayList2);
            } else if (Class.class.isAssignableFrom(cls)) {
                return new C5792Y(C6641v.l1((Class) obj));
            } else {
                if (Class[].class.isAssignableFrom(cls)) {
                    Class[] clsArr = (Class[]) obj;
                    int length5 = clsArr.length;
                    l1[] l1VarArr = new l1[length5];
                    int length6 = clsArr.length;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length6) {
                        l1VarArr[i16] = C6641v.l1(clsArr[i15]);
                        i15++;
                        i16++;
                    }
                    ArrayList arrayList3 = new ArrayList(length5);
                    while (i10 < length5) {
                        arrayList3.add(new C5792Y(l1VarArr[i10]));
                        i10++;
                    }
                    return new C5785Q(l1.class, C6641v.l1(Class.class), arrayList3);
                }
                return C5784P.e(obj);
            }
        }
    }

    @Override // th.AbstractC5798f
    public final Annotation a() {
        Annotation annotation = this.f46213e;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Class<? extends Annotation> cls = this.f46214f;
        if (cls != annotationType) {
            return C5794b.a(cls.getClassLoader(), cls, h(annotation));
        }
        return annotation;
    }

    @Override // th.AbstractC5802j
    public final AbstractC5798f b(Class cls) {
        Annotation annotation = this.f46213e;
        if (annotation.annotationType().getName().equals(cls.getName())) {
            if (cls == annotation.annotationType()) {
                return this;
            }
            return new C5795c(annotation, cls);
        }
        throw new IllegalArgumentException(cls + " does not represent " + annotation.annotationType());
    }

    @Override // th.AbstractC5802j
    public final h0 c(AbstractC6242g abstractC6242g) {
        Method method;
        l1 mo118a = abstractC6242g.mo118a();
        Annotation annotation = this.f46213e;
        if (mo118a.H(annotation.annotationType())) {
            try {
                boolean i02 = abstractC6242g.mo118a().i0();
                if (abstractC6242g instanceof C6238c) {
                    method = (Method) ((C6238c) abstractC6242g).f48534Z;
                } else {
                    method = null;
                }
                if (method == null || method.getDeclaringClass() != annotation.annotationType() || (!i02 && !method.isAccessible())) {
                    method = annotation.annotationType().getMethod(abstractC6242g.getName(), new Class[0]);
                    if (!i02) {
                        Uh.c cVar = new Uh.c(method);
                        if (f46212h) {
                            AccessController.doPrivileged(cVar);
                        } else {
                            cVar.run();
                        }
                    }
                }
                return i(method.getReturnType(), method.invoke(annotation, f46211g)).d(abstractC6242g, abstractC6242g.getReturnType());
            } catch (InvocationTargetException e10) {
                Throwable targetException = e10.getTargetException();
                if (targetException instanceof TypeNotPresentException) {
                    return new C5790W(((TypeNotPresentException) targetException).typeName());
                }
                if (targetException instanceof EnumConstantNotPresentException) {
                    EnumConstantNotPresentException enumConstantNotPresentException = (EnumConstantNotPresentException) targetException;
                    return new C5787T(0, new C6641v(enumConstantNotPresentException.enumType()), enumConstantNotPresentException.constantName());
                } else if (targetException instanceof AnnotationTypeMismatchException) {
                    AnnotationTypeMismatchException annotationTypeMismatchException = (AnnotationTypeMismatchException) targetException;
                    return new C5787T(2, new AbstractC6240e(annotationTypeMismatchException.element()), annotationTypeMismatchException.foundType());
                } else if (targetException instanceof IncompleteAnnotationException) {
                    IncompleteAnnotationException incompleteAnnotationException = (IncompleteAnnotationException) targetException;
                    return new C5787T(1, new C6641v(incompleteAnnotationException.annotationType()), incompleteAnnotationException.elementName());
                } else {
                    throw new IllegalStateException("Error reading annotation property " + abstractC6242g, targetException);
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Cannot access annotation property " + abstractC6242g, e11);
            }
        }
        throw new IllegalArgumentException(abstractC6242g + " does not represent " + annotation.annotationType());
    }

    @Override // th.AbstractC5802j
    public final l1 d() {
        return C6641v.l1(this.f46213e.annotationType());
    }
}
