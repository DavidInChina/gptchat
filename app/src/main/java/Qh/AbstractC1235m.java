package Qh;

import yh.l1;

/* renamed from: Qh.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1235m {
    public static AbstractC1230h a(Object obj) {
        if (obj == null) {
            return L.f14976a;
        }
        return new C1236n(obj);
    }

    public static C1227e b(l1 l1Var) {
        return new C1227e(new C1237o(a(l1Var)));
    }

    public static J c(String str) {
        return new J(new Y(str, X.EQUALS_FULLY));
    }
}
