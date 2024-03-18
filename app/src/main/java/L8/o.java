package L8;

import I8.E;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f10814a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f10815b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10816c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10817d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10818e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f10819f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Method f10820g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f10821h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ E f10822i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ I8.n f10823j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TypeToken f10824k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f10825l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f10826m;

    public o(String str, Field field, boolean z10, boolean z11, boolean z12, Method method, boolean z13, E e10, I8.n nVar, TypeToken typeToken, boolean z14, boolean z15) {
        this.f10819f = z12;
        this.f10820g = method;
        this.f10821h = z13;
        this.f10822i = e10;
        this.f10823j = nVar;
        this.f10824k = typeToken;
        this.f10825l = z14;
        this.f10826m = z15;
        this.f10814a = str;
        this.f10815b = field;
        this.f10816c = field.getName();
        this.f10817d = z10;
        this.f10818e = z11;
    }

    public final void a(P8.c cVar, Object obj) {
        Object obj2;
        if (!this.f10817d) {
            return;
        }
        boolean z10 = this.f10819f;
        Field field = this.f10815b;
        Method method = this.f10820g;
        if (z10) {
            if (method == null) {
                s.b(obj, field);
            } else {
                s.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(android.gov.nist.core.a.A("Accessor ", N8.c.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        cVar.p(this.f10814a);
        boolean z11 = this.f10821h;
        E e11 = this.f10822i;
        if (!z11) {
            e11 = new w(this.f10823j, e11, this.f10824k.getType());
        }
        e11.c(cVar, obj2);
    }
}
