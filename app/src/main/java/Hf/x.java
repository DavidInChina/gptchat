package Hf;

import com.google.android.gms.internal.play_billing.N;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class x implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Member f7729a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f7730b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f7731c;

    /* renamed from: d  reason: collision with root package name */
    public final List f7732d;

    public x(Member member, Type type, Class cls, Type[] typeArr) {
        List list;
        this.f7729a = member;
        this.f7730b = type;
        this.f7731c = cls;
        if (cls != null) {
            G2.d dVar = new G2.d(2);
            dVar.f(cls);
            dVar.g(typeArr);
            ArrayList arrayList = dVar.f5857a;
            list = AbstractC4344b.G0(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            list = kf.q.z3(typeArr);
        }
        this.f7732d = list;
    }

    @Override // Hf.g
    public final List a() {
        return this.f7732d;
    }

    @Override // Hf.g
    public final Member b() {
        return this.f7729a;
    }

    public void c(Object[] objArr) {
        N.f(this, objArr);
    }

    public final void d(Object obj) {
        if (obj != null && this.f7729a.getDeclaringClass().isInstance(obj)) {
            return;
        }
        throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
    }

    @Override // Hf.g
    public final Type getReturnType() {
        return this.f7730b;
    }
}
