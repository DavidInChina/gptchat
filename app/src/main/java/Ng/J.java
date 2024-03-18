package Ng;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static final M f12891a;

    static {
        String str;
        M m10;
        int i10 = Sg.B.f16631a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null && Boolean.parseBoolean(str)) {
            Tg.e eVar = Q.f12904a;
            x0 x0Var = Sg.u.f16684a;
            Og.d dVar = ((Og.d) x0Var).f13759j0;
            if (!(x0Var instanceof M)) {
                m10 = I.f12886n0;
            } else {
                m10 = (M) x0Var;
            }
        } else {
            m10 = I.f12886n0;
        }
        f12891a = m10;
    }
}
