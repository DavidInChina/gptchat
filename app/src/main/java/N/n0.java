package N;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.O f12388a = A7.b.o0(F.f12202h0);

    public static final boolean a(j0 j0Var, long j6) {
        Map a5;
        if (j0Var != null && (a5 = ((m0) j0Var).a()) != null) {
            return a5.containsKey(Long.valueOf(j6));
        }
        return false;
    }
}
