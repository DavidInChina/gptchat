package L8;

import I8.E;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w extends E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10849a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10850b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10851c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f10852d;

    public w(I8.n nVar, E e10, Type type) {
        this.f10849a = 0;
        this.f10850b = nVar;
        this.f10851c = e10;
        this.f10852d = type;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        int i10 = this.f10849a;
        Object obj = this.f10851c;
        switch (i10) {
            case 0:
                return ((E) obj).b(bVar);
            default:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                String H02 = bVar.H0();
                Enum r02 = (Enum) ((Map) this.f10850b).get(H02);
                if (r02 == null) {
                    return (Enum) ((Map) obj).get(H02);
                }
                return r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if ((r2 instanceof L8.p) == false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.reflect.Type] */
    @Override // I8.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(P8.c cVar, Object obj) {
        Class<?> cls;
        E d10;
        String str;
        int i10 = this.f10849a;
        Object obj2 = this.f10852d;
        switch (i10) {
            case 0:
                E e10 = (E) this.f10851c;
                ?? r12 = (Type) obj2;
                if (obj != null && ((r12 instanceof Class) || (r12 instanceof TypeVariable))) {
                    cls = obj.getClass();
                } else {
                    cls = r12;
                }
                if (cls != r12) {
                    E f6 = ((I8.n) this.f10850b).f(TypeToken.get((Type) cls));
                    if (f6 instanceof p) {
                        E e11 = e10;
                        while ((e11 instanceof t) && (d10 = ((t) e11).d()) != e11) {
                            e11 = d10;
                        }
                        break;
                    }
                    e10 = f6;
                }
                e10.c(cVar, obj);
                return;
            default:
                Enum r62 = (Enum) obj;
                if (r62 == null) {
                    str = null;
                } else {
                    str = (String) ((Map) obj2).get(r62);
                }
                cVar.f0(str);
                return;
        }
    }

    public w(Class cls) {
        Field[] fieldArr;
        this.f10849a = 1;
        this.f10850b = new HashMap();
        this.f10851c = new HashMap();
        this.f10852d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new z(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                J8.b bVar = (J8.b) field.getAnnotation(J8.b.class);
                Object obj = this.f10850b;
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((Map) obj).put(str2, r42);
                    }
                }
                ((Map) obj).put(name, r42);
                ((Map) this.f10851c).put(str, r42);
                ((Map) this.f10852d).put(r42, name);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
