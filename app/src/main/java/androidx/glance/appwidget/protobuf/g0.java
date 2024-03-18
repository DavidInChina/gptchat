package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g0 {
    public static f0 a(Object obj) {
        AbstractC2063x abstractC2063x = (AbstractC2063x) obj;
        f0 f0Var = abstractC2063x.unknownFields;
        if (f0Var == f0.f25213f) {
            f0 f0Var2 = new f0(0, new int[8], new Object[8], true);
            abstractC2063x.unknownFields = f0Var2;
            return f0Var2;
        }
        return f0Var;
    }

    public static void b(Object obj) {
        ((AbstractC2063x) obj).unknownFields.f25218e = false;
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
                            ((f0) obj).c((i10 << 3) | 5, Integer.valueOf(mVar.h()));
                            return true;
                        }
                        throw C.b();
                    }
                    f0 f0Var = new f0(0, new int[8], new Object[8], true);
                    int i12 = i10 << 3;
                    int i13 = i12 | 4;
                    while (mVar.w() != Integer.MAX_VALUE && c(f0Var, mVar)) {
                    }
                    if (i13 == mVar.getTag()) {
                        f0Var.f25218e = false;
                        ((f0) obj).c(i12 | 3, f0Var);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((f0) obj).c((i10 << 3) | 2, mVar.U());
                return true;
            }
            ((f0) obj).c((i10 << 3) | 1, Long.valueOf(mVar.d()));
            return true;
        }
        ((f0) obj).c(i10 << 3, Long.valueOf(mVar.I()));
        return true;
    }
}
