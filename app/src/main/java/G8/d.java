package G8;

import E8.f;
import E8.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements F8.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6076e = new a(0);

    /* renamed from: f  reason: collision with root package name */
    public static final b f6077f = new f() { // from class: G8.b
        @Override // E8.a
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).c((String) obj);
                    return;
                default:
                    ((g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final b f6078g = new f() { // from class: G8.b
        @Override // E8.a
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).c((String) obj);
                    return;
                default:
                    ((g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    public static final c f6079h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6080a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6081b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6082c = f6076e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6083d = false;

    public d() {
        HashMap hashMap = new HashMap();
        this.f6080a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f6081b = hashMap2;
        hashMap2.put(String.class, f6077f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f6078g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f6079h);
        hashMap.remove(Date.class);
    }

    public final F8.a a(Class cls, E8.d dVar) {
        this.f6080a.put(cls, dVar);
        this.f6081b.remove(cls);
        return this;
    }
}
