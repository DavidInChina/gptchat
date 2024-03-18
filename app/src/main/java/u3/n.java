package U3;

import E2.AbstractC0477i;
import E2.C;
import E2.C0484p;
import E2.C0488u;
import E2.C0492y;
import N.C1025i;
import Ng.F;
import Q1.A;
import Q1.D;
import Rh.AbstractC1291b;
import Rh.AbstractC1315n;
import Rh.D0;
import Rh.e1;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import h1.C3299f;
import h1.C3302i;
import io.sentry.C1;
import io.sentry.C3636c1;
import io.sentry.L0;
import io.sentry.S;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o8.AbstractC4952e;
import o8.C4951d;
import p.AbstractC5028d;
import s2.AbstractC5530A;
import th.AbstractC5809q;
import u8.AbstractC5856f;
import u8.AbstractC5857g;
import u8.C5865o;
import w.C6049A;
import w.C6066m;
import x3.y;

/* loaded from: classes.dex */
public final class n implements C, B2.o, AbstractC5856f, AbstractC1315n {

    /* renamed from: Y  reason: collision with root package name */
    public Object f17426Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f17427Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f17428h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f17429i0;

    public n(int i10) {
        if (i10 == 7) {
            this.f17426Y = new C6049A(0);
            this.f17427Z = new SparseArray();
            this.f17428h0 = new C6066m((Object) null);
            this.f17429i0 = new C6049A(0);
        } else if (i10 == 8) {
            this.f17426Y = null;
            this.f17427Z = new ArrayList();
            this.f17428h0 = null;
            this.f17429i0 = "";
        } else if (i10 != 10) {
            this.f17426Y = new C3299f(256, 0);
            this.f17427Z = new C3299f(256, 0);
            this.f17428h0 = new C3299f(256, 0);
            this.f17429i0 = new C3302i[32];
        } else {
            this.f17426Y = new CopyOnWriteArrayList();
            this.f17427Z = new CopyOnWriteArrayList();
            this.f17428h0 = new CopyOnWriteArrayList();
            this.f17429i0 = new CopyOnWriteArrayList();
        }
    }

    @Override // E2.C
    public final void D(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        if (j(i10, c0492y)) {
            ((C1025i) this.f17427Z).k(c0484p, k(c0488u, c0492y));
        }
    }

    @Override // B2.o
    public final void E(int i10, C0492y c0492y) {
        if (j(i10, c0492y)) {
            ((B2.n) this.f17428h0).f();
        }
    }

    @Override // E2.C
    public final void F(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        if (j(i10, c0492y)) {
            ((C1025i) this.f17427Z).m(c0484p, k(c0488u, c0492y));
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o8.v, java.lang.Object] */
    @Override // u8.AbstractC5857g
    public final Object a() {
        Object a5 = ((AbstractC5857g) this.f17426Y).a();
        return new o8.p((Context) a5, (C5865o) ((AbstractC5857g) this.f17427Z).a(), new C3636c1(((C4951d) ((AbstractC5857g) this.f17428h0)).f40940Y, 16, AbstractC4952e.f40943c), new Object());
    }

    public final void b(String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkProgressDao");
        } else {
            s10 = null;
        }
        ((y) this.f17426Y).b();
        B3.i c10 = ((AbstractC5028d) this.f17428h0).c();
        if (str == null) {
            c10.s0(1);
        } else {
            c10.b(1, str);
        }
        ((y) this.f17426Y).c();
        try {
            c10.w();
            ((y) this.f17426Y).n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            ((y) this.f17426Y).j();
            if (s10 != null) {
                s10.b();
            }
            ((AbstractC5028d) this.f17428h0).g(c10);
        }
    }

    @Override // Rh.AbstractC1315n
    public final void c() {
        e1 e1Var = (e1) this.f17429i0;
        e1Var.f15835d.h((String) this.f17426Y, new D0(e1Var.f15837f.f15910y, (AbstractC1291b) this.f17427Z, (List) this.f17428h0));
    }

    @Override // B2.o
    public final void d(int i10, C0492y c0492y, int i11) {
        if (j(i10, c0492y)) {
            ((B2.n) this.f17428h0).d(i11);
        }
    }

    @Override // B2.o
    public final void e(int i10, C0492y c0492y) {
        if (j(i10, c0492y)) {
            ((B2.n) this.f17428h0).b();
        }
    }

    @Override // B2.o
    public final void f(int i10, C0492y c0492y, Exception exc) {
        if (j(i10, c0492y)) {
            ((B2.n) this.f17428h0).e(exc);
        }
    }

    @Override // B2.o
    public final void g(int i10, C0492y c0492y) {
        if (j(i10, c0492y)) {
            ((B2.n) this.f17428h0).c();
        }
    }

    @Override // Rh.AbstractC1315n
    public final void h(String str, AbstractC5809q abstractC5809q) {
        ((List) this.f17428h0).add(abstractC5809q);
    }

