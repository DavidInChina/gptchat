package Sg;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import jf.C3959i;
import jf.C3960j;
import me.C4634g;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f16661a = b(Throwable.class, -1);

    static {
        F f6 = F.f16640g;
        try {
            int i10 = l.f16662a;
        } catch (Throwable unused) {
            F f10 = F.f16640g;
        }
    }

    public static final wf.k a(Class cls) {
        Object obj;
        wf.k kVar;
        C3959i c3959i;
        j jVar = j.f16660Y;
        if (f16661a == b(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                obj = null;
                if (i10 >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i10];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        if (length2 != 2) {
                            c3959i = new C3959i(null, -1);
                        } else if (AbstractC3557B.K(parameterTypes[0], String.class) && AbstractC3557B.K(parameterTypes[1], Throwable.class)) {
                            c3959i = new C3959i(new C4634g(3, new io.ktor.utils.io.D(constructor, 4)), 3);
                        } else {
                            c3959i = new C3959i(null, -1);
                        }
                    } else {
                        Class<?> cls2 = parameterTypes[0];
                        if (AbstractC3557B.K(cls2, String.class)) {
                            c3959i = new C3959i(new C4634g(3, new io.ktor.utils.io.D(constructor, 5)), 2);
                        } else if (AbstractC3557B.K(cls2, Throwable.class)) {
                            c3959i = new C3959i(new C4634g(3, new io.ktor.utils.io.D(constructor, 6)), 1);
                        } else {
                            c3959i = new C3959i(null, -1);
                        }
                    }
                } else {
                    c3959i = new C3959i(new C4634g(3, new io.ktor.utils.io.D(constructor, 7)), 0);
                }
                arrayList.add(c3959i);
                i10++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((C3959i) obj).f36156Z).intValue();
                    do {
                        Object next = it.next();
                        int intValue2 = ((Number) ((C3959i) next).f36156Z).intValue();
                        if (intValue < intValue2) {
                            obj = next;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            C3959i c3959i2 = (C3959i) obj;
            if (c3959i2 != null && (kVar = (wf.k) c3959i2.f36155Y) != null) {
                return kVar;
            }
            return jVar;
        }
        return jVar;
    }

    public static final int b(Class cls, int i10) {
        Object obj;
        Field[] declaredFields;
        R4.b.n1(cls);
        int i11 = 0;
        do {
            try {
                int length = cls.getDeclaredFields().length;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    if (!Modifier.isStatic(declaredFields[i13].getModifiers())) {
                        i12++;
                    }
                }
                i11 += i12;
                cls = cls.getSuperclass();
            } catch (Throwable th2) {
                obj = N.w(th2);
            }
        } while (cls != null);
        obj = Integer.valueOf(i11);
        Object valueOf = Integer.valueOf(i10);
        if (obj instanceof C3960j) {
            obj = valueOf;
        }
        return ((Number) obj).intValue();
    }
}
