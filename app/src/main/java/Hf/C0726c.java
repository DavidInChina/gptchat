package Hf;

import Df.AbstractC0405d;
import Sf.AbstractC1385d;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.AbstractC4268D;
import yf.AbstractC6583a;

/* renamed from: Hf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7701a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7702b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC0724a f7703c;

    /* renamed from: d  reason: collision with root package name */
    public final List f7704d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f7705e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f7706f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f7707g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0726c(Class cls, ArrayList arrayList, EnumC0724a enumC0724a) {
        this(cls, arrayList, enumC0724a, r4, r5);
        EnumC0725b enumC0725b = EnumC0725b.f7699Z;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
    }

    @Override // Hf.g
    public final List a() {
        return this.f7705e;
    }

    @Override // Hf.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132 A[LOOP:0: B:3:0x0016->B:48:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087 A[SYNTHETIC] */
    @Override // Hf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(Object[] objArr) {
        Object obj;
        AbstractC0405d abstractC0405d;
        String str;
        Object obj2;
        AbstractC3557B.c0("args", objArr);
        N.f(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list = this.f7702b;
            if (i10 < length) {
                Object obj3 = objArr[i10];
                int i12 = i11 + 1;
                ArrayList arrayList2 = this.f7706f;
                if (obj3 == null) {
                    if (this.f7703c == EnumC0724a.f7695Y) {
                        obj = this.f7707g.get(i11);
                        if (obj == null) {
                            String str2 = (String) list.get(i11);
                            Class cls = (Class) arrayList2.get(i11);
                            if (AbstractC3557B.K(cls, Class.class)) {
                                abstractC0405d = kotlin.jvm.internal.C.f37623a.b(AbstractC0405d.class);
                            } else if (cls.isArray() && AbstractC3557B.K(cls.getComponentType(), Class.class)) {
                                abstractC0405d = kotlin.jvm.internal.C.f37623a.b(AbstractC0405d[].class);
                            } else {
                                abstractC0405d = R4.b.n1(cls);
                            }
                            if (AbstractC3557B.K(abstractC0405d.p(), kotlin.jvm.internal.C.f37623a.b(Object[].class).p())) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(abstractC0405d.p());
                                sb2.append('<');
                                Class<?> componentType = R4.b.k1(abstractC0405d).getComponentType();
                                AbstractC3557B.b0("getComponentType(...)", componentType);
                                sb2.append(R4.b.n1(componentType).p());
                                sb2.append('>');
                                str = sb2.toString();
                            } else {
                                str = abstractC0405d.p();
                            }
                            throw new IllegalArgumentException("Argument #" + i11 + ' ' + str2 + " is not of the required type " + str);
                        }
                        arrayList.add(obj);
                        i10++;
                        i11 = i12;
                    }
                }
                Class cls2 = (Class) arrayList2.get(i11);
                if (!(obj3 instanceof Class)) {
                    if (obj3 instanceof AbstractC0405d) {
                        obj3 = R4.b.k1((AbstractC0405d) obj3);
                    } else if (obj3 instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj3;
                        if (!(objArr2 instanceof Class[])) {
                            if (objArr2 instanceof AbstractC0405d[]) {
                                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>", obj3);
                                AbstractC0405d[] abstractC0405dArr = (AbstractC0405d[]) obj3;
                                ArrayList arrayList3 = new ArrayList(abstractC0405dArr.length);
                                for (AbstractC0405d abstractC0405d2 : abstractC0405dArr) {
                                    arrayList3.add(R4.b.k1(abstractC0405d2));
                                }
                                obj3 = arrayList3.toArray(new Class[0]);
                            } else {
                                obj3 = objArr2;
                            }
                        }
                    }
                    if (cls2.isInstance(obj3)) {
                        obj2 = obj3;
                    } else {
                        obj2 = null;
                    }
                    obj = obj2;
                    if (obj == null) {
                    }
                }
                obj = null;
                if (obj == null) {
                }
            } else {
                return R4.b.a0(this.f7701a, AbstractC4268D.k1(kf.t.S2(list, arrayList)), this.f7704d);
            }
        }
    }

    @Override // Hf.g
    public final Type getReturnType() {
        return this.f7701a;
    }

    public C0726c(Class cls, ArrayList arrayList, EnumC0724a enumC0724a, EnumC0725b enumC0725b, List list) {
        AbstractC3557B.c0("jClass", cls);
        AbstractC3557B.c0("methods", list);
        this.f7701a = cls;
        this.f7702b = arrayList;
        this.f7703c = enumC0724a;
        this.f7704d = list;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f7705e = arrayList2;
        List<Method> list2 = this.f7704d;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(list2, 10));
        for (Method method : list2) {
            Class<?> returnType = method.getReturnType();
            AbstractC3557B.Z(returnType);
            List list3 = AbstractC1385d.f16603a;
            Class<?> cls2 = (Class) AbstractC1385d.f16605c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f7706f = arrayList3;
        List<Method> list4 = this.f7704d;
        ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(list4, 10));
        for (Method method2 : list4) {
            arrayList4.add(method2.getDefaultValue());
        }
        this.f7707g = arrayList4;
        if (this.f7703c == EnumC0724a.f7696Z && enumC0725b == EnumC0725b.f7698Y && (!kf.t.t2(this.f7702b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }
}
