package Sf;

import Df.AbstractC0405d;
import Gf.AbstractC0633g;
import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
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

/* renamed from: Sf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1385d {

    /* renamed from: a  reason: collision with root package name */
    public static final List f16603a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f16604b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map f16605c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map f16606d;

    static {
        int i10 = 0;
        Class cls = Boolean.TYPE;
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        List<AbstractC0405d> G02 = AbstractC4344b.G0(d10.b(cls), d10.b(Byte.TYPE), d10.b(Character.TYPE), d10.b(Double.TYPE), d10.b(Float.TYPE), d10.b(Integer.TYPE), d10.b(Long.TYPE), d10.b(Short.TYPE));
        f16603a = G02;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(G02, 10));
        for (AbstractC0405d abstractC0405d : G02) {
            arrayList.add(new C3959i(R4.b.l1(abstractC0405d), R4.b.m1(abstractC0405d)));
        }
        f16604b = AbstractC4268D.k1(arrayList);
        List<AbstractC0405d> list = f16603a;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        for (AbstractC0405d abstractC0405d2 : list) {
            arrayList2.add(new C3959i(R4.b.m1(abstractC0405d2), R4.b.l1(abstractC0405d2)));
        }
        f16605c = AbstractC4268D.k1(arrayList2);
        List G03 = AbstractC4344b.G0(AbstractC6216a.class, wf.k.class, wf.n.class, wf.o.class, wf.p.class, wf.q.class, wf.r.class, wf.s.class, wf.t.class, wf.u.class, AbstractC6217b.class, AbstractC6218c.class, AbstractC0633g.class, AbstractC6219d.class, AbstractC6220e.class, AbstractC6221f.class, AbstractC6222g.class, AbstractC6223h.class, wf.i.class, wf.j.class, wf.l.class, wf.m.class, AbstractC0633g.class);
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(G03, 10));
        for (Object obj : G03) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList3.add(new C3959i((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        f16606d = AbstractC4268D.k1(arrayList3);
    }

    public static final C4290b a(Class cls) {
        C4290b a5;
        AbstractC3557B.c0("<this>", cls);
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null && (a5 = a(declaringClass)) != null) {
                        return a5.d(C4294f.e(cls.getSimpleName()));
                    }
                    return C4290b.j(new C4291c(cls.getName()));
                }
                C4291c c4291c = new C4291c(cls.getName());
                return new C4290b(c4291c.e(), C4291c.j(c4291c.f()), true);
            }
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
    }

    public static final String b(Class cls) {
        AbstractC3557B.c0("<this>", cls);
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return TokenNames.f24313I;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return TokenNames.f24310C;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return TokenNames.f24320V;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return TokenNames.f24312F;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return TokenNames.S;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            return Lg.n.z2(cls.getName(), '.', '/');
        } else {
            return TokenNames.f24315L + Lg.n.z2(cls.getName(), '.', '/') + ';';
        }
    }

    public static final List c(Type type) {
        AbstractC3557B.c0("<this>", type);
        if (!(type instanceof ParameterizedType)) {
            return kf.v.f37483Y;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            AbstractC3557B.b0("getActualTypeArguments(...)", actualTypeArguments);
            return kf.q.z3(actualTypeArguments);
        }
        return Kg.m.p1(Kg.m.k1(Kg.p.c1(type, C1383b.f16601Y), C1384c.f16602Y));
    }

    public static final ClassLoader d(Class cls) {
        AbstractC3557B.c0("<this>", cls);
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            AbstractC3557B.b0("getSystemClassLoader(...)", systemClassLoader);
            return systemClassLoader;
        }
        return classLoader;
    }
}
