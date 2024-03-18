package Th;

import Sh.EnumC1400f;
import Sh.H;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class y implements PrivilegedAction {

    /* renamed from: i0  reason: collision with root package name */
    public static final boolean f17317i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final q f17318j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final c f17319k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f17320l0;

    /* renamed from: Y  reason: collision with root package name */
    public final Class f17321Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ClassLoader f17322Z = null;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f17323h0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.security.PrivilegedAction, Th.t] */
    static {
        boolean z10;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z11 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f17320l0 = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f17320l0 = z11;
            Uh.b bVar = new Uh.b("net.bytebuddy.generate");
            z10 = f17320l0;
            if (z10) {
            }
            f17317i0 = Boolean.parseBoolean((String) obj);
            n nVar = n.f17303Y;
            if (z10) {
            }
            f17318j0 = (q) obj2;
            ?? obj4 = new Object();
            if (z10) {
            }
            f17319k0 = (c) obj3;
        } catch (SecurityException unused2) {
            z11 = true;
            f17320l0 = z11;
            Uh.b bVar2 = new Uh.b("net.bytebuddy.generate");
            z10 = f17320l0;
            if (z10) {
            }
            f17317i0 = Boolean.parseBoolean((String) obj);
            n nVar2 = n.f17303Y;
            if (z10) {
            }
            f17318j0 = (q) obj2;
            ?? obj42 = new Object();
            if (z10) {
            }
            f17319k0 = (c) obj3;
        }
        Uh.b bVar22 = new Uh.b("net.bytebuddy.generate");
        z10 = f17320l0;
        if (z10) {
            obj = AccessController.doPrivileged(bVar22);
        } else {
            obj = bVar22.run();
        }
        f17317i0 = Boolean.parseBoolean((String) obj);
        n nVar22 = n.f17303Y;
        if (z10) {
            obj2 = AccessController.doPrivileged(nVar22);
        } else {
            obj2 = nVar22.run();
        }
        f17318j0 = (q) obj2;
        ?? obj422 = new Object();
        if (z10) {
            obj3 = AccessController.doPrivileged((PrivilegedAction<Object>) obj422);
        } else {
            obj3 = obj422.run();
        }
        f17319k0 = (c) obj3;
    }

    public y(Class cls, boolean z10) {
        this.f17321Y = cls;
        this.f17323h0 = z10;
    }

    public static y a(Class cls) {
        if (cls.isInterface()) {
            if (cls.isAnnotationPresent(w.class)) {
                if (!((w) cls.getAnnotation(w.class)).value().startsWith("java.security.")) {
                    return new y(cls, f17317i0);
                }
                throw new IllegalArgumentException("Classes related to Java security cannot be proxied: ".concat(cls.getName()));
            }
            throw new IllegalArgumentException("Expected " + cls.getName() + " to be annotated with " + w.class.getName());
        }
        throw new IllegalArgumentException("Expected an interface instead of " + cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f17323h0 != yVar.f17323h0 || !this.f17321Y.equals(yVar.f17321Y)) {
            return false;
        }
        ClassLoader classLoader = this.f17322Z;
        ClassLoader classLoader2 = yVar.f17322Z;
        if (classLoader2 != null) {
            if (classLoader != null && classLoader.equals(classLoader2)) {
                return true;
            }
            return false;
        } else if (classLoader != null) {
            return false;
        }
    }

    public final int hashCode() {
        int hashCode = (this.f17321Y.hashCode() + (y.class.hashCode() * 31)) * 31;
        ClassLoader classLoader = this.f17322Z;
        if (classLoader != null) {
            hashCode += classLoader.hashCode();
        }
        return (hashCode * 31) + (this.f17323h0 ? 1 : 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(5:336|68|333|69|70)|(3:350|72|(2:75|(4:77|345|78|(19:80|81|354|82|83|338|84|339|120|(7:123|352|124|(1:(2:126|(1:378)(1:182))(2:379|183))|154|184|121)|377|185|331|186|187|(2:189|(3:191|(1:195)|196)(3:376|197|198))(4:199|(1:201)(1:202)|203|(9:205|206|(5:209|(1:213)(6:215|216|(4:218|349|219|(2:383|221)(1:222))|359|229|230)|214|233|207)|382|234|(4:236|(1:238)|241|(2:243|(1:245)(3:366|246|247))(2:248|(1:250)(3:368|252|253)))(1:239)|240|241|(0)(0))(3:358|254|255))|251|57|281)(3:375|109|110))(3:374|111|112)))|74|119|339|120|(1:121)|377|185|331|186|187|(0)(0)|251|57|281) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0283, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x028a, code lost:
        if (r6[r11].isArray() == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x028c, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x028e, code lost:
        r6[r11] = r6[r11].getComponentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0297, code lost:
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x029d, code lost:
        if (r7 <= 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a5, code lost:
        if (r6[r11].isPrimitive() != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a7, code lost:
        r27 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02af, code lost:
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b5, code lost:
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c0, code lost:
        if (r6[r11].isAssignableFrom(java.lang.Class.forName(((Th.w) r5).value(), false, r10)) == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c2, code lost:
        r7 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c7, code lost:
        r8 = r27 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c9, code lost:
        if (r27 <= 0) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02cb, code lost:
        r7.append('[');
        r27 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d4, code lost:
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d8, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d9, code lost:
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02dd, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02de, code lost:
        r25 = r3;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e4, code lost:
        r7.append('L');
        r7.append(((Th.w) r5).value());
        r7.append(';');
        r6[r11] = java.lang.Class.forName(r7.toString(), false, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032d, code lost:
        throw new java.lang.IllegalStateException("Cannot resolve to component type: " + ((Th.w) r5).value() + " at " + r11 + " of " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032f, code lost:
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0332, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0333, code lost:
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0336, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0337, code lost:
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x033a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033b, code lost:
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033f, code lost:
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0342, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0343, code lost:
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0366, code lost:
        throw new java.lang.IllegalStateException("Primitive values are not supposed to be proxied: " + r11 + " of " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0367, code lost:
        r30 = r14;
        r31 = r15;
        r5 = java.lang.Class.forName(((Th.w) r5).value(), false, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x037c, code lost:
        if (r6[r11].isAssignableFrom(r5) == false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x037e, code lost:
        r6[r11] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a7, code lost:
        throw new java.lang.IllegalStateException("Cannot resolve to type: " + r5.getName() + " at " + r11 + " of " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04c2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04c3, code lost:
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0571, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0572, code lost:
        r25 = r3;
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0576, code lost:
        r30 = r14;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05cf, code lost:
        r5 = new Th.l("Method not available on current VM: " + r3.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x060c, code lost:
        r5 = new Th.l("Class not available on current VM: " + r3.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e7 A[Catch: all -> 0x02d3, NoSuchMethodException -> 0x02d8, ClassNotFoundException -> 0x02dd, TRY_ENTER, TryCatch #23 {ClassNotFoundException -> 0x02dd, blocks: (B:141:0x02b8, B:143:0x02c2, B:144:0x02c7, B:146:0x02cb, B:153:0x02e4, B:155:0x0305, B:156:0x032d, B:169:0x0346, B:170:0x0366, B:171:0x0367, B:173:0x037e, B:174:0x0381, B:175:0x03a7, B:189:0x03e7, B:191:0x03f5, B:193:0x03fd, B:195:0x0404, B:196:0x0409, B:197:0x0415, B:198:0x0437, B:201:0x0440), top: B:335:0x02b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0438 A[Catch: all -> 0x02d3, NoSuchMethodException -> 0x02d8, ClassNotFoundException -> 0x04c2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {ClassNotFoundException -> 0x04c2, blocks: (B:186:0x03dd, B:199:0x0438, B:202:0x0445, B:203:0x0449, B:205:0x045b, B:209:0x0465, B:211:0x046f, B:215:0x047b), top: B:331:0x03dd }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f1 A[Catch: all -> 0x0493, NoSuchMethodException -> 0x0496, ClassNotFoundException -> 0x0499, TryCatch #23 {ClassNotFoundException -> 0x0499, NoSuchMethodException -> 0x0496, all -> 0x0493, blocks: (B:219:0x0485, B:222:0x048e, B:229:0x049f, B:230:0x04c1, B:233:0x04c6, B:234:0x04ca, B:236:0x04d4, B:240:0x04e2, B:241:0x04e7, B:243:0x04f1, B:245:0x04f7, B:246:0x0500, B:247:0x051c, B:248:0x051d, B:250:0x0523, B:252:0x052f, B:253:0x054b, B:254:0x054c, B:255:0x0570), top: B:349:0x0485 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x051d A[Catch: all -> 0x0493, NoSuchMethodException -> 0x0496, ClassNotFoundException -> 0x0499, TryCatch #23 {ClassNotFoundException -> 0x0499, NoSuchMethodException -> 0x0496, all -> 0x0493, blocks: (B:219:0x0485, B:222:0x048e, B:229:0x049f, B:230:0x04c1, B:233:0x04c6, B:234:0x04ca, B:236:0x04d4, B:240:0x04e2, B:241:0x04e7, B:243:0x04f1, B:245:0x04f7, B:246:0x0500, B:247:0x051c, B:248:0x051d, B:250:0x0523, B:252:0x052f, B:253:0x054b, B:254:0x054c, B:255:0x0570), top: B:349:0x0485 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0605  */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        HashMap hashMap;
        Method[] methodArr;
        Class<s> cls;
        String str;
        String str2;
        Class<b> cls2;
        Object obj;
        boolean z10;
        Method[] methodArr2;
        boolean z11;
        int i10;
        Class<w> cls3;
        Class cls4;
        Class<?> cls5;
        String str3;
        String str4;
        Class<s> cls6;
        Class<b> cls7;
        ClassNotFoundException classNotFoundException;
        Class<b> cls8;
        Class<?>[] parameterTypes;
        int i11;
        int i12;
        String str5;
        boolean z12;
        String str6 = "Instance check requires a single regular-typed argument: ";
        String str7 = "Instance check requires a boolean return type: ";
        Class<s> cls9 = s.class;
        Class<?> cls10 = Object.class;
        H h10 = H.f16700Y;
        ClassLoader classLoader = this.f17322Z;
        try {
            Object invoke = System.class.getMethod("getSecurityManager", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null) {
                Class.forName("java.lang.SecurityManager").getMethod("checkPermission", Permission.class).invoke(invoke, new RuntimePermission("net.bytebuddy.createJavaDispatcher"));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Failed to access security manager", e10);
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            throw new IllegalStateException("Failed to assert access rights using security manager", targetException);
        }
        boolean z13 = this.f17323h0;
        if (z13) {
            hashMap = new LinkedHashMap();
        } else {
            hashMap = new HashMap();
        }
        Class cls11 = this.f17321Y;
        Class<b> cls12 = b.class;
        boolean isAnnotationPresent = cls11.isAnnotationPresent(cls12);
        Class<w> cls13 = w.class;
        String value = ((w) cls11.getAnnotation(cls13)).value();
        try {
            Class<?> cls14 = Class.forName(value, false, classLoader);
            if (z13) {
                EnumC1400f a5 = EnumC1400f.a();
                z10 = z13;
                methodArr2 = cls11.getMethods();
                a5.b(methodArr2, h10);
            } else {
                z10 = z13;
                methodArr2 = cls11.getMethods();
            }
            int length = methodArr2.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = length;
                Method method = methodArr2[i13];
                Method[] methodArr3 = methodArr2;
                if (method.getDeclaringClass() == cls10) {
                    cls6 = cls9;
                } else if (method.isAnnotationPresent(cls9)) {
                    cls6 = cls9;
                    if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0].isAssignableFrom(cls14)) {
                        if (method.getReturnType() == Boolean.TYPE) {
                            hashMap.put(method, new i(cls14));
                        } else {
                            throw new IllegalStateException(str7 + method);
                        }
                    } else {
                        throw new IllegalStateException(str6 + method);
                    }
                } else {
                    cls6 = cls9;
                    if (method.isAnnotationPresent(a.class)) {
                        if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Integer.TYPE) {
                            if (method.getReturnType().isArray() && method.getReturnType().getComponentType().isAssignableFrom(cls14)) {
                                hashMap.put(method, new e(cls14));
                            } else {
                                throw new IllegalStateException("Container creation requires an assignable array as return value: " + method);
                            }
                        } else {
                            throw new IllegalStateException("Container creation requires a single int-typed argument: " + method);
                        }
                    } else if (cls14.getName().equals("java.lang.invoke.MethodHandles") && method.getName().equals("lookup")) {
                        throw new UnsupportedOperationException("Cannot resolve Byte Buddy lookup via dispatcher");
                    } else {
                        try {
                            try {
                                parameterTypes = method.getParameterTypes();
                                try {
                                    str4 = str6;
                                } catch (ClassNotFoundException e12) {
                                    e = e12;
                                    cls3 = cls13;
                                    str4 = str6;
                                    str3 = str7;
                                    cls5 = cls10;
                                    i10 = i13;
                                    cls4 = cls11;
                                }
                            } catch (ClassNotFoundException e13) {
                                e = e13;
                                cls3 = cls13;
                                str4 = str6;
                                str3 = str7;
                                cls5 = cls10;
                                i10 = i13;
                                cls4 = cls11;
                            }
                        } catch (NoSuchMethodException e14) {
                            e = e14;
                            cls3 = cls13;
                            str4 = str6;
                            str3 = str7;
                            cls5 = cls10;
                            i10 = i13;
                            cls4 = cls11;
                        } catch (Throwable th2) {
                            th = th2;
                            cls3 = cls13;
                            str4 = str6;
                            str3 = str7;
                            cls5 = cls10;
                            i10 = i13;
                            cls4 = cls11;
                        }
                        if (!method.isAnnotationPresent(v.class)) {
                            try {
                            } catch (ClassNotFoundException e15) {
                                e = e15;
                                str3 = str7;
                            } catch (NoSuchMethodException e16) {
                                e = e16;
                                str3 = str7;
                            } catch (Throwable th3) {
                                th = th3;
                                str3 = str7;
                            }
                            if (!method.isAnnotationPresent(u.class)) {
                                if (parameterTypes.length != 0) {
                                    str3 = str7;
                                    try {
                                    } catch (ClassNotFoundException e17) {
                                        e = e17;
                                        cls5 = cls10;
                                        cls4 = cls11;
                                        cls3 = cls13;
                                        i10 = i13;
                                        cls7 = cls12;
                                        z11 = isAnnotationPresent;
                                        classNotFoundException = e;
                                        if (!z11) {
                                        }
                                        Object obj2 = h.c(method.getReturnType());
                                        hashMap.put(method, obj2);
                                        i13 = i10 + 1;
                                        cls12 = cls7;
                                        length = i14;
                                        methodArr2 = methodArr3;
                                        cls9 = cls6;
                                        str6 = str4;
                                        str7 = str3;
                                        cls10 = cls5;
                                        cls11 = cls4;
                                        cls13 = cls3;
                                        isAnnotationPresent = z11;
                                    } catch (NoSuchMethodException e18) {
                                        e = e18;
                                        cls5 = cls10;
                                        cls4 = cls11;
                                        cls3 = cls13;
                                        i10 = i13;
                                        cls8 = cls12;
                                        z11 = isAnnotationPresent;
                                        NoSuchMethodException noSuchMethodException = e;
                                        cls7 = cls8;
                                        if (!z11) {
                                        }
                                        Object obj3 = h.c(method.getReturnType());
                                        hashMap.put(method, obj3);
                                        i13 = i10 + 1;
                                        cls12 = cls7;
                                        length = i14;
                                        methodArr2 = methodArr3;
                                        cls9 = cls6;
                                        str6 = str4;
                                        str7 = str3;
                                        cls10 = cls5;
                                        cls11 = cls4;
                                        cls13 = cls3;
                                        isAnnotationPresent = z11;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cls5 = cls10;
                                        cls4 = cls11;
                                        cls3 = cls13;
                                        i10 = i13;
                                        cls8 = cls12;
                                        z11 = isAnnotationPresent;
                                        Throwable th5 = th;
                                        hashMap.put(method, new l("Unexpected error: " + th5.getMessage()));
                                        cls7 = cls8;
                                        i13 = i10 + 1;
                                        cls12 = cls7;
                                        length = i14;
                                        methodArr2 = methodArr3;
                                        cls9 = cls6;
                                        str6 = str4;
                                        str7 = str3;
                                        cls10 = cls5;
                                        cls11 = cls4;
                                        cls13 = cls3;
                                        isAnnotationPresent = z11;
                                    }
                                    if (parameterTypes[0].isAssignableFrom(cls14)) {
                                        int length2 = parameterTypes.length - 1;
                                        cls5 = cls10;
                                        try {
                                            Class<?>[] clsArr = new Class[length2];
                                            cls4 = cls11;
                                            try {
                                                try {
                                                    System.arraycopy(parameterTypes, 1, clsArr, 0, length2);
                                                    parameterTypes = clsArr;
                                                    i11 = 1;
                                                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                                                    i12 = 0;
                                                    while (i12 < parameterTypes.length) {
                                                        try {
                                                            Annotation[] annotationArr = parameterAnnotations[i12 + i11];
                                                            int i15 = i11;
                                                            int length3 = annotationArr.length;
                                                            Annotation[][] annotationArr2 = parameterAnnotations;
                                                            int i16 = 0;
                                                            while (true) {
                                                                if (i16 < length3) {
                                                                    int i17 = length3;
                                                                    Annotation annotation = annotationArr[i16];
                                                                    Annotation[] annotationArr3 = annotationArr;
                                                                    if (annotation instanceof w) {
                                                                        break;
                                                                    }
                                                                    i16++;
                                                                    length3 = i17;
                                                                    annotationArr = annotationArr3;
                                                                } else {
                                                                    i10 = i13;
                                                                    cls8 = cls12;
                                                                    z11 = isAnnotationPresent;
                                                                    break;
                                                                }
                                                            }
                                                            i12++;
                                                            i11 = i15;
                                                            parameterAnnotations = annotationArr2;
                                                            i13 = i10;
                                                            cls12 = cls8;
                                                            isAnnotationPresent = z11;
                                                        } catch (ClassNotFoundException e19) {
                                                            e = e19;
                                                            i10 = i13;
                                                        } catch (NoSuchMethodException e20) {
                                                            e = e20;
                                                            i10 = i13;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            i10 = i13;
                                                        }
                                                    }
                                                    i10 = i13;
                                                    cls8 = cls12;
                                                    z11 = isAnnotationPresent;
                                                    if (!method.isAnnotationPresent(u.class)) {
                                                        Constructor<?> constructor = cls14.getConstructor(parameterTypes);
                                                        if (method.getReturnType().isAssignableFrom(cls14)) {
                                                            if ((constructor.getModifiers() & 1) == 0 || (cls14.getModifiers() & 1) == 0) {
                                                                constructor.setAccessible(true);
                                                                z10 = false;
                                                            }
                                                            hashMap.put(method, new d(constructor));
                                                            cls3 = cls13;
                                                        } else {
                                                            throw new IllegalStateException("Cannot assign " + constructor.getDeclaringClass().getName() + " to " + method);
                                                        }
                                                    } else {
                                                        w wVar = (w) method.getAnnotation(cls13);
                                                        if (wVar == null) {
                                                            str5 = method.getName();
                                                        } else {
                                                            str5 = wVar.value();
                                                        }
                                                        Method method2 = cls14.getMethod(str5, parameterTypes);
                                                        if (method.getReturnType().isAssignableFrom(method2.getReturnType())) {
                                                            Class<?>[] exceptionTypes = method2.getExceptionTypes();
                                                            int length4 = exceptionTypes.length;
                                                            int i18 = 0;
                                                            while (i18 < length4) {
                                                                Class<?> cls15 = exceptionTypes[i18];
                                                                if (RuntimeException.class.isAssignableFrom(cls15) || Error.class.isAssignableFrom(cls15)) {
                                                                    cls3 = cls13;
                                                                } else {
                                                                    Class<?>[] exceptionTypes2 = method.getExceptionTypes();
                                                                    int length5 = exceptionTypes2.length;
                                                                    int i19 = 0;
                                                                    while (i19 < length5) {
                                                                        cls3 = cls13;
                                                                        try {
                                                                            if (!exceptionTypes2[i19].isAssignableFrom(cls15)) {
                                                                                i19++;
                                                                                cls13 = cls3;
                                                                            }
                                                                        } catch (ClassNotFoundException e21) {
                                                                            e = e21;
                                                                            classNotFoundException = e;
                                                                            cls7 = cls8;
                                                                            if (!z11) {
                                                                            }
                                                                            Object obj22 = h.c(method.getReturnType());
                                                                            hashMap.put(method, obj22);
                                                                            i13 = i10 + 1;
                                                                            cls12 = cls7;
                                                                            length = i14;
                                                                            methodArr2 = methodArr3;
                                                                            cls9 = cls6;
                                                                            str6 = str4;
                                                                            str7 = str3;
                                                                            cls10 = cls5;
                                                                            cls11 = cls4;
                                                                            cls13 = cls3;
                                                                            isAnnotationPresent = z11;
                                                                        } catch (NoSuchMethodException e22) {
                                                                            e = e22;
                                                                            NoSuchMethodException noSuchMethodException2 = e;
                                                                            cls7 = cls8;
                                                                            if (!z11) {
                                                                            }
                                                                            Object obj32 = h.c(method.getReturnType());
                                                                            hashMap.put(method, obj32);
                                                                            i13 = i10 + 1;
                                                                            cls12 = cls7;
                                                                            length = i14;
                                                                            methodArr2 = methodArr3;
                                                                            cls9 = cls6;
                                                                            str6 = str4;
                                                                            str7 = str3;
                                                                            cls10 = cls5;
                                                                            cls11 = cls4;
                                                                            cls13 = cls3;
                                                                            isAnnotationPresent = z11;
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            Throwable th52 = th;
                                                                            hashMap.put(method, new l("Unexpected error: " + th52.getMessage()));
                                                                            cls7 = cls8;
                                                                            i13 = i10 + 1;
                                                                            cls12 = cls7;
                                                                            length = i14;
                                                                            methodArr2 = methodArr3;
                                                                            cls9 = cls6;
                                                                            str6 = str4;
                                                                            str7 = str3;
                                                                            cls10 = cls5;
                                                                            cls11 = cls4;
                                                                            cls13 = cls3;
                                                                            isAnnotationPresent = z11;
                                                                        }
                                                                    }
                                                                    throw new IllegalStateException("Resolved method for " + method + " throws undeclared checked exception " + cls15.getName());
                                                                }
                                                                i18++;
                                                                cls13 = cls3;
                                                            }
                                                            cls3 = cls13;
                                                            if ((method2.getModifiers() & 1) != 0) {
                                                                if ((method2.getDeclaringClass().getModifiers() & 1) == 0) {
                                                                    z12 = true;
                                                                }
                                                                if (!Modifier.isStatic(method2.getModifiers())) {
                                                                    if (method.isAnnotationPresent(v.class)) {
                                                                        hashMap.put(method, new k(method2));
                                                                    } else {
                                                                        throw new IllegalStateException("Resolved method for " + method + " was expected to be static: " + method2);
                                                                    }
                                                                } else if (!method.isAnnotationPresent(v.class)) {
                                                                    hashMap.put(method, new j(method2));
                                                                } else {
                                                                    throw new IllegalStateException("Resolved method for " + method + " was expected to be virtual: " + method2);
                                                                }
                                                            } else {
                                                                z12 = true;
                                                            }
                                                            method2.setAccessible(z12);
                                                            z10 = false;
                                                            if (!Modifier.isStatic(method2.getModifiers())) {
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Cannot assign " + method2.getReturnType().getName() + " to " + method);
                                                        }
                                                    }
                                                } catch (ClassNotFoundException e23) {
                                                    e = e23;
                                                    cls3 = cls13;
                                                    i10 = i13;
                                                    cls7 = cls12;
                                                    z11 = isAnnotationPresent;
                                                    classNotFoundException = e;
                                                    if (!z11) {
                                                    }
                                                    Object obj222 = h.c(method.getReturnType());
                                                    hashMap.put(method, obj222);
                                                    i13 = i10 + 1;
                                                    cls12 = cls7;
                                                    length = i14;
                                                    methodArr2 = methodArr3;
                                                    cls9 = cls6;
                                                    str6 = str4;
                                                    str7 = str3;
                                                    cls10 = cls5;
                                                    cls11 = cls4;
                                                    cls13 = cls3;
                                                    isAnnotationPresent = z11;
                                                }
                                            } catch (NoSuchMethodException e24) {
                                                e = e24;
                                                cls3 = cls13;
                                                i10 = i13;
                                                cls8 = cls12;
                                                z11 = isAnnotationPresent;
                                                NoSuchMethodException noSuchMethodException22 = e;
                                                cls7 = cls8;
                                                if (!z11) {
                                                }
                                                Object obj322 = h.c(method.getReturnType());
                                                hashMap.put(method, obj322);
                                                i13 = i10 + 1;
                                                cls12 = cls7;
                                                length = i14;
                                                methodArr2 = methodArr3;
                                                cls9 = cls6;
                                                str6 = str4;
                                                str7 = str3;
                                                cls10 = cls5;
                                                cls11 = cls4;
                                                cls13 = cls3;
                                                isAnnotationPresent = z11;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                cls3 = cls13;
                                                i10 = i13;
                                                cls8 = cls12;
                                                z11 = isAnnotationPresent;
                                                Throwable th522 = th;
                                                hashMap.put(method, new l("Unexpected error: " + th522.getMessage()));
                                                cls7 = cls8;
                                                i13 = i10 + 1;
                                                cls12 = cls7;
                                                length = i14;
                                                methodArr2 = methodArr3;
                                                cls9 = cls6;
                                                str6 = str4;
                                                str7 = str3;
                                                cls10 = cls5;
                                                cls11 = cls4;
                                                cls13 = cls3;
                                                isAnnotationPresent = z11;
                                            }
                                        } catch (ClassNotFoundException e25) {
                                            e = e25;
                                            cls4 = cls11;
                                            cls3 = cls13;
                                            i10 = i13;
                                            cls7 = cls12;
                                            z11 = isAnnotationPresent;
                                            classNotFoundException = e;
                                            if (!z11) {
                                            }
                                            Object obj2222 = h.c(method.getReturnType());
                                            hashMap.put(method, obj2222);
                                            i13 = i10 + 1;
                                            cls12 = cls7;
                                            length = i14;
                                            methodArr2 = methodArr3;
                                            cls9 = cls6;
                                            str6 = str4;
                                            str7 = str3;
                                            cls10 = cls5;
                                            cls11 = cls4;
                                            cls13 = cls3;
                                            isAnnotationPresent = z11;
                                        } catch (NoSuchMethodException e26) {
                                            e = e26;
                                            cls4 = cls11;
                                            cls3 = cls13;
                                            i10 = i13;
                                            cls8 = cls12;
                                            z11 = isAnnotationPresent;
                                            NoSuchMethodException noSuchMethodException222 = e;
                                            cls7 = cls8;
                                            if (!z11) {
                                            }
                                            Object obj3222 = h.c(method.getReturnType());
                                            hashMap.put(method, obj3222);
                                            i13 = i10 + 1;
                                            cls12 = cls7;
                                            length = i14;
                                            methodArr2 = methodArr3;
                                            cls9 = cls6;
                                            str6 = str4;
                                            str7 = str3;
                                            cls10 = cls5;
                                            cls11 = cls4;
                                            cls13 = cls3;
                                            isAnnotationPresent = z11;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            cls4 = cls11;
                                            cls3 = cls13;
                                            i10 = i13;
                                            cls8 = cls12;
                                            z11 = isAnnotationPresent;
                                            Throwable th5222 = th;
                                            hashMap.put(method, new l("Unexpected error: " + th5222.getMessage()));
                                            cls7 = cls8;
                                            i13 = i10 + 1;
                                            cls12 = cls7;
                                            length = i14;
                                            methodArr2 = methodArr3;
                                            cls9 = cls6;
                                            str6 = str4;
                                            str7 = str3;
                                            cls10 = cls5;
                                            cls11 = cls4;
                                            cls13 = cls3;
                                            isAnnotationPresent = z11;
                                        }
                                        cls7 = cls8;
                                        i13 = i10 + 1;
                                        cls12 = cls7;
                                        length = i14;
                                        methodArr2 = methodArr3;
                                        cls9 = cls6;
                                        str6 = str4;
                                        str7 = str3;
                                        cls10 = cls5;
                                        cls11 = cls4;
                                        cls13 = cls3;
                                        isAnnotationPresent = z11;
                                    } else {
                                        throw new IllegalStateException("Cannot assign self type: " + cls14 + " on " + method);
                                    }
                                } else {
                                    throw new IllegalStateException("Expected self type: " + method);
                                }
                            }
                        }
                        str3 = str7;
                        cls5 = cls10;
                        cls4 = cls11;
                        i11 = 0;
                        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                        i12 = 0;
                        while (i12 < parameterTypes.length) {
                        }
                        i10 = i13;
                        cls8 = cls12;
                        z11 = isAnnotationPresent;
                        if (!method.isAnnotationPresent(u.class)) {
                        }
                        cls7 = cls8;
                        i13 = i10 + 1;
                        cls12 = cls7;
                        length = i14;
                        methodArr2 = methodArr3;
                        cls9 = cls6;
                        str6 = str4;
                        str7 = str3;
                        cls10 = cls5;
                        cls11 = cls4;
                        cls13 = cls3;
                        isAnnotationPresent = z11;
                    }
                }
                cls3 = cls13;
                str4 = str6;
                str3 = str7;
                cls5 = cls10;
                i10 = i13;
                cls4 = cls11;
                cls7 = cls12;
                z11 = isAnnotationPresent;
                i13 = i10 + 1;
                cls12 = cls7;
                length = i14;
                methodArr2 = methodArr3;
                cls9 = cls6;
                str6 = str4;
                str7 = str3;
                cls10 = cls5;
                cls11 = cls4;
                cls13 = cls3;
                isAnnotationPresent = z11;
            }
            Class cls16 = cls11;
            if (z10) {
                return r.b(cls16, hashMap);
            }
            return Proxy.newProxyInstance(cls16.getClassLoader(), new Class[]{cls16}, new x(cls14.getName(), hashMap));
        } catch (ClassNotFoundException e27) {
            String str8 = str6;
            String str9 = str7;
            Class<s> cls17 = cls9;
            Class<?> cls18 = cls10;
            Class<b> cls19 = cls12;
            if (z13) {
                EnumC1400f a10 = EnumC1400f.a();
                methodArr = cls11.getMethods();
                a10.b(methodArr, h10);
            } else {
                methodArr = cls11.getMethods();
            }
            int length6 = methodArr.length;
            int i20 = 0;
            while (i20 < length6) {
                Method method3 = methodArr[i20];
                Class<?> cls20 = cls18;
                if (method3.getDeclaringClass() == cls20) {
                    cls2 = cls19;
                    cls = cls17;
                } else {
                    cls = cls17;
                    if (method3.isAnnotationPresent(cls)) {
                        if (method3.getParameterTypes().length == 1 && !method3.getParameterTypes()[0].isPrimitive() && !method3.getParameterTypes()[0].isArray()) {
                            if (method3.getReturnType() == Boolean.TYPE) {
                                hashMap.put(method3, h.f17284k0);
                                cls2 = cls19;
                            } else {
                                throw new IllegalStateException(str9 + method3);
                            }
                        } else {
                            throw new IllegalStateException(str8 + method3);
                        }
                    } else {
                        str = str8;
                        str2 = str9;
                        if (isAnnotationPresent || method3.isAnnotationPresent(cls19)) {
                            cls2 = cls19;
                            obj = h.c(method3.getReturnType());
                        } else {
                            cls2 = cls19;
                            obj = new l("Type not available on current VM: " + e27.getMessage());
                        }
                        hashMap.put(method3, obj);
                        i20++;
                        cls17 = cls;
                        cls18 = cls20;
                        str9 = str2;
                        str8 = str;
                        cls19 = cls2;
                    }
                }
                str = str8;
                str2 = str9;
                i20++;
                cls17 = cls;
                cls18 = cls20;
                str9 = str2;
                str8 = str;
                cls19 = cls2;
            }
            if (z13) {
                return r.b(cls11, hashMap);
            }
            return Proxy.newProxyInstance(cls11.getClassLoader(), new Class[]{cls11}, new x(value, hashMap));
        }
    }
}
