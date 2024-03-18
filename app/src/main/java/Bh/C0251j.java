package Bh;

import Eh.EnumC0526z;
import Qh.AbstractC1230h;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import sh.C5629a;
import th.AbstractC5806n;
import wh.AbstractC6242g;
import yh.G1;
import yh.H1;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Bh.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0251j extends EnumC0255l {
    public C0251j() {
        super("MODIFIABLE", 0);
    }

    @Override // Bh.AbstractC0257m
    public final AbstractC0263p a(l1 l1Var) {
        H1 h12;
        l1 v10;
        EnumC0526z enumC0526z;
        l1 l1Var2;
        AbstractC6242g abstractC6242g;
        l1 l1Var3;
        AbstractC1239q abstractC1239q;
        String name = l1Var.getName();
        int u02 = l1Var.u0();
        l1.a L10 = l1Var.L();
        C5629a b10 = l1Var.r0().b(AbstractC1235m.a(l1Var));
        G1 k10 = l1Var.o0().k(new yh.Y0(AbstractC1235m.a(l1Var)));
        C5629a b11 = l1Var.U0().b(AbstractC1235m.a(l1Var));
        Map emptyMap = Collections.emptyMap();
        C5629a b12 = l1Var.i().b(AbstractC1235m.a(l1Var));
        C5629a b13 = l1Var.A().b(AbstractC1235m.a(l1Var));
        AbstractC5806n declaredAnnotations = l1Var.getDeclaredAnnotations();
        EnumC0250i0 enumC0250i0 = EnumC0250i0.f2355Y;
        EnumC0526z enumC0526z2 = EnumC0526z.f4818Y;
        l1 mo118a = l1Var.mo118a();
        AbstractC6242g s02 = l1Var.s0();
        l1 W6 = l1Var.W();
        H1 F10 = l1Var.F();
        if (l1Var.x0()) {
            h12 = l1Var.b1();
        } else {
            h12 = null;
        }
        H1 h13 = h12;
        boolean K10 = l1Var.K();
        boolean m10 = l1Var.m();
        boolean Y7 = l1Var.Y();
        if (l1Var.x()) {
            v10 = zh.H.f52110a;
        } else {
            v10 = l1Var.v();
        }
        l1 l1Var4 = v10;
        if (l1Var.x()) {
            H1 d02 = l1Var.d0();
            l1Var3 = W6;
            AbstractC1230h a5 = AbstractC1235m.a(l1Var);
            AbstractC1239q abstractC1239q2 = (AbstractC1239q) d02;
            abstractC6242g = s02;
            switch (abstractC1239q2.f15001Y) {
                case 0:
                    l1Var2 = mo118a;
                    ArrayList arrayList = new ArrayList(abstractC1239q2.size());
                    Iterator it = abstractC1239q2.iterator();
                    while (it.hasNext()) {
                        EnumC0526z enumC0526z3 = enumC0526z2;
                        Object next = it.next();
                        if (!a5.a(next)) {
                            arrayList.add(next);
                        }
                        enumC0526z2 = enumC0526z3;
                    }
                    enumC0526z = enumC0526z2;
                    int size = arrayList.size();
                    int size2 = abstractC1239q2.size();
                    abstractC1239q = abstractC1239q2;
                    if (size != size2) {
                        abstractC1239q = abstractC1239q2.y(arrayList);
                        break;
                    }
                    break;
                default:
                    enumC0526z = enumC0526z2;
                    l1Var2 = mo118a;
                    abstractC1239q = abstractC1239q2;
                    break;
            }
        } else {
            enumC0526z = enumC0526z2;
            l1Var2 = mo118a;
            abstractC6242g = s02;
            l1Var3 = W6;
            abstractC1239q = Collections.emptyList();
        }
        return new C0249i(name, u02, L10, b10, k10, b11, emptyMap, b12, b13, declaredAnnotations, enumC0250i0, enumC0526z, l1Var2, abstractC6242g, l1Var3, F10, h13, K10, m10, Y7, l1Var4, abstractC1239q);
    }
}
