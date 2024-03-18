package Xf;

import Ad.l;
import Bg.A;
import Bg.AbstractC0210c;
import Bg.C0232z;
import Bg.P;
import Bg.Z;
import Bg.a0;
import Bg.j0;
import Bg.m0;
import Jf.n;
import M3.I;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.B;
import Mf.G;
import Mf.V;
import Mf.h0;
import Ng.AbstractC1070k;
import Pf.b0;
import Pf.c0;
import Sf.AbstractC1385d;
import Sf.D;
import Sf.E;
import Sf.F;
import Sf.q;
import Sf.s;
import Sf.u;
import Yf.C1689a;
import Yf.C1697i;
import Yf.J;
import ah.C1990a;
import ah.C1994e;
import android.gov.nist.core.Separators;
import android.os.Handler;
import bg.AbstractC2199g;
import bg.AbstractC2201i;
import bh.C2211a;
import bh.C2217g;
import bh.C2220j;
import bh.C2221k;
import cg.AbstractC2418i;
import cg.C2412c;
import cg.C2424o;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dg.AbstractC2653B;
import dg.AbstractC2666f;
import dg.C2656E;
import dg.C2662b;
import dg.C2664d;
import dg.C2668h;
import dg.C2672l;
import dh.C2676B;
import dh.C2700f0;
import dh.u0;
import fg.C3042j;
import fg.X;
import fg.e0;
import fh.AbstractC3077d;
import hg.AbstractC3423b;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3431j;
import hh.r;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jf.AbstractC3957g;
import jf.y;
import kf.AbstractC4273I;
import kf.t;
import kf.v;
import kg.AbstractC4296h;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l8.AbstractC4344b;
import lf.C4442g;
import s3.z;
import wf.k;
import xg.AbstractC6446a;
import xg.C6452g;
import xg.C6454i;
import xg.C6455j;
import xg.m;
import yf.AbstractC6583a;
import yg.C6587d;
import zg.AbstractC6864k;
import zg.C6862i;
import zg.p;

