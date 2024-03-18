package I8;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class C extends Enum implements D {

    /* renamed from: Y  reason: collision with root package name */
    public static final y f8095Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final z f8096Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final A f8097h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ C[] f8098i0;

    static {
        y yVar = new y();
        f8095Y = yVar;
        z zVar = new z();
        f8096Z = zVar;
        A a5 = new A();
        f8097h0 = a5;
        f8098i0 = new C[]{yVar, zVar, a5, new C() { // from class: I8.B
            @Override // I8.D
            public final Number a(P8.b bVar) {
                String H02 = bVar.H0();
                try {
                    return new BigDecimal(H02);
                } catch (NumberFormatException e10) {
                    StringBuilder s10 = android.gov.nist.core.a.s("Cannot parse ", H02, "; at path ");
                    s10.append(bVar.O());
                    throw new RuntimeException(s10.toString(), e10);
                }
            }
        }};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f8098i0.clone();
    }
}