    public final void i() {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkProgressDao");
        } else {
            s10 = null;
        }
        ((y) this.f17426Y).b();
        B3.i c10 = ((AbstractC5028d) this.f17429i0).c();
        ((y) this.f17426Y).c();
        try {
            c10.w();
            ((y) this.f17426Y).n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            ((y) this.f17426Y).j();
            if (s10 != null) {
                s10.b();
            }
            ((AbstractC5028d) this.f17429i0).g(c10);
        }
    }

    public final boolean j(int i10, C0492y c0492y) {
        C0492y c0492y2;
        if (c0492y != null) {
            c0492y2 = ((AbstractC0477i) this.f17429i0).s(this.f17426Y, c0492y);
            if (c0492y2 == null) {
                return false;
            }
        } else {
            c0492y2 = null;
        }
        int u10 = ((AbstractC0477i) this.f17429i0).u(i10, this.f17426Y);
        C1025i c1025i = (C1025i) this.f17427Z;
        if (c1025i.f12350Z != u10 || !AbstractC5530A.a((C0492y) c1025i.f12351h0, c0492y2)) {
            this.f17427Z = new C1025i((CopyOnWriteArrayList) ((AbstractC0477i) this.f17429i0).f4277c.f12352i0, u10, c0492y2);
        }
        B2.n nVar = (B2.n) this.f17428h0;
        if (nVar.f1813a != u10 || !AbstractC5530A.a(nVar.f1814b, c0492y2)) {
            this.f17428h0 = new B2.n(((AbstractC0477i) this.f17429i0).f4278d.f1815c, u10, c0492y2);
            return true;
        }
        return true;
    }

    public final C0488u k(C0488u c0488u, C0492y c0492y) {
        long t10 = ((AbstractC0477i) this.f17429i0).t(this.f17426Y, c0488u.f4418f);
        Object obj = this.f17426Y;
        long j6 = c0488u.f4419g;
        long t11 = ((AbstractC0477i) this.f17429i0).t(obj, j6);
        if (t10 == c0488u.f4418f && t11 == j6) {
            return c0488u;
        }
        return new C0488u(c0488u.f4413a, c0488u.f4414b, c0488u.f4415c, c0488u.f4416d, c0488u.f4417e, t10, t11);
    }

    public final void l(M1.p pVar) {
        Object t10 = ((Pg.o) this.f17428h0).t(pVar);
        if (t10 instanceof Pg.q) {
            Throwable a5 = Pg.s.a(t10);
            if (a5 == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
        } else if (!(t10 instanceof Pg.r)) {
            if (((AtomicInteger) this.f17429i0).getAndIncrement() == 0) {
                Ad.l.O0((F) this.f17426Y, null, null, new M1.m(this, null), 3);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final Bundle m() {
        Bundle bundle = new Bundle();
        Object obj = this.f17426Y;
        if (((Integer) obj) != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((Integer) obj).intValue());
        }
        Object obj2 = this.f17427Z;
        if (((Integer) obj2) != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", ((Integer) obj2).intValue());
        }
        Object obj3 = this.f17428h0;
        if (((Integer) obj3) != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", ((Integer) obj3).intValue());
        }
        Object obj4 = this.f17429i0;
        if (((Integer) obj4) != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", ((Integer) obj4).intValue());
        }
        return bundle;
    }

    @Override // E2.C
    public final void o(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        if (j(i10, c0492y)) {
            ((C1025i) this.f17427Z).j(c0484p, k(c0488u, c0492y));
        }
    }

    @Override // B2.o
    public final void s(int i10, C0492y c0492y) {
        if (j(i10, c0492y)) {
            ((B2.n) this.f17428h0).a();
        }
    }

    @Override // E2.C
    public final void t(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u, IOException iOException, boolean z10) {
        if (j(i10, c0492y)) {
            ((C1025i) this.f17427Z).l(c0484p, k(c0488u, c0492y), iOException, z10);
        }
    }

    @Override // E2.C
    public final void u(int i10, C0492y c0492y, C0488u c0488u) {
        if (j(i10, c0492y)) {
            ((C1025i) this.f17427Z).d(k(c0488u, c0492y));
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f17426Y = obj;
        this.f17427Z = obj2;
        this.f17428h0 = obj3;
        this.f17429i0 = obj4;
    }

    public n(Boolean bool, Double d10) {
        this(bool, d10, Boolean.FALSE, (Double) null);
    }

    public n(Boolean bool, Double d10, Boolean bool2, Double d11) {
        this.f17426Y = bool;
        this.f17427Z = d10;
        this.f17428h0 = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f17429i0 = d11;
    }

    public n(Typeface typeface, R1.b bVar) {
        int i10;
        int i11;
        this.f17429i0 = typeface;
        this.f17426Y = bVar;
        this.f17428h0 = new A(1024);
        R1.b bVar2 = (R1.b) this.f17426Y;
        int a5 = bVar2.a(6);
        if (a5 != 0) {
            int i12 = a5 + bVar2.f15020a;
            i10 = ((ByteBuffer) bVar2.f15023d).getInt(((ByteBuffer) bVar2.f15023d).getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f17427Z = new char[i10 * 2];
        R1.b bVar3 = (R1.b) this.f17426Y;
        int a10 = bVar3.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar3.f15020a;
            i11 = ((ByteBuffer) bVar3.f15023d).getInt(((ByteBuffer) bVar3.f15023d).getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            D d10 = new D(this, i14);
            R1.a c10 = d10.c();
            int a11 = c10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) c10.f15023d).getInt(a11 + c10.f15020a) : 0, (char[]) this.f17427Z, i14 * 2);
            R4.b.S("invalid metadata codepoint length", d10.b() > 0);
            ((A) this.f17428h0).a(d10, 0, d10.b() - 1);
        }
    }
}