/* loaded from: classes2.dex */
public final class f extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21984Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f21985Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj) {
        super(1);
        this.f21984Y = i10;
        this.f21985Z = obj;
    }

    public final A a(B b10) {
        int i10 = this.f21984Y;
        Object obj = this.f21985Z;
        switch (i10) {
            case 7:
                AbstractC3557B.c0("it", b10);
                return b10.j().q((n) obj);
            default:
                AbstractC3557B.c0("it", b10);
                return (A) obj;
        }
    }

    public final CharSequence c(int i10) {
        int i11 = this.f21984Y;
        Object obj = this.f21985Z;
        switch (i11) {
            case 22:
                StringBuilder sb2 = new StringBuilder();
                C2217g c2217g = (C2217g) obj;
                sb2.append(c2217g.f26000f[i10]);
                sb2.append(": ");
                sb2.append(c2217g.f26001g[i10].a());
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) obj;
                sb3.append(pluginGeneratedSerialDescriptor.f37653e[i10]);
                sb3.append(": ");
                sb3.append(pluginGeneratedSerialDescriptor.i(i10).a());
                return sb3.toString();
        }
    }

    public final void e(C2211a c2211a) {
        List list;
        SerialDescriptor descriptor;
        List list2 = v.f37483Y;
        int i10 = this.f21984Y;
        Object obj = this.f21985Z;
        switch (i10) {
            case 20:
                AbstractC3557B.c0("$this$buildSerialDescriptor", c2211a);
                KSerializer kSerializer = ((C1990a) obj).f24192b;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    list = descriptor.getAnnotations();
                } else {
                    list = null;
                }
                if (list != null) {
                    list2 = list;
                }
                c2211a.f25975b = list2;
                return;
            case 21:
                AbstractC3557B.c0("$this$buildSerialDescriptor", c2211a);
                c2211a.a("type", u0.f28492b, list2, false);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
                C1994e c1994e = (C1994e) obj;
                sb2.append(c1994e.f24197a.o());
                sb2.append('>');
                c2211a.a("value", l.O(sb2.toString(), C2221k.f26013a, new SerialDescriptor[0], C2220j.f26012Y), list2, false);
                List list3 = c1994e.f24198b;
                AbstractC3557B.c0("<set-?>", list3);
                c2211a.f25975b = list3;
                return;
            case 22:
            default:
                AbstractC3557B.c0("$this$buildClassSerialDescriptor", c2211a);
                C1990a c1990a = (C1990a) obj;
                c2211a.a("first", c1990a.f24192b.getDescriptor(), list2, false);
                c2211a.a("second", ((KSerializer) c1990a.f24194d).getDescriptor(), list2, false);
                c2211a.a("third", ((KSerializer) c1990a.f24195e).getDescriptor(), list2, false);
                return;
            case 23:
                AbstractC3557B.c0("$this$buildSerialDescriptor", c2211a);
                List list4 = (List) ((C2676B) obj).f28379d;
                AbstractC3557B.c0("<set-?>", list4);
                c2211a.f25975b = list4;
                return;
        }
    }

    public final void f(Throwable th2) {
        int i10 = this.f21984Y;
        Object obj = this.f21985Z;
        switch (i10) {
            case 17:
                ((AbstractC1070k) obj).resumeWith(y.f36177a);
                return;
            case 18:
                ((Wg.i) obj).c();
                return;
            default:
                AbstractC2469q0.p(obj);
                throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0695, code lost:
        if (r1.equals("hashCode") == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x06dc, code lost:
        if (r1.equals("toString") != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06de, code lost:
        r0 = ((java.util.ArrayList) r0.e()).isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06e8, code lost:
        if (r0 != false) goto L238;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z10;
        D d10;
        boolean z11;
        boolean z12;
        Object obj2;
        I a5;
        C6862i c6862i;
        AbstractC0997f c10;
        Bg.I i10;
        Set W12;
        y yVar = y.f36177a;
        int i11 = this.f21984Y;
        AbstractC2201i abstractC2201i = null;
        Object obj3 = this.f21985Z;
        switch (i11) {
            case 0:
                E e10 = (E) obj;
                AbstractC3557B.c0("typeParameter", e10);
                g gVar = (g) obj3;
                Integer num = (Integer) gVar.f21989d.get(e10);
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                z zVar = gVar.f21986a;
                AbstractC3557B.c0("<this>", zVar);
                z zVar2 = new z((a) zVar.f45394a, gVar, (AbstractC3957g) zVar.f45396c);
                AbstractC1003l abstractC1003l = gVar.f21987b;
                return new J(R4.b.Z(zVar2, abstractC1003l.getAnnotations()), e10, gVar.f21988c + intValue, abstractC1003l);
            case 1:
                Sf.z zVar3 = (Sf.z) obj;
                AbstractC3557B.c0("m", zVar3);
                if (((Boolean) ((C1689a) obj3).f22316b.invoke(zVar3)).booleanValue()) {
                    Class<?> declaringClass = ((Method) zVar3.a()).getDeclaringClass();
                    AbstractC3557B.b0("getDeclaringClass(...)", declaringClass);
                    if (declaringClass.isInterface()) {
                        String b10 = zVar3.b().b();
                        int hashCode = b10.hashCode();
                        if (hashCode != -1776922004) {
                            if (hashCode != -1295482945) {
                                if (hashCode == 147696667) {
                                    break;
                                }
                            } else if (b10.equals("equals")) {
                                F f6 = (F) t.D2(zVar3.e());
                                if (f6 != null) {
                                    d10 = f6.f16593a;
                                } else {
                                    d10 = null;
                                }
                                if (d10 instanceof AbstractC2201i) {
                                    abstractC2201i = (AbstractC2201i) d10;
                                }
                                if (abstractC2201i != null) {
                                    u uVar = ((s) abstractC2201i).f16624b;
                                    if (uVar instanceof AbstractC2199g) {
                                        boolean z13 = AbstractC3557B.K(((q) ((AbstractC2199g) uVar)).b().b(), "java.lang.Object");
                                        break;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                        return Boolean.valueOf(z10);
                    }
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
                z10 = false;
                return Boolean.valueOf(z10);
            case 2:
                AbstractC3557B.c0("it", (Cg.i) obj);
                C1697i c1697i = (C1697i) obj3;
                z zVar4 = c1697i.f22347p0;
                if (c1697i.f22346o0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new Yf.o(zVar4, c1697i, c1697i.f22345n0, z11, c1697i.f22354w0);
            case 3:
                C2424o c2424o = (C2424o) obj;
                AbstractC3557B.c0("$this$function", c2424o);
                ((dg.q) obj3).getClass();
                String concat = "java/util/".concat("Spliterator");
                C2412c c2412c = AbstractC2418i.f26637b;
                c2424o.b(concat, c2412c, c2412c);
                return yVar;
            case 4:
                AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
                AbstractC3557B.c0("it", abstractC0994c);
                A type = ((c0) ((h0) abstractC0994c.S().get(((b0) ((h0) obj3)).f14081k0))).getType();
                AbstractC3557B.b0("getType(...)", type);
                return type;
            case 5:
                AbstractC2653B abstractC2653B = (AbstractC2653B) obj;
                AbstractC3557B.c0("kotlinClass", abstractC2653B);
                AbstractC2666f abstractC2666f = (AbstractC2666f) obj3;
                abstractC2666f.getClass();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                C2664d c2664d = new C2664d(abstractC2666f, hashMap, hashMap2);
                Class cls = ((Rf.c) abstractC2653B).f15499a;
                AbstractC3557B.c0("klass", cls);
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC3557B.b0("getDeclaredMethods(...)", declaredMethods);
                int length = declaredMethods.length;
                int i12 = 0;
                while (true) {
                    String str = "toString(...)";
                    String str2 = "getParameterTypes(...)";
                    String str3 = Separators.LPAREN;
                    if (i12 < length) {
                        Method method = declaredMethods[i12];
                        C4294f e11 = C4294f.e(method.getName());
                        StringBuilder sb2 = new StringBuilder(str3);
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC3557B.b0(str2, parameterTypes);
                        int length2 = parameterTypes.length;
                        int i13 = 0;
                        while (i13 < length2) {
                            Class<?> cls2 = parameterTypes[i13];
                            AbstractC3557B.Z(cls2);
                            sb2.append(AbstractC1385d.b(cls2));
                            i13++;
                            declaredMethods = declaredMethods;
                        }
                        Method[] methodArr = declaredMethods;
                        sb2.append(Separators.RPAREN);
                        Class<?> returnType = method.getReturnType();
                        AbstractC3557B.b0("getReturnType(...)", returnType);
                        sb2.append(AbstractC1385d.b(returnType));
                        String sb3 = sb2.toString();
                        AbstractC3557B.b0(str, sb3);
                        C2662b a10 = c2664d.a(e11, sb3);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        AbstractC3557B.b0("getDeclaredAnnotations(...)", declaredAnnotations);
                        for (Annotation annotation : declaredAnnotations) {
                            AbstractC3557B.Z(annotation);
                            Class k12 = R4.b.k1(R4.b.d1(annotation));
                            dg.y b11 = a10.b(AbstractC1385d.a(k12), new Rf.a(annotation));
                            if (b11 != null) {
                                AbstractC4344b.R0(b11, annotation, k12);
                            }
                        }
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        AbstractC3557B.b0("getParameterAnnotations(...)", parameterAnnotations);
                        Annotation[][] annotationArr = parameterAnnotations;
                        int length3 = annotationArr.length;
                        int i14 = 0;
                        while (i14 < length3) {
                            Annotation[] annotationArr2 = annotationArr[i14];
                            AbstractC3557B.Z(annotationArr2);
                            int length4 = annotationArr2.length;
                            int i15 = 0;
                            while (i15 < length4) {
                                Annotation annotation2 = annotationArr2[i15];
                                Annotation[][] annotationArr3 = annotationArr;
                                Class k13 = R4.b.k1(R4.b.d1(annotation2));
                                int i16 = length3;
                                int i17 = length;
                                C2672l c11 = a10.c(i14, AbstractC1385d.a(k13), new Rf.a(annotation2));
                                if (c11 != null) {
                                    AbstractC4344b.R0(c11, annotation2, k13);
                                }
                                i15++;
                                length3 = i16;
                                annotationArr = annotationArr3;
                                length = i17;
                            }
                            i14++;
                            annotationArr = annotationArr;
                        }
                        a10.a();
                        i12++;
                        length = length;
                        declaredMethods = methodArr;
                    } else {
                        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                        AbstractC3557B.b0("getDeclaredConstructors(...)", declaredConstructors);
                        int length5 = declaredConstructors.length;
                        int i18 = 0;
                        while (i18 < length5) {
                            Constructor<?> constructor = declaredConstructors[i18];
                            C4294f c4294f = AbstractC4296h.f37515e;
                            AbstractC3557B.Z(constructor);
                            StringBuilder sb4 = new StringBuilder(str3);
                            Constructor<?>[] constructorArr = declaredConstructors;
                            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                            AbstractC3557B.b0(str2, parameterTypes2);
                            int i19 = length5;
                            int length6 = parameterTypes2.length;
                            String str4 = str2;
                            int i20 = 0;
                            while (i20 < length6) {
                                Class<?> cls3 = parameterTypes2[i20];
                                AbstractC3557B.Z(cls3);
                                sb4.append(AbstractC1385d.b(cls3));
                                i20++;
                                parameterTypes2 = parameterTypes2;
                            }
                            sb4.append(")V");
                            String sb5 = sb4.toString();
                            AbstractC3557B.b0(str, sb5);
                            C2662b a11 = c2664d.a(c4294f, sb5);
                            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                            AbstractC3557B.b0("getDeclaredAnnotations(...)", declaredAnnotations2);
                            int length7 = declaredAnnotations2.length;
                            int i21 = 0;
                            while (i21 < length7) {
                                Annotation annotation3 = declaredAnnotations2[i21];
                                AbstractC3557B.Z(annotation3);
                                Annotation[] annotationArr4 = declaredAnnotations2;
                                Class k14 = R4.b.k1(R4.b.d1(annotation3));
                                int i22 = length7;
                                String str5 = str;
                                dg.y b12 = a11.b(AbstractC1385d.a(k14), new Rf.a(annotation3));
                                if (b12 != null) {
                                    AbstractC4344b.R0(b12, annotation3, k14);
                                }
                                i21++;
                                length7 = i22;
                                declaredAnnotations2 = annotationArr4;
                                str = str5;
                            }
                            String str6 = str;
                            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                            AbstractC3557B.Z(parameterAnnotations2);
                            if (parameterAnnotations2.length == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                int length8 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                                int length9 = parameterAnnotations2.length;
                                int i23 = 0;
                                while (i23 < length9) {
                                    Annotation[] annotationArr5 = parameterAnnotations2[i23];
                                    AbstractC3557B.Z(annotationArr5);
                                    int length10 = annotationArr5.length;
                                    Annotation[][] annotationArr6 = parameterAnnotations2;
                                    int i24 = 0;
                                    while (i24 < length10) {
                                        int i25 = length9;
                                        Annotation annotation4 = annotationArr5[i24];
                                        Annotation[] annotationArr7 = annotationArr5;
                                        Class k15 = R4.b.k1(R4.b.d1(annotation4));
                                        int i26 = length10;
                                        int i27 = length8;
                                        String str7 = str3;
                                        C2672l c12 = a11.c(i23 + length8, AbstractC1385d.a(k15), new Rf.a(annotation4));
                                        if (c12 != null) {
                                            AbstractC4344b.R0(c12, annotation4, k15);
                                        }
                                        i24++;
                                        length9 = i25;
                                        length10 = i26;
                                        annotationArr5 = annotationArr7;
                                        length8 = i27;
                                        str3 = str7;
                                    }
                                    i23++;
                                    parameterAnnotations2 = annotationArr6;
                                    length8 = length8;
                                }
                            }
                            a11.a();
                            i18++;
                            declaredConstructors = constructorArr;
                            length5 = i19;
                            str2 = str4;
                            str = str6;
                            str3 = str3;
                        }
                        Field[] declaredFields = cls.getDeclaredFields();
                        AbstractC3557B.b0("getDeclaredFields(...)", declaredFields);
                        int length11 = declaredFields.length;
                        int i28 = 0;
                        while (i28 < length11) {
                            Field field = declaredFields[i28];
                            C4294f e12 = C4294f.e(field.getName());
                            Class<?> type2 = field.getType();
                            AbstractC3557B.b0("getType(...)", type2);
                            String b13 = AbstractC1385d.b(type2);
                            AbstractC3557B.c0("desc", b13);
                            String b14 = e12.b();
                            AbstractC3557B.b0("asString(...)", b14);
                            C2656E i29 = Cf.k.i(b14, b13);
                            ArrayList arrayList = new ArrayList();
                            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                            AbstractC3557B.b0("getDeclaredAnnotations(...)", declaredAnnotations3);
                            int length12 = declaredAnnotations3.length;
                            int i30 = 0;
                            while (i30 < length12) {
                                Annotation annotation5 = declaredAnnotations3[i30];
                                AbstractC3557B.Z(annotation5);
                                Class k16 = R4.b.k1(R4.b.d1(annotation5));
                                Field[] fieldArr = declaredFields;
                                int i31 = length11;
                                Annotation[] annotationArr8 = declaredAnnotations3;
                                C2672l q10 = c2664d.f28309a.q(AbstractC1385d.a(k16), new Rf.a(annotation5), arrayList);
                                if (q10 != null) {
                                    AbstractC4344b.R0(q10, annotation5, k16);
                                }
                                i30++;
                                declaredFields = fieldArr;
                                length11 = i31;
                                declaredAnnotations3 = annotationArr8;
                            }
                            Field[] fieldArr2 = declaredFields;
                            int i32 = length11;
                            if (!arrayList.isEmpty()) {
                                c2664d.f28310b.put(i29, arrayList);
                            }
                            i28++;
                            declaredFields = fieldArr2;
                            length11 = i32;
                        }
                        return new C2668h(hashMap, hashMap2, hashMap3);
                    }
                }
            case 6:
                AbstractC3557B.Z(obj);
                ((Ig.g) obj3).add(obj);
                return yVar;
            case 7:
                return a((B) obj);
            case 8:
                return a((B) obj);
            case 9:
                C4291c c4291c = (C4291c) obj;
                AbstractC3557B.c0("fqName", c4291c);
                AbstractC6446a abstractC6446a = (AbstractC6446a) obj3;
                C6587d d11 = abstractC6446a.d(c4291c);
                if (d11 == null) {
                    return null;
                }
                m mVar = abstractC6446a.f49990d;
                if (mVar != null) {
                    d11.x0(mVar);
                    return d11;
                }
                AbstractC3557B.C2("components");
                throw null;
            case 10:
                C6454i c6454i = (C6454i) obj;
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, c6454i);
                C6455j c6455j = (C6455j) obj3;
                Set set = C6455j.f50006c;
                c6455j.getClass();
                m mVar2 = c6455j.f50007a;
                Iterator it = mVar2.f50020k.iterator();
                do {
                    boolean hasNext = it.hasNext();
                    C4290b c4290b = c6454i.f50004a;
                    if (hasNext) {
                        c10 = ((Of.c) it.next()).c(c4290b);
                    } else if (C6455j.f50006c.contains(c4290b)) {
                        return null;
                    } else {
                        C6452g c6452g = c6454i.f50005b;
                        if (c6452g == null && (c6452g = mVar2.f50013d.a(c4290b)) == null) {
                            return null;
                        }
                        C4290b f10 = c4290b.f();
                        AbstractC3428g abstractC3428g = c6452g.f50000a;
                        C3042j c3042j = c6452g.f50001b;
                        AbstractC3423b abstractC3423b = c6452g.f50002c;
                        if (f10 != null) {
                            AbstractC0997f abstractC0997f = (AbstractC0997f) c6455j.f50008b.invoke(new C6454i(f10, null));
                            if (abstractC0997f instanceof C6862i) {
                                c6862i = (C6862i) abstractC0997f;
                            } else {
                                c6862i = null;
                            }
                            if (c6862i == null) {
                                return null;
                            }
                            C4294f i33 = c4290b.i();
                            AbstractC3557B.b0("getShortClassName(...)", i33);
                            if (!c6862i.x0().m().contains(i33)) {
                                return null;
                            }
                            a5 = c6862i.f52045q0;
                        } else {
                            C4291c g10 = c4290b.g();
                            AbstractC3557B.b0("getPackageFqName(...)", g10);
                            Iterator it2 = r.f.R(mVar2.f50015f, g10).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    G g11 = (G) obj2;
                                    if (g11 instanceof xg.q) {
                                        xg.q qVar = (xg.q) g11;
                                        C4294f i34 = c4290b.i();
                                        AbstractC3557B.b0("getShortClassName(...)", i34);
                                        qVar.getClass();
                                        if (((p) qVar.R()).m().contains(i34)) {
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            G g12 = (G) obj2;
                            if (g12 == null) {
                                return null;
                            }
                            X x10 = c3042j.f30643J0;
                            AbstractC3557B.b0("getTypeTable(...)", x10);
                            C3430i c3430i = new C3430i(x10);
                            e0 e0Var = c3042j.f30645L0;
                            AbstractC3557B.b0("getVersionRequirementTable(...)", e0Var);
                            a5 = c6455j.f50007a.a(g12, abstractC3428g, c3430i, C3431j.c(e0Var), abstractC3423b, null);
                        }
                        return new C6862i(a5, c3042j, abstractC3428g, abstractC3423b, c6452g.f50003d);
                    }
                } while (c10 == null);
                return c10;
            case 11:
                AbstractC3557B.c0("it", (C4290b) obj);
                AbstractC6864k abstractC6864k = ((xg.q) obj3).f50036m0;
                if (abstractC6864k == null) {
                    return V.f12075a;
                }
                return abstractC6864k;
            case 12:
                Cg.i iVar = (Cg.i) obj;
                AbstractC3557B.c0("kotlinTypeRefiner", iVar);
                return ((C0232z) obj3).d(iVar).b();
            case 13:
                Bg.b0 b0Var = (Bg.b0) obj;
                Bg.c0 c0Var = (Bg.c0) obj3;
                Mf.b0 b0Var2 = b0Var.f2104a;
                c0Var.getClass();
                AbstractC0210c abstractC0210c = b0Var.f2105b;
                Zf.a aVar = (Zf.a) abstractC0210c;
                Set set2 = aVar.f23717e;
                if (set2 != null && set2.contains(b0Var2.mo24a())) {
                    return c0Var.a(abstractC0210c);
                }
                Bg.D n10 = b0Var2.n();
                AbstractC3557B.b0("getDefaultType(...)", n10);
                LinkedHashSet<Mf.b0> linkedHashSet = new LinkedHashSet();
                Bi.c.M0(n10, n10, linkedHashSet, set2);
                int n02 = P4.a.n0(AbstractC6583a.H1(linkedHashSet, 10));
                if (n02 < 16) {
                    n02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
                for (Mf.b0 b0Var3 : linkedHashSet) {
                    if (set2 != null && set2.contains(b0Var3)) {
                        i10 = m0.l(b0Var3, abstractC0210c);
                    } else {
                        Set set3 = aVar.f23717e;
                        if (set3 != null) {
                            W12 = AbstractC4273I.v2(set3, b0Var2);
                        } else {
                            W12 = R4.b.W1(b0Var2);
                        }
                        A b15 = c0Var.b(b0Var3, Zf.a.f(aVar, null, false, W12, null, 47));
                        c0Var.f2106a.getClass();
                        i10 = P5.c.t(b0Var3, abstractC0210c, c0Var, b15);
                    }
                    linkedHashMap.put(b0Var3.f(), i10);
                }
                C3431j c3431j = a0.f2103b;
                j0 e13 = j0.e(new Z(linkedHashMap, false));
                List upperBounds = b0Var2.getUpperBounds();
                AbstractC3557B.b0("getUpperBounds(...)", upperBounds);
                C4442g c13 = c0Var.c(e13, upperBounds, abstractC0210c);
                if (!c13.f38329Y.isEmpty()) {
                    if (!c0Var.f2107b.f1627b) {
                        if (c13.f38329Y.f38320n0 == 1) {
                            return (A) t.A2(c13);
                        }
                        throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
                    }
                    List<A> K22 = t.K2(c13);
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(K22, 10));
                    for (A a12 : K22) {
                        arrayList2.add(a12.B0());
                    }
                    return AbstractC3557B.F1(arrayList2);
                }
                return c0Var.a(abstractC0210c);
            case 14:
                AbstractC3557B.c0("it", (String) obj);
                return Integer.valueOf(((P) obj3).f2083b.getAndIncrement());
            case 15:
                return ((Lg.f) obj3).s(((Number) obj).intValue());
            case 16:
                Cf.g gVar2 = (Cf.g) obj;
                AbstractC3557B.c0("it", gVar2);
                return Lg.n.L2((CharSequence) obj3, gVar2);
            case 17:
                f((Throwable) obj);
                return yVar;
            case 18:
                f((Throwable) obj);
                return yVar;
            case 19:
            default:
                Handler.Callback callback = (Handler.Callback) obj;
                switch (i11) {
                    case 28:
                        return (Handler.Callback) ((C2700f0) obj3).f28449h0;
                    default:
                        ((hh.t) obj3).f32385e = new C2700f0(this, 3, callback);
                        return new r(this, callback);
                }
            case 20:
                e((C2211a) obj);
                return yVar;
            case 21:
                e((C2211a) obj);
                return yVar;
            case 22:
                return c(((Number) obj).intValue());
            case 23:
                e((C2211a) obj);
                return yVar;
            case 24:
                return c(((Number) obj).intValue());
            case 25:
                e((C2211a) obj);
                return yVar;
            case 26:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
                AbstractC3557B.c0("node", bVar);
                AbstractC3077d abstractC3077d = (AbstractC3077d) obj3;
                abstractC3077d.K((String) t.o2(abstractC3077d.f28435a), bVar);
                return yVar;
            case 27:
                AbstractC3557B.c0("it", (List) obj);
                return (KSerializer) obj3;
            case 28:
                Handler.Callback callback2 = (Handler.Callback) obj;
                switch (i11) {
                    case 28:
                        return (Handler.Callback) ((C2700f0) obj3).f28449h0;
                    default:
                        ((hh.t) obj3).f32385e = new C2700f0(this, 3, callback2);
                        return new r(this, callback2);
                }
        }
    }
}
