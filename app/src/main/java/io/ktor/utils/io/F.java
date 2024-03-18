package io.ktor.utils.io;

import G0.C0588q;
import Ng.AbstractC1089x;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jf.C3960j;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    public static final int f33378a = a(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantReadWriteLock f33379b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap f33380c = new WeakHashMap();

    public static final int a(Class cls, int i10) {
        Object obj;
        R4.b.n1(cls);
        int i11 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC3557B.b0("declaredFields", declaredFields);
                int i12 = 0;
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f A[EDGE_INSN: B:100:0x010f->B:61:0x010f ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable b(Throwable th2, Throwable th3) {
        Object obj;
        int i10;
        wf.k kVar;
        D d10;
        int i11;
        AbstractC3557B.c0("exception", th2);
        AbstractC3557B.c0(ParameterNames.CAUSE, th3);
        Object obj2 = null;
        if (th2 instanceof AbstractC1089x) {
            try {
                obj = ((AbstractC1089x) th2).a();
            } catch (Throwable th4) {
                obj = N.w(th4);
            }
            if (!(obj instanceof C3960j)) {
                obj2 = obj;
            }
            return (Throwable) obj2;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f33379b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        WeakHashMap weakHashMap = f33380c;
        try {
            wf.k kVar2 = (wf.k) weakHashMap.get(th2.getClass());
            if (kVar2 != null) {
                return (Throwable) kVar2.invoke(th2);
            }
            int i12 = 0;
            if (f33378a != a(th2.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i11 = reentrantReadWriteLock.getReadHoldCount();
                } else {
                    i11 = 0;
                }
                for (int i13 = 0; i13 < i11; i13++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    weakHashMap.put(th2.getClass(), E.f33375Z);
                    return null;
                } finally {
                    while (i12 < i11) {
                        readLock2.lock();
                        i12++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = th2.getClass().getConstructors();
            AbstractC3557B.b0("exception.javaClass.constructors", constructors);
            D d11 = null;
            for (Constructor constructor : kf.q.x3(constructors, new C0588q(17))) {
                AbstractC3557B.b0("constructor", constructor);
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length != 0) {
                    if (length != 1) {
                        if (length == 2 && AbstractC3557B.K(parameterTypes[0], String.class) && AbstractC3557B.K(parameterTypes[1], Throwable.class)) {
                            d10 = new D(constructor, 0);
                        }
                        d11 = null;
                        continue;
                    } else {
                        Class<?> cls = parameterTypes[0];
                        if (AbstractC3557B.K(cls, Throwable.class)) {
                            d10 = new D(constructor, 1);
                        } else {
                            if (AbstractC3557B.K(cls, String.class)) {
                                d10 = new D(constructor, 2);
                            }
                            d11 = null;
                            continue;
                        }
                    }
                    if (d11 != null) {
                        break;
                    }
                } else {
                    d10 = new D(constructor, 3);
                }
                d11 = d10;
                continue;
                if (d11 != null) {
                }
            }
            ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i10 = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i10 = 0;
            }
            for (int i14 = 0; i14 < i10; i14++) {
                readLock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                Class<?> cls2 = th2.getClass();
                if (d11 == null) {
                    kVar = E.f33376h0;
                } else {
                    kVar = d11;
                }
                weakHashMap.put(cls2, kVar);
                while (i12 < i10) {
                    readLock3.lock();
                    i12++;
                }
                writeLock2.unlock();
                if (d11 == null) {
                    return null;
                }
                return (Throwable) d11.invoke(th3);
            } catch (Throwable th5) {
                while (i12 < i10) {
                    readLock3.lock();
                    i12++;
                }
                writeLock2.unlock();
                throw th5;
            }
        } finally {
            readLock.unlock();
        }
    }
}
