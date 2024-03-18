package I3;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w.C6059f;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final C6059f f8023a;

    /* renamed from: b  reason: collision with root package name */
    public final C6059f f8024b;

    /* renamed from: c  reason: collision with root package name */
    public final C6059f f8025c;

    public a(C6059f c6059f, C6059f c6059f2, C6059f c6059f3) {
        this.f8023a = c6059f;
        this.f8024b = c6059f2;
        this.f8025c = c6059f3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C6059f c6059f = this.f8025c;
        Class cls2 = (Class) c6059f.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + Separators.DOT + simpleName + "Parcelizer", false, cls.getClassLoader());
            c6059f.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        C6059f c6059f = this.f8023a;
        Method method = (Method) c6059f.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            c6059f.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C6059f c6059f = this.f8024b;
        Method method = (Method) c6059f.get(name);
        if (method == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
            c6059f.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i10);

    public final Parcelable f(Parcelable parcelable, int i10) {
        if (!e(i10)) {
            return parcelable;
        }
        return ((b) this).f8027e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f8027e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void h(int i10);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f8027e.writeString(null);
            return;
        }
        try {
            ((b) this).f8027e.writeString(b(cVar.getClass()).getName());
            b a5 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a5);
                int i10 = a5.f8031i;
                if (i10 >= 0) {
                    int i11 = a5.f8026d.get(i10);
                    Parcel parcel = a5.f8027e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i11);
                    parcel.writeInt(dataPosition - i11);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
