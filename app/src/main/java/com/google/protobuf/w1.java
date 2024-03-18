package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class w1 {
    public static v1 a(Object obj) {
        AbstractC2497d0 abstractC2497d0 = (AbstractC2497d0) obj;
        v1 v1Var = abstractC2497d0.unknownFields;
        if (v1Var == v1.f27627f) {
            v1 v1Var2 = new v1();
            abstractC2497d0.unknownFields = v1Var2;
            return v1Var2;
        }
        return v1Var;
    }

    public static void b(Object obj) {
        ((AbstractC2497d0) obj).unknownFields.f27632e = false;
    }

    public static boolean c(Object obj, T0.m mVar) {
        int tag = mVar.getTag();
        int i10 = tag >>> 3;
        int i11 = tag & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            ((v1) obj).f((i10 << 3) | 5, Integer.valueOf(mVar.h()));
                            return true;
                        }
                        throw C2540t0.c();
                    }
                    v1 v1Var = new v1();
                    int i12 = i10 << 3;
                    int i13 = i12 | 4;
                    while (mVar.w() != Integer.MAX_VALUE && c(v1Var, mVar)) {
                    }
                    if (i13 == mVar.getTag()) {
                        v1Var.f27632e = false;
                        ((v1) obj).f(i12 | 3, v1Var);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((v1) obj).f((i10 << 3) | 2, mVar.V());
                return true;
            }
            ((v1) obj).f((i10 << 3) | 1, Long.valueOf(mVar.d()));
            return true;
        }
        ((v1) obj).f(i10 << 3, Long.valueOf(mVar.I()));
        return true;
    }

    public static void d(Object obj, Object obj2) {
        ((AbstractC2497d0) obj).unknownFields = (v1) obj2;
    }
}
