package e4;

import E.J;
import android.database.Cursor;
import d4.AbstractC2596e;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import x3.w;

/* renamed from: e4.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2795c implements B3.h, AbstractC2802j {

    /* renamed from: Y  reason: collision with root package name */
    public final String f28946Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B3.b f28947Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Long f28948h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f28949i0;

    public C2795c(String str, B3.b bVar, int i10, Long l10) {
        AbstractC3557B.c0("sql", str);
        AbstractC3557B.c0("database", bVar);
        this.f28946Y = str;
        this.f28947Z = bVar;
        this.f28948h0 = l10;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(null);
        }
        this.f28949i0 = arrayList;
    }

    @Override // d4.AbstractC2598g
    public final void b(int i10, String str) {
        this.f28949i0.set(i10, new J(str, i10, 2));
    }

    @Override // e4.AbstractC2802j
    public final long c() {
        throw new UnsupportedOperationException();
    }

    @Override // e4.AbstractC2802j
    public final Object d(wf.k kVar) {
        Cursor x02;
        AbstractC3557B.c0("mapper", kVar);
        try {
            th = null;
            return ((AbstractC2596e) kVar.invoke(new C2793a(this.f28947Z.x0(this), this.f28948h0))).getValue();
        } finally {
        }
    }

    @Override // B3.h
    public final void h(w wVar) {
        Iterator it = this.f28949i0.iterator();
        while (it.hasNext()) {
            wf.k kVar = (wf.k) it.next();
            AbstractC3557B.Z(kVar);
            kVar.invoke(wVar);
        }
    }

    @Override // B3.h
    public final String i() {
        return this.f28946Y;
    }

    public final String toString() {
        return this.f28946Y;
    }

    @Override // e4.AbstractC2802j
    public final void close() {
    }
}
