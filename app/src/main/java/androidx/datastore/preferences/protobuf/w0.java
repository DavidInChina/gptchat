package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f25125a;

    public w0(Unsafe unsafe) {
        this.f25125a = unsafe;
    }

    public final int a(Class cls) {
        return this.f25125a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f25125a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j6, Object obj);

    public abstract byte d(long j6, Object obj);

    public abstract double e(long j6, Object obj);

    public abstract float f(long j6, Object obj);

    public final int g(long j6, Object obj) {
        return this.f25125a.getInt(obj, j6);
    }

    public final long h(long j6, Object obj) {
        return this.f25125a.getLong(obj, j6);
    }

    public final Object i(long j6, Object obj) {
        return this.f25125a.getObject(obj, j6);
    }

    public final long j(Field field) {
        return this.f25125a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j6, boolean z10);

    public abstract void l(Object obj, long j6, byte b10);

    public abstract void m(Object obj, long j6, double d10);

    public abstract void n(Object obj, long j6, float f6);

    public final void o(long j6, Object obj, int i10) {
        this.f25125a.putInt(obj, j6, i10);
    }

    public final void p(Object obj, long j6, long j10) {
        this.f25125a.putLong(obj, j6, j10);
    }

    public final void q(long j6, Object obj, Object obj2) {
        this.f25125a.putObject(obj, j6, obj2);
    }
}
