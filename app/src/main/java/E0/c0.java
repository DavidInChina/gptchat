package E0;

import H0.C0714y;
import androidx.compose.ui.node.Owner;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final Z0.l a(c0 c0Var) {
        K k10 = (K) c0Var;
        int i10 = k10.f4028a;
        Object obj = k10.f4029b;
        switch (i10) {
            case 0:
                return ((G0.S) obj).getLayoutDirection();
            default:
                return ((C0714y) ((Owner) obj)).getLayoutDirection();
        }
    }

    public static final int b(c0 c0Var) {
        K k10 = (K) c0Var;
        int i10 = k10.f4028a;
        Object obj = k10.f4029b;
        switch (i10) {
            case 0:
                return ((G0.S) obj).U();
            default:
                return ((C0714y) ((Owner) obj)).getRoot().G();
        }
    }

    public static void c(d0 d0Var, int i10, int i11, float f6) {
        long c10 = kotlin.jvm.internal.m.c(i10, i11);
        long j6 = d0Var.f4057j0;
        int i12 = Z0.i.f22798c;
        d0Var.X(kotlin.jvm.internal.m.c(((int) (c10 >> 32)) + ((int) (j6 >> 32)), ((int) (c10 & 4294967295L)) + ((int) (j6 & 4294967295L))), f6, null);
    }

    public static /* synthetic */ void d(c0 c0Var, d0 d0Var, int i10, int i11) {
        c0Var.getClass();
        c(d0Var, i10, i11, 0.0f);
    }

    public static void e(d0 d0Var, long j6, float f6) {
        long j10 = d0Var.f4057j0;
        int i10 = Z0.i.f22798c;
        d0Var.X(kotlin.jvm.internal.m.c(((int) (j6 >> 32)) + ((int) (j10 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L))), f6, null);
    }

    public static /* synthetic */ void f(c0 c0Var, d0 d0Var, long j6) {
        c0Var.getClass();
        e(d0Var, j6, 0.0f);
    }

    public static void g(c0 c0Var, d0 d0Var, int i10, int i11) {
        c0Var.getClass();
        long c10 = kotlin.jvm.internal.m.c(i10, i11);
        if (a(c0Var) != Z0.l.f22805Y && b(c0Var) != 0) {
            int b10 = b(c0Var) - d0Var.f4053Y;
            int i12 = Z0.i.f22798c;
            long c11 = kotlin.jvm.internal.m.c(b10 - ((int) (c10 >> 32)), (int) (c10 & 4294967295L));
            long j6 = d0Var.f4057j0;
            d0Var.X(kotlin.jvm.internal.m.c(((int) (c11 >> 32)) + ((int) (j6 >> 32)), ((int) (c11 & 4294967295L)) + ((int) (j6 & 4294967295L))), 0.0f, null);
            return;
        }
        long j10 = d0Var.f4057j0;
        int i13 = Z0.i.f22798c;
        d0Var.X(kotlin.jvm.internal.m.c(((int) (c10 >> 32)) + ((int) (j10 >> 32)), ((int) (c10 & 4294967295L)) + ((int) (j10 & 4294967295L))), 0.0f, null);
    }

    public static void h(c0 c0Var, d0 d0Var, int i10, int i11) {
        int i12 = f0.f4062b;
        e0 e0Var = e0.f4058Z;
        c0Var.getClass();
        long c10 = kotlin.jvm.internal.m.c(i10, i11);
        if (a(c0Var) != Z0.l.f22805Y && b(c0Var) != 0) {
            int b10 = b(c0Var) - d0Var.f4053Y;
            int i13 = Z0.i.f22798c;
            long c11 = kotlin.jvm.internal.m.c(b10 - ((int) (c10 >> 32)), (int) (c10 & 4294967295L));
            long j6 = d0Var.f4057j0;
            d0Var.X(kotlin.jvm.internal.m.c(((int) (c11 >> 32)) + ((int) (j6 >> 32)), ((int) (c11 & 4294967295L)) + ((int) (j6 & 4294967295L))), 0.0f, e0Var);
            return;
        }
        long j10 = d0Var.f4057j0;
        int i14 = Z0.i.f22798c;
        d0Var.X(kotlin.jvm.internal.m.c(((int) (c10 >> 32)) + ((int) (j10 >> 32)), ((int) (c10 & 4294967295L)) + ((int) (j10 & 4294967295L))), 0.0f, e0Var);
    }

    public static void i(c0 c0Var, d0 d0Var, long j6, wf.k kVar, int i10) {
        if ((i10 & 4) != 0) {
            int i11 = f0.f4062b;
            kVar = e0.f4058Z;
        }
        c0Var.getClass();
        if (a(c0Var) != Z0.l.f22805Y && b(c0Var) != 0) {
            int b10 = b(c0Var) - d0Var.f4053Y;
            int i12 = Z0.i.f22798c;
            long c10 = kotlin.jvm.internal.m.c(b10 - ((int) (j6 >> 32)), (int) (j6 & 4294967295L));
            long j10 = d0Var.f4057j0;
            d0Var.X(kotlin.jvm.internal.m.c(((int) (c10 >> 32)) + ((int) (j10 >> 32)), ((int) (c10 & 4294967295L)) + ((int) (4294967295L & j10))), 0.0f, kVar);
            return;
        }
        long j11 = d0Var.f4057j0;
        int i13 = Z0.i.f22798c;
        d0Var.X(kotlin.jvm.internal.m.c(((int) (j6 >> 32)) + ((int) (j11 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (4294967295L & j11))), 0.0f, kVar);
    }

    public static void j(d0 d0Var, int i10, int i11, float f6, wf.k kVar) {
        long c10 = kotlin.jvm.internal.m.c(i10, i11);
        long j6 = d0Var.f4057j0;
        int i12 = Z0.i.f22798c;
        d0Var.X(kotlin.jvm.internal.m.c(((int) (c10 >> 32)) + ((int) (j6 >> 32)), ((int) (c10 & 4294967295L)) + ((int) (j6 & 4294967295L))), f6, kVar);
    }

    public static /* synthetic */ void k(c0 c0Var, d0 d0Var, int i10, int i11, wf.k kVar, int i12) {
        if ((i12 & 8) != 0) {
            int i13 = f0.f4062b;
            kVar = e0.f4058Z;
        }
        c0Var.getClass();
        j(d0Var, i10, i11, 0.0f, kVar);
    }

    public static void l(d0 d0Var, long j6, float f6, wf.k kVar) {
        long j10 = d0Var.f4057j0;
        int i10 = Z0.i.f22798c;
        d0Var.X(kotlin.jvm.internal.m.c(((int) (j6 >> 32)) + ((int) (j10 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L))), f6, kVar);
    }

    public static /* synthetic */ void m(c0 c0Var, d0 d0Var, long j6, wf.k kVar, int i10) {
        if ((i10 & 4) != 0) {
            int i11 = f0.f4062b;
            kVar = e0.f4058Z;
        }
        c0Var.getClass();
        l(d0Var, j6, 0.0f, kVar);
    }
}
