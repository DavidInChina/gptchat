package L8;

import I8.C0739a;
import I8.E;
import I8.F;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import n2.C4711b;

/* loaded from: classes2.dex */
public final class s implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final C4711b f10833Y;

    /* renamed from: Z  reason: collision with root package name */
    public final I8.i f10834Z;

    /* renamed from: h0  reason: collision with root package name */
    public final K8.f f10835h0;

    /* renamed from: i0  reason: collision with root package name */
    public final b f10836i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f10837j0;

    public s(C4711b c4711b, C0739a c0739a, K8.f fVar, b bVar, List list) {
        this.f10833Y = c4711b;
        this.f10834Z = c0739a;
        this.f10835h0 = fVar;
        this.f10836i0 = bVar;
        this.f10837j0 = list;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (K8.q.f9578a.a(obj, accessibleObject)) {
            return;
        }
        throw new RuntimeException(android.gov.nist.core.a.g(N8.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        Ad.l.t0(this.f10837j0);
        if (N8.c.f12745a.G0(rawType)) {
            return new r(rawType, c(nVar, typeToken, rawType, true));
        }
        return new q(this.f10833Y.g(typeToken), c(nVar, typeToken, rawType, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap c(I8.n nVar, TypeToken typeToken, Class cls, boolean z10) {
        int i10;
        Field[] fieldArr;
        int i11;
        Class cls2;
        boolean z11;
        Method method;
        boolean z12;
        J8.b bVar;
        ArrayList arrayList;
        int size;
        int i12;
        o oVar;
        o oVar2;
        boolean z13;
        boolean z14;
        boolean z15;
        E e10;
        boolean z16;
        ArrayList arrayList2;
        s sVar = this;
        I8.n nVar2 = nVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        TypeToken typeToken2 = typeToken;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                Ad.l.t0(sVar.f10837j0);
            }
            int length = declaredFields.length;
            boolean z17 = false;
            int i13 = 0;
            while (i13 < length) {
                Field field = declaredFields[i13];
                boolean d10 = sVar.d(field, true);
                boolean d11 = sVar.d(field, z17);
                if (!d10 && !d11) {
                    i10 = i13;
                    z11 = z17;
                    i11 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                } else {
                    if (z10) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            z12 = z17;
                        } else {
                            Method i02 = N8.c.f12745a.i0(cls3, field);
                            N8.c.e(i02);
                            if (i02.getAnnotation(J8.b.class) != null && field.getAnnotation(J8.b.class) == null) {
                                throw new RuntimeException(android.gov.nist.core.a.A("@SerializedName on ", N8.c.d(i02, z17), " is not supported"));
                            }
                            z12 = d11;
                            method = i02;
                            if (method == null) {
                                N8.c.e(field);
                            }
                            Type L02 = K8.d.L0(typeToken2.getType(), cls3, field.getGenericType(), new HashMap());
                            bVar = (J8.b) field.getAnnotation(J8.b.class);
                            if (bVar != null) {
                                arrayList2 = Collections.singletonList(sVar.f10834Z.a(field));
                            } else {
                                String value = bVar.value();
                                String[] alternate = bVar.alternate();
                                if (alternate.length == 0) {
                                    arrayList2 = Collections.singletonList(value);
                                } else {
                                    ArrayList arrayList3 = new ArrayList(alternate.length + 1);
                                    arrayList3.add(value);
                                    Collections.addAll(arrayList3, alternate);
                                    arrayList = arrayList3;
                                    size = arrayList.size();
                                    i12 = z17;
                                    oVar = null;
                                    while (i12 < size) {
                                        String str = (String) arrayList.get(i12);
                                        if (i12 != 0) {
                                            z13 = z17;
                                        } else {
                                            z13 = d10;
                                        }
                                        TypeToken<?> typeToken3 = TypeToken.get(L02);
                                        Class<? super Object> rawType = typeToken3.getRawType();
                                        o oVar3 = oVar;
                                        if ((rawType instanceof Class) && rawType.isPrimitive()) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        int modifiers = field.getModifiers();
                                        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        J8.a aVar = (J8.a) field.getAnnotation(J8.a.class);
                                        if (aVar != null) {
                                            sVar.f10836i0.getClass();
                                            e10 = b.b(sVar.f10833Y, nVar2, typeToken3, aVar);
                                        } else {
                                            e10 = null;
                                        }
                                        if (e10 != null) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (e10 == null) {
                                            e10 = nVar2.f(typeToken3);
                                        }
                                        int i14 = i12;
                                        int i15 = size;
                                        ArrayList arrayList4 = arrayList;
                                        Field field2 = field;
                                        int i16 = i13;
                                        int i17 = length;
                                        Field[] fieldArr2 = declaredFields;
                                        boolean z18 = z14;
                                        Class cls4 = cls3;
                                        oVar = (o) linkedHashMap.put(str, new o(str, field, z13, z12, false, method, z16, e10, nVar, typeToken3, z18, z15));
                                        if (oVar3 != null) {
                                            oVar = oVar3;
                                        }
                                        sVar = this;
                                        nVar2 = nVar;
                                        d10 = z13;
                                        z17 = false;
                                        cls3 = cls4;
                                        length = i17;
                                        field = field2;
                                        declaredFields = fieldArr2;
                                        size = i15;
                                        arrayList = arrayList4;
                                        i13 = i16;
                                        i12 = i14 + 1;
                                    }
                                    Field field3 = field;
                                    i10 = i13;
                                    z11 = z17;
                                    i11 = length;
                                    fieldArr = declaredFields;
                                    cls2 = cls3;
                                    if (oVar != null) {
                                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + oVar2.f10814a + "'; conflict is caused by fields " + N8.c.c(oVar2.f10815b) + " and " + N8.c.c(field3));
                                    }
                                }
                            }
                            arrayList = arrayList2;
                            size = arrayList.size();
                            i12 = z17;
                            oVar = null;
                            while (i12 < size) {
                            }
                            Field field32 = field;
                            i10 = i13;
                            z11 = z17;
                            i11 = length;
                            fieldArr = declaredFields;
                            cls2 = cls3;
                            if (oVar != null) {
                            }
                        }
                    } else {
                        z12 = d11;
                    }
                    method = null;
                    if (method == null) {
                    }
                    Type L022 = K8.d.L0(typeToken2.getType(), cls3, field.getGenericType(), new HashMap());
                    bVar = (J8.b) field.getAnnotation(J8.b.class);
                    if (bVar != null) {
                    }
                    arrayList = arrayList2;
                    size = arrayList.size();
                    i12 = z17;
                    oVar = null;
                    while (i12 < size) {
                    }
                    Field field322 = field;
                    i10 = i13;
                    z11 = z17;
                    i11 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    if (oVar != null) {
                    }
                }
                i13 = i10 + 1;
                sVar = this;
                nVar2 = nVar;
                z17 = z11;
                cls3 = cls2;
                length = i11;
                declaredFields = fieldArr;
            }
            Class cls5 = cls3;
            typeToken2 = TypeToken.get(K8.d.L0(typeToken2.getType(), cls5, cls5.getGenericSuperclass(), new HashMap()));
            cls3 = typeToken2.getRawType();
            sVar = this;
            nVar2 = nVar;
        }
        return linkedHashMap;
    }

    public final boolean d(Field field, boolean z10) {
        List list;
        Class<?> type = field.getType();
        K8.f fVar = this.f10835h0;
        fVar.getClass();
        if (!K8.f.c(type)) {
            fVar.b(z10);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !K8.f.c(field.getType())) {
                if (z10) {
                    list = fVar.f9548Y;
                } else {
                    list = fVar.f9549Z;
                }
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        AbstractC2469q0.p(it.next());
                        throw null;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
