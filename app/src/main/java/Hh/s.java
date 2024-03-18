package hh;

import android.app.Service;
import android.os.IBinder;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Jb.c f32379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f32380b;

    public s(Jb.c cVar, Object obj) {
        this.f32379a = cVar;
        this.f32380b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Service service;
        AbstractC3557B.Y("method", method);
        if (AbstractC3557B.K("serviceDoneExecuting", method.getName())) {
            if (objArr != null) {
                Object obj2 = objArr[0];
                if (obj2 != null) {
                    IBinder iBinder = (IBinder) obj2;
                    Jb.c cVar = this.f32379a;
                    if (((t) cVar.f8970Z).f32381a.containsKey(iBinder)) {
                        t tVar = (t) cVar.f8970Z;
                        WeakReference weakReference = (WeakReference) tVar.f32381a.remove(iBinder);
                        if (weakReference != null && (service = (Service) weakReference.get()) != null) {
                            tVar.f32387g.a(service.getClass().getName().concat(" received Service#onDestroy() callback"), service);
                        }
                    }
                } else {
                    throw new ClassCastException("null cannot be cast to non-null type android.os.IBinder");
                }
            } else {
                AbstractC3557B.A2();
                throw null;
            }
        }
        Object obj3 = this.f32380b;
        try {
            if (objArr == null) {
                return method.invoke(obj3, new Object[0]);
            }
            return method.invoke(obj3, Arrays.copyOf(objArr, objArr.length));
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            AbstractC3557B.Y("invocationException.targetException", targetException);
            throw targetException;
        }
    }
}
