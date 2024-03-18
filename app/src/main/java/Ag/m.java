package Ag;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public class m implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final q f860Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ConcurrentMap f861Z;

    /* renamed from: h0  reason: collision with root package name */
    public final wf.k f862h0;

    public m(q qVar, ConcurrentHashMap concurrentHashMap, wf.k kVar) {
        if (qVar != null) {
            this.f860Y = qVar;
            this.f861Z = concurrentHashMap;
            this.f862h0 = kVar;
            return;
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 4) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                }
            } else {
                objArr[0] = "compute";
            }
        } else {
            objArr[0] = "map";
        }
        if (i10 != 3) {
            if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
        } else {
            objArr[1] = "recursionDetected";
        }
        if (i10 != 3 && i10 != 4) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 3 || i10 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public final AssertionError c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + o.f864Z + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f860Y);
        q.f(assertionError);
        return assertionError;
    }

    public final AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f860Y);
        q.f(assertionError);
        return assertionError;
    }

    public final AssertionError f(Object obj, Throwable th2) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f860Y, th2);
        q.f(assertionError);
        return assertionError;
    }

    @Override // wf.k
    public Object invoke(Object obj) {
        ConcurrentMap concurrentMap = this.f861Z;
        Object obj2 = concurrentMap.get(obj);
        o oVar = o.f864Z;
        Object obj3 = Ig.i.f8606a;
        Object obj4 = null;
        if (obj2 != null && obj2 != oVar) {
            Ig.i.k(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        q qVar = this.f860Y;
        t tVar = qVar.f871a;
        t tVar2 = qVar.f871a;
        tVar.b();
        try {
            Object obj5 = concurrentMap.get(obj);
            o oVar2 = o.f865h0;
            if (obj5 == oVar) {
                p e10 = qVar.e("", obj);
                if (e10 != null) {
                    if (!e10.f868b) {
                        Object obj6 = e10.f867a;
                        tVar2.a();
                        return obj6;
                    }
                    obj5 = oVar2;
                } else {
                    a(3);
                    throw null;
                }
            }
            if (obj5 == oVar2) {
                p e11 = qVar.e("", obj);
                if (e11 != null) {
                    if (!e11.f868b) {
                        Object obj7 = e11.f867a;
                        tVar2.a();
                        return obj7;
                    }
                } else {
                    a(3);
                    throw null;
                }
            }
            if (obj5 != null) {
                Ig.i.k(obj5);
                if (obj5 != obj3) {
                    obj4 = obj5;
                }
                tVar2.a();
                return obj4;
            }
            concurrentMap.put(obj, oVar);
            Object invoke = this.f862h0.invoke(obj);
            if (invoke != null) {
                obj3 = invoke;
            }
            Object put = concurrentMap.put(obj, obj3);
            if (put == oVar) {
                tVar2.a();
                return invoke;
            }
            throw e(obj, put);
        } catch (Throwable th2) {
            tVar2.a();
            throw th2;
        }
    }
}
