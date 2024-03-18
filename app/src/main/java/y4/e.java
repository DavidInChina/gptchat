package y4;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: c  reason: collision with root package name */
    public final b f50722c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f50720a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f50721b = false;

    /* renamed from: d  reason: collision with root package name */
    public float f50723d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public Object f50724e = null;

    /* renamed from: f  reason: collision with root package name */
    public float f50725f = -1.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f50726g = -1.0f;

    public e(List list) {
        b bVar;
        b cVar;
        if (list.isEmpty()) {
            bVar = new i4.k((Object) null);
        } else {
            if (list.size() == 1) {
                cVar = new d(list);
            } else {
                cVar = new c(list);
            }
            bVar = cVar;
        }
        this.f50722c = bVar;
    }

    public final void a(AbstractC6541a abstractC6541a) {
        this.f50720a.add(abstractC6541a);
    }

    public final float b() {
        J4.a c10 = this.f50722c.c();
        if (c10 != null && !c10.c()) {
            return c10.f8841d.getInterpolation(c());
        }
        return 0.0f;
    }

    public final float c() {
        if (this.f50721b) {
            return 0.0f;
        }
        J4.a c10 = this.f50722c.c();
        if (c10.c()) {
            return 0.0f;
        }
        return (this.f50723d - c10.b()) / (c10.a() - c10.b());
    }

    public Object d() {
        Object obj;
        Interpolator interpolator;
        float c10 = c();
        b bVar = this.f50722c;
        if (bVar.b(c10)) {
            return this.f50724e;
        }
        J4.a c11 = bVar.c();
        Interpolator interpolator2 = c11.f8842e;
        if (interpolator2 != null && (interpolator = c11.f8843f) != null) {
            obj = f(c11, c10, interpolator2.getInterpolation(c10), interpolator.getInterpolation(c10));
        } else {
            obj = e(c11, b());
        }
        this.f50724e = obj;
        return obj;
    }

    public abstract Object e(J4.a aVar, float f6);

    public Object f(J4.a aVar, float f6, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void g(float f6) {
        b bVar = this.f50722c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f50725f == -1.0f) {
            this.f50725f = bVar.f();
        }
        float f10 = this.f50725f;
        if (f6 < f10) {
            if (f10 == -1.0f) {
                this.f50725f = bVar.f();
            }
            f6 = this.f50725f;
        } else {
            if (this.f50726g == -1.0f) {
                this.f50726g = bVar.e();
            }
            float f11 = this.f50726g;
            if (f6 > f11) {
                if (f11 == -1.0f) {
                    this.f50726g = bVar.e();
                }
                f6 = this.f50726g;
            }
        }
        if (f6 == this.f50723d) {
            return;
        }
        this.f50723d = f6;
        if (bVar.d(f6)) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f50720a;
                if (i10 < arrayList.size()) {
                    ((AbstractC6541a) arrayList.get(i10)).a();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
