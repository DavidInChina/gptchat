package Ah;

import java.lang.reflect.InvocationTargetException;
import java.security.PrivilegedAction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0106z extends Enum implements PrivilegedAction {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0106z f973Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0106z[] f974Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Ah.z] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f973Y = r12;
        f974Z = new EnumC0106z[]{r12};
    }

    public static EnumC0106z valueOf(String str) {
        return (EnumC0106z) Enum.valueOf(EnumC0106z.class, str);
    }

    public static EnumC0106z[] values() {
        return (EnumC0106z[]) f974Z.clone();
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        D d10;
        Object obj;
        try {
            if (Sh.E.b()) {
                if (T.f905i.b()) {
                    obj = F.h();
                } else {
                    obj = I.h();
                }
            } else {
                obj = C.h();
            }
            return obj;
        } catch (InvocationTargetException e10) {
            d10 = new D(e10.getTargetException().getMessage());
            return d10;
        } catch (Exception e11) {
            d10 = new D(e11.getMessage());
            return d10;
        }
    }
}
