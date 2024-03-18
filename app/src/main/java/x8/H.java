package x8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class H extends r.f {

    /* renamed from: f  reason: collision with root package name */
    public Object[] f49513f = new Object[4];

    /* renamed from: g  reason: collision with root package name */
    public int f49514g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f49515h;

    public H() {
        AbstractC4344b.T(4, "initialCapacity");
    }

    public final void d0(Object obj) {
        obj.getClass();
        h0(this.f49514g + 1);
        Object[] objArr = this.f49513f;
        int i10 = this.f49514g;
        this.f49514g = i10 + 1;
        objArr[i10] = obj;
    }

    public void e0(Object obj) {
        d0(obj);
    }

    public final H f0(List list) {
        if (list instanceof Collection) {
            h0(list.size() + this.f49514g);
            if (list instanceof I) {
                this.f49514g = ((I) list).r(this.f49514g, this.f49513f);
                return this;
            }
        }
        for (Object obj : list) {
            d(obj);
        }
        return this;
    }

    public void g0(N n10) {
        f0(n10);
    }

    public final void h0(int i10) {
        Object[] objArr = this.f49513f;
        if (objArr.length < i10) {
            this.f49513f = Arrays.copyOf(objArr, r.f.x(objArr.length, i10));
            this.f49515h = false;
        } else if (this.f49515h) {
            this.f49513f = (Object[]) objArr.clone();
            this.f49515h = false;
        }
    }
}
