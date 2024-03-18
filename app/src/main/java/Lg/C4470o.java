package lg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: lg.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4470o {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4456a f38409a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38410b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4456a f38411c;

    /* renamed from: d  reason: collision with root package name */
    public final C4469n f38412d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f38413e;

    public C4470o(AbstractC4468m abstractC4468m, Object obj, p pVar, C4469n c4469n, Class cls) {
        if (abstractC4468m != null) {
            if (c4469n.f38406h0 == EnumC4454L.MESSAGE && pVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f38409a = abstractC4468m;
            this.f38410b = obj;
            this.f38411c = pVar;
            this.f38412d = c4469n;
            if (q.class.isAssignableFrom(cls)) {
                try {
                    this.f38413e = cls.getMethod("valueOf", Integer.TYPE);
                    return;
                } catch (NoSuchMethodException e10) {
                    String name = cls.getName();
                    StringBuilder sb2 = new StringBuilder(name.length() + 52);
                    sb2.append("Generated message class \"");
                    sb2.append(name);
                    sb2.append("\" missing method \"valueOf\".");
                    throw new RuntimeException(sb2.toString(), e10);
                }
            }
            this.f38413e = null;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public final Object a(Object obj) {
        if (this.f38412d.f38406h0.f38355Y == EnumC4455M.f38364n0) {
            try {
                return this.f38413e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        return obj;
    }

    public final Object b(Object obj) {
        if (this.f38412d.f38406h0.f38355Y == EnumC4455M.f38364n0) {
            return Integer.valueOf(((q) obj).a());
        }
        return obj;
    }
}
