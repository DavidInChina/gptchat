package n2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import s7.C5583d;

/* renamed from: n2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4710a extends E implements o2.c {

    /* renamed from: n  reason: collision with root package name */
    public final o2.b f39596n;

    /* renamed from: o  reason: collision with root package name */
    public AbstractC2086v f39597o;

    /* renamed from: p  reason: collision with root package name */
    public C4711b f39598p;

    /* renamed from: l  reason: collision with root package name */
    public final int f39594l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f39595m = null;

    /* renamed from: q  reason: collision with root package name */
    public o2.b f39599q = null;

    public C4710a(C5583d c5583d) {
        this.f39596n = c5583d;
        if (c5583d.f40513b == null) {
            c5583d.f40513b = this;
            c5583d.f40512a = 0;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // androidx.lifecycle.E
    public final void e() {
        o2.b bVar = this.f39596n;
        bVar.f40514c = true;
        bVar.f40516e = false;
        bVar.f40515d = false;
        C5583d c5583d = (C5583d) bVar;
        c5583d.f45431j.drainPermits();
        c5583d.c();
    }

    @Override // androidx.lifecycle.E
    public final void f() {
        this.f39596n.f40514c = false;
    }

    @Override // androidx.lifecycle.E
    public final void h(F f6) {
        super.h(f6);
        this.f39597o = null;
        this.f39598p = null;
    }

    @Override // androidx.lifecycle.E
    public final void i(Object obj) {
        super.i(obj);
        o2.b bVar = this.f39599q;
        if (bVar != null) {
            bVar.f40516e = true;
            bVar.f40514c = false;
            bVar.f40515d = false;
            bVar.f40517f = false;
            this.f39599q = null;
        }
    }

    public final void j() {
        AbstractC2086v abstractC2086v = this.f39597o;
        C4711b c4711b = this.f39598p;
        if (abstractC2086v != null && c4711b != null) {
            super.h(c4711b);
            d(abstractC2086v, c4711b);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #");
        sb2.append(this.f39594l);
        sb2.append(" : ");
        Class<?> cls = this.f39596n.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
