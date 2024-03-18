package ei;

import id.AbstractC3557B;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final List f29497a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f29498b;

    /* renamed from: c  reason: collision with root package name */
    public String f29499c;

    public h(ArrayList arrayList) {
        this.f29497a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC3557B.c0("proxy", obj);
        AbstractC3557B.c0("method", method);
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC3557B.K(name, "supports") && AbstractC3557B.K(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC3557B.K(name, "unsupported") && AbstractC3557B.K(Void.TYPE, returnType)) {
            this.f29498b = true;
            return null;
        }
        boolean K10 = AbstractC3557B.K(name, "protocols");
        List list = this.f29497a;
        if (K10 && objArr.length == 0) {
            return list;
        }
        if ((AbstractC3557B.K(name, "selectProtocol") || AbstractC3557B.K(name, "select")) && AbstractC3557B.K(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<*>", obj2);
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj3 = list2.get(i10);
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj3);
                        String str = (String) obj3;
                        if (list.contains(str)) {
                            this.f29499c = str;
                            return str;
                        } else if (i10 == size) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.f29499c = str2;
                return str2;
            }
        }
        if ((AbstractC3557B.K(name, "protocolSelected") || AbstractC3557B.K(name, "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj4);
            this.f29499c = (String) obj4;
            return null;
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
